.class public final LDb/k$u0;
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
    iput-object p1, p0, LDb/k$u0;->a:LDb/k;

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
    .locals 13

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v1, p1, v0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aget-object v3, p1, v2

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    aget-object v4, p1, v4

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    aget-object v5, p1, v5

    .line 22
    .line 23
    const/4 v6, 0x4

    .line 24
    aget-object p1, p1, v6

    .line 25
    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    move-object v7, v5

    .line 29
    check-cast v7, Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;

    .line 30
    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v5, p0, LDb/k$u0;->a:LDb/k;

    .line 46
    .line 47
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v3}, LDb/k;->x(LDb/k;Landroid/net/Uri;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v6, "file"

    .line 58
    .line 59
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_5

    .line 64
    .line 65
    new-instance v5, LDb/k$n;

    .line 66
    .line 67
    iget-object v6, p0, LDb/k$u0;->a:LDb/k;

    .line 68
    .line 69
    invoke-direct {v5, p1, v4, v6}, LDb/k$n;-><init>(Ljava/lang/String;Ljava/lang/String;LDb/k;)V

    .line 70
    .line 71
    .line 72
    iget-object v6, p0, LDb/k$u0;->a:LDb/k;

    .line 73
    .line 74
    invoke-static {v6}, LDb/k;->O(LDb/k;)Ldg/A;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/4 v12, 0x0

    .line 79
    if-eqz v6, :cond_0

    .line 80
    .line 81
    invoke-virtual {v6}, Ldg/A;->F()Ldg/A$a;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-eqz v6, :cond_0

    .line 86
    .line 87
    new-instance v8, LDb/k$J0;

    .line 88
    .line 89
    invoke-direct {v8, v5}, LDb/k$J0;-><init>(LDb/k$c;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v8}, Ldg/A$a;->a(Ldg/v;)Ldg/A$a;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eqz v5, :cond_0

    .line 97
    .line 98
    invoke-virtual {v5}, Ldg/A$a;->c()Ldg/A;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object v5, v12

    .line 104
    :goto_0
    if-nez v5, :cond_1

    .line 105
    .line 106
    new-instance p1, LDb/m;

    .line 107
    .line 108
    invoke-direct {p1}, LDb/m;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2, p1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    new-instance v6, Ldg/C$a;

    .line 116
    .line 117
    invoke-direct {v6}, Ldg/C$a;-><init>()V

    .line 118
    .line 119
    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    new-instance v8, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v9, "bytes="

    .line 128
    .line 129
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v9, "-"

    .line 136
    .line 137
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    const-string v9, "Range"

    .line 145
    .line 146
    invoke-virtual {v6, v9, v8}, Ldg/C$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 147
    .line 148
    .line 149
    :cond_2
    invoke-virtual {v7}, Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;->getHeaders()Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    if-eqz v8, :cond_3

    .line 154
    .line 155
    invoke-virtual {v7}, Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;->getHeaders()Ljava/util/Map;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_3

    .line 172
    .line 173
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    check-cast v10, Ljava/lang/String;

    .line 184
    .line 185
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    check-cast v9, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v6, v10, v9}, Ldg/C$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_3
    invoke-virtual {v6, v1}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ldg/C$a;->b()Ldg/C;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v5, v1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    iget-object v1, p0, LDb/k$u0;->a:LDb/k;

    .line 208
    .line 209
    invoke-static {v1}, LDb/k;->Q(LDb/k;)Ljava/util/Map;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    new-instance v5, LDb/k$b;

    .line 214
    .line 215
    invoke-direct {v5, v3, v8}, LDb/k$b;-><init>(Landroid/net/Uri;Ldg/e;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    new-instance v6, LDb/k$a;

    .line 222
    .line 223
    iget-object v1, p0, LDb/k$u0;->a:LDb/k;

    .line 224
    .line 225
    invoke-static {v1, v3}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    if-eqz p1, :cond_4

    .line 230
    .line 231
    move v10, v2

    .line 232
    :goto_2
    move-object v11, p2

    .line 233
    goto :goto_3

    .line 234
    :cond_4
    move v10, v0

    .line 235
    goto :goto_2

    .line 236
    :goto_3
    invoke-direct/range {v6 .. v11}, LDb/k$a;-><init>(Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;Ldg/e;Ljava/io/File;ZLUb/u;)V

    .line 237
    .line 238
    .line 239
    iget-object p1, p0, LDb/k$u0;->a:LDb/k;

    .line 240
    .line 241
    invoke-static {p1}, LDb/k;->M(LDb/k;)LGf/O;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v3, LDb/k$m;

    .line 246
    .line 247
    iget-object p1, p0, LDb/k$u0;->a:LDb/k;

    .line 248
    .line 249
    invoke-direct {v3, p1, v6, v12}, LDb/k$m;-><init>(LDb/k;LDb/k$a;LZd/e;)V

    .line 250
    .line 251
    .line 252
    const/4 v4, 0x3

    .line 253
    const/4 v5, 0x0

    .line 254
    const/4 v1, 0x0

    .line 255
    const/4 v2, 0x0

    .line 256
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 261
    .line 262
    new-instance p2, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const-string v0, "Unsupported scheme for location \'"

    .line 268
    .line 269
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v0, "\'."

    .line 276
    .line 277
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p1
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
    invoke-virtual {p0, p1, p2}, LDb/k$u0;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
