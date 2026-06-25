.class public Lcom/shopify/reactnative/skia/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Landroid/content/Context;

.field private c:Landroid/media/MediaExtractor;

.field private d:Landroid/media/MediaCodec;

.field private e:Landroid/media/ImageReader;

.field private f:Landroid/view/Surface;

.field private g:Landroid/media/MediaPlayer;

.field private h:D

.field private i:D

.field private j:I

.field private k:I

.field private l:I

.field private m:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/shopify/reactnative/skia/f;->j:I

    .line 6
    .line 7
    iput v0, p0, Lcom/shopify/reactnative/skia/f;->k:I

    .line 8
    .line 9
    iput v0, p0, Lcom/shopify/reactnative/skia/f;->l:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 12
    .line 13
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lcom/shopify/reactnative/skia/f;->a:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/shopify/reactnative/skia/f;->b:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/f;->d()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Lcom/shopify/reactnative/skia/f;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/f;->e(Landroid/media/MediaPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private b()V
    .locals 11

    .line 1
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 7
    .line 8
    const-wide/16 v2, 0x2710

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-ltz v5, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 17
    .line 18
    invoke-virtual {v1, v5}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-virtual {v4, v1, v6}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-gez v7, :cond_0

    .line 30
    .line 31
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 32
    .line 33
    const-wide/16 v8, 0x0

    .line 34
    .line 35
    const/4 v10, 0x4

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v8

    .line 48
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/media/MediaExtractor;->advance()Z

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 61
    .line 62
    invoke-virtual {v1, v0, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ltz v0, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method private c()Z
    .locals 4

    .line 1
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-virtual {v1, v0, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private d()V
    .locals 13

    .line 1
    const-string v0, "rotation-degrees"

    .line 2
    .line 3
    const-string v1, "frame-rate"

    .line 4
    .line 5
    const-string v2, "durationUs"

    .line 6
    .line 7
    new-instance v3, Landroid/media/MediaExtractor;

    .line 8
    .line 9
    invoke-direct {v3}, Landroid/media/MediaExtractor;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v3, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 13
    .line 14
    :try_start_0
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/shopify/reactnative/skia/f;->a:Landroid/net/Uri;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-virtual {v3, v4, v5, v6}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 23
    .line 24
    invoke-direct {p0, v3}, Lcom/shopify/reactnative/skia/f;->f(Landroid/media/MediaExtractor;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ltz v3, :cond_4

    .line 29
    .line 30
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 31
    .line 32
    invoke-virtual {v4, v3}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 33
    .line 34
    .line 35
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, Landroid/media/MediaPlayer;

    .line 42
    .line 43
    invoke-direct {v4}, Landroid/media/MediaPlayer;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v4, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 47
    .line 48
    iget-object v5, p0, Lcom/shopify/reactnative/skia/f;->b:Landroid/content/Context;

    .line 49
    .line 50
    iget-object v7, p0, Lcom/shopify/reactnative/skia/f;->a:Landroid/net/Uri;

    .line 51
    .line 52
    invoke-virtual {v4, v5, v7}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    invoke-virtual {v4, v5}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 59
    .line 60
    .line 61
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 62
    .line 63
    new-instance v5, Lcom/shopify/reactnative/skia/e;

    .line 64
    .line 65
    invoke-direct {v5, p0}, Lcom/shopify/reactnative/skia/e;-><init>(Lcom/shopify/reactnative/skia/f;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    invoke-virtual {v3, v2}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    const-wide/16 v7, 0x3e8

    .line 87
    .line 88
    div-long/2addr v4, v7

    .line 89
    long-to-double v4, v4

    .line 90
    iput-wide v4, p0, Lcom/shopify/reactnative/skia/f;->h:D

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_0
    :goto_0
    invoke-virtual {v3, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    invoke-virtual {v3, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    int-to-double v1, v1

    .line 107
    iput-wide v1, p0, Lcom/shopify/reactnative/skia/f;->i:D

    .line 108
    .line 109
    :cond_1
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_2

    .line 114
    .line 115
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iput v0, p0, Lcom/shopify/reactnative/skia/f;->j:I

    .line 120
    .line 121
    :cond_2
    const-string v0, "width"

    .line 122
    .line 123
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput v0, p0, Lcom/shopify/reactnative/skia/f;->k:I

    .line 128
    .line 129
    const-string v0, "height"

    .line 130
    .line 131
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    iput v8, p0, Lcom/shopify/reactnative/skia/f;->l:I

    .line 136
    .line 137
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 138
    .line 139
    const/16 v1, 0x1d

    .line 140
    .line 141
    if-lt v0, v1, :cond_3

    .line 142
    .line 143
    iget v7, p0, Lcom/shopify/reactnative/skia/f;->k:I

    .line 144
    .line 145
    const/4 v10, 0x2

    .line 146
    const-wide/16 v11, 0x100

    .line 147
    .line 148
    const/16 v9, 0x22

    .line 149
    .line 150
    invoke-static/range {v7 .. v12}, Lcom/shopify/reactnative/skia/b;->a(IIIIJ)Landroid/media/ImageReader;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, Lcom/shopify/reactnative/skia/f;->e:Landroid/media/ImageReader;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    iget v0, p0, Lcom/shopify/reactnative/skia/f;->k:I

    .line 158
    .line 159
    const/16 v1, 0x22

    .line 160
    .line 161
    const/4 v2, 0x2

    .line 162
    invoke-static {v0, v8, v1, v2}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, p0, Lcom/shopify/reactnative/skia/f;->e:Landroid/media/ImageReader;

    .line 167
    .line 168
    :goto_1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->e:Landroid/media/ImageReader;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iput-object v0, p0, Lcom/shopify/reactnative/skia/f;->f:Landroid/view/Surface;

    .line 175
    .line 176
    const-string v0, "mime"

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iput-object v0, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/shopify/reactnative/skia/f;->f:Landroid/view/Surface;

    .line 189
    .line 190
    const/4 v2, 0x0

    .line 191
    invoke-virtual {v0, v3, v1, v6, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 201
    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const-string v2, "No video track found in "

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget-object v2, p0, Lcom/shopify/reactnative/skia/f;->a:Landroid/net/Uri;

    .line 213
    .line 214
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 226
    .line 227
    const-string v2, "Failed to initialize extractor or decoder"

    .line 228
    .line 229
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw v1
.end method

.method private synthetic e(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    iput-wide v0, p0, Lcom/shopify/reactnative/skia/f;->h:D

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 13
    .line 14
    return-void
.end method

.method private f(Landroid/media/MediaExtractor;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "mime"

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "video/"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p1, -0x1

    .line 31
    return p1
.end method


# virtual methods
.method public getDuration()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/shopify/reactnative/skia/f;->h:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getFrameRate()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/shopify/reactnative/skia/f;->i:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getRotationDegrees()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/shopify/reactnative/skia/f;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getSize()Landroid/graphics/Point;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    iget v1, p0, Lcom/shopify/reactnative/skia/f;->k:I

    .line 4
    .line 5
    iget v2, p0, Lcom/shopify/reactnative/skia/f;->l:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public nextImage()Landroid/hardware/HardwareBuffer;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/f;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/f;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->e:Landroid/media/ImageReader;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Lcom/shopify/reactnative/skia/d;->a(Landroid/media/Image;)Landroid/hardware/HardwareBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0}, Landroid/media/Image;->close()V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public play()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/shopify/reactnative/skia/f;->m:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public seek(D)V
    .locals 4

    .line 1
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr v0, p1

    .line 7
    double-to-long v0, v0

    .line 8
    iget-object v2, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-virtual {v2, v0, v1, v3}, Landroid/media/MediaExtractor;->seekTo(JI)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    double-to-int p1, p1

    .line 19
    int-to-long p1, p1

    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-static {v2, p1, p2, v3}, Lcom/shopify/reactnative/skia/c;->a(Landroid/media/MediaPlayer;JI)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lcom/shopify/reactnative/skia/f;->d:Landroid/media/MediaCodec;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/media/MediaCodec;->flush()V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/f;->b()V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lcom/shopify/reactnative/skia/f;->c:Landroid/media/MediaExtractor;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    cmp-long p2, v2, v0

    .line 44
    .line 45
    if-ltz p2, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
.end method

.method public setVolume(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/f;->g:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
