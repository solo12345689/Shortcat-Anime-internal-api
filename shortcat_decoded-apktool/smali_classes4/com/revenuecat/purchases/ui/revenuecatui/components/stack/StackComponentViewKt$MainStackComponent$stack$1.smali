.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->MainStackComponent(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;FLandroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;ZLie/o;LY/m;II)V
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
        "Landroidx/compose/ui/e;",
        "rootModifier",
        "LTd/L;",
        "invoke",
        "(Landroidx/compose/ui/e;LY/m;I)V",
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
.field final synthetic $clickHandler:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $contentAlpha:F

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $safeDrawingInsets:LC/P;

.field final synthetic $stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;LC/P;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;",
            "Landroidx/compose/ui/e;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lkotlin/jvm/functions/Function2;",
            "LC/P;",
            "F)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$modifier:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    .line 10
    .line 11
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    .line 12
    .line 13
    const/4 p1, 0x3

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->invoke(Landroidx/compose/ui/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/e;LY/m;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    const-string v2, "rootModifier"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 2
    invoke-interface {v6}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v6}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous> (StackComponentView.kt:491)"

    const v5, -0x22fb86ed

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getScrollOrientation()Lz/q;

    move-result-object v2

    const v3, -0x391c1841

    invoke-interface {v6, v3}, LY/m;->V(I)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_3

    :cond_5
    invoke-static {v9, v6, v9, v8}, Landroidx/compose/foundation/m;->c(ILY/m;II)Landroidx/compose/foundation/o;

    move-result-object v2

    :goto_3
    invoke-interface {v6}, LY/m;->O()V

    .line 5
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getChildren()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    const v2, 0x159d747e

    invoke-interface {v6, v2}, LY/m;->V(I)V

    .line 6
    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$modifier:Landroidx/compose/ui/e;

    .line 7
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 9
    invoke-static {v1, v6, v9}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 10
    invoke-interface {v6}, LY/m;->O()V

    goto/16 :goto_8

    :cond_6
    const v3, 0x15a21508

    .line 11
    invoke-interface {v6, v3}, LY/m;->V(I)V

    .line 12
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getDimension()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;

    move-result-object v3

    .line 13
    instance-of v4, v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    if-eqz v4, :cond_9

    const v4, -0x391bcda2

    invoke-interface {v6, v4}, LY/m;->V(I)V

    .line 14
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v4

    .line 15
    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    .line 16
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSpacing-D9Ej5fM()F

    move-result v5

    .line 17
    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$modifier:Landroidx/compose/ui/e;

    .line 18
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v8

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;

    move-result-object v9

    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;)Ll0/e$c;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 19
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getScrollOrientation()Lz/q;

    move-result-object v8

    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$1;

    invoke-static {v7, v2, v8, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 20
    invoke-interface {v2, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x391b8ae9

    invoke-interface {v6, v2}, LY/m;->V(I)V

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-interface {v6, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v7}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    invoke-interface {v6, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    invoke-interface {v6, v7}, LY/m;->b(F)Z

    move-result v7

    or-int/2addr v2, v7

    .line 21
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    iget v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    .line 22
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_7

    .line 23
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_8

    .line 24
    :cond_7
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1;

    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;LC/P;F)V

    .line 25
    invoke-interface {v6, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v6}, LY/m;->O()V

    move-object v2, v3

    move v3, v5

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    .line 27
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V

    invoke-interface {v6}, LY/m;->O()V

    goto/16 :goto_7

    .line 28
    :cond_9
    instance-of v4, v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;

    if-eqz v4, :cond_c

    const v4, -0x391b2332

    invoke-interface {v6, v4}, LY/m;->V(I)V

    .line 29
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v4

    .line 30
    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;

    .line 31
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSpacing-D9Ej5fM()F

    move-result v5

    .line 32
    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$modifier:Landroidx/compose/ui/e;

    .line 33
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v8

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;

    move-result-object v9

    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)Ll0/e$b;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 34
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getScrollOrientation()Lz/q;

    move-result-object v8

    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$3;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$3;

    invoke-static {v7, v2, v8, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 35
    invoke-interface {v2, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x391ae079

    invoke-interface {v6, v2}, LY/m;->V(I)V

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-interface {v6, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v7}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    invoke-interface {v6, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    iget v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    invoke-interface {v6, v7}, LY/m;->b(F)Z

    move-result v7

    or-int/2addr v2, v7

    .line 36
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    iget v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    .line 37
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_a

    .line 38
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_b

    .line 39
    :cond_a
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1;

    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;LC/P;F)V

    .line 40
    invoke-interface {v6, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 41
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v6}, LY/m;->O()V

    move-object v2, v3

    move v3, v5

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    .line 42
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackKt;->VerticalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V

    invoke-interface {v6}, LY/m;->O()V

    goto/16 :goto_7

    .line 43
    :cond_c
    instance-of v4, v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;

    if-eqz v4, :cond_15

    const v4, -0x391a4a01

    invoke-interface {v6, v4}, LY/m;->V(I)V

    .line 44
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$modifier:Landroidx/compose/ui/e;

    .line 45
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v5

    .line 46
    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    move-result-object v7

    invoke-static {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toHorizontalAlignmentOrNull(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$b;

    move-result-object v7

    .line 47
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    move-result-object v10

    invoke-static {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toVerticalAlignmentOrNull(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$c;

    move-result-object v10

    .line 48
    invoke-static {v4, v5, v7, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 49
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getScrollOrientation()Lz/q;

    move-result-object v5

    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$5;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$5;

    invoke-static {v4, v2, v5, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 50
    invoke-interface {v2, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 51
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    move-result-object v2

    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e;

    move-result-object v2

    .line 52
    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    move-object v4, v3

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$safeDrawingInsets:LC/P;

    iget v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1;->$contentAlpha:F

    .line 53
    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v2

    .line 54
    invoke-static {v6, v9}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 55
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v7

    .line 56
    invoke-static {v6, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 57
    sget-object v13, LK0/g;->M:LK0/g$a;

    invoke-virtual {v13}, LK0/g$a;->a()Lie/a;

    move-result-object v14

    .line 58
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v15

    if-nez v15, :cond_d

    invoke-static {}, LY/h;->d()V

    .line 59
    :cond_d
    invoke-interface {v6}, LY/m;->I()V

    .line 60
    invoke-interface {v6}, LY/m;->e()Z

    move-result v15

    if-eqz v15, :cond_e

    .line 61
    invoke-interface {v6, v14}, LY/m;->h(Lie/a;)V

    goto :goto_4

    .line 62
    :cond_e
    invoke-interface {v6}, LY/m;->s()V

    .line 63
    :goto_4
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v14

    .line 64
    invoke-virtual {v13}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v2, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 65
    invoke-virtual {v13}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v14, v7, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 66
    invoke-virtual {v13}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 67
    invoke-interface {v14}, LY/m;->e()Z

    move-result v7

    if-nez v7, :cond_f

    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    .line 68
    :cond_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v14, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 69
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 70
    :cond_10
    invoke-virtual {v13}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v14, v1, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 71
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const v1, 0x6b2a9c79

    .line 72
    invoke-interface {v6, v1}, LY/m;->V(I)V

    invoke-virtual {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getChildren()Ljava/util/List;

    move-result-object v1

    .line 73
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 74
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 75
    invoke-virtual {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getApplyTopWindowInsets()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->access$getShouldIgnoreTopWindowInsets(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)Z

    move-result v5

    if-nez v5, :cond_11

    move v5, v8

    goto :goto_6

    :cond_11
    move v5, v9

    :goto_6
    const v7, 0xb8dd02a

    invoke-interface {v6, v7}, LY/m;->V(I)V

    invoke-interface {v6, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    .line 76
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_12

    .line 77
    sget-object v7, LY/m;->a:LY/m$a;

    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v14, v7, :cond_13

    .line 78
    :cond_12
    new-instance v14, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$6$1$1$1;

    invoke-direct {v14, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$6$1$1$1;-><init>(LC/P;)V

    .line 79
    invoke-interface {v6, v14}, LY/m;->u(Ljava/lang/Object;)V

    .line 80
    :cond_13
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-interface {v6}, LY/m;->O()V

    invoke-static {v2, v5, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 81
    invoke-static {v2, v12}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v4

    move-object v4, v2

    move-object v2, v5

    move-object/from16 v5, p2

    .line 82
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;->ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    move-object v4, v2

    move-object v6, v5

    goto :goto_5

    .line 83
    :cond_14
    invoke-interface {v6}, LY/m;->O()V

    .line 84
    invoke-interface {v6}, LY/m;->x()V

    .line 85
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_7

    :cond_15
    const v1, 0x15e4ea20

    .line 86
    invoke-interface {v6, v1}, LY/m;->V(I)V

    invoke-interface {v6}, LY/m;->O()V

    .line 87
    :goto_7
    invoke-interface {v6}, LY/m;->O()V

    :goto_8
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {}, LY/w;->T()V

    :cond_16
    return-void
.end method
