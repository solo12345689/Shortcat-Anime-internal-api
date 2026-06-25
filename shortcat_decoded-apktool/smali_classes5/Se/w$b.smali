.class public final LSe/w$b;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:LSe/w$c;

.field private f:I

.field private g:I

.field private h:LSe/w$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LSe/w$c;->c:LSe/w$c;

    .line 5
    .line 6
    iput-object v0, p0, LSe/w$b;->e:LSe/w$c;

    .line 7
    .line 8
    sget-object v0, LSe/w$d;->b:LSe/w$d;

    .line 9
    .line 10
    iput-object v0, p0, LSe/w$b;->h:LSe/w$d;

    .line 11
    .line 12
    invoke-direct {p0}, LSe/w$b;->s()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method static synthetic m()LSe/w$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/w$b;->r()LSe/w$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static r()LSe/w$b;
    .locals 1

    .line 1
    new-instance v0, LSe/w$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/w$b;-><init>()V

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
.method public A(I)LSe/w$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/w$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LSe/w$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/w$b;->c:I

    .line 8
    .line 9
    return-object p0
.end method

.method public B(I)LSe/w$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/w$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, LSe/w$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/w$b;->d:I

    .line 8
    .line 9
    return-object p0
.end method

.method public C(LSe/w$d;)LSe/w$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/w$b;->b:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x20

    .line 7
    .line 8
    iput v0, p0, LSe/w$b;->b:I

    .line 9
    .line 10
    iput-object p1, p0, LSe/w$b;->h:LSe/w$d;

    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/w$b;->n()LSe/w;

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
    invoke-virtual {p0}, LSe/w$b;->q()LSe/w$b;

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
    check-cast p1, LSe/w;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/w$b;->t(LSe/w;)LSe/w$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()LSe/w;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/w$b;->p()LSe/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/w;->e()Z

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

.method public p()LSe/w;
    .locals 5

    .line 1
    new-instance v0, LSe/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/w;-><init>(LZe/i$b;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/w$b;->b:I

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
    iget v2, p0, LSe/w$b;->c:I

    .line 17
    .line 18
    invoke-static {v0, v2}, LSe/w;->s(LSe/w;I)I

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
    iget v2, p0, LSe/w$b;->d:I

    .line 29
    .line 30
    invoke-static {v0, v2}, LSe/w;->t(LSe/w;I)I

    .line 31
    .line 32
    .line 33
    and-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-ne v2, v4, :cond_2

    .line 37
    .line 38
    or-int/lit8 v3, v3, 0x4

    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, LSe/w$b;->e:LSe/w$c;

    .line 41
    .line 42
    invoke-static {v0, v2}, LSe/w;->u(LSe/w;LSe/w$c;)LSe/w$c;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v2, v1, 0x8

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    if-ne v2, v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    :cond_3
    iget v2, p0, LSe/w$b;->f:I

    .line 54
    .line 55
    invoke-static {v0, v2}, LSe/w;->v(LSe/w;I)I

    .line 56
    .line 57
    .line 58
    and-int/lit8 v2, v1, 0x10

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    if-ne v2, v4, :cond_4

    .line 63
    .line 64
    or-int/lit8 v3, v3, 0x10

    .line 65
    .line 66
    :cond_4
    iget v2, p0, LSe/w$b;->g:I

    .line 67
    .line 68
    invoke-static {v0, v2}, LSe/w;->w(LSe/w;I)I

    .line 69
    .line 70
    .line 71
    const/16 v2, 0x20

    .line 72
    .line 73
    and-int/2addr v1, v2

    .line 74
    if-ne v1, v2, :cond_5

    .line 75
    .line 76
    or-int/lit8 v3, v3, 0x20

    .line 77
    .line 78
    :cond_5
    iget-object v1, p0, LSe/w$b;->h:LSe/w$d;

    .line 79
    .line 80
    invoke-static {v0, v1}, LSe/w;->x(LSe/w;LSe/w$d;)LSe/w$d;

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, LSe/w;->y(LSe/w;I)I

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public q()LSe/w$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/w$b;->r()LSe/w$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/w$b;->p()LSe/w;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/w$b;->t(LSe/w;)LSe/w$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public t(LSe/w;)LSe/w$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/w;->A()LSe/w;

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
    invoke-virtual {p1}, LSe/w;->K()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/w;->E()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, LSe/w$b;->A(I)LSe/w$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LSe/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LSe/w;->F()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, LSe/w$b;->B(I)LSe/w$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, LSe/w;->I()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, LSe/w;->C()LSe/w$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, LSe/w$b;->x(LSe/w$c;)LSe/w$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, LSe/w;->H()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, LSe/w;->B()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, LSe/w$b;->v(I)LSe/w$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, LSe/w;->J()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, LSe/w;->D()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, v0}, LSe/w$b;->y(I)LSe/w$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, LSe/w;->M()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, LSe/w;->G()LSe/w$d;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, v0}, LSe/w$b;->C(LSe/w$d;)LSe/w$b;

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {p1}, LSe/w;->z(LSe/w;)LZe/d;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 99
    .line 100
    .line 101
    return-object p0
.end method

.method public u(LZe/e;LZe/g;)LSe/w$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/w;->m:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/w;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/w$b;->t(LSe/w;)LSe/w$b;

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
    check-cast p2, LSe/w;
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
    invoke-virtual {p0, v0}, LSe/w$b;->t(LSe/w;)LSe/w$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public v(I)LSe/w$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/w$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, LSe/w$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/w$b;->f:I

    .line 8
    .line 9
    return-object p0
.end method

.method public x(LSe/w$c;)LSe/w$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/w$b;->b:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, LSe/w$b;->b:I

    .line 9
    .line 10
    iput-object p1, p0, LSe/w$b;->e:LSe/w$c;

    .line 11
    .line 12
    return-object p0
.end method

.method public y(I)LSe/w$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/w$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    iput v0, p0, LSe/w$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/w$b;->g:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/w$b;->u(LZe/e;LZe/g;)LSe/w$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
