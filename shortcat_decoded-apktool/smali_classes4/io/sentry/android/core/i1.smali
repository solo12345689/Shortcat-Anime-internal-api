.class public final synthetic Lio/sentry/android/core/i1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic e:Lio/sentry/ILogger;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/ILogger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/i1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/i1;->b:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/i1;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lio/sentry/android/core/i1;->d:Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    iput-object p5, p0, Lio/sentry/android/core/i1;->e:Lio/sentry/ILogger;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/i1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/i1;->b:Landroid/view/View;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/core/i1;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/android/core/i1;->d:Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    iget-object v4, p0, Lio/sentry/android/core/i1;->e:Lio/sentry/ILogger;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->c(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/ILogger;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
