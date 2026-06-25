.class public final Lcom/facebook/react/views/modal/d$b;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/W;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/modal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/facebook/react/uimanager/a0;

.field private b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private c:I

.field private d:I

.field private final e:Lcom/facebook/react/uimanager/q;

.field private f:Lcom/facebook/react/uimanager/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/facebook/react/uimanager/q;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/q;-><init>(Landroid/view/ViewGroup;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/views/modal/d$b;->e:Lcom/facebook/react/uimanager/q;

    .line 15
    .line 16
    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lcom/facebook/react/uimanager/p;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/p;-><init>(Landroid/view/ViewGroup;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static final synthetic B(Lcom/facebook/react/views/modal/d$b;)Lcom/facebook/react/uimanager/b0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic C(Lcom/facebook/react/views/modal/d$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/views/modal/d$b;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic D(Lcom/facebook/react/views/modal/d$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/views/modal/d$b;->c:I

    .line 2
    .line 3
    return p0
.end method

.method private final getReactContext()Lcom/facebook/react/uimanager/b0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/uimanager/b0;

    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public final E(II)V
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->a:Lcom/facebook/react/uimanager/a0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 18
    .line 19
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "screenWidth"

    .line 23
    .line 24
    float-to-double v3, p1

    .line 25
    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 26
    .line 27
    .line 28
    const-string p1, "screenHeight"

    .line 29
    .line 30
    float-to-double v2, p2

    .line 31
    invoke-interface {v1, p1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/a0;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-boolean p1, LY6/a;->f:Z

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v0, Lcom/facebook/react/views/modal/d$b$a;

    .line 51
    .line 52
    invoke-direct {v0, p0, p2}, Lcom/facebook/react/views/modal/d$b$a;-><init>(Lcom/facebook/react/views/modal/d$b;Lcom/facebook/react/uimanager/b0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->e:Lcom/facebook/react/uimanager/q;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, p2, v0, v2}, Lcom/facebook/react/uimanager/q;->h(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, v0}, Lcom/facebook/react/uimanager/p;->p(Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStateWrapper$ReactAndroid_release()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->a:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "childView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "ev"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->e:Lcom/facebook/react/uimanager/q;

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, Lcom/facebook/react/uimanager/q;->f(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/p;->o()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/p;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 7
    .line 8
    .line 9
    sget v0, Lcom/facebook/react/l;->v:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public onInterceptHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/p;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->e:Lcom/facebook/react/uimanager/q;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/q;->d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/p;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Z)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/g;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/views/modal/d$b;->c:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/views/modal/d$b;->d:I

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/d$b;->E(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->e:Lcom/facebook/react/uimanager/q;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d$b;->getReactContext()Lcom/facebook/react/uimanager/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/q;->d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/views/modal/d$b;->f:Lcom/facebook/react/uimanager/p;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/p;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Z)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setEventDispatcher$ReactAndroid_release(Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d$b;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    return-void
.end method

.method public final setStateWrapper$ReactAndroid_release(Lcom/facebook/react/uimanager/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d$b;->a:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-void
.end method
