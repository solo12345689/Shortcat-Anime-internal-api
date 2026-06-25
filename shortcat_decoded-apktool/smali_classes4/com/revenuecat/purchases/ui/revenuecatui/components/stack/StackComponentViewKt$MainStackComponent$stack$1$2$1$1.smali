.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1;->invoke(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScope;)V
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
        "LC/I;",
        "",
        "<anonymous parameter 0>",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
        "child",
        "LTd/L;",
        "invoke",
        "(LC/I;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V",
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
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$safeDrawingInsets:LC/P;

    .line 8
    .line 9
    iput p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$contentAlpha:F

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

    check-cast v1, LC/I;

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

    invoke-virtual/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->invoke(LC/I;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/I;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V
    .locals 10

    const-string p2, "$this$items"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "child"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p5, 0x6

    const/4 v0, 0x4

    if-nez p2, :cond_1

    invoke-interface {p4, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p5

    goto :goto_1

    :cond_1
    move p2, p5

    :goto_1
    and-int/lit16 p5, p5, 0x180

    if-nez p5, :cond_3

    invoke-interface {p4, p3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_2

    const/16 p5, 0x100

    goto :goto_2

    :cond_2
    const/16 p5, 0x80

    :goto_2
    or-int/2addr p2, p5

    :cond_3
    and-int/lit16 p5, p2, 0x483

    const/16 v1, 0x482

    if-ne p5, v1, :cond_5

    .line 2
    invoke-interface {p4}, LY/m;->i()Z

    move-result p5

    if-nez p5, :cond_4

    goto :goto_3

    .line 3
    :cond_4
    invoke-interface {p4}, LY/m;->K()V

    return-void

    .line 4
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    move-result p5

    if-eqz p5, :cond_6

    const/4 p5, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:515)"

    const v2, 0x500b5fa3

    invoke-static {v2, p2, p5, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_6
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 6
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$clickHandler:Lkotlin/jvm/functions/Function2;

    .line 7
    sget-object p5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 8
    invoke-interface {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v1

    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v2, -0x655c876a

    invoke-interface {p4, v2}, LY/m;->V(I)V

    and-int/lit8 v2, p2, 0xe

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-ne v2, v0, :cond_7

    move v0, v6

    goto :goto_4

    :cond_7
    move v0, v3

    .line 9
    :goto_4
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_8

    .line 10
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_9

    .line 11
    :cond_8
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1$1$1;

    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1$1$1;-><init>(LC/I;)V

    .line 12
    invoke-interface {p4, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 13
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {p4}, LY/m;->O()V

    invoke-static {p5, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p1

    .line 14
    iget-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$stackState:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {p5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getApplyTopWindowInsets()Z

    move-result p5

    if-eqz p5, :cond_a

    invoke-static {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->access$getShouldIgnoreTopWindowInsets(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)Z

    move-result p5

    if-nez p5, :cond_a

    move v3, v6

    :cond_a
    const p5, -0x655c7577

    invoke-interface {p4, p5}, LY/m;->V(I)V

    iget-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$safeDrawingInsets:LC/P;

    invoke-interface {p4, p5}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p5

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$safeDrawingInsets:LC/P;

    .line 15
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez p5, :cond_b

    .line 16
    sget-object p5, LY/m;->a:LY/m$a;

    invoke-virtual {p5}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne v1, p5, :cond_c

    .line 17
    :cond_b
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1$2$1;

    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1$2$1;-><init>(LC/P;)V

    .line 18
    invoke-interface {p4, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 19
    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p4}, LY/m;->O()V

    invoke-static {p1, v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p1

    .line 20
    iget p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$MainStackComponent$stack$1$2$1$1;->$contentAlpha:F

    invoke-static {p1, p5}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    shr-int/lit8 p1, p2, 0x6

    and-int/lit8 v8, p1, 0xe

    const/4 v9, 0x0

    move-object v3, p3

    move-object v7, p4

    .line 21
    invoke-static/range {v3 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;->ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, LY/w;->T()V

    :cond_d
    return-void
.end method
