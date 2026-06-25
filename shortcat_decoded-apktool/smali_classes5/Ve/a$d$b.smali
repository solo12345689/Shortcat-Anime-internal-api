.class public final LVe/a$d$b;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVe/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:LVe/a$b;

.field private d:LVe/a$c;

.field private e:LVe/a$c;

.field private f:LVe/a$c;

.field private g:LVe/a$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LVe/a$b;->w()LVe/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 9
    .line 10
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 15
    .line 16
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 21
    .line 22
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 27
    .line 28
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 33
    .line 34
    invoke-direct {p0}, LVe/a$d$b;->s()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method static synthetic m()LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, LVe/a$d$b;->r()LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static r()LVe/a$d$b;
    .locals 1

    .line 1
    new-instance v0, LVe/a$d$b;

    .line 2
    .line 3
    invoke-direct {v0}, LVe/a$d$b;-><init>()V

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
.method public A(LVe/a$c;)LVe/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, LVe/a$d$b;->b:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 9
    .line 10
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 17
    .line 18
    invoke-static {v0}, LVe/a$c;->D(LVe/a$c;)LVe/a$c$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LVe/a$c$b;->p()LVe/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, LVe/a$d$b;->b:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, LVe/a$d$b;->b:I

    .line 39
    .line 40
    return-object p0
.end method

.method public B(LVe/a$c;)LVe/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, LVe/a$d$b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 8
    .line 9
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 16
    .line 17
    invoke-static {v0}, LVe/a$c;->D(LVe/a$c;)LVe/a$c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LVe/a$c$b;->p()LVe/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LVe/a$d$b;->b:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LVe/a$d$b;->b:I

    .line 38
    .line 39
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LVe/a$d$b;->n()LVe/a$d;

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
    invoke-virtual {p0}, LVe/a$d$b;->q()LVe/a$d$b;

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
    check-cast p1, LVe/a$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LVe/a$d$b;->v(LVe/a$d;)LVe/a$d$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()LVe/a$d;
    .locals 2

    .line 1
    invoke-virtual {p0}, LVe/a$d$b;->p()LVe/a$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LVe/a$d;->e()Z

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

.method public p()LVe/a$d;
    .locals 5

    .line 1
    new-instance v0, LVe/a$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LVe/a$d;-><init>(LZe/i$b;LVe/a$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LVe/a$d$b;->b:I

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
    iget-object v2, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 17
    .line 18
    invoke-static {v0, v2}, LVe/a$d;->s(LVe/a$d;LVe/a$b;)LVe/a$b;

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
    iget-object v2, p0, LVe/a$d$b;->d:LVe/a$c;

    .line 29
    .line 30
    invoke-static {v0, v2}, LVe/a$d;->t(LVe/a$d;LVe/a$c;)LVe/a$c;

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
    iget-object v2, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 41
    .line 42
    invoke-static {v0, v2}, LVe/a$d;->u(LVe/a$d;LVe/a$c;)LVe/a$c;

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
    iget-object v2, p0, LVe/a$d$b;->f:LVe/a$c;

    .line 54
    .line 55
    invoke-static {v0, v2}, LVe/a$d;->v(LVe/a$d;LVe/a$c;)LVe/a$c;

    .line 56
    .line 57
    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    and-int/2addr v1, v2

    .line 61
    if-ne v1, v2, :cond_4

    .line 62
    .line 63
    or-int/lit8 v3, v3, 0x10

    .line 64
    .line 65
    :cond_4
    iget-object v1, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 66
    .line 67
    invoke-static {v0, v1}, LVe/a$d;->w(LVe/a$d;LVe/a$c;)LVe/a$c;

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v3}, LVe/a$d;->x(LVe/a$d;I)I

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public q()LVe/a$d$b;
    .locals 2

    .line 1
    invoke-static {}, LVe/a$d$b;->r()LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LVe/a$d$b;->p()LVe/a$d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LVe/a$d$b;->v(LVe/a$d;)LVe/a$d$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public t(LVe/a$c;)LVe/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, LVe/a$d$b;->b:I

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
    iget-object v0, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 9
    .line 10
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 17
    .line 18
    invoke-static {v0}, LVe/a$c;->D(LVe/a$c;)LVe/a$c$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LVe/a$c$b;->p()LVe/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, LVe/a$d$b;->g:LVe/a$c;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, LVe/a$d$b;->b:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, LVe/a$d$b;->b:I

    .line 39
    .line 40
    return-object p0
.end method

.method public u(LVe/a$b;)LVe/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, LVe/a$d$b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 8
    .line 9
    invoke-static {}, LVe/a$b;->w()LVe/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 16
    .line 17
    invoke-static {v0}, LVe/a$b;->D(LVe/a$b;)LVe/a$b$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LVe/a$b$b;->t(LVe/a$b;)LVe/a$b$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LVe/a$b$b;->p()LVe/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LVe/a$d$b;->c:LVe/a$b;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LVe/a$d$b;->b:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LVe/a$d$b;->b:I

    .line 38
    .line 39
    return-object p0
.end method

.method public v(LVe/a$d;)LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, LVe/a$d;->z()LVe/a$d;

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
    invoke-virtual {p1}, LVe/a$d;->G()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LVe/a$d;->B()LVe/a$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, LVe/a$d$b;->u(LVe/a$b;)LVe/a$d$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LVe/a$d;->J()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LVe/a$d;->E()LVe/a$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, LVe/a$d$b;->B(LVe/a$c;)LVe/a$d$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, LVe/a$d;->H()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, LVe/a$d;->C()LVe/a$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, LVe/a$d$b;->y(LVe/a$c;)LVe/a$d$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, LVe/a$d;->I()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, LVe/a$d;->D()LVe/a$c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, LVe/a$d$b;->A(LVe/a$c;)LVe/a$d$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, LVe/a$d;->F()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, LVe/a$d;->A()LVe/a$c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, LVe/a$d$b;->t(LVe/a$c;)LVe/a$d$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {p1}, LVe/a$d;->y(LVe/a$d;)LZe/d;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 86
    .line 87
    .line 88
    return-object p0
.end method

.method public x(LZe/e;LZe/g;)LVe/a$d$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LVe/a$d;->l:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LVe/a$d;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LVe/a$d$b;->v(LVe/a$d;)LVe/a$d$b;

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
    check-cast p2, LVe/a$d;
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
    invoke-virtual {p0, v0}, LVe/a$d$b;->v(LVe/a$d;)LVe/a$d$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public y(LVe/a$c;)LVe/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, LVe/a$d$b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 8
    .line 9
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 16
    .line 17
    invoke-static {v0}, LVe/a$c;->D(LVe/a$c;)LVe/a$c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LVe/a$c$b;->p()LVe/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, LVe/a$d$b;->e:LVe/a$c;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, LVe/a$d$b;->b:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, LVe/a$d$b;->b:I

    .line 38
    .line 39
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVe/a$d$b;->x(LZe/e;LZe/g;)LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
