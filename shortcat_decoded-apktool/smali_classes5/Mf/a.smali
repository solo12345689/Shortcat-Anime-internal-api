.class public abstract LMf/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(LZd/e;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LGf/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LGf/a0;

    .line 6
    .line 7
    invoke-virtual {p1}, LGf/a0;->getCause()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 12
    .line 13
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public static final b(LZd/e;LZd/e;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 6
    .line 7
    sget-object v0, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, LLf/j;->b(LZd/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p1, p0}, LMf/a;->a(LZd/e;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;LZd/e;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Lae/b;->a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, LTd/u;->b:LTd/u$a;

    .line 10
    .line 11
    sget-object p1, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, LLf/j;->b(LZd/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-static {p2, p0}, LMf/a;->a(LZd/e;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
