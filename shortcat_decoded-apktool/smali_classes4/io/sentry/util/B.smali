.class public abstract Lio/sentry/util/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/util/B$b;
    }
.end annotation


# static fields
.field private static final a:Lio/sentry/util/B$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/util/B$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/util/B$b;-><init>(Lio/sentry/util/B$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/util/B;->a:Lio/sentry/util/B$b;

    .line 8
    .line 9
    return-void
.end method

.method public static a()Lio/sentry/util/z;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/util/B;->a:Lio/sentry/util/B$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/sentry/util/z;

    .line 8
    .line 9
    return-object v0
.end method
