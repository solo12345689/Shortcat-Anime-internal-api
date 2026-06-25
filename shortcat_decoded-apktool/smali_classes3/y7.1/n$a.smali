.class public final Ly7/n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly7/n$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/a;Ly7/n;Ly7/o;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly7/n$a;->m(Ly7/a;Ly7/n;Ly7/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ljava/util/concurrent/Callable;Ly7/o;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly7/n$a;->i(Ljava/util/concurrent/Callable;Ly7/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ly7/o;Ly7/n;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly7/n$a;->n(Ly7/o;Ly7/n;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Ly7/o;Ly7/n;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly7/n$a;->j(Ly7/o;Ly7/n;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ly7/a;Ly7/n;Ly7/o;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly7/n$a;->p(Ly7/a;Ly7/n;Ly7/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ly7/n$a;->l(Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ly7/n$a;->o(Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i(Ljava/util/concurrent/Callable;Ly7/o;)V
    .locals 3

    .line 1
    new-instance v0, Ly7/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly7/j;-><init>(Ly7/o;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ly7/n;

    .line 11
    .line 12
    invoke-static {p0}, Ly7/n;->g(Ly7/n;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    monitor-enter v1
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :try_start_1
    invoke-virtual {p0}, Ly7/n;->u()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p0}, Ly7/a;->a(Ly7/n;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {p0}, Ly7/n;->f(Ly7/n;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :goto_1
    monitor-exit v1

    .line 44
    throw p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 45
    :goto_2
    invoke-virtual {p1, p0}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :catch_1
    invoke-virtual {p1}, Ly7/o;->b()V

    .line 50
    .line 51
    .line 52
    :goto_3
    return-void
.end method

.method private static final j(Ly7/o;Ly7/n;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ly7/n;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ly7/o;->b()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ly7/n;->v()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ly7/n;->r()Ljava/lang/Exception;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Ly7/n;->s()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Ly7/o;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 38
    .line 39
    return-object p0
.end method

.method private final l(Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ly7/l;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p1}, Ly7/l;-><init>(Ly7/a;Ly7/n;Ly7/o;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p4, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p2

    .line 11
    new-instance p3, Ly7/b;

    .line 12
    .line 13
    invoke-direct {p3, p2}, Ly7/b;-><init>(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final m(Ly7/a;Ly7/n;Ly7/o;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Ly7/a;->a(Ly7/n;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ly7/n;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Ly7/o;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ly7/m;

    .line 17
    .line 18
    invoke-direct {v0, p2}, Ly7/m;-><init>(Ly7/o;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-static {p0, v0, p1, v1, p1}, Ly7/n;->m(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_0
    invoke-virtual {p2, p0}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catch_1
    invoke-virtual {p2}, Ly7/o;->b()V

    .line 31
    .line 32
    .line 33
    :goto_1
    return-void
.end method

.method private static final n(Ly7/o;Ly7/n;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ly7/n;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ly7/o;->b()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ly7/n;->v()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ly7/n;->r()Ljava/lang/Exception;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Ly7/n;->s()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Ly7/o;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 38
    .line 39
    return-object p0
.end method

.method private final o(Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ly7/k;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p1}, Ly7/k;-><init>(Ly7/a;Ly7/n;Ly7/o;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p4, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p2

    .line 11
    new-instance p3, Ly7/b;

    .line 12
    .line 13
    invoke-direct {p3, p2}, Ly7/b;-><init>(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final p(Ly7/a;Ly7/n;Ly7/o;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Ly7/a;->a(Ly7/n;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2, p0}, Ly7/o;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p0

    .line 10
    invoke-virtual {p2, p0}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_1
    invoke-virtual {p2}, Ly7/o;->b()V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method


# virtual methods
.method public final h(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Ly7/n;
    .locals 2

    .line 1
    const-string v0, "callable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ly7/o;

    .line 12
    .line 13
    invoke-direct {v0}, Ly7/o;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v1, Ly7/i;

    .line 17
    .line 18
    invoke-direct {v1, p1, v0}, Ly7/i;-><init>(Ljava/util/concurrent/Callable;Ly7/o;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    new-instance p2, Ly7/b;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Ly7/b;-><init>(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {v0}, Ly7/o;->a()Ly7/n;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final k()Ly7/n;
    .locals 2

    .line 1
    invoke-static {}, Ly7/n;->h()Ly7/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final q(Ljava/lang/Exception;)Ly7/n;
    .locals 1

    .line 1
    new-instance v0, Ly7/o;

    .line 2
    .line 3
    invoke-direct {v0}, Ly7/o;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ly7/o;->a()Ly7/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final r(Ljava/lang/Object;)Ly7/n;
    .locals 2

    .line 1
    const-string v0, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ly7/n;->j()Ly7/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {}, Ly7/n;->k()Ly7/n;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {}, Ly7/n;->i()Ly7/n;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    new-instance v0, Ly7/o;

    .line 39
    .line 40
    invoke-direct {v0}, Ly7/o;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ly7/o;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ly7/o;->a()Ly7/n;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method
