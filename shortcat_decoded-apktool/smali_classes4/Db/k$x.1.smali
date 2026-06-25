.class public final LDb/k$x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
    iput-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, Lexpo/modules/filesystem/legacy/RelocatingOptions;

    .line 10
    .line 11
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getFrom()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, LDb/k$x;->a:LDb/k;

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Lexpo/modules/kotlin/services/FilePermissionService$a;->a:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "Location \'"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, "\' isn\'t readable."

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v1, v0, v2, v3}, LDb/k;->D(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getTo()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, p0, LDb/k$x;->a:LDb/k;

    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v3, Lexpo/modules/kotlin/services/FilePermissionService$a;->b:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 73
    .line 74
    invoke-static {v2, v1, v3}, LDb/k;->C(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, "file"

    .line 82
    .line 83
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    iget-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 90
    .line 91
    invoke-static {p1, v0}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 96
    .line 97
    invoke-static {p1, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/16 v0, 0x1a

    .line 106
    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    if-lt p1, v0, :cond_0

    .line 112
    .line 113
    invoke-static {v2, v3}, Lyg/a;->b(Ljava/io/File;Ljava/io/File;)V

    .line 114
    .line 115
    .line 116
    sget-object p1, LTd/L;->a:LTd/L;

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_0
    const/4 v6, 0x4

    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v4, 0x1

    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-static/range {v2 .. v7}, Lfe/k;->v(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    if-lt p1, v0, :cond_2

    .line 135
    .line 136
    invoke-static {v2, v3}, Lyg/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 137
    .line 138
    .line 139
    sget-object p1, LTd/L;->a:LTd/L;

    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_2
    const/4 v6, 0x4

    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v4, 0x1

    .line 145
    const/4 v5, 0x0

    .line 146
    invoke-static/range {v2 .. v7}, Lfe/k;->y(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :cond_3
    iget-object v2, p0, LDb/k$x;->a:LDb/k;

    .line 152
    .line 153
    invoke-static {v2, v0}, LDb/k;->R(LDb/k;Landroid/net/Uri;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_5

    .line 158
    .line 159
    iget-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 160
    .line 161
    invoke-static {p1, v0}, LDb/k;->N(LDb/k;Landroid/net/Uri;)LY1/a;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eqz p1, :cond_4

    .line 166
    .line 167
    invoke-virtual {p1}, LY1/a;->f()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_4

    .line 172
    .line 173
    iget-object v0, p0, LDb/k$x;->a:LDb/k;

    .line 174
    .line 175
    invoke-static {v0, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v1, p0, LDb/k$x;->a:LDb/k;

    .line 180
    .line 181
    const/4 v2, 0x1

    .line 182
    invoke-static {v1, p1, v0, v2}, LDb/k;->Y(LDb/k;LY1/a;Ljava/io/File;Z)V

    .line 183
    .line 184
    .line 185
    sget-object p1, LTd/L;->a:LTd/L;

    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_4
    new-instance p1, LDb/i;

    .line 189
    .line 190
    invoke-direct {p1, v0}, LDb/i;-><init>(Landroid/net/Uri;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :cond_5
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v3, "content"

    .line 199
    .line 200
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_6

    .line 205
    .line 206
    iget-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 207
    .line 208
    invoke-static {p1}, LDb/k;->G(LDb/k;)Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    new-instance v0, Ljava/io/FileOutputStream;

    .line 221
    .line 222
    iget-object v2, p0, LDb/k$x;->a:LDb/k;

    .line 223
    .line 224
    invoke-static {v2, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 229
    .line 230
    .line 231
    invoke-static {p1, v0}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1

    .line 240
    :cond_6
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const-string v3, "asset"

    .line 245
    .line 246
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_7

    .line 251
    .line 252
    iget-object p1, p0, LDb/k$x;->a:LDb/k;

    .line 253
    .line 254
    invoke-static {p1, v0}, LDb/k;->T(LDb/k;Landroid/net/Uri;)Ljava/io/InputStream;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    new-instance v0, Ljava/io/FileOutputStream;

    .line 259
    .line 260
    iget-object v2, p0, LDb/k$x;->a:LDb/k;

    .line 261
    .line 262
    invoke-static {v2, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 267
    .line 268
    .line 269
    invoke-static {p1, v0}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    return-object p1

    .line 278
    :cond_7
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    if-nez v2, :cond_8

    .line 283
    .line 284
    iget-object v0, p0, LDb/k$x;->a:LDb/k;

    .line 285
    .line 286
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getFrom()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-static {v0, p1}, LDb/k;->U(LDb/k;Ljava/lang/String;)Ljava/io/InputStream;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    new-instance v0, Ljava/io/FileOutputStream;

    .line 295
    .line 296
    iget-object v2, p0, LDb/k$x;->a:LDb/k;

    .line 297
    .line 298
    invoke-static {v2, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1, v0}, Lyg/b;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    return-object p1

    .line 314
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 315
    .line 316
    new-instance v1, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v2, "Unsupported scheme for location \'"

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v0, "\'."

    .line 330
    .line 331
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LDb/k$x;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
