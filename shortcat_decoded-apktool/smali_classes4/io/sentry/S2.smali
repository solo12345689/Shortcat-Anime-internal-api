.class public final synthetic Lio/sentry/S2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/b;

.field public final synthetic b:J

.field public final synthetic c:Lio/sentry/f0;

.field public final synthetic d:Lio/sentry/ILogger;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/b;JLio/sentry/f0;Lio/sentry/ILogger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/S2;->a:Lio/sentry/b;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/S2;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lio/sentry/S2;->c:Lio/sentry/f0;

    .line 9
    .line 10
    iput-object p5, p0, Lio/sentry/S2;->d:Lio/sentry/ILogger;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/S2;->a:Lio/sentry/b;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/sentry/S2;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lio/sentry/S2;->c:Lio/sentry/f0;

    .line 6
    .line 7
    iget-object v4, p0, Lio/sentry/S2;->d:Lio/sentry/ILogger;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lio/sentry/T2;->A(Lio/sentry/b;JLio/sentry/f0;Lio/sentry/ILogger;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
