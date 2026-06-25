.class final LU/e0$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/e0;->b(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;JJFFLx/g;LB/m;Lkotlin/jvm/functions/Function2;LY/m;III)V
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

.field final synthetic f:LB/m;

.field final synthetic g:Z

.field final synthetic h:Lie/a;

.field final synthetic i:F

.field final synthetic j:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Ls0/E1;JFLx/g;LB/m;ZLie/a;FLkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/e0$c;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LU/e0$c;->b:Ls0/E1;

    .line 4
    .line 5
    iput-wide p3, p0, LU/e0$c;->c:J

    .line 6
    .line 7
    iput p5, p0, LU/e0$c;->d:F

    .line 8
    .line 9
    iput-object p6, p0, LU/e0$c;->e:Lx/g;

    .line 10
    .line 11
    iput-object p7, p0, LU/e0$c;->f:LB/m;

    .line 12
    .line 13
    iput-boolean p8, p0, LU/e0$c;->g:Z

    .line 14
    .line 15
    iput-object p9, p0, LU/e0$c;->h:Lie/a;

    .line 16
    .line 17
    iput p10, p0, LU/e0$c;->i:F

    .line 18
    .line 19
    iput-object p11, p0, LU/e0$c;->j:Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
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

    invoke-virtual {p0, p1, p2}, LU/e0$c;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v5}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v5}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)"

    const v4, 0x4c46b75c    # 5.2092272E7f

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v1, v0, LU/e0$c;->a:Landroidx/compose/ui/e;

    .line 6
    invoke-static {v1}, LU/C;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    .line 7
    iget-object v7, v0, LU/e0$c;->b:Ls0/E1;

    .line 8
    iget-wide v1, v0, LU/e0$c;->c:J

    iget v3, v0, LU/e0$c;->d:F

    const/4 v12, 0x0

    invoke-static {v1, v2, v3, v5, v12}, LU/e0;->d(JFLY/m;I)J

    move-result-wide v8

    .line 9
    iget-object v10, v0, LU/e0$c;->e:Lx/g;

    .line 10
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    move-result-object v1

    .line 11
    invoke-interface {v5, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    iget v2, v0, LU/e0$c;->i:F

    check-cast v1, Li1/d;

    invoke-interface {v1, v2}, Li1/d;->l1(F)F

    move-result v11

    .line 13
    invoke-static/range {v6 .. v11}, LU/e0;->c(Landroidx/compose/ui/e;Ls0/E1;JLx/g;F)Landroidx/compose/ui/e;

    move-result-object v13

    .line 14
    iget-object v14, v0, LU/e0$c;->f:LB/m;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    .line 15
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/a;->d(ZFJLY/m;II)Lx/G;

    move-result-object v15

    .line 16
    iget-boolean v1, v0, LU/e0$c;->g:Z

    .line 17
    iget-object v2, v0, LU/e0$c;->h:Lie/a;

    const/16 v20, 0x18

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v16, v1

    move-object/from16 v19, v2

    .line 18
    invoke-static/range {v13 .. v21}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 19
    iget-object v2, v0, LU/e0$c;->j:Lkotlin/jvm/functions/Function2;

    .line 20
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    move-result-object v3

    const/4 v4, 0x1

    .line 21
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v3

    .line 22
    invoke-static {v5, v12}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 23
    invoke-interface {v5}, LY/m;->r()LY/I;

    move-result-object v6

    .line 24
    invoke-static {v5, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 25
    sget-object v7, LK0/g;->M:LK0/g$a;

    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    move-result-object v8

    .line 26
    invoke-interface {v5}, LY/m;->j()LY/d;

    move-result-object v9

    if-nez v9, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 27
    :cond_3
    invoke-interface {v5}, LY/m;->I()V

    .line 28
    invoke-interface {v5}, LY/m;->e()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 29
    invoke-interface {v5, v8}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 30
    :cond_4
    invoke-interface {v5}, LY/m;->s()V

    .line 31
    :goto_1
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v8

    .line 32
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v3, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 33
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v6, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 34
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 35
    invoke-interface {v8}, LY/m;->e()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 36
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 38
    :cond_6
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v1, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 39
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 40
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v5, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    invoke-interface {v5}, LY/m;->x()V

    .line 42
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
