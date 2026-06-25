.class public final Lzd/a;
.super Lzd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Lpd/c;

.field private final d:Lxd/g;

.field private final e:Lwd/g;

.field private final f:LBd/h;

.field private final g:Lrd/d;

.field private final h:Lkotlin/jvm/functions/Function1;

.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Lxd/g;Lwd/g;LBd/h;Lrd/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updatesConfiguration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "databaseHolder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "updatesLogger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "fileDownloader"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "selectionPolicy"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "callback"

    .line 32
    .line 33
    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lzd/j;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lzd/a;->a:Landroid/content/Context;

    .line 40
    .line 41
    iput-object p2, p0, Lzd/a;->b:Lexpo/modules/updates/d;

    .line 42
    .line 43
    iput-object p3, p0, Lzd/a;->c:Lpd/c;

    .line 44
    .line 45
    iput-object p4, p0, Lzd/a;->d:Lxd/g;

    .line 46
    .line 47
    iput-object p5, p0, Lzd/a;->e:Lwd/g;

    .line 48
    .line 49
    iput-object p6, p0, Lzd/a;->f:LBd/h;

    .line 50
    .line 51
    iput-object p7, p0, Lzd/a;->g:Lrd/d;

    .line 52
    .line 53
    iput-object p8, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    const-string p1, "timer-check-for-update"

    .line 56
    .line 57
    iput-object p1, p0, Lzd/a;->i:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method public static final synthetic c(Lzd/a;Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lzd/a;->d(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lzd/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzd/a$a;

    .line 7
    .line 8
    iget v1, v0, Lzd/a$a;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzd/a$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzd/a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzd/a$a;-><init>(Lzd/a;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzd/a$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lzd/a$a;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p2, p0, Lzd/a;->e:Lwd/g;

    .line 56
    .line 57
    iput v3, v0, Lzd/a$a;->c:I

    .line 58
    .line 59
    invoke-virtual {p2, p1, v0}, Lwd/g;->r(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    return-object p1

    .line 67
    :goto_1
    iget-object p2, p0, Lzd/a;->d:Lxd/g;

    .line 68
    .line 69
    const-string v0, "Download cancelled for remote update check"

    .line 70
    .line 71
    const/4 v1, 0x2

    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-static {p2, v0, v2, v1, v2}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method private final e(Lwd/v;Lzd/j$a;Lrd/d;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lwd/v;->a()Lwd/w$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lwd/w$a;->a()Lwd/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, Lwd/v;->b()Lwd/w$b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lwd/w$b;->a()Lyd/q;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_1
    if-eqz v0, :cond_8

    .line 27
    .line 28
    instance-of v2, v0, Lwd/u$b;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    new-instance p1, LCd/e$b;

    .line 33
    .line 34
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    new-instance p3, Lexpo/modules/updates/c$a$b;

    .line 43
    .line 44
    sget-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 45
    .line 46
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    instance-of v2, v0, Lwd/u$c;

    .line 57
    .line 58
    if-eqz v2, :cond_7

    .line 59
    .line 60
    iget-object v2, p0, Lzd/a;->b:Lexpo/modules/updates/d;

    .line 61
    .line 62
    invoke-virtual {v2}, Lexpo/modules/updates/d;->j()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_3

    .line 67
    .line 68
    new-instance p1, LCd/e$b;

    .line 69
    .line 70
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    new-instance p3, Lexpo/modules/updates/c$a$b;

    .line 79
    .line 80
    sget-object v0, Lwd/o$d;->f:Lwd/o$d;

    .line 81
    .line 82
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    if-nez p3, :cond_4

    .line 93
    .line 94
    new-instance p1, LCd/e$b;

    .line 95
    .line 96
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 103
    .line 104
    new-instance p3, Lexpo/modules/updates/c$a$b;

    .line 105
    .line 106
    sget-object v0, Lwd/o$d;->f:Lwd/o$d;

    .line 107
    .line 108
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    iget-object v2, p0, Lzd/a;->f:LBd/h;

    .line 119
    .line 120
    check-cast v0, Lwd/u$c;

    .line 121
    .line 122
    iget-object v3, p0, Lzd/a;->g:Lrd/d;

    .line 123
    .line 124
    invoke-virtual {p1}, Lwd/v;->c()Lyd/n;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    invoke-virtual {p1}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_5
    invoke-virtual {v2, v0, p3, v3, v1}, LBd/h;->d(Lwd/u$c;Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_6

    .line 139
    .line 140
    new-instance p1, LCd/e$b;

    .line 141
    .line 142
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    new-instance p3, Lexpo/modules/updates/c$a$b;

    .line 151
    .line 152
    sget-object v0, Lwd/o$d;->e:Lwd/o$d;

    .line 153
    .line 154
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_6
    new-instance p1, LCd/e$c;

    .line 165
    .line 166
    invoke-virtual {v0}, Lwd/u$c;->b()Ljava/util/Date;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-direct {p1, p3}, LCd/e$c;-><init>(Ljava/util/Date;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    new-instance p3, Lexpo/modules/updates/c$a$c;

    .line 179
    .line 180
    invoke-virtual {v0}, Lwd/u$c;->b()Ljava/util/Date;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$c;-><init>(Ljava/util/Date;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_7
    new-instance p1, LTd/r;

    .line 195
    .line 196
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_8
    if-nez v2, :cond_9

    .line 201
    .line 202
    new-instance p1, LCd/e$b;

    .line 203
    .line 204
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 211
    .line 212
    new-instance p3, Lexpo/modules/updates/c$a$b;

    .line 213
    .line 214
    sget-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 215
    .line 216
    invoke-direct {p3, v0}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_9
    iget-object p3, p0, Lzd/a;->g:Lrd/d;

    .line 227
    .line 228
    if-nez p3, :cond_a

    .line 229
    .line 230
    new-instance p1, LCd/e$d;

    .line 231
    .line 232
    invoke-interface {v2}, Lyd/q;->d()LAc/e;

    .line 233
    .line 234
    .line 235
    move-result-object p3

    .line 236
    invoke-virtual {p3}, LAc/e;->i()Lorg/json/JSONObject;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    invoke-direct {p1, p3}, LCd/e$d;-><init>(Lorg/json/JSONObject;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    new-instance p3, Lexpo/modules/updates/c$a$e;

    .line 249
    .line 250
    invoke-direct {p3, v2}, Lexpo/modules/updates/c$a$e;-><init>(Lyd/q;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_a
    iget-object p3, p0, Lzd/a;->f:LBd/h;

    .line 261
    .line 262
    invoke-interface {v2}, Lyd/q;->c()Lrd/d;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iget-object v3, p0, Lzd/a;->g:Lrd/d;

    .line 267
    .line 268
    invoke-virtual {p1}, Lwd/v;->c()Lyd/n;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    if-eqz p1, :cond_b

    .line 273
    .line 274
    invoke-virtual {p1}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    goto :goto_2

    .line 279
    :cond_b
    move-object p1, v1

    .line 280
    :goto_2
    invoke-virtual {p3, v0, v3, p1}, LBd/h;->c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    const/4 p3, 0x0

    .line 285
    const/4 v0, 0x1

    .line 286
    if-eqz p1, :cond_e

    .line 287
    .line 288
    invoke-interface {v2}, Lyd/q;->c()Lrd/d;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-eqz p1, :cond_d

    .line 293
    .line 294
    iget-object v3, p0, Lzd/a;->c:Lpd/c;

    .line 295
    .line 296
    invoke-virtual {v3}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-virtual {v3}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {p1}, Lrd/d;->d()Ljava/util/UUID;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v3, v4}, Lqd/e;->o(Ljava/util/UUID;)Lrd/d;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    if-eqz v3, :cond_d

    .line 313
    .line 314
    invoke-virtual {v3}, Lrd/d;->c()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-nez v4, :cond_c

    .line 319
    .line 320
    move p3, v0

    .line 321
    :cond_c
    iget-object v4, p0, Lzd/a;->d:Lxd/g;

    .line 322
    .line 323
    invoke-virtual {p1}, Lrd/d;->d()Ljava/util/UUID;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {v3}, Lrd/d;->c()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    new-instance v5, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const-string v6, "Stored update found: ID = "

    .line 337
    .line 338
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string p1, ", failureCount = "

    .line 345
    .line 346
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    const/4 v3, 0x2

    .line 357
    invoke-static {v4, p1, v1, v3, v1}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    xor-int/lit8 p1, p3, 0x1

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_d
    move p1, p3

    .line 364
    move p3, v0

    .line 365
    goto :goto_3

    .line 366
    :cond_e
    move p1, p3

    .line 367
    :goto_3
    if-eqz p3, :cond_f

    .line 368
    .line 369
    new-instance p1, LCd/e$d;

    .line 370
    .line 371
    invoke-interface {v2}, Lyd/q;->d()LAc/e;

    .line 372
    .line 373
    .line 374
    move-result-object p3

    .line 375
    invoke-virtual {p3}, LAc/e;->i()Lorg/json/JSONObject;

    .line 376
    .line 377
    .line 378
    move-result-object p3

    .line 379
    invoke-direct {p1, p3}, LCd/e$d;-><init>(Lorg/json/JSONObject;)V

    .line 380
    .line 381
    .line 382
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 383
    .line 384
    .line 385
    iget-object p1, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 386
    .line 387
    new-instance p3, Lexpo/modules/updates/c$a$e;

    .line 388
    .line 389
    invoke-direct {p3, v2}, Lexpo/modules/updates/c$a$e;-><init>(Lyd/q;)V

    .line 390
    .line 391
    .line 392
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :cond_f
    if-ne p1, v0, :cond_10

    .line 400
    .line 401
    sget-object p1, Lwd/o$d;->d:Lwd/o$d;

    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_10
    sget-object p1, Lwd/o$d;->c:Lwd/o$d;

    .line 405
    .line 406
    :goto_4
    new-instance p3, LCd/e$b;

    .line 407
    .line 408
    invoke-direct {p3}, LCd/e$b;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-interface {p2, p3}, Lzd/j$b;->a(LCd/e;)V

    .line 412
    .line 413
    .line 414
    iget-object p3, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 415
    .line 416
    new-instance v0, Lexpo/modules/updates/c$a$b;

    .line 417
    .line 418
    invoke-direct {v0, p1}, Lexpo/modules/updates/c$a$b;-><init>(Lwd/o$d;)V

    .line 419
    .line 420
    .line 421
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    invoke-interface {p2}, Lzd/j$a;->c()V

    .line 425
    .line 426
    .line 427
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/a;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lzd/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzd/a$b;

    .line 7
    .line 8
    iget v1, v0, Lzd/a$b;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzd/a$b;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzd/a$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzd/a$b;-><init>(Lzd/a;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzd/a$b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lzd/a$b;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lzd/a$b;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lrd/d;

    .line 41
    .line 42
    iget-object v0, v0, Lzd/a$b;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lzd/j$a;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    move-object v7, p2

    .line 50
    move-object p2, p1

    .line 51
    move-object p1, v0

    .line 52
    move-object v0, v7

    .line 53
    goto :goto_2

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, LCd/e$a;

    .line 68
    .line 69
    invoke-direct {p2}, LCd/e$a;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, p2}, Lzd/j$b;->a(LCd/e;)V

    .line 73
    .line 74
    .line 75
    sget-object p2, Lyd/a;->a:Lyd/a;

    .line 76
    .line 77
    iget-object v2, p0, Lzd/a;->a:Landroid/content/Context;

    .line 78
    .line 79
    iget-object v4, p0, Lzd/a;->b:Lexpo/modules/updates/d;

    .line 80
    .line 81
    invoke-virtual {p2, v2, v4}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-eqz p2, :cond_3

    .line 86
    .line 87
    invoke-virtual {p2}, Lyd/d;->c()Lrd/d;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const/4 p2, 0x0

    .line 93
    :goto_1
    sget-object v2, Lwd/g;->h:Lwd/g$b;

    .line 94
    .line 95
    iget-object v4, p0, Lzd/a;->c:Lpd/c;

    .line 96
    .line 97
    invoke-virtual {v4}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-object v5, p0, Lzd/a;->b:Lexpo/modules/updates/d;

    .line 102
    .line 103
    iget-object v6, p0, Lzd/a;->g:Lrd/d;

    .line 104
    .line 105
    invoke-virtual {v2, v4, v5, v6, p2}, Lwd/g$b;->b(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;Lrd/d;Lrd/d;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :try_start_1
    iput-object p1, v0, Lzd/a$b;->a:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p2, v0, Lzd/a$b;->b:Ljava/lang/Object;

    .line 112
    .line 113
    iput v3, v0, Lzd/a$b;->e:I

    .line 114
    .line 115
    invoke-direct {p0, v2, v0}, Lzd/a;->d(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v1, :cond_4

    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_4
    :goto_2
    check-cast v0, Lwd/v;

    .line 123
    .line 124
    invoke-direct {p0, v0, p1, p2}, Lzd/a;->e(Lwd/v;Lzd/j$a;Lrd/d;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :catch_1
    move-exception p2

    .line 129
    move-object v0, p1

    .line 130
    move-object p1, p2

    .line 131
    :goto_3
    new-instance p2, LCd/e$e;

    .line 132
    .line 133
    invoke-static {p1}, Lub/f;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {p2, v1}, LCd/e$e;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0, p2}, Lzd/j$b;->a(LCd/e;)V

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, Lzd/a;->h:Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    new-instance v1, Lexpo/modules/updates/c$a$a;

    .line 146
    .line 147
    invoke-direct {v1, p1}, Lexpo/modules/updates/c$a$a;-><init>(Ljava/lang/Exception;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Lzd/j$a;->c()V

    .line 154
    .line 155
    .line 156
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 157
    .line 158
    return-object p1
.end method
