.class public final Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;
.super Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1",
        "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;",
        "LTd/L;",
        "requestLayout",
        "()V",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Ljava/lang/Runnable;",
        "measureAndLayout",
        "Ljava/lang/Runnable;",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final measureAndLayout:Ljava/lang/Runnable;

.field final synthetic this$0:Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/b0;Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;->this$0:Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/revenuecat/purchases/react/ui/g;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/react/ui/g;-><init>(Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;->measureAndLayout:Ljava/lang/Runnable;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic b(Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;->measureAndLayout$lambda$0(Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final measureAndLayout$lambda$0(Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->measure(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;->isAttached()Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    invoke-static {p0}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LCf/i;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p2}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x0

    .line 19
    move v1, v0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v3, p1, v0}, Landroid/view/View;->measure(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v1, v4}, Loe/j;->e(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v2, v3}, Loe/j;->e(II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {v1, p1}, Loe/j;->e(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-static {v2, p2}, Loe/j;->e(II)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 85
    .line 86
    int-to-float p2, p2

    .line 87
    div-float/2addr p2, p1

    .line 88
    new-instance p1, Lcom/revenuecat/purchases/react/ui/events/OnMeasureEvent;

    .line 89
    .line 90
    invoke-static {p0}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    float-to-int p2, p2

    .line 99
    invoke-direct {p1, v0, v1, p2}, Lcom/revenuecat/purchases/react/ui/events/OnMeasureEvent;-><init>(III)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    instance-of v0, p2, Lcom/facebook/react/uimanager/b0;

    .line 107
    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    check-cast p2, Lcom/facebook/react/uimanager/b0;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    const/4 p2, 0x0

    .line 114
    :goto_1
    if-eqz p2, :cond_2

    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/b0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-eqz p2, :cond_2

    .line 121
    .line 122
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;->this$0:Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v0, p2, v1, p1}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;->measureAndLayout:Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
