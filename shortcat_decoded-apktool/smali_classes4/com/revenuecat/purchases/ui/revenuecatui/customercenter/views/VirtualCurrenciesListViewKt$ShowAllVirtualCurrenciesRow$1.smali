.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->ShowAllVirtualCurrenciesRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V
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
.field final synthetic $localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

.field final synthetic $onAction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->$localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 28

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

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ShowAllVirtualCurrenciesRow.<anonymous> (VirtualCurrenciesListView.kt:197)"

    const v4, -0x360cdc11

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 6
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const v1, 0x990bb0f

    .line 7
    invoke-interface {v6, v1}, LY/m;->V(I)V

    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->$onAction:Lkotlin/jvm/functions/Function1;

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->$onAction:Lkotlin/jvm/functions/Function1;

    .line 8
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    .line 9
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    .line 10
    :cond_3
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1$1$1;

    invoke-direct {v3, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 11
    invoke-interface {v6, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 12
    :cond_4
    move-object v11, v3

    check-cast v11, Lie/a;

    invoke-interface {v6}, LY/m;->O()V

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 13
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getCARD_PADDING-D9Ej5fM()F

    move-result v2

    const/16 v3, 0xc

    int-to-float v3, v3

    .line 14
    invoke-static {v3}, Li1/h;->n(F)F

    move-result v3

    .line 15
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    .line 16
    sget-object v2, LC/b;->a:LC/b;

    invoke-virtual {v2}, LC/b;->e()LC/b$f;

    move-result-object v2

    .line 17
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v3}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v3

    .line 18
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;->$localization:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    const/16 v5, 0x36

    .line 19
    invoke-static {v2, v3, v6, v5}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object v2

    const/4 v3, 0x0

    .line 20
    invoke-static {v6, v3}, LY/h;->a(LY/m;I)I

    move-result v3

    .line 21
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v5

    .line 22
    invoke-static {v6, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 23
    sget-object v7, LK0/g;->M:LK0/g$a;

    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    move-result-object v8

    .line 24
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v9

    if-nez v9, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 25
    :cond_5
    invoke-interface {v6}, LY/m;->I()V

    .line 26
    invoke-interface {v6}, LY/m;->e()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 27
    invoke-interface {v6, v8}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 28
    :cond_6
    invoke-interface {v6}, LY/m;->s()V

    .line 29
    :goto_1
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v8

    .line 30
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v2, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v5, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 32
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 33
    invoke-interface {v8}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 34
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v8, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 36
    :cond_8
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v1, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    sget-object v1, LC/J;->a:LC/J;

    .line 38
    sget-object v1, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->SEE_ALL_VIRTUAL_CURRENCIES:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 39
    invoke-virtual {v4, v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    move-result-object v1

    .line 40
    sget-object v2, LU/D;->a:LU/D;

    sget v3, LU/D;->b:I

    invoke-virtual {v2, v6, v3}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v4

    invoke-virtual {v4}, LU/o0;->c()LU0/Y0;

    move-result-object v21

    .line 41
    invoke-virtual {v2, v6, v3}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v4

    invoke-virtual {v4}, LU/l;->C()J

    move-result-wide v4

    const/16 v24, 0x0

    const v25, 0xfffa

    move-object v7, v2

    const/4 v2, 0x0

    move v8, v3

    move-wide v3, v4

    const-wide/16 v5, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move v13, v10

    move-object v12, v11

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v27, v22

    move-object/from16 v0, v26

    move-object/from16 v22, p1

    .line 42
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-object/from16 v6, v22

    .line 43
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/icons/KeyboardArrowRightKt;->getKeyboardArrowRight()Lx0/d;

    move-result-object v1

    move/from16 v13, v27

    .line 44
    invoke-virtual {v0, v6, v13}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v0

    invoke-virtual {v0}, LU/l;->C()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v3, 0x0

    .line 45
    invoke-static/range {v1 .. v8}, LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    .line 46
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 47
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
