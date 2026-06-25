.class LE3/a5;
.super LF3/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final j:LF3/q;

.field private final k:LE3/I3;

.field private final l:LE3/g;


# direct methods
.method public constructor <init>(LE3/I3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LF3/g;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LE3/I3;->a0()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LF3/q;->a(Landroid/content/Context;)LF3/q;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LE3/a5;->j:LF3/q;

    .line 13
    .line 14
    iput-object p1, p0, LE3/a5;->k:LE3/I3;

    .line 15
    .line 16
    new-instance v0, LE3/g;

    .line 17
    .line 18
    invoke-direct {v0, p1}, LE3/g;-><init>(LE3/I3;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LE3/a5;->l:LE3/g;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic t(LE3/a5;Ljava/util/concurrent/atomic/AtomicReference;LE3/h3$g;Lt2/m;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/a5;->k:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, LE3/I3;->x0(LE3/h3$g;)LE3/h3$e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Lt2/m;->f()Z

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public g(Ljava/lang/String;ILandroid/os/Bundle;)LF3/g$e;
    .locals 3

    .line 1
    invoke-virtual {p0}, LF3/g;->d()LF3/q$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1, p3}, LE3/a5;->u(LF3/q$b;Landroid/os/Bundle;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lt2/m;

    .line 20
    .line 21
    invoke-direct {v0}, Lt2/m;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LE3/a5;->k:LE3/I3;

    .line 25
    .line 26
    invoke-virtual {v1}, LE3/I3;->X()Landroid/os/Handler;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, LE3/Z4;

    .line 31
    .line 32
    invoke-direct {v2, p0, p3, p2, v0}, LE3/Z4;-><init>(LE3/a5;Ljava/util/concurrent/atomic/AtomicReference;LE3/h3$g;Lt2/m;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :try_start_0
    invoke-virtual {v0}, Lt2/m;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, LE3/h3$e;

    .line 47
    .line 48
    iget-boolean v0, p3, LE3/h3$e;->a:Z

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_1
    iget-object v0, p0, LE3/a5;->l:LE3/g;

    .line 54
    .line 55
    iget-object v1, p3, LE3/h3$e;->b:LE3/U6;

    .line 56
    .line 57
    iget-object p3, p3, LE3/h3$e;->c:Lq2/P$b;

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, v1, p3}, LE3/g;->e(Ljava/lang/Object;LE3/h3$g;LE3/U6;Lq2/P$b;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, LE3/L6;->a:LF3/g$e;

    .line 63
    .line 64
    return-object p1

    .line 65
    :catch_0
    move-exception p1

    .line 66
    const-string p2, "MSSLegacyStub"

    .line 67
    .line 68
    const-string p3, "Couldn\'t get a result from onConnect"

    .line 69
    .line 70
    invoke-static {p2, p3, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method

.method public h(Ljava/lang/String;LF3/g$l;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p2, p1}, LF3/g$l;->f(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public u(LF3/q$b;Landroid/os/Bundle;)LE3/h3$g;
    .locals 8

    .line 1
    new-instance v0, LE3/h3$g;

    .line 2
    .line 3
    iget-object v1, p0, LE3/a5;->j:LF3/q;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, LF3/q;->b(LF3/q$b;)Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const/4 v5, 0x0

    .line 10
    invoke-static {p2}, LE3/t;->b0(Landroid/os/Bundle;)I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p1

    .line 17
    move-object v6, p2

    .line 18
    invoke-direct/range {v0 .. v7}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public v(LF3/n$j;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/a5;->k:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->a0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, LF3/g;->c(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LF3/g;->onCreate()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, LF3/g;->s(LF3/n$j;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
