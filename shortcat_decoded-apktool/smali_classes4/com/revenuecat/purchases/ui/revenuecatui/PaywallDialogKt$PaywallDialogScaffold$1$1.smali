.class final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->invoke(LY/m;I)V
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
        "LC/A;",
        "paddingValues",
        "LTd/L;",
        "invoke",
        "(LC/A;LY/m;I)V",
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
.field final synthetic $content:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $dialogBottomPadding:F


# direct methods
.method constructor <init>(FLkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function2;",
            ")V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;->$dialogBottomPadding:F

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;->$content:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/A;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;->invoke(LC/A;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/A;LY/m;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "paddingValues"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_3

    .line 2
    invoke-interface {v2}, LY/m;->i()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v2}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous>.<anonymous> (PaywallDialog.kt:176)"

    const v7, 0x2f1cb2cb

    invoke-static {v7, v3, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {v1}, LC/A;->c()F

    move-result v5

    const/4 v6, 0x0

    int-to-float v7, v6

    .line 5
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v8

    .line 6
    invoke-static {v5, v8}, Li1/h;->q(FF)Z

    move-result v5

    const/4 v8, 0x1

    if-eqz v5, :cond_5

    .line 7
    invoke-interface {v1}, LC/A;->d()F

    move-result v5

    .line 8
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v9

    .line 9
    invoke-static {v5, v9}, Li1/h;->q(FF)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v6

    .line 10
    :goto_3
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 11
    invoke-static {v9, v10, v8, v11}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    .line 12
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x22

    if-gt v10, v11, :cond_6

    move v10, v8

    goto :goto_4

    :cond_6
    move v10, v6

    :goto_4
    const v11, 0xbb58a9f

    invoke-interface {v2, v11}, LY/m;->V(I)V

    and-int/lit8 v3, v3, 0xe

    if-ne v3, v4, :cond_7

    goto :goto_5

    :cond_7
    move v8, v6

    .line 13
    :goto_5
    invoke-interface {v2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v8, :cond_8

    .line 14
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_9

    .line 15
    :cond_8
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1$1$1;

    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1$1$1;-><init>(LC/A;)V

    .line 16
    invoke-interface {v2, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2}, LY/m;->O()V

    .line 18
    invoke-static {v9, v10, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v11

    if-eqz v5, :cond_a

    .line 19
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;->$dialogBottomPadding:F

    :goto_6
    move v15, v1

    goto :goto_7

    .line 20
    :cond_a
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v1

    goto :goto_6

    :goto_7
    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 21
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 22
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;->$content:Lkotlin/jvm/functions/Function2;

    .line 23
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v4}, Ll0/e$a;->o()Ll0/e;

    move-result-object v4

    .line 24
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v4

    .line 25
    invoke-static {v2, v6}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 26
    invoke-interface {v2}, LY/m;->r()LY/I;

    move-result-object v7

    .line 27
    invoke-static {v2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 28
    sget-object v8, LK0/g;->M:LK0/g$a;

    invoke-virtual {v8}, LK0/g$a;->a()Lie/a;

    move-result-object v9

    .line 29
    invoke-interface {v2}, LY/m;->j()LY/d;

    move-result-object v10

    if-nez v10, :cond_b

    invoke-static {}, LY/h;->d()V

    .line 30
    :cond_b
    invoke-interface {v2}, LY/m;->I()V

    .line 31
    invoke-interface {v2}, LY/m;->e()Z

    move-result v10

    if-eqz v10, :cond_c

    .line 32
    invoke-interface {v2, v9}, LY/m;->h(Lie/a;)V

    goto :goto_8

    .line 33
    :cond_c
    invoke-interface {v2}, LY/m;->s()V

    .line 34
    :goto_8
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v9

    .line 35
    invoke-virtual {v8}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v4, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 36
    invoke-virtual {v8}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v7, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    invoke-virtual {v8}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 38
    invoke-interface {v9}, LY/m;->e()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    .line 39
    :cond_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 41
    :cond_e
    invoke-virtual {v8}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v1, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 42
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 43
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-interface {v2}, LY/m;->x()V

    .line 45
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LY/w;->T()V

    :cond_f
    return-void
.end method
