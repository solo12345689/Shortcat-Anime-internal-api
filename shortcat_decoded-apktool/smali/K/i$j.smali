.class final LK/i$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/platform/F1;

.field final synthetic d:LQ/F;

.field final synthetic e:La1/U;

.field final synthetic f:La1/J;


# direct methods
.method constructor <init>(LK/y;ZLandroidx/compose/ui/platform/F1;LQ/F;La1/U;La1/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$j;->a:LK/y;

    .line 2
    .line 3
    iput-boolean p2, p0, LK/i$j;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LK/i$j;->c:Landroidx/compose/ui/platform/F1;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$j;->d:LQ/F;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$j;->e:La1/U;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$j;->f:La1/J;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI0/p;

    invoke-virtual {p0, p1}, LK/i$j;->invoke(LI0/p;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LI0/p;)V
    .locals 4

    .line 2
    iget-object v0, p0, LK/i$j;->a:LK/y;

    invoke-virtual {v0, p1}, LK/y;->F(LI0/p;)V

    .line 3
    iget-object v0, p0, LK/i$j;->a:LK/y;

    invoke-virtual {v0}, LK/y;->j()LK/Z;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LK/Z;->i(LI0/p;)V

    .line 4
    :goto_0
    iget-boolean p1, p0, LK/i$j;->b:Z

    if-eqz p1, :cond_4

    .line 5
    iget-object p1, p0, LK/i$j;->a:LK/y;

    invoke-virtual {p1}, LK/y;->d()LK/m;

    move-result-object p1

    sget-object v0, LK/m;->b:LK/m;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    .line 6
    iget-object p1, p0, LK/i$j;->a:LK/y;

    invoke-virtual {p1}, LK/y;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LK/i$j;->c:Landroidx/compose/ui/platform/F1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/F1;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, LK/i$j;->d:LQ/F;

    invoke-virtual {p1}, LQ/F;->l0()V

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, LK/i$j;->d:LQ/F;

    invoke-virtual {p1}, LQ/F;->R()V

    .line 9
    :goto_1
    iget-object p1, p0, LK/i$j;->a:LK/y;

    .line 10
    iget-object v0, p0, LK/i$j;->d:LQ/F;

    invoke-static {v0, v1}, LQ/G;->c(LQ/F;Z)Z

    move-result v0

    .line 11
    invoke-virtual {p1, v0}, LK/y;->M(Z)V

    .line 12
    iget-object p1, p0, LK/i$j;->a:LK/y;

    .line 13
    iget-object v0, p0, LK/i$j;->d:LQ/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LQ/G;->c(LQ/F;Z)Z

    move-result v0

    .line 14
    invoke-virtual {p1, v0}, LK/y;->L(Z)V

    .line 15
    iget-object p1, p0, LK/i$j;->a:LK/y;

    iget-object v0, p0, LK/i$j;->e:La1/U;

    invoke-virtual {v0}, La1/U;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, LU0/W0;->h(J)Z

    move-result v0

    invoke-virtual {p1, v0}, LK/y;->J(Z)V

    goto :goto_2

    .line 16
    :cond_2
    iget-object p1, p0, LK/i$j;->a:LK/y;

    invoke-virtual {p1}, LK/y;->d()LK/m;

    move-result-object p1

    sget-object v0, LK/m;->c:LK/m;

    if-ne p1, v0, :cond_3

    .line 17
    iget-object p1, p0, LK/i$j;->a:LK/y;

    .line 18
    iget-object v0, p0, LK/i$j;->d:LQ/F;

    invoke-static {v0, v1}, LQ/G;->c(LQ/F;Z)Z

    move-result v0

    .line 19
    invoke-virtual {p1, v0}, LK/y;->J(Z)V

    .line 20
    :cond_3
    :goto_2
    iget-object p1, p0, LK/i$j;->a:LK/y;

    iget-object v0, p0, LK/i$j;->e:La1/U;

    iget-object v1, p0, LK/i$j;->f:La1/J;

    invoke-static {p1, v0, v1}, LK/i;->j(LK/y;La1/U;La1/J;)V

    .line 21
    iget-object p1, p0, LK/i$j;->a:LK/y;

    invoke-virtual {p1}, LK/y;->j()LK/Z;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, LK/i$j;->a:LK/y;

    iget-object v1, p0, LK/i$j;->e:La1/U;

    iget-object v2, p0, LK/i$j;->f:La1/J;

    .line 22
    invoke-virtual {v0}, LK/y;->g()La1/c0;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 23
    invoke-virtual {v0}, LK/y;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 24
    sget-object v0, LK/L;->a:LK/L$a;

    invoke-virtual {v0, v3, v1, v2, p1}, LK/L$a;->k(La1/c0;La1/U;La1/J;LK/Z;)V

    :cond_4
    return-void
.end method
