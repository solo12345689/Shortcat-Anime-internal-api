.class public final LS2/q$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LS2/v;

.field private c:Lq2/k0$a;

.field private d:Z

.field private e:Lt2/j;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LS2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LS2/q$b;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LS2/q$b;->b:LS2/v;

    .line 11
    .line 12
    sget-object p1, Lt2/j;->a:Lt2/j;

    .line 13
    .line 14
    iput-object p1, p0, LS2/q$b;->e:Lt2/j;

    .line 15
    .line 16
    return-void
.end method

.method static synthetic a(LS2/q$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/q$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LS2/q$b;)Lq2/k0$a;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/q$b;->c:Lq2/k0$a;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LS2/q$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LS2/q$b;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic d(LS2/q$b;)Lt2/j;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/q$b;->e:Lt2/j;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LS2/q$b;)LS2/v;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/q$b;->b:LS2/v;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public f()LS2/q;
    .locals 3

    .line 1
    iget-boolean v0, p0, LS2/q$b;->f:Z

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
    iget-object v0, p0, LS2/q$b;->c:Lq2/k0$a;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, LS2/q$f;

    .line 13
    .line 14
    iget-boolean v2, p0, LS2/q$b;->g:Z

    .line 15
    .line 16
    invoke-direct {v0, v2}, LS2/q$f;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LS2/q$b;->c:Lq2/k0$a;

    .line 20
    .line 21
    :cond_0
    new-instance v0, LS2/q;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v0, p0, v2}, LS2/q;-><init>(LS2/q$b;LS2/q$a;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, LS2/q$b;->f:Z

    .line 28
    .line 29
    return-object v0
.end method

.method public g(Lt2/j;)LS2/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/q$b;->e:Lt2/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Z)LS2/q$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LS2/q$b;->d:Z

    .line 2
    .line 3
    return-object p0
.end method
