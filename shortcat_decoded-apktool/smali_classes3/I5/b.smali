.class public abstract LI5/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI5/e;


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
.method public a(LI5/c;)V
    .locals 2

    .line 1
    invoke-interface {p1}, LI5/c;->isFinished()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, LI5/b;->f(LI5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, LI5/c;->close()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, LI5/c;->close()Z

    .line 18
    .line 19
    .line 20
    :cond_1
    throw v1
.end method

.method public b(LI5/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(LI5/c;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LI5/b;->e(LI5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LI5/c;->close()Z

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    invoke-interface {p1}, LI5/c;->close()Z

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public d(LI5/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected abstract e(LI5/c;)V
.end method

.method protected abstract f(LI5/c;)V
.end method
