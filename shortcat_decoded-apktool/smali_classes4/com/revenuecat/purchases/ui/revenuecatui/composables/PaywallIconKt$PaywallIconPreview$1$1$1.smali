.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;->invoke(LE/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LE/o;",
        "",
        "it",
        "LTd/L;",
        "invoke",
        "(LE/o;ILY/m;I)V",
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
.field final synthetic $icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;


# direct methods
.method constructor <init>([Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;->$icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LE/o;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LY/m;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;->invoke(LE/o;ILY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LE/o;ILY/m;I)V
    .locals 19

    move/from16 v0, p2

    move-object/from16 v4, p3

    const-string v1, "$this$items"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_1

    invoke-interface {v4, v0}, LY/m;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit16 v2, v1, 0x91

    const/16 v3, 0x90

    if-ne v2, v3, :cond_3

    .line 2
    invoke-interface {v4}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v4}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview.<anonymous>.<anonymous>.<anonymous> (PaywallIcon.kt:155)"

    const v5, -0x131710a0

    invoke-static {v5, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v1}, Ls0/r0$a;->k()J

    move-result-wide v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    const/4 v2, 0x1

    int-to-float v2, v2

    .line 5
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v13

    .line 6
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    move-result-wide v14

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Lx/e;->g(Landroidx/compose/ui/e;FJLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move-object/from16 v7, p0

    iget-object v3, v7, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;->$icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    .line 7
    sget-object v5, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v5}, Ll0/e$a;->o()Ll0/e;

    move-result-object v5

    const/4 v6, 0x0

    .line 8
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v5

    .line 9
    invoke-static {v4, v6}, LY/h;->a(LY/m;I)I

    move-result v6

    .line 10
    invoke-interface {v4}, LY/m;->r()LY/I;

    move-result-object v8

    .line 11
    invoke-static {v4, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 12
    sget-object v9, LK0/g;->M:LK0/g$a;

    invoke-virtual {v9}, LK0/g$a;->a()Lie/a;

    move-result-object v10

    .line 13
    invoke-interface {v4}, LY/m;->j()LY/d;

    move-result-object v11

    if-nez v11, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_5
    invoke-interface {v4}, LY/m;->I()V

    .line 15
    invoke-interface {v4}, LY/m;->e()Z

    move-result v11

    if-eqz v11, :cond_6

    .line 16
    invoke-interface {v4, v10}, LY/m;->h(Lie/a;)V

    goto :goto_3

    .line 17
    :cond_6
    invoke-interface {v4}, LY/m;->s()V

    .line 18
    :goto_3
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v10

    .line 19
    invoke-virtual {v9}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v5, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v9}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v8, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v9}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .line 22
    invoke-interface {v10}, LY/m;->e()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 23
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_8
    invoke-virtual {v9}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v2, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 27
    aget-object v0, v3, v0

    invoke-virtual {v1}, Ls0/r0$a;->a()J

    move-result-wide v2

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v1, 0x0

    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt;->PaywallIcon-FNF3uiM(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V

    .line 28
    invoke-interface/range {p3 .. p3}, LY/m;->x()V

    .line 29
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
