.class public abstract LGf/u0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LGf/K;)Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    instance-of v0, p0, LGf/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LGf/s0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, LGf/s0;->b2()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    new-instance v0, LGf/e0;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LGf/e0;-><init>(LGf/K;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(Ljava/util/concurrent/Executor;)LGf/K;
    .locals 1

    .line 1
    instance-of v0, p0, LGf/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LGf/e0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, LGf/e0;->a:LGf/K;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    new-instance v0, LGf/t0;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LGf/t0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final c(Ljava/util/concurrent/ExecutorService;)LGf/s0;
    .locals 1

    .line 1
    new-instance v0, LGf/t0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LGf/t0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
