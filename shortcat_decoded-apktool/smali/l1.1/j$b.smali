.class final Ll1/j$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll1/j;->e(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;Lq1/h;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq1/h;


# direct methods
.method constructor <init>(Lq1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/j$b;->a:Lq1/h;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/g;

    invoke-virtual {p0, p1}, Ll1/j$b;->invoke(Landroidx/compose/ui/graphics/g;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/g;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->f:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->g:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3
    :cond_0
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->f:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->f:F

    .line 4
    :goto_0
    iget-object v2, p0, Ll1/j$b;->a:Lq1/h;

    iget v2, v2, Lq1/h;->g:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ll1/j$b;->a:Lq1/h;

    iget v1, v1, Lq1/h;->g:F

    .line 5
    :goto_1
    invoke-static {v0, v1}, Ls0/L1;->a(FF)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/g;->t0(J)V

    .line 6
    :cond_3
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 7
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->h:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->s(F)V

    .line 8
    :cond_4
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_5

    .line 9
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->i:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->t(F)V

    .line 10
    :cond_5
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->j:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    .line 11
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->j:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->w(F)V

    .line 12
    :cond_6
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->k:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 13
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->k:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->F(F)V

    .line 14
    :cond_7
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->l:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 15
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->l:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->g(F)V

    .line 16
    :cond_8
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_9

    .line 17
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->m:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->v(F)V

    .line 18
    :cond_9
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->n:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->o:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_d

    .line 19
    :cond_a
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->n:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_b

    move v0, v1

    goto :goto_2

    :cond_b
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->n:F

    :goto_2
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->l(F)V

    .line 20
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->o:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v1, v0, Lq1/h;->o:F

    :goto_3
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/g;->y(F)V

    .line 21
    :cond_d
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->p:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_e

    .line 22
    iget-object v0, p0, Ll1/j$b;->a:Lq1/h;

    iget v0, v0, Lq1/h;->p:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->e(F)V

    :cond_e
    return-void
.end method
