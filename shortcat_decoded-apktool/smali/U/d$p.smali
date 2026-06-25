.class final LU/d$p;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->g(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;FLkotlin/jvm/functions/Function2;LU0/Y0;Lkotlin/jvm/functions/Function2;Lie/o;FFLC/P;LU/k0;LU/m0;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/o;


# direct methods
.method constructor <init>(Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$p;->a:Lie/o;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
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

    invoke-virtual {p0, p1, p2}, LU/d$p;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 7

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

    const-string v1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)"

    const v2, -0x554ac97

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object p2, LC/b;->a:LC/b;

    invoke-virtual {p2}, LC/b;->c()LC/b$e;

    move-result-object p2

    .line 6
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v0}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v0

    .line 7
    iget-object v1, p0, LU/d$p;->a:Lie/o;

    .line 8
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/16 v3, 0x36

    .line 9
    invoke-static {p2, v0, p1, v3}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object p2

    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0}, LY/h;->a(LY/m;I)I

    move-result v0

    .line 11
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v3

    .line 12
    invoke-static {p1, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 13
    sget-object v4, LK0/g;->M:LK0/g$a;

    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    move-result-object v5

    .line 14
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 15
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 16
    invoke-interface {p1}, LY/m;->e()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 17
    invoke-interface {p1, v5}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 18
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 19
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v5

    .line 20
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, p2, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v5, v3, p2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    .line 23
    invoke-interface {v5}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 24
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, p2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    :cond_6
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v5, v2, p2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    sget-object p2, LC/J;->a:LC/J;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p2, p1, v0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    invoke-interface {p1}, LY/m;->x()V

    .line 29
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
