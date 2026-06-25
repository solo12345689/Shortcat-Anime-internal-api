.class final Landroidx/media3/exoplayer/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA2/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/k$a;
    }
.end annotation


# instance fields
.field private final a:LA2/S;

.field private final b:Landroidx/media3/exoplayer/k$a;

.field private c:Landroidx/media3/exoplayer/N0;

.field private d:LA2/L;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/k$a;Lt2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->b:Landroidx/media3/exoplayer/k$a;

    .line 5
    .line 6
    new-instance p1, LA2/S;

    .line 7
    .line 8
    invoke-direct {p1, p2}, LA2/S;-><init>(Lt2/j;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 15
    .line 16
    return-void
.end method

.method private f(Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 23
    .line 24
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->isReady()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->i()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 44
    return p1
.end method

.method private j(Z)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/k;->f(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 9
    .line 10
    iget-boolean p1, p0, Landroidx/media3/exoplayer/k;->f:Z

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 15
    .line 16
    invoke-virtual {p1}, LA2/S;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 21
    .line 22
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LA2/L;

    .line 27
    .line 28
    invoke-interface {p1}, LA2/L;->I()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-boolean v2, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 37
    .line 38
    invoke-virtual {v2}, LA2/S;->I()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v2, v0, v2

    .line 43
    .line 44
    if-gez v2, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 47
    .line 48
    invoke-virtual {p1}, LA2/S;->d()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    const/4 v2, 0x0

    .line 53
    iput-boolean v2, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 54
    .line 55
    iget-boolean v2, p0, Landroidx/media3/exoplayer/k;->f:Z

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 60
    .line 61
    invoke-virtual {v2}, LA2/S;->b()V

    .line 62
    .line 63
    .line 64
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v1}, LA2/S;->a(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, LA2/L;->c()Lq2/O;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 74
    .line 75
    invoke-virtual {v0}, LA2/S;->c()Lq2/O;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, LA2/S;->e(Lq2/O;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->b:Landroidx/media3/exoplayer/k$a;

    .line 91
    .line 92
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/k$a;->n(Lq2/O;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void
.end method


# virtual methods
.method public I()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 6
    .line 7
    invoke-virtual {v0}, LA2/S;->I()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 13
    .line 14
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LA2/L;

    .line 19
    .line 20
    invoke-interface {v0}, LA2/L;->I()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
.end method

.method public a(Landroidx/media3/exoplayer/N0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public b(Landroidx/media3/exoplayer/N0;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->P()LA2/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->c:Landroidx/media3/exoplayer/N0;

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 18
    .line 19
    invoke-virtual {p1}, LA2/S;->c()Lq2/O;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, LA2/L;->e(Lq2/O;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Multiple renderer media clocks enabled."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x3e8

    .line 35
    .line 36
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/s;->k(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    throw p1

    .line 41
    :cond_1
    return-void
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LA2/L;->c()Lq2/O;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 11
    .line 12
    invoke-virtual {v0}, LA2/S;->c()Lq2/O;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public d(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LA2/S;->a(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Lq2/O;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, LA2/L;->e(Lq2/O;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 9
    .line 10
    invoke-interface {p1}, LA2/L;->c()Lq2/O;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LA2/S;->e(Lq2/O;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/k;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 5
    .line 6
    invoke-virtual {v0}, LA2/S;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/k;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 5
    .line 6
    invoke-virtual {v0}, LA2/S;->d()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(Z)J
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/k;->j(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/k;->I()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/k;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->a:LA2/S;

    .line 6
    .line 7
    invoke-interface {v0}, LA2/L;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d:LA2/L;

    .line 13
    .line 14
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LA2/L;

    .line 19
    .line 20
    invoke-interface {v0}, LA2/L;->u()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method
