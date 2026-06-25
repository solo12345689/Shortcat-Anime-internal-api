.class public final Lio/sentry/M0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/S;


# static fields
.field private static final b:Lio/sentry/M0;


# instance fields
.field private final a:Lio/sentry/z3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/M0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/M0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/sentry/z3;->empty()Lio/sentry/z3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lio/sentry/M0;->a:Lio/sentry/z3;

    .line 9
    .line 10
    return-void
.end method

.method public static b()Lio/sentry/M0;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Boolean;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public B(Lio/sentry/protocol/E;Lio/sentry/f4;Lio/sentry/H;Lio/sentry/v1;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object p1
.end method

.method public C(Ljava/lang/String;)Lio/sentry/a0;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public a(Lio/sentry/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public clone()Lio/sentry/S;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/M0;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public d(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lio/sentry/e;Lio/sentry/H;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public g(Ljava/lang/Throwable;Lio/sentry/h0;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()Lio/sentry/z3;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/M0;->a:Lio/sentry/z3;

    .line 2
    .line 3
    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public j()Lio/sentry/j0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public n()Lio/sentry/transport/z;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object p1
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public t(Lio/sentry/I1;Lio/sentry/G1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(Lio/sentry/A3;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object p1
.end method

.method public v()Lio/sentry/Y;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/S0;->T()Lio/sentry/S0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public w(Lio/sentry/r1;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object p1
.end method

.method public y(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/protocol/x;
    .locals 0

    .line 1
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object p1
.end method

.method public z(Lio/sentry/i4;Lio/sentry/k4;)Lio/sentry/j0;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/f1;->u()Lio/sentry/f1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
