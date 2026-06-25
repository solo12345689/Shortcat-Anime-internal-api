.class public final Lcom/swmansion/gesturehandler/react/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQa/D;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/react/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)LQa/v;
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/uimanager/L;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lcom/facebook/react/uimanager/L;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/facebook/react/uimanager/L;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    sget-object p1, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 27
    .line 28
    if-ne v0, p1, :cond_1

    .line 29
    .line 30
    sget-object p1, LQa/v;->b:LQa/v;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    sget-object p1, Lcom/facebook/react/uimanager/C;->d:Lcom/facebook/react/uimanager/C;

    .line 34
    .line 35
    if-ne v0, p1, :cond_2

    .line 36
    .line 37
    sget-object p1, LQa/v;->a:LQa/v;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    sget-object p1, Lcom/swmansion/gesturehandler/react/o$a;->a:[I

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    aget p1, p1, v0

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-eq p1, v0, :cond_6

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    if-eq p1, v0, :cond_5

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    if-eq p1, v0, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    sget-object p1, LQa/v;->d:LQa/v;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    new-instance p1, LTd/r;

    .line 64
    .line 65
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    sget-object p1, LQa/v;->a:LQa/v;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_5
    sget-object p1, LQa/v;->b:LQa/v;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_6
    sget-object p1, LQa/v;->c:LQa/v;

    .line 76
    .line 77
    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;)Z
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    instance-of v0, p1, Lcom/facebook/react/views/scroll/k;

    .line 15
    .line 16
    const-string v2, "visible"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p1, Lcom/facebook/react/views/scroll/k;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/k;->getOverflow()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    return v3

    .line 35
    :cond_2
    instance-of v0, p1, Lcom/facebook/react/views/scroll/j;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    check-cast p1, Lcom/facebook/react/views/scroll/j;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/j;->getOverflow()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    return v3

    .line 53
    :cond_4
    instance-of v0, p1, Lcom/facebook/react/views/view/g;

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    .line 57
    check-cast p1, Lcom/facebook/react/views/view/g;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/facebook/react/views/view/g;->getOverflow()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "hidden"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_5
    return v3
.end method

.method public c(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/views/view/g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lcom/facebook/react/views/view/g;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lcom/facebook/react/views/view/g;->getZIndexMappedChildIndex(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method
