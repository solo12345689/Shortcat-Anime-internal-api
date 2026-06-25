.class public final Lio/sentry/android/ndk/i;
.super Lio/sentry/H1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/z3;

.field private final b:Lio/sentry/ndk/a;


# direct methods
.method public constructor <init>(Lio/sentry/z3;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/ndk/NativeScope;

    invoke-direct {v0}, Lio/sentry/ndk/NativeScope;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/sentry/android/ndk/i;-><init>(Lio/sentry/z3;Lio/sentry/ndk/a;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/z3;Lio/sentry/ndk/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lio/sentry/H1;-><init>()V

    .line 3
    const-string v0, "The SentryOptions object is required."

    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/z3;

    iput-object p1, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 4
    const-string p1, "The NativeScope object is required."

    invoke-static {p2, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/ndk/a;

    iput-object p1, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    return-void
.end method

.method public static synthetic m(Lio/sentry/android/ndk/i;Lio/sentry/protocol/I;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 4
    .line 5
    invoke-interface {p0}, Lio/sentry/ndk/a;->e()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/protocol/I;->i()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Lio/sentry/protocol/I;->h()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1}, Lio/sentry/protocol/I;->j()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, Lio/sentry/protocol/I;->k()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p0, v0, v1, v2, p1}, Lio/sentry/ndk/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic n(Lio/sentry/android/ndk/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lio/sentry/ndk/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic p(Lio/sentry/android/ndk/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/sentry/ndk/a;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic q(Lio/sentry/android/ndk/i;Lio/sentry/e;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lio/sentry/e;->u()Lio/sentry/i3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/e;->u()Lio/sentry/i3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v3, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v3, v1

    .line 28
    :goto_0
    invoke-virtual {p1}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lio/sentry/l;->h(Ljava/util/Date;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    :try_start_0
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 47
    .line 48
    invoke-virtual {v2}, Lio/sentry/z3;->getSerializer()Lio/sentry/f0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2, v0}, Lio/sentry/f0;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :goto_1
    move-object v8, v1

    .line 60
    goto :goto_3

    .line 61
    :goto_2
    iget-object v2, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 62
    .line 63
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v4, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    new-array v5, v5, [Ljava/lang/Object;

    .line 71
    .line 72
    const-string v6, "Breadcrumb data is not serializable."

    .line 73
    .line 74
    invoke-interface {v2, v4, v0, v6, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_3
    iget-object v2, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 79
    .line 80
    invoke-virtual {p1}, Lio/sentry/e;->v()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {p1}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-interface/range {v2 .. v8}, Lio/sentry/ndk/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public static synthetic r(Lio/sentry/android/ndk/i;Lio/sentry/T3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/T3;->p()Lio/sentry/protocol/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lio/sentry/T3;->m()Lio/sentry/Y3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lio/sentry/Y3;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, v0, p1}, Lio/sentry/ndk/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic s(Lio/sentry/android/ndk/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lio/sentry/ndk/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic t(Lio/sentry/android/ndk/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/ndk/i;->b:Lio/sentry/ndk/a;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/sentry/ndk/a;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/e;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/c;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/sentry/android/ndk/c;-><init>(Lio/sentry/android/ndk/i;Lio/sentry/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    new-array v2, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    const-string v3, "Scope sync addBreadcrumb has an error."

    .line 29
    .line 30
    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/f;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Lio/sentry/android/ndk/f;-><init>(Lio/sentry/android/ndk/i;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const-string v2, "Scope sync setTag(%s) has an error."

    .line 26
    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, v1, p2, v2, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/g;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/sentry/android/ndk/g;-><init>(Lio/sentry/android/ndk/i;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iget-object v1, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const-string v3, "Scope sync removeExtra(%s) has an error."

    .line 26
    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, v2, v0, v3, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/d;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Lio/sentry/android/ndk/d;-><init>(Lio/sentry/android/ndk/i;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const-string v2, "Scope sync setExtra(%s) has an error."

    .line 26
    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, v1, p2, v2, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/e;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/sentry/android/ndk/e;-><init>(Lio/sentry/android/ndk/i;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iget-object v1, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const-string v3, "Scope sync removeTag(%s) has an error."

    .line 26
    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, v2, v0, v3, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public h(Lio/sentry/T3;Lio/sentry/Y;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    iget-object p2, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 5
    .line 6
    invoke-virtual {p2}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, Lio/sentry/android/ndk/h;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lio/sentry/android/ndk/h;-><init>(Lio/sentry/android/ndk/i;Lio/sentry/T3;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v0}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    iget-object p2, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 21
    .line 22
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v2, "Scope sync setTrace failed."

    .line 32
    .line 33
    invoke-interface {p2, v0, p1, v2, v1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public i(Lio/sentry/protocol/I;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/android/ndk/b;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/sentry/android/ndk/b;-><init>(Lio/sentry/android/ndk/i;Lio/sentry/protocol/I;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    iget-object v0, p0, Lio/sentry/android/ndk/i;->a:Lio/sentry/z3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    new-array v2, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    const-string v3, "Scope sync setUser has an error."

    .line 29
    .line 30
    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
