.class public final synthetic Lio/sentry/I2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/f0;

.field public final synthetic b:Lio/sentry/A3;

.field public final synthetic c:Lio/sentry/A1;

.field public final synthetic d:Ljava/io/File;

.field public final synthetic e:Lio/sentry/ILogger;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lio/sentry/f0;Lio/sentry/A3;Lio/sentry/A1;Ljava/io/File;Lio/sentry/ILogger;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/I2;->a:Lio/sentry/f0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/I2;->b:Lio/sentry/A3;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/I2;->c:Lio/sentry/A1;

    .line 9
    .line 10
    iput-object p4, p0, Lio/sentry/I2;->d:Ljava/io/File;

    .line 11
    .line 12
    iput-object p5, p0, Lio/sentry/I2;->e:Lio/sentry/ILogger;

    .line 13
    .line 14
    iput-boolean p6, p0, Lio/sentry/I2;->f:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/I2;->a:Lio/sentry/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/I2;->b:Lio/sentry/A3;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/I2;->c:Lio/sentry/A1;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/I2;->d:Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, p0, Lio/sentry/I2;->e:Lio/sentry/ILogger;

    .line 10
    .line 11
    iget-boolean v5, p0, Lio/sentry/I2;->f:Z

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lio/sentry/T2;->c(Lio/sentry/f0;Lio/sentry/A3;Lio/sentry/A1;Ljava/io/File;Lio/sentry/ILogger;Z)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
