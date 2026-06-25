.class final LW/j$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j;->a(LW/p;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La1/f0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLB/k;LC/A;LU/f0;Lkotlin/jvm/functions/Function2;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;

.field final synthetic b:J

.field final synthetic c:LU0/Y0;

.field final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LY/h2;JLU0/Y0;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/j$h;->a:LY/h2;

    .line 2
    .line 3
    iput-wide p2, p0, LW/j$h;->b:J

    .line 4
    .line 5
    iput-object p4, p0, LW/j$h;->c:LU0/Y0;

    .line 6
    .line 7
    iput-object p5, p0, LW/j$h;->d:Lkotlin/jvm/functions/Function2;

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

    invoke-virtual {p0, p1, p2}, LW/j$h;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

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

    const-string v1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)"

    const v2, -0x5af8699b

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    iget-object v0, p0, LW/j$h;->a:LY/h2;

    invoke-interface {p1, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LW/j$h;->a:LY/h2;

    .line 5
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    .line 6
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    .line 7
    :cond_3
    new-instance v2, LW/j$h$a;

    invoke-direct {v2, v1}, LW/j$h$a;-><init>(LY/h2;)V

    .line 8
    invoke-interface {p1, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 9
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v2}, Landroidx/compose/ui/graphics/f;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-wide v0, p0, LW/j$h;->b:J

    iget-object v2, p0, LW/j$h;->c:LU0/Y0;

    iget-object v3, p0, LW/j$h;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v4}, Ll0/e$a;->o()Ll0/e;

    move-result-object v4

    const/4 v5, 0x0

    .line 11
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v4

    .line 12
    invoke-static {p1, v5}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 13
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v6

    .line 14
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 15
    sget-object v7, LK0/g;->M:LK0/g$a;

    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    move-result-object v8

    .line 16
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v9

    if-nez v9, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 17
    :cond_5
    invoke-interface {p1}, LY/m;->I()V

    .line 18
    invoke-interface {p1}, LY/m;->e()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 19
    invoke-interface {p1, v8}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 20
    :cond_6
    invoke-interface {p1}, LY/m;->s()V

    .line 21
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v8

    .line 22
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v4, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v6, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 25
    invoke-interface {v8}, LY/m;->e()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 26
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    :cond_8
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, p2, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    sget-object p2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const/4 v5, 0x0

    move-object v4, p1

    .line 30
    invoke-static/range {v0 .. v5}, LW/j;->f(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 31
    invoke-interface {v4}, LY/m;->x()V

    .line 32
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
