.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt;->ImageComponentView_Preview_Margin_Padding(LY/m;I)V
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
.field final synthetic $themeImageUrls:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$1;->$themeImageUrls:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 25

    move-object/from16 v3, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 2
    invoke-interface {v3}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v3}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Margin_Padding.<anonymous> (ImageComponentView.kt:313)"

    const v4, 0x519c5f31

    invoke-static {v4, v0, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/16 v1, 0xc8

    int-to-float v1, v1

    .line 6
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v1

    .line 7
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    .line 8
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v0}, Ls0/r0$a;->e()J

    move-result-wide v5

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v13, p0

    .line 9
    iget-object v1, v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$1;->$themeImageUrls:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 10
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v2}, Ll0/e$a;->o()Ll0/e;

    move-result-object v2

    const/4 v14, 0x0

    .line 11
    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v2

    .line 12
    invoke-static {v3, v14}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 13
    invoke-interface {v3}, LY/m;->r()LY/I;

    move-result-object v5

    .line 14
    invoke-static {v3, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 15
    sget-object v6, LK0/g;->M:LK0/g$a;

    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 16
    invoke-interface {v3}, LY/m;->j()LY/d;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 17
    :cond_3
    invoke-interface {v3}, LY/m;->I()V

    .line 18
    invoke-interface {v3}, LY/m;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 19
    invoke-interface {v3, v7}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 20
    :cond_4
    invoke-interface {v3}, LY/m;->s()V

    .line 21
    :goto_1
    invoke-static {v3}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 22
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v2, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v5, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 25
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

    .line 26
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    :cond_6
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    move-object v0, v1

    .line 30
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    const/16 v4, 0x190

    const/4 v15, 0x0

    invoke-direct {v2, v4, v15}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    invoke-direct {v5, v4, v15}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2, v5}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    const/16 v2, 0x14

    int-to-float v2, v2

    .line 31
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v4

    .line 32
    invoke-static {v4}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v6

    .line 33
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    .line 34
    invoke-static {v2}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v7

    .line 35
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;->FIT:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 36
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;

    .line 37
    new-instance v16, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;

    const-wide/high16 v21, 0x4034000000000000L    # 20.0

    const-wide/high16 v23, 0x4034000000000000L    # 20.0

    const-wide/high16 v17, 0x4034000000000000L    # 20.0

    const-wide/high16 v19, 0x4034000000000000L    # 20.0

    invoke-direct/range {v16 .. v24}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;-><init>(DDDD)V

    move-object/from16 v4, v16

    .line 38
    invoke-direct {v3, v4}, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V

    const v11, 0x30d80db0

    const/16 v12, 0x130

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p1

    .line 39
    invoke-static/range {v0 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt;->access$previewImageComponentStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;ZLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;

    move-result-object v0

    move-object v3, v10

    const/4 v1, 0x1

    .line 40
    invoke-static {v15, v3, v14, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewEmptyState(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v2, 0x0

    .line 41
    invoke-static/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt;->ImageComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 42
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 43
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
