.class public final Lcom/th3rdwave/safeareacontext/k;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private a:Lcom/th3rdwave/safeareacontext/o;

.field private b:Lcom/th3rdwave/safeareacontext/a;

.field private c:Lcom/th3rdwave/safeareacontext/m;

.field private d:Landroid/view/View;

.field private e:Lcom/facebook/react/uimanager/a0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/th3rdwave/safeareacontext/o;->a:Lcom/th3rdwave/safeareacontext/o;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/k;->a:Lcom/th3rdwave/safeareacontext/o;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic B(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/k;->I(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(Lcom/facebook/react/uimanager/UIManagerModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/k;->G(Lcom/facebook/react/uimanager/UIManagerModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final D()Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v1, v0, Lcom/th3rdwave/safeareacontext/f;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-object p0
.end method

.method private final E()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->d:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/h;->e(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/k;->b:Lcom/th3rdwave/safeareacontext/a;

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->b:Lcom/th3rdwave/safeareacontext/a;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->F()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_2
    return v1
.end method

.method private final F()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->b:Lcom/th3rdwave/safeareacontext/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/k;->c:Lcom/th3rdwave/safeareacontext/m;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/th3rdwave/safeareacontext/m;

    .line 10
    .line 11
    sget-object v2, Lcom/th3rdwave/safeareacontext/l;->b:Lcom/th3rdwave/safeareacontext/l;

    .line 12
    .line 13
    invoke-direct {v1, v2, v2, v2, v2}, Lcom/th3rdwave/safeareacontext/m;-><init>(Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/k;->getStateWrapper()Lcom/facebook/react/uimanager/a0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v3, "insets"

    .line 27
    .line 28
    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/q;->b(Lcom/th3rdwave/safeareacontext/a;)Lcom/facebook/react/bridge/WritableMap;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v1}, Lcom/facebook/react/uimanager/a0;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance v2, Lcom/th3rdwave/safeareacontext/n;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/th3rdwave/safeareacontext/k;->a:Lcom/th3rdwave/safeareacontext/o;

    .line 42
    .line 43
    invoke-direct {v2, v0, v3, v1}, Lcom/th3rdwave/safeareacontext/n;-><init>(Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/o;Lcom/th3rdwave/safeareacontext/m;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/r;->a(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v1, v3, v2}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewLocalData(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lcom/th3rdwave/safeareacontext/i;

    .line 68
    .line 69
    invoke-direct {v2, v1}, Lcom/th3rdwave/safeareacontext/i;-><init>(Lcom/facebook/react/uimanager/UIManagerModule;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->H()V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
.end method

.method private static final G(Lcom/facebook/react/uimanager/UIManagerModule;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/UIManagerModule;->getUIImplementation()Lcom/facebook/react/uimanager/e0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/e0;->m(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final H()V
    .locals 10

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/r;->a(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    new-instance v6, Lcom/th3rdwave/safeareacontext/j;

    .line 24
    .line 25
    invoke-direct {v6, v1, v0, v2}, Lcom/th3rdwave/safeareacontext/j;-><init>(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v6}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 32
    .line 33
    .line 34
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    :goto_0
    :try_start_0
    iget-boolean v7, v0, Lkotlin/jvm/internal/J;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    const-wide/32 v8, 0x1dcd6500

    .line 39
    .line 40
    .line 41
    if-nez v7, :cond_0

    .line 42
    .line 43
    cmp-long v7, v5, v8

    .line 44
    .line 45
    if-gez v7, :cond_0

    .line 46
    .line 47
    :try_start_1
    invoke-interface {v2, v8, v9}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :catch_0
    const/4 v7, 0x1

    .line 54
    :try_start_2
    iput-boolean v7, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 55
    .line 56
    :goto_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    sub-long/2addr v7, v3

    .line 61
    add-long/2addr v5, v7

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 66
    .line 67
    .line 68
    cmp-long v0, v5, v8

    .line 69
    .line 70
    if-ltz v0, :cond_1

    .line 71
    .line 72
    const-string v0, "SafeAreaView"

    .line 73
    .line 74
    const-string v1, "Timed out waiting for layout."

    .line 75
    .line 76
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :goto_2
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method private static final I(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :goto_1
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method


# virtual methods
.method public final getStateWrapper()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->e:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->D()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->d:Landroid/view/View;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->E()Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->d:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/k;->d:Landroid/view/View;

    .line 19
    .line 20
    return-void
.end method

.method public onPreDraw()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    return v0
.end method

.method public final setEdges(Lcom/th3rdwave/safeareacontext/m;)V
    .locals 1

    .line 1
    const-string v0, "edges"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/k;->c:Lcom/th3rdwave/safeareacontext/m;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->F()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setMode(Lcom/th3rdwave/safeareacontext/o;)V
    .locals 1

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/k;->a:Lcom/th3rdwave/safeareacontext/o;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/k;->F()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/k;->e:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-void
.end method
