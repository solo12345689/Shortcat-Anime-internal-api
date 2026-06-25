.class public final Lcom/facebook/react/modules/network/NetworkingModule$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/modules/network/NetworkingModule;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/NetworkingModule;ILcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->e:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->g:Z

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public h(Ldg/e;Ldg/E;)V
    .locals 9

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getShuttingDown$p(Lcom/facebook/react/modules/network/NetworkingModule;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 22
    .line 23
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 24
    .line 25
    invoke-static {p1, v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$removeRequest(Lcom/facebook/react/modules/network/NetworkingModule;I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 29
    .line 30
    iget v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p2}, Ldg/E;->b()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    sget-object p1, Lv7/e;->a:Lv7/e;

    .line 41
    .line 42
    invoke-virtual {p2}, Ldg/E;->g()Ldg/t;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lv7/e;->a(Ldg/t;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p2}, Ldg/E;->a()Ldg/F;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Ldg/F;->h()J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-wide/16 v7, 0x0

    .line 62
    .line 63
    :goto_0
    invoke-static/range {v1 .. v8}, Lv7/e;->j(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;ILjava/util/Map;J)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p2}, Ldg/E;->a()Ldg/F;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v0, 0x0

    .line 71
    if-nez p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 74
    .line 75
    iget p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 76
    .line 77
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 78
    .line 79
    const-string v2, "Response body is null"

    .line 80
    .line 81
    invoke-static {p1, p2, v1, v2, v0}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_0
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_2
    const-string v1, "gzip"

    .line 90
    .line 91
    const-string v2, "Content-Encoding"

    .line 92
    .line 93
    const/4 v3, 0x2

    .line 94
    invoke-static {p2, v2, v0, v3, v0}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const/4 v4, 0x1

    .line 99
    invoke-static {v1, v2, v4}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    new-instance v1, Ltg/t;

    .line 106
    .line 107
    invoke-virtual {p1}, Ldg/F;->k()Ltg/j;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-direct {v1, p1}, Ltg/t;-><init>(Ltg/Z;)V

    .line 112
    .line 113
    .line 114
    const-string p1, "Content-Type"

    .line 115
    .line 116
    invoke-static {p2, p1, v0, v3, v0}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    sget-object v0, Ldg/x;->e:Ldg/x$a;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :cond_3
    sget-object p1, Ldg/F;->a:Ldg/F$a;

    .line 129
    .line 130
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2, v1}, Ltg/b;->b(Ltg/Z;)Ltg/j;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const-wide/16 v5, -0x1

    .line 139
    .line 140
    invoke-virtual {p1, v0, v5, v6, v1}, Ldg/F$a;->a(Ldg/x;JLtg/j;)Ldg/F;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_4
    if-eqz p1, :cond_a

    .line 145
    .line 146
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 147
    .line 148
    invoke-static {v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getResponseHandlers$p(Lcom/facebook/react/modules/network/NetworkingModule;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lcom/facebook/react/modules/network/NetworkingModule$c;

    .line 167
    .line 168
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 169
    .line 170
    invoke-interface {v1, v2}, Lcom/facebook/react/modules/network/NetworkingModule$c;->b(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_5

    .line 175
    .line 176
    invoke-virtual {p1}, Ldg/F;->b()[B

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-interface {v1, p2}, Lcom/facebook/react/modules/network/NetworkingModule$c;->a([B)Lcom/facebook/react/bridge/WritableMap;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 185
    .line 186
    iget v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 187
    .line 188
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v1, v2, v3, v0, p2}, Lv7/e;->c(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;[B)V

    .line 191
    .line 192
    .line 193
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 194
    .line 195
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 196
    .line 197
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1}, Ldg/F;->h()J

    .line 200
    .line 201
    .line 202
    move-result-wide v2

    .line 203
    invoke-static {p2, v0, v1, v2, v3}, Lv7/e;->i(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_6
    iget-boolean v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->g:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    .line 209
    const-string v1, "text"

    .line 210
    .line 211
    if-eqz v0, :cond_7

    .line 212
    .line 213
    :try_start_1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_7

    .line 220
    .line 221
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 222
    .line 223
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 224
    .line 225
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {p2, v0, v1, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$readWithProgress(Lcom/facebook/react/modules/network/NetworkingModule;ILjava/lang/String;Ldg/F;)V

    .line 228
    .line 229
    .line 230
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 231
    .line 232
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 233
    .line 234
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p1}, Ldg/F;->h()J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    invoke-static {p2, v0, v1, v2, v3}, Lv7/e;->i(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_7
    const-string v2, ""

    .line 245
    .line 246
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 252
    if-eqz v0, :cond_8

    .line 253
    .line 254
    :try_start_2
    invoke-virtual {p1}, Ldg/F;->l()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 258
    goto :goto_1

    .line 259
    :catch_1
    move-exception v0

    .line 260
    :try_start_3
    invoke-virtual {p2}, Ldg/E;->h()Ldg/C;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-virtual {p2}, Ldg/C;->c()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    const-string v1, "HEAD"

    .line 269
    .line 270
    invoke-static {p2, v1, v4}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-nez p2, :cond_9

    .line 275
    .line 276
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 277
    .line 278
    iget v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 279
    .line 280
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-static {p2, v1, v3, v4, v0}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_8
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 291
    .line 292
    const-string v0, "base64"

    .line 293
    .line 294
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p2

    .line 298
    if-eqz p2, :cond_9

    .line 299
    .line 300
    invoke-virtual {p1}, Ldg/F;->b()[B

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-static {p2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    :cond_9
    :goto_1
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 309
    .line 310
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 311
    .line 312
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 313
    .line 314
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->f:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {p2, v0, v1, v2, v3}, Lv7/e;->d(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 320
    .line 321
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 322
    .line 323
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {p1}, Ldg/F;->h()J

    .line 326
    .line 327
    .line 328
    move-result-wide v2

    .line 329
    invoke-static {p2, v0, v1, v2, v3}, Lv7/e;->i(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_a
    const-string p1, "Required value was null."

    .line 334
    .line 335
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 336
    .line 337
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 341
    :goto_2
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 342
    .line 343
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 344
    .line 345
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-static {p2, v0, v1, v2, p1}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    :goto_3
    return-void
.end method

.method public j(Ldg/e;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "e"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getShuttingDown$p(Lcom/facebook/react/modules/network/NetworkingModule;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 21
    .line 22
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 23
    .line 24
    invoke-static {p1, v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$removeRequest(Lcom/facebook/react/modules/network/NetworkingModule;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "Error while executing request: "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 59
    .line 60
    iget v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->b:I

    .line 61
    .line 62
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$g;->d:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1, v2, p1, p2}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
