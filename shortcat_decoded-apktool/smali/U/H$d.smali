.class final LU/H$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/H;->k(Landroidx/compose/ui/e;Lie/a;LC/A;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU/H$d$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lie/a;

.field final synthetic b:LC/A;


# direct methods
.method constructor <init>(Lie/a;LC/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/H$d;->a:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, LU/H$d;->b:LC/A;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, LU/H$d;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v1, LU/H$d;->a:Lie/a;

    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr0/l;

    invoke-virtual {v2}, Lr0/l;->m()J

    move-result-wide v2

    .line 3
    invoke-static {v2, v3}, Lr0/l;->i(J)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v6, v4, v5

    if-lez v6, :cond_2

    .line 4
    invoke-static {}, LU/H;->e()F

    move-result v6

    invoke-interface {v0, v6}, Li1/d;->l1(F)F

    move-result v6

    .line 5
    iget-object v7, v1, LU/H$d;->b:LC/A;

    invoke-interface {v0}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v8

    invoke-interface {v7, v8}, LC/A;->b(Li1/t;)F

    move-result v7

    invoke-interface {v0, v7}, Li1/d;->l1(F)F

    move-result v7

    sub-float/2addr v7, v6

    add-float/2addr v4, v7

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v6, v8

    add-float/2addr v4, v6

    .line 6
    invoke-interface {v0}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v6

    sget-object v9, LU/H$d$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v9, v6

    const/4 v10, 0x1

    if-ne v6, v10, :cond_0

    .line 7
    invoke-interface {v0}, Lu0/f;->f()J

    move-result-wide v11

    invoke-static {v11, v12}, Lr0/l;->i(J)F

    move-result v6

    sub-float/2addr v6, v4

    :goto_0
    move v12, v6

    goto :goto_1

    .line 8
    :cond_0
    invoke-static {v7, v5}, Loe/j;->d(FF)F

    move-result v6

    goto :goto_0

    .line 9
    :goto_1
    invoke-interface {v0}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v9, v6

    if-ne v6, v10, :cond_1

    .line 10
    invoke-interface {v0}, Lu0/f;->f()J

    move-result-wide v9

    invoke-static {v9, v10}, Lr0/l;->i(J)F

    move-result v4

    invoke-static {v7, v5}, Loe/j;->d(FF)F

    move-result v5

    sub-float/2addr v4, v5

    :cond_1
    move v14, v4

    .line 11
    invoke-static {v2, v3}, Lr0/l;->g(J)F

    move-result v2

    neg-float v3, v2

    div-float v13, v3, v8

    div-float v15, v2, v8

    .line 12
    sget-object v2, Ls0/q0;->a:Ls0/q0$a;

    invoke-virtual {v2}, Ls0/q0$a;->a()I

    move-result v16

    .line 13
    invoke-interface {v0}, Lu0/f;->n1()Lu0/d;

    move-result-object v2

    .line 14
    invoke-interface {v2}, Lu0/d;->f()J

    move-result-wide v3

    .line 15
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v5

    invoke-interface {v5}, Ls0/j0;->p()V

    .line 16
    :try_start_0
    invoke-interface {v2}, Lu0/d;->a()Lu0/h;

    move-result-object v11

    .line 17
    invoke-interface/range {v11 .. v16}, Lu0/h;->c(FFFFI)V

    .line 18
    invoke-interface {v0}, Lu0/c;->B1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v0

    invoke-interface {v0}, Ls0/j0;->k()V

    .line 20
    invoke-interface {v2, v3, v4}, Lu0/d;->e(J)V

    return-void

    :catchall_0
    move-exception v0

    .line 21
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v5

    invoke-interface {v5}, Ls0/j0;->k()V

    .line 22
    invoke-interface {v2, v3, v4}, Lu0/d;->e(J)V

    throw v0

    .line 23
    :cond_2
    invoke-interface {v0}, Lu0/c;->B1()V

    return-void
.end method
