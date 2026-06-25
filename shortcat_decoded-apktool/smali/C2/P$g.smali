.class public final LC2/P$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:LC2/e;

.field private c:Lr2/p;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:LC2/P$e;

.field private h:LC2/P$f;

.field private i:LC2/P$d;

.field private j:Z

.field private k:Landroidx/media3/exoplayer/ExoPlayer$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LC2/P$g;->j:Z

    .line 6
    .line 7
    iput-object p1, p0, LC2/P$g;->a:Landroid/content/Context;

    .line 8
    .line 9
    sget-object p1, LC2/e;->c:LC2/e;

    .line 10
    .line 11
    iput-object p1, p0, LC2/P$g;->b:LC2/e;

    .line 12
    .line 13
    sget-object p1, LC2/P$e;->a:LC2/P$e;

    .line 14
    .line 15
    iput-object p1, p0, LC2/P$g;->g:LC2/P$e;

    .line 16
    .line 17
    sget-object p1, LC2/P$f;->a:LC2/P$f;

    .line 18
    .line 19
    iput-object p1, p0, LC2/P$g;->h:LC2/P$f;

    .line 20
    .line 21
    return-void
.end method

.method static synthetic a(LC2/P$g;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LC2/P$g;)Landroidx/media3/exoplayer/ExoPlayer$a;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->k:Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LC2/P$g;)LC2/P$f;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->h:LC2/P$f;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LC2/P$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LC2/P$g;->j:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic e(LC2/P$g;)LC2/e;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->b:LC2/e;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(LC2/P$g;)Lr2/p;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->c:Lr2/p;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(LC2/P$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LC2/P$g;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic h(LC2/P$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LC2/P$g;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic i(LC2/P$g;)LC2/P$e;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->g:LC2/P$e;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(LC2/P$g;)LC2/P$d;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P$g;->i:LC2/P$d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public k()LC2/P;
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/P$g;->f:Z

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
    iput-boolean v1, p0, LC2/P$g;->f:Z

    .line 9
    .line 10
    iget-object v0, p0, LC2/P$g;->c:Lr2/p;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, LC2/P$i;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    new-array v1, v1, [Lr2/o;

    .line 18
    .line 19
    invoke-direct {v0, v1}, LC2/P$i;-><init>([Lr2/o;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LC2/P$g;->c:Lr2/p;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, LC2/P$g;->i:LC2/P$d;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, LC2/E;

    .line 29
    .line 30
    iget-object v1, p0, LC2/P$g;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-direct {v0, v1}, LC2/E;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LC2/P$g;->i:LC2/P$d;

    .line 36
    .line 37
    :cond_1
    new-instance v0, LC2/P;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, LC2/P;-><init>(LC2/P$g;LC2/P$a;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public l(Z)LC2/P$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/P$g;->e:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Z)LC2/P$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/P$g;->d:Z

    .line 2
    .line 3
    return-object p0
.end method
