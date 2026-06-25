.class public final Lio/sentry/android/core/SentryPerformanceProvider;
.super Lio/sentry/android/core/A0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final f:J


# instance fields
.field private b:Landroid/app/Application;

.field private final c:Lio/sentry/ILogger;

.field private final d:Lio/sentry/android/core/g0;

.field private final e:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lio/sentry/android/core/SentryPerformanceProvider;->f:J

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/A0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->e:Lio/sentry/util/a;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/android/core/z;

    .line 12
    .line 13
    invoke-direct {v0}, Lio/sentry/android/core/z;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 17
    .line 18
    new-instance v1, Lio/sentry/android/core/g0;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lio/sentry/android/core/g0;-><init>(Lio/sentry/ILogger;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/android/core/K;->f(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private b(Landroid/content/Context;Lio/sentry/h2;Lio/sentry/android/core/performance/h;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Lio/sentry/h2;->f()Z

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
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 9
    .line 10
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 11
    .line 12
    const-string p3, "App start profiling was not sampled. It will not start."

    .line 13
    .line 14
    new-array v0, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1, p2, p3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v2, Lio/sentry/android/core/v;

    .line 21
    .line 22
    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 23
    .line 24
    new-instance v4, Lio/sentry/android/core/internal/util/G;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 31
    .line 32
    iget-object v5, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 33
    .line 34
    invoke-direct {v4, p1, v0, v5}, Lio/sentry/android/core/internal/util/G;-><init>(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V

    .line 35
    .line 36
    .line 37
    iget-object v5, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 38
    .line 39
    invoke-virtual {p2}, Lio/sentry/h2;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {p2}, Lio/sentry/h2;->d()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    new-instance v8, Lio/sentry/Z2;

    .line 48
    .line 49
    invoke-direct {v8}, Lio/sentry/Z2;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v2 .. v8}, Lio/sentry/android/core/v;-><init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/internal/util/G;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/d0;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-virtual {p3, p1}, Lio/sentry/android/core/performance/h;->x(Lio/sentry/k0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v2}, Lio/sentry/android/core/performance/h;->w(Lio/sentry/N;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 63
    .line 64
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 65
    .line 66
    const-string v0, "App start continuous profiling started."

    .line 67
    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-interface {p1, p3, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lio/sentry/z3;->empty()Lio/sentry/z3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p2}, Lio/sentry/h2;->f()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_1

    .line 82
    .line 83
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-virtual {p1, p3}, Lio/sentry/z3;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Lio/sentry/h2;->a()Lio/sentry/t1;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    new-instance p3, Lio/sentry/g4;

    .line 100
    .line 101
    invoke-direct {p3, p1}, Lio/sentry/g4;-><init>(Lio/sentry/z3;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, p2, p3}, Lio/sentry/N;->d(Lio/sentry/t1;Lio/sentry/g4;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method private c(Landroid/content/Context;Lio/sentry/h2;Lio/sentry/android/core/performance/h;)V
    .locals 12

    .line 1
    new-instance v0, Lio/sentry/h4;

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/sentry/h2;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p2}, Lio/sentry/h2;->e()Ljava/lang/Double;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Lio/sentry/h2;->i()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p2}, Lio/sentry/h2;->b()Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lio/sentry/h4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3, v0}, Lio/sentry/android/core/performance/h;->y(Lio/sentry/h4;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/h4;->b()Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/h4;->e()Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v3, Lio/sentry/android/core/P;

    .line 56
    .line 57
    iget-object v5, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 58
    .line 59
    new-instance v6, Lio/sentry/android/core/internal/util/G;

    .line 60
    .line 61
    iget-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 62
    .line 63
    iget-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 64
    .line 65
    invoke-direct {v6, p1, v0, v1}, Lio/sentry/android/core/internal/util/G;-><init>(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V

    .line 66
    .line 67
    .line 68
    iget-object v7, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 69
    .line 70
    invoke-virtual {p2}, Lio/sentry/h2;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {p2}, Lio/sentry/h2;->j()Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-virtual {p2}, Lio/sentry/h2;->d()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    new-instance v11, Lio/sentry/Z2;

    .line 83
    .line 84
    invoke-direct {v11}, Lio/sentry/Z2;-><init>()V

    .line 85
    .line 86
    .line 87
    move-object v4, p1

    .line 88
    invoke-direct/range {v3 .. v11}, Lio/sentry/android/core/P;-><init>(Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/android/core/internal/util/G;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/d0;)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-virtual {p3, p1}, Lio/sentry/android/core/performance/h;->w(Lio/sentry/N;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v3}, Lio/sentry/android/core/performance/h;->x(Lio/sentry/k0;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 99
    .line 100
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 101
    .line 102
    const-string p3, "App start profiling started."

    .line 103
    .line 104
    new-array v0, v2, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-interface {p1, p2, p3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v3}, Lio/sentry/k0;->start()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_1
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 114
    .line 115
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 116
    .line 117
    const-string p3, "App start profiling was not sampled. It will not start."

    .line 118
    .line 119
    new-array v0, v2, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-interface {p1, p2, p3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method private d(Lio/sentry/android/core/performance/h;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

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
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 9
    .line 10
    sget-object v0, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 11
    .line 12
    const-string v2, "App. Context from ContentProvider is null"

    .line 13
    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v2, Lio/sentry/android/core/internal/util/j;

    .line 21
    .line 22
    invoke-direct {v2}, Lio/sentry/android/core/internal/util/j;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lio/sentry/android/core/b1;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Lio/sentry/android/core/b1;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, v3}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/io/File;

    .line 35
    .line 36
    new-instance v3, Ljava/io/File;

    .line 37
    .line 38
    const-string v4, "app_start_profiling_config"

    .line 39
    .line 40
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_6

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    .line 58
    .line 59
    new-instance v4, Ljava/io/InputStreamReader;

    .line 60
    .line 61
    new-instance v5, Ljava/io/FileInputStream;

    .line 62
    .line 63
    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_1
    new-instance v3, Lio/sentry/C0;

    .line 73
    .line 74
    invoke-static {}, Lio/sentry/z3;->empty()Lio/sentry/z3;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-direct {v3, v4}, Lio/sentry/C0;-><init>(Lio/sentry/z3;)V

    .line 79
    .line 80
    .line 81
    const-class v4, Lio/sentry/h2;

    .line 82
    .line 83
    invoke-virtual {v3, v2, v4}, Lio/sentry/C0;->c(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lio/sentry/h2;

    .line 88
    .line 89
    if-nez v3, :cond_3

    .line 90
    .line 91
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 92
    .line 93
    sget-object v0, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 94
    .line 95
    const-string v3, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start."

    .line 96
    .line 97
    new-array v1, v1, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-interface {p1, v0, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto :goto_3

    .line 108
    :catch_0
    move-exception p1

    .line 109
    goto :goto_4

    .line 110
    :catchall_1
    move-exception p1

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    :try_start_3
    invoke-virtual {v3}, Lio/sentry/h2;->g()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    invoke-virtual {v3}, Lio/sentry/h2;->k()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-direct {p0, v0, v3, p1}, Lio/sentry/android/core/SentryPerformanceProvider;->b(Landroid/content/Context;Lio/sentry/h2;Lio/sentry/android/core/performance/h;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    invoke-virtual {v3}, Lio/sentry/h2;->j()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_5

    .line 133
    .line 134
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 135
    .line 136
    sget-object v0, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 137
    .line 138
    const-string v3, "Profiling is not enabled. App start profiling will not start."

    .line 139
    .line 140
    new-array v1, v1, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-interface {p1, v0, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    invoke-virtual {v3}, Lio/sentry/h2;->h()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    invoke-direct {p0, v0, v3, p1}, Lio/sentry/android/core/SentryPerformanceProvider;->c(Landroid/content/Context;Lio/sentry/h2;Lio/sentry/android/core/performance/h;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :goto_1
    :try_start_4
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_2
    move-exception v0

    .line 161
    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    throw p1
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 165
    :goto_3
    iget-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 166
    .line 167
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 168
    .line 169
    const-string v2, "Error reading app start profiling config file. "

    .line 170
    .line 171
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_4
    iget-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/ILogger;

    .line 176
    .line 177
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 178
    .line 179
    const-string v2, "App start profiling config file not found. "

    .line 180
    .line 181
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :cond_6
    :goto_5
    return-void
.end method

.method private e(Landroid/content/Context;Lio/sentry/android/core/performance/h;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->r()Lio/sentry/android/core/performance/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lio/sentry/android/core/SentryPerformanceProvider;->f:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/performance/i;->x(J)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/g0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/sentry/android/core/g0;->d()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x18

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->l()Lio/sentry/android/core/performance/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/performance/i;->x(J)V

    .line 29
    .line 30
    .line 31
    :cond_0
    instance-of v0, p1, Landroid/app/Application;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p1, Landroid/app/Application;

    .line 36
    .line 37
    iput-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->b:Landroid/app/Application;

    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->b:Landroid/app/Application;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p2, p1}, Lio/sentry/android/core/performance/h;->v(Landroid/app/Application;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    .line 1
    const-class v0, Lio/sentry/android/core/SentryPerformanceProvider;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "An applicationId is required to fulfill the manifest placeholder."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public onCreate()Z
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p0, v1, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->e(Landroid/content/Context;Lio/sentry/android/core/performance/h;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->d(Lio/sentry/android/core/performance/h;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public shutdown()V
    .locals 3

    .line 1
    sget-object v0, Lio/sentry/android/core/performance/h;->q:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->j()Lio/sentry/k0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Lio/sentry/k0;->close()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->i()Lio/sentry/N;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-interface {v1, v2}, Lio/sentry/N;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :cond_1
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void

    .line 43
    :goto_1
    if-eqz v0, :cond_3

    .line 44
    .line 45
    :try_start_1
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_2
    throw v1
.end method
