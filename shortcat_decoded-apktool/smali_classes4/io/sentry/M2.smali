.class public final synthetic Lio/sentry/M2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:Lio/sentry/r1;

.field public final synthetic c:Lio/sentry/X;

.field public final synthetic d:Lio/sentry/f0;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lio/sentry/r1;Lio/sentry/X;Lio/sentry/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/M2;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/M2;->b:Lio/sentry/r1;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/M2;->c:Lio/sentry/X;

    .line 9
    .line 10
    iput-object p4, p0, Lio/sentry/M2;->d:Lio/sentry/f0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/M2;->a:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/M2;->b:Lio/sentry/r1;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/M2;->c:Lio/sentry/X;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/M2;->d:Lio/sentry/f0;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lio/sentry/T2;->x(Ljava/io/File;Lio/sentry/r1;Lio/sentry/X;Lio/sentry/f0;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
