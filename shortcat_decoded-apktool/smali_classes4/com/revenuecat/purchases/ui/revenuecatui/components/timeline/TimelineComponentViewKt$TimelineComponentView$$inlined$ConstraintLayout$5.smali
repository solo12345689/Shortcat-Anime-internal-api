.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt;->TimelineComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
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
.field final synthetic $contentTracker:LY/C0;

.field final synthetic $onHelpersChanged:Lie/a;

.field final synthetic $scope:Ll1/l;

.field final synthetic $state$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

.field final synthetic $timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;


# direct methods
.method public constructor <init>(LY/C0;Ll1/l;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$contentTracker:LY/C0;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$scope:Ll1/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$onHelpersChanged:Lie/a;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$state$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v7, 0x2

    if-ne v2, v7, :cond_1

    .line 2
    invoke-interface {v4}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v4}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)"

    const v5, 0x478ef317

    invoke-static {v5, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$contentTracker:LY/C0;

    sget-object v2, LTd/L;->a:LTd/L;

    invoke-interface {v1, v2}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$scope:Ll1/l;

    invoke-virtual {v1}, Ll1/i;->h()I

    move-result v8

    .line 6
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$scope:Ll1/l;

    invoke-virtual {v1}, Ll1/l;->i()V

    .line 7
    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$scope:Ll1/l;

    const v1, -0x195c7f5e

    .line 8
    invoke-interface {v4, v1}, LY/m;->V(I)V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 9
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const v1, -0x11559350

    invoke-interface {v4, v1}, LY/m;->V(I)V

    .line 10
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    .line 11
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    .line 12
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1;

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;)V

    invoke-static {v1}, LY/U1;->d(Lie/a;)LY/h2;

    move-result-object v1

    .line 13
    invoke-interface {v4, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 14
    :cond_3
    move-object/from16 v17, v1

    check-cast v17, LY/h2;

    invoke-interface {v4}, LY/m;->O()V

    const v1, -0x11557098

    invoke-interface {v4, v1}, LY/m;->V(I)V

    .line 15
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_11

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

    .line 16
    invoke-virtual {v9}, Ll1/l;->m()Ll1/l$b;

    move-result-object v1

    invoke-virtual {v1}, Ll1/l$b;->a()Ll1/f;

    move-result-object v12

    invoke-virtual {v1}, Ll1/l$b;->b()Ll1/f;

    move-result-object v15

    invoke-virtual {v1}, Ll1/l$b;->c()Ll1/f;

    move-result-object v13

    invoke-virtual {v1}, Ll1/l$b;->d()Ll1/f;

    move-result-object v1

    const/4 v14, 0x3

    .line 17
    new-array v14, v14, [Ll1/x;

    aput-object v12, v14, v6

    aput-object v15, v14, v3

    aput-object v13, v14, v7

    invoke-static {v9, v14, v2, v7, v5}, Ll1/i;->d(Ll1/i;[Ll1/x;FILjava/lang/Object;)Ll1/i$b;

    move-result-object v14

    move/from16 p2, v6

    .line 18
    new-array v6, v3, [Ll1/x;

    aput-object v12, v6, p2

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getColumnGutter()I

    move-result v2

    int-to-float v2, v2

    .line 19
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    .line 20
    invoke-virtual {v9, v6, v2}, Ll1/i;->e([Ll1/x;F)Ll1/i$c;

    move-result-object v2

    .line 21
    invoke-static {v10}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/i$b;

    .line 22
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    new-array v3, v3, [Ll1/x;

    aput-object v1, v3, p2

    move-object/from16 v20, v2

    const/4 v2, 0x0

    invoke-static {v9, v3, v2, v7, v5}, Ll1/i;->d(Ll1/i;[Ll1/x;FILjava/lang/Object;)Ll1/i$b;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getItemSpacing()I

    move-result v3

    int-to-float v3, v3

    .line 25
    invoke-static {v3}, Li1/h;->n(F)F

    move-result v3

    .line 26
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const v5, -0x11552f0e

    .line 27
    invoke-interface {v4, v5}, LY/m;->V(I)V

    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    .line 28
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_4

    .line 29
    sget-object v5, LY/m;->a:LY/m$a;

    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_5

    .line 30
    :cond_4
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$1$1;

    invoke-direct {v7, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$1$1;-><init>(Ll1/i$b;)V

    .line 31
    invoke-interface {v4, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 32
    :cond_5
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, LY/m;->O()V

    invoke-virtual {v9, v3, v1, v7}, Ll1/l;->k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v3, p2

    .line 33
    invoke-static {v1, v4, v3}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    const v1, -0x11551743

    .line 34
    invoke-interface {v4, v1}, LY/m;->V(I)V

    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v4, v6}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {v4, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {v4, v13}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    .line 35
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_6

    .line 36
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_7

    :cond_6
    move-object v1, v12

    goto :goto_2

    :cond_7
    move-object v14, v6

    move-object v7, v12

    goto :goto_3

    .line 37
    :goto_2
    new-instance v12, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;

    move-object/from16 v16, v13

    iget-object v13, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    move-object v7, v1

    move-object v14, v6

    invoke-direct/range {v12 .. v17}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;Ll1/i$b;Ll1/f;Ll1/f;LY/h2;)V

    move-object/from16 v13, v16

    .line 38
    invoke-interface {v4, v12}, LY/m;->u(Ljava/lang/Object;)V

    move-object v3, v12

    .line 39
    :goto_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, LY/m;->O()V

    invoke-virtual {v9, v2, v7, v3}, Ll1/l;->k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 40
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    move-result-object v5

    const/4 v6, 0x0

    .line 41
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v5

    .line 42
    invoke-static {v4, v6}, LY/h;->a(LY/m;I)I

    move-result v6

    .line 43
    invoke-interface {v4}, LY/m;->r()LY/I;

    move-result-object v12

    .line 44
    invoke-static {v4, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 45
    sget-object v16, LK0/g;->M:LK0/g$a;

    move-object/from16 p2, v3

    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    move-result-object v3

    .line 46
    invoke-interface {v4}, LY/m;->j()LY/d;

    move-result-object v21

    if-nez v21, :cond_8

    invoke-static {}, LY/h;->d()V

    .line 47
    :cond_8
    invoke-interface {v4}, LY/m;->I()V

    .line 48
    invoke-interface {v4}, LY/m;->e()Z

    move-result v21

    if-eqz v21, :cond_9

    .line 49
    invoke-interface {v4, v3}, LY/m;->h(Lie/a;)V

    goto :goto_4

    .line 50
    :cond_9
    invoke-interface {v4}, LY/m;->s()V

    .line 51
    :goto_4
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v3

    .line 52
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v3, v5, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 53
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v3, v12, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 54
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 55
    invoke-interface {v3}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 56
    :cond_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 57
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 58
    :cond_b
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v3, v1, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 59
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 60
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getIcon()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    move-result-object v3

    .line 61
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$state$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 62
    invoke-virtual/range {p2 .. p2}, Ll0/e$a;->m()Ll0/e;

    move-result-object v5

    invoke-interface {v1, v2, v5}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v12, v3

    move-object v3, v1

    move-object v1, v12

    move-object/from16 v12, v20

    move-object/from16 v20, v10

    move-object v10, v2

    move-object v2, v4

    move-object/from16 v4, p1

    .line 63
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 64
    invoke-interface {v4}, LY/m;->x()V

    .line 65
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getTitle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    move-result-object v1

    .line 66
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$state$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    const v3, -0x11548ff7

    .line 67
    invoke-interface {v4, v3}, LY/m;->V(I)V

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-interface {v4, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v4, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-interface {v4, v12}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 68
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_c

    .line 69
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_d

    .line 70
    :cond_c
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$4$1;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-direct {v5, v3, v7, v14, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$4$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;Ll1/f;Ll1/i$b;Ll1/i$c;)V

    .line 71
    invoke-interface {v4, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 72
    :cond_d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, LY/m;->O()V

    invoke-virtual {v9, v10, v15, v5}, Ll1/l;->k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 73
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt;->TextComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 74
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getDescription()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    move-result-object v1

    const v2, -0x1154358c

    invoke-interface {v4, v2}, LY/m;->V(I)V

    if-nez v1, :cond_e

    goto :goto_5

    .line 75
    :cond_e
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$state$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    const v3, 0x8eaaea2

    .line 76
    invoke-interface {v4, v3}, LY/m;->V(I)V

    invoke-interface {v4, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-interface {v4, v5}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 77
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_f

    .line 78
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_10

    .line 79
    :cond_f
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$5$1$1;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-direct {v5, v15, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$5$1$1;-><init>(Ll1/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;)V

    .line 80
    invoke-interface {v4, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 81
    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, LY/m;->O()V

    invoke-virtual {v9, v10, v13, v5}, Ll1/l;->k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 82
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt;->TextComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 83
    sget-object v1, LTd/L;->a:LTd/L;

    .line 84
    :goto_5
    invoke-interface {v4}, LY/m;->O()V

    move-object/from16 v10, v20

    const/4 v7, 0x2

    goto/16 :goto_1

    :cond_11
    invoke-interface {v4}, LY/m;->O()V

    const v1, -0x1153de9e

    invoke-interface {v4, v1}, LY/m;->V(I)V

    .line 85
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f

    add-int/lit8 v6, v2, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

    .line 86
    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getItems()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v3

    if-ne v2, v10, :cond_12

    move v10, v3

    goto :goto_7

    :cond_12
    const/4 v10, 0x0

    .line 87
    :goto_7
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/f;

    .line 88
    invoke-static {v11, v6}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll1/f;

    .line 89
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getConnector()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    move-result-object v13

    const v14, -0x1153bf0d

    invoke-interface {v4, v14}, LY/m;->V(I)V

    if-nez v13, :cond_13

    move-object/from16 v20, v1

    move-object v13, v5

    move/from16 v28, v6

    move-object/from16 v16, v11

    const/4 v6, 0x0

    const/4 v15, 0x2

    move v11, v3

    const/4 v3, 0x0

    goto/16 :goto_12

    .line 90
    :cond_13
    invoke-virtual {v9}, Ll1/l;->l()Ll1/f;

    move-result-object v14

    .line 91
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getIcon()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    move-result-object v15

    invoke-virtual {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v15

    const v3, 0x8eb1605

    invoke-interface {v4, v3}, LY/m;->V(I)V

    invoke-interface {v4, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v3, v15

    .line 92
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v15

    if-nez v3, :cond_15

    .line 93
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v15, v3, :cond_14

    goto :goto_8

    :cond_14
    move-object/from16 v20, v1

    goto :goto_d

    .line 94
    :cond_15
    :goto_8
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getIcon()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v3

    instance-of v15, v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    if-eqz v15, :cond_16

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    goto :goto_9

    :cond_16
    move-object v3, v5

    :goto_9
    if-eqz v3, :cond_17

    .line 95
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    move-result v3

    int-to-float v3, v3

    .line 96
    invoke-static {v3}, Li1/h;->n(F)F

    move-result v3

    const/4 v15, 0x2

    int-to-float v5, v15

    div-float/2addr v3, v5

    .line 97
    invoke-static {v3}, Li1/h;->n(F)F

    move-result v3

    goto :goto_a

    :cond_17
    const/4 v3, 0x0

    int-to-float v5, v3

    .line 98
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v3

    .line 99
    :goto_a
    invoke-static/range {v17 .. v17}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt;->access$TimelineComponentView$lambda$13$lambda$1(LY/h2;)Li1/h;

    move-result-object v5

    if-eqz v5, :cond_19

    invoke-virtual {v5}, Li1/h;->t()F

    move-result v5

    float-to-int v5, v5

    .line 100
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getConnector()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    move-result-object v15

    if-eqz v15, :cond_18

    invoke-virtual {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;->getWidth()I

    move-result v15

    goto :goto_b

    :cond_18
    const/4 v15, 0x0

    :goto_b
    sub-int/2addr v5, v15

    int-to-float v5, v5

    .line 101
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v5

    move-object/from16 v20, v1

    const/4 v15, 0x2

    int-to-float v1, v15

    div-float/2addr v5, v1

    .line 102
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v1

    goto :goto_c

    :cond_19
    move-object/from16 v20, v1

    const/4 v1, 0x0

    int-to-float v5, v1

    .line 103
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v1

    .line 104
    :goto_c
    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    move-result-object v1

    invoke-static {v3}, Li1/h;->h(F)Li1/h;

    move-result-object v3

    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    .line 105
    invoke-interface {v4, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 106
    :goto_d
    check-cast v15, Lkotlin/Pair;

    invoke-interface {v4}, LY/m;->O()V

    .line 107
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$timelineState$inlined:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v6}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

    if-eqz v1, :cond_1a

    .line 108
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getIcon()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/SizeConstraintExtensionsKt;->dpOrNull(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)Li1/h;

    move-result-object v1

    if-eqz v1, :cond_1a

    .line 109
    invoke-virtual {v1}, Li1/h;->t()F

    move-result v1

    :goto_e
    const/4 v3, 0x2

    goto :goto_f

    :cond_1a
    const/4 v3, 0x0

    int-to-float v1, v3

    .line 110
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v1

    goto :goto_e

    :goto_f
    int-to-float v5, v3

    div-float/2addr v1, v5

    .line 111
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v1

    .line 112
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 113
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getConnector()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    move-result-object v5

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;->getMargin()LC/A;

    move-result-object v5

    if-nez v5, :cond_1c

    :cond_1b
    move/from16 v28, v6

    const/4 v5, 0x0

    goto :goto_10

    :cond_1c
    move/from16 v28, v6

    goto :goto_11

    :goto_10
    int-to-float v6, v5

    .line 114
    invoke-static {v6}, Li1/h;->n(F)F

    move-result v5

    .line 115
    invoke-static {v5}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v5

    :goto_11
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    move-result-object v3

    .line 116
    invoke-virtual {v15}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li1/h;

    invoke-virtual {v5}, Li1/h;->t()F

    move-result v5

    move-object/from16 v16, v11

    move-object/from16 v18, v13

    const/4 v6, 0x0

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-static {v3, v6, v5, v11, v13}, Landroidx/compose/foundation/layout/n;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/high16 v5, -0x40800000    # -1.0f

    .line 117
    invoke-static {v3, v5}, Ll0/p;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const v5, 0x8eb978c

    .line 118
    invoke-interface {v4, v5}, LY/m;->V(I)V

    invoke-interface {v4, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v4, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-interface {v4, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-interface {v4, v10}, LY/m;->a(Z)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-interface {v4, v12}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-interface {v4, v1}, LY/m;->b(F)Z

    move-result v13

    or-int/2addr v5, v13

    .line 119
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_1d

    .line 120
    sget-object v5, LY/m;->a:LY/m$a;

    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v13, v5, :cond_1e

    .line 121
    :cond_1d
    new-instance v21, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;

    move/from16 v27, v1

    move-object/from16 v24, v2

    move-object/from16 v23, v7

    move/from16 v25, v10

    move-object/from16 v26, v12

    move-object/from16 v22, v15

    invoke-direct/range {v21 .. v27}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;-><init>(Lkotlin/Pair;Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;Ll1/f;ZLl1/f;F)V

    move-object/from16 v13, v21

    .line 122
    invoke-interface {v4, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 123
    :cond_1e
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, LY/m;->O()V

    invoke-virtual {v9, v3, v14, v13}, Ll1/l;->k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 124
    invoke-virtual/range {v18 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;->getColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    move-result-object v2

    const/4 v13, 0x0

    const/4 v15, 0x2

    invoke-static {v1, v2, v13, v15, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/OverlayKt;->overlay$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 125
    invoke-static {v1, v4, v3}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 126
    sget-object v1, LTd/L;->a:LTd/L;

    .line 127
    :goto_12
    invoke-interface {v4}, LY/m;->O()V

    move v3, v11

    move-object v5, v13

    move-object/from16 v11, v16

    move-object/from16 v1, v20

    move/from16 v2, v28

    goto/16 :goto_6

    :cond_1f
    invoke-interface {v4}, LY/m;->O()V

    invoke-interface {v4}, LY/m;->O()V

    .line 128
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$scope:Ll1/l;

    invoke-virtual {v1}, Ll1/i;->h()I

    move-result v1

    if-eq v1, v8, :cond_20

    .line 129
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5;->$onHelpersChanged:Lie/a;

    const/4 v2, 0x6

    invoke-static {v1, v4, v2}, LY/b0;->g(Lie/a;LY/m;I)V

    :cond_20
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {}, LY/w;->T()V

    :cond_21
    return-void
.end method
