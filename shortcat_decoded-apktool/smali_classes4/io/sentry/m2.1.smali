.class public final Lio/sentry/m2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/m2$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private final b:Lio/sentry/z3;

.field private final c:Lio/sentry/transport/p;

.field private final d:Lio/sentry/m2$b;

.field private final e:Lio/sentry/logger/c;

.field private final f:Lio/sentry/metrics/c;


# direct methods
.method public constructor <init>(Lio/sentry/z3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/m2$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lio/sentry/m2$b;-><init>(Lio/sentry/m2$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/m2;->d:Lio/sentry/m2$b;

    .line 11
    .line 12
    const-string v0, "SentryOptions is required."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lio/sentry/z3;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lio/sentry/m2;->a:Z

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/sentry/z3;->getTransportFactory()Lio/sentry/l0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, Lio/sentry/h1;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    new-instance v0, Lio/sentry/a;

    .line 34
    .line 35
    invoke-direct {v0}, Lio/sentry/a;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setTransportFactory(Lio/sentry/l0;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    new-instance v1, Lio/sentry/C1;

    .line 42
    .line 43
    invoke-direct {v1, p1}, Lio/sentry/C1;-><init>(Lio/sentry/z3;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lio/sentry/C1;->a()Lio/sentry/B1;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, p1, v1}, Lio/sentry/l0;->a(Lio/sentry/z3;Lio/sentry/B1;)Lio/sentry/transport/p;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 55
    .line 56
    invoke-virtual {p1}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lio/sentry/z3$h;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p1}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lio/sentry/z3$h;->a()Lio/sentry/logger/d;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0, p1, p0}, Lio/sentry/logger/d;->a(Lio/sentry/z3;Lio/sentry/m2;)Lio/sentry/logger/c;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lio/sentry/m2;->e:Lio/sentry/logger/c;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-static {}, Lio/sentry/logger/h;->a()Lio/sentry/logger/h;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lio/sentry/m2;->e:Lio/sentry/logger/c;

    .line 86
    .line 87
    :goto_0
    invoke-virtual {p1}, Lio/sentry/z3;->getMetrics()Lio/sentry/z3$i;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lio/sentry/z3$i;->b()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Lio/sentry/z3;->getMetrics()Lio/sentry/z3$i;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lio/sentry/z3$i;->a()Lio/sentry/metrics/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v0, p1, p0}, Lio/sentry/metrics/d;->a(Lio/sentry/z3;Lio/sentry/m2;)Lio/sentry/metrics/c;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lio/sentry/m2;->f:Lio/sentry/metrics/c;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    invoke-static {}, Lio/sentry/metrics/h;->a()Lio/sentry/metrics/h;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lio/sentry/m2;->f:Lio/sentry/metrics/c;

    .line 117
    .line 118
    return-void
.end method

.method private A(Lio/sentry/Y;Lio/sentry/H;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lio/sentry/Y;->j()Lio/sentry/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const-class v0, Lio/sentry/hints/r;

    .line 8
    .line 9
    invoke-static {p2, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p2}, Lio/sentry/util/l;->e(Lio/sentry/H;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lio/sentry/hints/f;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast v0, Lio/sentry/hints/f;

    .line 25
    .line 26
    invoke-interface {p1}, Lio/sentry/j0;->f()Lio/sentry/protocol/x;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Lio/sentry/hints/f;->d(Lio/sentry/protocol/x;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lio/sentry/a4;->ABORTED:Lio/sentry/a4;

    .line 34
    .line 35
    invoke-interface {p1, v0, v2, p2}, Lio/sentry/j0;->a(Lio/sentry/a4;ZLio/sentry/H;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object p2, Lio/sentry/a4;->ABORTED:Lio/sentry/a4;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-interface {p1, p2, v2, v0}, Lio/sentry/j0;->a(Lio/sentry/a4;ZLio/sentry/H;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method private B(Lio/sentry/H;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lio/sentry/H;->e()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lio/sentry/H;->g()Lio/sentry/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lio/sentry/H;->i()Lio/sentry/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1}, Lio/sentry/H;->h()Lio/sentry/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    return-object v0
.end method

.method private C(Lio/sentry/Y;Lio/sentry/H;Lio/sentry/j2;Ljava/lang/String;)Lio/sentry/f4;
    .locals 1

    .line 1
    const-class v0, Lio/sentry/hints/c;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    if-eqz p3, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 12
    .line 13
    invoke-static {p3, p4, p1}, Lio/sentry/d;->c(Lio/sentry/j2;Ljava/lang/String;Lio/sentry/z3;)Lio/sentry/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lio/sentry/d;->J()Lio/sentry/f4;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-interface {p1}, Lio/sentry/Y;->j()Lio/sentry/j0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Lio/sentry/h0;->h()Lio/sentry/f4;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 36
    .line 37
    invoke-static {p1, p2}, Lio/sentry/util/H;->g(Lio/sentry/Y;Lio/sentry/z3;)Lio/sentry/x1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lio/sentry/x1;->h()Lio/sentry/f4;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    return-object p1
.end method

.method private D(Lio/sentry/Y;Lio/sentry/H;Lio/sentry/V2;)Lio/sentry/f4;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Lio/sentry/V2;->w0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/m2;->C(Lio/sentry/Y;Lio/sentry/H;Lio/sentry/j2;Ljava/lang/String;)Lio/sentry/f4;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private E(Lio/sentry/V2;Lio/sentry/H;Ljava/util/List;)Lio/sentry/V2;
    .locals 6

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lio/sentry/C;

    .line 16
    .line 17
    :try_start_0
    instance-of v1, v0, Lio/sentry/c;

    .line 18
    .line 19
    const-class v2, Lio/sentry/hints/c;

    .line 20
    .line 21
    invoke-static {p2, v2}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v0, p1, p2}, Lio/sentry/C;->b(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-nez v2, :cond_2

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v0, p1, p2}, Lio/sentry/C;->b(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :goto_0
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 46
    .line 47
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "An exception occurred while processing event by processor: %s"

    .line 66
    .line 67
    invoke-interface {v2, v3, v1, v5, v4}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    if-nez p1, :cond_0

    .line 71
    .line 72
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 73
    .line 74
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "Event was dropped by a processor: %s"

    .line 93
    .line 94
    invoke-interface {p2, p3, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 98
    .line 99
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    sget-object p3, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 104
    .line 105
    sget-object v0, Lio/sentry/k;->Error:Lio/sentry/k;

    .line 106
    .line 107
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-object p1
.end method

.method private F(Lio/sentry/A3;Lio/sentry/H;Ljava/util/List;)Lio/sentry/A3;
    .locals 6

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lio/sentry/C;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/C;->a(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/A3;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 24
    .line 25
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "An exception occurred while processing replay event by processor: %s"

    .line 44
    .line 45
    invoke-interface {v2, v3, v1, v5, v4}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    if-nez p1, :cond_0

    .line 49
    .line 50
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 51
    .line 52
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "Replay event was dropped by a processor: %s"

    .line 71
    .line 72
    invoke-interface {p2, p3, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 76
    .line 77
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    sget-object p3, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 82
    .line 83
    sget-object v0, Lio/sentry/k;->Replay:Lio/sentry/k;

    .line 84
    .line 85
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-object p1
.end method

.method private G(Lio/sentry/protocol/E;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/E;
    .locals 7

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lio/sentry/C;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/protocol/E;->o0()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/C;->g(Lio/sentry/protocol/E;Lio/sentry/H;)Lio/sentry/protocol/E;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    iget-object v3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 32
    .line 33
    invoke-virtual {v3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sget-object v4, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v6, "An exception occurred while processing transaction by processor: %s"

    .line 52
    .line 53
    invoke-interface {v3, v4, v2, v6, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    if-nez p1, :cond_1

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-virtual {p1}, Lio/sentry/protocol/E;->o0()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :goto_2
    if-nez p1, :cond_2

    .line 69
    .line 70
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 71
    .line 72
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v2, "Transaction was dropped by a processor: %s"

    .line 91
    .line 92
    invoke-interface {p2, p3, v2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 96
    .line 97
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    sget-object p3, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 102
    .line 103
    sget-object v0, Lio/sentry/k;->Transaction:Lio/sentry/k;

    .line 104
    .line 105
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 106
    .line 107
    .line 108
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 109
    .line 110
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    sget-object v0, Lio/sentry/k;->Span:Lio/sentry/k;

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    int-to-long v1, v1

    .line 119
    invoke-interface {p2, p3, v0, v1, v2}, Lio/sentry/clientreport/h;->c(Lio/sentry/clientreport/f;Lio/sentry/k;J)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_2
    if-ge v2, v1, :cond_0

    .line 124
    .line 125
    sub-int/2addr v1, v2

    .line 126
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 127
    .line 128
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-object v3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v4, "%d spans were dropped by a processor: %s"

    .line 151
    .line 152
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 156
    .line 157
    invoke-virtual {v0}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v2, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 162
    .line 163
    sget-object v3, Lio/sentry/k;->Span:Lio/sentry/k;

    .line 164
    .line 165
    int-to-long v4, v1

    .line 166
    invoke-interface {v0, v2, v3, v4, v5}, Lio/sentry/clientreport/h;->c(Lio/sentry/clientreport/f;Lio/sentry/k;J)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    :goto_3
    return-object p1
.end method

.method private H()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getSampleRate()Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lio/sentry/util/B;->a()Lio/sentry/util/z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 16
    .line 17
    invoke-virtual {v1}, Lio/sentry/z3;->getSampleRate()Ljava/lang/Double;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 27
    .line 28
    invoke-virtual {v1}, Lio/sentry/z3;->getSampleRate()Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-virtual {v0}, Lio/sentry/util/z;->c()D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    cmpg-double v0, v3, v0

    .line 41
    .line 42
    if-ltz v0, :cond_1

    .line 43
    .line 44
    return v2

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    return v0

    .line 47
    :cond_2
    return v2
.end method

.method private I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getBeforeEnvelopeCallback()Lio/sentry/z3$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/z3$b;->a(Lio/sentry/q2;Lio/sentry/H;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 15
    .line 16
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 21
    .line 22
    const-string v3, "The BeforeEnvelope callback threw an exception."

    .line 23
    .line 24
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-static {}, Lio/sentry/g3;->d()Lio/sentry/g3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 32
    .line 33
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lio/sentry/g3;->c(Lio/sentry/ILogger;)Z

    .line 38
    .line 39
    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    iget-object p2, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 43
    .line 44
    invoke-interface {p2, p1}, Lio/sentry/transport/p;->K1(Lio/sentry/q2;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 49
    .line 50
    invoke-interface {v0, p1, p2}, Lio/sentry/transport/p;->e0(Lio/sentry/q2;Lio/sentry/H;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {p1}, Lio/sentry/q2;->b()Lio/sentry/r2;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lio/sentry/r2;->a()Lio/sentry/protocol/x;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 65
    .line 66
    :goto_2
    return-object p1
.end method

.method private J(Lio/sentry/j2;Lio/sentry/H;)Z
    .locals 2

    .line 1
    invoke-static {p2}, Lio/sentry/util/l;->n(Lio/sentry/H;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 10
    .line 11
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "Event was cached so not applying scope: %s"

    .line 26
    .line 27
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method private K(Lio/sentry/O3;Lio/sentry/O3;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p2}, Lio/sentry/O3;->l()Lio/sentry/O3$b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lio/sentry/O3$b;->Crashed:Lio/sentry/O3$b;

    .line 14
    .line 15
    if-ne v2, v3, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/O3;->l()Lio/sentry/O3$b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eq v2, v3, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    invoke-virtual {p2}, Lio/sentry/O3;->e()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-lez p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/O3;->e()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gtz p1, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    return v0
.end method

.method private L(Lio/sentry/j2;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/j2;->B()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lio/sentry/m2;->d:Lio/sentry/m2$b;

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static synthetic k(Lio/sentry/O3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic l(Lio/sentry/m2;Lio/sentry/V2;Lio/sentry/H;Lio/sentry/O3;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/V2;->y0()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lio/sentry/O3$b;->Crashed:Lio/sentry/O3$b;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v1

    .line 18
    :goto_0
    sget-object v2, Lio/sentry/O3$b;->Crashed:Lio/sentry/O3$b;

    .line 19
    .line 20
    if-eq v2, p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lio/sentry/V2;->z0()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    :cond_2
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lio/sentry/protocol/o;->l()Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lio/sentry/protocol/o;->l()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "user-agent"

    .line 54
    .line 55
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lio/sentry/protocol/o;->l()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move-object p1, v1

    .line 77
    :goto_1
    invoke-static {p2}, Lio/sentry/util/l;->e(Lio/sentry/H;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    instance-of v2, p2, Lio/sentry/hints/a;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    check-cast p2, Lio/sentry/hints/a;

    .line 86
    .line 87
    invoke-interface {p2}, Lio/sentry/hints/a;->h()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object p0, Lio/sentry/O3$b;->Abnormal:Lio/sentry/O3$b;

    .line 92
    .line 93
    :cond_4
    invoke-virtual {p3, p0, p1, v0, v1}, Lio/sentry/O3;->q(Lio/sentry/O3$b;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_5

    .line 98
    .line 99
    invoke-virtual {p3}, Lio/sentry/O3;->m()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p3}, Lio/sentry/O3;->c()V

    .line 106
    .line 107
    .line 108
    :cond_5
    return-void

    .line 109
    :cond_6
    iget-object p0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 110
    .line 111
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    sget-object p1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 116
    .line 117
    const-string p2, "Session is null on scope.withSession"

    .line 118
    .line 119
    new-array p3, v0, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-interface {p0, p1, p2, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method private m(Lio/sentry/Y;Lio/sentry/H;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lio/sentry/Y;->K()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Lio/sentry/H;->a(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private p(Lio/sentry/j2;Lio/sentry/Y;)Lio/sentry/j2;
    .locals 4

    .line 1
    if-eqz p2, :cond_a

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Lio/sentry/Y;->c()Lio/sentry/protocol/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/j2;->a0(Lio/sentry/protocol/o;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lio/sentry/j2;->Q()Lio/sentry/protocol/I;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lio/sentry/Y;->z()Lio/sentry/protocol/I;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lio/sentry/j2;->f0(Lio/sentry/protocol/I;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-interface {p2}, Lio/sentry/Y;->getTags()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lio/sentry/j2;->e0(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-interface {p2}, Lio/sentry/Y;->getTags()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lio/sentry/j2;->B()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    new-instance v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-interface {p2}, Lio/sentry/Y;->r()Ljava/util/Queue;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lio/sentry/j2;->S(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-interface {p2}, Lio/sentry/Y;->r()Ljava/util/Queue;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p0, p1, v0}, Lio/sentry/m2;->L(Lio/sentry/j2;Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-virtual {p1}, Lio/sentry/j2;->H()Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-nez v0, :cond_6

    .line 137
    .line 138
    new-instance v0, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-interface {p2}, Lio/sentry/Y;->getExtras()Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lio/sentry/j2;->X(Ljava/util/Map;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    invoke-interface {p2}, Lio/sentry/Y;->getExtras()Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Ljava/util/Map$Entry;

    .line 174
    .line 175
    invoke-virtual {p1}, Lio/sentry/j2;->H()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_7

    .line 188
    .line 189
    invoke-virtual {p1}, Lio/sentry/j2;->H()Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/String;

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    :goto_4
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v1, Lio/sentry/protocol/c;

    .line 212
    .line 213
    invoke-interface {p2}, Lio/sentry/Y;->v()Lio/sentry/protocol/c;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-direct {v1, p2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lio/sentry/protocol/c;->b()Ljava/util/Set;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    :cond_9
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Ljava/util/Map$Entry;

    .line 239
    .line 240
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v0, v2}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-nez v2, :cond_9

    .line 249
    .line 250
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/lang/String;

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0, v2, v1}, Lio/sentry/protocol/c;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_a
    return-object p1
.end method

.method private q(Lio/sentry/V2;Lio/sentry/Y;Lio/sentry/H;)Lio/sentry/V2;
    .locals 2

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lio/sentry/m2;->p(Lio/sentry/j2;Lio/sentry/Y;)Lio/sentry/j2;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/V2;->w0()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p2}, Lio/sentry/Y;->A()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lio/sentry/V2;->H0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Lio/sentry/V2;->q0()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p2}, Lio/sentry/Y;->y()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/V2;->B0(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {p2}, Lio/sentry/Y;->m()Lio/sentry/i3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p2}, Lio/sentry/Y;->m()Lio/sentry/i3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Lio/sentry/V2;->C0(Lio/sentry/i3;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {p2}, Lio/sentry/Y;->f()Lio/sentry/h0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lio/sentry/protocol/c;->j()Lio/sentry/T3;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_4

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {p2}, Lio/sentry/Y;->H()Lio/sentry/x1;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lio/sentry/i4;->x(Lio/sentry/x1;)Lio/sentry/i4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->z(Lio/sentry/T3;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0}, Lio/sentry/h0;->q()Lio/sentry/T3;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v0}, Lio/sentry/protocol/c;->z(Lio/sentry/T3;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Lio/sentry/protocol/c;->f()Lio/sentry/protocol/g;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    invoke-interface {p2}, Lio/sentry/Y;->n()Lio/sentry/protocol/g;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v0}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/g;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-interface {p2}, Lio/sentry/Y;->Q()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-direct {p0, p1, p3, p2}, Lio/sentry/m2;->E(Lio/sentry/V2;Lio/sentry/H;Ljava/util/List;)Lio/sentry/V2;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :cond_6
    return-object p1
.end method

.method private r(Lio/sentry/A3;Lio/sentry/Y;)Lio/sentry/A3;
    .locals 4

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/j2;->K()Lio/sentry/protocol/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Lio/sentry/Y;->c()Lio/sentry/protocol/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/j2;->a0(Lio/sentry/protocol/o;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lio/sentry/j2;->Q()Lio/sentry/protocol/I;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lio/sentry/Y;->z()Lio/sentry/protocol/I;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lio/sentry/j2;->f0(Lio/sentry/protocol/I;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-interface {p2}, Lio/sentry/Y;->getTags()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lio/sentry/j2;->e0(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-interface {p2}, Lio/sentry/Y;->getTags()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Lio/sentry/j2;->N()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Lio/sentry/protocol/c;

    .line 111
    .line 112
    invoke-interface {p2}, Lio/sentry/Y;->v()Lio/sentry/protocol/c;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-direct {v1, v2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lio/sentry/protocol/c;->b()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Ljava/util/Map$Entry;

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v0, v3}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_5

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v0, v3, v2}, Lio/sentry/protocol/c;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_6
    invoke-interface {p2}, Lio/sentry/Y;->f()Lio/sentry/h0;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lio/sentry/protocol/c;->j()Lio/sentry/T3;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-nez v1, :cond_8

    .line 176
    .line 177
    if-nez v0, :cond_7

    .line 178
    .line 179
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {p2}, Lio/sentry/Y;->H()Lio/sentry/x1;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-static {p2}, Lio/sentry/i4;->x(Lio/sentry/x1;)Lio/sentry/i4;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {v0, p2}, Lio/sentry/protocol/c;->z(Lio/sentry/T3;)V

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :cond_7
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-interface {v0}, Lio/sentry/h0;->q()Lio/sentry/T3;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p2, v0}, Lio/sentry/protocol/c;->z(Lio/sentry/T3;)V

    .line 204
    .line 205
    .line 206
    :cond_8
    return-object p1
.end method

.method private s(Lio/sentry/j2;Ljava/util/List;Lio/sentry/O3;Lio/sentry/f4;Lio/sentry/v1;)Lio/sentry/q2;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 10
    .line 11
    invoke-virtual {v2}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2, p1}, Lio/sentry/T2;->E(Lio/sentry/f0;Lio/sentry/j2;)Lio/sentry/T2;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v1

    .line 28
    :goto_0
    if-eqz p3, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 31
    .line 32
    invoke-virtual {v2}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2, p3}, Lio/sentry/T2;->K(Lio/sentry/f0;Lio/sentry/O3;)Lio/sentry/T2;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz p5, :cond_2

    .line 44
    .line 45
    iget-object p3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 46
    .line 47
    invoke-virtual {p3}, Lio/sentry/z3;->getMaxTraceFileSize()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    iget-object p3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 52
    .line 53
    invoke-virtual {p3}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-static {p5, v2, v3, p3}, Lio/sentry/T2;->I(Lio/sentry/v1;JLio/sentry/f0;)Lio/sentry/T2;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    new-instance p1, Lio/sentry/protocol/x;

    .line 67
    .line 68
    invoke-virtual {p5}, Lio/sentry/v1;->B()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-direct {p1, p3}, Lio/sentry/protocol/x;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    if-eqz p2, :cond_3

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_3

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, Lio/sentry/b;

    .line 92
    .line 93
    iget-object p5, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 94
    .line 95
    invoke-virtual {p5}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 100
    .line 101
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 106
    .line 107
    invoke-virtual {v3}, Lio/sentry/z3;->getMaxAttachmentSize()J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    invoke-static {p5, v2, p3, v3, v4}, Lio/sentry/T2;->C(Lio/sentry/f0;Lio/sentry/ILogger;Lio/sentry/b;J)Lio/sentry/T2;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-nez p2, :cond_4

    .line 124
    .line 125
    new-instance p2, Lio/sentry/r2;

    .line 126
    .line 127
    iget-object p3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 128
    .line 129
    invoke-virtual {p3}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-direct {p2, p1, p3, p4}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/r;Lio/sentry/f4;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, Lio/sentry/q2;

    .line 137
    .line 138
    invoke-direct {p1, p2, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 139
    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_4
    return-object v1
.end method

.method private t(Lio/sentry/m3;)Lio/sentry/q2;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 7
    .line 8
    invoke-virtual {v1}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lio/sentry/T2;->F(Lio/sentry/f0;Lio/sentry/m3;)Lio/sentry/T2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p1, Lio/sentry/r2;

    .line 20
    .line 21
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, v2, v1, v2}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/r;Lio/sentry/f4;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lio/sentry/q2;

    .line 32
    .line 33
    invoke-direct {v1, p1, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method private u(Lio/sentry/q3;)Lio/sentry/q2;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 7
    .line 8
    invoke-virtual {v1}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lio/sentry/T2;->G(Lio/sentry/f0;Lio/sentry/q3;)Lio/sentry/T2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p1, Lio/sentry/r2;

    .line 20
    .line 21
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, v2, v1, v2}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/r;Lio/sentry/f4;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lio/sentry/q2;

    .line 32
    .line 33
    invoke-direct {v1, p1, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method private v(Lio/sentry/A3;Lio/sentry/A1;Lio/sentry/f4;Z)Lio/sentry/q2;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 7
    .line 8
    invoke-virtual {v1}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 13
    .line 14
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2, p1, p2, p4}, Lio/sentry/T2;->J(Lio/sentry/f0;Lio/sentry/ILogger;Lio/sentry/A3;Lio/sentry/A1;Z)Lio/sentry/T2;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lio/sentry/r2;

    .line 30
    .line 31
    iget-object p4, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 32
    .line 33
    invoke-virtual {p4}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    invoke-virtual {p4}, Lio/sentry/B3;->o()Lio/sentry/protocol/r;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    invoke-direct {p2, p1, p4, p3}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/r;Lio/sentry/f4;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lio/sentry/q2;

    .line 45
    .line 46
    invoke-direct {p1, p2, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method

.method private w(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getBeforeSend()Lio/sentry/z3$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/z3$c;->a(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 16
    .line 17
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 22
    .line 23
    const-string v1, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue."

    .line 24
    .line 25
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :cond_0
    return-object p1
.end method

.method private x(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/A3;
    .locals 0

    .line 1
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/sentry/z3;->getBeforeSendReplay()Lio/sentry/z3$d;

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method private y(Lio/sentry/protocol/E;Lio/sentry/H;)Lio/sentry/protocol/E;
    .locals 0

    .line 1
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/sentry/z3;->getBeforeSendTransaction()Lio/sentry/z3$e;

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method private z(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lio/sentry/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/sentry/b;->k()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-object v0
.end method


# virtual methods
.method M(Lio/sentry/V2;Lio/sentry/H;Lio/sentry/Y;)Lio/sentry/O3;
    .locals 2

    .line 1
    invoke-static {p2}, Lio/sentry/util/l;->n(Lio/sentry/H;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    new-instance v0, Lio/sentry/l2;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, Lio/sentry/l2;-><init>(Lio/sentry/m2;Lio/sentry/V2;Lio/sentry/H;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, v0}, Lio/sentry/Y;->s(Lio/sentry/E1$b;)Lio/sentry/O3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 21
    .line 22
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    new-array p3, p3, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v0, "Scope is null on client.captureEvent"

    .line 32
    .line 33
    invoke-interface {p1, p2, v0, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v1
.end method

.method public a(Lio/sentry/A3;Lio/sentry/Y;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 6

    .line 1
    const-string v0, "SessionReplay is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    new-instance p3, Lio/sentry/H;

    .line 9
    .line 10
    invoke-direct {p3}, Lio/sentry/H;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->J(Lio/sentry/j2;Lio/sentry/H;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, Lio/sentry/m2;->r(Lio/sentry/A3;Lio/sentry/Y;)Lio/sentry/A3;

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "Capturing session replay: %s"

    .line 39
    .line 40
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 44
    .line 45
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object v2, v0

    .line 57
    :goto_0
    iget-object v3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 58
    .line 59
    invoke-virtual {v3}, Lio/sentry/z3;->getEventProcessors()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {p0, p1, p3, v3}, Lio/sentry/m2;->F(Lio/sentry/A3;Lio/sentry/H;Ljava/util/List;)Lio/sentry/A3;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->x(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/A3;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    iget-object v3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 76
    .line 77
    invoke-virtual {v3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/4 v4, 0x0

    .line 82
    new-array v4, v4, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v5, "Event was dropped by beforeSendReplay"

    .line 85
    .line 86
    invoke-interface {v3, v1, v5, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 90
    .line 91
    invoke-virtual {v1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v3, Lio/sentry/clientreport/f;->BEFORE_SEND:Lio/sentry/clientreport/f;

    .line 96
    .line 97
    sget-object v4, Lio/sentry/k;->Replay:Lio/sentry/k;

    .line 98
    .line 99
    invoke-interface {v1, v3, v4}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    if-nez p1, :cond_4

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_4
    const/4 v0, 0x0

    .line 106
    :try_start_0
    invoke-direct {p0, p2, p3, p1, v0}, Lio/sentry/m2;->C(Lio/sentry/Y;Lio/sentry/H;Lio/sentry/j2;Ljava/lang/String;)Lio/sentry/f4;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    const-class v0, Lio/sentry/hints/c;

    .line 111
    .line 112
    invoke-static {p3, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {p3}, Lio/sentry/H;->f()Lio/sentry/A1;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {p0, p1, v1, p2, v0}, Lio/sentry/m2;->v(Lio/sentry/A3;Lio/sentry/A1;Lio/sentry/f4;Z)Lio/sentry/q2;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p3}, Lio/sentry/H;->b()V

    .line 125
    .line 126
    .line 127
    iget-object p2, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 128
    .line 129
    invoke-interface {p2, p1, p3}, Lio/sentry/transport/p;->e0(Lio/sentry/q2;Lio/sentry/H;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    return-object v2

    .line 133
    :catch_0
    move-exception p1

    .line 134
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 135
    .line 136
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 141
    .line 142
    const-string v0, "Capturing event %s failed."

    .line 143
    .line 144
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {p2, p3, p1, v0, v1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 152
    .line 153
    return-object p1
.end method

.method public b(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/Y;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;
    .locals 11

    .line 1
    const-string v0, "Transaction is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p4, :cond_0

    .line 7
    .line 8
    new-instance p4, Lio/sentry/H;

    .line 9
    .line 10
    invoke-direct {p4}, Lio/sentry/H;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p4}, Lio/sentry/m2;->J(Lio/sentry/j2;Lio/sentry/H;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, p3, p4}, Lio/sentry/m2;->m(Lio/sentry/Y;Lio/sentry/H;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "Capturing transaction: %s"

    .line 39
    .line 40
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 44
    .line 45
    invoke-virtual {v0}, Lio/sentry/z3;->getIgnoredTransactions()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lio/sentry/protocol/E;->p0()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v0, v2}, Lio/sentry/util/H;->f(Ljava/util/List;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 60
    .line 61
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1}, Lio/sentry/protocol/E;->p0()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    const-string p4, "Transaction was dropped as transaction name %s is ignored"

    .line 74
    .line 75
    invoke-interface {p2, v1, p4, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 79
    .line 80
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object p3, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 85
    .line 86
    sget-object p4, Lio/sentry/k;->Transaction:Lio/sentry/k;

    .line 87
    .line 88
    invoke-interface {p2, p3, p4}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 92
    .line 93
    invoke-virtual {p2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object p4, Lio/sentry/k;->Span:Lio/sentry/k;

    .line 98
    .line 99
    invoke-virtual {p1}, Lio/sentry/protocol/E;->o0()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    add-int/lit8 p1, p1, 0x1

    .line 108
    .line 109
    int-to-long v0, p1

    .line 110
    invoke-interface {p2, p3, p4, v0, v1}, Lio/sentry/clientreport/h;->c(Lio/sentry/clientreport/f;Lio/sentry/k;J)V

    .line 111
    .line 112
    .line 113
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_2
    sget-object v0, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 117
    .line 118
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    goto :goto_0

    .line 129
    :cond_3
    move-object v2, v0

    .line 130
    :goto_0
    invoke-direct {p0, p1, p4}, Lio/sentry/m2;->J(Lio/sentry/j2;Lio/sentry/H;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const/4 v4, 0x0

    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->p(Lio/sentry/j2;Lio/sentry/Y;)Lio/sentry/j2;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lio/sentry/protocol/E;

    .line 142
    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    if-eqz p3, :cond_4

    .line 146
    .line 147
    invoke-interface {p3}, Lio/sentry/Y;->Q()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-direct {p0, p1, p4, p3}, Lio/sentry/m2;->G(Lio/sentry/protocol/E;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/E;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :cond_4
    if-nez p1, :cond_5

    .line 156
    .line 157
    iget-object p3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 158
    .line 159
    invoke-virtual {p3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    const-string v3, "Transaction was dropped by applyScope"

    .line 164
    .line 165
    new-array v5, v4, [Ljava/lang/Object;

    .line 166
    .line 167
    invoke-interface {p3, v1, v3, v5}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    if-eqz p1, :cond_6

    .line 171
    .line 172
    iget-object p3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 173
    .line 174
    invoke-virtual {p3}, Lio/sentry/z3;->getEventProcessors()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-direct {p0, p1, p4, p3}, Lio/sentry/m2;->G(Lio/sentry/protocol/E;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/E;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    :cond_6
    if-nez p1, :cond_7

    .line 183
    .line 184
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 185
    .line 186
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string p2, "Transaction was dropped by Event processors."

    .line 191
    .line 192
    new-array p3, v4, [Ljava/lang/Object;

    .line 193
    .line 194
    invoke-interface {p1, v1, p2, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_7
    invoke-virtual {p1}, Lio/sentry/protocol/E;->o0()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    invoke-direct {p0, p1, p4}, Lio/sentry/m2;->y(Lio/sentry/protocol/E;Lio/sentry/H;)Lio/sentry/protocol/E;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    if-nez v6, :cond_8

    .line 211
    .line 212
    move p1, v4

    .line 213
    goto :goto_1

    .line 214
    :cond_8
    invoke-virtual {v6}, Lio/sentry/protocol/E;->o0()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    :goto_1
    if-nez v6, :cond_9

    .line 223
    .line 224
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 225
    .line 226
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    const-string p2, "Transaction was dropped by beforeSendTransaction."

    .line 231
    .line 232
    new-array p4, v4, [Ljava/lang/Object;

    .line 233
    .line 234
    invoke-interface {p1, v1, p2, p4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 238
    .line 239
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    sget-object p2, Lio/sentry/clientreport/f;->BEFORE_SEND:Lio/sentry/clientreport/f;

    .line 244
    .line 245
    sget-object p4, Lio/sentry/k;->Transaction:Lio/sentry/k;

    .line 246
    .line 247
    invoke-interface {p1, p2, p4}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 248
    .line 249
    .line 250
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 251
    .line 252
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    sget-object p4, Lio/sentry/k;->Span:Lio/sentry/k;

    .line 257
    .line 258
    add-int/lit8 p3, p3, 0x1

    .line 259
    .line 260
    int-to-long v1, p3

    .line 261
    invoke-interface {p1, p2, p4, v1, v2}, Lio/sentry/clientreport/h;->c(Lio/sentry/clientreport/f;Lio/sentry/k;J)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_9
    if-ge p1, p3, :cond_a

    .line 266
    .line 267
    sub-int/2addr p3, p1

    .line 268
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 269
    .line 270
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const-string v3, "%d spans were dropped by beforeSendTransaction."

    .line 283
    .line 284
    invoke-interface {p1, v1, v3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 288
    .line 289
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    sget-object v0, Lio/sentry/clientreport/f;->BEFORE_SEND:Lio/sentry/clientreport/f;

    .line 294
    .line 295
    sget-object v1, Lio/sentry/k;->Span:Lio/sentry/k;

    .line 296
    .line 297
    int-to-long v3, p3

    .line 298
    invoke-interface {p1, v0, v1, v3, v4}, Lio/sentry/clientreport/h;->c(Lio/sentry/clientreport/f;Lio/sentry/k;J)V

    .line 299
    .line 300
    .line 301
    :cond_a
    :try_start_0
    invoke-direct {p0, p4}, Lio/sentry/m2;->B(Lio/sentry/H;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-direct {p0, p1}, Lio/sentry/m2;->z(Ljava/util/List;)Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    const/4 v8, 0x0

    .line 310
    move-object v5, p0

    .line 311
    move-object v9, p2

    .line 312
    move-object/from16 v10, p5

    .line 313
    .line 314
    invoke-direct/range {v5 .. v10}, Lio/sentry/m2;->s(Lio/sentry/j2;Ljava/util/List;Lio/sentry/O3;Lio/sentry/f4;Lio/sentry/v1;)Lio/sentry/q2;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p4}, Lio/sentry/H;->b()V

    .line 319
    .line 320
    .line 321
    if-eqz p1, :cond_b

    .line 322
    .line 323
    invoke-direct {p0, p1, p4}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 324
    .line 325
    .line 326
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    return-object p1

    .line 328
    :catch_0
    move-exception v0

    .line 329
    :goto_2
    move-object p1, v0

    .line 330
    goto :goto_3

    .line 331
    :catch_1
    move-exception v0

    .line 332
    goto :goto_2

    .line 333
    :cond_b
    return-object v2

    .line 334
    :goto_3
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 335
    .line 336
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 341
    .line 342
    const-string p4, "Capturing transaction %s failed."

    .line 343
    .line 344
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-interface {p2, p3, p1, p4, v0}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 352
    .line 353
    return-object p1
.end method

.method public c(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "Closing SentryClient."

    .line 13
    .line 14
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/z3;->getShutdownTimeoutMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    invoke-virtual {p0, v0, v1}, Lio/sentry/m2;->d(J)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/sentry/m2;->e:Lio/sentry/logger/c;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lio/sentry/logger/c;->c(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lio/sentry/m2;->f:Lio/sentry/metrics/c;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Lio/sentry/metrics/c;->c(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Lio/sentry/transport/p;->c(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catch_0
    move-exception p1

    .line 48
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 49
    .line 50
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 55
    .line 56
    const-string v3, "Failed to close the connection to the Sentry Server."

    .line 57
    .line 58
    invoke-interface {v0, v1, v3, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 62
    .line 63
    invoke-virtual {p1}, Lio/sentry/z3;->getEventProcessors()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_1
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lio/sentry/C;

    .line 82
    .line 83
    instance-of v1, v0, Ljava/io/Closeable;

    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    :try_start_1
    move-object v1, v0

    .line 88
    check-cast v1, Ljava/io/Closeable;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catch_1
    move-exception v1

    .line 95
    iget-object v3, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 96
    .line 97
    invoke-virtual {v3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sget-object v4, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 102
    .line 103
    const-string v5, "Failed to close the event processor {}."

    .line 104
    .line 105
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v3, v4, v5, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    iput-boolean v2, p0, Lio/sentry/m2;->a:Z

    .line 114
    .line 115
    return-void
.end method

.method public d(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->e:Lio/sentry/logger/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lio/sentry/logger/c;->d(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/m2;->f:Lio/sentry/metrics/c;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lio/sentry/metrics/c;->d(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Lio/sentry/transport/p;->d(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(Lio/sentry/O3;Lio/sentry/H;)V
    .locals 2

    .line 1
    const-string v0, "Session is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/O3;->h()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/O3;->h()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 30
    .line 31
    invoke-virtual {v1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, p1, v1}, Lio/sentry/q2;->a(Lio/sentry/f0;Lio/sentry/O3;Lio/sentry/protocol/r;)Lio/sentry/q2;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    invoke-virtual {p0, p1, p2}, Lio/sentry/m2;->o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p1

    .line 44
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 45
    .line 46
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 51
    .line 52
    const-string v1, "Failed to capture session."

    .line 53
    .line 54
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    :goto_0
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 59
    .line 60
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    const-string v1, "Sessions can\'t be captured without setting a release."

    .line 70
    .line 71
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/transport/p;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g(Lio/sentry/m3;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lio/sentry/m2;->t(Lio/sentry/m3;)Lio/sentry/q2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v3, "Capturing logs failed."

    .line 23
    .line 24
    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public h(Lio/sentry/q3;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lio/sentry/m2;->u(Lio/sentry/q3;)Lio/sentry/q2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v3, "Capturing metrics failed."

    .line 23
    .line 24
    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public i(Lio/sentry/r1;Lio/sentry/Y;)Lio/sentry/protocol/x;
    .locals 5

    .line 1
    const-string p2, "profileChunk is required."

    .line 2
    .line 3
    invoke-static {p1, p2}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 7
    .line 8
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 13
    .line 14
    invoke-virtual {p1}, Lio/sentry/r1;->n()Lio/sentry/protocol/x;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Capturing profile chunk: %s"

    .line 23
    .line 24
    invoke-interface {p2, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lio/sentry/r1;->n()Lio/sentry/protocol/x;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1}, Lio/sentry/r1;->o()Lio/sentry/protocol/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lio/sentry/protocol/d;->c(Lio/sentry/protocol/d;Lio/sentry/z3;)Lio/sentry/protocol/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lio/sentry/r1;->r(Lio/sentry/protocol/d;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    :try_start_0
    new-instance v0, Lio/sentry/q2;

    .line 47
    .line 48
    new-instance v1, Lio/sentry/r2;

    .line 49
    .line 50
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 51
    .line 52
    invoke-virtual {v2}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v1, p2, v2, v3}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/r;Lio/sentry/f4;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 61
    .line 62
    invoke-virtual {v2}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v4, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 67
    .line 68
    invoke-virtual {v4}, Lio/sentry/z3;->getProfilerConverter()Lio/sentry/X;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {p1, v2, v4}, Lio/sentry/T2;->H(Lio/sentry/r1;Lio/sentry/f0;Lio/sentry/X;)Lio/sentry/T2;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, v1, p1}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v0, v3}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 84
    .line 85
    .line 86
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    return-object p1

    .line 88
    :catch_0
    move-exception p1

    .line 89
    goto :goto_0

    .line 90
    :catch_1
    move-exception p1

    .line 91
    :goto_0
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 92
    .line 93
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 98
    .line 99
    const-string v2, "Capturing profile chunk %s failed."

    .line 100
    .line 101
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-interface {v0, v1, p1, v2, p2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 109
    .line 110
    return-object p1
.end method

.method public isEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/m2;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public j(Lio/sentry/V2;Lio/sentry/Y;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 11

    .line 1
    const-string v0, "SentryEvent is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    new-instance p3, Lio/sentry/H;

    .line 9
    .line 10
    invoke-direct {p3}, Lio/sentry/H;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->J(Lio/sentry/j2;Lio/sentry/H;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, p2, p3}, Lio/sentry/m2;->m(Lio/sentry/Y;Lio/sentry/H;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "Capturing event: %s"

    .line 39
    .line 40
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lio/sentry/j2;->O()Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 50
    .line 51
    invoke-virtual {v2}, Lio/sentry/z3;->getIgnoredExceptionsForType()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2, v0}, Lio/sentry/util/h;->b(Ljava/util/Set;Ljava/lang/Throwable;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 62
    .line 63
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string p3, "Event was dropped as the exception %s is ignored"

    .line 76
    .line 77
    invoke-interface {p1, v1, p3, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 81
    .line 82
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object p2, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 87
    .line 88
    sget-object p3, Lio/sentry/k;->Error:Lio/sentry/k;

    .line 89
    .line 90
    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 91
    .line 92
    .line 93
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_2
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 97
    .line 98
    invoke-virtual {v0}, Lio/sentry/z3;->getIgnoredErrors()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0, p1}, Lio/sentry/util/e;->a(Ljava/util/List;Lio/sentry/V2;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 109
    .line 110
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p1}, Lio/sentry/V2;->s0()Lio/sentry/protocol/m;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p3, "Event was dropped as it matched a string/pattern in ignoredErrors"

    .line 123
    .line 124
    invoke-interface {p2, v1, p3, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 128
    .line 129
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    sget-object p2, Lio/sentry/clientreport/f;->EVENT_PROCESSOR:Lio/sentry/clientreport/f;

    .line 134
    .line 135
    sget-object p3, Lio/sentry/k;->Error:Lio/sentry/k;

    .line 136
    .line 137
    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 138
    .line 139
    .line 140
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_3
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->J(Lio/sentry/j2;Lio/sentry/H;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v2, 0x0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/m2;->q(Lio/sentry/V2;Lio/sentry/Y;Lio/sentry/H;)Lio/sentry/V2;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-nez p1, :cond_4

    .line 155
    .line 156
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 157
    .line 158
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    const-string p2, "Event was dropped by applyScope"

    .line 163
    .line 164
    new-array p3, v2, [Ljava/lang/Object;

    .line 165
    .line 166
    invoke-interface {p1, v1, p2, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 170
    .line 171
    return-object p1

    .line 172
    :cond_4
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 173
    .line 174
    invoke-virtual {v0}, Lio/sentry/z3;->getEventProcessors()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {p0, p1, p3, v0}, Lio/sentry/m2;->E(Lio/sentry/V2;Lio/sentry/H;Ljava/util/List;)Lio/sentry/V2;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_5

    .line 183
    .line 184
    invoke-direct {p0, p1, p3}, Lio/sentry/m2;->w(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-nez p1, :cond_5

    .line 189
    .line 190
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 191
    .line 192
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v3, "Event was dropped by beforeSend"

    .line 197
    .line 198
    new-array v4, v2, [Ljava/lang/Object;

    .line 199
    .line 200
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 204
    .line 205
    invoke-virtual {v0}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v3, Lio/sentry/clientreport/f;->BEFORE_SEND:Lio/sentry/clientreport/f;

    .line 210
    .line 211
    sget-object v4, Lio/sentry/k;->Error:Lio/sentry/k;

    .line 212
    .line 213
    invoke-interface {v0, v3, v4}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 214
    .line 215
    .line 216
    :cond_5
    if-eqz p1, :cond_6

    .line 217
    .line 218
    iget-object v0, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 219
    .line 220
    invoke-static {p1, p3, v0}, Lio/sentry/util/g;->b(Lio/sentry/V2;Lio/sentry/H;Lio/sentry/z3;)Lio/sentry/V2;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    :cond_6
    if-nez p1, :cond_7

    .line 225
    .line 226
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_7
    const/4 v0, 0x0

    .line 230
    if-eqz p2, :cond_8

    .line 231
    .line 232
    new-instance v3, Lio/sentry/k2;

    .line 233
    .line 234
    invoke-direct {v3}, Lio/sentry/k2;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-interface {p2, v3}, Lio/sentry/Y;->s(Lio/sentry/E1$b;)Lio/sentry/O3;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    goto :goto_0

    .line 242
    :cond_8
    move-object v3, v0

    .line 243
    :goto_0
    if-eqz v3, :cond_a

    .line 244
    .line 245
    invoke-virtual {v3}, Lio/sentry/O3;->m()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_9

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_9
    move-object v8, v0

    .line 253
    goto :goto_2

    .line 254
    :cond_a
    :goto_1
    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/m2;->M(Lio/sentry/V2;Lio/sentry/H;Lio/sentry/Y;)Lio/sentry/O3;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    move-object v8, v4

    .line 259
    :goto_2
    invoke-direct {p0}, Lio/sentry/m2;->H()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_b

    .line 264
    .line 265
    iget-object v4, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 266
    .line 267
    invoke-virtual {v4}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {p1}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const-string v5, "Event %s was dropped due to sampling decision."

    .line 280
    .line 281
    invoke-interface {v4, v1, v5, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 285
    .line 286
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    sget-object v4, Lio/sentry/clientreport/f;->SAMPLE_RATE:Lio/sentry/clientreport/f;

    .line 291
    .line 292
    sget-object v5, Lio/sentry/k;->Error:Lio/sentry/k;

    .line 293
    .line 294
    invoke-interface {p1, v4, v5}, Lio/sentry/clientreport/h;->a(Lio/sentry/clientreport/f;Lio/sentry/k;)V

    .line 295
    .line 296
    .line 297
    move-object v6, v0

    .line 298
    goto :goto_3

    .line 299
    :cond_b
    move-object v6, p1

    .line 300
    :goto_3
    invoke-direct {p0, v3, v8}, Lio/sentry/m2;->K(Lio/sentry/O3;Lio/sentry/O3;)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-nez v6, :cond_c

    .line 305
    .line 306
    if-nez p1, :cond_c

    .line 307
    .line 308
    iget-object p1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 309
    .line 310
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const-string p2, "Not sending session update for dropped event as it did not cause the session health to change."

    .line 315
    .line 316
    new-array p3, v2, [Ljava/lang/Object;

    .line 317
    .line 318
    invoke-interface {p1, v1, p2, p3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 322
    .line 323
    return-object p1

    .line 324
    :cond_c
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 325
    .line 326
    if-eqz v6, :cond_d

    .line 327
    .line 328
    invoke-virtual {v6}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    if-eqz v1, :cond_d

    .line 333
    .line 334
    invoke-virtual {v6}, Lio/sentry/j2;->G()Lio/sentry/protocol/x;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    :cond_d
    const-class v1, Lio/sentry/hints/c;

    .line 339
    .line 340
    invoke-static {p3, v1}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    const-class v3, Lio/sentry/hints/e;

    .line 345
    .line 346
    invoke-static {p3, v3}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_e

    .line 351
    .line 352
    const-class v3, Lio/sentry/hints/b;

    .line 353
    .line 354
    invoke-static {p3, v3}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-nez v3, :cond_e

    .line 359
    .line 360
    const/4 v2, 0x1

    .line 361
    :cond_e
    if-eqz v6, :cond_10

    .line 362
    .line 363
    if-nez v1, :cond_10

    .line 364
    .line 365
    if-nez v2, :cond_10

    .line 366
    .line 367
    invoke-virtual {v6}, Lio/sentry/V2;->z0()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-nez v1, :cond_f

    .line 372
    .line 373
    invoke-virtual {v6}, Lio/sentry/V2;->y0()Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-eqz v1, :cond_10

    .line 378
    .line 379
    :cond_f
    iget-object v1, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 380
    .line 381
    invoke-virtual {v1}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v6}, Lio/sentry/V2;->y0()Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-interface {v1, v2}, Lio/sentry/z1;->l(Ljava/lang/Boolean;)V

    .line 394
    .line 395
    .line 396
    :cond_10
    :try_start_0
    invoke-direct {p0, p2, p3, v6}, Lio/sentry/m2;->D(Lio/sentry/Y;Lio/sentry/H;Lio/sentry/V2;)Lio/sentry/f4;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    if-eqz v6, :cond_11

    .line 401
    .line 402
    invoke-direct {p0, p3}, Lio/sentry/m2;->B(Lio/sentry/H;)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    :cond_11
    move-object v7, v0

    .line 407
    goto :goto_5

    .line 408
    :catch_0
    move-exception v0

    .line 409
    :goto_4
    move-object v5, p0

    .line 410
    goto :goto_6

    .line 411
    :catch_1
    move-exception v0

    .line 412
    goto :goto_4

    .line 413
    :goto_5
    const/4 v10, 0x0

    .line 414
    move-object v5, p0

    .line 415
    :try_start_1
    invoke-direct/range {v5 .. v10}, Lio/sentry/m2;->s(Lio/sentry/j2;Ljava/util/List;Lio/sentry/O3;Lio/sentry/f4;Lio/sentry/v1;)Lio/sentry/q2;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {p3}, Lio/sentry/H;->b()V

    .line 420
    .line 421
    .line 422
    if-eqz v0, :cond_12

    .line 423
    .line 424
    invoke-direct {p0, v0, p3}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 425
    .line 426
    .line 427
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lio/sentry/exception/b; {:try_start_1 .. :try_end_1} :catch_2

    .line 428
    goto :goto_7

    .line 429
    :catch_2
    move-exception v0

    .line 430
    goto :goto_6

    .line 431
    :catch_3
    move-exception v0

    .line 432
    :goto_6
    iget-object v1, v5, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 433
    .line 434
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 439
    .line 440
    const-string v3, "Capturing event %s failed."

    .line 441
    .line 442
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-interface {v1, v2, v0, v3, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 450
    .line 451
    :cond_12
    :goto_7
    if-eqz p2, :cond_13

    .line 452
    .line 453
    invoke-direct {p0, p2, p3}, Lio/sentry/m2;->A(Lio/sentry/Y;Lio/sentry/H;)V

    .line 454
    .line 455
    .line 456
    :cond_13
    return-object p1
.end method

.method public n()Lio/sentry/transport/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/m2;->c:Lio/sentry/transport/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/transport/p;->n()Lio/sentry/transport/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 2

    .line 1
    const-string v0, "SentryEnvelope is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lio/sentry/H;

    .line 9
    .line 10
    invoke-direct {p2}, Lio/sentry/H;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/H;->b()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lio/sentry/m2;->I(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception p1

    .line 22
    iget-object p2, p0, Lio/sentry/m2;->b:Lio/sentry/z3;

    .line 23
    .line 24
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 29
    .line 30
    const-string v1, "Failed to capture envelope."

    .line 31
    .line 32
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 36
    .line 37
    return-object p1
.end method
