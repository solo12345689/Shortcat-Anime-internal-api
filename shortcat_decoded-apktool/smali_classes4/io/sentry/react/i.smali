.class public final synthetic Lio/sentry/react/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:[[B

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>([[BLandroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/react/i;->a:[[B

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/react/i;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/react/i;->c:Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/react/i;->a:[[B

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/react/i;->b:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/react/i;->c:Ljava/util/concurrent/CountDownLatch;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/sentry/react/n;->h([[BLandroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
