.class public final Landroidx/media3/exoplayer/dash/f$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:LM2/b0;

.field private final b:LA2/J;

.field private final c:Ld3/b;

.field private d:J

.field final synthetic e:Landroidx/media3/exoplayer/dash/f;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/dash/f;LQ2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LM2/b0;->m(LQ2/b;)LM2/b0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 11
    .line 12
    new-instance p1, LA2/J;

    .line 13
    .line 14
    invoke-direct {p1}, LA2/J;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/f$c;->b:LA2/J;

    .line 18
    .line 19
    new-instance p1, Ld3/b;

    .line 20
    .line 21
    invoke-direct {p1}, Ld3/b;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/f$c;->c:Ld3/b;

    .line 25
    .line 26
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/f$c;->d:J

    .line 32
    .line 33
    return-void
.end method

.method private h()Ld3/b;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->c:Ld3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz2/f;->m()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/f$c;->b:LA2/J;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/f$c;->c:Ld3/b;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3, v3}, LM2/b0;->U(LA2/J;Lz2/f;IZ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, -0x4

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->c:Ld3/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Lz2/f;->y()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->c:Ld3/b;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method private l(JJ)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/dash/f$a;-><init>(JJ)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/f;->d(Landroidx/media3/exoplayer/dash/f;)Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 13
    .line 14
    invoke-static {p2}, Landroidx/media3/exoplayer/dash/f;->d(Landroidx/media3/exoplayer/dash/f;)Landroid/os/Handler;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 p3, 0x1

    .line 19
    invoke-virtual {p2, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private m()V
    .locals 5

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LM2/b0;->N(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/f$c;->h()Ld3/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-wide v2, v0, Lz2/f;->f:J

    .line 18
    .line 19
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 20
    .line 21
    invoke-static {v4}, Landroidx/media3/exoplayer/dash/f;->a(Landroidx/media3/exoplayer/dash/f;)Lf3/b;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4, v0}, Ld3/c;->a(Ld3/b;)Lq2/J;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v0, v1}, Lq2/J;->d(I)Lq2/J$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lf3/a;

    .line 37
    .line 38
    iget-object v1, v0, Lf3/a;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, v0, Lf3/a;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-direct {p0, v2, v3, v0}, Landroidx/media3/exoplayer/dash/f$c;->n(JLf3/a;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 53
    .line 54
    invoke-virtual {v0}, LM2/b0;->t()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private n(JLf3/a;)V
    .locals 4

    .line 1
    invoke-static {p3}, Landroidx/media3/exoplayer/dash/f;->c(Lf3/a;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p3, v0, v2

    .line 11
    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/dash/f$c;->l(JJ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(JIIILU2/O$a;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move v4, p4

    .line 6
    move v5, p5

    .line 7
    move-object v6, p6

    .line 8
    invoke-virtual/range {v0 .. v6}, LM2/b0;->a(JIIILU2/O$a;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/f$c;->m()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(Lq2/m;IZI)I
    .locals 0

    .line 1
    iget-object p4, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    invoke-interface {p4, p1, p2, p3}, LU2/O;->e(Lq2/m;IZ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Lq2/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM2/b0;->c(Lq2/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(Lt2/I;II)V
    .locals 0

    .line 1
    iget-object p3, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    invoke-interface {p3, p1, p2}, LU2/O;->f(Lt2/I;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/dash/f;->j(J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public j(LN2/e;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/f$c;->d:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-wide v2, p1, LN2/e;->h:J

    .line 13
    .line 14
    cmp-long v0, v2, v0

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-wide v0, p1, LN2/e;->h:J

    .line 19
    .line 20
    iput-wide v0, p0, Landroidx/media3/exoplayer/dash/f$c;->d:J

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/dash/f;->m(LN2/e;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public k(LN2/e;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/f$c;->d:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-wide v2, p1, LN2/e;->g:J

    .line 13
    .line 14
    cmp-long p1, v0, v2

    .line 15
    .line 16
    if-gez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->e:Landroidx/media3/exoplayer/dash/f;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/dash/f;->n(Z)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/f$c;->a:LM2/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, LM2/b0;->V()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
