.class final Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1;->invoke(LY/m;I)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LC/A;",
        "<anonymous parameter 0>",
        "LTd/L;",
        "invoke",
        "(LC/A;LY/m;I)V",
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
.field final synthetic $args:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

.field final synthetic $compositeListener:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;

.field final synthetic $offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

.field final synthetic $purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$args:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$compositeListener:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/A;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->invoke(LC/A;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/A;LY/m;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "$anonymous$parameter$0$"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    if-ne v3, v4, :cond_1

    .line 2
    invoke-interface {v1}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaywallActivity.kt:208)"

    const v5, 0x78c12f9f

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 6
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    iget-object v6, v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$args:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$compositeListener:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;

    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1;->$purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 7
    sget-object v10, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v10}, Ll0/e$a;->o()Ll0/e;

    move-result-object v10

    const/4 v11, 0x0

    .line 8
    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v10

    .line 9
    invoke-static {v1, v11}, LY/h;->a(LY/m;I)I

    move-result v12

    .line 10
    invoke-interface {v1}, LY/m;->r()LY/I;

    move-result-object v13

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 12
    sget-object v14, LK0/g;->M:LK0/g$a;

    invoke-virtual {v14}, LK0/g$a;->a()Lie/a;

    move-result-object v15

    .line 13
    invoke-interface {v1}, LY/m;->j()LY/d;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_3
    invoke-interface {v1}, LY/m;->I()V

    .line 15
    invoke-interface {v1}, LY/m;->e()Z

    move-result v16

    if-eqz v16, :cond_4

    .line 16
    invoke-interface {v1, v15}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {v1}, LY/m;->s()V

    .line 18
    :goto_1
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v15

    .line 19
    invoke-virtual {v14}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v15, v10, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v15, v13, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 22
    invoke-interface {v15}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_5

    invoke-interface {v15}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 23
    :cond_5
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v15, v2, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 27
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 28
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$paywallOptions$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$paywallOptions$1;

    .line 29
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 30
    invoke-virtual {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setOfferingSelection$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    .line 31
    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->access$getFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    if-eqz v7, :cond_7

    .line 32
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getShouldDisplayDismissButton()Z

    move-result v4

    goto :goto_2

    :cond_7
    const/4 v4, 0x1

    .line 33
    :goto_2
    invoke-virtual {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setShouldDisplayDismissButton(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    .line 34
    invoke-virtual {v2, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setListener(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    .line 35
    invoke-virtual {v2, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setPurchaseLogic(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    const v3, 0x3db297ec

    invoke-interface {v1, v3}, LY/m;->V(I)V

    invoke-interface {v1, v6}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v3

    .line 36
    invoke-interface {v1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    .line 37
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    .line 38
    :cond_8
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1;

    invoke-direct {v4, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1;-><init>(Ljava/lang/Object;)V

    .line 39
    invoke-interface {v1, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 40
    :cond_9
    check-cast v4, Lpe/h;

    invoke-interface {v1}, LY/m;->O()V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    if-eqz v7, :cond_a

    .line 41
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getCustomVariables()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v3

    :cond_b
    invoke-virtual {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setCustomVariables(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    move-result-object v2

    const/4 v3, 0x2

    .line 43
    invoke-static {v2, v5, v1, v11, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->getPaywallViewModel(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lkotlin/jvm/functions/Function1;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    move-result-object v3

    .line 44
    sget-object v4, LTd/L;->a:LTd/L;

    const v6, 0x3db2b931

    invoke-interface {v1, v6}, LY/m;->V(I)V

    invoke-interface {v1, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v6

    .line 45
    invoke-interface {v1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    .line 46
    sget-object v6, LY/m;->a:LY/m$a;

    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_d

    .line 47
    :cond_c
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$1$1;

    invoke-direct {v7, v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1$1$1$1$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LZd/e;)V

    .line 48
    invoke-interface {v1, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 49
    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-interface {v1}, LY/m;->O()V

    const/4 v3, 0x6

    invoke-static {v4, v7, v1, v3}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 50
    invoke-static {v2, v1, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallKt;->Paywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LY/m;I)V

    .line 51
    invoke-interface {v1}, LY/m;->x()V

    .line 52
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LY/w;->T()V

    :cond_e
    return-void
.end method
