.class final Landroidx/compose/ui/platform/y$i;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/y;->D0(Landroidx/compose/ui/platform/k1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/k1;

.field final synthetic b:Landroidx/compose/ui/platform/y;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/k1;Landroidx/compose/ui/platform/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y$i;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/k1;->a()LR0/j;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/k1;->e()LR0/j;

    move-result-object v1

    .line 4
    iget-object v2, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/k1;->b()Ljava/lang/Float;

    move-result-object v2

    .line 5
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/k1;->c()Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v0}, LR0/j;->c()Lie/a;

    move-result-object v5

    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v5, v2

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v1}, LR0/j;->c()Lie/a;

    move-result-object v2

    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    cmpg-float v3, v5, v4

    if-nez v3, :cond_2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_2

    goto/16 :goto_4

    .line 8
    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    .line 9
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/k1;->d()I

    move-result v3

    .line 10
    invoke-static {v2, v3}, Landroidx/compose/ui/platform/y;->J(Landroidx/compose/ui/platform/y;I)I

    move-result v2

    .line 11
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-static {v3}, Landroidx/compose/ui/platform/y;->v(Landroidx/compose/ui/platform/y;)Lt/o;

    move-result-object v3

    iget-object v4, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-static {v4}, Landroidx/compose/ui/platform/y;->t(Landroidx/compose/ui/platform/y;)I

    move-result v4

    invoke-virtual {v3, v4}, Lt/o;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR0/u;

    if-eqz v3, :cond_3

    iget-object v4, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    .line 12
    :try_start_0
    invoke-static {v4}, Landroidx/compose/ui/platform/y;->w(Landroidx/compose/ui/platform/y;)LL1/B;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/y;->r(Landroidx/compose/ui/platform/y;LR0/u;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v5, v3}, LL1/B;->w0(Landroid/graphics/Rect;)V

    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 13
    :catch_0
    sget-object v3, LTd/L;->a:LTd/L;

    .line 14
    :cond_3
    :goto_2
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-static {v3}, Landroidx/compose/ui/platform/y;->v(Landroidx/compose/ui/platform/y;)Lt/o;

    move-result-object v3

    iget-object v4, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-static {v4}, Landroidx/compose/ui/platform/y;->z(Landroidx/compose/ui/platform/y;)I

    move-result v4

    invoke-virtual {v3, v4}, Lt/o;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR0/u;

    if-eqz v3, :cond_4

    iget-object v4, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    .line 15
    :try_start_1
    invoke-static {v4}, Landroidx/compose/ui/platform/y;->x(Landroidx/compose/ui/platform/y;)LL1/B;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/y;->r(Landroidx/compose/ui/platform/y;LR0/u;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v5, v3}, LL1/B;->w0(Landroid/graphics/Rect;)V

    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 16
    :catch_1
    sget-object v3, LTd/L;->a:LTd/L;

    .line 17
    :cond_4
    :goto_3
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/y;->l0()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 18
    iget-object v3, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    invoke-static {v3}, Landroidx/compose/ui/platform/y;->v(Landroidx/compose/ui/platform/y;)Lt/o;

    move-result-object v3

    invoke-virtual {v3, v2}, Lt/o;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR0/u;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, LR0/u;->b()LR0/s;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, LR0/s;->s()LK0/J;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v4, p0, Landroidx/compose/ui/platform/y$i;->b:Landroidx/compose/ui/platform/y;

    if-eqz v0, :cond_5

    .line 19
    invoke-static {v4}, Landroidx/compose/ui/platform/y;->B(Landroidx/compose/ui/platform/y;)Lt/F;

    move-result-object v5

    invoke-virtual {v5, v2, v0}, Lt/F;->s(ILjava/lang/Object;)V

    :cond_5
    if-eqz v1, :cond_6

    .line 20
    invoke-static {v4}, Landroidx/compose/ui/platform/y;->C(Landroidx/compose/ui/platform/y;)Lt/F;

    move-result-object v5

    invoke-virtual {v5, v2, v1}, Lt/F;->s(ILjava/lang/Object;)V

    .line 21
    :cond_6
    invoke-static {v4, v3}, Landroidx/compose/ui/platform/y;->G(Landroidx/compose/ui/platform/y;LK0/J;)V

    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    .line 22
    iget-object v2, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v0}, LR0/j;->c()Lie/a;

    move-result-object v0

    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/platform/k1;->g(Ljava/lang/Float;)V

    :cond_8
    if-eqz v1, :cond_9

    .line 23
    iget-object v0, p0, Landroidx/compose/ui/platform/y$i;->a:Landroidx/compose/ui/platform/k1;

    invoke-virtual {v1}, LR0/j;->c()Lie/a;

    move-result-object v1

    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/k1;->h(Ljava/lang/Float;)V

    :cond_9
    return-void
.end method
