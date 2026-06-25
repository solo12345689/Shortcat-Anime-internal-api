.class final LW/j$b;
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
.field final synthetic a:LY/C0;

.field final synthetic b:LC/A;

.field final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LY/C0;LC/A;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/j$b;->a:LY/C0;

    .line 2
    .line 3
    iput-object p2, p0, LW/j$b;->b:LC/A;

    .line 4
    .line 5
    iput-object p3, p0, LW/j$b;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2}, LW/j$b;->invoke(LY/m;I)V

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

    const-string v1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)"

    const v2, 0x96014d9

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const-string v0, "Container"

    invoke-static {p2, v0}, Landroidx/compose/ui/layout/h;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 6
    new-instance v0, LW/j$b$a;

    iget-object v1, p0, LW/j$b;->a:LY/C0;

    invoke-direct {v0, v1}, LW/j$b$a;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, LW/j$b;->b:LC/A;

    invoke-static {p2, v0, v1}, LU/H;->k(Landroidx/compose/ui/e;Lie/a;LC/A;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 7
    iget-object v0, p0, LW/j$b;->c:Lkotlin/jvm/functions/Function2;

    .line 8
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    move-result-object v1

    const/4 v2, 0x1

    .line 9
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v1

    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v2}, LY/h;->a(LY/m;I)I

    move-result v3

    .line 11
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v4

    .line 12
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 13
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 14
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 15
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 16
    invoke-interface {p1}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 17
    invoke-interface {p1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 18
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 19
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 20
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 23
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

    .line 24
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    :cond_6
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, p2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    sget-object p2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    invoke-interface {p1}, LY/m;->x()V

    .line 30
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
