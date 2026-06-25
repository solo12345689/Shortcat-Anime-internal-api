.class public final LSe/b$b$b;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:LSe/b$b$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LSe/b$b$c;->M()LSe/b$b$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 9
    .line 10
    invoke-direct {p0}, LSe/b$b$b;->s()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method static synthetic m()LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$b$b;->r()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static r()LSe/b$b$b;
    .locals 1

    .line 1
    new-instance v0, LSe/b$b$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/b$b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private s()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/b$b$b;->n()LSe/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/b$b$b;->q()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic j(LZe/i;)LZe/i$b;
    .locals 0

    .line 1
    check-cast p1, LSe/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/b$b$b;->t(LSe/b$b;)LSe/b$b$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()LSe/b$b;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/b$b$b;->p()LSe/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/b$b;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, LZe/a$a;->h(LZe/p;)LZe/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public p()LSe/b$b;
    .locals 4

    .line 1
    new-instance v0, LSe/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/b$b;-><init>(LZe/i$b;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/b$b$b;->b:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget v2, p0, LSe/b$b$b;->c:I

    .line 17
    .line 18
    invoke-static {v0, v2}, LSe/b$b;->s(LSe/b$b;I)I

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    or-int/lit8 v3, v3, 0x2

    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 28
    .line 29
    invoke-static {v0, v1}, LSe/b$b;->t(LSe/b$b;LSe/b$b$c;)LSe/b$b$c;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, LSe/b$b;->u(LSe/b$b;I)I

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public q()LSe/b$b$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/b$b$b;->r()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/b$b$b;->p()LSe/b$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/b$b$b;->t(LSe/b$b;)LSe/b$b$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public t(LSe/b$b;)LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$b;->w()LSe/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, LSe/b$b;->z()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/b$b;->x()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, LSe/b$b$b;->x(I)LSe/b$b$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LSe/b$b;->A()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LSe/b$b;->y()LSe/b$b$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, LSe/b$b$b;->v(LSe/b$b$c;)LSe/b$b$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1}, LSe/b$b;->v(LSe/b$b;)LZe/d;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public u(LZe/e;LZe/g;)LSe/b$b$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/b$b;->i:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/b$b;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/b$b$b;->t(LSe/b$b;)LSe/b$b$b;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    invoke-virtual {p1}, LZe/k;->a()LZe/p;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, LSe/b$b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception p1

    .line 27
    move-object v0, p2

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, LSe/b$b$b;->t(LSe/b$b;)LSe/b$b$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public v(LSe/b$b$c;)LSe/b$b$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/b$b$b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 8
    .line 9
    invoke-static {}, LSe/b$b$c;->M()LSe/b$b$c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 16
    .line 17
    invoke-static {v0}, LSe/b$b$c;->g0(LSe/b$b$c;)LSe/b$b$c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LSe/b$b$c$b;->v(LSe/b$b$c;)LSe/b$b$c$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LSe/b$b$c$b;->p()LSe/b$b$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LSe/b$b$b;->d:LSe/b$b$c;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LSe/b$b$b;->b:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LSe/b$b$b;->b:I

    .line 38
    .line 39
    return-object p0
.end method

.method public x(I)LSe/b$b$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/b$b$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LSe/b$b$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/b$b$b;->c:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/b$b$b;->u(LZe/e;LZe/g;)LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
