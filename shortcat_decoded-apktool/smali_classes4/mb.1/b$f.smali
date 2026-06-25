.class final Lmb/b$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb/b;->B(LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/net/URI;

.field final synthetic c:Lmb/b;

.field final synthetic d:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/net/URI;Lmb/b;Ljava/io/File;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 2
    .line 3
    iput-object p2, p0, Lmb/b$f;->c:Lmb/b;

    .line 4
    .line 5
    iput-object p3, p0, Lmb/b$f;->d:Ljava/io/File;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, Lmb/b$f;

    .line 2
    .line 3
    iget-object v0, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 4
    .line 5
    iget-object v1, p0, Lmb/b$f;->c:Lmb/b;

    .line 6
    .line 7
    iget-object v2, p0, Lmb/b$f;->d:Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lmb/b$f;-><init>(Ljava/net/URI;Lmb/b;Ljava/io/File;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmb/b$f;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lmb/b$f;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lmb/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lmb/b$f;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "toString(...)"

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lmb/b$f;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_4

    .line 9
    .line 10
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object p1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ":"

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {p1, v1, v3, v2, v4}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lmb/b$f;->c:Lmb/b;

    .line 34
    .line 35
    invoke-static {p1}, Lmb/b;->z(Lmb/b;)Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1}, Lmb/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "file:///android_res/"

    .line 63
    .line 64
    invoke-static {p1, v1, v3, v2, v4}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, Lmb/b$f;->c:Lmb/b;

    .line 71
    .line 72
    invoke-static {p1}, Lmb/b;->z(Lmb/b;)Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v1}, Lmb/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance p1, Ldg/C$a;

    .line 91
    .line 92
    invoke-direct {p1}, Ldg/C$a;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v5, "toURL(...)"

    .line 102
    .line 103
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Ldg/C$a;->n(Ljava/net/URL;)Ldg/C$a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ldg/C$a;->b()Ldg/C;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {}, Lv7/f;->f()Ldg/A;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1, p1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Ldg/e;->b()Ldg/E;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {p1}, Ldg/E;->J()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_3

    .line 135
    .line 136
    if-eqz v1, :cond_3

    .line 137
    .line 138
    invoke-virtual {v1}, Ldg/F;->a()Ljava/io/InputStream;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_0
    iget-object v1, p0, Lmb/b$f;->d:Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    :try_start_1
    new-instance v5, Ljava/io/FileOutputStream;

    .line 145
    .line 146
    invoke-direct {v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    .line 148
    .line 149
    :try_start_2
    invoke-static {p1, v5, v3, v2, v4}, Lfe/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    const-wide/16 v6, 0x0

    .line 154
    .line 155
    cmp-long v2, v2, v6

    .line 156
    .line 157
    if-nez v2, :cond_2

    .line 158
    .line 159
    const-string v2, "ExpoAsset"

    .line 160
    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v6, "Asset downloaded to "

    .line 167
    .line 168
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, " is empty. It might be conflicting with another asset, or corrupted."

    .line 175
    .line 176
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :catchall_0
    move-exception v1

    .line 188
    goto :goto_2

    .line 189
    :cond_2
    :goto_1
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    :try_start_3
    invoke-static {v5, v4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 192
    .line 193
    .line 194
    :try_start_4
    invoke-static {p1, v4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lmb/b$f;->d:Ljava/io/File;

    .line 198
    .line 199
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 200
    .line 201
    .line 202
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 203
    return-object p1

    .line 204
    :catchall_1
    move-exception v1

    .line 205
    goto :goto_3

    .line 206
    :goto_2
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 207
    :catchall_2
    move-exception v2

    .line 208
    :try_start_6
    invoke-static {v5, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 212
    :goto_3
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 213
    :catchall_3
    move-exception v2

    .line 214
    :try_start_8
    invoke-static {p1, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    throw v2

    .line 218
    :cond_3
    invoke-virtual {p1}, Ldg/E;->close()V

    .line 219
    .line 220
    .line 221
    new-instance v1, Ljava/lang/Exception;

    .line 222
    .line 223
    invoke-virtual {p1}, Ldg/E;->o()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    iget-object v2, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 228
    .line 229
    new-instance v3, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v4, "HTTP "

    .line 235
    .line 236
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string p1, " for "

    .line 243
    .line 244
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 258
    :catch_0
    new-instance p1, Lmb/f;

    .line 259
    .line 260
    iget-object v1, p0, Lmb/b$f;->b:Ljava/net/URI;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-direct {p1, v1}, Lmb/f;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw p1

    .line 273
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 276
    .line 277
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw p1
.end method
