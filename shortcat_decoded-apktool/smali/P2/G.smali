.class public abstract LP2/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP2/G$a;
    }
.end annotation


# instance fields
.field private a:LP2/G$a;

.field private b:LQ2/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected final b()LQ2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LP2/G;->b:LQ2/d;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LQ2/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public abstract c()Lq2/d0;
.end method

.method public abstract d()Landroidx/media3/exoplayer/O0$a;
.end method

.method public e(LP2/G$a;LQ2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/G;->a:LP2/G$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LP2/G;->a:LP2/G$a;

    .line 12
    .line 13
    iput-object p2, p0, LP2/G;->b:LQ2/d;

    .line 14
    .line 15
    return-void
.end method

.method protected final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/G;->a:LP2/G$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LP2/G$a;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method protected final g(Landroidx/media3/exoplayer/N0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/G;->a:LP2/G$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, LP2/G$a;->a(Landroidx/media3/exoplayer/N0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public abstract h()Z
.end method

.method public abstract i(Ljava/lang/Object;)V
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LP2/G;->a:LP2/G$a;

    .line 3
    .line 4
    iput-object v0, p0, LP2/G;->b:LQ2/d;

    .line 5
    .line 6
    return-void
.end method

.method public abstract k([Landroidx/media3/exoplayer/O0;LM2/n0;LM2/D$b;Lq2/Y;)LP2/H;
.end method

.method public abstract l(Lq2/c;)V
.end method

.method public abstract m(Lq2/d0;)V
.end method
