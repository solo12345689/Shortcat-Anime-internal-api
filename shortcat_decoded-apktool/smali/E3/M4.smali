.class LE3/M4;
.super LF3/n$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/M4$g;,
        LE3/M4$e;,
        LE3/M4$h;,
        LE3/M4$d;,
        LE3/M4$i;,
        LE3/M4$f;
    }
.end annotation


# static fields
.field private static final z:I


# instance fields
.field private final f:LE3/g;

.field private final g:LE3/I3;

.field private final h:LF3/q;

.field private final i:LE3/M4$g;

.field private final j:LE3/M4$e;

.field private final k:LF3/n;

.field private final l:LE3/M4$h;

.field private final m:Landroid/content/ComponentName;

.field private n:LF3/x;

.field private final o:Z

.field private volatile p:J

.field private q:Lcom/google/common/util/concurrent/i;

.field private r:I

.field private s:Landroid/os/Bundle;

.field private t:LP9/u;

.field private u:LP9/u;

.field private v:LE3/U6;

.field private w:Lq2/P$b;

.field private x:Lq2/N;

.field private y:Lq2/P$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x2000000

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    sput v0, LE3/M4;->z:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LE3/I3;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;ZLP9/u;LP9/u;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-direct {p0}, LF3/n$b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 5
    .line 6
    iput-boolean p5, p0, LE3/M4;->o:Z

    .line 7
    .line 8
    iput-object p6, p0, LE3/M4;->t:LP9/u;

    .line 9
    .line 10
    iput-object p7, p0, LE3/M4;->u:LP9/u;

    .line 11
    .line 12
    move-object/from16 v0, p8

    .line 13
    .line 14
    iput-object v0, p0, LE3/M4;->v:LE3/U6;

    .line 15
    .line 16
    move-object/from16 v0, p9

    .line 17
    .line 18
    iput-object v0, p0, LE3/M4;->w:Lq2/P$b;

    .line 19
    .line 20
    new-instance v0, Landroid/os/Bundle;

    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-virtual {p1}, LE3/I3;->a0()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LF3/q;->a(Landroid/content/Context;)LF3/q;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, LE3/M4;->h:LF3/q;

    .line 38
    .line 39
    new-instance v1, LE3/M4$g;

    .line 40
    .line 41
    invoke-direct {v1, p0}, LE3/M4$g;-><init>(LE3/M4;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, LE3/M4;->i:LE3/M4$g;

    .line 45
    .line 46
    new-instance v1, LE3/g;

    .line 47
    .line 48
    invoke-direct {v1, p1}, LE3/g;-><init>(LE3/I3;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, LE3/M4;->f:LE3/g;

    .line 52
    .line 53
    const-wide/32 v2, 0x493e0

    .line 54
    .line 55
    .line 56
    iput-wide v2, p0, LE3/M4;->p:J

    .line 57
    .line 58
    new-instance v2, LE3/M4$e;

    .line 59
    .line 60
    invoke-virtual {p1}, LE3/I3;->X()Landroid/os/Handler;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-direct {v2, v3, v1}, LE3/M4$e;-><init>(Landroid/os/Looper;LE3/g;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, LE3/M4;->j:LE3/M4$e;

    .line 72
    .line 73
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    if-nez p5, :cond_0

    .line 78
    .line 79
    invoke-direct {p0}, LE3/M4;->d1()V

    .line 80
    .line 81
    .line 82
    :cond_0
    invoke-static {v0}, LE3/M4;->R0(Landroid/content/Context;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p0, LE3/M4;->m:Landroid/content/ComponentName;

    .line 87
    .line 88
    const/16 v2, 0x1f

    .line 89
    .line 90
    const/4 p5, 0x0

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    if-ge v3, v2, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move v4, p5

    .line 99
    move-object v3, v1

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    :goto_0
    const-string v3, "androidx.media3.session.MediaLibraryService"

    .line 102
    .line 103
    invoke-static {v0, v3}, LE3/M4;->J0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    const-string v3, "androidx.media3.session.MediaSessionService"

    .line 110
    .line 111
    invoke-static {v0, v3}, LE3/M4;->J0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_3
    if-eqz v3, :cond_4

    .line 116
    .line 117
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_4

    .line 122
    .line 123
    const/4 v4, 0x1

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move v4, p5

    .line 126
    :goto_1
    new-instance v5, Landroid/content/Intent;

    .line 127
    .line 128
    const-string v6, "android.intent.action.MEDIA_BUTTON"

    .line 129
    .line 130
    invoke-direct {v5, v6, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 131
    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    if-nez v3, :cond_5

    .line 135
    .line 136
    new-instance v3, LE3/M4$h;

    .line 137
    .line 138
    invoke-direct {v3, p0, v7}, LE3/M4$h;-><init>(LE3/M4;LE3/M4$a;)V

    .line 139
    .line 140
    .line 141
    iput-object v3, p0, LE3/M4;->l:LE3/M4$h;

    .line 142
    .line 143
    new-instance v4, Landroid/content/IntentFilter;

    .line 144
    .line 145
    invoke-direct {v4, v6}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p2}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    check-cast p2, Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v4, p2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v3, v4}, Lt2/a0;->j1(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {v5, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    sget p2, LE3/M4;->z:I

    .line 172
    .line 173
    invoke-static {v0, p5, v5, p2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    new-instance v3, Landroid/content/ComponentName;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object p5

    .line 183
    invoke-direct {v3, v0, p5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    invoke-virtual {v5, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 188
    .line 189
    .line 190
    if-eqz v4, :cond_7

    .line 191
    .line 192
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 193
    .line 194
    const/16 v4, 0x1a

    .line 195
    .line 196
    if-lt p2, v4, :cond_6

    .line 197
    .line 198
    sget p2, LE3/M4;->z:I

    .line 199
    .line 200
    invoke-static {v0, p5, v5, p2}, LE3/i4;->a(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    goto :goto_2

    .line 205
    :cond_6
    sget p2, LE3/M4;->z:I

    .line 206
    .line 207
    invoke-static {v0, p5, v5, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    goto :goto_2

    .line 212
    :cond_7
    sget p2, LE3/M4;->z:I

    .line 213
    .line 214
    invoke-static {v0, p5, v5, p2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    :goto_2
    iput-object v7, p0, LE3/M4;->l:LE3/M4$h;

    .line 219
    .line 220
    :goto_3
    const-string p5, "androidx.media3.session.id"

    .line 221
    .line 222
    invoke-virtual {p1}, LE3/I3;->c0()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    filled-new-array {p5, v4}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p5

    .line 230
    const-string v4, "."

    .line 231
    .line 232
    invoke-static {v4, p5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p5

    .line 236
    new-instance v4, LF3/n;

    .line 237
    .line 238
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 239
    .line 240
    if-ge v5, v2, :cond_8

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    move-object v3, v7

    .line 244
    :goto_4
    if-ge v5, v2, :cond_9

    .line 245
    .line 246
    move-object/from16 p9, p2

    .line 247
    .line 248
    :goto_5
    move-object/from16 p10, p4

    .line 249
    .line 250
    move-object p7, p5

    .line 251
    move-object p6, v0

    .line 252
    move-object/from16 p8, v3

    .line 253
    .line 254
    move-object p5, v4

    .line 255
    goto :goto_6

    .line 256
    :cond_9
    move-object/from16 p9, v7

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :goto_6
    invoke-direct/range {p5 .. p10}, LF3/n;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 260
    .line 261
    .line 262
    iput-object p5, p0, LE3/M4;->k:LF3/n;

    .line 263
    .line 264
    if-lt v5, v2, :cond_a

    .line 265
    .line 266
    if-eqz v1, :cond_a

    .line 267
    .line 268
    invoke-static {p5, v1}, LE3/M4$d;->a(LF3/n;Landroid/content/ComponentName;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    invoke-virtual {p1}, LE3/I3;->k0()Landroid/app/PendingIntent;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    if-eqz p1, :cond_b

    .line 276
    .line 277
    invoke-virtual {p5, p1}, LF3/n;->w(Landroid/app/PendingIntent;)V

    .line 278
    .line 279
    .line 280
    :cond_b
    invoke-virtual {p5, p0, p3}, LF3/n;->k(LF3/n$b;Landroid/os/Handler;)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method private static A0(LE3/N6;)LF3/x;
    .locals 9

    .line 1
    invoke-virtual {p0}, LE3/N6;->getDeviceInfo()Lq2/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lq2/p;->a:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, LE3/N6;->p0()Lq2/P$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x1a

    .line 16
    .line 17
    const/16 v2, 0x22

    .line 18
    .line 19
    filled-new-array {v1, v2}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lq2/P$b;->d([I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x19

    .line 30
    .line 31
    const/16 v2, 0x21

    .line 32
    .line 33
    filled-new-array {v1, v2}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lq2/P$b;->d([I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    :goto_0
    move v2, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v0, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    new-instance v6, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-virtual {p0}, Lq2/y;->m()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LE3/N6;->i1()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-virtual {p0}, LE3/N6;->getDeviceInfo()Lq2/p;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, LE3/M4$c;

    .line 68
    .line 69
    iget v3, v0, Lq2/p;->c:I

    .line 70
    .line 71
    iget-object v5, v0, Lq2/p;->d:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    move-object v7, p0

    .line 75
    invoke-direct/range {v1 .. v8}, LE3/M4$c;-><init>(IIILjava/lang/String;Landroid/os/Handler;LE3/N6;I)V

    .line 76
    .line 77
    .line 78
    return-object v1
.end method

.method private B0(ILE3/M4$i;LF3/q$b;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->t0()Z

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
    if-nez p3, :cond_1

    .line 11
    .line 12
    new-instance p2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string p3, "RemoteUserInfo is null, ignoring command="

    .line 18
    .line 19
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string p2, "MediaSessionLegacyStub"

    .line 30
    .line 31
    invoke-static {p2, p1}, Lt2/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 36
    .line 37
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, LE3/j4;

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    move v3, p1

    .line 45
    move-object v5, p2

    .line 46
    move-object v4, p3

    .line 47
    move v6, p4

    .line 48
    invoke-direct/range {v1 .. v6}, LE3/j4;-><init>(LE3/M4;ILF3/q$b;LE3/M4$i;Z)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private C0(ILE3/M4$i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n;->c()LF3/q$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, v1, p1, p2, v0}, LE3/M4;->E0(LE3/T6;ILE3/M4$i;LF3/q$b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private D0(LE3/T6;LE3/M4$i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n;->c()LF3/q$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, v1, p2, v0}, LE3/M4;->E0(LE3/T6;ILE3/M4$i;LF3/q$b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic E(LE3/M4;ILE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, LE3/t;->T(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, LE3/N6;->v(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private E0(LE3/T6;ILE3/M4$i;LF3/q$b;)V
    .locals 7

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string p4, "RemoteUserInfo is null, ignoring command="

    .line 9
    .line 10
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "MediaSessionLegacyStub"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lt2/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 33
    .line 34
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, LE3/B4;

    .line 39
    .line 40
    move-object v2, p0

    .line 41
    move-object v3, p1

    .line 42
    move v4, p2

    .line 43
    move-object v6, p3

    .line 44
    move-object v5, p4

    .line 45
    invoke-direct/range {v1 .. v6}, LE3/B4;-><init>(LE3/M4;LE3/T6;ILF3/q$b;LE3/M4$i;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic F(LE3/M4;LE3/N6;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LE3/M4;->z0(LE3/N6;)LF3/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LF3/n;->p(LF3/v;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, LE3/M4;->i:LE3/M4$g;

    .line 11
    .line 12
    invoke-virtual {p1}, LE3/N6;->p0()Lq2/P$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lq2/P$b;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, LE3/N6;->h0()Lq2/Y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lq2/Y;->a:Lq2/Y;

    .line 30
    .line 31
    :goto_0
    invoke-static {p0, p1}, LE3/M4$g;->I(LE3/M4$g;Lq2/Y;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static F0(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Failed to load bitmap: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static synthetic G(LE3/M4$i;LE3/h3$g;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, LE3/M4$i;->a(LE3/h3$g;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Exception in "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "MediaSessionLegacyStub"

    .line 24
    .line 25
    invoke-static {v0, p1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic H(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->stop()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic I(LE3/M4;LF3/l;LE3/h3$g;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LF3/l;->g()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const-string v0, "MediaSessionLegacyStub"

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const-string p0, "onRemoveQueueItem(): Media ID shouldn\'t be null"

    .line 17
    .line 18
    invoke-static {v0, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/16 p2, 0x11

    .line 29
    .line 30
    invoke-virtual {p0, p2}, LE3/N6;->k(I)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    const-string p0, "Can\'t remove item by ID without COMMAND_GET_TIMELINE being available"

    .line 37
    .line 38
    invoke-static {v0, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p0}, LE3/N6;->h0()Lq2/Y;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance v0, Lq2/Y$d;

    .line 47
    .line 48
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_0
    invoke-virtual {p2}, Lq2/Y;->t()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ge v1, v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p2, v1, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v2, v2, Lq2/Y$d;->c:Lq2/C;

    .line 63
    .line 64
    iget-object v2, v2, Lq2/C;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v1}, LE3/N6;->R(I)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    return-void
.end method

.method public static synthetic J(LE3/M4;JLE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    long-to-int p1, p1

    .line 8
    invoke-virtual {p0, p1}, LE3/N6;->E0(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static J0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 36
    .line 37
    new-instance p1, Landroid/content/ComponentName;

    .line 38
    .line 39
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 40
    .line 41
    iget-object v0, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p1, v0, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static synthetic K(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->W()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic L(LE3/M4;LE3/T6;Landroid/os/Bundle;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p3, p1, p2}, LE3/I3;->y0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, LE3/M4;->O0(Ljava/util/concurrent/Future;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic M(LE3/M4;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, LE3/I3;->p0(LE3/h3$g;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private M0(Lq2/C;Z)V
    .locals 2

    .line 1
    new-instance v0, LE3/z4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LE3/z4;-><init>(LE3/M4;Lq2/C;Z)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x0

    .line 13
    const/16 v1, 0x1f

    .line 14
    .line 15
    invoke-direct {p0, v1, v0, p1, p2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic N(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->U0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private N0(LF3/l;I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    if-gez p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, LE3/q4;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, LE3/q4;-><init>(LE3/M4;LF3/l;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 15
    .line 16
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x0

    .line 21
    const/16 v1, 0x14

    .line 22
    .line 23
    invoke-direct {p0, v1, v0, p1, p2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic O(LE3/M4;LE3/T6;Landroid/os/Bundle;Landroid/os/ResultReceiver;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p4, p1, p2}, LE3/I3;->y0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    invoke-static {p3, p0}, LE3/M4;->T0(Landroid/os/ResultReceiver;Lcom/google/common/util/concurrent/p;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-static {p0}, LE3/M4;->O0(Ljava/util/concurrent/Future;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static O0(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic P(LE3/M4;LF3/l;ILE3/h3$g;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LF3/l;->g()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string p0, "MediaSessionLegacyStub"

    .line 15
    .line 16
    const-string p1, "onAddQueueItem(): Media ID shouldn\'t be empty"

    .line 17
    .line 18
    invoke-static {p0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {p1}, LE3/t;->u(LF3/l;)Lq2/C;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 27
    .line 28
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p3, p1}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, LE3/M4$b;

    .line 37
    .line 38
    invoke-direct {v0, p0, p3, p2}, LE3/M4$b;-><init>(LE3/M4;LE3/h3$g;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p1, v0, p0}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private P0()Z
    .locals 3

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LE3/M4;->w:Lq2/P$b;

    .line 8
    .line 9
    const/16 v2, 0x11

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lq2/P$b;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, LE3/N6;->p0()Lq2/P$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v2}, Lq2/P$b;->c(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public static synthetic Q(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p1}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 8
    .line 9
    invoke-virtual {p0}, LE3/I3;->S0()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1, p0}, Lt2/a0;->C0(Lq2/P;Z)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic R(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->s()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static R0(Landroid/content/Context;)Landroid/content/ComponentName;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    const-string v2, "android.intent.action.MEDIA_BUTTON"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 36
    .line 37
    new-instance v0, Landroid/content/ComponentName;

    .line 38
    .line 39
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 40
    .line 41
    iget-object v1, p0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v0, v1, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found "

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public static synthetic S(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->U()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic T(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->T0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static T0(Landroid/os/ResultReceiver;Lcom/google/common/util/concurrent/p;)V
    .locals 1

    .line 1
    new-instance v0, LE3/C4;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LE3/C4;-><init>(Lcom/google/common/util/concurrent/p;Landroid/os/ResultReceiver;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, v0, p0}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic U(LE3/M4;Lq2/S;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/N6;->f1()Lq2/C;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 15
    .line 16
    iget-object v0, v0, Lq2/C;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, p2, v0, p1}, LE3/I3;->I0(LE3/h3$g;Ljava/lang/String;Lq2/S;)Lcom/google/common/util/concurrent/p;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, LE3/M4;->O0(Ljava/util/concurrent/Future;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic V(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->J()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static V0(LF3/n;Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/n;->n(Landroid/app/PendingIntent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LE3/N6;->k0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static W0(LF3/n;LF3/m;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/n;->o(LF3/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(LE3/M4;LE3/N6;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LE3/M4;->z0(LE3/N6;)LF3/v;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, LF3/n;->p(LF3/v;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic Y(LE3/M4;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lt2/a0;->A0(Lq2/P;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic Z(LE3/M4;ILE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, LE3/t;->Y(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, LE3/N6;->r0(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static Z0(LF3/n;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/n;->s(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a0(LE3/M4;LE3/T6;ILF3/q$b;LE3/M4$i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 11
    .line 12
    invoke-virtual {v0}, LF3/n;->g()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-string v1, "MediaSessionLegacyStub"

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    new-instance p0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string p4, "Ignore incoming session command before initialization. command="

    .line 26
    .line 27
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p1, p1, LE3/T6;->b:Ljava/lang/String;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, ", pid="

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, LF3/q$b;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-direct {p0, p3}, LE3/M4;->c1(LF3/q$b;)LE3/h3$g;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-nez p3, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    if-eqz p1, :cond_4

    .line 70
    .line 71
    iget-object p0, p0, LE3/M4;->f:LE3/g;

    .line 72
    .line 73
    invoke-virtual {p0, p3, p1}, LE3/g;->s(LE3/h3$g;LE3/T6;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget-object p0, p0, LE3/M4;->f:LE3/g;

    .line 81
    .line 82
    invoke-virtual {p0, p3, p2}, LE3/g;->r(LE3/h3$g;I)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    :goto_1
    return-void

    .line 89
    :cond_5
    :try_start_0
    invoke-interface {p4, p3}, LE3/M4$i;->a(LE3/h3$g;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catch_0
    move-exception p0

    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string p2, "Exception in "

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v1, p1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method private a1(LF3/n;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/M4;->P0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    invoke-virtual {p1, p2}, LF3/n;->t(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic b0(LE3/M4;Lq2/C;ZLE3/h3$g;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v3, -0x1

    .line 8
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    move-object v1, p3

    .line 14
    invoke-virtual/range {v0 .. v5}, LE3/I3;->H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p3, LE3/M4$a;

    .line 19
    .line 20
    invoke-direct {p3, p0, v1, p2}, LE3/M4$a;-><init>(LE3/M4;LE3/h3$g;Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, p3, p0}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic c0(LE3/M4;JLE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1, p2}, LE3/N6;->z(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private c1(LF3/q$b;)LE3/h3$g;
    .locals 9

    .line 1
    iget-object v0, p0, LE3/M4;->f:LE3/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v6, LE3/M4$f;

    .line 10
    .line 11
    invoke-direct {v6, p1}, LE3/M4$f;-><init>(LF3/q$b;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LE3/h3$g;

    .line 15
    .line 16
    iget-object v0, p0, LE3/M4;->h:LF3/q;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LF3/q;->b(LF3/q$b;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    move-object v2, p1

    .line 28
    invoke-direct/range {v1 .. v8}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, LE3/I3;->x0(LE3/h3$g;)LE3/h3$e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-boolean v0, p1, LE3/h3$e;->a:Z

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-interface {v6, p1}, LE3/h3$f;->b(I)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_0
    iget-object v0, p0, LE3/M4;->f:LE3/g;

    .line 48
    .line 49
    invoke-virtual {v1}, LE3/h3$g;->g()LF3/q$b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget-object v3, p1, LE3/h3$e;->b:LE3/U6;

    .line 54
    .line 55
    iget-object p1, p1, LE3/h3$e;->c:Lq2/P$b;

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1, v3, p1}, LE3/g;->e(Ljava/lang/Object;LE3/h3$g;LE3/U6;Lq2/P$b;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, LE3/I3;->G0(LE3/h3$g;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :cond_1
    iget-object p1, p0, LE3/M4;->j:LE3/M4$e;

    .line 67
    .line 68
    iget-wide v1, p0, LE3/M4;->p:J

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1, v2}, LE3/M4$e;->a(LE3/h3$g;J)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static synthetic d0(LE3/M4;FLE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, LE3/N6;->t(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private d1()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/M4;->u:LP9/u;

    .line 2
    .line 3
    iget-object v1, p0, LE3/M4;->v:LE3/U6;

    .line 4
    .line 5
    iget-object v2, p0, LE3/M4;->y:Lq2/P$b;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v2, p0, LE3/M4;->w:Lq2/P$b;

    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1, v2}, LE3/b;->d(Ljava/util/List;LE3/U6;Lq2/P$b;)LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1, v1}, LE3/b;->f(Ljava/util/List;ZZ)LP9/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LE3/M4;->t:LP9/u;

    .line 22
    .line 23
    iget-object v2, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-static {v0, v3}, LE3/b;->a(Ljava/util/List;I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    xor-int/2addr v0, v1

    .line 31
    const-string v3, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 37
    .line 38
    iget-object v2, p0, LE3/M4;->t:LP9/u;

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    invoke-static {v2, v3}, LE3/b;->a(Ljava/util/List;I)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    xor-int/2addr v1, v2

    .line 46
    const-string v2, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic e0(Lcom/google/common/util/concurrent/p;Landroid/os/ResultReceiver;)V
    .locals 2

    .line 1
    const-string v0, "MediaSessionLegacyStub"

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LE3/X6;

    .line 8
    .line 9
    const-string v1, "SessionResult must not be null"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LE3/X6;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-exception p0

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :catch_2
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :goto_0
    const-string v1, "Custom command failed"

    .line 25
    .line 26
    invoke-static {v0, v1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, LE3/X6;

    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :goto_1
    const-string v1, "Custom command cancelled"

    .line 37
    .line 38
    invoke-static {v0, v1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, LE3/X6;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 45
    .line 46
    .line 47
    :goto_2
    iget v0, p0, LE3/X6;->a:I

    .line 48
    .line 49
    iget-object p0, p0, LE3/X6;->b:Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static synthetic f0(LE3/M4;ILF3/q$b;LE3/M4$i;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 12
    .line 13
    invoke-virtual {v0}, LF3/n;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v1, "MediaSessionLegacyStub"

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p3, "Ignore incoming player command before initialization. command="

    .line 27
    .line 28
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, ", pid="

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, LF3/q$b;->b()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {v1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-direct {p0, p2}, LE3/M4;->c1(LF3/q$b;)LE3/h3$g;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, LE3/M4;->f:LE3/g;

    .line 62
    .line 63
    invoke-virtual {v0, p2, p1}, LE3/g;->q(LE3/h3$g;I)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    if-ne p1, p2, :cond_5

    .line 71
    .line 72
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 73
    .line 74
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, LE3/N6;->q0()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_5

    .line 83
    .line 84
    const-string p0, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 85
    .line 86
    invoke-static {v1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 91
    .line 92
    invoke-virtual {v0, p2, p1}, LE3/I3;->E0(LE3/h3$g;I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 100
    .line 101
    new-instance v1, LE3/A4;

    .line 102
    .line 103
    invoke-direct {v1, p3, p2}, LE3/A4;-><init>(LE3/M4$i;LE3/h3$g;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p2, v1}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 111
    .line 112
    .line 113
    if-eqz p4, :cond_5

    .line 114
    .line 115
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 116
    .line 117
    new-instance p3, Lq2/P$b$a;

    .line 118
    .line 119
    invoke-direct {p3}, Lq2/P$b$a;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, p1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, p2, p1}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic g0(LE3/M4;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/M4;->P0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic h0(LF3/n;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LE3/M4;->Z0(LF3/n;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic i0(LE3/M4;LF3/n;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LE3/M4;->a1(LF3/n;Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic j0(LE3/M4;)LF3/x;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->n:LF3/x;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k0(LE3/M4;LF3/x;)LF3/x;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4;->n:LF3/x;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic l0(LE3/N6;)LF3/x;
    .locals 0

    .line 1
    invoke-static {p0}, LE3/M4;->A0(LE3/N6;)LF3/x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m0(LE3/M4;)Lcom/google/common/util/concurrent/i;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->q:Lcom/google/common/util/concurrent/i;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic n0(LE3/M4;Lcom/google/common/util/concurrent/i;)Lcom/google/common/util/concurrent/i;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4;->q:Lcom/google/common/util/concurrent/i;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic o0(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LE3/M4;->F0(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic p0(LF3/n;LF3/m;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LE3/M4;->W0(LF3/n;LF3/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic q0(LE3/M4;)Lq2/N;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->x:Lq2/N;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic r0(LE3/M4;)LE3/I3;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic s0(LE3/M4;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic t0(LE3/M4;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u0(LE3/M4;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->u:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic v0(LE3/M4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/M4;->d1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic w0(LE3/M4;)LF3/n;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    return-object p0
.end method

.method private static x0(IZ)J
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    if-eq p0, p1, :cond_2

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    if-eq p0, p1, :cond_1

    .line 9
    .line 10
    const/16 p1, 0x1f

    .line 11
    .line 12
    if-eq p0, p1, :cond_0

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-wide/16 p0, 0x0

    .line 18
    .line 19
    return-wide p0

    .line 20
    :pswitch_0
    const-wide/32 p0, 0x40000

    .line 21
    .line 22
    .line 23
    return-wide p0

    .line 24
    :pswitch_1
    const-wide/32 p0, 0x280000

    .line 25
    .line 26
    .line 27
    return-wide p0

    .line 28
    :pswitch_2
    const-wide/32 p0, 0x400000

    .line 29
    .line 30
    .line 31
    return-wide p0

    .line 32
    :pswitch_3
    const-wide/16 p0, 0x40

    .line 33
    .line 34
    return-wide p0

    .line 35
    :pswitch_4
    const-wide/16 p0, 0x8

    .line 36
    .line 37
    return-wide p0

    .line 38
    :pswitch_5
    const-wide/16 p0, 0x1000

    .line 39
    .line 40
    return-wide p0

    .line 41
    :pswitch_6
    const-wide/16 p0, 0x20

    .line 42
    .line 43
    return-wide p0

    .line 44
    :pswitch_7
    const-wide/16 p0, 0x10

    .line 45
    .line 46
    return-wide p0

    .line 47
    :pswitch_8
    const-wide/16 p0, 0x100

    .line 48
    .line 49
    return-wide p0

    .line 50
    :cond_0
    const-wide/32 p0, 0x3ac00

    .line 51
    .line 52
    .line 53
    return-wide p0

    .line 54
    :cond_1
    const-wide/16 p0, 0x1

    .line 55
    .line 56
    return-wide p0

    .line 57
    :cond_2
    const-wide/16 p0, 0x4000

    .line 58
    .line 59
    return-wide p0

    .line 60
    :cond_3
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const-wide/16 p0, 0x204

    .line 63
    .line 64
    return-wide p0

    .line 65
    :cond_4
    const-wide/16 p0, 0x202

    .line 66
    .line 67
    return-wide p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;
    .locals 1

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, ""

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p0}, Lq2/C$c;->d(Ljava/lang/String;)Lq2/C$c;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Lq2/C$i$a;

    .line 15
    .line 16
    invoke-direct {v0}, Lq2/C$i$a;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lq2/C$i$a;->f(Landroid/net/Uri;)Lq2/C$i$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, p2}, Lq2/C$i$a;->g(Ljava/lang/String;)Lq2/C$i$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p3}, Lq2/C$i$a;->e(Landroid/os/Bundle;)Lq2/C$i$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lq2/C$i$a;->d()Lq2/C$i;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lq2/C$c;->g(Lq2/C$i;)Lq2/C$c;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lq2/C$c;->a()Lq2/C;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method private z0(LE3/N6;)LF3/v;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LE3/M4;->x:Lq2/N;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, LE3/N6;->y()Lq2/N;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :goto_0
    const/16 v3, 0x10

    .line 15
    .line 16
    invoke-virtual {v1, v3}, LE3/N6;->k(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, LE3/N6;->Y0()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_1
    if-nez v2, :cond_3

    .line 32
    .line 33
    iget-boolean v6, v0, LE3/M4;->o:Z

    .line 34
    .line 35
    invoke-static {v1, v6}, Lt2/a0;->s1(Lq2/P;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v6, 0x0

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    :goto_2
    const/4 v6, 0x1

    .line 45
    :goto_3
    if-eqz v2, :cond_4

    .line 46
    .line 47
    const/4 v7, 0x7

    .line 48
    :goto_4
    move v9, v7

    .line 49
    goto :goto_5

    .line 50
    :cond_4
    invoke-static {v1, v6}, LE3/t;->N(Lq2/P;Z)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    goto :goto_4

    .line 55
    :goto_5
    invoke-virtual {v1}, LE3/N6;->p0()Lq2/P$b;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object v8, v0, LE3/M4;->y:Lq2/P$b;

    .line 60
    .line 61
    if-eqz v8, :cond_5

    .line 62
    .line 63
    invoke-static {v8, v7}, LE3/L6;->f(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    goto :goto_6

    .line 68
    :cond_5
    iget-object v8, v0, LE3/M4;->w:Lq2/P$b;

    .line 69
    .line 70
    invoke-static {v8, v7}, LE3/L6;->f(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    :goto_6
    const-wide/16 v10, 0x80

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    :goto_7
    invoke-virtual {v7}, Lq2/P$b;->g()I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-ge v8, v12, :cond_6

    .line 82
    .line 83
    invoke-virtual {v7, v8}, Lq2/P$b;->f(I)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    invoke-static {v12, v6}, LE3/M4;->x0(IZ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    or-long/2addr v10, v12

    .line 92
    add-int/lit8 v8, v8, 0x1

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :cond_6
    iget-object v6, v0, LE3/M4;->u:LP9/u;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-nez v6, :cond_7

    .line 102
    .line 103
    iget-object v6, v0, LE3/M4;->s:Landroid/os/Bundle;

    .line 104
    .line 105
    const-string v8, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 106
    .line 107
    invoke-virtual {v6, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_7

    .line 112
    .line 113
    const-wide/16 v12, -0x11

    .line 114
    .line 115
    and-long/2addr v10, v12

    .line 116
    :cond_7
    iget-object v6, v0, LE3/M4;->u:LP9/u;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-nez v6, :cond_8

    .line 123
    .line 124
    iget-object v6, v0, LE3/M4;->s:Landroid/os/Bundle;

    .line 125
    .line 126
    const-string v8, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 127
    .line 128
    invoke-virtual {v6, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-nez v6, :cond_8

    .line 133
    .line 134
    const-wide/16 v12, -0x21

    .line 135
    .line 136
    and-long/2addr v10, v12

    .line 137
    :cond_8
    if-nez v3, :cond_9

    .line 138
    .line 139
    const-wide/16 v12, -0x101

    .line 140
    .line 141
    and-long/2addr v10, v12

    .line 142
    :cond_9
    const/16 v6, 0x11

    .line 143
    .line 144
    invoke-virtual {v1, v6}, LE3/N6;->k(I)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_a

    .line 149
    .line 150
    invoke-virtual {v1}, LE3/N6;->K0()I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    invoke-static {v6}, LE3/t;->Q(I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v14

    .line 158
    goto :goto_8

    .line 159
    :cond_a
    const-wide/16 v14, -0x1

    .line 160
    .line 161
    :goto_8
    invoke-virtual {v1}, LE3/N6;->c()Lq2/O;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    iget v6, v6, Lq2/O;->a:F

    .line 166
    .line 167
    invoke-virtual {v1}, LE3/N6;->isPlaying()Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_b

    .line 172
    .line 173
    if-eqz v3, :cond_b

    .line 174
    .line 175
    move v8, v6

    .line 176
    goto :goto_9

    .line 177
    :cond_b
    const/4 v8, 0x0

    .line 178
    :goto_9
    new-instance v4, Landroid/os/Bundle;

    .line 179
    .line 180
    if-eqz v2, :cond_c

    .line 181
    .line 182
    iget-object v5, v2, Lq2/N;->c:Landroid/os/Bundle;

    .line 183
    .line 184
    invoke-direct {v4, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_c
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 189
    .line 190
    .line 191
    :goto_a
    iget-object v5, v0, LE3/M4;->s:Landroid/os/Bundle;

    .line 192
    .line 193
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 194
    .line 195
    .line 196
    const-string v5, "EXO_SPEED"

    .line 197
    .line 198
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, LE3/N6;->f1()Lq2/C;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    if-eqz v5, :cond_d

    .line 206
    .line 207
    const-string v6, ""

    .line 208
    .line 209
    iget-object v12, v5, Lq2/C;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-nez v6, :cond_d

    .line 216
    .line 217
    const-string v6, "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"

    .line 218
    .line 219
    iget-object v5, v5, Lq2/C;->a:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_d
    if-eqz v3, :cond_e

    .line 225
    .line 226
    invoke-virtual {v1}, LE3/N6;->getCurrentPosition()J

    .line 227
    .line 228
    .line 229
    move-result-wide v5

    .line 230
    goto :goto_b

    .line 231
    :cond_e
    const-wide/16 v5, -0x1

    .line 232
    .line 233
    :goto_b
    if-eqz v3, :cond_f

    .line 234
    .line 235
    invoke-virtual {v1}, LE3/N6;->I0()J

    .line 236
    .line 237
    .line 238
    move-result-wide v12

    .line 239
    :goto_c
    move v1, v8

    .line 240
    goto :goto_d

    .line 241
    :cond_f
    const-wide/16 v12, -0x1

    .line 242
    .line 243
    goto :goto_c

    .line 244
    :goto_d
    new-instance v8, LF3/v$c;

    .line 245
    .line 246
    invoke-direct {v8}, LF3/v$c;-><init>()V

    .line 247
    .line 248
    .line 249
    move-wide/from16 v18, v12

    .line 250
    .line 251
    move-wide/from16 v16, v14

    .line 252
    .line 253
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 254
    .line 255
    .line 256
    move-result-wide v13

    .line 257
    move-wide/from16 v20, v10

    .line 258
    .line 259
    move-wide v10, v5

    .line 260
    move-wide/from16 v5, v20

    .line 261
    .line 262
    move v12, v1

    .line 263
    move-object/from16 p1, v2

    .line 264
    .line 265
    move-object v15, v4

    .line 266
    move-wide/from16 v1, v16

    .line 267
    .line 268
    move-wide/from16 v3, v18

    .line 269
    .line 270
    invoke-virtual/range {v8 .. v14}, LF3/v$c;->h(IJFJ)LF3/v$c;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-virtual {v8, v5, v6}, LF3/v$c;->c(J)LF3/v$c;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-virtual {v5, v1, v2}, LF3/v$c;->d(J)LF3/v$c;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1, v3, v4}, LF3/v$c;->e(J)LF3/v$c;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1, v15}, LF3/v$c;->g(Landroid/os/Bundle;)LF3/v$c;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v2, 0x0

    .line 291
    :goto_e
    iget-object v3, v0, LE3/M4;->t:LP9/u;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-ge v2, v3, :cond_17

    .line 298
    .line 299
    iget-object v3, v0, LE3/M4;->t:LP9/u;

    .line 300
    .line 301
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    check-cast v3, LE3/b;

    .line 306
    .line 307
    iget-object v4, v3, LE3/b;->a:LE3/T6;

    .line 308
    .line 309
    if-eqz v4, :cond_16

    .line 310
    .line 311
    iget-boolean v5, v3, LE3/b;->i:Z

    .line 312
    .line 313
    if-eqz v5, :cond_16

    .line 314
    .line 315
    iget v5, v4, LE3/T6;->a:I

    .line 316
    .line 317
    if-nez v5, :cond_16

    .line 318
    .line 319
    iget-object v5, v0, LE3/M4;->v:LE3/U6;

    .line 320
    .line 321
    invoke-static {v3, v5, v7}, LE3/b;->j(LE3/b;LE3/U6;Lq2/P$b;)Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_16

    .line 326
    .line 327
    iget v5, v3, LE3/b;->c:I

    .line 328
    .line 329
    if-eqz v5, :cond_10

    .line 330
    .line 331
    const/4 v5, 0x1

    .line 332
    goto :goto_f

    .line 333
    :cond_10
    const/4 v5, 0x0

    .line 334
    :goto_f
    iget-object v6, v3, LE3/b;->e:Landroid/net/Uri;

    .line 335
    .line 336
    if-eqz v6, :cond_11

    .line 337
    .line 338
    const/4 v6, 0x1

    .line 339
    goto :goto_10

    .line 340
    :cond_11
    const/4 v6, 0x0

    .line 341
    :goto_10
    if-nez v5, :cond_13

    .line 342
    .line 343
    if-eqz v6, :cond_12

    .line 344
    .line 345
    goto :goto_11

    .line 346
    :cond_12
    iget-object v8, v4, LE3/T6;->c:Landroid/os/Bundle;

    .line 347
    .line 348
    goto :goto_12

    .line 349
    :cond_13
    :goto_11
    new-instance v8, Landroid/os/Bundle;

    .line 350
    .line 351
    iget-object v9, v4, LE3/T6;->c:Landroid/os/Bundle;

    .line 352
    .line 353
    invoke-direct {v8, v9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 354
    .line 355
    .line 356
    :goto_12
    if-eqz v5, :cond_14

    .line 357
    .line 358
    const-string v5, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"

    .line 359
    .line 360
    iget v9, v3, LE3/b;->c:I

    .line 361
    .line 362
    invoke-virtual {v8, v5, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    :cond_14
    if-eqz v6, :cond_15

    .line 366
    .line 367
    iget-object v5, v3, LE3/b;->e:Landroid/net/Uri;

    .line 368
    .line 369
    invoke-static {v5}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    check-cast v5, Landroid/net/Uri;

    .line 374
    .line 375
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    const-string v6, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT"

    .line 380
    .line 381
    invoke-virtual {v8, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :cond_15
    new-instance v5, LF3/v$d$b;

    .line 385
    .line 386
    iget-object v4, v4, LE3/T6;->b:Ljava/lang/String;

    .line 387
    .line 388
    iget-object v6, v3, LE3/b;->f:Ljava/lang/CharSequence;

    .line 389
    .line 390
    iget v3, v3, LE3/b;->d:I

    .line 391
    .line 392
    invoke-direct {v5, v4, v6, v3}, LF3/v$d$b;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v8}, LF3/v$d$b;->b(Landroid/os/Bundle;)LF3/v$d$b;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-virtual {v3}, LF3/v$d$b;->a()LF3/v$d;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v1, v3}, LF3/v$c;->a(LF3/v$d;)LF3/v$c;

    .line 404
    .line 405
    .line 406
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :cond_17
    if-eqz p1, :cond_18

    .line 410
    .line 411
    invoke-static/range {p1 .. p1}, LE3/t;->r(Lq2/N;)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-virtual {v1, v2, v3}, LF3/v$c;->f(ILjava/lang/CharSequence;)LF3/v$c;

    .line 420
    .line 421
    .line 422
    :cond_18
    invoke-virtual {v1}, LF3/v$c;->b()LF3/v;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    return-object v1
.end method


# virtual methods
.method public A()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x7

    .line 8
    invoke-virtual {v0, v1}, LE3/N6;->k(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, LE3/r4;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LE3/r4;-><init>(LE3/M4;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, LE3/M4;->k:LF3/n;

    .line 21
    .line 22
    invoke-virtual {v3}, LF3/n;->c()LF3/q$b;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {p0, v1, v0, v3, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v0, LE3/s4;

    .line 31
    .line 32
    invoke-direct {v0, p0}, LE3/s4;-><init>(LE3/M4;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 36
    .line 37
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v3, 0x6

    .line 42
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public B(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, LE3/n4;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, LE3/n4;-><init>(LE3/M4;J)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 14
    .line 15
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x1

    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-direct {p0, v1, v0, p1, p2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public C()V
    .locals 4

    .line 1
    new-instance v0, LE3/y4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/y4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public G0()LE3/g;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M4;->f:LE3/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public H0()LE3/h3$f;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M4;->i:LE3/M4$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public I0(LE3/h3;)LE3/h3$e;
    .locals 1

    .line 1
    new-instance v0, LE3/h3$e$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LE3/h3$e$a;-><init>(LE3/h3;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE3/M4;->v:LE3/U6;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LE3/h3$e$a;->c(LE3/U6;)LE3/h3$e$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, LE3/M4;->w:Lq2/P$b;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LE3/h3$e$a;->b(Lq2/P$b;)LE3/h3$e$a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, LE3/M4;->t:LP9/u;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LE3/h3$e$a;->d(Ljava/util/List;)LE3/h3$e$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, LE3/M4;->u:LP9/u;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LE3/h3$e$a;->e(Ljava/util/List;)LE3/h3$e$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, LE3/h3$e$a;->a()LE3/h3$e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public K0()LF3/n;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    return-object v0
.end method

.method L0(LF3/q$b;)V
    .locals 2

    .line 1
    new-instance v0, LE3/m4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/m4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {p0, v1, v0, p1, v1}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method Q0(LE3/N6;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE3/N6;->k(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget v0, p0, LE3/M4;->r:I

    .line 13
    .line 14
    if-eq v0, p1, :cond_1

    .line 15
    .line 16
    iput p1, p0, LE3/M4;->r:I

    .line 17
    .line 18
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LF3/n;->m(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public S0()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LE3/M4;->m:Landroid/content/ComponentName;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, LE3/M4;->V0(LF3/n;Landroid/app/PendingIntent;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 19
    .line 20
    iget-object v1, p0, LE3/M4;->g:LE3/I3;

    .line 21
    .line 22
    invoke-virtual {v1}, LE3/I3;->n0()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "android.intent.action.MEDIA_BUTTON"

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LE3/M4;->m:Landroid/content/ComponentName;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, LE3/M4;->g:LE3/I3;

    .line 37
    .line 38
    invoke-virtual {v1}, LE3/I3;->a0()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    sget v3, LE3/M4;->z:I

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 50
    .line 51
    invoke-static {v1, v0}, LE3/M4;->V0(LF3/n;Landroid/app/PendingIntent;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, LE3/M4;->l:LE3/M4$h;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 59
    .line 60
    invoke-virtual {v0}, LE3/I3;->a0()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, LE3/M4;->l:LE3/M4$h;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 70
    .line 71
    invoke-virtual {v0}, LF3/n;->h()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public U0(LE3/U6;Lq2/P$b;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/M4;->x:Lq2/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LE3/M4;->w:Lq2/P$b;

    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lq2/P$b;->c(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p2, v1}, Lq2/P$b;->c(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    iput-object p1, p0, LE3/M4;->v:LE3/U6;

    .line 25
    .line 26
    iput-object p2, p0, LE3/M4;->w:Lq2/P$b;

    .line 27
    .line 28
    iget-object p1, p0, LE3/M4;->u:LP9/u;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 37
    .line 38
    const-string p2, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 39
    .line 40
    invoke-virtual {p1, p2, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-object v1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 45
    .line 46
    const-string v3, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 47
    .line 48
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-direct {p0}, LE3/M4;->d1()V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-virtual {v4, p2, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-ne p2, p1, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eq p1, v1, :cond_3

    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, LE3/M4;->K0()LF3/n;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p2, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, LF3/n;->l(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 83
    .line 84
    invoke-virtual {p1}, LE3/I3;->j0()LE3/N6;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0, p1}, LE3/M4;->f1(LE3/N6;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 93
    .line 94
    invoke-virtual {p1}, LE3/I3;->j0()LE3/N6;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, LE3/M4;->e1(LE3/N6;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public X0(LP9/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4;->t:LP9/u;

    .line 2
    .line 3
    return-void
.end method

.method public Y0(LP9/u;)V
    .locals 5

    .line 1
    iput-object p1, p0, LE3/M4;->u:LP9/u;

    .line 2
    .line 3
    iget-object p1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v2, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v3, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 15
    .line 16
    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {p0}, LE3/M4;->d1()V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-virtual {v4, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-virtual {p1, v3, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eq p1, v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :cond_1
    :goto_0
    invoke-virtual {p0}, LE3/M4;->K0()LF3/n;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, LE3/M4;->s:Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LF3/n;->l(Landroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public b(LF3/l;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, v0}, LE3/M4;->N0(LF3/l;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b1()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->k:LF3/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LF3/n;->j(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c(LF3/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LE3/M4;->N0(LF3/l;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, LE3/M4;->g:LE3/I3;

    .line 24
    .line 25
    invoke-virtual {p1}, LE3/I3;->m0()LE3/Y6;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, LE3/Y6;->k()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p3, p2, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance v0, LE3/T6;

    .line 39
    .line 40
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-direct {v0, p1, v1}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, LE3/w4;

    .line 46
    .line 47
    invoke-direct {p1, p0, v0, p2, p3}, LE3/w4;-><init>(LE3/M4;LE3/T6;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v0, p1}, LE3/M4;->D0(LE3/T6;LE3/M4$i;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public e(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    new-instance v0, LE3/T6;

    .line 11
    .line 12
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, LE3/o4;

    .line 18
    .line 19
    invoke-direct {p1, p0, v0, p2}, LE3/o4;-><init>(LE3/M4;LE3/T6;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, p1}, LE3/M4;->D0(LE3/T6;LE3/M4$i;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public e1(LE3/N6;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE3/t4;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LE3/t4;-><init>(LE3/M4;LE3/N6;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    new-instance v0, LE3/G4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/G4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/16 v3, 0xc

    .line 14
    .line 15
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public f1(LE3/N6;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE3/F4;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LE3/F4;-><init>(LE3/M4;LE3/N6;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g(Landroid/content/Intent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    new-instance v1, LE3/h3$g;

    .line 4
    .line 5
    iget-object v2, p0, LE3/M4;->k:LF3/n;

    .line 6
    .line 7
    invoke-virtual {v2}, LF3/n;->c()LF3/q$b;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LF3/q$b;

    .line 16
    .line 17
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct/range {v1 .. v8}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, LE3/I3;->B0(LE3/h3$g;Landroid/content/Intent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public h()V
    .locals 3

    .line 1
    new-instance v0, LE3/k4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/k4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {p0, v2, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public i()V
    .locals 4

    .line 1
    new-instance v0, LE3/J4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/J4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public j(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public k(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, p1, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, v0, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public m()V
    .locals 4

    .line 1
    new-instance v0, LE3/x4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/x4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public n(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, p1, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, v0, p2}, LE3/M4;->y0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Lq2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p1, p2}, LE3/M4;->M0(Lq2/C;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public q(LF3/l;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/H4;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, LE3/H4;-><init>(LE3/M4;LF3/l;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 10
    .line 11
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0x14

    .line 17
    .line 18
    invoke-direct {p0, v2, v0, p1, v1}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public r()V
    .locals 4

    .line 1
    new-instance v0, LE3/v4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/v4;-><init>(LE3/M4;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/16 v3, 0xb

    .line 14
    .line 15
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public s(J)V
    .locals 2

    .line 1
    new-instance v0, LE3/I4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LE3/I4;-><init>(LE3/M4;J)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {p0, v1, v0, p1, p2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public t(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(F)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, LE3/l4;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, LE3/l4;-><init>(LE3/M4;F)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 13
    .line 14
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x1

    .line 19
    const/16 v2, 0xd

    .line 20
    .line 21
    invoke-direct {p0, v2, v0, p1, v1}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public v(LF3/w;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LE3/M4;->w(LF3/w;Landroid/os/Bundle;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public w(LF3/w;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p1}, LE3/t;->R(LF3/w;)Lq2/S;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v0, "Ignoring invalid RatingCompat "

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "MediaSessionLegacyStub"

    .line 25
    .line 26
    invoke-static {p2, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, LE3/p4;

    .line 31
    .line 32
    invoke-direct {p1, p0, p2}, LE3/p4;-><init>(LE3/M4;Lq2/S;)V

    .line 33
    .line 34
    .line 35
    const p2, 0x9c4a

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p2, p1}, LE3/M4;->C0(ILE3/M4$i;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public x(I)V
    .locals 3

    .line 1
    new-instance v0, LE3/u4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/u4;-><init>(LE3/M4;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x1

    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {p0, v2, v0, p1, v1}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public y(I)V
    .locals 3

    .line 1
    new-instance v0, LE3/K4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/K4;-><init>(LE3/M4;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE3/M4;->k:LF3/n;

    .line 7
    .line 8
    invoke-virtual {p1}, LF3/n;->c()LF3/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x1

    .line 13
    const/16 v2, 0xe

    .line 14
    .line 15
    invoke-direct {p0, v2, v0, p1, v1}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public z()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/M4;->g:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LE3/N6;->k(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, LE3/D4;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LE3/D4;-><init>(LE3/M4;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, LE3/M4;->k:LF3/n;

    .line 22
    .line 23
    invoke-virtual {v3}, LF3/n;->c()LF3/q$b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {p0, v1, v0, v3, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, LE3/E4;

    .line 32
    .line 33
    invoke-direct {v0, p0}, LE3/E4;-><init>(LE3/M4;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, LE3/M4;->k:LF3/n;

    .line 37
    .line 38
    invoke-virtual {v1}, LF3/n;->c()LF3/q$b;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    invoke-direct {p0, v3, v0, v1, v2}, LE3/M4;->B0(ILE3/M4$i;LF3/q$b;Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
