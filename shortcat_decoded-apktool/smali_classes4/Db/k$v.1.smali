.class public final LDb/k$v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/k;


# direct methods
.method public constructor <init>(LDb/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$v;->a:LDb/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;LUb/u;)V
    .locals 7

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "promise"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p2, Lexpo/modules/filesystem/legacy/RelocatingOptions;

    .line 12
    .line 13
    invoke-virtual {p2}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getFrom()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, LDb/k$v;->a:LDb/k;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Lexpo/modules/kotlin/services/FilePermissionService$a;->a:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "Location \'"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, "\' isn\'t readable."

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v0, p1, v1, v2}, LDb/k;->D(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getTo()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, LDb/k$v;->a:LDb/k;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v2, Lexpo/modules/kotlin/services/FilePermissionService$a;->b:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 75
    .line 76
    invoke-static {v1, v0, v2}, LDb/k;->C(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v2, "file"

    .line 84
    .line 85
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    iget-object p2, p0, LDb/k$v;->a:LDb/k;

    .line 92
    .line 93
    invoke-static {p2, p1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object p1, p0, LDb/k$v;->a:LDb/k;

    .line 98
    .line 99
    invoke-static {p1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/16 p2, 0x1a

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    if-lt p1, p2, :cond_0

    .line 114
    .line 115
    invoke-static {v1, v2}, Lyg/a;->b(Ljava/io/File;Ljava/io/File;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_0
    const/4 v5, 0x4

    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v3, 0x1

    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-static/range {v1 .. v6}, Lfe/k;->v(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 128
    .line 129
    if-lt p1, p2, :cond_2

    .line 130
    .line 131
    invoke-static {v1, v2}, Lyg/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_2
    const/4 v5, 0x4

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v3, 0x1

    .line 138
    const/4 v4, 0x0

    .line 139
    invoke-static/range {v1 .. v6}, Lfe/k;->y(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_3
    iget-object v1, p0, LDb/k$v;->a:LDb/k;

    .line 144
    .line 145
    invoke-static {v1, p1}, LDb/k;->R(LDb/k;Landroid/net/Uri;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    iget-object p2, p0, LDb/k$v;->a:LDb/k;

    .line 152
    .line 153
    invoke-static {p2, p1}, LDb/k;->N(LDb/k;Landroid/net/Uri;)LY1/a;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_4

    .line 158
    .line 159
    invoke-virtual {p2}, LY1/a;->f()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_4

    .line 164
    .line 165
    iget-object p1, p0, LDb/k$v;->a:LDb/k;

    .line 166
    .line 167
    invoke-static {p1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object v0, p0, LDb/k$v;->a:LDb/k;

    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    invoke-static {v0, p2, p1, v1}, LDb/k;->Y(LDb/k;LY1/a;Ljava/io/File;Z)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_4
    new-instance p2, LDb/i;

    .line 179
    .line 180
    invoke-direct {p2, p1}, LDb/i;-><init>(Landroid/net/Uri;)V

    .line 181
    .line 182
    .line 183
    throw p2

    .line 184
    :cond_5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    const-string v2, "content"

    .line 189
    .line 190
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_6

    .line 195
    .line 196
    iget-object p2, p0, LDb/k$v;->a:LDb/k;

    .line 197
    .line 198
    invoke-static {p2}, LDb/k;->G(LDb/k;)Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance p2, Ljava/io/FileOutputStream;

    .line 211
    .line 212
    iget-object v1, p0, LDb/k$v;->a:LDb/k;

    .line 213
    .line 214
    invoke-static {v1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 219
    .line 220
    .line 221
    invoke-static {p1, p2}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_6
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    const-string v2, "asset"

    .line 230
    .line 231
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_7

    .line 236
    .line 237
    iget-object p2, p0, LDb/k$v;->a:LDb/k;

    .line 238
    .line 239
    invoke-static {p2, p1}, LDb/k;->T(LDb/k;Landroid/net/Uri;)Ljava/io/InputStream;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    new-instance p2, Ljava/io/FileOutputStream;

    .line 244
    .line 245
    iget-object v1, p0, LDb/k$v;->a:LDb/k;

    .line 246
    .line 247
    invoke-static {v1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 252
    .line 253
    .line 254
    invoke-static {p1, p2}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_7
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-nez v1, :cond_8

    .line 263
    .line 264
    iget-object p1, p0, LDb/k$v;->a:LDb/k;

    .line 265
    .line 266
    invoke-virtual {p2}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getFrom()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-static {p1, p2}, LDb/k;->U(LDb/k;Ljava/lang/String;)Ljava/io/InputStream;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    new-instance p2, Ljava/io/FileOutputStream;

    .line 275
    .line 276
    iget-object v1, p0, LDb/k$v;->a:LDb/k;

    .line 277
    .line 278
    invoke-static {v1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 283
    .line 284
    .line 285
    invoke-static {p1, p2}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_8
    new-instance p2, Ljava/io/IOException;

    .line 290
    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v1, "Unsupported scheme for location \'"

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string p1, "\'."

    .line 305
    .line 306
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, LUb/u;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LDb/k$v;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
