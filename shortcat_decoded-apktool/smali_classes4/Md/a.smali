.class public abstract LMd/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lcom/facebook/react/uimanager/events/EventDispatcher;Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/w;)V
    .locals 11

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "touchEventCoalescingKeyHelper"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {p2}, LMd/a;->b(Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/x;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    move-object v5, p2

    .line 46
    move-object v10, p3

    .line 47
    invoke-virtual/range {v1 .. v10}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    const-string p1, "EventDispatcherUtils"

    .line 58
    .line 59
    const-string p2, "Error dispatching touch event"

    .line 60
    .line 61
    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private static final b(Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/x;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lcom/facebook/react/uimanager/events/x;->f:Lcom/facebook/react/uimanager/events/x;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lcom/facebook/react/uimanager/events/x;->f:Lcom/facebook/react/uimanager/events/x;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object p0, Lcom/facebook/react/uimanager/events/x;->e:Lcom/facebook/react/uimanager/events/x;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    sget-object p0, Lcom/facebook/react/uimanager/events/x;->d:Lcom/facebook/react/uimanager/events/x;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    sget-object p0, Lcom/facebook/react/uimanager/events/x;->c:Lcom/facebook/react/uimanager/events/x;

    .line 29
    .line 30
    return-object p0
.end method
