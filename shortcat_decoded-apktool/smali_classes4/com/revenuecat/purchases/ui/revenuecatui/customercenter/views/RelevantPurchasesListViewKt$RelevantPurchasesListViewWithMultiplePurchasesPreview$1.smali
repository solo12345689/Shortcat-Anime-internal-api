.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt;->RelevantPurchasesListViewWithMultiplePurchasesPreview(LY/m;I)V
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
.field final synthetic $managementScreen:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

.field final synthetic $testData:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;->$managementScreen:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;->$testData:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

    move v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesPreview.<anonymous> (RelevantPurchasesListView.kt:282)"

    const v3, -0x7c90d437

    invoke-static {v3, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;->$managementScreen:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1;->$testData:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 5
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    sget-object v3, LC/b;->a:LC/b;

    invoke-virtual {v3}, LC/b;->h()LC/b$m;

    move-result-object v3

    .line 7
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v4}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v4

    const/4 v5, 0x0

    .line 8
    invoke-static {v3, v4, p1, v5}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v3

    .line 9
    invoke-static {p1, v5}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 10
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v5

    .line 11
    invoke-static {p1, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 12
    sget-object v6, LK0/g;->M:LK0/g$a;

    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 13
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 15
    invoke-interface {p1}, LY/m;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 16
    invoke-interface {p1, v7}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 18
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 19
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v3, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v5, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 22
    invoke-interface {v7}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 23
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v2, LC/j;->a:LC/j;

    .line 27
    invoke-virtual {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;->getPaths()Ljava/util/List;

    move-result-object v0

    .line 28
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getAppearance()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;

    move-result-object v3

    .line 29
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v4

    .line 30
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getSupport()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;->getSupportTickets()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;

    move-result-object v5

    .line 31
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->getPurchaseInformationMonthlyRenewing()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    move-result-object v2

    .line 32
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->getPurchaseInformationYearlyExpiring()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    move-result-object v1

    filled-new-array {v2, v1}, [Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    move-result-object v1

    .line 33
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 34
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$1;

    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$2;

    const v11, 0xd801b0

    const/16 v12, 0x100

    const-string v1, "support@revenuecat.com"

    const/4 v2, 0x0

    const/4 v8, 0x0

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/RelevantPurchasesListViewKt;->RelevantPurchasesListView(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V

    .line 35
    invoke-interface {p1}, LY/m;->x()V

    .line 36
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
