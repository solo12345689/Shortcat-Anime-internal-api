.class public Lio/sentry/react/replay/a;
.super Landroidx/fragment/app/K$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/ILogger;

.field private b:Lio/sentry/android/replay/ReplayIntegration;

.field private c:I

.field private d:I

.field private e:Ljava/lang/ref/WeakReference;

.field private f:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public constructor <init>(Lio/sentry/ILogger;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/K$l;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lio/sentry/react/replay/a;->c:I

    .line 6
    .line 7
    iput v0, p0, Lio/sentry/react/replay/a;->d:I

    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 10
    .line 11
    return-void
.end method

.method static bridge synthetic o(Lio/sentry/react/replay/a;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/react/replay/a;->q(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private p(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lio/sentry/react/replay/a$a;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lio/sentry/react/replay/a$a;-><init>(Lio/sentry/react/replay/a;Ljava/lang/ref/WeakReference;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/react/replay/a;->e:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    iput-object v1, p0, Lio/sentry/react/replay/a;->f:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private q(Landroid/view/View;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 14
    .line 15
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 16
    .line 17
    iget v1, p0, Lio/sentry/react/replay/a;->c:I

    .line 18
    .line 19
    if-ne v1, v0, :cond_0

    .line 20
    .line 21
    iget v1, p0, Lio/sentry/react/replay/a;->d:I

    .line 22
    .line 23
    if-ne v1, p1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput v0, p0, Lio/sentry/react/replay/a;->c:I

    .line 29
    .line 30
    iput p1, p0, Lio/sentry/react/replay/a;->d:I

    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lio/sentry/react/replay/a;->t(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :goto_0
    iget-object v0, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 37
    .line 38
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 39
    .line 40
    const-string v2, "Failed to check window size"

    .line 41
    .line 42
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private r()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/react/replay/a;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lio/sentry/react/replay/a;->f:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/react/replay/a;->f:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    iget-object v2, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 34
    .line 35
    sget-object v3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 36
    .line 37
    const-string v4, "Failed to remove layout change listener"

    .line 38
    .line 39
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    iput-object v1, p0, Lio/sentry/react/replay/a;->e:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    iput-object v1, p0, Lio/sentry/react/replay/a;->f:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 45
    .line 46
    return-void
.end method

.method private s()Lio/sentry/android/replay/ReplayIntegration;
    .locals 4

    .line 1
    const-string v0, "Error getting replay integration"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lio/sentry/Q1;->b()Lio/sentry/Q1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lio/sentry/Q1;->h()Lio/sentry/z3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v2, v1, Lio/sentry/android/replay/ReplayIntegration;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Lio/sentry/android/replay/ReplayIntegration;

    .line 20
    .line 21
    return-object v1

    .line 22
    :catch_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 25
    .line 26
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    new-array v3, v3, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :goto_0
    iget-object v2, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 36
    .line 37
    sget-object v3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 38
    .line 39
    invoke-interface {v2, v3, v0, v1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    const/4 v0, 0x0

    .line 43
    return-object v0
.end method

.method private t(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/react/replay/a;->b:Lio/sentry/android/replay/ReplayIntegration;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lio/sentry/react/replay/a;->s()Lio/sentry/android/replay/ReplayIntegration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lio/sentry/react/replay/a;->b:Lio/sentry/android/replay/ReplayIntegration;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lio/sentry/react/replay/a;->b:Lio/sentry/android/replay/ReplayIntegration;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lio/sentry/android/replay/ReplayIntegration;->h(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p1

    .line 21
    iget-object p2, p0, Lio/sentry/react/replay/a;->a:Lio/sentry/ILogger;

    .line 22
    .line 23
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 24
    .line 25
    const-string v1, "Failed to notify replay integration of size change"

    .line 26
    .line 27
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public m(Landroidx/fragment/app/K;Landroidx/fragment/app/q;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/react/replay/a;->r()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lio/sentry/react/replay/a;->p(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public n(Landroidx/fragment/app/K;Landroidx/fragment/app/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/react/replay/a;->r()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
