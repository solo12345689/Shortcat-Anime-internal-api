.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->invoke(LY/m;I)V
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
.field final synthetic $footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

.field final synthetic $style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lkotlin/jvm/functions/Function2;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$onClick:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v5}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v5}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous>.<anonymous> (LoadedPaywallComponents.kt:83)"

    const v4, 0x7035d7ed

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$onClick:Lkotlin/jvm/functions/Function2;

    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;->$footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 5
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    sget-object v4, LC/b;->a:LC/b;

    invoke-virtual {v4}, LC/b;->h()LC/b$m;

    move-result-object v4

    .line 7
    sget-object v6, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v6}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v6

    const/4 v7, 0x0

    .line 8
    invoke-static {v4, v6, v5, v7}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v4

    .line 9
    invoke-static {v5, v7}, LY/h;->a(LY/m;I)I

    move-result v6

    .line 10
    invoke-interface {v5}, LY/m;->r()LY/I;

    move-result-object v10

    .line 11
    invoke-static {v5, v9}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    .line 12
    sget-object v12, LK0/g;->M:LK0/g$a;

    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    move-result-object v13

    .line 13
    invoke-interface {v5}, LY/m;->j()LY/d;

    move-result-object v14

    if-nez v14, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_3
    invoke-interface {v5}, LY/m;->I()V

    .line 15
    invoke-interface {v5}, LY/m;->e()Z

    move-result v14

    if-eqz v14, :cond_4

    .line 16
    invoke-interface {v5, v13}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {v5}, LY/m;->s()V

    .line 18
    :goto_1
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v13

    .line 19
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v4, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v10, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 22
    invoke-interface {v13}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_5

    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 23
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v11, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v14, LC/j;->a:LC/j;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    .line 27
    invoke-static {v9, v10, v11, v12}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v15

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    .line 28
    invoke-static/range {v14 .. v19}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v20

    .line 29
    invoke-static {v7, v5, v7, v11}, Landroidx/compose/foundation/m;->c(ILY/m;II)Landroidx/compose/foundation/o;

    move-result-object v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/m;->f(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLz/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 30
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;->ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    const v1, 0x6112b210

    invoke-interface {v5, v1}, LY/m;->V(I)V

    if-nez v8, :cond_7

    goto :goto_2

    .line 31
    :cond_7
    invoke-static {v9, v10, v11, v12}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x0

    move-object v1, v8

    .line 32
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;->ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 33
    :goto_2
    invoke-interface/range {p1 .. p1}, LY/m;->O()V

    .line 34
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 35
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LY/w;->T()V

    :cond_8
    return-void
.end method
