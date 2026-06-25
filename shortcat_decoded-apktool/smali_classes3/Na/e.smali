.class public final LNa/e;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/facebook/react/uimanager/b0;

.field private final b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private c:Landroid/view/WindowManager;

.field private d:LNa/f;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/b0;)V
    .locals 3

    .line 1
    const-string v0, "reactContext"

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
    iput-object p1, p0, LNa/e;->a:Lcom/facebook/react/uimanager/b0;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LNa/e;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 20
    .line 21
    const-string v1, "window"

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "null cannot be cast to non-null type android.view.WindowManager"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Landroid/view/WindowManager;

    .line 33
    .line 34
    iput-object v1, p0, LNa/e;->c:Landroid/view/WindowManager;

    .line 35
    .line 36
    new-instance v1, LNa/f;

    .line 37
    .line 38
    invoke-direct {v1, p1}, LNa/f;-><init>(Lcom/facebook/react/uimanager/b0;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, LNa/e;->d:LNa/f;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, LNa/f;->setEventDispatcher$react_native_keyboard_controller_release(Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LNa/f;->B()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LNa/e;->c:Landroid/view/WindowManager;

    .line 10
    .line 11
    iget-object v1, p0, LNa/e;->d:LNa/f;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final C()V
    .locals 6

    .line 1
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    const/16 v4, 0x208

    .line 4
    .line 5
    const/4 v5, -0x3

    .line 6
    const/4 v1, -0x1

    .line 7
    const/4 v2, -0x1

    .line 8
    const/16 v3, 0x3e8

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LNa/e;->c:Landroid/view/WindowManager;

    .line 14
    .line 15
    iget-object v2, p0, LNa/e;->d:LNa/f;

    .line 16
    .line 17
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public addChildrenForAccessibility(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "outChildren"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 1
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LNa/f;->getStateWrapper$react_native_keyboard_controller_release()Lcom/facebook/react/uimanager/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LNa/e;->B()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LNa/e;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/a0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LNa/e;->d:LNa/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LNa/f;->setStateWrapper$react_native_keyboard_controller_release(Lcom/facebook/react/uimanager/a0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
