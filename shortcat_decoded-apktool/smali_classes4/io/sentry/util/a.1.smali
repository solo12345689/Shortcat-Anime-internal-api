.class public final Lio/sentry/util/a;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/util/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lio/sentry/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/sentry/util/a$a;-><init>(Ljava/util/concurrent/locks/ReentrantLock;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
