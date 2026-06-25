.class public final LDb/k$U;
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
    iput-object p1, p0, LDb/k$U;->a:LDb/k;

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
    .locals 14

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
    aget-object v1, p1, v0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aget-object p1, p1, v2

    .line 11
    .line 12
    check-cast p1, Lexpo/modules/filesystem/legacy/InfoOptionsLegacy;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "file"

    .line 29
    .line 30
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object v4, p0, LDb/k$U;->a:LDb/k;

    .line 37
    .line 38
    const-string v6, "null cannot be cast to non-null type kotlin.String"

    .line 39
    .line 40
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v1}, LDb/k;->V(LDb/k;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v4, v3

    .line 53
    :goto_0
    iget-object v6, p0, LDb/k$U;->a:LDb/k;

    .line 54
    .line 55
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v7, Lexpo/modules/kotlin/services/FilePermissionService$a;->a:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 59
    .line 60
    invoke-static {v6, v4, v7}, LDb/k;->C(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const-string v6, "md5"

    .line 72
    .line 73
    const-string v7, "size"

    .line 74
    .line 75
    const-string v8, "uri"

    .line 76
    .line 77
    const-string v9, "isDirectory"

    .line 78
    .line 79
    const-string v10, "exists"

    .line 80
    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    iget-object v1, p0, LDb/k$U;->a:LDb/k;

    .line 84
    .line 85
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v4}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    new-instance v0, Landroid/os/Bundle;

    .line 99
    .line 100
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v0, v9, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v0, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, p0, LDb/k$U;->a:LDb/k;

    .line 125
    .line 126
    invoke-static {v2, v1}, LDb/k;->I(LDb/k;Ljava/io/File;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    long-to-double v2, v2

    .line 131
    invoke-virtual {v0, v7, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 135
    .line 136
    .line 137
    move-result-wide v2

    .line 138
    long-to-double v2, v2

    .line 139
    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    mul-double/2addr v2, v4

    .line 145
    const-string v4, "modificationTime"

    .line 146
    .line 147
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/InfoOptionsLegacy;->getMd5()Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    const/4 p1, 0x0

    .line 164
    :goto_1
    if-eqz p1, :cond_2

    .line 165
    .line 166
    iget-object p1, p0, LDb/k$U;->a:LDb/k;

    .line 167
    .line 168
    invoke-static {p1, v1}, LDb/k;->S(LDb/k;Ljava/io/File;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v0, v6, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    return-object v0

    .line 176
    :cond_3
    new-instance p1, Landroid/os/Bundle;

    .line 177
    .line 178
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v10, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v9, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_4
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const-string v5, "content"

    .line 193
    .line 194
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    const-string v11, "asset"

    .line 199
    .line 200
    if-nez v4, :cond_6

    .line 201
    .line 202
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v4, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-nez v4, :cond_6

    .line 211
    .line 212
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    if-nez v4, :cond_5

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 220
    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const-string v1, "Unsupported scheme for location \'"

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v1, "\'."

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_6
    :goto_2
    :try_start_0
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-eqz v4, :cond_a

    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    const v13, 0x58ceaf0

    .line 258
    .line 259
    .line 260
    if-eq v12, v13, :cond_8

    .line 261
    .line 262
    const v11, 0x38b73479

    .line 263
    .line 264
    .line 265
    if-eq v12, v11, :cond_7

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_7
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-eqz v4, :cond_a

    .line 273
    .line 274
    iget-object v1, p0, LDb/k$U;->a:LDb/k;

    .line 275
    .line 276
    invoke-static {v1}, LDb/k;->G(LDb/k;)Landroid/content/Context;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v1, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    goto :goto_4

    .line 289
    :cond_8
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-nez v4, :cond_9

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_9
    iget-object v1, p0, LDb/k$U;->a:LDb/k;

    .line 297
    .line 298
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v1, v3}, LDb/k;->T(LDb/k;Landroid/net/Uri;)Ljava/io/InputStream;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    goto :goto_4

    .line 306
    :cond_a
    :goto_3
    iget-object v4, p0, LDb/k$U;->a:LDb/k;

    .line 307
    .line 308
    invoke-static {v4, v1}, LDb/k;->U(LDb/k;Ljava/lang/String;)Ljava/io/InputStream;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    :goto_4
    if-eqz v1, :cond_c

    .line 313
    .line 314
    new-instance v4, Landroid/os/Bundle;

    .line 315
    .line 316
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v9, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v4, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    int-to-double v2, v2

    .line 337
    invoke-virtual {v4, v7, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/InfoOptionsLegacy;->getMd5()Ljava/lang/Boolean;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    if-eqz p1, :cond_b

    .line 351
    .line 352
    invoke-static {v1}, Lxg/a;->d(Ljava/io/InputStream;)[B

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-static {p1}, Lwg/a;->a([B)[C

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    const-string v1, "encodeHex(...)"

    .line 361
    .line 362
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v1, Ljava/lang/String;

    .line 366
    .line 367
    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([C)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :cond_b
    return-object v4

    .line 374
    :cond_c
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 375
    .line 376
    invoke-direct {p1}, Ljava/io/FileNotFoundException;-><init>()V

    .line 377
    .line 378
    .line 379
    throw p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 380
    :catch_0
    new-instance p1, Landroid/os/Bundle;

    .line 381
    .line 382
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1, v10, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v9, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 389
    .line 390
    .line 391
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LDb/k$U;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
