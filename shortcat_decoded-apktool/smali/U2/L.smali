.class public final LU2/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:LU2/r;

.field private g:LU2/O;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LU2/L;->a:I

    .line 5
    .line 6
    iput p2, p0, LU2/L;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LU2/L;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LU2/L;->f:LU2/r;

    .line 2
    .line 3
    const/16 v1, 0x400

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-interface {v0, v1, v2}, LU2/r;->e(II)LU2/O;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, LU2/L;->g:LU2/O;

    .line 11
    .line 12
    new-instance v1, Lq2/x$b;

    .line 13
    .line 14
    invoke-direct {v1}, Lq2/x$b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, LU2/O;->c(Lq2/x;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LU2/L;->f:LU2/r;

    .line 33
    .line 34
    invoke-interface {p1}, LU2/r;->p()V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, LU2/L;->f:LU2/r;

    .line 38
    .line 39
    new-instance v0, LU2/M;

    .line 40
    .line 41
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, LU2/M;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0}, LU2/r;->t(LU2/J;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput p1, p0, LU2/L;->e:I

    .line 54
    .line 55
    return-void
.end method

.method private e(LU2/q;)V
    .locals 7

    .line 1
    iget-object v0, p0, LU2/L;->g:LU2/O;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU2/O;

    .line 8
    .line 9
    const/16 v1, 0x400

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-interface {v0, p1, v1, v2}, LU2/O;->e(Lq2/m;IZ)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    iput p1, p0, LU2/L;->e:I

    .line 21
    .line 22
    iget-object v0, p0, LU2/L;->g:LU2/O;

    .line 23
    .line 24
    iget v4, p0, LU2/L;->d:I

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const-wide/16 v1, 0x0

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-interface/range {v0 .. v6}, LU2/O;->a(JIIILU2/O$a;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput p1, p0, LU2/L;->d:I

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget v0, p0, LU2/L;->d:I

    .line 39
    .line 40
    add-int/2addr v0, p1

    .line 41
    iput v0, p0, LU2/L;->d:I

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget p1, p0, LU2/L;->e:I

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    :goto_0
    iput p2, p0, LU2/L;->e:I

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, LU2/L;->d:I

    .line 18
    .line 19
    return-void
.end method

.method public c(LU2/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU2/L;->f:LU2/r;

    .line 2
    .line 3
    iget-object p1, p0, LU2/L;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LU2/L;->d(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 5

    .line 1
    iget v0, p0, LU2/L;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    iget v0, p0, LU2/L;->b:I

    .line 9
    .line 10
    if-eq v0, v3, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lt2/I;

    .line 19
    .line 20
    iget v3, p0, LU2/L;->b:I

    .line 21
    .line 22
    invoke-direct {v0, v3}, Lt2/I;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v4, p0, LU2/L;->b:I

    .line 30
    .line 31
    invoke-interface {p1, v3, v2, v4}, LU2/q;->o([BII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget v0, p0, LU2/L;->a:I

    .line 39
    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    return v2
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 1

    .line 1
    iget p2, p0, LU2/L;->e:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_1

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    if-ne p2, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    invoke-direct {p0, p1}, LU2/L;->e(LU2/q;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return p1
.end method
