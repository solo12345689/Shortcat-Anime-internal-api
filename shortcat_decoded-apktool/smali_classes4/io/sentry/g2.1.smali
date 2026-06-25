.class public abstract Lio/sentry/g2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/g2$a;
    }
.end annotation


# static fields
.field private static volatile a:Lio/sentry/b0;

.field private static volatile b:Lio/sentry/a0;

.field private static final c:Lio/sentry/Y;

.field private static volatile d:Z

.field private static final e:Ljava/nio/charset/Charset;

.field private static final f:J

.field private static final g:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/W0;->c()Lio/sentry/W0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lio/sentry/g2;->a:Lio/sentry/b0;

    .line 6
    .line 7
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 12
    .line 13
    new-instance v0, Lio/sentry/E1;

    .line 14
    .line 15
    invoke-static {}, Lio/sentry/z3;->empty()Lio/sentry/z3;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lio/sentry/E1;-><init>(Lio/sentry/z3;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lio/sentry/g2;->c:Lio/sentry/Y;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    sput-boolean v0, Lio/sentry/g2;->d:Z

    .line 26
    .line 27
    const-string v0, "UTF-8"

    .line 28
    .line 29
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lio/sentry/g2;->e:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    sput-wide v0, Lio/sentry/g2;->f:J

    .line 40
    .line 41
    new-instance v0, Lio/sentry/util/a;

    .line 42
    .line 43
    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lio/sentry/g2;->g:Lio/sentry/util/a;

    .line 47
    .line 48
    return-void
.end method

.method private static A(Lio/sentry/z3;)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/util/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/util/s;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lio/sentry/opentelemetry/a;->c(Lio/sentry/z3;Lio/sentry/util/s;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lio/sentry/t3;->OFF:Lio/sentry/t3;

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/sentry/z3;->getOpenTelemetryMode()Lio/sentry/t3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lio/sentry/p;

    .line 18
    .line 19
    invoke-direct {v0}, Lio/sentry/p;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setSpanFactory(Lio/sentry/i0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p0}, Lio/sentry/g2;->D(Lio/sentry/z3;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Lio/sentry/opentelemetry/a;->a(Lio/sentry/z3;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static B(Lio/sentry/z3;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/util/m;->c(Lio/sentry/z3;)Lio/sentry/N;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lio/sentry/util/m;->b(Lio/sentry/z3;)Lio/sentry/X;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static C(Lio/sentry/z3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->isDebug()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Lio/sentry/N0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/e4;

    .line 16
    .line 17
    invoke-direct {v0}, Lio/sentry/e4;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setLogger(Lio/sentry/ILogger;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private static D(Lio/sentry/z3;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->u()Lio/sentry/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/b0;->close()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lio/sentry/t3;->OFF:Lio/sentry/t3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/sentry/z3;->getOpenTelemetryMode()Lio/sentry/t3;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-ne v0, p0, :cond_0

    .line 15
    .line 16
    new-instance p0, Lio/sentry/o;

    .line 17
    .line 18
    invoke-direct {p0}, Lio/sentry/o;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object p0, Lio/sentry/g2;->a:Lio/sentry/b0;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p0, Lio/sentry/util/s;

    .line 25
    .line 26
    invoke-direct {p0}, Lio/sentry/util/s;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lio/sentry/N0;->e()Lio/sentry/N0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p0, v0}, Lio/sentry/R1;->a(Lio/sentry/util/s;Lio/sentry/ILogger;)Lio/sentry/b0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sput-object p0, Lio/sentry/g2;->a:Lio/sentry/b0;

    .line 38
    .line 39
    return-void
.end method

.method public static E()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->A()Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static F()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static G()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method private static H(Lio/sentry/z3;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/G0;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lio/sentry/G0;-><init>(Lio/sentry/z3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 20
    .line 21
    const-string v2, "Failed to move previous session."

    .line 22
    .line 23
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static I(Lio/sentry/z3;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/f2;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lio/sentry/f2;-><init>(Lio/sentry/z3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 20
    .line 21
    const-string v2, "Failed to notify options observers."

    .line 22
    .line 23
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static J(Lio/sentry/z3;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->isEnableExternalConfiguration()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lio/sentry/config/g;->a()Lio/sentry/config/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lio/sentry/E;->g(Lio/sentry/config/f;Lio/sentry/ILogger;)Lio/sentry/E;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lio/sentry/z3;->merge(Lio/sentry/E;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lio/sentry/z3;->getDsn()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lio/sentry/z3;->isEnabled()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lio/sentry/z3;->retrieveParsedDsn()Lio/sentry/v;

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string v0, "DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK."

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_3
    :goto_0
    invoke-static {}, Lio/sentry/g2;->k()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method private static K(Lio/sentry/z3;)Lio/sentry/h4;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/i4;

    .line 2
    .line 3
    const-string v1, "app.launch"

    .line 4
    .line 5
    const-string v2, "profile"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lio/sentry/i4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lio/sentry/i4;->B(Z)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lio/sentry/D1;

    .line 15
    .line 16
    invoke-static {}, Lio/sentry/util/B;->a()Lio/sentry/util/z;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lio/sentry/util/z;->c()D

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, v0, v3, v2, v3}, Lio/sentry/D1;-><init>(Lio/sentry/i4;Lio/sentry/j;Ljava/lang/Double;Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lio/sentry/z3;->getInternalTracesSampler()Lio/sentry/g4;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, v1}, Lio/sentry/g4;->a(Lio/sentry/D1;)Lio/sentry/h4;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static L()V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->p()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static M(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Lio/sentry/a0;->z(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic a(Lio/sentry/z3;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getCacheDirPathWithoutDsn()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    new-instance v1, Ljava/io/File;

    .line 8
    .line 9
    const-string v2, "app_start_profiling_config"

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {v1}, Lio/sentry/util/i;->a(Ljava/io/File;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lio/sentry/z3;->isEnableAppStartProfiling()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lio/sentry/z3;->isStartProfilerOnAppStart()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_4

    .line 33
    :cond_0
    invoke-virtual {p0}, Lio/sentry/z3;->isStartProfilerOnAppStart()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lio/sentry/z3;->isTracingEnabled()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 50
    .line 51
    const-string v2, "Tracing is disabled and app start profiling will not start."

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    new-array v3, v3, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lio/sentry/z3;->isEnableAppStartProfiling()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-static {p0}, Lio/sentry/g2;->K(Lio/sentry/z3;)Lio/sentry/h4;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, Lio/sentry/h4;

    .line 78
    .line 79
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-direct {v0, v2}, Lio/sentry/h4;-><init>(Ljava/lang/Boolean;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    new-instance v2, Lio/sentry/h2;

    .line 85
    .line 86
    invoke-direct {v2, p0, v0}, Lio/sentry/h2;-><init>(Lio/sentry/z3;Lio/sentry/h4;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/io/FileOutputStream;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    :try_start_1
    new-instance v1, Ljava/io/BufferedWriter;

    .line 95
    .line 96
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 97
    .line 98
    sget-object v4, Lio/sentry/g2;->e:Ljava/nio/charset/Charset;

    .line 99
    .line 100
    invoke-direct {v3, v0, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    :try_start_2
    invoke-virtual {p0}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v3, v2, v1}, Lio/sentry/f0;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 111
    .line 112
    .line 113
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    .line 115
    .line 116
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_1
    move-exception v1

    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception v2

    .line 123
    :try_start_5
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_3
    move-exception v1

    .line 128
    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    :goto_1
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 132
    :goto_2
    :try_start_7
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_4
    move-exception v0

    .line 137
    :try_start_8
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 141
    :goto_4
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 146
    .line 147
    const-string v2, "Unable to create app start profiling config file. "

    .line 148
    .line 149
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    :goto_5
    return-void
.end method

.method public static synthetic b(Lio/sentry/z3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->loadLazyFields()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ljava/io/File;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic d(Lio/sentry/z3;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getOptionsObservers()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lio/sentry/T;

    .line 20
    .line 21
    invoke-virtual {p0}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v1, v2}, Lio/sentry/T;->k(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lio/sentry/z3;->getProguardUuid()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1, v2}, Lio/sentry/T;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1, v2}, Lio/sentry/T;->j(Lio/sentry/protocol/r;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lio/sentry/z3;->getDist()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v1, v2}, Lio/sentry/T;->f(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lio/sentry/z3;->getEnvironment()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v1, v2}, Lio/sentry/T;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lio/sentry/z3;->getTags()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v1, v2}, Lio/sentry/T;->e(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Lio/sentry/B3;->l()Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v1, v2}, Lio/sentry/T;->g(Ljava/lang/Double;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p0}, Lio/sentry/z3;->findPersistingScopeObserver()Lio/sentry/cache/t;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, Lio/sentry/cache/t;->C()V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

.method public static synthetic e(Ljava/io/File;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic f(Ljava/io/File;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_2

    .line 11
    .line 12
    aget-object v2, p0, v1

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    sget-wide v5, Lio/sentry/g2;->f:J

    .line 19
    .line 20
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    const-wide/16 v8, 0x5

    .line 23
    .line 24
    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    sub-long/2addr v5, v7

    .line 29
    cmp-long v3, v3, v5

    .line 30
    .line 31
    if-gez v3, :cond_1

    .line 32
    .line 33
    invoke-static {v2}, Lio/sentry/util/i;->a(Ljava/io/File;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic g(Ljava/io/File;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static h(Lio/sentry/e;Lio/sentry/H;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Lio/sentry/a0;->e(Lio/sentry/e;Lio/sentry/H;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static i(Lio/sentry/g2$a;Lio/sentry/z3;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lio/sentry/g2$a;->a(Lio/sentry/z3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 11
    .line 12
    const-string v1, "Error in the \'OptionsConfiguration.configure\' callback."

    .line 13
    .line 14
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static j(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Lio/sentry/a0;->y(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static k()V
    .locals 3

    .line 1
    sget-object v0, Lio/sentry/g2;->g:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sput-object v2, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 16
    .line 17
    invoke-static {}, Lio/sentry/g2;->u()Lio/sentry/b0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lio/sentry/b0;->close()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {v1, v2}, Lio/sentry/a0;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    :try_start_1
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_1
    move-exception v0

    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    throw v1
.end method

.method public static l(Lio/sentry/G1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Lio/sentry/g2;->m(Lio/sentry/I1;Lio/sentry/G1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static m(Lio/sentry/I1;Lio/sentry/G1;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Lio/sentry/a0;->t(Lio/sentry/I1;Lio/sentry/G1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static n()V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->l()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static o(Lio/sentry/z3;Lio/sentry/a0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/q1;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lio/sentry/q1;-><init>(Lio/sentry/z3;Lio/sentry/a0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 20
    .line 21
    const-string v1, "Failed to finalize previous session."

    .line 22
    .line 23
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static p(J)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Lio/sentry/a0;->d(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static q(Ljava/lang/String;)Lio/sentry/a0;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Lio/sentry/a0;->C(Ljava/lang/String;)Lio/sentry/a0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static r()Lio/sentry/a0;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lio/sentry/g2;->s(Z)Lio/sentry/a0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static s(Z)Lio/sentry/a0;
    .locals 2

    .line 1
    sget-boolean v0, Lio/sentry/g2;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {}, Lio/sentry/g2;->u()Lio/sentry/b0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lio/sentry/b0;->get()Lio/sentry/a0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Lio/sentry/a0;->s()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-object v0

    .line 26
    :cond_2
    :goto_0
    if-nez p0, :cond_3

    .line 27
    .line 28
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_3
    sget-object p0, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 34
    .line 35
    const-string v0, "getCurrentScopes"

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lio/sentry/a0;->C(Ljava/lang/String;)Lio/sentry/a0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {}, Lio/sentry/g2;->u()Lio/sentry/b0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0, p0}, Lio/sentry/b0;->b(Lio/sentry/a0;)Lio/sentry/e0;

    .line 46
    .line 47
    .line 48
    return-object p0
.end method

.method public static t()Lio/sentry/Y;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/g2;->c:Lio/sentry/Y;

    .line 2
    .line 3
    return-object v0
.end method

.method private static u()Lio/sentry/b0;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/g2;->a:Lio/sentry/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method private static v(Lio/sentry/z3;Lio/sentry/d0;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lio/sentry/a2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/sentry/a2;-><init>(Lio/sentry/z3;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 16
    .line 17
    const-string v1, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?"

    .line 18
    .line 19
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static w(Lio/sentry/l1;Lio/sentry/g2$a;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/l1;->b()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/sentry/z3;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lio/sentry/g2;->i(Lio/sentry/g2$a;Lio/sentry/z3;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p2}, Lio/sentry/g2;->x(Lio/sentry/z3;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static x(Lio/sentry/z3;Z)V
    .locals 7

    .line 1
    sget-object v0, Lio/sentry/g2;->g:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "io.sentry.android.core.SentryAndroidOptions"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lio/sentry/util/y;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "You are running Android. Please, use SentryAndroid.init. "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-static {p0}, Lio/sentry/g2;->J(Lio/sentry/z3;)Z

    .line 65
    .line 66
    .line 67
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/z3;->isGlobalHubMode()Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :cond_3
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 91
    .line 92
    const-string v3, "GlobalHubMode: \'%s\'"

    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sput-boolean p1, Lio/sentry/g2;->d:Z

    .line 106
    .line 107
    invoke-static {p0}, Lio/sentry/g2;->z(Lio/sentry/z3;)V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lio/sentry/g2;->c:Lio/sentry/Y;

    .line 111
    .line 112
    invoke-interface {p1}, Lio/sentry/Y;->h()Lio/sentry/z3;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {}, Lio/sentry/g2;->F()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-static {v1, p0, v2}, Lio/sentry/util/m;->d(Lio/sentry/z3;Lio/sentry/z3;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/4 v2, 0x0

    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    invoke-static {}, Lio/sentry/g2;->F()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    sget-object v3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 138
    .line 139
    const-string v4, "Sentry has been already initialized. Previous configuration will be overwritten."

    .line 140
    .line 141
    new-array v2, v2, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-interface {v1, v3, v4, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const/4 v2, 0x1

    .line 151
    invoke-interface {v1, v2}, Lio/sentry/a0;->c(Z)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p1, p0}, Lio/sentry/Y;->q(Lio/sentry/z3;)V

    .line 155
    .line 156
    .line 157
    new-instance v1, Lio/sentry/E1;

    .line 158
    .line 159
    invoke-direct {v1, p0}, Lio/sentry/E1;-><init>(Lio/sentry/z3;)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Lio/sentry/E1;

    .line 163
    .line 164
    invoke-direct {v2, p0}, Lio/sentry/E1;-><init>(Lio/sentry/z3;)V

    .line 165
    .line 166
    .line 167
    new-instance v3, Lio/sentry/P1;

    .line 168
    .line 169
    const-string v4, "Sentry.init"

    .line 170
    .line 171
    invoke-direct {v3, v1, v2, p1, v4}, Lio/sentry/P1;-><init>(Lio/sentry/Y;Lio/sentry/Y;Lio/sentry/Y;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sput-object v3, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 175
    .line 176
    invoke-static {p0}, Lio/sentry/g2;->C(Lio/sentry/z3;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p0}, Lio/sentry/g2;->A(Lio/sentry/z3;)V

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lio/sentry/g2;->u()Lio/sentry/b0;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    sget-object v2, Lio/sentry/g2;->b:Lio/sentry/a0;

    .line 187
    .line 188
    invoke-interface {v1, v2}, Lio/sentry/b0;->b(Lio/sentry/a0;)Lio/sentry/e0;

    .line 189
    .line 190
    .line 191
    invoke-static {p0}, Lio/sentry/g2;->y(Lio/sentry/z3;)V

    .line 192
    .line 193
    .line 194
    new-instance v1, Lio/sentry/m2;

    .line 195
    .line 196
    invoke-direct {v1, p0}, Lio/sentry/m2;-><init>(Lio/sentry/z3;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {p1, v1}, Lio/sentry/Y;->D(Lio/sentry/c0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-interface {p1}, Lio/sentry/d0;->isClosed()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_5

    .line 211
    .line 212
    new-instance p1, Lio/sentry/Z2;

    .line 213
    .line 214
    invoke-direct {p1, p0}, Lio/sentry/Z2;-><init>(Lio/sentry/z3;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p1}, Lio/sentry/z3;->setExecutorService(Lio/sentry/d0;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-interface {p1}, Lio/sentry/d0;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    .line 226
    .line 227
    :cond_5
    :try_start_2
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    new-instance v1, Lio/sentry/Z1;

    .line 232
    .line 233
    invoke-direct {v1, p0}, Lio/sentry/Z1;-><init>(Lio/sentry/z3;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p1, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :catch_0
    move-exception p1

    .line 241
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 246
    .line 247
    const-string v3, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?"

    .line 248
    .line 249
    invoke-interface {v1, v2, v3, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_1
    invoke-static {p0}, Lio/sentry/g2;->H(Lio/sentry/z3;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_6

    .line 268
    .line 269
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Lio/sentry/p0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 274
    .line 275
    :try_start_4
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-interface {v1, v2, p0}, Lio/sentry/p0;->g(Lio/sentry/a0;Lio/sentry/z3;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :catchall_1
    move-exception v2

    .line 284
    :try_start_5
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    sget-object v4, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 289
    .line 290
    new-instance v5, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v6, "Failed to register the integration "

    .line 296
    .line 297
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-interface {v3, v4, v1, v2}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_6
    invoke-static {p0}, Lio/sentry/g2;->I(Lio/sentry/z3;)V

    .line 320
    .line 321
    .line 322
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {p0, p1}, Lio/sentry/g2;->o(Lio/sentry/z3;Lio/sentry/a0;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-static {p0, p1}, Lio/sentry/g2;->v(Lio/sentry/z3;Lio/sentry/d0;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 341
    .line 342
    const-string v2, "Using openTelemetryMode %s"

    .line 343
    .line 344
    invoke-virtual {p0}, Lio/sentry/z3;->getOpenTelemetryMode()Lio/sentry/t3;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-interface {p1, v1, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    const-string v2, "Using span factory %s"

    .line 360
    .line 361
    invoke-virtual {p0}, Lio/sentry/z3;->getSpanFactory()Lio/sentry/i0;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-interface {p1, v1, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    const-string p1, "Using scopes storage %s"

    .line 385
    .line 386
    sget-object v2, Lio/sentry/g2;->a:Lio/sentry/b0;

    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-interface {p0, v1, p1, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto :goto_3

    .line 404
    :cond_7
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    sget-object p1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 409
    .line 410
    const-string v1, "This init call has been ignored due to priority being too low."

    .line 411
    .line 412
    new-array v2, v2, [Ljava/lang/Object;

    .line 413
    .line 414
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 415
    .line 416
    .line 417
    :goto_3
    if-eqz v0, :cond_8

    .line 418
    .line 419
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 420
    .line 421
    .line 422
    :cond_8
    return-void

    .line 423
    :goto_4
    if-eqz v0, :cond_9

    .line 424
    .line 425
    :try_start_6
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 426
    .line 427
    .line 428
    goto :goto_5

    .line 429
    :catchall_2
    move-exception p1

    .line 430
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 431
    .line 432
    .line 433
    :cond_9
    :goto_5
    throw p0
.end method

.method private static y(Lio/sentry/z3;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/z3;->getDsn()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "Initializing SDK with DSN: \'%s\'"

    .line 16
    .line 17
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/z3;->getOutboxPath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    new-instance v0, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lio/sentry/z3;->getRuntimeManager()Lio/sentry/util/runtime/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, Lio/sentry/b2;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Lio/sentry/b2;-><init>(Ljava/io/File;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v2}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v2, "No outbox dir path is defined in options."

    .line 46
    .line 47
    new-array v4, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p0}, Lio/sentry/z3;->getCacheDirPath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    new-instance v1, Ljava/io/File;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lio/sentry/z3;->getRuntimeManager()Lio/sentry/util/runtime/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v2, Lio/sentry/c2;

    .line 68
    .line 69
    invoke-direct {v2, v1}, Lio/sentry/c2;-><init>(Ljava/io/File;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v2}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lio/sentry/z3;->getEnvelopeDiskCache()Lio/sentry/cache/g;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    instance-of v0, v0, Lio/sentry/transport/r;

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    invoke-static {p0}, Lio/sentry/cache/f;->y(Lio/sentry/z3;)Lio/sentry/cache/g;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setEnvelopeDiskCache(Lio/sentry/cache/g;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {p0}, Lio/sentry/z3;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0}, Lio/sentry/z3;->isProfilingEnabled()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {p0}, Lio/sentry/z3;->isContinuousProfilingEnabled()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    :cond_2
    if-eqz v0, :cond_3

    .line 107
    .line 108
    new-instance v1, Ljava/io/File;

    .line 109
    .line 110
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lio/sentry/z3;->getRuntimeManager()Lio/sentry/util/runtime/a;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v2, Lio/sentry/d2;

    .line 118
    .line 119
    invoke-direct {v2, v1}, Lio/sentry/d2;-><init>(Ljava/io/File;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0, v2}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v2, Lio/sentry/e2;

    .line 130
    .line 131
    invoke-direct {v2, v1}, Lio/sentry/e2;-><init>(Ljava/io/File;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, v2}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :catch_0
    move-exception v0

    .line 139
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 144
    .line 145
    const-string v4, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?"

    .line 146
    .line 147
    invoke-interface {v1, v2, v4, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lio/sentry/z3;->getModulesLoader()Lio/sentry/internal/modules/b;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p0}, Lio/sentry/z3;->isSendModules()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_4

    .line 159
    .line 160
    invoke-static {}, Lio/sentry/internal/modules/e;->b()Lio/sentry/internal/modules/e;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setModulesLoader(Lio/sentry/internal/modules/b;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    instance-of v0, v0, Lio/sentry/internal/modules/e;

    .line 169
    .line 170
    if-eqz v0, :cond_5

    .line 171
    .line 172
    new-instance v0, Lio/sentry/internal/modules/a;

    .line 173
    .line 174
    new-instance v1, Lio/sentry/internal/modules/c;

    .line 175
    .line 176
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-direct {v1, v2}, Lio/sentry/internal/modules/c;-><init>(Lio/sentry/ILogger;)V

    .line 181
    .line 182
    .line 183
    new-instance v2, Lio/sentry/internal/modules/f;

    .line 184
    .line 185
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-direct {v2, v4}, Lio/sentry/internal/modules/f;-><init>(Lio/sentry/ILogger;)V

    .line 190
    .line 191
    .line 192
    const/4 v4, 0x2

    .line 193
    new-array v4, v4, [Lio/sentry/internal/modules/b;

    .line 194
    .line 195
    aput-object v1, v4, v3

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    aput-object v2, v4, v1

    .line 199
    .line 200
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-direct {v0, v1, v2}, Lio/sentry/internal/modules/a;-><init>(Ljava/util/List;Lio/sentry/ILogger;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setModulesLoader(Lio/sentry/internal/modules/b;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lio/sentry/z3;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    instance-of v0, v0, Lio/sentry/internal/debugmeta/b;

    .line 219
    .line 220
    if-eqz v0, :cond_6

    .line 221
    .line 222
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    .line 223
    .line 224
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {v0, v1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/ILogger;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    .line 232
    .line 233
    .line 234
    :cond_6
    invoke-virtual {p0}, Lio/sentry/z3;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v0}, Lio/sentry/internal/debugmeta/a;->a()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {p0, v0}, Lio/sentry/util/d;->a(Lio/sentry/z3;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lio/sentry/z3;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    instance-of v0, v0, Lio/sentry/util/thread/b;

    .line 250
    .line 251
    if-eqz v0, :cond_7

    .line 252
    .line 253
    invoke-static {}, Lio/sentry/util/thread/c;->d()Lio/sentry/util/thread/c;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setThreadChecker(Lio/sentry/util/thread/a;)V

    .line 258
    .line 259
    .line 260
    :cond_7
    invoke-virtual {p0}, Lio/sentry/z3;->getPerformanceCollectors()Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_8

    .line 269
    .line 270
    new-instance v0, Lio/sentry/q0;

    .line 271
    .line 272
    invoke-direct {v0}, Lio/sentry/q0;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addPerformanceCollector(Lio/sentry/U;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    invoke-virtual {p0}, Lio/sentry/z3;->isEnableBackpressureHandling()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_a

    .line 283
    .line 284
    invoke-static {}, Lio/sentry/util/y;->c()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_a

    .line 289
    .line 290
    invoke-virtual {p0}, Lio/sentry/z3;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    instance-of v0, v0, Lio/sentry/backpressure/c;

    .line 295
    .line 296
    if-eqz v0, :cond_9

    .line 297
    .line 298
    new-instance v0, Lio/sentry/backpressure/a;

    .line 299
    .line 300
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-direct {v0, p0, v1}, Lio/sentry/backpressure/a;-><init>(Lio/sentry/z3;Lio/sentry/a0;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setBackpressureMonitor(Lio/sentry/backpressure/b;)V

    .line 308
    .line 309
    .line 310
    :cond_9
    invoke-virtual {p0}, Lio/sentry/z3;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v0}, Lio/sentry/backpressure/b;->start()V

    .line 315
    .line 316
    .line 317
    :cond_a
    invoke-static {p0}, Lio/sentry/g2;->B(Lio/sentry/z3;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 325
    .line 326
    invoke-virtual {p0}, Lio/sentry/z3;->isContinuousProfilingEnabled()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {p0}, Lio/sentry/z3;->getProfileLifecycle()Lio/sentry/t1;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    const-string v2, "Continuous profiler is enabled %s mode: %s"

    .line 343
    .line 344
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void
.end method

.method private static z(Lio/sentry/z3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getFatalLogger()Lio/sentry/ILogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lio/sentry/N0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/e4;

    .line 10
    .line 11
    invoke-direct {v0}, Lio/sentry/e4;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setFatalLogger(Lio/sentry/ILogger;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
