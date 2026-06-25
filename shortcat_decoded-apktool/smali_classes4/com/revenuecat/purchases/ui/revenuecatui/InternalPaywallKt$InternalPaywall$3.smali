.class final Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "(LY/m;I)V",
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

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;

.field final synthetic $viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:79)"

    const v3, -0x72c03cbe

    invoke-static {v3, p2, v0, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;

    instance-of v0, p2, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loading;

    const/4 v2, 0x1

    if-nez v0, :cond_4

    instance-of p2, p2, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    move v3, p2

    goto :goto_2

    :cond_4
    :goto_1
    move v3, v2

    .line 6
    :goto_2
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->defaultAnimation()Lw/r0;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v4, v1, v5}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->defaultAnimation()Lw/r0;

    move-result-object p2

    invoke-static {p2, v4, v1, v5}, Landroidx/compose/animation/f;->o(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v6

    .line 8
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    invoke-direct {p2, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$InternalPaywall$3$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;)V

    const/16 v1, 0x36

    const v4, 0x10455a1a

    invoke-static {v4, v2, p2, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v8

    const/high16 v10, 0x30000

    const/16 v11, 0x12

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v9, p1

    move-object v5, v0

    .line 9
    invoke-static/range {v3 .. v11}, Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
