.class public final Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;
.super Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u000c2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;",
        "Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "createWrappedView",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;",
        "Lkotlin/Function0;",
        "LTd/L;",
        "dismissHandler",
        "setDismissHandler",
        "(Lie/a;)V",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "listener",
        "setCustomerCenterListener",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V",
        "requestLayout",
        "()V",
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
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/revenuecat/purchases/react/ui/views/b;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/react/ui/views/b;-><init>(Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;->measureAndLayout:Ljava/lang/Runnable;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic b(Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;->measureAndLayout$lambda$0(Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final measureAndLayout$lambda$0(Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V
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
.method public bridge synthetic createWrappedView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;->createWrappedView(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;

    move-result-object p1

    return-object p1
.end method

.method protected createWrappedView(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;

    invoke-direct {v0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public requestLayout()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;->measureAndLayout:Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCustomerCenterListener(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;->getWrappedView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;->setCustomerCenterListener(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setDismissHandler(Lie/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;->getWrappedView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;->setDismissHandler(Lie/a;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
