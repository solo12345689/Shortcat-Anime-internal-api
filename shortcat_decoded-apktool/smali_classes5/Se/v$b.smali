.class public final LSe/v$b;
.super LZe/i$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:I

.field private g:LSe/r;

.field private h:I

.field private i:LSe/r;

.field private j:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LSe/v$b;->g:LSe/r;

    .line 9
    .line 10
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LSe/v$b;->i:LSe/r;

    .line 15
    .line 16
    invoke-direct {p0}, LSe/v$b;->x()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method static synthetic r()LSe/v$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/v$b;->v()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static v()LSe/v$b;
    .locals 1

    .line 1
    new-instance v0, LSe/v$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/v$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private x()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(LZe/e;LZe/g;)LSe/v$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/v;->n:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/v;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/v$b;->y(LSe/v;)LSe/v$b;

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
    check-cast p2, LSe/v;
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
    invoke-virtual {p0, v0}, LSe/v$b;->y(LSe/v;)LSe/v$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public B(LSe/r;)LSe/v$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSe/v$b;->g:LSe/r;

    .line 8
    .line 9
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LSe/v$b;->g:LSe/r;

    .line 16
    .line 17
    invoke-static {v0}, LSe/r;->z0(LSe/r;)LSe/r$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LSe/r$c;->t()LSe/r;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LSe/v$b;->g:LSe/r;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LSe/v$b;->g:LSe/r;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LSe/v$b;->d:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LSe/v$b;->d:I

    .line 38
    .line 39
    return-object p0
.end method

.method public C(LSe/r;)LSe/v$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LSe/v$b;->i:LSe/r;

    .line 9
    .line 10
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LSe/v$b;->i:LSe/r;

    .line 17
    .line 18
    invoke-static {v0}, LSe/r;->z0(LSe/r;)LSe/r$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LSe/r$c;->t()LSe/r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LSe/v$b;->i:LSe/r;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, LSe/v$b;->i:LSe/r;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, LSe/v$b;->d:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, LSe/v$b;->d:I

    .line 39
    .line 40
    return-object p0
.end method

.method public D(I)LSe/v$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LSe/v$b;->d:I

    .line 6
    .line 7
    iput p1, p0, LSe/v$b;->e:I

    .line 8
    .line 9
    return-object p0
.end method

.method public E(I)LSe/v$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, LSe/v$b;->d:I

    .line 6
    .line 7
    iput p1, p0, LSe/v$b;->f:I

    .line 8
    .line 9
    return-object p0
.end method

.method public F(I)LSe/v$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, LSe/v$b;->d:I

    .line 6
    .line 7
    iput p1, p0, LSe/v$b;->h:I

    .line 8
    .line 9
    return-object p0
.end method

.method public G(I)LSe/v$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/v$b;->d:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, LSe/v$b;->d:I

    .line 6
    .line 7
    iput p1, p0, LSe/v$b;->j:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/v$b;->s()LSe/v;

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
    invoke-virtual {p0}, LSe/v$b;->u()LSe/v$b;

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
    check-cast p1, LSe/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/v$b;->y(LSe/v;)LSe/v$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public s()LSe/v;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/v$b;->t()LSe/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/v;->e()Z

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

.method public t()LSe/v;
    .locals 5

    .line 1
    new-instance v0, LSe/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/v;-><init>(LZe/i$c;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/v$b;->d:I

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
    iget v2, p0, LSe/v$b;->e:I

    .line 17
    .line 18
    invoke-static {v0, v2}, LSe/v;->B(LSe/v;I)I

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
    iget v2, p0, LSe/v$b;->f:I

    .line 29
    .line 30
    invoke-static {v0, v2}, LSe/v;->C(LSe/v;I)I

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
    iget-object v2, p0, LSe/v$b;->g:LSe/r;

    .line 41
    .line 42
    invoke-static {v0, v2}, LSe/v;->D(LSe/v;LSe/r;)LSe/r;

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
    iget v2, p0, LSe/v$b;->h:I

    .line 54
    .line 55
    invoke-static {v0, v2}, LSe/v;->E(LSe/v;I)I

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
    iget-object v2, p0, LSe/v$b;->i:LSe/r;

    .line 67
    .line 68
    invoke-static {v0, v2}, LSe/v;->F(LSe/v;LSe/r;)LSe/r;

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
    iget v1, p0, LSe/v$b;->j:I

    .line 79
    .line 80
    invoke-static {v0, v1}, LSe/v;->G(LSe/v;I)I

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, LSe/v;->H(LSe/v;I)I

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public u()LSe/v$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/v$b;->v()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/v$b;->t()LSe/v;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/v$b;->y(LSe/v;)LSe/v$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public y(LSe/v;)LSe/v$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/v;->J()LSe/v;

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
    invoke-virtual {p1}, LSe/v;->R()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/v;->L()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, LSe/v$b;->D(I)LSe/v$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LSe/v;->S()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LSe/v;->M()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, LSe/v$b;->E(I)LSe/v$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, LSe/v;->T()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, LSe/v;->N()LSe/r;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, LSe/v$b;->B(LSe/r;)LSe/v$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, LSe/v;->U()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, LSe/v;->O()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, LSe/v$b;->F(I)LSe/v$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, LSe/v;->V()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, LSe/v;->P()LSe/r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, LSe/v$b;->C(LSe/r;)LSe/v$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, LSe/v;->W()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, LSe/v;->Q()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, LSe/v$b;->G(I)LSe/v$b;

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {p0, p1}, LZe/i$c;->q(LZe/i$d;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1}, LSe/v;->I(LSe/v;)LZe/d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 102
    .line 103
    .line 104
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/v$b;->A(LZe/e;LZe/g;)LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
