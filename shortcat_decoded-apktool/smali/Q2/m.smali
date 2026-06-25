.class public final LQ2/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ2/m$d;,
        LQ2/m$c;,
        LQ2/m$e;,
        LQ2/m$b;,
        LQ2/m$f;,
        LQ2/m$g;,
        LQ2/m$h;
    }
.end annotation


# static fields
.field public static final d:LQ2/m$c;

.field public static final e:LQ2/m$c;

.field public static final f:LQ2/m$c;

.field public static final g:LQ2/m$c;


# instance fields
.field private final a:LR2/a;

.field private b:LQ2/m$d;

.field private c:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LQ2/m;->d:LQ2/m$c;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0, v1, v2}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LQ2/m;->e:LQ2/m$c;

    .line 19
    .line 20
    new-instance v0, LQ2/m$c;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v0, v3, v1, v2, v4}, LQ2/m$c;-><init>(IJLQ2/m$a;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LQ2/m;->f:LQ2/m$c;

    .line 28
    .line 29
    new-instance v0, LQ2/m$c;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    invoke-direct {v0, v3, v1, v2, v4}, LQ2/m$c;-><init>(IJLQ2/m$a;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LQ2/m;->g:LQ2/m$c;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(LR2/a;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LQ2/m;->a:LR2/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExoPlayer:Loader:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lt2/a0;->W0(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, LQ2/l;

    invoke-direct {v0}, LQ2/l;-><init>()V

    .line 3
    invoke-static {p1, v0}, LR2/a;->p0(Ljava/util/concurrent/Executor;Lt2/n;)LR2/a;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, LQ2/m;-><init>(LR2/a;)V

    return-void
.end method

.method static synthetic a(LQ2/m;)LQ2/m$d;
    .locals 0

    .line 1
    iget-object p0, p0, LQ2/m;->b:LQ2/m$d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LQ2/m;LQ2/m$d;)LQ2/m$d;
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/m;->b:LQ2/m$d;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic d(LQ2/m;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/m;->c:Ljava/io/IOException;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic e(LQ2/m;)LR2/a;
    .locals 0

    .line 1
    iget-object p0, p0, LQ2/m;->a:LR2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static h(ZJ)LQ2/m$c;
    .locals 2

    .line 1
    new-instance v0, LQ2/m$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, LQ2/m$c;-><init>(IJLQ2/m$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LQ2/m;->k(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/m;->b:LQ2/m$d;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LQ2/m$d;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, LQ2/m$d;->a(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LQ2/m;->c:Ljava/io/IOException;

    .line 3
    .line 4
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/m;->c:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/m;->b:LQ2/m$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/m;->c:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LQ2/m;->b:LQ2/m$d;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    iget p1, v0, LQ2/m$d;->a:I

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0, p1}, LQ2/m$d;->e(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void

    .line 19
    :cond_2
    throw v0
.end method

.method public l()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LQ2/m;->m(LQ2/m$f;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public m(LQ2/m$f;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/m;->b:LQ2/m$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, LQ2/m$d;->a(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LQ2/m;->a:LR2/a;

    .line 12
    .line 13
    new-instance v1, LQ2/m$g;

    .line 14
    .line 15
    invoke-direct {v1, p1}, LQ2/m$g;-><init>(LQ2/m$f;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object p1, p0, LQ2/m;->a:LR2/a;

    .line 22
    .line 23
    invoke-interface {p1}, LR2/a;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public n(LQ2/m$e;LQ2/m$b;I)J
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v3, v0

    .line 10
    check-cast v3, Landroid/os/Looper;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, LQ2/m;->c:Ljava/io/IOException;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v7

    .line 19
    new-instance v1, LQ2/m$d;

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    move-object v4, p1

    .line 23
    move-object v5, p2

    .line 24
    move v6, p3

    .line 25
    invoke-direct/range {v1 .. v8}, LQ2/m$d;-><init>(LQ2/m;Landroid/os/Looper;LQ2/m$e;LQ2/m$b;IJ)V

    .line 26
    .line 27
    .line 28
    const-wide/16 p1, 0x0

    .line 29
    .line 30
    invoke-virtual {v1, p1, p2}, LQ2/m$d;->f(J)V

    .line 31
    .line 32
    .line 33
    return-wide v7
.end method
