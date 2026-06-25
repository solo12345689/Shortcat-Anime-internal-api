.class LE3/D;
.super Lcom/google/common/util/concurrent/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/A$b;


# instance fields
.field private final h:Landroid/os/Handler;

.field private i:LE3/A;

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/common/util/concurrent/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/D;->h:Landroid/os/Handler;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic J(LE3/D;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/D;->h:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic K(LE3/D;LE3/A;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/a;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LE3/A;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private L()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/SecurityException;

    .line 2
    .line 3
    const-string v1, "Session rejected the connection request."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/google/common/util/concurrent/a;->G(Ljava/lang/Throwable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private M()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/D;->i:LE3/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, LE3/D;->j:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/google/common/util/concurrent/a;->F(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method


# virtual methods
.method public N(LE3/A;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE3/D;->i:LE3/A;

    .line 2
    .line 3
    invoke-direct {p0}, LE3/D;->M()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LE3/B;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, LE3/B;-><init>(LE3/D;LE3/A;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, LE3/C;

    .line 12
    .line 13
    invoke-direct {p1, p0}, LE3/C;-><init>(LE3/D;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lcom/google/common/util/concurrent/a;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public a()V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/D;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE3/D;->j:Z

    .line 3
    .line 4
    invoke-direct {p0}, LE3/D;->M()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
