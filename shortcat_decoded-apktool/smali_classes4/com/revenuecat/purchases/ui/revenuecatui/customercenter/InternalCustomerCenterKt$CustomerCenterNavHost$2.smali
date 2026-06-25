.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt;->CustomerCenterNavHost(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lv/b;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;",
        "destination",
        "LTd/L;",
        "invoke",
        "(Lv/b;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;LY/m;I)V",
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
.field final synthetic $customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

.field final synthetic $onAction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv/b;

    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;

    check-cast p3, LY/m;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->invoke(Lv/b;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lv/b;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;LY/m;I)V
    .locals 12

    move-object v6, p3

    move/from16 v1, p4

    const-string v2, "$this$AnimatedContent"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "destination"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavHost.<anonymous> (InternalCustomerCenter.kt:483)"

    const v4, 0x4ba929b8    # 2.2172528E7f

    .line 2
    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 3
    :cond_0
    instance-of v2, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$Main;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const v0, 0x69d6477f

    invoke-interface {p3, v0}, LY/m;->V(I)V

    .line 4
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 5
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 6
    invoke-static {v0, v1, p3, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt;->access$MainScreenContent(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 7
    invoke-interface {p3}, LY/m;->O()V

    goto/16 :goto_0

    .line 8
    :cond_1
    instance-of v2, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$FeedbackSurvey;

    if-eqz v2, :cond_2

    const v1, 0x69d98d39    # 3.2875476E25f

    invoke-interface {p3, v1}, LY/m;->V(I)V

    .line 9
    move-object v0, p2

    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$FeedbackSurvey;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$FeedbackSurvey;->getData()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;

    move-result-object v0

    invoke-static {v0, p3, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt;->FeedbackSurveyView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;LY/m;I)V

    .line 10
    invoke-interface {p3}, LY/m;->O()V

    goto/16 :goto_0

    .line 11
    :cond_2
    instance-of v2, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    if-eqz v2, :cond_a

    const v2, 0x69dbd0e6

    invoke-interface {p3, v2}, LY/m;->V(I)V

    .line 12
    move-object v2, p2

    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;->getData()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;

    move-result-object v2

    .line 13
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getAppearance()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;

    move-result-object v4

    .line 14
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v5

    const v7, 0x2cb4a856

    invoke-interface {p3, v7}, LY/m;->V(I)V

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    invoke-interface {p3, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    .line 15
    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 16
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_3

    .line 17
    sget-object v7, LY/m;->a:LY/m$a;

    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_4

    .line 18
    :cond_3
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1;

    invoke-direct {v9, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 19
    invoke-interface {p3, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 20
    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {p3}, LY/m;->O()V

    const v7, 0x2cb4beaa

    invoke-interface {p3, v7}, LY/m;->V(I)V

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    invoke-interface {p3, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v8, v1, 0x70

    xor-int/lit8 v8, v8, 0x30

    const/16 v10, 0x20

    if-le v8, v10, :cond_5

    invoke-interface {p3, p2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v10, :cond_7

    :cond_6
    const/4 v3, 0x1

    :cond_7
    or-int v1, v7, v3

    .line 21
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 22
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_8

    .line 23
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_9

    .line 24
    :cond_8
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1;

    invoke-direct {v7, v3, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)V

    .line 25
    invoke-interface {p3, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    :cond_9
    check-cast v7, Lie/a;

    invoke-interface {p3}, LY/m;->O()V

    move-object v1, v4

    move-object v4, v7

    const/4 v7, 0x0

    const/16 v8, 0x20

    move-object v0, v2

    move-object v2, v5

    const/4 v5, 0x0

    move-object v3, v9

    .line 27
    invoke-static/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt;->PromotionalOfferScreen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;LY/m;II)V

    .line 28
    invoke-interface {p3}, LY/m;->O()V

    goto/16 :goto_0

    .line 29
    :cond_a
    instance-of v1, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;

    if-eqz v1, :cond_b

    const v1, 0x69e6cc93

    invoke-interface {p3, v1}, LY/m;->V(I)V

    .line 30
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getSupport()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;->getEmail()Ljava/lang/String;

    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v2

    .line 32
    move-object v0, p2

    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;->getPurchaseInformation()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    move-result-object v0

    .line 33
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getDetailScreenPaths()Ljava/util/List;

    move-result-object v3

    .line 34
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$onAction:Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v4, 0x0

    move-object v11, v2

    move-object v2, v0

    move-object v0, v1

    move-object v1, v11

    .line 35
    invoke-static/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt;->SelectedPurchaseDetailView(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V

    .line 36
    invoke-interface {p3}, LY/m;->O()V

    goto :goto_0

    .line 37
    :cond_b
    instance-of v1, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$VirtualCurrencyBalances;

    if-eqz v1, :cond_c

    const v0, 0x69eeb315

    invoke-interface {p3, v0}, LY/m;->V(I)V

    .line 38
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getAppearance()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p3

    .line 40
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrencyBalancesScreenKt;->VirtualCurrencyBalancesScreen(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;LY/m;II)V

    move-object v6, v4

    .line 41
    invoke-interface {p3}, LY/m;->O()V

    goto :goto_0

    .line 42
    :cond_c
    instance-of v1, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$CreateSupportTicket;

    if-eqz v1, :cond_d

    const v1, 0x69f3aba8

    invoke-interface {p3, v1}, LY/m;->V(I)V

    .line 43
    move-object v0, p2

    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$CreateSupportTicket;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$CreateSupportTicket;->getData()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;

    move-result-object v0

    .line 44
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/InternalCustomerCenterKt$CustomerCenterNavHost$2;->$customerCenterState:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v1

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p3

    .line 45
    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt;->CreateSupportTicketView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LY/m;II)V

    move-object v6, v5

    .line 46
    invoke-interface {p3}, LY/m;->O()V

    goto :goto_0

    :cond_d
    const v0, 0x69f6f1fd

    .line 47
    invoke-interface {p3, v0}, LY/m;->V(I)V

    invoke-interface {p3}, LY/m;->O()V

    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LY/w;->T()V

    :cond_e
    return-void
.end method
