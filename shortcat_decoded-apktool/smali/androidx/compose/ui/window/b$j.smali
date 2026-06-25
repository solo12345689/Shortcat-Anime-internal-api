.class final Landroidx/compose/ui/window/b$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/m;

.field final synthetic b:LY/h2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/b$j;->b:LY/h2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$j;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, LY/m;->p(ZI)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:317)"

    const v4, -0x11bbdae4

    invoke-static {v4, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 2
    :cond_1
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 3
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    .line 4
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_2

    .line 5
    sget-object v0, Landroidx/compose/ui/window/b$j$a;->a:Landroidx/compose/ui/window/b$j$a;

    .line 6
    invoke-interface {p1, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-static {p2, v3, v0, v2, v4}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 8
    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/m;

    invoke-interface {p1, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/m;

    .line 9
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    .line 10
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    .line 11
    :cond_3
    new-instance v4, Landroidx/compose/ui/window/b$j$b;

    invoke-direct {v4, v2}, Landroidx/compose/ui/window/b$j$b;-><init>(Landroidx/compose/ui/window/m;)V

    .line 12
    invoke-interface {p1, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 13
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v4}, Landroidx/compose/ui/layout/p;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 14
    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/m;

    invoke-virtual {v0}, Landroidx/compose/ui/window/m;->getCanCalculatePosition()Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-static {p2, v0}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p2

    .line 15
    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->b:LY/h2;

    invoke-static {v0}, Landroidx/compose/ui/window/b;->c(LY/h2;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 16
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    .line 17
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    .line 18
    sget-object v2, Landroidx/compose/ui/window/c;->a:Landroidx/compose/ui/window/c;

    .line 19
    invoke-interface {p1, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 20
    :cond_6
    check-cast v2, LI0/B;

    .line 21
    invoke-static {p1, v3}, LY/h;->b(LY/m;I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    .line 22
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v4

    .line 23
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 24
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 25
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LY/h;->d()V

    .line 26
    :cond_7
    invoke-interface {p1}, LY/m;->I()V

    .line 27
    invoke-interface {p1}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 28
    invoke-interface {p1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 29
    :cond_8
    invoke-interface {p1}, LY/m;->s()V

    .line 30
    :goto_2
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 31
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 32
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 33
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 34
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    .line 35
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    :cond_a
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, p2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    invoke-interface {p1}, LY/m;->x()V

    .line 40
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LY/w;->T()V

    :cond_b
    return-void

    .line 41
    :cond_c
    invoke-interface {p1}, LY/m;->K()V

    return-void
.end method
