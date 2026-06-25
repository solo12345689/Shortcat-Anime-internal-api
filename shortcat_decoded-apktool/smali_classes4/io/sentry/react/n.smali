.class public Lio/sentry/react/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final o:Lio/sentry/ILogger;

.field private static final p:Lio/sentry/android/core/g0;

.field private static final q:Ljava/nio/charset/Charset;

.field static r:J


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:Landroid/content/pm/PackageInfo;

.field private c:Landroidx/core/app/FrameMetricsAggregator;

.field private d:Z

.field private e:I

.field private f:Lio/sentry/android/core/M;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lio/sentry/d0;

.field private final k:Ljava/lang/Runnable;

.field private l:J

.field private final m:Lio/sentry/p2;

.field private final n:Lio/sentry/util/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/core/z;

    .line 2
    .line 3
    const-string v1, "RNSentry"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 9
    .line 10
    new-instance v1, Lio/sentry/android/core/g0;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lio/sentry/android/core/g0;-><init>(Lio/sentry/ILogger;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Lio/sentry/react/n;->p:Lio/sentry/android/core/g0;

    .line 16
    .line 17
    const-string v0, "UTF-8"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lio/sentry/react/n;->q:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    sput-wide v0, Lio/sentry/react/n;->r:J

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 6
    .line 7
    const/16 v1, 0x65

    .line 8
    .line 9
    iput v1, p0, Lio/sentry/react/n;->e:I

    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/react/n;->f:Lio/sentry/android/core/M;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lio/sentry/react/n;->g:Z

    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/react/n;->h:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/react/n;->i:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/react/n;->j:Lio/sentry/d0;

    .line 21
    .line 22
    const-wide/32 v0, 0x500000

    .line 23
    .line 24
    .line 25
    iput-wide v0, p0, Lio/sentry/react/n;->l:J

    .line 26
    .line 27
    invoke-static {p1}, Lio/sentry/react/n;->S(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lio/sentry/react/n;->b:Landroid/content/pm/PackageInfo;

    .line 32
    .line 33
    iput-object p1, p0, Lio/sentry/react/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 34
    .line 35
    invoke-direct {p0}, Lio/sentry/react/n;->x()Ljava/lang/Runnable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lio/sentry/react/n;->k:Ljava/lang/Runnable;

    .line 40
    .line 41
    new-instance p1, Lio/sentry/android/core/Z0;

    .line 42
    .line 43
    invoke-direct {p1}, Lio/sentry/android/core/Z0;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lio/sentry/react/n;->m:Lio/sentry/p2;

    .line 47
    .line 48
    new-instance p1, Lio/sentry/util/s;

    .line 49
    .line 50
    invoke-direct {p1}, Lio/sentry/util/s;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lio/sentry/react/n;->n:Lio/sentry/util/s;

    .line 54
    .line 55
    return-void
.end method

.method private O()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static S(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    sget-object p0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 16
    .line 17
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 18
    .line 19
    const-string v2, "Error getting package info."

    .line 20
    .line 21
    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private T()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "sentry/react"

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lio/sentry/react/n;->i:Ljava/lang/String;

    .line 25
    .line 26
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    iget-object v1, p0, Lio/sentry/react/n;->i:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "profiling_trace"

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method private U()Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/sentry/react/n;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/react/n;->h:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lio/sentry/react/n;->g:Z

    .line 10
    .line 11
    new-instance v0, Lio/sentry/android/core/internal/debugmeta/a;

    .line 12
    .line 13
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/internal/debugmeta/a;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/sentry/android/core/internal/debugmeta/a;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/util/Properties;

    .line 46
    .line 47
    invoke-static {v2}, Lio/sentry/util/d;->m(Ljava/util/Properties;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lio/sentry/react/n;->h:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 56
    .line 57
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v4, "Proguard uuid found: "

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Lio/sentry/react/n;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-array v3, v3, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lio/sentry/react/n;->h:Ljava/lang/String;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 87
    .line 88
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 89
    .line 90
    const-string v4, "No proguard uuid found in debug meta properties file!"

    .line 91
    .line 92
    new-array v3, v3, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v1
.end method

.method private V()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object v0
.end method

.method private W(Lcom/facebook/react/bridge/ReadableMap;)Lio/sentry/B3;
    .locals 8

    .line 1
    new-instance v0, Lio/sentry/protocol/r;

    .line 2
    .line 3
    const-string v1, "sentry.javascript.react-native"

    .line 4
    .line 5
    const-string v2, "7.11.0"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lio/sentry/B3;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, v0}, Lio/sentry/B3;-><init>(ZLio/sentry/protocol/r;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "replaysSessionSampleRate"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, "replaysOnErrorSampleRate"

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v0, v5

    .line 50
    :goto_0
    invoke-virtual {v1, v0}, Lio/sentry/B3;->N(Ljava/lang/Double;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :cond_2
    invoke-virtual {v1, v5}, Lio/sentry/B3;->J(Ljava/lang/Double;)V

    .line 68
    .line 69
    .line 70
    const-string v0, "replaysSessionQuality"

    .line 71
    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p0, v0}, Lio/sentry/react/n;->j0(Ljava/lang/String;)Lio/sentry/B3$a;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v1, v0}, Lio/sentry/B3;->K(Lio/sentry/B3$a;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    const-string v0, "mobileReplayOptions"

    .line 90
    .line 91
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    :goto_1
    return-object v1

    .line 105
    :cond_5
    const-string v0, "maskAllText"

    .line 106
    .line 107
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v4, 0x1

    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move v0, v2

    .line 122
    goto :goto_3

    .line 123
    :cond_7
    :goto_2
    move v0, v4

    .line 124
    :goto_3
    invoke-virtual {v1, v0}, Lio/sentry/B3;->C(Z)V

    .line 125
    .line 126
    .line 127
    const-string v0, "maskAllImages"

    .line 128
    .line 129
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    :cond_8
    move v2, v4

    .line 142
    :cond_9
    invoke-virtual {v1, v2}, Lio/sentry/B3;->B(Z)V

    .line 143
    .line 144
    .line 145
    const-string v0, "maskAllVectors"

    .line 146
    .line 147
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_a

    .line 152
    .line 153
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_b

    .line 158
    .line 159
    :cond_a
    const-string v0, "com.horcrux.svg.SvgView"

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Lio/sentry/B3;->a(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_b
    const-string v0, "screenshotStrategy"

    .line 165
    .line 166
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_c

    .line 171
    .line 172
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p0, p1}, Lio/sentry/react/n;->k0(Ljava/lang/String;)Lio/sentry/S1;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {v1, p1}, Lio/sentry/B3;->L(Lio/sentry/S1;)V

    .line 181
    .line 182
    .line 183
    :cond_c
    const-class p1, Lio/sentry/react/replay/b;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {v1, p1}, Lio/sentry/B3;->D(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-class p1, Lio/sentry/react/replay/c;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v1, p1}, Lio/sentry/B3;->O(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-object v1
.end method

.method public static Y(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, "://"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :catch_0
    return-object v0
.end method

.method private Z()V
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/react/s;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/react/n;->p:Lio/sentry/android/core/g0;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/react/n;->k:Ljava/lang/Runnable;

    .line 6
    .line 7
    sget-object v3, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lio/sentry/react/s;-><init>(Lio/sentry/android/core/g0;Ljava/lang/Runnable;Lio/sentry/ILogger;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/fragment/app/v;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/K;->n1(Landroidx/fragment/app/K$l;Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static synthetic a(Lio/sentry/react/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->g0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private a0()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/react/replay/a;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/sentry/react/replay/a;-><init>(Lio/sentry/ILogger;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroidx/fragment/app/v;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast v1, Landroidx/fragment/app/v;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/K;->n1(Landroidx/fragment/app/K$l;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic b(Lio/sentry/react/n;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/react/n;->h0(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lio/sentry/Y;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/lang/String;Lio/sentry/e;Lio/sentry/H;)Lio/sentry/e;
    .locals 2

    .line 1
    const-string p3, "url"

    .line 2
    .line 3
    invoke-virtual {p2, p3}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    instance-of v0, p3, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p3, Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p3, ""

    .line 15
    .line 16
    :goto_0
    const-string v0, "http"

    .line 17
    .line 18
    invoke-virtual {p2}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p3, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    :cond_1
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_3
    return-object p2
.end method

.method private d0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->j:Lio/sentry/d0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/sentry/Z2;

    .line 6
    .line 7
    invoke-direct {v0}, Lio/sentry/Z2;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/react/n;->j:Lio/sentry/d0;

    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lio/sentry/react/n;->T()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v1, Lio/sentry/android/core/M;

    .line 17
    .line 18
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    const-wide/16 v3, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    long-to-int v0, v3

    .line 27
    iget v3, p0, Lio/sentry/react/n;->e:I

    .line 28
    .line 29
    div-int v3, v0, v3

    .line 30
    .line 31
    new-instance v4, Lio/sentry/android/core/internal/util/G;

    .line 32
    .line 33
    iget-object v0, p0, Lio/sentry/react/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 34
    .line 35
    sget-object v6, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 36
    .line 37
    sget-object v5, Lio/sentry/react/n;->p:Lio/sentry/android/core/g0;

    .line 38
    .line 39
    invoke-direct {v4, v0, v6, v5}, Lio/sentry/android/core/internal/util/G;-><init>(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lio/sentry/react/n;->j:Lio/sentry/d0;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, Lio/sentry/android/core/M;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/G;Lio/sentry/d0;Lio/sentry/ILogger;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lio/sentry/react/n;->f:Lio/sentry/android/core/M;

    .line 48
    .line 49
    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/Y;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    invoke-interface {p2, p0}, Lio/sentry/Y;->i(Lio/sentry/protocol/I;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lio/sentry/protocol/I;

    .line 11
    .line 12
    invoke-direct {v0}, Lio/sentry/protocol/I;-><init>()V

    .line 13
    .line 14
    .line 15
    if-eqz p0, :cond_8

    .line 16
    .line 17
    const-string v1, "email"

    .line 18
    .line 19
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lio/sentry/protocol/I;->m(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    const-string v1, "id"

    .line 33
    .line 34
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lio/sentry/protocol/I;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    const-string v1, "username"

    .line 48
    .line 49
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Lio/sentry/protocol/I;->r(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const-string v1, "ip_address"

    .line 63
    .line 64
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lio/sentry/protocol/I;->p(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    const-string v1, "geo"

    .line 78
    .line 79
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_8

    .line 84
    .line 85
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_8

    .line 90
    .line 91
    new-instance v1, Lio/sentry/protocol/i;

    .line 92
    .line 93
    invoke-direct {v1}, Lio/sentry/protocol/i;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v2, "city"

    .line 97
    .line 98
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v2}, Lio/sentry/protocol/i;->d(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    const-string v2, "country_code"

    .line 112
    .line 113
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Lio/sentry/protocol/i;->e(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    const-string v2, "region"

    .line 127
    .line 128
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_7

    .line 133
    .line 134
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v1, p0}, Lio/sentry/protocol/i;->f(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    invoke-virtual {v0, v1}, Lio/sentry/protocol/I;->n(Lio/sentry/protocol/i;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    if-eqz p1, :cond_b

    .line 145
    .line 146
    new-instance p0, Ljava/util/HashMap;

    .line 147
    .line 148
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :cond_9
    :goto_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    if-eqz v3, :cond_9

    .line 170
    .line 171
    invoke-interface {p0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_a
    invoke-virtual {v0, p0}, Lio/sentry/protocol/I;->l(Ljava/util/Map;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    invoke-interface {p2, v0}, Lio/sentry/Y;->i(Lio/sentry/protocol/I;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method private e0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/react/n;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static synthetic f(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lio/sentry/Y;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lio/sentry/Y;->E(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p2, p1, p0}, Lio/sentry/Y;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private f0(Lio/sentry/B3;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/B3;->q()Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/B3;->l()Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public static synthetic g(Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lio/sentry/Y;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic g0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->m:Lio/sentry/p2;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o2;->m()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    long-to-double v0, v0

    .line 12
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    div-double/2addr v0, v2

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lio/sentry/react/w;->f(Ljava/lang/Double;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic h([[BLandroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/react/n;->p:Lio/sentry/android/core/g0;

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lio/sentry/android/core/internal/util/z;->f(Landroid/app/Activity;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    aput-object p1, p0, v0

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private synthetic h0(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lio/sentry/react/n;->t0(Lio/sentry/V2;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p2, p1}, Lio/sentry/react/n;->n(Lio/sentry/V2;Lio/sentry/protocol/r;)V

    .line 9
    .line 10
    .line 11
    return-object p2
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/String;Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lio/sentry/Y;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic i0(Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1, v0}, Lio/sentry/react/n;->X(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/ILogger;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/Y;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lio/sentry/react/a;->a(Lcom/facebook/react/bridge/ReadableMap;)Lio/sentry/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lio/sentry/Y;->a(Lio/sentry/e;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lio/sentry/react/a;->b(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lio/sentry/Y;->I(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private j0(Ljava/lang/String;)Lio/sentry/B3$a;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lio/sentry/B3$a;->MEDIUM:Lio/sentry/B3$a;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, -0x1

    .line 20
    sparse-switch v0, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :sswitch_0
    const-string v0, "high"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    goto :goto_0

    .line 35
    :sswitch_1
    const-string v0, "low"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v0, "medium"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    sget-object p1, Lio/sentry/B3$a;->MEDIUM:Lio/sentry/B3$a;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    sget-object p1, Lio/sentry/B3$a;->HIGH:Lio/sentry/B3$a;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    sget-object p1, Lio/sentry/B3$a;->LOW:Lio/sentry/B3$a;

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_2
    sget-object p1, Lio/sentry/B3$a;->MEDIUM:Lio/sentry/B3$a;

    .line 69
    .line 70
    return-object p1

    .line 71
    :sswitch_data_0
    .sparse-switch
        -0x4041708b -> :sswitch_2
        0x1a354 -> :sswitch_1
        0x30dda2 -> :sswitch_0
    .end sparse-switch

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic k(Lio/sentry/react/n;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/sentry/react/n;->i0(Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private k0(Ljava/lang/String;)Lio/sentry/S1;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lio/sentry/S1;->PIXEL_COPY:Lio/sentry/S1;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v0, "canvas"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    sget-object p1, Lio/sentry/S1;->PIXEL_COPY:Lio/sentry/S1;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object p1, Lio/sentry/S1;->CANVAS:Lio/sentry/S1;

    .line 27
    .line 28
    return-object p1
.end method

.method private m0(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileReader;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_2
    throw p1
.end method

.method private n(Lio/sentry/V2;Lio/sentry/protocol/r;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lio/sentry/j2;->L()Lio/sentry/protocol/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const-string v1, "sentry.javascript.react-native"

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/protocol/r;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2}, Lio/sentry/protocol/r;->g()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lio/sentry/protocol/y;

    .line 42
    .line 43
    invoke-virtual {v2}, Lio/sentry/protocol/y;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v2}, Lio/sentry/protocol/y;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v3, v2}, Lio/sentry/protocol/r;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p2}, Lio/sentry/protocol/r;->e()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lio/sentry/protocol/r;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p1, v0}, Lio/sentry/j2;->b0(Lio/sentry/protocol/r;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void
.end method

.method private r()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method private s0(Lio/sentry/V2;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "event.origin"

    .line 2
    .line 3
    const-string v1, "android"

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lio/sentry/j2;->d0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "event.environment"

    .line 9
    .line 10
    invoke-virtual {p1, v0, p2}, Lio/sentry/j2;->d0(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private t0(Lio/sentry/V2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lio/sentry/j2;->L()Lio/sentry/protocol/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/protocol/r;->f()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v1, "sentry.java.android.react-native"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "sentry.native.android.react-native"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v0, "native"

    .line 32
    .line 33
    invoke-direct {p0, p1, v0}, Lio/sentry/react/n;->s0(Lio/sentry/V2;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string v0, "java"

    .line 38
    .line 39
    invoke-direct {p0, p1, v0}, Lio/sentry/react/n;->s0(Lio/sentry/V2;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method private u(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    .line 1
    const-string v0, "_experiments"

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_6

    .line 16
    .line 17
    const-string v0, "androidProfilingOptions"

    .line 18
    .line 19
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_1
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-nez p2, :cond_2

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_2
    const-string v0, "profileSessionSampleRate"

    .line 36
    .line 37
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 53
    .line 54
    .line 55
    sget-object v3, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 56
    .line 57
    sget-object v4, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "Android UI Profiling profileSessionSampleRate set to: %.2f"

    .line 68
    .line 69
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-array v1, v2, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-interface {v3, v4, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    const-string v0, "lifecycle"

    .line 79
    .line 80
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "manual"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    sget-object v0, Lio/sentry/t1;->MANUAL:Lio/sentry/t1;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setProfileLifecycle(Lio/sentry/t1;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 104
    .line 105
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 106
    .line 107
    const-string v3, "Android UI Profile Lifecycle set to MANUAL"

    .line 108
    .line 109
    new-array v4, v2, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    const-string v1, "trace"

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    sget-object v0, Lio/sentry/t1;->TRACE:Lio/sentry/t1;

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setProfileLifecycle(Lio/sentry/t1;)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 129
    .line 130
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 131
    .line 132
    const-string v3, "Android UI Profile Lifecycle set to TRACE"

    .line 133
    .line 134
    new-array v4, v2, [Ljava/lang/Object;

    .line 135
    .line 136
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_0
    const-string v0, "startOnAppStart"

    .line 140
    .line 141
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_6

    .line 146
    .line 147
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-virtual {p1, p2}, Lio/sentry/z3;->setStartProfilerOnAppStart(Z)V

    .line 152
    .line 153
    .line 154
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 155
    .line 156
    sget-object v0, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 157
    .line 158
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    const-string v1, "Android UI Profiling startOnAppStart set to %b"

    .line 167
    .line 168
    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    new-array v1, v2, [Ljava/lang/Object;

    .line 173
    .line 174
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    :goto_1
    return-void
.end method

.method private x()Ljava/lang/Runnable;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/sentry/react/j;-><init>(Lio/sentry/react/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static z0(Landroid/app/Activity;)[B
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    filled-new-array {v2}, [[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lio/sentry/react/i;

    .line 15
    .line 16
    invoke-direct {v3, v2, p0, v0}, Lio/sentry/react/i;-><init>([[BLandroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v3}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    :try_start_0
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    const-wide/16 v3, 0x2

    .line 35
    .line 36
    invoke-virtual {v0, v3, v4, p0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    aget-object p0, v2, v1

    .line 40
    .line 41
    return-object p0

    .line 42
    :catch_0
    sget-object p0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 43
    .line 44
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 45
    .line 46
    const-string v2, "Screenshot process was interrupted."

    .line 47
    .line 48
    new-array v3, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {p0, v0, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-array p0, v1, [B

    .line 54
    .line 55
    return-object p0
.end method


# virtual methods
.method public A(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v2, v3, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    int-to-byte v3, v3

    .line 20
    aput-byte v3, v0, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method protected A0(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    .line 1
    const-string v0, "ignoreErrorsRegex"

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    const-string v1, "ignoreErrorsStr"

    .line 17
    .line 18
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    const/4 p2, 0x0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    move v1, p2

    .line 42
    :goto_1
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    move v3, p2

    .line 50
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    .line 51
    .line 52
    add-int/2addr v1, v3

    .line 53
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    move v1, p2

    .line 59
    :goto_3
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ge v1, v3, :cond_5

    .line 64
    .line 65
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    if-eqz v2, :cond_6

    .line 76
    .line 77
    :goto_4
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ge p2, v0, :cond_6

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v1, ".*"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-interface {v2, p2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    add-int/lit8 p2, p2, 0x1

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    invoke-virtual {p1, v4}, Lio/sentry/z3;->setIgnoredErrors(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public B(Lcom/facebook/react/bridge/Promise;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 15
    .line 16
    const-string v3, "modules.json"

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {v2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-array v0, v0, [B

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 35
    .line 36
    .line 37
    new-instance v3, Ljava/lang/String;

    .line 38
    .line 39
    sget-object v4, Lio/sentry/react/n;->q:Ljava/nio/charset/Charset;

    .line 40
    .line 41
    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_1
    move-exception v2

    .line 57
    :try_start_4
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 61
    :catchall_2
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 62
    .line 63
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    new-array v3, v3, [Ljava/lang/Object;

    .line 67
    .line 68
    const-string v4, "Fetching JS Modules failed."

    .line 69
    .line 70
    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void
.end method

.method public C(Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lio/sentry/android/core/J0;->i()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1, v2}, Lio/sentry/react/n;->D(Lcom/facebook/react/bridge/Promise;Lio/sentry/android/core/performance/h;Ljava/util/Map;Lio/sentry/ILogger;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected D(Lcom/facebook/react/bridge/Promise;Lio/sentry/android/core/performance/h;Ljava/util/Map;Lio/sentry/ILogger;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 9
    .line 10
    const-string p3, "Invalid app start data: app not launched in foreground."

    .line 11
    .line 12
    new-array v0, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {p4, p2, p3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {p3}, Lio/sentry/react/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Lcom/facebook/react/bridge/WritableMap;

    .line 27
    .line 28
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->l()Lio/sentry/android/core/performance/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lio/sentry/android/core/performance/i;->p()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    sget-wide v4, Lio/sentry/react/n;->r:J

    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    cmp-long v0, v4, v6

    .line 41
    .line 42
    if-lez v0, :cond_1

    .line 43
    .line 44
    cmp-long v0, v4, v2

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v0, v1

    .line 51
    :goto_0
    const-string v4, "has_fetched"

    .line 52
    .line 53
    invoke-interface {p3, v4, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    sget-wide v4, Lio/sentry/react/n;->r:J

    .line 57
    .line 58
    cmp-long v4, v4, v6

    .line 59
    .line 60
    if-gez v4, :cond_2

    .line 61
    .line 62
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 63
    .line 64
    const-string v4, "App Start data reported to the RN layer for the first time."

    .line 65
    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {p4, v0, v4, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    if-eqz v0, :cond_3

    .line 73
    .line 74
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 75
    .line 76
    const-string v4, "App Start data already fetched from native before."

    .line 77
    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-interface {p4, v0, v4, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 85
    .line 86
    const-string v4, "App Start data updated, reporting to the RN layer again."

    .line 87
    .line 88
    new-array v1, v1, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {p4, v0, v4, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    sput-wide v2, Lio/sentry/react/n;->r:J

    .line 94
    .line 95
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->t()V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, p3}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public E(Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Lio/sentry/android/core/J0;->j()Lio/sentry/Y;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0, p1, v0, v1, v2}, Lio/sentry/react/n;->F(Lcom/facebook/react/bridge/Promise;Lio/sentry/z3;Landroid/content/Context;Lio/sentry/Y;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method protected F(Lcom/facebook/react/bridge/Promise;Lio/sentry/z3;Landroid/content/Context;Lio/sentry/Y;)V
    .locals 3

    .line 1
    instance-of v0, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    if-eqz p4, :cond_3

    .line 17
    .line 18
    invoke-interface {p4}, Lio/sentry/Y;->r()Ljava/util/Queue;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lio/sentry/e;

    .line 37
    .line 38
    const-string v2, "react-native"

    .line 39
    .line 40
    invoke-virtual {v1}, Lio/sentry/e;->w()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    check-cast p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 55
    .line 56
    invoke-static {p3, p2, p4}, Lio/sentry/android/core/J0;->k(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/Y;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, Lio/sentry/react/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public G(Lcom/facebook/react/bridge/Promise;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :try_start_0
    iget-object v2, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/core/app/FrameMetricsAggregator;->b()[Landroid/util/SparseIntArray;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    aget-object v2, v2, v0

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    move v3, v0

    .line 26
    move v4, v3

    .line 27
    move v5, v4

    .line 28
    move v6, v5

    .line 29
    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->size()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-ge v3, v7, :cond_4

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    add-int/2addr v4, v8

    .line 44
    const/16 v9, 0x2bc

    .line 45
    .line 46
    if-le v7, v9, :cond_1

    .line 47
    .line 48
    add-int/2addr v6, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/16 v9, 0x10

    .line 51
    .line 52
    if-le v7, v9, :cond_2

    .line 53
    .line 54
    add-int/2addr v5, v8

    .line 55
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move v4, v0

    .line 59
    move v5, v4

    .line 60
    move v6, v5

    .line 61
    :cond_4
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "totalFrames"

    .line 66
    .line 67
    invoke-interface {v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    const-string v3, "slowFrames"

    .line 71
    .line 72
    invoke-interface {v2, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const-string v3, "frozenFrames"

    .line 76
    .line 77
    invoke-interface {v2, v3, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catchall_0
    sget-object v2, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 85
    .line 86
    sget-object v3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 87
    .line 88
    const-string v4, "Error fetching native frames."

    .line 89
    .line 90
    new-array v0, v0, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public H(Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Lio/sentry/android/core/J0;->j()Lio/sentry/Y;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0, p1, v0, v1, v2}, Lio/sentry/react/n;->I(Lcom/facebook/react/bridge/Promise;Lio/sentry/z3;Landroid/content/Context;Lio/sentry/Y;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method protected I(Lcom/facebook/react/bridge/Promise;Lio/sentry/z3;Landroid/content/Context;Lio/sentry/Y;)V
    .locals 3

    .line 1
    instance-of v0, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, p2

    .line 10
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 11
    .line 12
    invoke-static {p3, v0, p4}, Lio/sentry/android/core/J0;->k(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/Y;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    const-string p4, "contexts"

    .line 17
    .line 18
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    instance-of v0, p3, Ljava/util/Map;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    check-cast p3, Ljava/util/Map;

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v1, "os"

    .line 38
    .line 39
    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    const-string v1, "device"

    .line 53
    .line 54
    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_3
    const-string p3, "release"

    .line 68
    .line 69
    invoke-virtual {p2}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {v0, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance p2, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lio/sentry/react/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    :goto_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->b:Landroid/content/pm/PackageInfo;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public K(Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lio/sentry/react/n;->b:Landroid/content/pm/PackageInfo;

    .line 6
    .line 7
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "id"

    .line 10
    .line 11
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lio/sentry/react/n;->b:Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 17
    .line 18
    const-string v2, "version"

    .line 19
    .line 20
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lio/sentry/react/n;->b:Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "build"

    .line 32
    .line 33
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public L(Lcom/facebook/react/bridge/Promise;)V
    .locals 4

    .line 1
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 21
    .line 22
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "name"

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/protocol/r;->f()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "version"

    .line 35
    .line 36
    invoke-virtual {v0}, Lio/sentry/protocol/r;->h()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public M(Lcom/facebook/react/bridge/Promise;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->e(Landroid/app/Activity;Lio/sentry/ILogger;)Lio/sentry/protocol/J;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 16
    .line 17
    const-string v4, "Could not get ViewHierarchy."

    .line 18
    .line 19
    new-array v3, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v1, v0, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4, v1, v0}, Lio/sentry/util/o;->c(Lio/sentry/f0;Lio/sentry/ILogger;Lio/sentry/B0;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 47
    .line 48
    const-string v4, "Could not serialize ViewHierarchy."

    .line 49
    .line 50
    new-array v3, v3, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {v1, v0, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    array-length v4, v0

    .line 60
    const/4 v5, 0x1

    .line 61
    if-ge v4, v5, :cond_2

    .line 62
    .line 63
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 64
    .line 65
    const-string v4, "Got empty bytes array after serializing ViewHierarchy."

    .line 66
    .line 67
    new-array v3, v3, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-interface {v1, v0, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 77
    .line 78
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    .line 79
    .line 80
    .line 81
    array-length v2, v0

    .line 82
    :goto_0
    if-ge v3, v2, :cond_3

    .line 83
    .line 84
    aget-byte v4, v0, v3

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Lcom/facebook/react/bridge/WritableNativeArray;->pushInt(I)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method protected N()Landroid/content/Context;
    .locals 4

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 12
    .line 13
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "ApplicationContext is null, using ReactApplicationContext fallback."

    .line 19
    .line 20
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    return-object v0
.end method

.method public P()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/android/core/J0;->j()Lio/sentry/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-interface {v0}, Lio/sentry/Y;->G()Lio/sentry/protocol/x;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    invoke-virtual {v0}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public Q(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0}, Lio/sentry/react/n;->V()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "File not found for uri: "

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 38
    .line 39
    sget-object v4, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 40
    .line 41
    new-array v5, v0, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-interface {v3, v4, v2, v5}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Ljava/lang/Exception;

    .line 47
    .line 48
    invoke-direct {v3, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v1

    .line 61
    goto :goto_5

    .line 62
    :cond_0
    return-void

    .line 63
    :catchall_0
    move-exception v2

    .line 64
    goto :goto_3

    .line 65
    :cond_1
    :try_start_3
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 68
    .line 69
    .line 70
    const/16 v3, 0x400

    .line 71
    .line 72
    new-array v3, v3, [B

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    const/4 v5, -0x1

    .line 79
    if-eq v4, v5, :cond_2

    .line 80
    .line 81
    invoke-virtual {v2, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    array-length v4, v2

    .line 94
    move v5, v0

    .line 95
    :goto_2
    if-ge v5, v4, :cond_3

    .line 96
    .line 97
    aget-byte v6, v2, v5

    .line 98
    .line 99
    and-int/lit16 v6, v6, 0xff

    .line 100
    .line 101
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v1, :cond_4

    .line 112
    .line 113
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catchall_1
    move-exception v1

    .line 118
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_4
    throw v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 122
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v3, "Error reading uri: "

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string p1, ": "

    .line 136
    .line 137
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 152
    .line 153
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 154
    .line 155
    new-array v0, v0, [Ljava/lang/Object;

    .line 156
    .line 157
    invoke-interface {v1, v2, p1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Ljava/lang/Exception;

    .line 161
    .line 162
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public R(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/n;->m:Lio/sentry/p2;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/react/w;->c(Lcom/facebook/react/bridge/Promise;Lio/sentry/p2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected X(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/ILogger;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "sentry.java.android.react-native"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/protocol/r;

    .line 10
    .line 11
    const-string v2, "8.31.0"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lio/sentry/protocol/r;->i(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const-string v1, "npm:@sentry/react-native"

    .line 21
    .line 22
    const-string v2, "7.11.0"

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lio/sentry/protocol/r;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lio/sentry/protocol/r;->f()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, "/"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/protocol/r;->h()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSentryClientName(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v1, "sentry.native.android.react-native"

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setNativeSdkName(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setSdkVersion(Lio/sentry/protocol/r;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "debug"

    .line 67
    .line 68
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, 0x1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lio/sentry/z3;->setDebug(Z)V

    .line 82
    .line 83
    .line 84
    :cond_1
    const-string v0, "enabled"

    .line 85
    .line 86
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setEnabled(Z)V

    .line 97
    .line 98
    .line 99
    :cond_2
    const-string v0, "dsn"

    .line 100
    .line 101
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/4 v3, 0x0

    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v4, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 119
    .line 120
    const-string v5, "Starting with DSN: \'%s\'"

    .line 121
    .line 122
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-array v6, v3, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-interface {p3, v4, v5, v6}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setDsn(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    const-string v1, ""

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setDsn(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_1
    const-string v1, "sampleRate"

    .line 145
    .line 146
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSampleRate(Ljava/lang/Double;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    const-string v1, "sendClientReports"

    .line 164
    .line 165
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_5

    .line 170
    .line 171
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSendClientReports(Z)V

    .line 176
    .line 177
    .line 178
    :cond_5
    const-string v1, "maxBreadcrumbs"

    .line 179
    .line 180
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_6

    .line 185
    .line 186
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setMaxBreadcrumbs(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    const-string v1, "maxCacheItems"

    .line 194
    .line 195
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_7

    .line 200
    .line 201
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setMaxCacheItems(I)V

    .line 206
    .line 207
    .line 208
    :cond_7
    const-string v1, "environment"

    .line 209
    .line 210
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_8

    .line 215
    .line 216
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    if-eqz v4, :cond_8

    .line 221
    .line 222
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setEnvironment(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_8
    const-string v1, "release"

    .line 230
    .line 231
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_9

    .line 236
    .line 237
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    if-eqz v4, :cond_9

    .line 242
    .line 243
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setRelease(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_9
    const-string v1, "dist"

    .line 251
    .line 252
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_a

    .line 257
    .line 258
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    if-eqz v4, :cond_a

    .line 263
    .line 264
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setDist(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    const-string v1, "enableAutoSessionTracking"

    .line 272
    .line 273
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_b

    .line 278
    .line 279
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setEnableAutoSessionTracking(Z)V

    .line 284
    .line 285
    .line 286
    :cond_b
    const-string v1, "sessionTrackingIntervalMillis"

    .line 287
    .line 288
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_c

    .line 293
    .line 294
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    int-to-long v4, v1

    .line 299
    invoke-virtual {p1, v4, v5}, Lio/sentry/z3;->setSessionTrackingIntervalMillis(J)V

    .line 300
    .line 301
    .line 302
    :cond_c
    const-string v1, "shutdownTimeout"

    .line 303
    .line 304
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-eqz v4, :cond_d

    .line 309
    .line 310
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    int-to-long v4, v1

    .line 315
    invoke-virtual {p1, v4, v5}, Lio/sentry/z3;->setShutdownTimeoutMillis(J)V

    .line 316
    .line 317
    .line 318
    :cond_d
    const-string v1, "enableNdkScopeSync"

    .line 319
    .line 320
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-eqz v4, :cond_e

    .line 325
    .line 326
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    .line 331
    .line 332
    .line 333
    :cond_e
    const-string v1, "attachStacktrace"

    .line 334
    .line 335
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-eqz v4, :cond_f

    .line 340
    .line 341
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setAttachStacktrace(Z)V

    .line 346
    .line 347
    .line 348
    :cond_f
    const-string v1, "attachThreads"

    .line 349
    .line 350
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_10

    .line 355
    .line 356
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setAttachThreads(Z)V

    .line 361
    .line 362
    .line 363
    :cond_10
    const-string v1, "attachScreenshot"

    .line 364
    .line 365
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_11

    .line 370
    .line 371
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    .line 376
    .line 377
    .line 378
    :cond_11
    const-string v1, "attachViewHierarchy"

    .line 379
    .line 380
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-eqz v4, :cond_12

    .line 385
    .line 386
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    .line 391
    .line 392
    .line 393
    :cond_12
    const-string v1, "sendDefaultPii"

    .line 394
    .line 395
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_13

    .line 400
    .line 401
    const-string v1, "sendDefaultPii"

    .line 402
    .line 403
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSendDefaultPii(Z)V

    .line 408
    .line 409
    .line 410
    :cond_13
    const-string v1, "maxQueueSize"

    .line 411
    .line 412
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_14

    .line 417
    .line 418
    const-string v1, "maxQueueSize"

    .line 419
    .line 420
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setMaxQueueSize(I)V

    .line 425
    .line 426
    .line 427
    :cond_14
    const-string v1, "enableNdk"

    .line 428
    .line 429
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_15

    .line 434
    .line 435
    const-string v1, "enableNdk"

    .line 436
    .line 437
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    .line 442
    .line 443
    .line 444
    :cond_15
    const-string v1, "enableLogs"

    .line 445
    .line 446
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    if-eqz v1, :cond_16

    .line 451
    .line 452
    invoke-virtual {p1}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    const-string v4, "enableLogs"

    .line 457
    .line 458
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    invoke-virtual {v1, v4}, Lio/sentry/z3$h;->c(Z)V

    .line 463
    .line 464
    .line 465
    :cond_16
    const-string v1, "spotlight"

    .line 466
    .line 467
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    if-eqz v4, :cond_18

    .line 472
    .line 473
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Boolean:Lcom/facebook/react/bridge/ReadableType;

    .line 478
    .line 479
    if-ne v4, v5, :cond_17

    .line 480
    .line 481
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setEnableSpotlight(Z)V

    .line 486
    .line 487
    .line 488
    const-string v1, "defaultSidecarUrl"

    .line 489
    .line 490
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    goto :goto_2

    .line 498
    :cond_17
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 503
    .line 504
    if-ne v4, v5, :cond_18

    .line 505
    .line 506
    invoke-virtual {p1, v2}, Lio/sentry/z3;->setEnableSpotlight(Z)V

    .line 507
    .line 508
    .line 509
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    :cond_18
    :goto_2
    invoke-direct {p0, p2}, Lio/sentry/react/n;->W(Lcom/facebook/react/bridge/ReadableMap;)Lio/sentry/B3;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSessionReplay(Lio/sentry/B3;)V

    .line 521
    .line 522
    .line 523
    iget-object v2, p0, Lio/sentry/react/n;->n:Lio/sentry/util/s;

    .line 524
    .line 525
    const-string v4, "io.sentry.android.replay.ReplayIntegration"

    .line 526
    .line 527
    invoke-virtual {v2, v4, p3}, Lio/sentry/util/s;->c(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    invoke-direct {p0, v1}, Lio/sentry/react/n;->f0(Lio/sentry/B3;)Z

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-eqz v1, :cond_19

    .line 536
    .line 537
    if-eqz v2, :cond_19

    .line 538
    .line 539
    invoke-virtual {p1}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    new-instance v2, Lio/sentry/react/t;

    .line 544
    .line 545
    invoke-direct {v2}, Lio/sentry/react/t;-><init>()V

    .line 546
    .line 547
    .line 548
    invoke-interface {v1, v2}, Lio/sentry/z1;->k(Lio/sentry/y1;)V

    .line 549
    .line 550
    .line 551
    invoke-direct {p0}, Lio/sentry/react/n;->a0()V

    .line 552
    .line 553
    .line 554
    :cond_19
    invoke-direct {p0, p1, p2}, Lio/sentry/react/n;->u(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 555
    .line 556
    .line 557
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-static {v0}, Lio/sentry/react/n;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    const-string v1, "devServerUrl"

    .line 566
    .line 567
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    new-instance v2, Lio/sentry/react/m;

    .line 572
    .line 573
    invoke-direct {v2, v0, v1}, Lio/sentry/react/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {p1, v2}, Lio/sentry/z3;->setBeforeBreadcrumb(Lio/sentry/z3$a;)V

    .line 577
    .line 578
    .line 579
    const-class v0, Lcom/facebook/react/common/JavascriptException;

    .line 580
    .line 581
    invoke-virtual {p1, v0}, Lio/sentry/z3;->addIgnoredExceptionForType(Ljava/lang/Class;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {p0, p1, p2}, Lio/sentry/react/n;->A0(Lio/sentry/android/core/SentryAndroidOptions;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 585
    .line 586
    .line 587
    new-instance v0, Lio/sentry/react/d;

    .line 588
    .line 589
    invoke-direct {v0, p0, p1}, Lio/sentry/react/d;-><init>(Lio/sentry/react/n;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setBeforeSend(Lio/sentry/z3$c;)V

    .line 593
    .line 594
    .line 595
    const-string v0, "enableNativeCrashHandling"

    .line 596
    .line 597
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_1c

    .line 602
    .line 603
    const-string v0, "enableNativeCrashHandling"

    .line 604
    .line 605
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 606
    .line 607
    .line 608
    move-result p2

    .line 609
    if-nez p2, :cond_1c

    .line 610
    .line 611
    invoke-virtual {p1}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object p2

    .line 615
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    :cond_1a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-eqz v1, :cond_1c

    .line 624
    .line 625
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, Lio/sentry/p0;

    .line 630
    .line 631
    instance-of v2, v1, Lio/sentry/UncaughtExceptionHandlerIntegration;

    .line 632
    .line 633
    if-nez v2, :cond_1b

    .line 634
    .line 635
    instance-of v2, v1, Lio/sentry/android/core/AnrIntegration;

    .line 636
    .line 637
    if-nez v2, :cond_1b

    .line 638
    .line 639
    instance-of v2, v1, Lio/sentry/android/core/NdkIntegration;

    .line 640
    .line 641
    if-eqz v2, :cond_1a

    .line 642
    .line 643
    :cond_1b
    invoke-interface {p2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    goto :goto_3

    .line 647
    :cond_1c
    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 648
    .line 649
    invoke-virtual {p1}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object p1

    .line 653
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object p1

    .line 657
    const-string v0, "Native Integrations \'%s\'"

    .line 658
    .line 659
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    new-array v0, v3, [Ljava/lang/Object;

    .line 664
    .line 665
    invoke-interface {p3, p2, p1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    invoke-static {}, Lio/sentry/android/core/q0;->c()Lio/sentry/android/core/q0;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 673
    .line 674
    .line 675
    move-result-object p2

    .line 676
    if-eqz p2, :cond_1d

    .line 677
    .line 678
    invoke-virtual {p1, p2}, Lio/sentry/android/core/q0;->d(Landroid/app/Activity;)V

    .line 679
    .line 680
    .line 681
    :cond_1d
    return-void
.end method

.method public b0(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->Z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/react/n;->N()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/react/f;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lio/sentry/react/f;-><init>(Lio/sentry/react/n;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lio/sentry/android/core/Y0;->g(Landroid/content/Context;Lio/sentry/g2$a;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public l(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/l;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/sentry/react/l;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l0(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lio/sentry/react/w;->d(Ljava/lang/String;)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 2
    .line 3
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "addListener of NativeEventEmitter can\'t be used on Android!"

    .line 9
    .line 10
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public n0(D)V
    .locals 2

    .line 1
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 2
    .line 3
    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "removeListeners of NativeEventEmitter can\'t be used on Android!"

    .line 9
    .line 10
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public o(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    const-string v0, "hardCrashed"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v1}, Lio/sentry/vendor/a;->a(Ljava/lang/String;I)[B

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :try_start_0
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p2, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 24
    :goto_1
    invoke-static {p1, p2}, Lio/sentry/android/core/J0;->f([BZ)Lio/sentry/protocol/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_0
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 29
    .line 30
    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 31
    .line 32
    const-string v0, "Error while capturing envelope"

    .line 33
    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public o0(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lio/sentry/react/w;->g(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public p(ZLcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Lio/sentry/z1;->l(Ljava/lang/Boolean;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/react/n;->P()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public p0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lcom/facebook/react/bridge/Promise;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 10
    .line 11
    sget-object v3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 12
    .line 13
    const-string v4, "CurrentActivity is null, can\'t capture screenshot."

    .line 14
    .line 15
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v0, v3, v4, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v0}, Lio/sentry/react/n;->z0(Landroid/app/Activity;)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    array-length v3, v0

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 35
    .line 36
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    .line 37
    .line 38
    .line 39
    array-length v3, v0

    .line 40
    :goto_0
    if-ge v2, v3, :cond_2

    .line 41
    .line 42
    aget-byte v4, v0, v2

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Lcom/facebook/react/bridge/WritableNativeArray;->pushInt(I)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "contentType"

    .line 56
    .line 57
    const-string v3, "image/png"

    .line 58
    .line 59
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v2, "data"

    .line 63
    .line 64
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "filename"

    .line 68
    .line 69
    const-string v2, "screenshot.png"

    .line 70
    .line 71
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 75
    .line 76
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    :goto_1
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 87
    .line 88
    sget-object v3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 89
    .line 90
    const-string v4, "Screenshot is null, screen was not captured."

    .line 91
    .line 92
    new-array v2, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-interface {v0, v3, v4, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public q0(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r0(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 4
    .line 5
    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v1, "RNSentry.setContext called with null key, can\'t change context."

    .line 11
    .line 12
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lio/sentry/react/k;

    .line 17
    .line 18
    invoke-direct {v0, p2, p1}, Lio/sentry/react/k;-><init>(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public s()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/react/h;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public t(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/sentry/react/n;->y()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public u0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lio/sentry/react/e;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lio/sentry/react/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    sget-object p1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 16
    .line 17
    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v1, "RNSentry.setExtra called with null key or value, can\'t change extra."

    .line 23
    .line 24
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v1, "TEST - Sentry Client Crash (only works in release mode)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public v0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lio/sentry/react/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->E()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lio/sentry/react/c;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lio/sentry/g2;->l(Lio/sentry/G1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public x0(Z)Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    const-string v0, "started"

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lio/sentry/react/n;->f:Lio/sentry/android/core/M;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lio/sentry/react/n;->d0()V

    .line 15
    .line 16
    .line 17
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->enable()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lio/sentry/react/n;->f:Lio/sentry/android/core/M;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lio/sentry/android/core/M;->j()Lio/sentry/android/core/M$c;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 31
    invoke-interface {v1, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :goto_1
    const/4 v2, 0x0

    .line 36
    invoke-interface {v1, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "error"

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {v1, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public y()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator;->e()[Landroid/util/SparseIntArray;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public y0()Lcom/facebook/react/bridge/WritableMap;
    .locals 9

    .line 1
    const-string v0, "Profile not deleted from:"

    .line 2
    .line 3
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lio/sentry/z3;->isDebug()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 16
    .line 17
    invoke-direct {v2}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    :try_start_0
    iget-object v5, p0, Lio/sentry/react/n;->f:Lio/sentry/android/core/M;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5, v3, v4}, Lio/sentry/android/core/M;->g(ZLjava/util/List;)Lio/sentry/android/core/M$b;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_0
    move-object v5, v4

    .line 35
    :goto_0
    invoke-static {}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->disable()V

    .line 36
    .line 37
    .line 38
    const-string v6, "sampling-profiler-trace"

    .line 39
    .line 40
    const-string v7, ".cpuprofile"

    .line 41
    .line 42
    iget-object v8, p0, Lio/sentry/react/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 43
    .line 44
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-static {v6, v7, v8}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 55
    .line 56
    sget-object v6, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 57
    .line 58
    new-instance v7, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v8, "Profile saved to: "

    .line 64
    .line 65
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    new-array v8, v3, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {v1, v6, v7, v8}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->dumpSampledTraceToFile(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v1, "profile"

    .line 92
    .line 93
    invoke-direct {p0, v4}, Lio/sentry/react/n;->m0(Ljava/io/File;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-interface {v2, v1, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    if-eqz v5, :cond_2

    .line 101
    .line 102
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 103
    .line 104
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v5, v5, Lio/sentry/android/core/M$b;->c:Ljava/io/File;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-wide v6, p0, Lio/sentry/react/n;->l:J

    .line 114
    .line 115
    invoke-static {v5, v6, v7}, Lio/sentry/util/i;->b(Ljava/lang/String;J)[B

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    const/4 v6, 0x3

    .line 120
    invoke-static {v5, v6}, Lio/sentry/vendor/a;->f([BI)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-string v6, "sampled_profile"

    .line 125
    .line 126
    invoke-interface {v1, v6, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v5, "android_api_level"

    .line 130
    .line 131
    sget-object v6, Lio/sentry/react/n;->p:Lio/sentry/android/core/g0;

    .line 132
    .line 133
    invoke-virtual {v6}, Lio/sentry/android/core/g0;->d()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-interface {v1, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    const-string v5, "build_id"

    .line 141
    .line 142
    invoke-direct {p0}, Lio/sentry/react/n;->U()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-interface {v1, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const-string v5, "androidProfile"

    .line 150
    .line 151
    invoke-interface {v2, v5, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    :cond_2
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_3

    .line 159
    .line 160
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 161
    .line 162
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 163
    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    new-array v7, v3, [Ljava/lang/Object;

    .line 184
    .line 185
    invoke-interface {v1, v5, v6, v7}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :catchall_1
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 190
    .line 191
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 192
    .line 193
    new-instance v6, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    new-array v3, v3, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-interface {v1, v5, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :goto_1
    :try_start_2
    const-string v5, "error"

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-interface {v2, v5, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 225
    .line 226
    .line 227
    if-eqz v4, :cond_3

    .line 228
    .line 229
    :try_start_3
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-nez v1, :cond_3

    .line 234
    .line 235
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 236
    .line 237
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 238
    .line 239
    new-instance v6, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    new-array v7, v3, [Ljava/lang/Object;

    .line 259
    .line 260
    invoke-interface {v1, v5, v6, v7}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :catchall_2
    sget-object v1, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 265
    .line 266
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 267
    .line 268
    new-instance v6, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    new-array v3, v3, [Ljava/lang/Object;

    .line 288
    .line 289
    invoke-interface {v1, v5, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_3
    :goto_2
    return-object v2

    .line 293
    :catchall_3
    move-exception v1

    .line 294
    if-eqz v4, :cond_4

    .line 295
    .line 296
    :try_start_4
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-nez v2, :cond_4

    .line 301
    .line 302
    sget-object v2, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 303
    .line 304
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 305
    .line 306
    new-instance v6, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    new-array v7, v3, [Ljava/lang/Object;

    .line 326
    .line 327
    invoke-interface {v2, v5, v6, v7}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :catchall_4
    sget-object v2, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 332
    .line 333
    sget-object v5, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 334
    .line 335
    new-instance v6, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    new-array v3, v3, [Ljava/lang/Object;

    .line 355
    .line 356
    invoke-interface {v2, v5, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :cond_4
    :goto_3
    throw v1
.end method

.method public z()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lio/sentry/react/n;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lio/sentry/react/n;->d:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Landroidx/core/app/FrameMetricsAggregator;

    .line 11
    .line 12
    invoke-direct {v0}, Landroidx/core/app/FrameMetricsAggregator;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 16
    .line 17
    invoke-direct {p0}, Lio/sentry/react/n;->O()Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, p0, Lio/sentry/react/n;->c:Landroidx/core/app/FrameMetricsAggregator;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v2, v0}, Landroidx/core/app/FrameMetricsAggregator;->a(Landroid/app/Activity;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 31
    .line 32
    sget-object v2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 33
    .line 34
    const-string v3, "FrameMetricsAggregator installed."

    .line 35
    .line 36
    new-array v4, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 43
    .line 44
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 45
    .line 46
    const-string v3, "Error adding Activity to frameMetricsAggregator."

    .line 47
    .line 48
    new-array v1, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 55
    .line 56
    sget-object v2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 57
    .line 58
    const-string v3, "currentActivity isn\'t available."

    .line 59
    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :cond_1
    sget-object v0, Lio/sentry/react/n;->o:Lio/sentry/ILogger;

    .line 67
    .line 68
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 69
    .line 70
    const-string v3, "androidx.core\' isn\'t available as a dependency."

    .line 71
    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
