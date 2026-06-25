.class public final Lio/sentry/Q1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/a0;


# static fields
.field private static final a:Lio/sentry/Q1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/Q1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/Q1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/Q1;->a:Lio/sentry/Q1;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()Lio/sentry/Q1;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/Q1;->a:Lio/sentry/Q1;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->E()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public B(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3, p4}, Lio/sentry/a0;->B(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public C(Ljava/lang/String;)Lio/sentry/a0;
    .locals 0

    .line 1
    invoke-static {p1}, Lio/sentry/g2;->q(Ljava/lang/String;)Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public a(Lio/sentry/e;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/H;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lio/sentry/Q1;->e(Lio/sentry/e;Lio/sentry/H;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/g2;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public clone()Lio/sentry/S;
    .locals 1

    .line 2
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/a0;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/Q1;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public d(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lio/sentry/g2;->p(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e(Lio/sentry/e;Lio/sentry/H;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lio/sentry/g2;->h(Lio/sentry/e;Lio/sentry/H;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public g(Ljava/lang/Throwable;Lio/sentry/h0;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lio/sentry/a0;->g(Ljava/lang/Throwable;Lio/sentry/h0;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()Lio/sentry/z3;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->F()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public j()Lio/sentry/j0;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->j()Lio/sentry/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public l()V
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/g2;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public n()Lio/sentry/transport/z;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/a0;->n()Lio/sentry/transport/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lio/sentry/a0;->o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public p()V
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/g2;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public t(Lio/sentry/I1;Lio/sentry/G1;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lio/sentry/g2;->m(Lio/sentry/I1;Lio/sentry/G1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public u(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lio/sentry/a0;->u(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public v()Lio/sentry/Y;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->t()Lio/sentry/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public w(Lio/sentry/r1;)Lio/sentry/protocol/x;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lio/sentry/a0;->w(Lio/sentry/r1;)Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public y(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lio/sentry/g2;->j(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public z(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lio/sentry/g2;->M(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
