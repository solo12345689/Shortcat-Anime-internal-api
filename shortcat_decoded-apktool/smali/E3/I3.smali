.class LE3/I3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/I3$e;,
        LE3/I3$c;,
        LE3/I3$b;,
        LE3/I3$d;
    }
.end annotation


# static fields
.field private static final G:LE3/X6;


# instance fields
.field private A:J

.field private B:Z

.field private C:LP9/u;

.field private D:LP9/u;

.field private E:Landroid/os/Bundle;

.field private F:Lq2/N;

.field private final a:Ljava/lang/Object;

.field private final b:Landroid/net/Uri;

.field private final c:LE3/I3$c;

.field private final d:LE3/I3$b;

.field private final e:LE3/h3$d;

.field private final f:Landroid/content/Context;

.field private final g:LE3/I6;

.field private final h:LE3/M4;

.field private final i:Ljava/lang/String;

.field private final j:LE3/Y6;

.field private final k:LE3/h3;

.field private final l:Landroid/os/Handler;

.field private final m:Lt2/h;

.field private final n:Ljava/lang/Runnable;

.field private final o:Landroid/os/Handler;

.field private final p:Z

.field private final q:Z

.field private final r:LP9/u;

.field private s:LE3/M6;

.field private t:LE3/N6;

.field private u:Landroid/app/PendingIntent;

.field private v:LE3/I3$d;

.field private w:LE3/h3$h;

.field private x:LE3/h3$g;

.field private y:LE3/a5;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE3/X6;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LE3/X6;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE3/I3;->G:LE3/X6;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LE3/h3;Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZ)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/I3;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Init "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, "AndroidXMedia3/1.8.0"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "] ["

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    sget-object v1, Lt2/a0;->e:Ljava/lang/String;

    .line 48
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
    const-string v1, "MediaSessionImpl"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, LE3/I3;->k:LE3/h3;

    .line 67
    .line 68
    iput-object p2, p0, LE3/I3;->f:Landroid/content/Context;

    .line 69
    .line 70
    iput-object p3, p0, LE3/I3;->i:Ljava/lang/String;

    .line 71
    .line 72
    move-object/from16 v0, p5

    .line 73
    .line 74
    iput-object v0, p0, LE3/I3;->u:Landroid/app/PendingIntent;

    .line 75
    .line 76
    move-object/from16 v6, p6

    .line 77
    .line 78
    iput-object v6, p0, LE3/I3;->C:LP9/u;

    .line 79
    .line 80
    move-object/from16 v7, p7

    .line 81
    .line 82
    iput-object v7, p0, LE3/I3;->D:LP9/u;

    .line 83
    .line 84
    move-object/from16 v0, p8

    .line 85
    .line 86
    iput-object v0, p0, LE3/I3;->r:LP9/u;

    .line 87
    .line 88
    move-object/from16 v0, p9

    .line 89
    .line 90
    iput-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 91
    .line 92
    move-object/from16 v10, p11

    .line 93
    .line 94
    iput-object v10, p0, LE3/I3;->E:Landroid/os/Bundle;

    .line 95
    .line 96
    move-object/from16 v0, p12

    .line 97
    .line 98
    iput-object v0, p0, LE3/I3;->m:Lt2/h;

    .line 99
    .line 100
    move/from16 v5, p13

    .line 101
    .line 102
    iput-boolean v5, p0, LE3/I3;->p:Z

    .line 103
    .line 104
    move/from16 v0, p14

    .line 105
    .line 106
    iput-boolean v0, p0, LE3/I3;->q:Z

    .line 107
    .line 108
    new-instance v11, LE3/I6;

    .line 109
    .line 110
    invoke-direct {v11, p0}, LE3/I6;-><init>(LE3/I3;)V

    .line 111
    .line 112
    .line 113
    iput-object v11, p0, LE3/I3;->g:LE3/I6;

    .line 114
    .line 115
    new-instance v0, Landroid/os/Handler;

    .line 116
    .line 117
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, LE3/I3;->o:Landroid/os/Handler;

    .line 125
    .line 126
    invoke-interface/range {p4 .. p4}, Lq2/P;->m()Landroid/os/Looper;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v3, Landroid/os/Handler;

    .line 131
    .line 132
    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 133
    .line 134
    .line 135
    iput-object v3, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 136
    .line 137
    sget-object v1, LE3/M6;->F:LE3/M6;

    .line 138
    .line 139
    iput-object v1, p0, LE3/I3;->s:LE3/M6;

    .line 140
    .line 141
    new-instance v1, LE3/I3$c;

    .line 142
    .line 143
    invoke-direct {v1, p0, v0}, LE3/I3$c;-><init>(LE3/I3;Landroid/os/Looper;)V

    .line 144
    .line 145
    .line 146
    iput-object v1, p0, LE3/I3;->c:LE3/I3$c;

    .line 147
    .line 148
    new-instance v1, LE3/I3$b;

    .line 149
    .line 150
    invoke-direct {v1, p0, v0}, LE3/I3$b;-><init>(LE3/I3;Landroid/os/Looper;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, LE3/I3;->d:LE3/I3$b;

    .line 154
    .line 155
    new-instance v0, Landroid/net/Uri$Builder;

    .line 156
    .line 157
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-class v1, LE3/I3;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0, p3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 175
    .line 176
    .line 177
    move-result-wide v0

    .line 178
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {p3, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-virtual {p3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iput-object v2, p0, LE3/I3;->b:Landroid/net/Uri;

    .line 191
    .line 192
    new-instance p3, LE3/h3$e$a;

    .line 193
    .line 194
    invoke-direct {p3, p1}, LE3/h3$e$a;-><init>(LE3/h3;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p3}, LE3/h3$e$a;->a()LE3/h3$e;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    new-instance v0, LE3/M4;

    .line 202
    .line 203
    iget-object v8, p1, LE3/h3$e;->b:LE3/U6;

    .line 204
    .line 205
    iget-object v9, p1, LE3/h3$e;->c:Lq2/P$b;

    .line 206
    .line 207
    move-object v1, p0

    .line 208
    move-object/from16 v4, p10

    .line 209
    .line 210
    invoke-direct/range {v0 .. v10}, LE3/M4;-><init>(LE3/I3;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;ZLP9/u;LP9/u;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)V

    .line 211
    .line 212
    .line 213
    move-object p3, v3

    .line 214
    iput-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 215
    .line 216
    invoke-virtual {v0}, LE3/M4;->K0()LF3/n;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, LF3/n;->e()LF3/n$j;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, LF3/n$j;->e()Landroid/media/session/MediaSession$Token;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    new-instance v0, LE3/Y6;

    .line 229
    .line 230
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const/4 v4, 0x5

    .line 235
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    const/4 v2, 0x0

    .line 240
    const v3, 0x3c14dd2c

    .line 241
    .line 242
    .line 243
    move-object/from16 v7, p10

    .line 244
    .line 245
    move-object v6, v11

    .line 246
    invoke-direct/range {v0 .. v8}, LE3/Y6;-><init>(IIIILjava/lang/String;LE3/r;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 247
    .line 248
    .line 249
    iput-object v0, p0, LE3/I3;->j:LE3/Y6;

    .line 250
    .line 251
    new-instance p2, LE3/N6;

    .line 252
    .line 253
    move-object/from16 v0, p4

    .line 254
    .line 255
    invoke-direct {p2, v0}, LE3/N6;-><init>(Lq2/P;)V

    .line 256
    .line 257
    .line 258
    iput-object p2, p0, LE3/I3;->t:LE3/N6;

    .line 259
    .line 260
    new-instance v0, LE3/u3;

    .line 261
    .line 262
    invoke-direct {v0, p0, p2}, LE3/u3;-><init>(LE3/I3;LE3/N6;)V

    .line 263
    .line 264
    .line 265
    invoke-static {p3, v0}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 266
    .line 267
    .line 268
    const-wide/16 v0, 0xbb8

    .line 269
    .line 270
    iput-wide v0, p0, LE3/I3;->A:J

    .line 271
    .line 272
    new-instance p2, LE3/z3;

    .line 273
    .line 274
    invoke-direct {p2, p0}, LE3/z3;-><init>(LE3/I3;)V

    .line 275
    .line 276
    .line 277
    iput-object p2, p0, LE3/I3;->n:Ljava/lang/Runnable;

    .line 278
    .line 279
    new-instance p2, LE3/A3;

    .line 280
    .line 281
    invoke-direct {p2, p0}, LE3/A3;-><init>(LE3/I3;)V

    .line 282
    .line 283
    .line 284
    invoke-static {p3, p2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 285
    .line 286
    .line 287
    return-void
.end method

.method static synthetic A(LE3/I3;LE3/M6;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LE3/I3;->S(LE3/M6;ZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic B(LE3/I3;)LE3/M6;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->s:LE3/M6;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(LE3/I3;LE3/M6;)LE3/M6;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/I3;->s:LE3/M6;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic D(LE3/I3;)LE3/I3$c;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->c:LE3/I3$c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic E(LE3/I3;LE3/I3$e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/I3;->U(LE3/I3$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic F(LE3/I3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/I3;->N0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic G(LE3/I3;Lq2/P$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/I3;->o0(Lq2/P$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic H(LE3/I3;)LE3/I6;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic I(LE3/I3;Landroid/view/KeyEvent;ZZ)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LE3/I3;->K(Landroid/view/KeyEvent;ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic J(LE3/I3;)LE3/M4;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->h:LE3/M4;

    .line 2
    .line 3
    return-object p0
.end method

.method private K(Landroid/view/KeyEvent;ZZ)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->k:LE3/h3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/h3;->h()LE3/h3$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LE3/h3$g;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/16 v1, 0x55

    .line 18
    .line 19
    if-eq p1, v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x4f

    .line 22
    .line 23
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x57

    .line 28
    .line 29
    :cond_1
    const/16 p2, 0x7e

    .line 30
    .line 31
    if-eq p1, p2, :cond_6

    .line 32
    .line 33
    const/16 p2, 0x7f

    .line 34
    .line 35
    if-eq p1, p2, :cond_5

    .line 36
    .line 37
    const/16 p2, 0x110

    .line 38
    .line 39
    if-eq p1, p2, :cond_4

    .line 40
    .line 41
    const/16 p2, 0x111

    .line 42
    .line 43
    if-eq p1, p2, :cond_3

    .line 44
    .line 45
    packed-switch p1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return p1

    .line 50
    :pswitch_0
    new-instance p1, LE3/l3;

    .line 51
    .line 52
    invoke-direct {p1, p0, v0}, LE3/l3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    new-instance p1, LE3/m3;

    .line 57
    .line 58
    invoke-direct {p1, p0, v0}, LE3/m3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    new-instance p1, LE3/n3;

    .line 63
    .line 64
    invoke-direct {p1, p0, v0}, LE3/n3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, LE3/N6;->q0()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    new-instance p1, LE3/C3;

    .line 79
    .line 80
    invoke-direct {p1, p0, v0}, LE3/C3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    new-instance p1, LE3/D3;

    .line 85
    .line 86
    invoke-direct {p1, p0, v0}, LE3/D3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    :pswitch_4
    new-instance p1, LE3/k3;

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, LE3/k3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    :pswitch_5
    new-instance p1, LE3/G3;

    .line 97
    .line 98
    invoke-direct {p1, p0, v0}, LE3/G3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    new-instance p1, LE3/F3;

    .line 103
    .line 104
    invoke-direct {p1, p0, v0}, LE3/F3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    new-instance p1, LE3/E3;

    .line 109
    .line 110
    invoke-direct {p1, p0, v0}, LE3/E3;-><init>(LE3/I3;LE3/h3$g;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {p0}, LE3/I3;->X()Landroid/os/Handler;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    new-instance v1, LE3/o3;

    .line 118
    .line 119
    invoke-direct {v1, p0, p3, v0, p1}, LE3/o3;-><init>(LE3/I3;ZLE3/h3$g;Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p2, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    const/4 p1, 0x1

    .line 126
    return p1

    .line 127
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private K0(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->X()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private N0()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->n:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LE3/I3;->q:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v0, p0, LE3/I3;->A:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 21
    .line 22
    invoke-virtual {v0}, LE3/N6;->isPlaying()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 29
    .line 30
    invoke-virtual {v0}, LE3/N6;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 37
    .line 38
    iget-object v1, p0, LE3/I3;->n:Ljava/lang/Runnable;

    .line 39
    .line 40
    iget-wide v2, p0, LE3/I3;->A:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method static P(Lq2/P$b;)Lq2/P$b;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    sget-object v0, Lq2/P$b;->b:Lq2/P$b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lq2/P$b;->b()Lq2/P$b$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 20
    .line 21
    .line 22
    :cond_1
    const/16 v1, 0x11

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 31
    .line 32
    .line 33
    :cond_2
    const/16 v1, 0x12

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 42
    .line 43
    .line 44
    :cond_3
    const/16 v1, 0x15

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 53
    .line 54
    .line 55
    :cond_4
    const/16 v1, 0x16

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 64
    .line 65
    .line 66
    :cond_5
    const/16 v1, 0x17

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_6

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 75
    .line 76
    .line 77
    :cond_6
    const/16 v1, 0x1e

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_7

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 86
    .line 87
    .line 88
    :cond_7
    const/16 v1, 0x20

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Lq2/P$b;->c(I)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_8

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 97
    .line 98
    .line 99
    :cond_8
    invoke-virtual {v0}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method static Q(LE3/M6;Lq2/N;)LE3/M6;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, LE3/W6;

    .line 11
    .line 12
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 13
    .line 14
    iget-object v3, v0, LE3/W6;->a:Lq2/P$e;

    .line 15
    .line 16
    iget-boolean v4, v0, LE3/W6;->b:Z

    .line 17
    .line 18
    iget-wide v5, v0, LE3/W6;->c:J

    .line 19
    .line 20
    iget-wide v7, v0, LE3/W6;->d:J

    .line 21
    .line 22
    iget-wide v14, v0, LE3/W6;->h:J

    .line 23
    .line 24
    iget-wide v9, v0, LE3/W6;->i:J

    .line 25
    .line 26
    const-wide/16 v18, 0x0

    .line 27
    .line 28
    move-wide/from16 v16, v9

    .line 29
    .line 30
    const-wide/16 v9, 0x0

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const-wide/16 v12, 0x0

    .line 34
    .line 35
    invoke-direct/range {v2 .. v19}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method private Q0(LE3/N6;LE3/N6;)V
    .locals 1

    .line 1
    iput-object p2, p0, LE3/I3;->t:LE3/N6;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE3/I3;->v:LE3/I3$d;

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lq2/P$d;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LE3/N6;->H(Lq2/P$d;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v0, LE3/I3$d;

    .line 17
    .line 18
    invoke-direct {v0, p0, p2}, LE3/I3$d;-><init>(LE3/I3;LE3/N6;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v0}, LE3/N6;->a0(Lq2/P$d;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LE3/I3;->v:LE3/I3$d;

    .line 25
    .line 26
    new-instance v0, LE3/q3;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2}, LE3/q3;-><init>(LE3/N6;LE3/N6;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0}, LE3/I3;->U(LE3/I3$e;)V

    .line 32
    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 37
    .line 38
    invoke-virtual {p1}, LE3/M4;->b1()V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, LE3/N6;->a1()LE3/M6;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, LE3/I3;->s:LE3/M6;

    .line 46
    .line 47
    invoke-virtual {p2}, LE3/N6;->p0()Lq2/P$b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, LE3/I3;->o0(Lq2/P$b;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private R(LE3/W6;)V
    .locals 7

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/g;->j()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, LE3/h3$g;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, LE3/g;->l(LE3/h3$g;)Lq2/N;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/16 v4, 0x10

    .line 32
    .line 33
    invoke-virtual {v0, v3, v4}, LE3/g;->q(LE3/h3$g;I)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/16 v5, 0x11

    .line 38
    .line 39
    invoke-virtual {v0, v3, v5}, LE3/g;->q(LE3/h3$g;I)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    new-instance v6, LE3/r3;

    .line 44
    .line 45
    invoke-direct {v6, p1, v4, v5, v3}, LE3/r3;-><init>(LE3/W6;ZZLE3/h3$g;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3, v6}, LE3/I3;->V(LE3/h3$g;LE3/I3$e;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    :try_start_0
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 55
    .line 56
    invoke-virtual {v0}, LE3/M4;->H0()LE3/h3$f;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v5, 0x1

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v2, 0x0

    .line 63
    const/4 v4, 0x1

    .line 64
    move-object v3, p1

    .line 65
    invoke-interface/range {v1 .. v6}, LE3/h3$f;->a(ILE3/W6;ZZI)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object p1, v0

    .line 71
    const-string v0, "MediaSessionImpl"

    .line 72
    .line 73
    const-string v1, "Exception in using media1 API"

    .line 74
    .line 75
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private S(LE3/M6;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE3/I6;->d5(LE3/M6;)LE3/M6;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LE3/g;->j()LP9/u;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge v3, v0, :cond_5

    .line 24
    .line 25
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v4, v0

    .line 30
    check-cast v4, LE3/h3$g;

    .line 31
    .line 32
    :try_start_0
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 33
    .line 34
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v4}, LE3/g;->n(LE3/h3$g;)LE3/S6;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {v5}, LE3/S6;->c()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    move v7, v5

    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception v0

    .line 51
    move v10, p2

    .line 52
    move v11, p3

    .line 53
    goto :goto_4

    .line 54
    :catch_1
    move v10, p2

    .line 55
    move v11, p3

    .line 56
    goto :goto_5

    .line 57
    :cond_0
    invoke-virtual {p0, v4}, LE3/I3;->q0(LE3/h3$g;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_1
    move v7, v2

    .line 66
    :goto_1
    invoke-virtual {v0, v4}, LE3/g;->m(LE3/h3$g;)LE3/M6;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    move v10, p2

    .line 73
    move v11, p3

    .line 74
    goto :goto_6

    .line 75
    :cond_2
    invoke-virtual {v0, v4}, LE3/g;->l(LE3/h3$g;)Lq2/N;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    invoke-static {p1, v6}, LE3/I3;->Q(LE3/M6;Lq2/N;)LE3/M6;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v0, v4, v5}, LE3/g;->w(LE3/h3$g;LE3/M6;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0, v4}, LE3/g;->i(LE3/h3$g;)Lq2/P$b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, LE3/N6;->p0()Lq2/P$b;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v0, v6}, LE3/L6;->f(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {v4}, LE3/h3$g;->c()LE3/h3$f;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    move-object v6, v0

    .line 113
    check-cast v6, LE3/h3$f;
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    move-object v8, p1

    .line 118
    :goto_2
    move v10, p2

    .line 119
    move v11, p3

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    move-object v8, v5

    .line 122
    goto :goto_2

    .line 123
    :goto_3
    :try_start_1
    invoke-interface/range {v6 .. v11}, LE3/h3$f;->z(ILE3/M6;Lq2/P$b;ZZ)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :catch_2
    move-exception v0

    .line 128
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string p3, "Exception in "

    .line 134
    .line 135
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    const-string p3, "MediaSessionImpl"

    .line 146
    .line 147
    invoke-static {p3, p2, v0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :catch_3
    :goto_5
    invoke-direct {p0, v4}, LE3/I3;->z0(LE3/h3$g;)V

    .line 152
    .line 153
    .line 154
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    move p2, v10

    .line 157
    move p3, v11

    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_5
    :goto_7
    return-void
.end method

.method private T(LE3/h3$g;LE3/I3$e;)Lcom/google/common/util/concurrent/p;
    .locals 4

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, LE3/I3;->g:LE3/I6;

    .line 4
    .line 5
    invoke-virtual {v1}, LE3/I6;->f5()LE3/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, LE3/g;->n(LE3/h3$g;)LE3/S6;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, LE3/I3;->G:LE3/X6;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, LE3/S6;->a(Ljava/lang/Object;)LE3/S6$a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, LE3/S6$a;->L()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p0, p1}, LE3/I3;->q0(LE3/h3$g;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    new-instance p2, LE3/X6;

    .line 35
    .line 36
    invoke-direct {p2, v0}, LE3/X6;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_1
    new-instance v1, LE3/X6;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, v2}, LE3/X6;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-virtual {p1}, LE3/h3$g;->c()LE3/h3$f;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-interface {p2, v3, v2}, LE3/I3$e;->a(LE3/h3$f;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    :cond_2
    return-object v1

    .line 64
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v1, "Exception in "

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v0, "MediaSessionImpl"

    .line 82
    .line 83
    invoke-static {v0, p1, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, LE3/X6;

    .line 87
    .line 88
    const/4 p2, -0x1

    .line 89
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :catch_1
    invoke-direct {p0, p1}, LE3/I3;->z0(LE3/h3$g;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, LE3/X6;

    .line 101
    .line 102
    invoke-direct {p1, v0}, LE3/X6;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
.end method

.method private U(LE3/I3$e;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/M4;->H0()LE3/h3$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {p1, v0, v1}, LE3/I3$e;->a(LE3/h3$f;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string v0, "MediaSessionImpl"

    .line 14
    .line 15
    const-string v1, "Exception in using media1 API"

    .line 16
    .line 17
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private U0()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Player callback method is called from a wrong thread. See javadoc of MediaSession for details."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public static synthetic a(LE3/T6;Landroid/os/Bundle;LE3/h3$f;I)V
    .locals 0

    .line 1
    invoke-interface {p2, p3, p0, p1}, LE3/h3$f;->F(ILE3/T6;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LE3/I3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/I3;->N0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/os/Bundle;LE3/h3$f;I)V
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, LE3/h3$f;->o(ILandroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->l5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic e(LE3/I3;LE3/h3$f;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->s:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->q:Lq2/p;

    .line 4
    .line 5
    invoke-interface {p1, p2, p0}, LE3/h3$f;->u(ILq2/p;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic f(LE3/I3;ZLE3/h3$g;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance p1, LE3/T6;

    .line 7
    .line 8
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v1, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 11
    .line 12
    invoke-direct {p1, v1, v0}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, p1, v0}, LE3/I3;->O0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 22
    .line 23
    invoke-virtual {p0}, LE3/I6;->f5()LE3/g;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, p2}, LE3/g;->h(LE3/h3$g;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic g(LE3/N6;LE3/N6;LE3/h3$f;I)V
    .locals 0

    .line 1
    invoke-interface {p2, p3, p0, p1}, LE3/h3$f;->D(ILE3/N6;LE3/N6;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->k5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic i(LE3/I3;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->v:LE3/I3$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, LE3/I3;->t:LE3/N6;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LE3/N6;->H(Lq2/P$d;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic j(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->p5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic k(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->r5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic l(LE3/I3;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->w:LE3/h3$h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, LE3/I3;->k:LE3/h3;

    .line 6
    .line 7
    invoke-interface {v0, p0}, LE3/h3$h;->a(LE3/h3;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic m(Lq2/P$b;LE3/h3$f;I)V
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, LE3/h3$f;->s(ILq2/P$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(LE3/I3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/I3;->v0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(LE3/I3;Lcom/google/common/util/concurrent/w;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/I3;->D0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Lcom/google/common/util/concurrent/w;->F(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private o0(Lq2/P$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->c:LE3/I3$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, LE3/I3$c;->b(ZZ)V

    .line 5
    .line 6
    .line 7
    new-instance v0, LE3/s3;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LE3/s3;-><init>(Lq2/P$b;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LE3/I3;->W(LE3/I3$e;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, LE3/t3;

    .line 16
    .line 17
    invoke-direct {p1, p0}, LE3/t3;-><init>(LE3/I3;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, LE3/I3;->U(LE3/I3$e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic p(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->k5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic q(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->s5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic r(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->z5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic s(LE3/I3;LE3/h3$g;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/I3;->x:LE3/h3$g;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LE3/I3;->x:LE3/h3$g;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic t(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->q5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic u(LE3/I3;LE3/N6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, LE3/I3;->Q0(LE3/N6;LE3/N6;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic v(LE3/W6;ZZLE3/h3$g;LE3/h3$f;I)V
    .locals 1

    .line 1
    invoke-virtual {p3}, LE3/h3$g;->e()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    move v0, p2

    .line 6
    move-object p2, p0

    .line 7
    move-object p0, p4

    .line 8
    move p4, v0

    .line 9
    move v0, p3

    .line 10
    move p3, p1

    .line 11
    move p1, p5

    .line 12
    move p5, v0

    .line 13
    invoke-interface/range {p0 .. p5}, LE3/h3$f;->a(ILE3/W6;ZZI)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private v0()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LE3/I3;->z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 14
    .line 15
    invoke-virtual {v0}, LE3/N6;->c1()LE3/W6;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, LE3/I3;->c:LE3/I3$c;

    .line 20
    .line 21
    invoke-virtual {v1}, LE3/I3$c;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, LE3/I3;->s:LE3/M6;

    .line 28
    .line 29
    iget-object v1, v1, LE3/M6;->c:LE3/W6;

    .line 30
    .line 31
    invoke-static {v0, v1}, LE3/L6;->b(LE3/W6;LE3/W6;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-direct {p0, v0}, LE3/I3;->R(LE3/W6;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-direct {p0}, LE3/I3;->N0()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw v1
.end method

.method public static synthetic w(LE3/I3;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/I3;->K0(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, LE3/I6;->l5(LE3/h3$g;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method static synthetic y(LE3/I3;)LE3/N6;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I3;->t:LE3/N6;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic z(LE3/I3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/I3;->U0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private z0(LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LE3/g;->t(LE3/h3$g;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public A0(LE3/h3$g;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LE3/I3;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->u0(LE3/h3$g;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, LE3/I3;->r0(LE3/h3$g;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, LE3/I3;->B:Z

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 22
    .line 23
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 24
    .line 25
    invoke-interface {v0, v1, p1}, LE3/h3$d;->l(LE3/h3;LE3/h3$g;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method B0(LE3/h3$g;Landroid/content/Intent;)Z
    .locals 8

    .line 1
    invoke-static {p2}, LE3/n;->c(Landroid/content/Intent;)Landroid/view/KeyEvent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "android.intent.action.MEDIA_BUTTON"

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_b

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, LE3/I3;->f:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_b

    .line 39
    .line 40
    :cond_0
    if-eqz v0, :cond_b

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    invoke-direct {p0}, LE3/I3;->U0()V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, LE3/I3;->e:LE3/h3$d;

    .line 54
    .line 55
    iget-object v2, p0, LE3/I3;->k:LE3/h3;

    .line 56
    .line 57
    invoke-interface {v1, v2, p1, p2}, LE3/h3$d;->a(LE3/h3;LE3/h3$g;Landroid/content/Intent;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/4 v2, 0x1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    return v2

    .line 65
    :cond_2
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, p0, LE3/I3;->f:Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "android.software.leanback"

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const/16 v5, 0x55

    .line 82
    .line 83
    const/16 v6, 0x4f

    .line 84
    .line 85
    if-eq v1, v6, :cond_3

    .line 86
    .line 87
    if-eq v1, v5, :cond_3

    .line 88
    .line 89
    iget-object v4, p0, LE3/I3;->d:LE3/I3$b;

    .line 90
    .line 91
    invoke-virtual {v4}, LE3/I3$b;->c()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    if-nez v4, :cond_6

    .line 96
    .line 97
    invoke-virtual {p1}, LE3/h3$g;->d()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    iget-object v4, p0, LE3/I3;->d:LE3/I3$b;

    .line 111
    .line 112
    invoke-virtual {v4}, LE3/I3$b;->d()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    iget-object v4, p0, LE3/I3;->d:LE3/I3$b;

    .line 119
    .line 120
    invoke-virtual {v4}, LE3/I3$b;->b()Ljava/lang/Runnable;

    .line 121
    .line 122
    .line 123
    move v4, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_5
    iget-object p2, p0, LE3/I3;->d:LE3/I3$b;

    .line 126
    .line 127
    invoke-virtual {p2, p1, v0}, LE3/I3$b;->e(LE3/h3$g;Landroid/view/KeyEvent;)V

    .line 128
    .line 129
    .line 130
    return v2

    .line 131
    :cond_6
    :goto_0
    iget-object v4, p0, LE3/I3;->d:LE3/I3$b;

    .line 132
    .line 133
    invoke-virtual {v4}, LE3/I3$b;->c()V

    .line 134
    .line 135
    .line 136
    :goto_1
    move v4, v3

    .line 137
    :goto_2
    invoke-virtual {p0}, LE3/I3;->s0()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-nez v7, :cond_a

    .line 142
    .line 143
    if-eq v1, v5, :cond_7

    .line 144
    .line 145
    if-ne v1, v6, :cond_8

    .line 146
    .line 147
    :cond_7
    if-eqz v4, :cond_8

    .line 148
    .line 149
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 150
    .line 151
    invoke-virtual {p1}, LE3/M4;->z()V

    .line 152
    .line 153
    .line 154
    return v2

    .line 155
    :cond_8
    invoke-virtual {p1}, LE3/h3$g;->d()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_9

    .line 160
    .line 161
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 162
    .line 163
    invoke-virtual {p1}, LE3/M4;->K0()LF3/n;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, LF3/n;->b()LF3/j;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1, v0}, LF3/j;->c(Landroid/view/KeyEvent;)Z

    .line 172
    .line 173
    .line 174
    return v2

    .line 175
    :cond_9
    return v3

    .line 176
    :cond_a
    const-string p1, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 177
    .line 178
    invoke-virtual {p2, p1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-direct {p0, v0, v4, p1}, LE3/I3;->K(Landroid/view/KeyEvent;ZZ)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    return p1

    .line 187
    :cond_b
    :goto_3
    return v3
.end method

.method C0()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->o:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LE3/w3;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LE3/w3;-><init>(LE3/I3;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method D0()Z
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/common/util/concurrent/w;->J()Lcom/google/common/util/concurrent/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LE3/I3;->o:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v2, LE3/y3;

    .line 18
    .line 19
    invoke-direct {v2, p0, v0}, LE3/y3;-><init>(LE3/I3;Lcom/google/common/util/concurrent/w;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v0}, Lcom/google/common/util/concurrent/w;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return v0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception v0

    .line 39
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_0
    iget-object v0, p0, LE3/I3;->w:LE3/h3$h;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 50
    .line 51
    invoke-interface {v0, v1}, LE3/h3$h;->b(LE3/h3;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    return v0

    .line 56
    :cond_1
    const/4 v0, 0x1

    .line 57
    return v0
.end method

.method public E0(LE3/h3$g;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2}, LE3/h3$d;->e(LE3/h3;LE3/h3$g;I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method protected F0(LE3/h3$g;Lq2/P$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2}, LE3/h3$d;->b(LE3/h3;LE3/h3$g;Lq2/P$b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public G0(LE3/h3$g;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LE3/I3;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->u0(LE3/h3$g;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 13
    .line 14
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, LE3/h3$d;->c(LE3/h3;LE3/h3$g;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method protected H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;
    .locals 7

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move-wide v5, p4

    .line 12
    invoke-interface/range {v0 .. v6}, LE3/h3$d;->m(LE3/h3;LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "Callback.onSetMediaItems must return a non-null future"

    .line 17
    .line 18
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 23
    .line 24
    return-object p1
.end method

.method public I0(LE3/h3$g;Ljava/lang/String;Lq2/S;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2, p3}, LE3/h3$d;->k(LE3/h3;LE3/h3$g;Ljava/lang/String;Lq2/S;)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "Callback.onSetRating must return non-null future"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public J0(LE3/h3$g;Lq2/S;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2}, LE3/h3$d;->h(LE3/h3;LE3/h3$g;Lq2/S;)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "Callback.onSetRating must return non-null future"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    .line 1
    new-instance v0, LE3/x3;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LE3/x3;-><init>(LE3/I3;LE3/h3$g;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public L0()V
    .locals 3

    .line 1
    const-string v0, "MediaSessionImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Release "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " ["

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "AndroidXMedia3/1.8.0"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, "] ["

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    sget-object v2, Lt2/a0;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, "] ["

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lq2/H;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "]"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0, v1}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, LE3/I3;->a:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v0

    .line 71
    :try_start_0
    iget-boolean v1, p0, LE3/I3;->z:Z

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    monitor-exit v0

    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const/4 v1, 0x1

    .line 80
    iput-boolean v1, p0, LE3/I3;->z:Z

    .line 81
    .line 82
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    iget-object v0, p0, LE3/I3;->d:LE3/I3$b;

    .line 84
    .line 85
    invoke-virtual {v0}, LE3/I3$b;->b()Ljava/lang/Runnable;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :try_start_1
    iget-object v0, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 95
    .line 96
    new-instance v1, LE3/j3;

    .line 97
    .line 98
    invoke-direct {v1, p0}, LE3/j3;-><init>(LE3/I3;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catch_0
    move-exception v0

    .line 106
    const-string v1, "MediaSessionImpl"

    .line 107
    .line 108
    const-string v2, "Exception thrown while closing"

    .line 109
    .line 110
    invoke-static {v1, v2, v0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 114
    .line 115
    invoke-virtual {v0}, LE3/M4;->S0()V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 119
    .line 120
    invoke-virtual {v0}, LE3/I6;->o5()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    throw v1
.end method

.method M()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LE3/I3;->w:LE3/h3$h;

    .line 3
    .line 4
    return-void
.end method

.method protected M0(LE3/h3$g;)LE3/h3$g;
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/I3;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->u0(LE3/h3$g;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LE3/I3;->f0()LE3/h3$g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LE3/h3$g;

    .line 20
    .line 21
    :cond_0
    return-object p1
.end method

.method public N(LE3/q;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE3/I6;->Z4(LE3/q;LE3/h3$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected O(LF3/n$j;)LE3/a5;
    .locals 1

    .line 1
    new-instance v0, LE3/a5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/a5;-><init>(LE3/I3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LE3/a5;->v(LF3/n$j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public O0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    new-instance v0, LE3/p3;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, LE3/p3;-><init>(LE3/T6;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, LE3/I3;->T(LE3/h3$g;LE3/I3$e;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method P0(LE3/h3$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/I3;->w:LE3/h3$h;

    .line 2
    .line 3
    return-void
.end method

.method public R0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE3/I3;->E:Landroid/os/Bundle;

    .line 2
    .line 3
    new-instance v0, LE3/B3;

    .line 4
    .line 5
    invoke-direct {v0, p1}, LE3/B3;-><init>(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, LE3/I3;->W(LE3/I3$e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public S0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/I3;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method T0()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->c:LE3/I3$c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1, v1}, LE3/I3$c;->b(ZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected V(LE3/h3$g;LE3/I3$e;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LE3/g;->n(LE3/h3$g;)LE3/S6;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LE3/S6;->c()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p2

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p0, p1}, LE3/I3;->q0(LE3/h3$g;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p1}, LE3/h3$g;->c()LE3/h3$f;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {p2, v1, v0}, LE3/I3$e;->a(LE3/h3$f;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "Exception in "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "MediaSessionImpl"

    .line 56
    .line 57
    invoke-static {v0, p1, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catch_1
    invoke-direct {p0, p1}, LE3/I3;->z0(LE3/h3$g;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_2
    return-void
.end method

.method protected W(LE3/I3$e;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/g;->j()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, LE3/h3$g;

    .line 24
    .line 25
    invoke-virtual {p0, v3, p1}, LE3/I3;->V(LE3/h3$g;LE3/I3$e;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_0
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 32
    .line 33
    invoke-virtual {v0}, LE3/M4;->H0()LE3/h3$f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0, v1}, LE3/I3$e;->a(LE3/h3$f;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p1

    .line 42
    const-string v0, "MediaSessionImpl"

    .line 43
    .line 44
    const-string v1, "Exception in using media1 API"

    .line 45
    .line 46
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method protected X()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->l:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()Lt2/h;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->m:Lt2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public Z()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->r:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method protected a0()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->f:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public b0()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->C:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public c0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected d0()Landroid/os/IBinder;
    .locals 3

    .line 1
    iget-object v0, p0, LE3/I3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/I3;->y:LE3/a5;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LE3/I3;->h:LE3/M4;

    .line 9
    .line 10
    invoke-virtual {v1}, LE3/M4;->K0()LF3/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LF3/n;->e()LF3/n$j;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, LE3/I3;->O(LF3/n$j;)LE3/a5;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, LE3/I3;->y:LE3/a5;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object v1, p0, LE3/I3;->y:LE3/a5;

    .line 28
    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    new-instance v0, Landroid/content/Intent;

    .line 31
    .line 32
    const-string v2, "android.media.browse.MediaBrowserService"

    .line 33
    .line 34
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, LF3/g;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw v1
.end method

.method public e0()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->D:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public f0()LE3/h3$g;
    .locals 4

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/g;->j()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LE3/h3$g;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, LE3/I3;->r0(LE3/h3$g;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    return-object v0
.end method

.method public g0()Landroid/media/session/MediaSession$Token;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/M4;->K0()LF3/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/n;->e()LF3/n$j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LF3/n$j;->e()Landroid/media/session/MediaSession$Token;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public h0()Lq2/N;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->F:Lq2/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public i0()LE3/M6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->s:LE3/M6;

    .line 2
    .line 3
    return-object v0
.end method

.method public j0()LE3/N6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 2
    .line 3
    return-object v0
.end method

.method protected k0()Landroid/app/PendingIntent;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->u:Landroid/app/PendingIntent;

    .line 2
    .line 3
    return-object v0
.end method

.method public l0()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->E:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()LE3/Y6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->j:LE3/Y6;

    .line 2
    .line 3
    return-object v0
.end method

.method public n0()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method p0(LE3/h3$g;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LE3/I3;->D0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LE3/N6;->k(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 22
    .line 23
    invoke-virtual {v0}, LE3/N6;->b()Lq2/C;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v0, v1

    .line 32
    :goto_0
    iget-object v3, p0, LE3/I3;->t:LE3/N6;

    .line 33
    .line 34
    const/16 v4, 0x1f

    .line 35
    .line 36
    invoke-virtual {v3, v4}, LE3/N6;->k(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    iget-object v3, p0, LE3/I3;->t:LE3/N6;

    .line 43
    .line 44
    const/16 v4, 0x14

    .line 45
    .line 46
    invoke-virtual {v3, v4}, LE3/N6;->k(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    :cond_2
    move v1, v2

    .line 53
    :cond_3
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v3, Lq2/P$b$a;

    .line 58
    .line 59
    invoke-direct {v3}, Lq2/P$b$a;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 76
    .line 77
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 78
    .line 79
    invoke-interface {v0, v1, p1}, LE3/h3$d;->g(LE3/h3;LE3/h3$g;)Lcom/google/common/util/concurrent/p;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "Callback.onPlaybackResumption must return a non-null future"

    .line 84
    .line 85
    invoke-static {v0, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/google/common/util/concurrent/p;

    .line 90
    .line 91
    new-instance v1, LE3/I3$a;

    .line 92
    .line 93
    invoke-direct {v1, p0, p1, p2, v2}, LE3/I3$a;-><init>(LE3/I3;LE3/h3$g;ZLq2/P$b;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, LE3/v3;

    .line 97
    .line 98
    invoke-direct {p1, p0}, LE3/v3;-><init>(LE3/I3;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_5
    :goto_1
    if-nez v0, :cond_6

    .line 106
    .line 107
    const-string v0, "MediaSessionImpl"

    .line 108
    .line 109
    const-string v1, "Play requested without current MediaItem, but playback resumption prevented by missing available commands"

    .line 110
    .line 111
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    iget-object v0, p0, LE3/I3;->t:LE3/N6;

    .line 115
    .line 116
    invoke-static {v0}, Lt2/a0;->B0(Lq2/P;)Z

    .line 117
    .line 118
    .line 119
    if-eqz p2, :cond_7

    .line 120
    .line 121
    invoke-virtual {p0, p1, v2}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    :goto_2
    return-void
.end method

.method public q0(LE3/h3$g;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3;->g:LE3/I6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I6;->f5()LE3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LE3/g;->p(LE3/h3$g;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LE3/I3;->h:LE3/M4;

    .line 14
    .line 15
    invoke-virtual {v0}, LE3/M4;->G0()LE3/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, LE3/g;->p(LE3/h3$g;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public r0(LE3/h3$g;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, LE3/h3$g;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LE3/I3;->f:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LE3/h3$g;->d()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, LE3/h3$g;->b()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "androidx.media3.session.MediaNotificationManager"

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    return v1
.end method

.method protected s0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/I3;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method protected t0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LE3/I3;->z:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method protected u0(LE3/h3$g;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LE3/h3$g;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "com.android.systemui"

    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method protected w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2}, LE3/h3$d;->d(LE3/h3;LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "Callback.onAddMediaItems must return a non-null future"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public x0(LE3/h3$g;)LE3/h3$e;
    .locals 3

    .line 1
    iget-boolean v0, p0, LE3/I3;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->u0(LE3/h3$g;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 12
    .line 13
    iget-object v0, p0, LE3/I3;->k:LE3/h3;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LE3/M4;->I0(LE3/h3;)LE3/h3$e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 21
    .line 22
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 23
    .line 24
    invoke-interface {v0, v1, p1}, LE3/h3$d;->j(LE3/h3;LE3/h3$g;)LE3/h3$e;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Callback.onConnect must return non-null future"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LE3/h3$e;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, LE3/I3;->r0(LE3/h3$g;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-boolean p1, v0, LE3/h3$e;->a:Z

    .line 43
    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, LE3/I3;->B:Z

    .line 48
    .line 49
    iget-object p1, v0, LE3/h3$e;->e:LP9/u;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p1, p0, LE3/I3;->k:LE3/h3;

    .line 55
    .line 56
    invoke-virtual {p1}, LE3/h3;->g()LP9/u;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 67
    .line 68
    iget-object v1, v0, LE3/h3$e;->d:LP9/u;

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 74
    .line 75
    invoke-virtual {v1}, LE3/h3;->c()LP9/u;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    invoke-virtual {p1, v1}, LE3/M4;->X0(LP9/u;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-object v1, p0, LE3/I3;->h:LE3/M4;

    .line 84
    .line 85
    invoke-virtual {v1, p1}, LE3/M4;->Y0(LP9/u;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    iget-object p1, p0, LE3/I3;->h:LE3/M4;

    .line 89
    .line 90
    iget-object v1, v0, LE3/h3$e;->b:LE3/U6;

    .line 91
    .line 92
    iget-object v2, v0, LE3/h3$e;->c:Lq2/P$b;

    .line 93
    .line 94
    invoke-virtual {p1, v1, v2}, LE3/M4;->U0(LE3/U6;Lq2/P$b;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-object v0
.end method

.method public y0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/I3;->e:LE3/h3$d;

    .line 2
    .line 3
    iget-object v1, p0, LE3/I3;->k:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LE3/I3;->M0(LE3/h3$g;)LE3/h3$g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1, p2, p3}, LE3/h3$d;->f(LE3/h3;LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "Callback.onCustomCommandOnHandler must return non-null future"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 20
    .line 21
    return-object p1
.end method
