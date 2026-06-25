.class public final Lzd/h$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lwd/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/h;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;Lzd/h$a;LGf/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/h$c$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lzd/h;


# direct methods
.method constructor <init>(Lzd/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "procedureContext"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    new-instance v1, LCd/e$a;

    .line 16
    .line 17
    invoke-direct {v1}, LCd/e$a;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lzd/j$b;->a(LCd/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public b(Lyd/q;)V
    .locals 1

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 7
    .line 8
    sget-object v0, Ltd/d$a;->b:Ltd/d$a;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Lrd/d;)Z
    .locals 1

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "procedureContext"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    new-instance v1, LCd/e$f;

    .line 16
    .line 17
    invoke-direct {v1}, LCd/e$f;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lzd/j$b;->a(LCd/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public e(Lwd/o$c;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lwd/o$c$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p1, LCd/e$b;

    .line 11
    .line 12
    invoke-direct {p1}, LCd/e$b;-><init>()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    instance-of v0, p1, Lwd/o$c$d;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, LCd/e$d;

    .line 21
    .line 22
    check-cast p1, Lwd/o$c$d;

    .line 23
    .line 24
    invoke-virtual {p1}, Lwd/o$c$d;->a()Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, LCd/e$d;-><init>(Lorg/json/JSONObject;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    move-object p1, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    instance-of v0, p1, Lwd/o$c$b;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    new-instance v0, LCd/e$c;

    .line 38
    .line 39
    check-cast p1, Lwd/o$c$b;

    .line 40
    .line 41
    invoke-virtual {p1}, Lwd/o$c$b;->a()Ljava/util/Date;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, LCd/e$c;-><init>(Ljava/util/Date;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 50
    .line 51
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    const-string v0, "procedureContext"

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    :cond_2
    invoke-interface {v0, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    new-instance p1, LTd/r;

    .line 68
    .line 69
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method public f(Lwd/o$e;Lrd/d;Ljava/lang/Exception;)V
    .locals 5

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lzd/h$c$a;->b:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x0

    .line 16
    const-string v2, "procedureContext"

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq p1, v3, :cond_6

    .line 20
    .line 21
    if-eq p1, v0, :cond_3

    .line 22
    .line 23
    const/4 p2, 0x3

    .line 24
    if-ne p1, p2, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 27
    .line 28
    sget-object p2, Ltd/d$a;->a:Ltd/d$a;

    .line 29
    .line 30
    invoke-static {p1, p2}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 34
    .line 35
    invoke-static {p1}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "UpdatesController onBackgroundUpdateFinished: No update available"

    .line 40
    .line 41
    sget-object p3, Lxd/b;->c:Lxd/b;

    .line 42
    .line 43
    invoke-virtual {p1, p2, p3}, Lxd/g;->i(Ljava/lang/String;Lxd/b;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 47
    .line 48
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object p1, v1

    .line 58
    :cond_0
    invoke-interface {p1}, Lzd/j$b;->d()LCd/h;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p2, LCd/h;->d:LCd/h;

    .line 63
    .line 64
    if-ne p1, p2, :cond_11

    .line 65
    .line 66
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 67
    .line 68
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v1, p1

    .line 79
    :goto_0
    new-instance p1, LCd/e$g;

    .line 80
    .line 81
    invoke-direct {p1}, LCd/e$g;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {v1, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_8

    .line 88
    .line 89
    :cond_2
    new-instance p1, LTd/r;

    .line 90
    .line 91
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_3
    if-eqz p2, :cond_5

    .line 96
    .line 97
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 98
    .line 99
    sget-object p3, Ltd/d$a;->c:Ltd/d$a;

    .line 100
    .line 101
    invoke-static {p1, p3}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 105
    .line 106
    invoke-static {p1}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string p3, "UpdatesController onBackgroundUpdateFinished: Update available"

    .line 111
    .line 112
    sget-object v0, Lxd/b;->b:Lxd/b;

    .line 113
    .line 114
    invoke-virtual {p1, p3, v0}, Lxd/g;->i(Ljava/lang/String;Lxd/b;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 118
    .line 119
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-nez p1, :cond_4

    .line 124
    .line 125
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    move-object v1, p1

    .line 130
    :goto_1
    new-instance p1, LCd/e$i;

    .line 131
    .line 132
    invoke-virtual {p2}, Lrd/d;->i()Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-direct {p1, p2}, LCd/e$i;-><init>(Lorg/json/JSONObject;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v1, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    .line 145
    .line 146
    const-string p2, "Background update with error status must have a nonnull update object"

    .line 147
    .line 148
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_6
    if-eqz p3, :cond_12

    .line 153
    .line 154
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 155
    .line 156
    invoke-static {p1}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string p2, "UpdatesController onBackgroundUpdateFinished"

    .line 161
    .line 162
    sget-object v4, Lxd/b;->l:Lxd/b;

    .line 163
    .line 164
    invoke-virtual {p1, p2, p3, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 168
    .line 169
    sget-object p2, Ltd/d$a;->a:Ltd/d$a;

    .line 170
    .line 171
    invoke-static {p1, p2}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 175
    .line 176
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-nez p1, :cond_7

    .line 181
    .line 182
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move-object p1, v1

    .line 186
    :cond_7
    invoke-interface {p1}, Lzd/j$b;->d()LCd/h;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sget-object p2, Lzd/h$c$a;->a:[I

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    aget p1, p2, p1

    .line 197
    .line 198
    const-string p2, ""

    .line 199
    .line 200
    if-eq p1, v3, :cond_d

    .line 201
    .line 202
    if-eq p1, v0, :cond_a

    .line 203
    .line 204
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 205
    .line 206
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    if-nez p1, :cond_8

    .line 211
    .line 212
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_8
    move-object v1, p1

    .line 217
    :goto_2
    new-instance p1, LCd/e$j;

    .line 218
    .line 219
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    if-nez p3, :cond_9

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_9
    move-object p2, p3

    .line 227
    :goto_3
    invoke-direct {p1, p2}, LCd/e$j;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v1, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_a
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 235
    .line 236
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    if-nez p1, :cond_b

    .line 241
    .line 242
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_b
    move-object v1, p1

    .line 247
    :goto_4
    new-instance p1, LCd/e$e;

    .line 248
    .line 249
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p3

    .line 253
    if-nez p3, :cond_c

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_c
    move-object p2, p3

    .line 257
    :goto_5
    invoke-direct {p1, p2}, LCd/e$e;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v1, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_d
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 265
    .line 266
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    if-nez p1, :cond_e

    .line 271
    .line 272
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    move-object p1, v1

    .line 276
    :cond_e
    new-instance v0, LCd/e$f;

    .line 277
    .line 278
    invoke-direct {v0}, LCd/e$f;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {p1, v0}, Lzd/j$b;->a(LCd/e;)V

    .line 282
    .line 283
    .line 284
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 285
    .line 286
    invoke-static {p1}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-nez p1, :cond_f

    .line 291
    .line 292
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_f
    move-object v1, p1

    .line 297
    :goto_6
    new-instance p1, LCd/e$j;

    .line 298
    .line 299
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p3

    .line 303
    if-nez p3, :cond_10

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_10
    move-object p2, p3

    .line 307
    :goto_7
    invoke-direct {p1, p2}, LCd/e$j;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v1, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 311
    .line 312
    .line 313
    :cond_11
    :goto_8
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 314
    .line 315
    invoke-static {p1}, Lzd/h;->f(Lzd/h;)Ltd/c;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    iget-object p2, p0, Lzd/h$c;->a:Lzd/h;

    .line 320
    .line 321
    invoke-static {p2}, Lzd/h;->l(Lzd/h;)Ltd/d$a;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-virtual {p1, p2}, Ltd/c;->i(Ltd/d$a;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_12
    new-instance p1, Ljava/lang/AssertionError;

    .line 330
    .line 331
    const-string p2, "Background update with error status must have a nonnull exception object"

    .line 332
    .line 333
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    throw p1
.end method

.method public g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "procedureContext"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    new-instance v3, LCd/e$l;

    .line 17
    .line 18
    invoke-direct {v3}, LCd/e$l;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v3}, Lzd/j$b;->a(LCd/e;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 25
    .line 26
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v1, v0

    .line 37
    :goto_0
    invoke-interface {v1}, Lzd/j$a;->c()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public h(D)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->j(Lzd/h;)Lzd/j$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "procedureContext"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    new-instance v1, LCd/e$k;

    .line 16
    .line 17
    invoke-direct {v1, p1, p2}, LCd/e$k;-><init>(D)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lzd/j$b;->a(LCd/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public i(Lvd/b;Z)V
    .locals 2

    .line 1
    const-string v0, "launcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 7
    .line 8
    invoke-static {v0}, Lzd/h;->l(Lzd/h;)Ltd/d$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ltd/d$a;->b:Ltd/d$a;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lzd/h$c;->a:Lzd/h;

    .line 19
    .line 20
    sget-object v0, Ltd/d$a;->a:Ltd/d$a;

    .line 21
    .line 22
    invoke-static {p2, v0}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p2, p0, Lzd/h$c;->a:Lzd/h;

    .line 26
    .line 27
    invoke-static {p2, p1}, Lzd/h;->r(Lzd/h;Lvd/b;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 31
    .line 32
    invoke-static {p1}, Lzd/h;->p(Lzd/h;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public j(Lrd/a;III)V
    .locals 2

    .line 1
    const-string v0, "asset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-virtual {p1}, Lrd/a;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "successfulAssetCount"

    .line 17
    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {v1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string v1, "failedAssetCount"

    .line 27
    .line 28
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-static {v1, p3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const-string v1, "totalAssetCount"

    .line 37
    .line 38
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-static {v1, p4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    filled-new-array {v0, p2, p3, p4}, [Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string p3, "assetInfo"

    .line 55
    .line 56
    invoke-static {p3, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object p3, p0, Lzd/h$c;->a:Lzd/h;

    .line 65
    .line 66
    invoke-static {p3}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    new-instance p4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v0, "AppController appLoaderTask didLoadAsset: "

    .line 76
    .line 77
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    sget-object p4, Lxd/b;->b:Lxd/b;

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-virtual {p1}, Lrd/a;->c()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p3, p2, p4, v0, p1}, Lxd/g;->j(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 5

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 7
    .line 8
    invoke-static {v0}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "UpdatesController loaderTask onFailure"

    .line 13
    .line 14
    sget-object v2, Lxd/b;->b:Lxd/b;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 20
    .line 21
    new-instance v1, Lvd/c;

    .line 22
    .line 23
    iget-object v2, p0, Lzd/h$c;->a:Lzd/h;

    .line 24
    .line 25
    invoke-static {v2}, Lzd/h;->d(Lzd/h;)Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, p0, Lzd/h$c;->a:Lzd/h;

    .line 30
    .line 31
    invoke-static {v3}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, p0, Lzd/h$c;->a:Lzd/h;

    .line 36
    .line 37
    invoke-static {v4}, Lzd/h;->k(Lzd/h;)LGf/O;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {v1, v2, v3, p1, v4}, Lvd/c;-><init>(Landroid/content/Context;Lxd/g;Ljava/lang/Exception;LGf/O;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lzd/h;->r(Lzd/h;Lvd/b;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lzd/h$c;->a:Lzd/h;

    .line 48
    .line 49
    invoke-static {v0, p1}, Lzd/h;->q(Lzd/h;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lzd/h$c;->a:Lzd/h;

    .line 53
    .line 54
    invoke-static {p1}, Lzd/h;->p(Lzd/h;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
