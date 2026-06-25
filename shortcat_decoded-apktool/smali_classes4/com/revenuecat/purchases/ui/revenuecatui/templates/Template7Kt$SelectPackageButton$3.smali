.class final Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt;->SelectPackageButton(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V
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

.field final synthetic $isSelected:Z

.field final synthetic $packageInfo:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

.field final synthetic $textColor:J


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;JZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$packageInfo:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$textColor:J

    .line 4
    .line 5
    iput-boolean p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$isSelected:Z

    .line 6
    .line 7
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->invoke(LC/I;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/I;LY/m;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move/from16 v1, p3

    const-string v2, "$this$Button"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v12}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v12}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template7.kt:527)"

    const v4, -0x2b9f1d28

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 6
    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 7
    sget-object v3, LC/b;->a:LC/b;

    const/4 v5, 0x4

    int-to-float v5, v5

    .line 8
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v5

    .line 9
    invoke-virtual {v3, v5}, LC/b;->o(F)LC/b$f;

    move-result-object v5

    .line 10
    sget-object v6, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v6}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v7

    .line 11
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$packageInfo:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    iget-wide v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$textColor:J

    iget-boolean v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$isSelected:Z

    iget-object v13, v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    iget-object v14, v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$SelectPackageButton$3;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

    const/16 v15, 0x36

    .line 12
    invoke-static {v5, v7, v12, v15}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v5

    const/4 v7, 0x0

    .line 13
    invoke-static {v12, v7}, LY/h;->a(LY/m;I)I

    move-result v16

    .line 14
    invoke-interface {v12}, LY/m;->r()LY/I;

    move-result-object v4

    .line 15
    invoke-static {v12, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 16
    sget-object v17, LK0/g;->M:LK0/g$a;

    invoke-virtual/range {v17 .. v17}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 17
    invoke-interface {v12}, LY/m;->j()LY/d;

    move-result-object v18

    if-nez v18, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 18
    :cond_3
    invoke-interface {v12}, LY/m;->I()V

    .line 19
    invoke-interface {v12}, LY/m;->e()Z

    move-result v18

    if-eqz v18, :cond_4

    .line 20
    invoke-interface {v12, v7}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 21
    :cond_4
    invoke-interface {v12}, LY/m;->s()V

    .line 22
    :goto_1
    invoke-static {v12}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 23
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v7, v5, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v4, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 26
    invoke-interface {v7}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v5, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 27
    :cond_5
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 28
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    :cond_6
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v7, v2, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    sget-object v2, LC/j;->a:LC/j;

    const/4 v2, 0x6

    int-to-float v2, v2

    .line 31
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    .line 32
    invoke-virtual {v3, v2}, LC/b;->o(F)LC/b$f;

    move-result-object v2

    invoke-virtual {v6}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v3

    const/16 v4, 0x36

    .line 33
    invoke-static {v2, v3, v12, v4}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object v2

    const/4 v3, 0x0

    .line 34
    invoke-static {v12, v3}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 35
    invoke-interface {v12}, LY/m;->r()LY/I;

    move-result-object v3

    .line 36
    invoke-static {v12, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    .line 37
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 38
    invoke-interface {v12}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LY/h;->d()V

    .line 39
    :cond_7
    invoke-interface {v12}, LY/m;->I()V

    .line 40
    invoke-interface {v12}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 41
    invoke-interface {v12, v6}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 42
    :cond_8
    invoke-interface {v12}, LY/m;->s()V

    .line 43
    :goto_2
    invoke-static {v12}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 44
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 45
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v3, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 46
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 47
    invoke-interface {v6}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 48
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 49
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 50
    :cond_a
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 51
    sget-object v2, LC/J;->a:LC/J;

    const/4 v3, 0x0

    .line 52
    invoke-static {v11, v13, v12, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt;->access$CheckmarkBox(ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V

    .line 53
    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getLocalization()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getOfferName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_b

    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getRcPackage()Lcom/revenuecat/purchases/Package;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    move-result-object v3

    invoke-interface {v3}, Lcom/revenuecat/purchases/models/StoreProduct;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 54
    :cond_b
    sget-object v4, LU/D;->a:LU/D;

    sget v5, LU/D;->b:I

    invoke-virtual {v4, v12, v5}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v6

    invoke-virtual {v6}, LU/o0;->b()LU0/Y0;

    move-result-object v21

    .line 55
    sget-object v6, LY0/L;->b:LY0/L$a;

    invoke-virtual {v6}, LY0/L$a;->h()LY0/L;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v11, 0x1

    .line 56
    invoke-interface {v2, v1, v7, v11}, LC/I;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v24, 0x0

    const v25, 0xffd8

    move v7, v5

    move-object v11, v8

    move-object v8, v6

    const-wide/16 v5, 0x0

    move v15, v7

    const/4 v7, 0x0

    move-object/from16 v16, v2

    move-object v2, v1

    move-object v1, v3

    move-wide/from16 v32, v9

    move-object v10, v4

    move-wide/from16 v3, v32

    const/4 v9, 0x0

    move-object/from16 v18, v10

    move-object/from16 v17, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    move/from16 v22, v15

    const-wide/16 v14, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move-object/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v23

    const/high16 v23, 0x30000

    move/from16 v31, v22

    move-object/from16 v0, v27

    move-object/from16 v22, p2

    .line 57
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-wide v7, v3

    const/4 v6, 0x6

    move-object/from16 v5, p2

    move-object/from16 v3, v26

    move-object/from16 v4, v28

    move-object/from16 v2, v29

    move-object/from16 v1, v30

    .line 58
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt;->access$DiscountBanner(LC/I;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V

    move-object v12, v5

    .line 59
    invoke-interface {v12}, LY/m;->x()V

    .line 60
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getLocalization()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getOfferDetails()Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getLocalization()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getOfferDetailsWithIntroOffer()Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getLocalization()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getOfferDetailsWithMultipleIntroOffers()Ljava/lang/String;

    move-result-object v3

    .line 63
    invoke-static/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PackageExtensionsKt;->getOfferEligibility(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;

    move-result-object v4

    move/from16 v15, v31

    .line 64
    invoke-virtual {v0, v12, v15}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v0

    invoke-virtual {v0}, LU/o0;->c()LU0/Y0;

    move-result-object v0

    const/high16 v13, 0x6000000

    const/16 v14, 0x2c0

    move-wide v5, v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v0

    .line 65
    invoke-static/range {v1 .. v14}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    .line 66
    invoke-interface/range {p2 .. p2}, LY/m;->x()V

    .line 67
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LY/w;->T()V

    :cond_c
    return-void
.end method
