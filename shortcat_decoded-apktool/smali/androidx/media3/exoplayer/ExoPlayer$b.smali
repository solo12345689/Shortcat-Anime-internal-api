.class public final Landroidx/media3/exoplayer/ExoPlayer$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/ExoPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:J

.field B:J

.field C:Z

.field D:Z

.field E:LA2/M;

.field F:Z

.field G:Z

.field H:Ljava/lang/String;

.field I:Z

.field J:Landroidx/media3/exoplayer/g1;

.field final a:Landroid/content/Context;

.field b:Lt2/j;

.field c:J

.field d:LO9/t;

.field e:LO9/t;

.field f:LO9/t;

.field g:LO9/t;

.field h:LO9/t;

.field i:LO9/f;

.field j:Landroid/os/Looper;

.field k:I

.field l:Lq2/c;

.field m:Z

.field n:I

.field o:Z

.field p:Z

.field q:Z

.field r:I

.field s:I

.field t:Z

.field u:LA2/Q;

.field v:LA2/P;

.field w:J

.field x:J

.field y:J

.field z:LA2/K;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, LA2/z;

    invoke-direct {v0, p1}, LA2/z;-><init>(Landroid/content/Context;)V

    new-instance v1, LA2/A;

    invoke-direct {v1, p1}, LA2/A;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;LO9/t;LO9/t;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA2/O;)V
    .locals 2

    .line 2
    new-instance v0, LA2/B;

    invoke-direct {v0, p2}, LA2/B;-><init>(LA2/O;)V

    new-instance v1, LA2/C;

    invoke-direct {v1, p1}, LA2/C;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;LO9/t;LO9/t;)V

    .line 3
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LO9/t;LO9/t;)V
    .locals 8

    .line 4
    new-instance v4, LA2/D;

    invoke-direct {v4, p1}, LA2/D;-><init>(Landroid/content/Context;)V

    new-instance v5, LA2/E;

    invoke-direct {v5}, LA2/E;-><init>()V

    new-instance v6, LA2/F;

    invoke-direct {v6, p1}, LA2/F;-><init>(Landroid/content/Context;)V

    new-instance v7, LA2/G;

    invoke-direct {v7}, LA2/G;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;LO9/t;LO9/t;LO9/t;LO9/t;LO9/t;LO9/f;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LO9/t;LO9/t;LO9/t;LO9/t;LO9/t;LO9/f;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->d:LO9/t;

    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->e:LO9/t;

    .line 9
    iput-object p4, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:LO9/t;

    .line 10
    iput-object p5, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:LO9/t;

    .line 11
    iput-object p6, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->h:LO9/t;

    .line 12
    iput-object p7, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->i:LO9/f;

    .line 13
    invoke-static {}, Lt2/a0;->Z()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 14
    sget-object p1, Lq2/c;->h:Lq2/c;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->l:Lq2/c;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->n:I

    const/4 p2, 0x1

    .line 16
    iput p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:I

    .line 17
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->s:I

    .line 18
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->t:Z

    .line 19
    sget-object p1, LA2/Q;->g:LA2/Q;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->u:LA2/Q;

    const-wide/16 p3, 0x1388

    .line 20
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->w:J

    const-wide/16 p3, 0x3a98

    .line 21
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    const-wide/16 p3, 0xbb8

    .line 22
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->y:J

    .line 23
    sget-object p1, LA2/P;->i:LA2/P;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->v:LA2/P;

    .line 24
    new-instance p1, Landroidx/media3/exoplayer/i$b;

    invoke-direct {p1}, Landroidx/media3/exoplayer/i$b;-><init>()V

    invoke-virtual {p1}, Landroidx/media3/exoplayer/i$b;->a()Landroidx/media3/exoplayer/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->z:LA2/K;

    .line 25
    sget-object p1, Lt2/j;->a:Lt2/j;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lt2/j;

    const-wide/16 p3, 0x1f4

    .line 26
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->A:J

    const-wide/16 p3, 0x7d0

    .line 27
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->B:J

    .line 28
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->D:Z

    .line 29
    const-string p1, ""

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->H:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 30
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->k:I

    .line 31
    new-instance p1, Landroidx/media3/exoplayer/l;

    invoke-direct {p1}, Landroidx/media3/exoplayer/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->J:Landroidx/media3/exoplayer/g1;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)LA2/O;
    .locals 1

    .line 1
    new-instance v0, LA2/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LA2/d;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(Landroid/content/Context;)LM2/D$a;
    .locals 2

    .line 1
    new-instance v0, LM2/r;

    .line 2
    .line 3
    new-instance v1, LU2/m;

    .line 4
    .line 5
    invoke-direct {v1}, LU2/m;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, LM2/r;-><init>(Landroid/content/Context;LU2/u;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic c(Landroid/content/Context;)LM2/D$a;
    .locals 2

    .line 1
    new-instance v0, LM2/r;

    .line 2
    .line 3
    new-instance v1, LU2/m;

    .line 4
    .line 5
    invoke-direct {v1}, LU2/m;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, LM2/r;-><init>(Landroid/content/Context;LU2/u;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic d(Landroidx/media3/exoplayer/p0;)Landroidx/media3/exoplayer/p0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)LQ2/d;
    .locals 0

    .line 1
    invoke-static {p0}, LQ2/i;->n(Landroid/content/Context;)LQ2/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(LP2/G;)LP2/G;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic g(LA2/O;)LA2/O;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic h(Landroid/content/Context;)LP2/G;
    .locals 1

    .line 1
    new-instance v0, LP2/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP2/n;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public i()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

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
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/exoplayer/Y;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/Y;-><init>(Landroidx/media3/exoplayer/ExoPlayer$b;Lq2/P;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public j(Landroidx/media3/exoplayer/p0;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, LA2/x;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LA2/x;-><init>(Landroidx/media3/exoplayer/p0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:LO9/t;

    .line 17
    .line 18
    return-object p0
.end method

.method public k(Landroid/os/Looper;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 12
    .line 13
    return-object p0
.end method

.method public l(J)Landroidx/media3/exoplayer/ExoPlayer$b;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->w:J

    .line 21
    .line 22
    return-object p0
.end method

.method public m(J)Landroidx/media3/exoplayer/ExoPlayer$b;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    .line 21
    .line 22
    return-object p0
.end method

.method public n(LP2/G;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, LA2/y;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LA2/y;-><init>(LP2/G;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:LO9/t;

    .line 17
    .line 18
    return-object p0
.end method
