.class public abstract LGf/z0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(LZd/i;Lie/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/z0;->d(LZd/i;Lie/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(LZd/i;Lie/a;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LGf/z0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, LGf/z0$a;-><init>(Lie/a;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0, p2}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic c(LZd/i;Lie/a;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p0, LZd/j;->a:LZd/j;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2}, LGf/z0;->b(LZd/i;Lie/a;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final d(LZd/i;Lie/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, LGf/a1;

    .line 2
    .line 3
    invoke-direct {v0}, LGf/a1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LGf/F0;->k(LZd/i;)LGf/C0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, LGf/a1;->B(LGf/C0;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :try_start_2
    invoke-virtual {v0}, LGf/a1;->y()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-virtual {v0}, LGf/a1;->y()V

    .line 23
    .line 24
    .line 25
    throw p0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 28
    .line 29
    const-string v0, "Blocking call was interrupted due to parent cancellation"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0
.end method
