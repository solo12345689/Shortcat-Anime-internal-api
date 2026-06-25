.class final Lio/sentry/G0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lio/sentry/z3;


# direct methods
.method constructor <init>(Lio/sentry/z3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getCacheDirPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 17
    .line 18
    const-string v3, "Cache dir is not set, not moving the previous session."

    .line 19
    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v2, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 27
    .line 28
    invoke-virtual {v2}, Lio/sentry/z3;->isEnableAutoSessionTracking()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 35
    .line 36
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 41
    .line 42
    const-string v3, "Session tracking is disabled, bailing from previous session mover."

    .line 43
    .line 44
    new-array v1, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    iget-object v1, p0, Lio/sentry/G0;->a:Lio/sentry/z3;

    .line 51
    .line 52
    invoke-virtual {v1}, Lio/sentry/z3;->getEnvelopeDiskCache()Lio/sentry/cache/g;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    instance-of v2, v1, Lio/sentry/cache/f;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-static {v0}, Lio/sentry/cache/f;->A(Ljava/lang/String;)Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v0}, Lio/sentry/cache/f;->D(Ljava/lang/String;)Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v1, Lio/sentry/cache/f;

    .line 69
    .line 70
    invoke-virtual {v1, v2, v0}, Lio/sentry/cache/f;->F(Ljava/io/File;Ljava/io/File;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lio/sentry/cache/f;->z()V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method
