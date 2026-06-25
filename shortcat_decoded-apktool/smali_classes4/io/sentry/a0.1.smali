.class public interface abstract Lio/sentry/a0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public abstract A()Ljava/lang/Boolean;
.end method

.method public abstract B(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;
.end method

.method public abstract C(Ljava/lang/String;)Lio/sentry/a0;
.end method

.method public abstract a(Lio/sentry/e;)V
.end method

.method public abstract c(Z)V
.end method

.method public abstract clone()Lio/sentry/S;
.end method

.method public abstract d(J)V
.end method

.method public abstract e(Lio/sentry/e;Lio/sentry/H;)V
.end method

.method public abstract f()Z
.end method

.method public abstract g(Ljava/lang/Throwable;Lio/sentry/h0;Ljava/lang/String;)V
.end method

.method public abstract h()Lio/sentry/z3;
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract j()Lio/sentry/j0;
.end method

.method public abstract l()V
.end method

.method public abstract n()Lio/sentry/transport/z;
.end method

.method public abstract o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
.end method

.method public abstract p()V
.end method

.method public q(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, p3, v0}, Lio/sentry/a0;->B(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public r(Lio/sentry/G1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lio/sentry/a0;->t(Lio/sentry/I1;Lio/sentry/G1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract t(Lio/sentry/I1;Lio/sentry/G1;)V
.end method

.method public abstract u(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/protocol/x;
.end method

.method public abstract v()Lio/sentry/Y;
.end method

.method public abstract w(Lio/sentry/r1;)Lio/sentry/protocol/x;
.end method

.method public x(Lio/sentry/q2;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/H;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1, v0}, Lio/sentry/a0;->o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public abstract y(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;
.end method

.method public abstract z(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;
.end method
