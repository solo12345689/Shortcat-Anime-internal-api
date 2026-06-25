.class public final LFb/c$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFb/c;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LFb/c;


# direct methods
.method public constructor <init>(LFb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LFb/c$c;->a:LFb/c;

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
    .locals 10

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
    aget-object p1, p1, v2

    .line 16
    .line 17
    check-cast p1, Lexpo/modules/font/RenderToImageOptions;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    sget-object v3, LX6/a;->c:LX6/a$b;

    .line 22
    .line 23
    invoke-virtual {v3}, LX6/a$b;->c()LX6/a;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p1}, Lexpo/modules/font/RenderToImageOptions;->getFontFamily()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v5, p0, LFb/c$c;->a:LFb/c;

    .line 32
    .line 33
    invoke-static {v5}, LFb/c;->x(LFb/c;)Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v3, v4, v0, v5}, LX6/a;->d(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v3, p0, LFb/c$c;->a:LFb/c;

    .line 46
    .line 47
    invoke-static {v3}, LFb/c;->x(LFb/c;)Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 60
    .line 61
    invoke-virtual {p1}, Lexpo/modules/font/RenderToImageOptions;->getSize()F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    mul-float/2addr v4, v3

    .line 66
    invoke-virtual {p1}, Lexpo/modules/font/RenderToImageOptions;->getLineHeight()Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const/4 v6, 0x0

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    mul-float/2addr v5, v3

    .line 78
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move-object v5, v6

    .line 84
    :goto_0
    new-instance v7, Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lexpo/modules/font/RenderToImageOptions;->getColor()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    float-to-double v8, v0

    .line 114
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    double-to-float v0, v8

    .line 119
    float-to-int v0, v0

    .line 120
    if-eqz v5, :cond_1

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_1
    float-to-int v2, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_1
    iget v2, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 129
    .line 130
    iget v4, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 131
    .line 132
    sub-float/2addr v2, v4

    .line 133
    float-to-double v8, v2

    .line 134
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v8

    .line 138
    double-to-float v2, v8

    .line 139
    goto :goto_1

    .line 140
    :goto_2
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 141
    .line 142
    invoke-static {v0, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v2, "createBitmap(...)"

    .line 147
    .line 148
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v2, Landroid/graphics/Canvas;

    .line 152
    .line 153
    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 154
    .line 155
    .line 156
    if-eqz v5, :cond_2

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    iget v5, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 163
    .line 164
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 165
    .line 166
    sub-float/2addr v5, p1

    .line 167
    sub-float/2addr v4, v5

    .line 168
    const/high16 v5, 0x40000000    # 2.0f

    .line 169
    .line 170
    div-float/2addr v4, v5

    .line 171
    sub-float/2addr v4, p1

    .line 172
    goto :goto_3

    .line 173
    :cond_2
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 174
    .line 175
    neg-float v4, p1

    .line 176
    :goto_3
    const/4 p1, 0x0

    .line 177
    invoke-virtual {v2, v1, p1, v4, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 178
    .line 179
    .line 180
    new-instance p1, Ljava/io/File;

    .line 181
    .line 182
    iget-object v1, p0, LFb/c$c;->a:LFb/c;

    .line 183
    .line 184
    invoke-static {v1}, LFb/c;->x(LFb/c;)Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    new-instance v4, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v2, ".png"

    .line 205
    .line 206
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-direct {p1, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 217
    .line 218
    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    .line 220
    .line 221
    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 222
    .line 223
    const/16 v4, 0x64

    .line 224
    .line 225
    invoke-virtual {v0, v2, v4, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    .line 227
    .line 228
    :try_start_2
    invoke-static {v1, v6}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    const-string v1, "uri"

    .line 232
    .line 233
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-string v2, "width"

    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    int-to-float v4, v4

    .line 252
    div-float/2addr v4, v3

    .line 253
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-static {v2, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const-string v4, "height"

    .line 262
    .line 263
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    int-to-float v0, v0

    .line 268
    div-float/2addr v0, v3

    .line 269
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v4, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const-string v4, "scale"

    .line 278
    .line 279
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    filled-new-array {v1, v2, v0, v3}, [Lkotlin/Pair;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-interface {p2, v0}, LUb/u;->f(Ljava/util/Map;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :catch_0
    move-exception v0

    .line 300
    goto :goto_4

    .line 301
    :catchall_0
    move-exception v0

    .line 302
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 303
    :catchall_1
    move-exception v2

    .line 304
    :try_start_4
    invoke-static {v1, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 308
    :goto_4
    new-instance v1, LFb/d;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const-string v2, "getAbsolutePath(...)"

    .line 315
    .line 316
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v1, p1, v0}, LFb/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {p2, v1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 323
    .line 324
    .line 325
    return-void
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
    invoke-virtual {p0, p1, p2}, LFb/c$c;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
