.class public final Lio/sentry/android/core/Z0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/p2;


# instance fields
.field private a:Lio/sentry/p2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/s3;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/s3;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/Z0;->a:Lio/sentry/p2;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public now()Lio/sentry/o2;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/Z0;->a:Lio/sentry/p2;

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
