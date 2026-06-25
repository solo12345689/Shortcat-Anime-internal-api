.class public final Ldb/e;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/L;


# instance fields
.field private final A:Landroid/view/animation/Animation$AnimationListener;

.field private final y:Lcom/swmansion/rnscreens/X;

.field private final z:Lcom/facebook/react/uimanager/L;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/swmansion/rnscreens/X;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lcom/swmansion/rnscreens/q;

    invoke-direct {v0}, Lcom/swmansion/rnscreens/q;-><init>()V

    .line 6
    invoke-direct {p0, p1, p2, v0}, Ldb/e;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/X;Lcom/facebook/react/uimanager/L;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/swmansion/rnscreens/X;Lcom/facebook/react/uimanager/L;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointerEventsImpl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 3
    iput-object p3, p0, Ldb/e;->z:Lcom/facebook/react/uimanager/L;

    .line 4
    new-instance p1, Ldb/e$a;

    invoke-direct {p1, p0}, Ldb/e$a;-><init>(Ldb/e;)V

    iput-object p1, p0, Ldb/e;->A:Landroid/view/animation/Animation$AnimationListener;

    return-void
.end method


# virtual methods
.method public clearFocus()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final getFragment$react_native_screens_release()Lcom/swmansion/rnscreens/X;
    .locals 1

    .line 1
    iget-object v0, p0, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/C;
    .locals 1

    .line 1
    iget-object v0, p0, Ldb/e;->z:Lcom/facebook/react/uimanager/L;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/uimanager/L;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "onApplyWindowInsets(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    iget-object p3, p1, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 7
    .line 8
    invoke-virtual {p3}, Lcom/swmansion/rnscreens/F;->k()Lcom/swmansion/rnscreens/y;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-static {p3}, LSa/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget-object p3, p1, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/swmansion/rnscreens/F;->k()Lcom/swmansion/rnscreens/y;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-virtual {p3, p2}, Lcom/swmansion/rnscreens/y;->u(Z)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public startAnimation(Landroid/view/animation/Animation;)V
    .locals 3

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcb/a;

    .line 7
    .line 8
    iget-object v1, p0, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcb/a;-><init>(Lcom/swmansion/rnscreens/F;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 18
    .line 19
    .line 20
    instance-of v1, p1, Landroid/view/animation/AnimationSet;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Ldb/e;->y:Lcom/swmansion/rnscreens/X;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/fragment/app/q;->isRemoving()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    check-cast p1, Landroid/view/animation/AnimationSet;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ldb/e;->A:Landroid/view/animation/Animation$AnimationListener;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v1, Landroid/view/animation/AnimationSet;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ldb/e;->A:Landroid/view/animation/Animation$AnimationListener;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 61
    .line 62
    .line 63
    invoke-super {p0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
