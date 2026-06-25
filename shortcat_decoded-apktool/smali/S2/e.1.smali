.class final LS2/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS2/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS2/e$b;
    }
.end annotation


# instance fields
.field private final a:LS2/v;

.field private final b:LS2/z;

.field private final c:Ljava/util/Queue;

.field private d:Landroid/view/Surface;

.field private e:Lq2/x;

.field private f:J

.field private g:LS2/L$a;

.field private h:Ljava/util/concurrent/Executor;

.field private i:LS2/u;


# direct methods
.method public constructor <init>(LS2/v;Lt2/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS2/e;->a:LS2/v;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, LS2/v;->m(Lt2/j;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, LS2/z;

    .line 10
    .line 11
    new-instance v0, LS2/e$b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, LS2/e$b;-><init>(LS2/e;LS2/e$a;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p2, v0, p1}, LS2/z;-><init>(LS2/z$a;LS2/v;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, LS2/e;->b:LS2/z;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LS2/e;->c:Ljava/util/Queue;

    .line 28
    .line 29
    new-instance p1, Lq2/x$b;

    .line 30
    .line 31
    invoke-direct {p1}, Lq2/x$b;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, LS2/e;->e:Lq2/x;

    .line 39
    .line 40
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide p1, p0, LS2/e;->f:J

    .line 46
    .line 47
    sget-object p1, LS2/L$a;->a:LS2/L$a;

    .line 48
    .line 49
    iput-object p1, p0, LS2/e;->g:LS2/L$a;

    .line 50
    .line 51
    new-instance p1, LS2/b;

    .line 52
    .line 53
    invoke-direct {p1}, LS2/b;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LS2/e;->h:Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    new-instance p1, LS2/c;

    .line 59
    .line 60
    invoke-direct {p1}, LS2/c;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LS2/e;->i:LS2/u;

    .line 64
    .line 65
    return-void
.end method

.method static synthetic B(LS2/e;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->h:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(LS2/e;)Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(LS2/e;)LS2/u;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->i:LS2/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic E(LS2/e;)Ljava/util/Queue;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->c:Ljava/util/Queue;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic F(LS2/e;)LS2/L$a;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->g:LS2/L$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic c(LS2/e;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/e;->g:LS2/L$a;

    .line 2
    .line 3
    invoke-interface {p0}, LS2/L$a;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic f(JJLq2/x;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(LS2/L$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/e;->g:LS2/L$a;

    .line 2
    .line 3
    iput-object p2, p0, LS2/e;->h:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
.end method

.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->b:LS2/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/z;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public g(JJ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LS2/e;->b:LS2/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LS2/z;->j(JJ)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance p2, LS2/L$c;

    .line 9
    .line 10
    iget-object p3, p0, LS2/e;->e:Lq2/x;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, LS2/L$c;-><init>(Ljava/lang/Throwable;Lq2/x;)V

    .line 13
    .line 14
    .line 15
    throw p2
.end method

.method public h(J)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->b:LS2/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/z;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(Landroid/view/Surface;Lt2/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p2, p0, LS2/e;->a:LS2/v;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, LS2/v;->o(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k(Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public l(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/v;->d(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public m()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/v;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    return-object v0
.end method

.method public p(Lq2/x;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public q()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/v;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/v;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(JLS2/L$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->c:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, LS2/e;->b:LS2/z;

    .line 7
    .line 8
    invoke-virtual {p3, p1, p2}, LS2/z;->g(J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LS2/e;->h:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance p2, LS2/d;

    .line 14
    .line 15
    invoke-direct {p2, p0}, LS2/d;-><init>(LS2/e;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method public t(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/v;->p(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/v;->l(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LS2/e;->d:Landroid/view/Surface;

    .line 3
    .line 4
    iget-object v1, p0, LS2/e;->a:LS2/v;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, LS2/v;->o(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LS2/e;->a:LS2/v;

    .line 4
    .line 5
    invoke-virtual {p1}, LS2/v;->k()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, LS2/e;->b:LS2/z;

    .line 9
    .line 10
    invoke-virtual {p1}, LS2/z;->b()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LS2/e;->c:Ljava/util/Queue;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public x(ILq2/x;JILjava/util/List;)V
    .locals 1

    .line 1
    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget p1, p2, Lq2/x;->v:I

    .line 9
    .line 10
    iget-object p6, p0, LS2/e;->e:Lq2/x;

    .line 11
    .line 12
    iget v0, p6, Lq2/x;->v:I

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    iget v0, p2, Lq2/x;->w:I

    .line 17
    .line 18
    iget p6, p6, Lq2/x;->w:I

    .line 19
    .line 20
    if-eq v0, p6, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object p6, p0, LS2/e;->b:LS2/z;

    .line 23
    .line 24
    iget v0, p2, Lq2/x;->w:I

    .line 25
    .line 26
    invoke-virtual {p6, p1, v0}, LS2/z;->i(II)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget p1, p2, Lq2/x;->z:F

    .line 30
    .line 31
    iget-object p6, p0, LS2/e;->e:Lq2/x;

    .line 32
    .line 33
    iget p6, p6, Lq2/x;->z:F

    .line 34
    .line 35
    cmpl-float p6, p1, p6

    .line 36
    .line 37
    if-eqz p6, :cond_2

    .line 38
    .line 39
    iget-object p6, p0, LS2/e;->a:LS2/v;

    .line 40
    .line 41
    invoke-virtual {p6, p1}, LS2/v;->n(F)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iput-object p2, p0, LS2/e;->e:Lq2/x;

    .line 45
    .line 46
    iget-wide p1, p0, LS2/e;->f:J

    .line 47
    .line 48
    cmp-long p1, p3, p1

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, LS2/e;->b:LS2/z;

    .line 53
    .line 54
    invoke-virtual {p1, p5, p3, p4}, LS2/z;->h(IJ)V

    .line 55
    .line 56
    .line 57
    iput-wide p3, p0, LS2/e;->f:J

    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public y(LS2/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/e;->i:LS2/u;

    .line 2
    .line 3
    return-void
.end method

.method public z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/e;->a:LS2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/v;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
