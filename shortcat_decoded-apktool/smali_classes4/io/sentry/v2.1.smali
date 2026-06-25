.class public final synthetic Lio/sentry/v2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:J

.field public final synthetic c:Lio/sentry/v1;

.field public final synthetic d:Lio/sentry/f0;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;JLio/sentry/v1;Lio/sentry/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/v2;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/v2;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lio/sentry/v2;->c:Lio/sentry/v1;

    .line 9
    .line 10
    iput-object p5, p0, Lio/sentry/v2;->d:Lio/sentry/f0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/v2;->a:Ljava/io/File;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/sentry/v2;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lio/sentry/v2;->c:Lio/sentry/v1;

    .line 6
    .line 7
    iget-object v4, p0, Lio/sentry/v2;->d:Lio/sentry/f0;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lio/sentry/T2;->p(Ljava/io/File;JLio/sentry/v1;Lio/sentry/f0;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
