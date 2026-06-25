.class public final LSe/n$b;
.super LZe/i$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:LSe/q;

.field private f:LSe/p;

.field private g:LSe/m;

.field private h:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LSe/q;->v()LSe/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LSe/n$b;->e:LSe/q;

    .line 9
    .line 10
    invoke-static {}, LSe/p;->v()LSe/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LSe/n$b;->f:LSe/p;

    .line 15
    .line 16
    invoke-static {}, LSe/m;->L()LSe/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LSe/n$b;->g:LSe/m;

    .line 21
    .line 22
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 23
    .line 24
    iput-object v0, p0, LSe/n$b;->h:Ljava/util/List;

    .line 25
    .line 26
    invoke-direct {p0}, LSe/n$b;->y()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method static synthetic r()LSe/n$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/n$b;->v()LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static v()LSe/n$b;
    .locals 1

    .line 1
    new-instance v0, LSe/n$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/n$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private x()V
    .locals 3

    .line 1
    iget v0, p0, LSe/n$b;->d:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, LSe/n$b;->h:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LSe/n$b;->h:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, LSe/n$b;->d:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, LSe/n$b;->d:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private y()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(LSe/n;)LSe/n$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/n;->L()LSe/n;

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
    invoke-virtual {p1}, LSe/n;->S()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/n;->P()LSe/q;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, LSe/n$b;->E(LSe/q;)LSe/n$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LSe/n;->R()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LSe/n;->O()LSe/p;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, LSe/n$b;->D(LSe/p;)LSe/n$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, LSe/n;->Q()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, LSe/n;->N()LSe/m;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, LSe/n$b;->C(LSe/m;)LSe/n$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-static {p1}, LSe/n;->E(LSe/n;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    iget-object v0, p0, LSe/n$b;->h:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-static {p1}, LSe/n;->E(LSe/n;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, LSe/n$b;->h:Ljava/util/List;

    .line 70
    .line 71
    iget v0, p0, LSe/n$b;->d:I

    .line 72
    .line 73
    and-int/lit8 v0, v0, -0x9

    .line 74
    .line 75
    iput v0, p0, LSe/n$b;->d:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-direct {p0}, LSe/n$b;->x()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, LSe/n$b;->h:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {p1}, LSe/n;->E(LSe/n;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, LZe/i$c;->q(LZe/i$d;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p1}, LSe/n;->H(LSe/n;)LZe/d;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 106
    .line 107
    .line 108
    return-object p0
.end method

.method public B(LZe/e;LZe/g;)LSe/n$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/n;->l:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/n;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/n$b;->A(LSe/n;)LSe/n$b;

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
    check-cast p2, LSe/n;
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
    invoke-virtual {p0, v0}, LSe/n$b;->A(LSe/n;)LSe/n$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public C(LSe/m;)LSe/n$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/n$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSe/n$b;->g:LSe/m;

    .line 8
    .line 9
    invoke-static {}, LSe/m;->L()LSe/m;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LSe/n$b;->g:LSe/m;

    .line 16
    .line 17
    invoke-static {v0}, LSe/m;->c0(LSe/m;)LSe/m$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LSe/m$b;->C(LSe/m;)LSe/m$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LSe/m$b;->t()LSe/m;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LSe/n$b;->g:LSe/m;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LSe/n$b;->g:LSe/m;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LSe/n$b;->d:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LSe/n$b;->d:I

    .line 38
    .line 39
    return-object p0
.end method

.method public D(LSe/p;)LSe/n$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/n$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSe/n$b;->f:LSe/p;

    .line 8
    .line 9
    invoke-static {}, LSe/p;->v()LSe/p;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LSe/n$b;->f:LSe/p;

    .line 16
    .line 17
    invoke-static {v0}, LSe/p;->A(LSe/p;)LSe/p$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LSe/p$b;->u(LSe/p;)LSe/p$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LSe/p$b;->p()LSe/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LSe/n$b;->f:LSe/p;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LSe/n$b;->f:LSe/p;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LSe/n$b;->d:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LSe/n$b;->d:I

    .line 38
    .line 39
    return-object p0
.end method

.method public E(LSe/q;)LSe/n$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/n$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSe/n$b;->e:LSe/q;

    .line 8
    .line 9
    invoke-static {}, LSe/q;->v()LSe/q;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LSe/n$b;->e:LSe/q;

    .line 16
    .line 17
    invoke-static {v0}, LSe/q;->A(LSe/q;)LSe/q$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LSe/q$b;->u(LSe/q;)LSe/q$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LSe/q$b;->p()LSe/q;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LSe/n$b;->e:LSe/q;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LSe/n$b;->e:LSe/q;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LSe/n$b;->d:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LSe/n$b;->d:I

    .line 38
    .line 39
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/n$b;->s()LSe/n;

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
    invoke-virtual {p0}, LSe/n$b;->u()LSe/n$b;

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
    check-cast p1, LSe/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/n$b;->A(LSe/n;)LSe/n$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public s()LSe/n;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/n$b;->t()LSe/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/n;->e()Z

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

.method public t()LSe/n;
    .locals 5

    .line 1
    new-instance v0, LSe/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/n;-><init>(LZe/i$c;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/n$b;->d:I

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
    iget-object v2, p0, LSe/n$b;->e:LSe/q;

    .line 17
    .line 18
    invoke-static {v0, v2}, LSe/n;->B(LSe/n;LSe/q;)LSe/q;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, LSe/n$b;->f:LSe/p;

    .line 29
    .line 30
    invoke-static {v0, v2}, LSe/n;->C(LSe/n;LSe/p;)LSe/p;

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    or-int/lit8 v3, v3, 0x4

    .line 38
    .line 39
    :cond_2
    iget-object v1, p0, LSe/n$b;->g:LSe/m;

    .line 40
    .line 41
    invoke-static {v0, v1}, LSe/n;->D(LSe/n;LSe/m;)LSe/m;

    .line 42
    .line 43
    .line 44
    iget v1, p0, LSe/n$b;->d:I

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    and-int/2addr v1, v2

    .line 49
    if-ne v1, v2, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, LSe/n$b;->h:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, LSe/n$b;->h:Ljava/util/List;

    .line 58
    .line 59
    iget v1, p0, LSe/n$b;->d:I

    .line 60
    .line 61
    and-int/lit8 v1, v1, -0x9

    .line 62
    .line 63
    iput v1, p0, LSe/n$b;->d:I

    .line 64
    .line 65
    :cond_3
    iget-object v1, p0, LSe/n$b;->h:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v0, v1}, LSe/n;->F(LSe/n;Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v3}, LSe/n;->G(LSe/n;I)I

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public u()LSe/n$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/n$b;->v()LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/n$b;->t()LSe/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/n$b;->A(LSe/n;)LSe/n$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/n$b;->B(LZe/e;LZe/g;)LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
