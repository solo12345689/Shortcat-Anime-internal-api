.class final Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lv/e;",
        "LTd/L;",
        "invoke",
        "(Lv/e;LY/m;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

.field final synthetic $viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv/e;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->invoke(Lv/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lv/e;LY/m;I)V
    .locals 3

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:84)"

    const v1, 0x10455a1a

    .line 2
    invoke-static {v1, p3, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;->getMode$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    move-result-object p1

    .line 4
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;->getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release()Z

    move-result p3

    .line 5
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    const v1, 0x4701b561

    invoke-interface {p2, v1}, LY/m;->V(I)V

    invoke-interface {p2, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v1

    .line 6
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    .line 7
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    .line 8
    :cond_1
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1$1$1;

    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1$1$1;-><init>(Ljava/lang/Object;)V

    .line 9
    invoke-interface {p2, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 10
    :cond_2
    check-cast v2, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const/4 v0, 0x0

    .line 11
    invoke-static {p1, p3, v2, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingPaywallKt;->LoadingPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;ZLie/a;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
