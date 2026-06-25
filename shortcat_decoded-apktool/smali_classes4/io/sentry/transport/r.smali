.class public final Lio/sentry/transport/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/cache/g;


# static fields
.field private static final a:Lio/sentry/transport/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/transport/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/transport/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/transport/r;->a:Lio/sentry/transport/r;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()Lio/sentry/transport/r;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/transport/r;->a:Lio/sentry/transport/r;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public O(Lio/sentry/q2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q1(Lio/sentry/q2;Lio/sentry/H;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
