.class public Lv6/b;
.super Lcom/facebook/imagepipeline/producers/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/b$a;,
        Lv6/b$b;
    }
.end annotation


# static fields
.field private static final d:Lv6/b$a;


# instance fields
.field private final a:Ldg/e$a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ldg/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv6/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv6/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv6/b;->d:Lv6/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldg/A;)V
    .locals 7

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Ldg/A;->t()Ldg/p;

    move-result-object v0

    invoke-virtual {v0}, Ldg/p;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    const-string v0, "executorService(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lv6/b;-><init>(Ldg/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ldg/e$a;Ljava/util/concurrent/Executor;Z)V
    .locals 1

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/d;-><init>()V

    .line 3
    iput-object p1, p0, Lv6/b;->a:Ldg/e$a;

    .line 4
    iput-object p2, p0, Lv6/b;->b:Ljava/util/concurrent/Executor;

    if-eqz p3, :cond_0

    .line 5
    new-instance p1, Ldg/d$a;

    invoke-direct {p1}, Ldg/d$a;-><init>()V

    invoke-virtual {p1}, Ldg/d$a;->e()Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Ldg/d$a;->a()Ldg/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lv6/b;->c:Ldg/d;

    return-void
.end method

.method public synthetic constructor <init>(Ldg/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lv6/b;-><init>(Ldg/e$a;Ljava/util/concurrent/Executor;Z)V

    return-void
.end method

.method public static final synthetic f(Lv6/b;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lv6/b;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lv6/b;Ldg/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lv6/b;->m(Ldg/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Lv6/b;Ljava/lang/String;Ldg/E;)Ljava/io/IOException;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv6/b;->n(Ljava/lang/String;Ldg/E;)Ljava/io/IOException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m(Ldg/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ldg/e;->u1()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/X$a;->b()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p3, p2}, Lcom/facebook/imagepipeline/producers/X$a;->a(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final n(Ljava/lang/String;Ldg/E;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    sget-object v1, Lv6/d;->c:Lv6/d$a;

    .line 4
    .line 5
    invoke-virtual {v1, p2}, Lv6/d$a;->a(Ldg/E;)Lv6/d;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    check-cast p1, Lv6/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv6/b;->j(Lv6/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Lcom/facebook/imagepipeline/producers/C;I)V
    .locals 0

    .line 1
    check-cast p1, Lv6/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv6/b;->o(Lv6/b$b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic d(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lv6/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv6/b;->l(Lv6/b$b;I)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic e(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/producers/C;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lv6/b;->i(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lv6/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lv6/b$b;
    .locals 1

    .line 1
    const-string v0, "consumer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lv6/b$b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lv6/b$b;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public j(Lv6/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 3

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p1, Lv6/b$b;->f:J

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->g()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getUri(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    new-instance v1, Ldg/C$a;

    .line 27
    .line 28
    invoke-direct {v1}, Ldg/C$a;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v1, v0}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ldg/C$a;->d()Ldg/C$a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lv6/b;->c:Ldg/d;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ldg/C$a;->c(Ldg/d;)Ldg/C$a;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, LK6/b;->b()Ly6/b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v2, "Range"

    .line 68
    .line 69
    invoke-virtual {v1}, Ly6/b;->f()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v2, v1}, Ldg/C$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {v0}, Ldg/C$a;->b()Ldg/C;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "build(...)"

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1, p2, v0}, Lv6/b;->k(Lv6/b$b;Lcom/facebook/imagepipeline/producers/X$a;Ldg/C;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :goto_1
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/X$a;->a(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method protected k(Lv6/b$b;Lcom/facebook/imagepipeline/producers/X$a;Ldg/C;)V
    .locals 2

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "request"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lv6/b;->a:Ldg/e$a;

    .line 17
    .line 18
    invoke-interface {v0, p3}, Ldg/e$a;->a(Ldg/C;)Ldg/e;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lv6/b$c;

    .line 27
    .line 28
    invoke-direct {v1, p3, p0}, Lv6/b$c;-><init>(Ldg/e;Lv6/b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->b(Lcom/facebook/imagepipeline/producers/f0;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lv6/b$d;

    .line 35
    .line 36
    invoke-direct {v0, p1, p0, p2}, Lv6/b$d;-><init>(Lv6/b$b;Lv6/b;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public l(Lv6/b$b;I)Ljava/util/Map;
    .locals 6

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p1, Lv6/b$b;->g:J

    .line 7
    .line 8
    iget-wide v2, p1, Lv6/b$b;->f:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "queue_time"

    .line 16
    .line 17
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v1, p1, Lv6/b$b;->h:J

    .line 22
    .line 23
    iget-wide v3, p1, Lv6/b$b;->g:J

    .line 24
    .line 25
    sub-long/2addr v1, v3

    .line 26
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "fetch_time"

    .line 31
    .line 32
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v2, p1, Lv6/b$b;->h:J

    .line 37
    .line 38
    iget-wide v4, p1, Lv6/b$b;->f:J

    .line 39
    .line 40
    sub-long/2addr v2, v4

    .line 41
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "total_time"

    .line 46
    .line 47
    invoke-static {v2, p1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v2, "image_size"

    .line 52
    .line 53
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {v2, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    filled-new-array {v0, v1, p1, p2}, [Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public o(Lv6/b$b;I)V
    .locals 2

    .line 1
    const-string p2, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p1, Lv6/b$b;->h:J

    .line 11
    .line 12
    return-void
.end method
