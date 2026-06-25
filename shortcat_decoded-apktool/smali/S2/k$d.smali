.class public final LS2/k$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Z

.field private c:LJ2/E;

.field private d:LJ2/q$b;

.field private e:J

.field private f:Z

.field private g:Landroid/os/Handler;

.field private h:LS2/K;

.field private i:I

.field private j:F

.field private k:LS2/L;

.field private l:Z

.field private m:J

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS2/k$d;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, LJ2/E;->a:LJ2/E;

    .line 7
    .line 8
    iput-object v0, p0, LS2/k$d;->c:LJ2/E;

    .line 9
    .line 10
    invoke-static {p1}, LJ2/q$b;->a(Landroid/content/Context;)LJ2/q$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LS2/k$d;->d:LJ2/q$b;

    .line 15
    .line 16
    const/high16 p1, 0x41f00000    # 30.0f

    .line 17
    .line 18
    iput p1, p0, LS2/k$d;->j:F

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v0, p0, LS2/k$d;->m:J

    .line 26
    .line 27
    return-void
.end method

.method static synthetic a(LS2/k$d;)LJ2/q$b;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->d:LJ2/q$b;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LS2/k$d;)LJ2/E;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->c:LJ2/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LS2/k$d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LS2/k$d;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic d(LS2/k$d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LS2/k$d;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic e(LS2/k$d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LS2/k$d;->n:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic f(LS2/k$d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LS2/k$d;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic g(LS2/k$d;)F
    .locals 0

    .line 1
    iget p0, p0, LS2/k$d;->j:F

    .line 2
    .line 3
    return p0
.end method

.method static synthetic h(LS2/k$d;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i(LS2/k$d;)I
    .locals 0

    .line 1
    iget p0, p0, LS2/k$d;->i:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic j(LS2/k$d;)LS2/L;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->k:LS2/L;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k(LS2/k$d;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->g:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic l(LS2/k$d;)LS2/K;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/k$d;->h:LS2/K;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic m(LS2/k$d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LS2/k$d;->e:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public n()LS2/k;
    .locals 3

    .line 1
    iget-boolean v0, p0, LS2/k$d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LS2/k$d;->g:Landroid/os/Handler;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, LS2/k$d;->h:LS2/K;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, LS2/k$d;->h:LS2/K;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :cond_1
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 26
    .line 27
    .line 28
    iput-boolean v1, p0, LS2/k$d;->b:Z

    .line 29
    .line 30
    new-instance v0, LS2/k;

    .line 31
    .line 32
    invoke-direct {v0, p0}, LS2/k;-><init>(LS2/k$d;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public o(Z)LS2/k$d;
    .locals 0

    .line 1
    iput-boolean p1, p0, LS2/k$d;->n:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public p(J)LS2/k$d;
    .locals 0

    .line 1
    iput-wide p1, p0, LS2/k$d;->m:J

    .line 2
    .line 3
    return-object p0
.end method

.method public q(Z)LS2/k$d;
    .locals 0

    .line 1
    iput-boolean p1, p0, LS2/k$d;->l:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public r(J)LS2/k$d;
    .locals 0

    .line 1
    iput-wide p1, p0, LS2/k$d;->e:J

    .line 2
    .line 3
    return-object p0
.end method

.method public s(LJ2/q$b;)LS2/k$d;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$d;->d:LJ2/q$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public t(Z)LS2/k$d;
    .locals 0

    .line 1
    iput-boolean p1, p0, LS2/k$d;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public u(Landroid/os/Handler;)LS2/k$d;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$d;->g:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public v(LS2/K;)LS2/k$d;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$d;->h:LS2/K;

    .line 2
    .line 3
    return-object p0
.end method

.method public w(I)LS2/k$d;
    .locals 0

    .line 1
    iput p1, p0, LS2/k$d;->i:I

    .line 2
    .line 3
    return-object p0
.end method

.method public x(LJ2/E;)LS2/k$d;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$d;->c:LJ2/E;

    .line 2
    .line 3
    return-object p0
.end method
