.class final LS2/q$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS2/L;
.implements LS2/q$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private c:LP9/u;

.field private d:Lq2/x;

.field private e:I

.field private f:J

.field private g:J

.field private h:LS2/L$a;

.field private i:Ljava/util/concurrent/Executor;

.field private j:Z

.field private k:Z

.field final synthetic l:LS2/q;


# direct methods
.method public constructor <init>(LS2/q;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p3, p0, LS2/q$c;->b:I

    .line 7
    .line 8
    invoke-static {p2}, Lt2/a0;->i0(Landroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, LS2/q$c;->a:I

    .line 13
    .line 14
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LS2/q$c;->c:LP9/u;

    .line 19
    .line 20
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, LS2/q$c;->g:J

    .line 26
    .line 27
    sget-object p1, LS2/L$a;->a:LS2/L$a;

    .line 28
    .line 29
    iput-object p1, p0, LS2/q$c;->h:LS2/L$a;

    .line 30
    .line 31
    invoke-static {}, LS2/q;->w()Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LS2/q$c;->i:Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    return-void
.end method

.method private b(Lq2/x;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lq2/x;->b()Lq2/x$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LS2/q$c;->l:LS2/q;

    .line 6
    .line 7
    iget-object p1, p1, Lq2/x;->E:Lq2/l;

    .line 8
    .line 9
    invoke-static {v1, p1}, LS2/q;->u(LS2/q;Lq2/l;)Lq2/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Lq2/x$b;->V(Lq2/l;)Lq2/x$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 21
    .line 22
    invoke-static {p1}, LS2/q;->v(LS2/q;)Lq2/k0;

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method


# virtual methods
.method public A(LS2/L$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/q$c;->h:LS2/L$a;

    .line 2
    .line 3
    iput-object p2, p0, LS2/q$c;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/q;->L()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 8
    .line 9
    invoke-static {v0}, LS2/q;->j(LS2/q;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LS2/q$c;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(JJ)V
    .locals 3

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    iget-wide v1, p0, LS2/q$c;->f:J

    .line 4
    .line 5
    add-long/2addr p1, v1

    .line 6
    invoke-static {v0, p1, p2, p3, p4}, LS2/q;->s(LS2/q;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LS2/q$c;->f:J

    .line 2
    .line 3
    return-void
.end method

.method public i()V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    iget-wide v1, p0, LS2/q$c;->g:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, LS2/q;->h(LS2/q;J)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 9
    .line 10
    invoke-static {v0}, LS2/q;->d(LS2/q;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, LS2/q$c;->l:LS2/q;

    .line 15
    .line 16
    invoke-static {v2}, LS2/q;->g(LS2/q;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 25
    .line 26
    invoke-static {v0}, LS2/q;->i(LS2/q;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public j(Landroid/view/Surface;Lt2/K;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LS2/q;->O(Landroid/view/Surface;Lt2/K;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->c:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LS2/q$c;->c:LP9/u;

    .line 15
    .line 16
    iget-object p1, p0, LS2/q$c;->d:Lq2/x;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0, p1}, LS2/q$c;->b(Lq2/x;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public l(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-static {v0, p1}, LS2/q;->f(LS2/q;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 9
    .line 10
    invoke-static {v0}, LS2/q;->d(LS2/q;)J

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, LS2/q;->e(LS2/q;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 20
    .line 21
    invoke-static {v0}, LS2/q;->v(LS2/q;)Lq2/k0;

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public n()V
    .locals 10

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-static {v0}, LS2/q;->l(LS2/q;)Lt2/N;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lt2/N;->l()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 14
    .line 15
    invoke-static {v0}, LS2/q;->n(LS2/q;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lt2/N;

    .line 20
    .line 21
    invoke-direct {v0}, Lt2/N;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    move v2, v1

    .line 26
    :goto_0
    iget-object v3, p0, LS2/q$c;->l:LS2/q;

    .line 27
    .line 28
    invoke-static {v3}, LS2/q;->l(LS2/q;)Lt2/N;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lt2/N;->l()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-lez v3, :cond_4

    .line 37
    .line 38
    iget-object v3, p0, LS2/q$c;->l:LS2/q;

    .line 39
    .line 40
    invoke-static {v3}, LS2/q;->l(LS2/q;)Lt2/N;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Lt2/N;->i()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, LS2/q$g;

    .line 49
    .line 50
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, LS2/q$g;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    iget v2, v3, LS2/q$g;->b:I

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    if-ne v2, v1, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v2, p0, LS2/q$c;->l:LS2/q;

    .line 66
    .line 67
    invoke-static {v2}, LS2/q;->n(LS2/q;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    :goto_1
    new-instance v4, LS2/q$g;

    .line 72
    .line 73
    iget-wide v5, v3, LS2/q$g;->a:J

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    iget-wide v8, v3, LS2/q$g;->c:J

    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, LS2/q$g;-><init>(JIJ)V

    .line 79
    .line 80
    .line 81
    move-object v3, v4

    .line 82
    :goto_2
    const/4 v2, 0x0

    .line 83
    :cond_3
    iget-wide v4, v3, LS2/q$g;->c:J

    .line 84
    .line 85
    invoke-virtual {v0, v4, v5, v3}, Lt2/N;->a(JLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget-object v1, p0, LS2/q$c;->l:LS2/q;

    .line 90
    .line 91
    invoke-static {v1, v0}, LS2/q;->m(LS2/q;Lt2/N;)Lt2/N;

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public o()Landroid/view/Surface;
    .locals 2

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 9
    .line 10
    invoke-static {v0}, LS2/q;->v(LS2/q;)Lq2/k0;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public p(Lq2/x;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 11
    .line 12
    iget v1, p0, LS2/q$c;->b:I

    .line 13
    .line 14
    invoke-static {v0, p1, v1}, LS2/q;->c(LS2/q;Lq2/x;I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput-boolean p1, p0, LS2/q$c;->k:Z

    .line 19
    .line 20
    return p1
.end method

.method public q()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-static {v0}, LS2/q;->x(LS2/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 10
    .line 11
    invoke-virtual {v0}, LS2/q;->V()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-static {v0}, LS2/q;->x(LS2/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 10
    .line 11
    invoke-virtual {v0}, LS2/q;->U()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public s(JLS2/L$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 9
    .line 10
    invoke-static {p1}, LS2/q;->r(LS2/q;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 19
    .line 20
    invoke-static {p1}, LS2/q;->v(LS2/q;)Lq2/k0;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public t(F)V
    .locals 1

    .line 1
    iget v0, p0, LS2/q$c;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 6
    .line 7
    invoke-static {v0, p1}, LS2/q;->p(LS2/q;F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget v0, p0, LS2/q$c;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 6
    .line 7
    invoke-static {v0, p1}, LS2/q;->q(LS2/q;I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/q;->A()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, LS2/q$c;->g:J

    .line 13
    .line 14
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 15
    .line 16
    invoke-static {v0, p1}, LS2/q;->e(LS2/q;Z)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, LS2/q$c;->j:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 24
    .line 25
    invoke-static {p1}, LS2/q;->v(LS2/q;)Lq2/k0;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public x(ILq2/x;JILjava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LS2/q$c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p6}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 9
    .line 10
    .line 11
    move-result-object p6

    .line 12
    iput-object p6, p0, LS2/q$c;->c:LP9/u;

    .line 13
    .line 14
    iput p1, p0, LS2/q$c;->e:I

    .line 15
    .line 16
    iput-object p2, p0, LS2/q$c;->d:Lq2/x;

    .line 17
    .line 18
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0, v1}, LS2/q;->h(LS2/q;J)J

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 29
    .line 30
    const/4 p6, 0x0

    .line 31
    invoke-static {p1, p6}, LS2/q;->k(LS2/q;Z)Z

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p2}, LS2/q$c;->b(Lq2/x;)V

    .line 35
    .line 36
    .line 37
    iget-wide p1, p0, LS2/q$c;->g:J

    .line 38
    .line 39
    cmp-long p1, p1, v0

    .line 40
    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    const/4 p6, 0x1

    .line 44
    :cond_0
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 45
    .line 46
    invoke-static {p1}, LS2/q;->x(LS2/q;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    iget p1, p0, LS2/q$c;->b:I

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    if-eqz p6, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void

    .line 60
    :cond_2
    :goto_0
    if-eqz p6, :cond_3

    .line 61
    .line 62
    const-wide/high16 p1, -0x4000000000000000L    # -2.0

    .line 63
    .line 64
    :goto_1
    move-wide v4, p1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget-wide p1, p0, LS2/q$c;->g:J

    .line 67
    .line 68
    const-wide/16 v0, 0x1

    .line 69
    .line 70
    add-long/2addr p1, v0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    iget-object p1, p0, LS2/q$c;->l:LS2/q;

    .line 73
    .line 74
    invoke-static {p1}, LS2/q;->l(LS2/q;)Lt2/N;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, LS2/q$g;

    .line 79
    .line 80
    iget-wide v1, p0, LS2/q$c;->f:J

    .line 81
    .line 82
    add-long/2addr v1, p3

    .line 83
    move v3, p5

    .line 84
    invoke-direct/range {v0 .. v5}, LS2/q$g;-><init>(JIJ)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v4, v5, v0}, Lt2/N;->a(JLjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public y(LS2/u;)V
    .locals 1

    .line 1
    iget v0, p0, LS2/q$c;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 6
    .line 7
    invoke-static {v0, p1}, LS2/q;->o(LS2/q;LS2/u;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 2
    .line 3
    invoke-static {v0}, LS2/q;->x(LS2/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/q$c;->l:LS2/q;

    .line 10
    .line 11
    invoke-static {v0, p1}, LS2/q;->t(LS2/q;Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
