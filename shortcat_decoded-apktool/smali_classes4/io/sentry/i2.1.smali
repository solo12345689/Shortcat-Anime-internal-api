.class public final Lio/sentry/i2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/p2;


# instance fields
.field private final a:Lio/sentry/p2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/sentry/i2;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lio/sentry/f3;

    .line 11
    .line 12
    invoke-direct {v0}, Lio/sentry/f3;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/i2;->a:Lio/sentry/p2;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lio/sentry/s3;

    .line 19
    .line 20
    invoke-direct {v0}, Lio/sentry/s3;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/sentry/i2;->a:Lio/sentry/p2;

    .line 24
    .line 25
    return-void
.end method

.method private static a()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/util/y;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lio/sentry/util/y;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method


# virtual methods
.method public now()Lio/sentry/o2;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/i2;->a:Lio/sentry/p2;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
