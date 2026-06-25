.class public final Lcom/facebook/react/runtime/j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lf7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/j0$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/facebook/react/runtime/j0$a;


# instance fields
.field private final a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

.field private b:Landroid/content/Context;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/j0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/runtime/j0;->e:Lcom/facebook/react/runtime/j0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    invoke-direct {v0, p2}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/j0;-><init>(Lcom/facebook/react/fabric/SurfaceHandlerBinding;Landroid/content/Context;)V

    if-eqz p3, :cond_0

    .line 7
    invoke-static {p3}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type com.facebook.react.bridge.NativeMap"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    :goto_0
    iget-object p3, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    invoke-virtual {p3, p2}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setProps(Lcom/facebook/react/bridge/NativeMap;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 10
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 11
    iget p3, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v1, -0x80000000

    invoke-static {p3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 12
    iget v2, p2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 13
    sget-object v1, Lcom/facebook/react/runtime/j0;->e:Lcom/facebook/react/runtime/j0$a;

    invoke-static {v1, p1}, Lcom/facebook/react/runtime/j0$a;->a(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z

    move-result v5

    .line 14
    invoke-static {v1, p1}, Lcom/facebook/react/runtime/j0$a;->c(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z

    move-result v6

    .line 15
    iget v7, p2, Landroid/util/DisplayMetrics;->density:F

    .line 16
    invoke-static {v1, p1}, Lcom/facebook/react/runtime/j0$a;->b(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)F

    move-result v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v1, p3

    .line 17
    invoke-virtual/range {v0 .. v8}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setLayoutConstraints(IIIIZZFF)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/fabric/SurfaceHandlerBinding;Landroid/content/Context;)V
    .locals 1

    const-string v0, "surfaceHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 3
    iput-object p2, p0, Lcom/facebook/react/runtime/j0;->b:Landroid/content/Context;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/facebook/react/runtime/j0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/facebook/react/runtime/j0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/runtime/j0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/runtime/j0;->f(Lcom/facebook/react/runtime/j0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(Lcom/facebook/react/runtime/j0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->m()Lcom/facebook/react/runtime/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->m()Lcom/facebook/react/runtime/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c(Lcom/facebook/react/ReactHost;)V
    .locals 2

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/runtime/ReactHostImpl;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v0, v1, p1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "This surface is already attached to a host!"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string v0, "ReactSurfaceImpl.attach can only attach to ReactHostImpl."

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public final d(Lcom/facebook/react/runtime/k0;)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1, p1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "getContext(...)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/facebook/react/runtime/j0;->b:Landroid/content/Context;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Trying to call ReactSurface.attachView(), but the view is already attached."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public e()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/i0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/i0;-><init>(Lcom/facebook/react/runtime/j0;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->b:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->j()Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->getModuleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j()Lcom/facebook/react/runtime/ReactHostImpl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Lcom/facebook/react/fabric/SurfaceHandlerBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->getSurfaceId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public m()Lcom/facebook/react/runtime/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/runtime/k0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->j()Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final declared-synchronized p(IIII)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->a:Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/runtime/j0;->e:Lcom/facebook/react/runtime/j0$a;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->g()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v1, v2}, Lcom/facebook/react/runtime/j0$a;->a(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->g()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2}, Lcom/facebook/react/runtime/j0$a;->c(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->g()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v7, v2, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->g()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v1, v2}, Lcom/facebook/react/runtime/j0$a;->b(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)F

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    move v1, p1

    .line 45
    move v2, p2

    .line 46
    move v3, p3

    .line 47
    move v4, p4

    .line 48
    invoke-virtual/range {v0 .. v8}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setLayoutConstraints(IIIIZZFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
.end method

.method public start()Le7/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/j0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v2, "Trying to call ReactSurface.start(), but view is not created."

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->j()Lcom/facebook/react/runtime/ReactHostImpl;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v2, "Trying to call ReactSurface.start(), but no ReactHost is attached."

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/ReactHostImpl;->startSurface$ReactAndroid_release(Lcom/facebook/react/runtime/j0;)Le7/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public stop()Le7/a;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/j0;->j()Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v2, "Trying to call ReactSurface.stop(), but no ReactHost is attached."

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/ReactHostImpl;->stopSurface$ReactAndroid_release(Lcom/facebook/react/runtime/j0;)Le7/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
