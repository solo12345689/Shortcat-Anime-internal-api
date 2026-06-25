.class final LU/e0$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Ls0/E1;

.field final synthetic c:J

.field final synthetic d:F

.field final synthetic e:Lx/g;

.field final synthetic f:F

.field final synthetic g:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Ls0/E1;JFLx/g;FLkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/e0$b;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LU/e0$b;->b:Ls0/E1;

    .line 4
    .line 5
    iput-wide p3, p0, LU/e0$b;->c:J

    .line 6
    .line 7
    iput p5, p0, LU/e0$b;->d:F

    .line 8
    .line 9
    iput-object p6, p0, LU/e0$b;->e:Lx/g;

    .line 10
    .line 11
    iput p7, p0, LU/e0$b;->f:F

    .line 12
    .line 13
    iput-object p8, p0, LU/e0$b;->g:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
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

    invoke-virtual {p0, p1, p2}, LU/e0$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

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

    const-string v1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)"

    const v2, -0x43a11cd

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v3, p0, LU/e0$b;->a:Landroidx/compose/ui/e;

    .line 6
    iget-object v4, p0, LU/e0$b;->b:Ls0/E1;

    .line 7
    iget-wide v0, p0, LU/e0$b;->c:J

    iget p2, p0, LU/e0$b;->d:F

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, p1, v2}, LU/e0;->d(JFLY/m;I)J

    move-result-wide v5

    .line 8
    iget-object v7, p0, LU/e0$b;->e:Lx/g;

    .line 9
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    move-result-object p2

    .line 10
    invoke-interface {p1, p2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object p2

    .line 11
    iget v0, p0, LU/e0$b;->f:F

    check-cast p2, Li1/d;

    invoke-interface {p2, v0}, Li1/d;->l1(F)F

    move-result v8

    .line 12
    invoke-static/range {v3 .. v8}, LU/e0;->c(Landroidx/compose/ui/e;Ls0/E1;JLx/g;F)Landroidx/compose/ui/e;

    move-result-object p2

    .line 13
    sget-object v0, LU/e0$b$a;->a:LU/e0$b$a;

    invoke-static {p2, v2, v0}, LR0/r;->e(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 14
    sget-object v0, LTd/L;->a:LTd/L;

    new-instance v1, LU/e0$b$b;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, LU/e0$b$b;-><init>(LZd/e;)V

    invoke-static {p2, v0, v1}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 15
    iget-object v0, p0, LU/e0$b;->g:Lkotlin/jvm/functions/Function2;

    .line 16
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    move-result-object v1

    const/4 v3, 0x1

    .line 17
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v1

    .line 18
    invoke-static {p1, v2}, LY/h;->a(LY/m;I)I

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

    if-nez v7, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 23
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 24
    invoke-interface {p1}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 25
    invoke-interface {p1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 26
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 27
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 28
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 31
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 32
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 33
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 34
    :cond_6
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, p2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 35
    sget-object p2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 36
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-interface {p1}, LY/m;->x()V

    .line 38
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
