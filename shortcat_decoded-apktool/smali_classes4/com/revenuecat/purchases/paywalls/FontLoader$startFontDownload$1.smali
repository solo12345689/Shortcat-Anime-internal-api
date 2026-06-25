.class final Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/paywalls/FontLoader;->startFontDownload(Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LGf/O;",
        "LTd/L;",
        "<anonymous>",
        "(LGf/O;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1"
    f = "FontLoader.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $expectedMd5:Ljava/lang/String;

.field final synthetic $fontInfo:Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

.field final synthetic $url:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/FontLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$expectedMd5:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$fontInfo:Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LZd/e;",
            ")",
            "LZd/e;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$expectedMd5:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$fontInfo:Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;-><init>(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGf/O;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getCacheDirectory(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const/4 p1, 0x0

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "[Purchases] - ERROR"

    .line 25
    .line 26
    const-string v2, "Cannot download font: cache directory is not available"

    .line 27
    .line 28
    invoke-interface {v0, v1, v2, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, LTd/L;->a:LTd/L;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 35
    .line 36
    invoke-static {v0, v5}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$ensureFoldersExist(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/io/File;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    sget-object p1, LTd/L;->a:LTd/L;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v2, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "getBytes(...)"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$md5Hex(Lcom/revenuecat/purchases/paywalls/FontLoader;[B)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 65
    .line 66
    const-string v1, ""

    .line 67
    .line 68
    const/16 v2, 0x2e

    .line 69
    .line 70
    invoke-static {v0, v2, v1}, LDf/r;->X0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v0, Ljava/io/File;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 98
    .line 99
    invoke-static {v1}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getLock$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 104
    .line 105
    iget-object v6, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$fontInfo:Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

    .line 106
    .line 107
    iget-object v7, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 108
    .line 109
    monitor-enter v1

    .line 110
    :try_start_0
    invoke-static {v2}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getFontInfosForHash$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Ljava/util/Set;

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    invoke-static {v2}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getFontInfosForHash$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    filled-new-array {v6}, [Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v6}, LUd/a0;->f([Ljava/lang/Object;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 138
    .line 139
    monitor-exit v1

    .line 140
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_2

    .line 145
    .line 146
    iget-object p1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 147
    .line 148
    invoke-static {p1, v3, v0}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$addFileToCache(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/lang/String;Ljava/io/File;)V

    .line 149
    .line 150
    .line 151
    sget-object p1, LTd/L;->a:LTd/L;

    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 155
    .line 156
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$expectedMd5:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static/range {v0 .. v5}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$performDownloadAndCache-yxL6bBk(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 165
    .line 166
    invoke-static {v0}, LTd/u;->h(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_3

    .line 171
    .line 172
    move-object v2, v0

    .line 173
    check-cast v2, Ljava/io/File;

    .line 174
    .line 175
    invoke-static {v1, v3, v2}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$addFileToCache(Lcom/revenuecat/purchases/paywalls/FontLoader;Ljava/lang/String;Ljava/io/File;)V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    move-object p1, v0

    .line 181
    goto :goto_2

    .line 182
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$fontInfo:Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;

    .line 183
    .line 184
    invoke-static {v0}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-eqz v0, :cond_4

    .line 189
    .line 190
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v2, "[Purchases] - ERROR"

    .line 195
    .line 196
    new-instance v4, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v5, "Failed to download font for "

    .line 202
    .line 203
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;->getFamily()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-interface {v0, v2, v1, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    .line 219
    .line 220
    :cond_4
    iget-object p1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 221
    .line 222
    invoke-static {p1}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getLock$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 227
    .line 228
    monitor-enter p1

    .line 229
    :try_start_2
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getFontInfosForHash$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    .line 239
    :goto_1
    monitor-exit p1

    .line 240
    goto :goto_3

    .line 241
    :catchall_1
    move-exception v0

    .line 242
    monitor-exit p1

    .line 243
    throw v0

    .line 244
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->$url:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const-string v2, "[Purchases] - ERROR"

    .line 251
    .line 252
    new-instance v4, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v5, "Error downloading remote font from "

    .line 258
    .line 259
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-interface {v1, v2, v0, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 270
    .line 271
    .line 272
    iget-object p1, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 273
    .line 274
    invoke-static {p1}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getLock$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 279
    .line 280
    monitor-enter p1

    .line 281
    :try_start_4
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getFontInfosForHash$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/util/Map;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/util/Set;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 293
    .line 294
    return-object p1

    .line 295
    :catchall_2
    move-exception v0

    .line 296
    monitor-exit p1

    .line 297
    throw v0

    .line 298
    :catchall_3
    move-exception v0

    .line 299
    move-object p1, v0

    .line 300
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 301
    .line 302
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getLock$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/FontLoader$startFontDownload$1;->this$0:Lcom/revenuecat/purchases/paywalls/FontLoader;

    .line 307
    .line 308
    monitor-enter v1

    .line 309
    :try_start_5
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/FontLoader;->access$getFontInfosForHash$p(Lcom/revenuecat/purchases/paywalls/FontLoader;)Ljava/util/Map;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Ljava/util/Set;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 318
    .line 319
    monitor-exit v1

    .line 320
    throw p1

    .line 321
    :catchall_4
    move-exception v0

    .line 322
    move-object p1, v0

    .line 323
    monitor-exit v1

    .line 324
    throw p1

    .line 325
    :catchall_5
    move-exception v0

    .line 326
    move-object p1, v0

    .line 327
    goto :goto_4

    .line 328
    :cond_5
    :try_start_6
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    .line 329
    .line 330
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-gtz v2, :cond_6

    .line 345
    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const-string v3, "[Purchases] - "

    .line 352
    .line 353
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v3, "Font download already in progress for "

    .line 373
    .line 374
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-interface {v0, p1, v2}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :cond_6
    invoke-interface {v8, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 391
    .line 392
    monitor-exit v1

    .line 393
    return-object p1

    .line 394
    :goto_4
    monitor-exit v1

    .line 395
    throw p1

    .line 396
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 399
    .line 400
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw p1
.end method
