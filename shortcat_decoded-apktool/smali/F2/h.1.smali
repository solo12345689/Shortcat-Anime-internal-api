.class public LF2/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF2/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF2/h$g;,
        LF2/h$h;,
        LF2/h$c;,
        LF2/h$f;,
        LF2/h$e;,
        LF2/h$d;,
        LF2/h$b;
    }
.end annotation


# instance fields
.field private final b:Ljava/util/UUID;

.field private final c:LF2/A$c;

.field private final d:LF2/M;

.field private final e:Ljava/util/HashMap;

.field private final f:Z

.field private final g:[I

.field private final h:Z

.field private final i:LF2/h$g;

.field private final j:LQ2/k;

.field private final k:LF2/h$h;

.field private final l:J

.field private final m:Ljava/util/List;

.field private final n:Ljava/util/Set;

.field private final o:Ljava/util/Set;

.field private p:I

.field private q:LF2/A;

.field private r:LF2/g;

.field private s:LF2/g;

.field private t:Landroid/os/Looper;

.field private u:Landroid/os/Handler;

.field private v:I

.field private w:[B

.field private x:LB2/K1;

.field volatile y:LF2/h$d;


# direct methods
.method private constructor <init>(Ljava/util/UUID;LF2/A$c;LF2/M;Ljava/util/HashMap;Z[IZLQ2/k;J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lq2/k;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 5
    iput-object p1, p0, LF2/h;->b:Ljava/util/UUID;

    .line 6
    iput-object p2, p0, LF2/h;->c:LF2/A$c;

    .line 7
    iput-object p3, p0, LF2/h;->d:LF2/M;

    .line 8
    iput-object p4, p0, LF2/h;->e:Ljava/util/HashMap;

    .line 9
    iput-boolean p5, p0, LF2/h;->f:Z

    .line 10
    iput-object p6, p0, LF2/h;->g:[I

    .line 11
    iput-boolean p7, p0, LF2/h;->h:Z

    .line 12
    iput-object p8, p0, LF2/h;->j:LQ2/k;

    .line 13
    new-instance p1, LF2/h$g;

    invoke-direct {p1, p0}, LF2/h$g;-><init>(LF2/h;)V

    iput-object p1, p0, LF2/h;->i:LF2/h$g;

    .line 14
    new-instance p1, LF2/h$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LF2/h$h;-><init>(LF2/h;LF2/h$a;)V

    iput-object p1, p0, LF2/h;->k:LF2/h$h;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, LF2/h;->v:I

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LF2/h;->m:Ljava/util/List;

    .line 17
    invoke-static {}, LP9/T;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LF2/h;->n:Ljava/util/Set;

    .line 18
    invoke-static {}, LP9/T;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LF2/h;->o:Ljava/util/Set;

    .line 19
    iput-wide p9, p0, LF2/h;->l:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/UUID;LF2/A$c;LF2/M;Ljava/util/HashMap;Z[IZLQ2/k;JLF2/h$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, LF2/h;-><init>(Ljava/util/UUID;LF2/A$c;LF2/M;Ljava/util/HashMap;Z[IZLQ2/k;J)V

    return-void
.end method

.method private declared-synchronized A(Landroid/os/Looper;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LF2/h;->t:Landroid/os/Looper;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, LF2/h;->t:Landroid/os/Looper;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LF2/h;->u:Landroid/os/Handler;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_0
    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LF2/h;->u:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
.end method

.method private B(IZ)LF2/m;
    .locals 4

    .line 1
    iget-object v0, p0, LF2/h;->q:LF2/A;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF2/A;

    .line 8
    .line 9
    invoke-interface {v0}, LF2/A;->h()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    sget-boolean v1, LF2/B;->d:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v1, p0, LF2/h;->g:[I

    .line 23
    .line 24
    invoke-static {v1, p1}, Lt2/a0;->R0([II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v1, -0x1

    .line 29
    if-eq p1, v1, :cond_3

    .line 30
    .line 31
    invoke-interface {v0}, LF2/A;->h()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v0, 0x1

    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object p1, p0, LF2/h;->r:LF2/g;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1, v0, v3, p2}, LF2/h;->y(Ljava/util/List;ZLF2/t$a;Z)LF2/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, p0, LF2/h;->m:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LF2/h;->r:LF2/g;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p1, v3}, LF2/g;->g(LF2/t$a;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-object p1, p0, LF2/h;->r:LF2/g;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    :goto_1
    return-object v3
.end method

.method private C(Landroid/os/Looper;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF2/h;->y:LF2/h$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LF2/h$d;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, LF2/h$d;-><init>(LF2/h;Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LF2/h;->y:LF2/h$d;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private D()V
    .locals 1

    .line 1
    iget-object v0, p0, LF2/h;->q:LF2/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LF2/h;->p:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LF2/h;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LF2/h;->n:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LF2/h;->q:LF2/A;

    .line 26
    .line 27
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, LF2/A;

    .line 32
    .line 33
    invoke-interface {v0}, LF2/A;->a()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, LF2/h;->q:LF2/A;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private E()V
    .locals 3

    .line 1
    iget-object v0, p0, LF2/h;->o:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {v0}, LP9/w;->v(Ljava/util/Collection;)LP9/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LP9/w;->l()LP9/X;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LF2/m;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {v1, v2}, LF2/m;->h(LF2/t$a;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private F()V
    .locals 2

    .line 1
    iget-object v0, p0, LF2/h;->n:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {v0}, LP9/w;->v(Ljava/util/Collection;)LP9/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LP9/w;->l()LP9/X;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LF2/h$f;

    .line 22
    .line 23
    invoke-virtual {v1}, LF2/h$f;->a()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private H(LF2/m;LF2/t$a;)V
    .locals 4

    .line 1
    invoke-interface {p1, p2}, LF2/m;->h(LF2/t$a;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, LF2/h;->l:J

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long p2, v0, v2

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-interface {p1, p2}, LF2/m;->h(LF2/t$a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private I(Z)V
    .locals 2

    .line 1
    const-string v0, "DefaultDrmSessionMgr"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LF2/h;->t:Landroid/os/Looper;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, LF2/h;->t:Landroid/os/Looper;

    .line 25
    .line 26
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/os/Looper;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eq p1, v1, :cond_1

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "\nExpected thread: "

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, LF2/h;->t:Landroid/os/Looper;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, p1, v1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void
.end method

.method static synthetic f(LF2/h;)LF2/g;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->s:LF2/g;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(LF2/h;LF2/g;)LF2/g;
    .locals 0

    .line 1
    iput-object p1, p0, LF2/h;->s:LF2/g;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic h(LF2/h;)LF2/h$g;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->i:LF2/h$g;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i(LF2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LF2/h;->D()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic j(LF2/h;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->n:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k(LF2/h;)Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->t:Landroid/os/Looper;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic l(LF2/h;Landroid/os/Looper;LF2/t$a;Lq2/x;Z)LF2/m;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LF2/h;->u(Landroid/os/Looper;LF2/t$a;Lq2/x;Z)LF2/m;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m(LF2/h;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->m:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic n(LF2/h;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LF2/h;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic o(LF2/h;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->o:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic p(LF2/h;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->u:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic q(LF2/h;)I
    .locals 0

    .line 1
    iget p0, p0, LF2/h;->p:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic r(LF2/h;)LF2/g;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/h;->r:LF2/g;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic t(LF2/h;LF2/g;)LF2/g;
    .locals 0

    .line 1
    iput-object p1, p0, LF2/h;->r:LF2/g;

    .line 2
    .line 3
    return-object p1
.end method

.method private u(Landroid/os/Looper;LF2/t$a;Lq2/x;Z)LF2/m;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LF2/h;->C(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p3, Lq2/x;->s:Lq2/q;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p3, Lq2/x;->o:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Lq2/K;->k(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0, p1, p4}, LF2/h;->B(IZ)LF2/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object p3, p0, LF2/h;->w:[B

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez p3, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lq2/q;

    .line 30
    .line 31
    iget-object p3, p0, LF2/h;->b:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-static {p1, p3, v0}, LF2/h;->z(Lq2/q;Ljava/util/UUID;Z)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    new-instance p1, LF2/h$e;

    .line 44
    .line 45
    iget-object p3, p0, LF2/h;->b:Ljava/util/UUID;

    .line 46
    .line 47
    invoke-direct {p1, p3, v1}, LF2/h$e;-><init>(Ljava/util/UUID;LF2/h$a;)V

    .line 48
    .line 49
    .line 50
    const-string p3, "DefaultDrmSessionMgr"

    .line 51
    .line 52
    const-string p4, "DRM error"

    .line 53
    .line 54
    invoke-static {p3, p4, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    invoke-virtual {p2, p1}, LF2/t$a;->l(Ljava/lang/Exception;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    new-instance p2, LF2/z;

    .line 63
    .line 64
    new-instance p3, LF2/m$a;

    .line 65
    .line 66
    const/16 p4, 0x1773

    .line 67
    .line 68
    invoke-direct {p3, p1, p4}, LF2/m$a;-><init>(Ljava/lang/Throwable;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p2, p3}, LF2/z;-><init>(LF2/m$a;)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_2
    move-object p1, v1

    .line 76
    :cond_3
    iget-boolean p3, p0, LF2/h;->f:Z

    .line 77
    .line 78
    if-nez p3, :cond_4

    .line 79
    .line 80
    iget-object v1, p0, LF2/h;->s:LF2/g;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-object p3, p0, LF2/h;->m:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, LF2/g;

    .line 100
    .line 101
    iget-object v3, v2, LF2/g;->a:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v3, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    move-object v1, v2

    .line 110
    :cond_6
    :goto_0
    if-nez v1, :cond_8

    .line 111
    .line 112
    invoke-direct {p0, p1, v0, p2, p4}, LF2/h;->y(Ljava/util/List;ZLF2/t$a;Z)LF2/g;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-boolean p2, p0, LF2/h;->f:Z

    .line 117
    .line 118
    if-nez p2, :cond_7

    .line 119
    .line 120
    iput-object p1, p0, LF2/h;->s:LF2/g;

    .line 121
    .line 122
    :cond_7
    iget-object p2, p0, LF2/h;->m:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_8
    invoke-virtual {v1, p2}, LF2/g;->g(LF2/t$a;)V

    .line 129
    .line 130
    .line 131
    return-object v1
.end method

.method private static v(LF2/m;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, LF2/m;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-interface {p0}, LF2/m;->c()LF2/m$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, LF2/m$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, Landroid/media/ResourceBusyException;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, LF2/x;->e(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v1

    .line 36
    :cond_2
    :goto_0
    return v2
.end method

.method private w(Lq2/q;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LF2/h;->w:[B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, LF2/h;->b:Ljava/util/UUID;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, LF2/h;->z(Lq2/q;Ljava/util/UUID;Z)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget v0, p1, Lq2/q;->d:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lq2/q;->e(I)Lq2/q$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v3, Lq2/k;->b:Ljava/util/UUID;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lq2/q$b;->d(Ljava/util/UUID;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, LF2/h;->b:Ljava/util/UUID;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v3, "DefaultDrmSessionMgr"

    .line 56
    .line 57
    invoke-static {v3, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return v2

    .line 62
    :cond_2
    :goto_0
    iget-object p1, p1, Lq2/q;->c:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_8

    .line 65
    .line 66
    const-string v0, "cenc"

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const-string v0, "cbcs"

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    const/16 v0, 0x19

    .line 86
    .line 87
    if-lt p1, v0, :cond_4

    .line 88
    .line 89
    return v1

    .line 90
    :cond_4
    return v2

    .line 91
    :cond_5
    const-string v0, "cbc1"

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_7

    .line 98
    .line 99
    const-string v0, "cens"

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    return v1

    .line 109
    :cond_7
    :goto_1
    return v2

    .line 110
    :cond_8
    :goto_2
    return v1
.end method

.method private x(Ljava/util/List;ZLF2/t$a;)LF2/g;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LF2/h;->q:LF2/A;

    .line 4
    .line 5
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, LF2/h;->h:Z

    .line 9
    .line 10
    or-int v9, v1, p2

    .line 11
    .line 12
    new-instance v2, LF2/g;

    .line 13
    .line 14
    iget-object v3, v0, LF2/h;->b:Ljava/util/UUID;

    .line 15
    .line 16
    iget-object v4, v0, LF2/h;->q:LF2/A;

    .line 17
    .line 18
    iget-object v5, v0, LF2/h;->i:LF2/h$g;

    .line 19
    .line 20
    iget-object v6, v0, LF2/h;->k:LF2/h$h;

    .line 21
    .line 22
    iget v8, v0, LF2/h;->v:I

    .line 23
    .line 24
    iget-object v11, v0, LF2/h;->w:[B

    .line 25
    .line 26
    iget-object v12, v0, LF2/h;->e:Ljava/util/HashMap;

    .line 27
    .line 28
    iget-object v13, v0, LF2/h;->d:LF2/M;

    .line 29
    .line 30
    iget-object v1, v0, LF2/h;->t:Landroid/os/Looper;

    .line 31
    .line 32
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v14, v1

    .line 37
    check-cast v14, Landroid/os/Looper;

    .line 38
    .line 39
    iget-object v15, v0, LF2/h;->j:LQ2/k;

    .line 40
    .line 41
    iget-object v1, v0, LF2/h;->x:LB2/K1;

    .line 42
    .line 43
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object/from16 v16, v1

    .line 48
    .line 49
    check-cast v16, LB2/K1;

    .line 50
    .line 51
    move-object/from16 v7, p1

    .line 52
    .line 53
    move/from16 v10, p2

    .line 54
    .line 55
    invoke-direct/range {v2 .. v16}, LF2/g;-><init>(Ljava/util/UUID;LF2/A;LF2/g$a;LF2/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;LF2/M;Landroid/os/Looper;LQ2/k;LB2/K1;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v1, p3

    .line 59
    .line 60
    invoke-virtual {v2, v1}, LF2/g;->g(LF2/t$a;)V

    .line 61
    .line 62
    .line 63
    iget-wide v3, v0, LF2/h;->l:J

    .line 64
    .line 65
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v1, v3, v5

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v2, v1}, LF2/g;->g(LF2/t$a;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    return-object v2
.end method

.method private y(Ljava/util/List;ZLF2/t$a;Z)LF2/g;
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, LF2/h;->x(Ljava/util/List;ZLF2/t$a;)LF2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LF2/h;->v(LF2/m;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LF2/h;->o:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, LF2/h;->E()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, p3}, LF2/h;->H(LF2/m;LF2/t$a;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, p2, p3}, LF2/h;->x(Ljava/util/List;ZLF2/t$a;)LF2/g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    invoke-static {v0}, LF2/h;->v(LF2/m;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-eqz p4, :cond_2

    .line 36
    .line 37
    iget-object p4, p0, LF2/h;->n:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    if-nez p4, :cond_2

    .line 44
    .line 45
    invoke-direct {p0}, LF2/h;->F()V

    .line 46
    .line 47
    .line 48
    iget-object p4, p0, LF2/h;->o:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-nez p4, :cond_1

    .line 55
    .line 56
    invoke-direct {p0}, LF2/h;->E()V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-direct {p0, v0, p3}, LF2/h;->H(LF2/m;LF2/t$a;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1, p2, p3}, LF2/h;->x(Ljava/util/List;ZLF2/t$a;)LF2/g;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_2
    return-object v0
.end method

.method private static z(Lq2/q;Ljava/util/UUID;Z)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lq2/q;->d:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, Lq2/q;->d:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lq2/q;->e(I)Lq2/q$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, p1}, Lq2/q$b;->d(Ljava/util/UUID;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    sget-object v3, Lq2/k;->c:Ljava/util/UUID;

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    sget-object v3, Lq2/k;->b:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lq2/q$b;->d(Ljava/util/UUID;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    :cond_0
    iget-object v3, v2, Lq2/q$b;->e:[B

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-object v0
.end method


# virtual methods
.method public G(I[B)V
    .locals 1

    .line 1
    iget-object v0, p0, LF2/h;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_1
    iput p1, p0, LF2/h;->v:I

    .line 20
    .line 21
    iput-object p2, p0, LF2/h;->w:[B

    .line 22
    .line 23
    return-void
.end method

.method public final a()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LF2/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, LF2/h;->p:I

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    iput v1, p0, LF2/h;->p:I

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-wide v0, p0, LF2/h;->l:J

    .line 14
    .line 15
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v1, p0, LF2/h;->m:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v1, v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, LF2/g;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v2, v3}, LF2/g;->h(LF2/t$a;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-direct {p0}, LF2/h;->F()V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, LF2/h;->D()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public b(Lq2/x;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LF2/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LF2/h;->q:LF2/A;

    .line 6
    .line 7
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LF2/A;

    .line 12
    .line 13
    invoke-interface {v1}, LF2/A;->h()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lq2/x;->s:Lq2/q;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lq2/K;->k(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v2, p0, LF2/h;->g:[I

    .line 28
    .line 29
    invoke-static {v2, p1}, Lt2/a0;->R0([II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v2, -0x1

    .line 34
    if-eq p1, v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return v0

    .line 38
    :cond_1
    invoke-direct {p0, v2}, LF2/h;->w(Lq2/q;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    return v1

    .line 45
    :cond_2
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public c(LF2/t$a;Lq2/x;)LF2/u$b;
    .locals 1

    .line 1
    iget v0, p0, LF2/h;->p:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LF2/h;->t:Landroid/os/Looper;

    .line 12
    .line 13
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v0, LF2/h$f;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, LF2/h$f;-><init>(LF2/h;LF2/t$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, LF2/h$f;->e(Lq2/x;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public d(LF2/t$a;Lq2/x;)LF2/m;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LF2/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, LF2/h;->p:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    :cond_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LF2/h;->t:Landroid/os/Looper;

    .line 15
    .line 16
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LF2/h;->t:Landroid/os/Looper;

    .line 20
    .line 21
    invoke-direct {p0, v0, p1, p2, v2}, LF2/h;->u(Landroid/os/Looper;LF2/t$a;Lq2/x;Z)LF2/m;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public e(Landroid/os/Looper;LB2/K1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LF2/h;->A(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LF2/h;->x:LB2/K1;

    .line 5
    .line 6
    return-void
.end method

.method public final s()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LF2/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v0, p0, LF2/h;->p:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, LF2/h;->p:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, p0, LF2/h;->q:LF2/A;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LF2/h;->c:LF2/A$c;

    .line 20
    .line 21
    iget-object v2, p0, LF2/h;->b:Ljava/util/UUID;

    .line 22
    .line 23
    invoke-interface {v0, v2}, LF2/A$c;->a(Ljava/util/UUID;)LF2/A;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, LF2/h;->q:LF2/A;

    .line 28
    .line 29
    new-instance v2, LF2/h$c;

    .line 30
    .line 31
    invoke-direct {v2, p0, v1}, LF2/h$c;-><init>(LF2/h;LF2/h$a;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, LF2/A;->d(LF2/A$b;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-wide v2, p0, LF2/h;->l:J

    .line 39
    .line 40
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v0, v2, v4

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    :goto_0
    iget-object v2, p0, LF2/h;->m:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ge v0, v2, :cond_2

    .line 57
    .line 58
    iget-object v2, p0, LF2/h;->m:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, LF2/g;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, LF2/g;->g(LF2/t$a;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    :goto_1
    return-void
.end method
