.class final LU/b$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b;->d(Lie/a;Landroidx/compose/ui/e;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/b$g;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LU/b$g;->b:Lkotlin/jvm/functions/Function2;

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

    invoke-virtual {p0, p1, p2}, LU/b$g;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)"

    const v2, 0x35f59d30

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LW/g;->a:LW/g$a;

    .line 5
    sget p2, LU/L;->a:I

    invoke-static {p2}, LW/g;->a(I)I

    move-result p2

    const/4 v0, 0x0

    .line 6
    invoke-static {p2, p1, v0}, LW/h;->a(ILY/m;I)Ljava/lang/String;

    move-result-object p2

    .line 7
    iget-object v1, p0, LU/b$g;->a:Landroidx/compose/ui/e;

    .line 8
    invoke-static {}, LU/b;->l()F

    move-result v2

    invoke-static {}, LU/b;->k()F

    move-result v4

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/s;->u(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 9
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    .line 10
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    .line 11
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    .line 12
    :cond_3
    new-instance v4, LU/b$g$a;

    invoke-direct {v4, p2}, LU/b$g$a;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-interface {p1, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 14
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 p2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v4, v3, p2}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-interface {v1, p2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 15
    iget-object v1, p0, LU/b$g;->b:Lkotlin/jvm/functions/Function2;

    .line 16
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v2}, Ll0/e$a;->o()Ll0/e;

    move-result-object v2

    .line 17
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v2

    .line 18
    invoke-static {p1, v0}, LY/h;->a(LY/m;I)I

    move-result v3

    .line 19
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v4

    .line 20
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 21
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 22
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 23
    :cond_5
    invoke-interface {p1}, LY/m;->I()V

    .line 24
    invoke-interface {p1}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 25
    invoke-interface {p1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 26
    :cond_6
    invoke-interface {p1}, LY/m;->s()V

    .line 27
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 28
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 31
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 32
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 33
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 34
    :cond_8
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, p2, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 35
    sget-object p2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-interface {p1}, LY/m;->x()V

    .line 38
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
