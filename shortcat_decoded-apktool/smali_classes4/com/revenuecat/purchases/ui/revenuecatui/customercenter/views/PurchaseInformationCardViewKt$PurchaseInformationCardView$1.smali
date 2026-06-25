.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->PurchaseInformationCardView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;LY/m;II)V
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
.field final synthetic $isDetailedView:Z

.field final synthetic $localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

.field final synthetic $onCardClick:Lie/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/a;"
        }
    .end annotation
.end field

.field final synthetic $purchaseInformation:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;


# direct methods
.method constructor <init>(Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$onCardClick:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$purchaseInformation:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$isDetailedView:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v6}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView.<anonymous> (PurchaseInformationCardView.kt:67)"

    const v4, -0x3cb022f

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v8, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$onCardClick:Lie/a;

    const v2, 0x281a4cd4

    invoke-interface {v6, v2}, LY/m;->V(I)V

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$onCardClick:Lie/a;

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$onCardClick:Lie/a;

    .line 7
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_3

    .line 8
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_4

    .line 9
    :cond_3
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1;

    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1;-><init>(Lie/a;)V

    .line 10
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 11
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6}, LY/m;->O()V

    invoke-static {v8, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 12
    sget-object v26, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getCARD_PADDING-D9Ej5fM()F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    .line 13
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$purchaseInformation:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    iget-boolean v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;->$isDetailedView:Z

    .line 14
    sget-object v5, LC/b;->a:LC/b;

    invoke-virtual {v5}, LC/b;->h()LC/b$m;

    move-result-object v7

    .line 15
    sget-object v27, Ll0/e;->a:Ll0/e$a;

    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v9

    const/4 v13, 0x0

    .line 16
    invoke-static {v7, v9, v6, v13}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v7

    .line 17
    invoke-static {v6, v13}, LY/h;->a(LY/m;I)I

    move-result v9

    .line 18
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v10

    .line 19
    invoke-static {v6, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 20
    sget-object v28, LK0/g;->M:LK0/g$a;

    invoke-virtual/range {v28 .. v28}, LK0/g$a;->a()Lie/a;

    move-result-object v11

    .line 21
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v12

    if-nez v12, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 22
    :cond_5
    invoke-interface {v6}, LY/m;->I()V

    .line 23
    invoke-interface {v6}, LY/m;->e()Z

    move-result v12

    if-eqz v12, :cond_6

    .line 24
    invoke-interface {v6, v11}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 25
    :cond_6
    invoke-interface {v6}, LY/m;->s()V

    .line 26
    :goto_1
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v11

    .line 27
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v7, v12}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v10, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    .line 30
    invoke-interface {v11}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_7

    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    .line 31
    :cond_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 32
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 33
    :cond_8
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v1, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 34
    sget-object v1, LC/j;->a:LC/j;

    .line 35
    invoke-virtual {v5}, LC/b;->e()LC/b$f;

    move-result-object v1

    .line 36
    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->l()Ll0/e$c;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    .line 37
    invoke-static {v8, v9, v10, v11}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v14

    .line 38
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getTITLE_ROW_BOTTOM_PADDING-D9Ej5fM()F

    move-result v18

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    const/16 v14, 0x36

    .line 39
    invoke-static {v1, v7, v6, v14}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object v1

    .line 40
    invoke-static {v6, v13}, LY/h;->a(LY/m;I)I

    move-result v7

    .line 41
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v10

    .line 42
    invoke-static {v6, v9}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    .line 43
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->a()Lie/a;

    move-result-object v12

    .line 44
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v15

    if-nez v15, :cond_9

    invoke-static {}, LY/h;->d()V

    .line 45
    :cond_9
    invoke-interface {v6}, LY/m;->I()V

    .line 46
    invoke-interface {v6}, LY/m;->e()Z

    move-result v15

    if-eqz v15, :cond_a

    .line 47
    invoke-interface {v6, v12}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 48
    :cond_a
    invoke-interface {v6}, LY/m;->s()V

    .line 49
    :goto_2
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v12

    .line 50
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v12, v1, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 51
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v12, v10, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 52
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 53
    invoke-interface {v12}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 54
    :cond_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 55
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 56
    :cond_c
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v12, v9, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 57
    sget-object v7, LC/J;->a:LC/J;

    .line 58
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_f

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-interface {v1}, Lcom/revenuecat/purchases/models/StoreProduct;->getTitle()Ljava/lang/String;

    move-result-object v11

    :cond_d
    if-nez v11, :cond_e

    const-string v1, ""

    goto :goto_3

    :cond_e
    move-object v1, v11

    .line 59
    :cond_f
    :goto_3
    sget-object v15, LU/D;->a:LU/D;

    sget v9, LU/D;->b:I

    invoke-virtual {v15, v6, v9}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v10

    invoke-virtual {v10}, LU/o0;->o()LU0/Y0;

    move-result-object v21

    .line 60
    invoke-virtual {v15, v6, v9}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v10

    invoke-virtual {v10}, LU/l;->w()J

    move-result-wide v16

    const/4 v11, 0x2

    const/4 v12, 0x0

    move v10, v9

    const/high16 v9, 0x3f800000    # 1.0f

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v29, v18

    .line 61
    invoke-static/range {v7 .. v12}, LC/I;->b(LC/I;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/16 v24, 0x0

    const v25, 0xfff8

    move-object v9, v5

    const-wide/16 v5, 0x0

    move-object v10, v2

    move-object v2, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    move-object/from16 v18, v11

    const-wide/16 v10, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v30, v14

    move-object/from16 v23, v15

    const-wide/16 v14, 0x0

    move/from16 v31, v4

    move-wide/from16 v41, v16

    move-object/from16 v17, v3

    move-wide/from16 v3, v41

    const/16 v16, 0x0

    move-object/from16 v32, v17

    const/16 v17, 0x0

    move-object/from16 v33, v18

    const/16 v18, 0x0

    move-object/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v22, p1

    move-object/from16 v37, v32

    move-object/from16 v0, v35

    move-object/from16 v38, v36

    .line 62
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-object/from16 v6, v22

    .line 63
    invoke-virtual/range {v34 .. v34}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isSubscription()Z

    move-result v1

    if-nez v1, :cond_15

    if-nez v31, :cond_15

    const v1, -0x2282499f

    invoke-interface {v6, v1}, LY/m;->V(I)V

    .line 64
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getBADGE_HORIZONTAL_PADDING-D9Ej5fM()F

    move-result v1

    .line 65
    invoke-virtual {v0, v1}, LC/b;->o(F)LC/b$f;

    move-result-object v0

    .line 66
    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v1

    const/16 v2, 0x36

    .line 67
    invoke-static {v0, v1, v6, v2}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object v0

    const/4 v1, 0x0

    .line 68
    invoke-static {v6, v1}, LY/h;->a(LY/m;I)I

    move-result v2

    .line 69
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v3

    move-object/from16 v8, v33

    .line 70
    invoke-static {v6, v8}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 71
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->a()Lie/a;

    move-result-object v5

    .line 72
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_10

    invoke-static {}, LY/h;->d()V

    .line 73
    :cond_10
    invoke-interface {v6}, LY/m;->I()V

    .line 74
    invoke-interface {v6}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_11

    .line 75
    invoke-interface {v6, v5}, LY/m;->h(Lie/a;)V

    goto :goto_4

    .line 76
    :cond_11
    invoke-interface {v6}, LY/m;->s()V

    .line 77
    :goto_4
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v5

    .line 78
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v5, v0, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 79
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v3, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 80
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 81
    invoke-interface {v5}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_12

    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    .line 82
    :cond_12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 83
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 84
    :cond_13
    invoke-virtual/range {v28 .. v28}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v4, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x5130dafc

    .line 85
    invoke-interface {v6, v0}, LY/m;->V(I)V

    invoke-virtual/range {v34 .. v34}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isLifetime()Z

    move-result v0

    if-eqz v0, :cond_14

    move-object/from16 v0, v34

    move-object/from16 v9, v37

    .line 86
    invoke-static {v0, v9, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;->PurchaseStatusBadge(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V

    goto :goto_5

    :cond_14
    move-object/from16 v0, v34

    move-object/from16 v9, v37

    :goto_5
    invoke-interface {v6}, LY/m;->O()V

    .line 87
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/icons/KeyboardArrowRightKt;->getKeyboardArrowRight()Lx0/d;

    move-result-object v1

    move/from16 v11, v29

    move-object/from16 v10, v38

    .line 88
    invoke-virtual {v10, v6, v11}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v2

    invoke-virtual {v2}, LU/l;->w()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 89
    invoke-static/range {v1 .. v8}, LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    .line 90
    invoke-interface {v6}, LY/m;->x()V

    .line 91
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_6

    :cond_15
    move/from16 v11, v29

    move-object/from16 v0, v34

    move-object/from16 v9, v37

    move-object/from16 v10, v38

    const/4 v1, 0x0

    const v2, -0x432d16df

    .line 92
    invoke-interface {v6, v2}, LY/m;->V(I)V

    invoke-static {v0, v9, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;->PurchaseStatusBadge(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V

    invoke-interface {v6}, LY/m;->O()V

    .line 93
    :goto_6
    invoke-interface {v6}, LY/m;->x()V

    .line 94
    invoke-static {v0, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->access$getSubtitle(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    move-result-object v1

    const v2, -0x46ec7dc5

    invoke-interface {v6, v2}, LY/m;->V(I)V

    if-nez v1, :cond_16

    move-object/from16 v34, v0

    move-object v0, v9

    move-object/from16 v39, v10

    move/from16 v40, v11

    goto :goto_7

    .line 95
    :cond_16
    invoke-virtual {v10, v6, v11}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v2

    invoke-virtual {v2}, LU/o0;->c()LU0/Y0;

    move-result-object v21

    .line 96
    invoke-virtual {v10, v6, v11}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v2

    invoke-virtual {v2}, LU/l;->w()J

    move-result-wide v12

    const/16 v18, 0xe

    const/16 v19, 0x0

    const v14, 0x3f333333    # 0.7f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    const/16 v24, 0x0

    const v25, 0xfffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v32, v9

    const/4 v9, 0x0

    move-object/from16 v36, v10

    move/from16 v29, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p1

    move-object/from16 v34, v0

    move/from16 v40, v29

    move-object/from16 v0, v32

    move-object/from16 v39, v36

    .line 97
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-object/from16 v6, v22

    .line 98
    sget-object v1, LTd/L;->a:LTd/L;

    .line 99
    :goto_7
    invoke-interface {v6}, LY/m;->O()V

    .line 100
    invoke-virtual/range {v34 .. v34}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->access$getStoreText(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v10, v39

    move/from16 v11, v40

    .line 101
    invoke-virtual {v10, v6, v11}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v0

    invoke-virtual {v0}, LU/o0;->c()LU0/Y0;

    move-result-object v21

    .line 102
    invoke-virtual {v10, v6, v11}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v0

    invoke-virtual {v0}, LU/l;->w()J

    move-result-wide v7

    const/16 v13, 0xe

    const/4 v14, 0x0

    const v9, 0x3f333333    # 0.7f

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v14}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    const/16 v24, 0x0

    const v25, 0xfffa

    const/4 v2, 0x0

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

    const/16 v23, 0x0

    move-object/from16 v22, p1

    .line 103
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 104
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 105
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LY/w;->T()V

    :cond_17
    return-void
.end method
