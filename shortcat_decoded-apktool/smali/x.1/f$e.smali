.class final Lx/f$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/f;-><init>(FLs0/h0;Ls0/E1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/f;


# direct methods
.method constructor <init>(Lx/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/f$e;->a:Lx/f;

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
    check-cast p1, Lp0/f;

    invoke-virtual {p0, p1}, Lx/f$e;->invoke(Lp0/f;)Lp0/j;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp0/f;)Lp0/j;
    .locals 14

    move-object v1, p1

    .line 2
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    invoke-virtual {v0}, Lx/f;->Q1()F

    move-result v0

    invoke-interface {p1, v0}, Li1/d;->l1(F)F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_5

    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Lr0/l;->h(J)F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    .line 3
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    invoke-virtual {v0}, Lx/f;->Q1()F

    move-result v0

    sget-object v2, Li1/h;->b:Li1/h$a;

    invoke-virtual {v2}, Li1/h$a;->a()F

    move-result v2

    invoke-static {v0, v2}, Li1/h;->q(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    invoke-virtual {v0}, Lx/f;->Q1()F

    move-result v0

    invoke-interface {p1, v0}, Li1/d;->l1(F)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v0, v2

    .line 4
    :goto_0
    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Lr0/l;->h(J)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v5

    div-float v0, v5, v3

    .line 5
    invoke-static {v0, v0}, Lr0/g;->a(FF)J

    move-result-wide v6

    .line 6
    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, Lr0/l;->i(J)F

    move-result v0

    sub-float/2addr v0, v5

    .line 7
    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, Lr0/l;->g(J)F

    move-result v2

    sub-float/2addr v2, v5

    .line 8
    invoke-static {v0, v2}, Lr0/m;->a(FF)J

    move-result-wide v8

    mul-float/2addr v3, v5

    .line 9
    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v10

    invoke-static {v10, v11}, Lr0/l;->h(J)F

    move-result v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 10
    :goto_2
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    invoke-virtual {v0}, Lx/f;->P1()Ls0/E1;

    move-result-object v0

    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v2

    invoke-virtual {p1}, Lp0/f;->getLayoutDirection()Li1/t;

    move-result-object v10

    invoke-interface {v0, v2, v3, v10, p1}, Ls0/E1;->createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;

    move-result-object v0

    .line 11
    instance-of v2, v0, Ls0/i1$a;

    if-eqz v2, :cond_2

    move-object v2, v0

    .line 12
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    move-object v3, v2

    .line 13
    invoke-virtual {v0}, Lx/f;->O1()Ls0/h0;

    move-result-object v2

    .line 14
    check-cast v3, Ls0/i1$a;

    .line 15
    invoke-static/range {v0 .. v5}, Lx/f;->K1(Lx/f;Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;

    move-result-object v0

    return-object v0

    :cond_2
    move-object v3, v0

    .line 16
    nop

    instance-of v0, v3, Ls0/i1$c;

    if-eqz v0, :cond_3

    .line 17
    iget-object v0, p0, Lx/f$e;->a:Lx/f;

    .line 18
    invoke-virtual {v0}, Lx/f;->O1()Ls0/h0;

    move-result-object v2

    .line 19
    check-cast v3, Ls0/i1$c;

    move-object v1, p1

    move-wide v12, v8

    move v8, v4

    move v9, v5

    move-wide v4, v6

    move-wide v6, v12

    .line 20
    invoke-static/range {v0 .. v9}, Lx/f;->L1(Lx/f;Lp0/f;Ls0/h0;Ls0/i1$c;JJZF)Lp0/j;

    move-result-object v0

    return-object v0

    :cond_3
    move-wide v0, v6

    move-wide v6, v8

    .line 21
    instance-of v2, v3, Ls0/i1$b;

    if-eqz v2, :cond_4

    .line 22
    iget-object v2, p0, Lx/f$e;->a:Lx/f;

    invoke-virtual {v2}, Lx/f;->O1()Ls0/h0;

    move-result-object v2

    move-wide v12, v0

    move-object v1, v2

    move-wide v2, v12

    move-object v0, p1

    move-wide v12, v6

    move v6, v4

    move v7, v5

    move-wide v4, v12

    .line 23
    invoke-static/range {v0 .. v7}, Lx/e;->c(Lp0/f;Ls0/h0;JJZF)Lp0/j;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0

    .line 24
    :cond_5
    invoke-static {p1}, Lx/e;->b(Lp0/f;)Lp0/j;

    move-result-object v0

    return-object v0
.end method
