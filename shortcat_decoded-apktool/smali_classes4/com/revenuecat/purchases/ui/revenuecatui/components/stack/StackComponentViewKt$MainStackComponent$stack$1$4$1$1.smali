.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1;->invoke(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/q;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LC/i;",
        "",
        "index",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
        "child",
        "LTd/L;",
        "invoke",
        "(LC/i;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V",
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

.field final synthetic $safeDrawingInsets:LC/P;

.field final synthetic $stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;LC/P;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lkotlin/jvm/functions/Function2;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;",
            "LC/P;",
            "F)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$safeDrawingInsets:LC/P;

    .line 8
    .line 9
    iput p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$contentAlpha:F

    .line 10
    .line 11
    const/4 p1, 0x5

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v1, p1

    check-cast v1, LC/i;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v3, p3

    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    move-object v4, p4

    check-cast v4, LY/m;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->invoke(LC/i;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/i;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V
    .locals 11

    move-object v4, p4

    move/from16 v3, p5

    const-string v5, "$this$items"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "child"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v3, 0x6

    const/4 v6, 0x4

    if-nez v5, :cond_1

    invoke-interface {p4, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-interface {p4, p2}, LY/m;->c(I)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v3, v3, 0x180

    if-nez v3, :cond_5

    invoke-interface {p4, p3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v5, v3

    :cond_5
    and-int/lit16 v3, v5, 0x493

    const/16 v7, 0x492

    if-ne v3, v7, :cond_7

    .line 2
    invoke-interface {p4}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    .line 3
    :cond_6
    invoke-interface {p4}, LY/m;->K()V

    return-void

    .line 4
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v7, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:541)"

    const v8, 0x58163126

    invoke-static {v8, v5, v3, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_8
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 6
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    .line 7
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 8
    invoke-interface {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v7

    invoke-virtual {v7}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v7

    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v8, -0x655bddea

    invoke-interface {p4, v8}, LY/m;->V(I)V

    and-int/lit8 v8, v5, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v8, v6, :cond_9

    move v6, v10

    goto :goto_5

    :cond_9
    move v6, v9

    .line 9
    :goto_5
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_a

    .line 10
    sget-object v6, LY/m;->a:LY/m$a;

    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_b

    .line 11
    :cond_a
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1$1$1;

    invoke-direct {v8, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1$1$1;-><init>(LC/i;)V

    .line 12
    invoke-interface {p4, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 13
    :cond_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {p4}, LY/m;->O()V

    invoke-static {v3, v7, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 14
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getApplyTopWindowInsets()Z

    move-result v3

    if-eqz v3, :cond_c

    if-nez p2, :cond_c

    .line 15
    invoke-static {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->access$getShouldIgnoreTopWindowInsets(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)Z

    move-result v3

    if-nez v3, :cond_c

    move v9, v10

    :cond_c
    const v3, -0x655b9a97

    invoke-interface {p4, v3}, LY/m;->V(I)V

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$safeDrawingInsets:LC/P;

    invoke-interface {p4, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    .line 16
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$safeDrawingInsets:LC/P;

    .line 17
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_d

    .line 18
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_e

    .line 19
    :cond_d
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1$2$1;

    invoke-direct {v7, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1$2$1;-><init>(LC/P;)V

    .line 20
    invoke-interface {p4, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 21
    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {p4}, LY/m;->O()V

    .line 22
    invoke-static {v0, v9, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 23
    iget v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$4$1$1;->$contentAlpha:F

    invoke-static {v0, v3}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v5, v0, 0xe

    const/4 v6, 0x0

    move-object v0, p3

    .line 24
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;->ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LY/w;->T()V

    :cond_f
    return-void
.end method
