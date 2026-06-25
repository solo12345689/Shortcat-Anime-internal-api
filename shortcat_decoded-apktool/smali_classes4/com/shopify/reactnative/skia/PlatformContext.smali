.class public Lcom/shopify/reactnative/skia/PlatformContext;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactContext;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/Handler;

.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "PlatformContext"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->b:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->c:Landroid/os/Handler;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/PlatformContext;->initHybrid(F)Lcom/facebook/jni/HybridData;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic a(Lcom/shopify/reactnative/skia/PlatformContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/PlatformContext;->notifyTaskReadyNative()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic b(Lcom/shopify/reactnative/skia/PlatformContext;)Lcom/facebook/react/bridge/ReactContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    return-object p0
.end method

.method private c(Ljava/io/InputStream;)[B
    .locals 6

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x1000

    .line 7
    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    invoke-virtual {p1, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, -0x1

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method private native initHybrid(F)Lcom/facebook/jni/HybridData;
.end method

.method private native notifyTaskReadyNative()V
.end method


# virtual methods
.method public createVideo(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/shopify/reactnative/skia/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lcom/shopify/reactnative/skia/f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method protected finalize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getJniStreamFromSource(Ljava/lang/String;)[B
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "drawable"

    .line 14
    .line 15
    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "raw"

    .line 34
    .line 35
    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/PlatformContext;->c(Ljava/io/InputStream;)[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_1
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 76
    .line 77
    .line 78
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/16 v1, 0x2000

    .line 85
    .line 86
    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, v0}, Lcom/shopify/reactnative/skia/PlatformContext;->c(Ljava/io/InputStream;)[B

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :catch_0
    move-exception p1

    .line 95
    goto :goto_0

    .line 96
    :catch_1
    move-exception p1

    .line 97
    goto :goto_1

    .line 98
    :catch_2
    move-exception p1

    .line 99
    goto :goto_2

    .line 100
    :catch_3
    move-exception p1

    .line 101
    goto :goto_3

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 103
    .line 104
    const-string v0, "Invalid URI scheme"

    .line 105
    .line 106
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    :goto_4
    const/4 p1, 0x0

    .line 126
    return-object p1
.end method

.method public notifyTaskReady()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/PlatformContext;->notifyTaskReadyNative()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->c:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lcom/shopify/reactnative/skia/a;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lcom/shopify/reactnative/skia/a;-><init>(Lcom/shopify/reactnative/skia/PlatformContext;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public raise(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/shopify/reactnative/skia/PlatformContext$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/shopify/reactnative/skia/PlatformContext$a;-><init>(Lcom/shopify/reactnative/skia/PlatformContext;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method takeScreenshotFromViewTag(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/shopify/reactnative/skia/n;->k(Lcom/facebook/react/bridge/ReactContext;I)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
