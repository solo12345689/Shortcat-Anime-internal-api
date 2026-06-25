.class final LU/k$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/k$b;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/A;

.field final synthetic b:Lie/o;


# direct methods
.method constructor <init>(LC/A;Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/k$b$a;->a:LC/A;

    .line 2
    .line 3
    iput-object p2, p0, LU/k$b$a;->b:Lie/o;

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

    invoke-virtual {p0, p1, p2}, LU/k$b$a;->invoke(LY/m;I)V

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

    const-string v1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)"

    const v2, 0x4f204156

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    sget-object v0, LU/i;->a:LU/i;

    invoke-virtual {v0}, LU/i;->i()F

    move-result v1

    .line 7
    invoke-virtual {v0}, LU/i;->h()F

    move-result v0

    .line 8
    invoke-static {p2, v1, v0}, Landroidx/compose/foundation/layout/s;->a(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p2

    .line 9
    iget-object v0, p0, LU/k$b$a;->a:LC/A;

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 10
    sget-object v0, LC/b;->a:LC/b;

    invoke-virtual {v0}, LC/b;->b()LC/b$f;

    move-result-object v0

    .line 11
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v1}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v1

    .line 12
    iget-object v2, p0, LU/k$b$a;->b:Lie/o;

    const/16 v3, 0x36

    .line 13
    invoke-static {v0, v1, p1, v3}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object v0

    const/4 v1, 0x0

    .line 14
    invoke-static {p1, v1}, LY/h;->a(LY/m;I)I

    move-result v1

    .line 15
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v3

    .line 16
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 17
    sget-object v4, LK0/g;->M:LK0/g$a;

    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    move-result-object v5

    .line 18
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 19
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 20
    invoke-interface {p1}, LY/m;->e()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 21
    invoke-interface {p1, v5}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 22
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 23
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v5

    .line 24
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v0, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v3, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 27
    invoke-interface {v5}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 28
    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    :cond_6
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, p2, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    sget-object p2, LC/J;->a:LC/J;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, p2, p1, v0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-interface {p1}, LY/m;->x()V

    .line 33
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
