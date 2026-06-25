.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;->PurchaseStatusBadge(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V
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
.field final synthetic $badgeInfo:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;->$badgeInfo:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

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

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge.<anonymous> (PurchaseStatusBadge.kt:34)"

    const v5, 0x4037473d

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;->$badgeInfo:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getText()Ljava/lang/String;

    move-result-object v2

    .line 6
    sget-object v3, LU/D;->a:LU/D;

    sget v4, LU/D;->b:I

    invoke-virtual {v3, v1, v4}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v5

    invoke-virtual {v5}, LU/o0;->k()LU0/Y0;

    move-result-object v21

    .line 7
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;->$badgeInfo:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getTextColor-QN2ZGVo()Ls0/r0;

    move-result-object v5

    const v6, 0x77f7e777

    invoke-interface {v1, v6}, LY/m;->V(I)V

    if-nez v5, :cond_3

    invoke-virtual {v3, v1, v4}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v3

    invoke-virtual {v3}, LU/l;->w()J

    move-result-wide v3

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Ls0/r0;->A()J

    move-result-wide v3

    :goto_1
    invoke-interface {v1}, LY/m;->O()V

    .line 8
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 9
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getBADGE_HORIZONTAL_PADDING-D9Ej5fM()F

    move-result v7

    .line 10
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getBADGE_VERTICAL_PADDING-D9Ej5fM()F

    move-result v6

    .line 11
    invoke-static {v5, v7, v6}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    const/16 v24, 0x0

    const v25, 0xfff8

    move-object v1, v2

    move-object v2, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x30

    move-object/from16 v22, p1

    .line 12
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LY/w;->T()V

    :cond_4
    return-void
.end method
