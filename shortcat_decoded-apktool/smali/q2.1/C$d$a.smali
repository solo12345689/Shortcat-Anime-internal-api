.class public final Lq2/C$d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    iput-wide v0, p0, Lq2/C$d$a;->b:J

    return-void
.end method

.method private constructor <init>(Lq2/C$d;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-wide v0, p1, Lq2/C$d;->b:J

    iput-wide v0, p0, Lq2/C$d$a;->a:J

    .line 6
    iget-wide v0, p1, Lq2/C$d;->d:J

    iput-wide v0, p0, Lq2/C$d$a;->b:J

    .line 7
    iget-boolean v0, p1, Lq2/C$d;->e:Z

    iput-boolean v0, p0, Lq2/C$d$a;->c:Z

    .line 8
    iget-boolean v0, p1, Lq2/C$d;->f:Z

    iput-boolean v0, p0, Lq2/C$d$a;->d:Z

    .line 9
    iget-boolean v0, p1, Lq2/C$d;->g:Z

    iput-boolean v0, p0, Lq2/C$d$a;->e:Z

    .line 10
    iget-boolean p1, p1, Lq2/C$d;->h:Z

    iput-boolean p1, p0, Lq2/C$d$a;->f:Z

    return-void
.end method

.method synthetic constructor <init>(Lq2/C$d;Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/C$d$a;-><init>(Lq2/C$d;)V

    return-void
.end method

.method static synthetic a(Lq2/C$d$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/C$d$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic b(Lq2/C$d$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/C$d$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic c(Lq2/C$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$d$a;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic d(Lq2/C$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$d$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic e(Lq2/C$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$d$a;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic f(Lq2/C$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$d$a;->f:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public g()Lq2/C$d;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$d;-><init>(Lq2/C$d$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public h()Lq2/C$e;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$e;-><init>(Lq2/C$d$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public i(Z)Lq2/C$d$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$d$a;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public j(J)Lq2/C$d$a;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lq2/C$d$a;->k(J)Lq2/C$d$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public k(J)Lq2/C$d$a;
    .locals 2

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    :goto_1
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Lq2/C$d$a;->b:J

    .line 21
    .line 22
    return-object p0
.end method

.method public l(Z)Lq2/C$d$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$d$a;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Z)Lq2/C$d$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$d$a;->c:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public n(J)Lq2/C$d$a;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lq2/C$d$a;->o(J)Lq2/C$d$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o(J)Lq2/C$d$a;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lq2/C$d$a;->a:J

    .line 14
    .line 15
    return-object p0
.end method

.method public p(Z)Lq2/C$d$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$d$a;->e:Z

    .line 2
    .line 3
    return-object p0
.end method
