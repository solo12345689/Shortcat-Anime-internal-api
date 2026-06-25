.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt;->PurchaseButton-WH-ejsw(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;FLandroidx/compose/ui/e;LY/m;II)V
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
        "LC/I;",
        "LTd/L;",
        "invoke",
        "(LC/I;LY/m;I)V",
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
.field final synthetic $colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

.field final synthetic $labelOpacity$delegate:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field final synthetic $packages:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;

.field final synthetic $selectedPackage:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/h2;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;",
            "LY/C0;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;",
            "LY/h2;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$packages:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$selectedPackage:LY/C0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$labelOpacity$delegate:LY/h2;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

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
    check-cast p1, LC/I;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->invoke(LC/I;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/I;LY/m;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "$this$Button"

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

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous> (PurchaseButton.kt:132)"

    const v5, 0x4cb5b951    # 9.5275656E7f

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3$1;

    invoke-static {v2, v3}, LR0/r;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v3

    .line 6
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$packages:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;

    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$selectedPackage:LY/C0;

    iget-object v6, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$labelOpacity$delegate:LY/h2;

    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 7
    sget-object v9, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v9}, Ll0/e$a;->o()Ll0/e;

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
    invoke-static {v1, v3}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

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

    move-result-object v11

    invoke-static {v15, v10, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v15, v13, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    .line 22
    invoke-interface {v15}, LY/m;->e()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-interface {v15}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    .line 23
    :cond_5
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11, v10}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v15, v3, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v3, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 27
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;->getAll()Ljava/util/List;

    move-result-object v4

    .line 28
    invoke-interface {v5}, LY/C0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    .line 29
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3$2$1;

    invoke-direct {v10, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt$PurchaseButton$3$3$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/h2;)V

    const/16 v7, 0x36

    const v11, 0x5d899b0

    const/4 v12, 0x1

    invoke-static {v11, v12, v10, v1, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v7

    const/16 v10, 0x180

    .line 30
    invoke-static {v4, v5, v7, v1, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt;->ConsistentPackageContentView(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;LY/m;I)V

    .line 31
    invoke-interface {v3, v2}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 32
    invoke-virtual {v9}, Ll0/e$a;->o()Ll0/e;

    move-result-object v4

    const/4 v5, 0x0

    .line 33
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v4

    .line 34
    invoke-static {v1, v5}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 35
    invoke-interface {v1}, LY/m;->r()LY/I;

    move-result-object v7

    .line 36
    invoke-static {v1, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 37
    invoke-virtual {v14}, LK0/g$a;->a()Lie/a;

    move-result-object v9

    .line 38
    invoke-interface {v1}, LY/m;->j()LY/d;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LY/h;->d()V

    .line 39
    :cond_7
    invoke-interface {v1}, LY/m;->I()V

    .line 40
    invoke-interface {v1}, LY/m;->e()Z

    move-result v10

    if-eqz v10, :cond_8

    .line 41
    invoke-interface {v1, v9}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 42
    :cond_8
    invoke-interface {v1}, LY/m;->s()V

    .line 43
    :goto_2
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v9

    .line 44
    invoke-virtual {v14}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v4, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 45
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v7, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 46
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 47
    invoke-interface {v9}, LY/m;->e()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 48
    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 49
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 50
    :cond_a
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v2, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 51
    invoke-interface {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->getActionInProgress()LY/h2;

    move-result-object v2

    invoke-interface {v2}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x6

    invoke-static {v3, v2, v6, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt;->access$LoadingSpinner(LC/c;ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V

    .line 52
    invoke-interface {v1}, LY/m;->x()V

    .line 53
    invoke-interface {v1}, LY/m;->x()V

    .line 54
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LY/w;->T()V

    :cond_b
    return-void
.end method
