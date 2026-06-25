.class public Lq5/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field a:Lq5/b$r;

.field b:Lq5/e;

.field c:Ljava/lang/String;

.field d:Lq5/g$b;

.field e:Ljava/lang/String;

.field f:Lq5/g$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq5/f;->a:Lq5/b$r;

    .line 3
    iput-object v0, p0, Lq5/f;->b:Lq5/e;

    .line 4
    iput-object v0, p0, Lq5/f;->c:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lq5/f;->d:Lq5/g$b;

    .line 6
    iput-object v0, p0, Lq5/f;->e:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lq5/f;->f:Lq5/g$b;

    return-void
.end method

.method public constructor <init>(Lq5/f;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lq5/f;->a:Lq5/b$r;

    .line 10
    iput-object v0, p0, Lq5/f;->b:Lq5/e;

    .line 11
    iput-object v0, p0, Lq5/f;->c:Ljava/lang/String;

    .line 12
    iput-object v0, p0, Lq5/f;->d:Lq5/g$b;

    .line 13
    iput-object v0, p0, Lq5/f;->e:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lq5/f;->f:Lq5/g$b;

    if-nez p1, :cond_0

    return-void

    .line 15
    :cond_0
    iget-object v0, p1, Lq5/f;->a:Lq5/b$r;

    iput-object v0, p0, Lq5/f;->a:Lq5/b$r;

    .line 16
    iget-object v0, p1, Lq5/f;->b:Lq5/e;

    iput-object v0, p0, Lq5/f;->b:Lq5/e;

    .line 17
    iget-object v0, p1, Lq5/f;->d:Lq5/g$b;

    iput-object v0, p0, Lq5/f;->d:Lq5/g$b;

    .line 18
    iget-object v0, p1, Lq5/f;->e:Ljava/lang/String;

    iput-object v0, p0, Lq5/f;->e:Ljava/lang/String;

    .line 19
    iget-object p1, p1, Lq5/f;->f:Lq5/g$b;

    iput-object p1, p0, Lq5/f;->f:Lq5/g$b;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->a:Lq5/b$r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq5/b$r;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->b:Lq5/e;

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

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->c:Ljava/lang/String;

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

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->e:Ljava/lang/String;

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

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->d:Lq5/g$b;

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

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/f;->f:Lq5/g$b;

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

.method public g(FFFF)Lq5/f;
    .locals 1

    .line 1
    new-instance v0, Lq5/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lq5/g$b;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lq5/f;->f:Lq5/g$b;

    .line 7
    .line 8
    return-object p0
.end method
