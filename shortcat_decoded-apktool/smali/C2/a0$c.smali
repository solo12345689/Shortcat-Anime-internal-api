.class final LC2/a0$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LC2/z$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:LC2/a0;


# direct methods
.method private constructor <init>(LC2/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/a0$c;->a:LC2/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LC2/a0;LC2/a0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LC2/a0$c;-><init>(LC2/a0;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, LC2/y$a;->x(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, LC2/a0;->g2(LC2/a0;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c(LC2/z$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LC2/y$a;->r(LC2/z$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 8
    .line 9
    invoke-static {v0}, LC2/a0;->l2(LC2/a0;)LJ2/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 16
    .line 17
    invoke-static {v0}, LC2/a0;->l2(LC2/a0;)LJ2/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LJ2/o;->e(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 25
    .line 26
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, LC2/y$a;->o(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public e(LC2/z$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LC2/y$a;->q(LC2/z$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LC2/y$a;->y(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 9
    .line 10
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, LC2/y$a;->p(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->j2(LC2/a0;)Landroidx/media3/exoplayer/N0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0$a;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public i(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->h2(LC2/a0;)LC2/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move v2, p1

    .line 8
    move-wide v3, p2

    .line 9
    move-wide v5, p4

    .line 10
    invoke-virtual/range {v1 .. v6}, LC2/y$a;->z(IJJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->k2(LC2/a0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/a0;->u2()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0$c;->a:LC2/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC2/a0;->i2(LC2/a0;)Landroidx/media3/exoplayer/N0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0$a;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
