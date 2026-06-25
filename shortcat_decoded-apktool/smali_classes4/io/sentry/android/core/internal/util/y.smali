.class public final synthetic Lio/sentry/android/core/internal/util/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/graphics/Canvas;

.field public final synthetic c:Lio/sentry/ILogger;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/graphics/Canvas;Lio/sentry/ILogger;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/internal/util/y;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/internal/util/y;->b:Landroid/graphics/Canvas;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/internal/util/y;->c:Lio/sentry/ILogger;

    .line 9
    .line 10
    iput-object p4, p0, Lio/sentry/android/core/internal/util/y;->d:Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/util/y;->a:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/internal/util/y;->b:Landroid/graphics/Canvas;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/core/internal/util/y;->c:Lio/sentry/ILogger;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/android/core/internal/util/y;->d:Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lio/sentry/android/core/internal/util/z;->a(Landroid/view/View;Landroid/graphics/Canvas;Lio/sentry/ILogger;Ljava/util/concurrent/CountDownLatch;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
