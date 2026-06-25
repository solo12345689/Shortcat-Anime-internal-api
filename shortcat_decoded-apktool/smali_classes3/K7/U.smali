.class public LK7/U;
.super Lcom/facebook/react/uimanager/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/c;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "screenKey"

    .line 5
    .line 6
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "activityMode"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/c;->a(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 25
    .line 26
    check-cast p2, LK7/V;

    .line 27
    .line 28
    check-cast p3, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p2, p1, p3}, LK7/V;->setActivityMode(Landroid/view/View;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 35
    .line 36
    check-cast p2, LK7/V;

    .line 37
    .line 38
    if-nez p3, :cond_2

    .line 39
    .line 40
    const/4 p3, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    check-cast p3, Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    invoke-interface {p2, p1, p3}, LK7/V;->setScreenKey(Landroid/view/View;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
