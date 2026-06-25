.class public final Lio/sentry/f1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/j0;


# static fields
.field private static final a:Lio/sentry/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/f1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/f1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/f1;->a:Lio/sentry/f1;

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

.method public static u()Lio/sentry/f1;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/f1;->a:Lio/sentry/f1;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lio/sentry/a4;ZLio/sentry/H;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b()Lio/sentry/a4;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f()Lio/sentry/protocol/x;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lio/sentry/f4;
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/f4;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lio/sentry/f4;-><init>(Lio/sentry/protocol/x;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public isFinished()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public j(Lio/sentry/a4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;Lio/sentry/o2;Lio/sentry/o0;)Lio/sentry/h0;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/d1;->u()Lio/sentry/d1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public l(Ljava/lang/String;Ljava/lang/Number;Lio/sentry/F0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m()Lio/sentry/e0;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/V0;->a()Lio/sentry/V0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n()Lio/sentry/h0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Lio/sentry/o2;Lio/sentry/o0;Lio/sentry/Z3;)Lio/sentry/h0;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/d1;->u()Lio/sentry/d1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()Lio/sentry/T3;
    .locals 6

    .line 1
    new-instance v0, Lio/sentry/T3;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 4
    .line 5
    sget-object v2, Lio/sentry/Y3;->b:Lio/sentry/Y3;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const-string v3, "op"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lio/sentry/T3;-><init>(Lio/sentry/protocol/x;Lio/sentry/Y3;Ljava/lang/String;Lio/sentry/Y3;Lio/sentry/h4;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public r()Lio/sentry/o2;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/r3;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/r3;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public s(Lio/sentry/a4;Lio/sentry/o2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t()Lio/sentry/o2;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/r3;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/r3;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
