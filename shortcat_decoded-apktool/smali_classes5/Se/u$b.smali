.class public final LSe/u$b;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:Ljava/util/List;

.field private d:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, LSe/u$b;->c:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, LSe/u$b;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, LSe/u$b;->t()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method static synthetic m()LSe/u$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/u$b;->r()LSe/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static r()LSe/u$b;
    .locals 1

    .line 1
    new-instance v0, LSe/u$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/u$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private s()V
    .locals 3

    .line 1
    iget v0, p0, LSe/u$b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, LSe/u$b;->c:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LSe/u$b;->c:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, LSe/u$b;->b:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, LSe/u$b;->b:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private t()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/u$b;->n()LSe/u;

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
    invoke-virtual {p0}, LSe/u$b;->q()LSe/u$b;

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
    check-cast p1, LSe/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/u$b;->u(LSe/u;)LSe/u$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()LSe/u;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/u$b;->p()LSe/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/u;->e()Z

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

.method public p()LSe/u;
    .locals 4

    .line 1
    new-instance v0, LSe/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/u;-><init>(LZe/i$b;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/u$b;->b:I

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
    iget-object v2, p0, LSe/u$b;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, LSe/u$b;->c:Ljava/util/List;

    .line 21
    .line 22
    iget v2, p0, LSe/u$b;->b:I

    .line 23
    .line 24
    and-int/lit8 v2, v2, -0x2

    .line 25
    .line 26
    iput v2, p0, LSe/u$b;->b:I

    .line 27
    .line 28
    :cond_0
    iget-object v2, p0, LSe/u$b;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v2}, LSe/u;->t(LSe/u;Ljava/util/List;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v3, 0x0

    .line 39
    :goto_0
    iget v1, p0, LSe/u$b;->d:I

    .line 40
    .line 41
    invoke-static {v0, v1}, LSe/u;->u(LSe/u;I)I

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v3}, LSe/u;->v(LSe/u;I)I

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public q()LSe/u$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/u$b;->r()LSe/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/u$b;->p()LSe/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/u$b;->u(LSe/u;)LSe/u$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public u(LSe/u;)LSe/u$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/u;->x()LSe/u;

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
    invoke-static {p1}, LSe/u;->s(LSe/u;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, LSe/u$b;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, LSe/u;->s(LSe/u;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, LSe/u$b;->c:Ljava/util/List;

    .line 31
    .line 32
    iget v0, p0, LSe/u$b;->b:I

    .line 33
    .line 34
    and-int/lit8 v0, v0, -0x2

    .line 35
    .line 36
    iput v0, p0, LSe/u$b;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-direct {p0}, LSe/u$b;->s()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LSe/u$b;->c:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {p1}, LSe/u;->s(LSe/u;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    invoke-virtual {p1}, LSe/u;->C()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, LSe/u;->y()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0, v0}, LSe/u$b;->x(I)LSe/u$b;

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1}, LSe/u;->w(LSe/u;)LZe/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public v(LZe/e;LZe/g;)LSe/u$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/u;->i:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/u;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/u$b;->u(LSe/u;)LSe/u$b;

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
    check-cast p2, LSe/u;
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
    invoke-virtual {p0, v0}, LSe/u$b;->u(LSe/u;)LSe/u$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public x(I)LSe/u$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/u$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, LSe/u$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/u$b;->d:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/u$b;->v(LZe/e;LZe/g;)LSe/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
