.class public final synthetic Lcom/revenuecat/purchases/react/ui/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

.field public final synthetic c:Lcom/facebook/react/uimanager/b0;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;Lcom/facebook/react/uimanager/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/c;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/react/ui/c;->b:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/c;->c:Lcom/facebook/react/uimanager/b0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/c;->a:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/c;->b:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/c;->c:Lcom/facebook/react/uimanager/b0;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->a(Landroid/view/View;Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;Lcom/facebook/react/uimanager/b0;)LTd/L;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
