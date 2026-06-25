.class public abstract Lio/sentry/android/core/x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lio/sentry/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/Z0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/Z0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/core/x;->a:Lio/sentry/p2;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Lio/sentry/o2;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/core/x;->a:Lio/sentry/p2;

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
