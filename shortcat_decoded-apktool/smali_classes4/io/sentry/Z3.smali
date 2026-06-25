.class public Lio/sentry/Z3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Lio/sentry/o2;

.field private b:Lio/sentry/F1;

.field private c:Z

.field private d:Z

.field private e:Z

.field protected f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/Z3;->a:Lio/sentry/o2;

    .line 6
    .line 7
    sget-object v0, Lio/sentry/F1;->AUTO:Lio/sentry/F1;

    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/Z3;->b:Lio/sentry/F1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lio/sentry/Z3;->c:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lio/sentry/Z3;->d:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lio/sentry/Z3;->e:Z

    .line 17
    .line 18
    const-string v0, "manual"

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/Z3;->f:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/Z3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lio/sentry/F1;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/Z3;->b:Lio/sentry/F1;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lio/sentry/o2;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/Z3;->a:Lio/sentry/o2;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/Z3;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/Z3;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/Z3;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/Z3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public h(Lio/sentry/o2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/Z3;->a:Lio/sentry/o2;

    .line 2
    .line 3
    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/sentry/Z3;->d:Z

    .line 2
    .line 3
    return-void
.end method
