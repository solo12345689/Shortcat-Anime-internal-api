.class public LVh/s;
.super Lai/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LYh/v;

.field private final b:LVh/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lai/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LYh/v;

    .line 5
    .line 6
    invoke-direct {v0}, LYh/v;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVh/s;->a:LYh/v;

    .line 10
    .line 11
    new-instance v0, LVh/o;

    .line 12
    .line 13
    invoke-direct {v0}, LVh/o;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LVh/s;->b:LVh/o;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public b(LZh/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LVh/o;->e()LZh/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LZh/g;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LVh/s;->a:LYh/v;

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, LZh/b;->b(LZh/g;LYh/s;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public e(LZh/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVh/o;->h(LZh/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()LYh/a;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/s;->a:LYh/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(LYh/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVh/o;->a(LYh/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LVh/o;->e()LZh/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LZh/g;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVh/s;->a:LYh/v;

    .line 14
    .line 15
    invoke-virtual {v0}, LYh/s;->m()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, LVh/s;->a:LYh/v;

    .line 20
    .line 21
    iget-object v1, p0, LVh/s;->b:LVh/o;

    .line 22
    .line 23
    invoke-virtual {v1}, LVh/o;->f()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, LYh/s;->k(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public i(Lai/h;)Lai/c;
    .locals 1

    .line 1
    invoke-interface {p1}, Lai/h;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lai/h;->getIndex()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Lai/c;->b(I)Lai/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {}, Lai/c;->d()Lai/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LVh/o;->d()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()LZh/g;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/s;->b:LVh/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LVh/o;->e()LZh/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
