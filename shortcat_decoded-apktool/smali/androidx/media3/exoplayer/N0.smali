.class public interface abstract Landroidx/media3/exoplayer/N0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/L0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/N0$a;
    }
.end annotation


# virtual methods
.method public abstract A()Z
.end method

.method public abstract D(Lq2/Y;)V
.end method

.method public E(JJ)J
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x1

    .line 6
    if-ne p1, p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p0}, Landroidx/media3/exoplayer/N0;->isReady()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    :cond_0
    const-wide/32 p1, 0xf4240

    .line 21
    .line 22
    .line 23
    return-wide p1

    .line 24
    :cond_1
    const-wide/16 p1, 0x2710

    .line 25
    .line 26
    return-wide p1
.end method

.method public abstract G()Landroidx/media3/exoplayer/O0;
.end method

.method public J(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract M()LM2/c0;
.end method

.method public abstract N()J
.end method

.method public abstract O(J)V
.end method

.method public abstract P()LA2/L;
.end method

.method public abstract a()V
.end method

.method public abstract d()Z
.end method

.method public abstract disable()V
.end method

.method public abstract f()I
.end method

.method public abstract g(JJ)V
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getState()I
.end method

.method public abstract i()Z
.end method

.method public abstract isReady()Z
.end method

.method public abstract j(LA2/N;[Lq2/x;LM2/c0;JZZJJLM2/D$b;)V
.end method

.method public m()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract n()V
.end method

.method public abstract p([Lq2/x;LM2/c0;JJLM2/D$b;)V
.end method

.method public abstract reset()V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method

.method public abstract w(ILB2/K1;Lt2/j;)V
.end method

.method public abstract x()V
.end method
