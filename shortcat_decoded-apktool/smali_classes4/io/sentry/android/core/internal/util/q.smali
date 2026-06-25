.class public abstract Lio/sentry/android/core/internal/util/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(I)Lio/sentry/protocol/e$b;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p0, Lio/sentry/protocol/e$b;->LANDSCAPE:Lio/sentry/protocol/e$b;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    sget-object p0, Lio/sentry/protocol/e$b;->PORTRAIT:Lio/sentry/protocol/e$b;

    .line 13
    .line 14
    return-object p0
.end method
