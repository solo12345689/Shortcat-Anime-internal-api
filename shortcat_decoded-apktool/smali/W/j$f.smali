.class final LW/j$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


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
    iput-object p1, p0, LW/j$f;->a:LY/h2;

    .line 2
    .line 3
    iput-wide p2, p0, LW/j$f;->b:J

    .line 4
    .line 5
    iput-object p4, p0, LW/j$f;->c:LU0/Y0;

    .line 6
    .line 7
    iput-object p5, p0, LW/j$f;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LW/j$f;->invoke(Landroidx/compose/ui/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/e;LY/m;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    .line 2
    invoke-interface {p2}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 3
    :cond_2
    invoke-interface {p2}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_1
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)"

    const v2, -0x275ecc34

    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, LW/j$f;->a:LY/h2;

    invoke-interface {p2, p3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, LW/j$f;->a:LY/h2;

    .line 5
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_5

    .line 6
    sget-object p3, LY/m;->a:LY/m$a;

    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_6

    .line 7
    :cond_5
    new-instance v1, LW/j$f$a;

    invoke-direct {v1, v0}, LW/j$f$a;-><init>(LY/h2;)V

    .line 8
    invoke-interface {p2, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 9
    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1}, Landroidx/compose/ui/graphics/f;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-wide v0, p0, LW/j$f;->b:J

    iget-object v2, p0, LW/j$f;->c:LU0/Y0;

    iget-object v3, p0, LW/j$f;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    sget-object p3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p3}, Ll0/e$a;->o()Ll0/e;

    move-result-object p3

    const/4 v4, 0x0

    .line 11
    invoke-static {p3, v4}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object p3

    .line 12
    invoke-static {p2, v4}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 13
    invoke-interface {p2}, LY/m;->r()LY/I;

    move-result-object v5

    .line 14
    invoke-static {p2, p1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    .line 15
    sget-object v6, LK0/g;->M:LK0/g$a;

    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 16
    invoke-interface {p2}, LY/m;->j()LY/d;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-static {}, LY/h;->d()V

    .line 17
    :cond_7
    invoke-interface {p2}, LY/m;->I()V

    .line 18
    invoke-interface {p2}, LY/m;->e()Z

    move-result v8

    if-eqz v8, :cond_8

    .line 19
    invoke-interface {p2, v7}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 20
    :cond_8
    invoke-interface {p2}, LY/m;->s()V

    .line 21
    :goto_2
    invoke-static {p2}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 22
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, p3, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v7, v5, p3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    .line 25
    invoke-interface {v7}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    .line 26
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, p3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    :cond_a
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v7, p1, p3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    sget-object p1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const/4 v5, 0x0

    move-object v4, p2

    .line 30
    invoke-static/range {v0 .. v5}, LW/j;->f(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 31
    invoke-interface {v4}, LY/m;->x()V

    .line 32
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LY/w;->T()V

    :cond_b
    return-void
.end method
