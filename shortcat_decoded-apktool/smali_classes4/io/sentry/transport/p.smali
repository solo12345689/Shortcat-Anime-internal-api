.class public interface abstract Lio/sentry/transport/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public K1(Lio/sentry/q2;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/H;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1, v0}, Lio/sentry/transport/p;->e0(Lio/sentry/q2;Lio/sentry/H;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public abstract c(Z)V
.end method

.method public abstract d(J)V
.end method

.method public abstract e0(Lio/sentry/q2;Lio/sentry/H;)V
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public abstract n()Lio/sentry/transport/z;
.end method
