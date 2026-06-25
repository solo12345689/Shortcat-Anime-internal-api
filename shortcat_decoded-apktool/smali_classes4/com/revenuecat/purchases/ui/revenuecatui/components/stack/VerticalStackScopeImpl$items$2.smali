.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->items(Ljava/util/List;Lie/q;)V
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
        "LC/i;",
        "LTd/L;",
        "invoke",
        "(LC/i;LY/m;I)V",
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
.field final synthetic $itemContent:Lie/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/q;"
        }
    .end annotation
.end field

.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;


# direct methods
.method constructor <init>(Ljava/util/List;Lie/q;Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            ">;",
            "Lie/q;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->$items:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->$itemContent:Lie/q;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/i;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->invoke(LC/i;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/i;LY/m;I)V
    .locals 14

    move-object/from16 v4, p2

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v6, 0x2

    if-nez v0, :cond_1

    invoke-interface {v4, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    or-int v0, p3, v0

    move v7, v0

    goto :goto_1

    :cond_1
    move/from16 v7, p3

    :goto_1
    and-int/lit8 v0, v7, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    .line 2
    invoke-interface {v4}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v4}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStackScopeImpl.items.<anonymous> (VerticalStack.kt:96)"

    const v2, 0x20e73697

    invoke-static {v2, v7, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->$items:Ljava/util/List;

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->$itemContent:Lie/q;

    iget-object v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl$items$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;

    .line 5
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    move v1, v11

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v12, v1, 0x1

    if-gez v1, :cond_5

    invoke-static {}, LUd/u;->w()V

    :cond_5
    move-object v3, v2

    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 6
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x1

    sub-int/2addr v2, v5

    if-ne v1, v2, :cond_6

    move v13, v5

    goto :goto_4

    :cond_6
    move v13, v11

    .line 7
    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-int/lit8 v1, v7, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lie/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, -0x6f4c7f7b

    invoke-interface {v4, v1}, LY/m;->V(I)V

    .line 8
    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->access$getDistribution$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;)Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    move-result-object v1

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->getUsesAllAvailableSpace(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-nez v13, :cond_8

    .line 9
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->access$getSpacing$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;)F

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v6, v5}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v4, v11}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 10
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->getShouldApplyFillSpacers()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 11
    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->access$getFillSpaceSpacer$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;)Lie/o;

    move-result-object v1

    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;->access$getDistribution$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;)Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    move-result-object v2

    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;->SPACE_AROUND:Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    if-ne v2, v3, :cond_7

    const/high16 v2, 0x40000000    # 2.0f

    goto :goto_5

    :cond_7
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v4, v3}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-interface {v4}, LY/m;->O()V

    move v1, v12

    goto :goto_3

    .line 12
    :cond_9
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LY/w;->T()V

    :cond_a
    return-void
.end method
