.class final LK/K$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/K$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/o;

.field final synthetic b:La1/J;

.field final synthetic c:La1/U;

.field final synthetic d:LK/y;

.field final synthetic e:Ls0/h0;


# direct methods
.method constructor <init>(LN/o;La1/J;La1/U;LK/y;Ls0/h0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/K$a$b;->a:LN/o;

    .line 2
    .line 3
    iput-object p2, p0, LK/K$a$b;->b:La1/J;

    .line 4
    .line 5
    iput-object p3, p0, LK/K$a$b;->c:La1/U;

    .line 6
    .line 7
    iput-object p4, p0, LK/K$a$b;->d:LK/y;

    .line 8
    .line 9
    iput-object p5, p0, LK/K$a$b;->e:Ls0/h0;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, LK/K$a$b;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 16

    move-object/from16 v0, p0

    .line 2
    invoke-interface/range {p1 .. p1}, Lu0/c;->B1()V

    .line 3
    iget-object v1, v0, LK/K$a$b;->a:LN/o;

    invoke-virtual {v1}, LN/o;->c()F

    move-result v11

    const/4 v1, 0x0

    cmpg-float v2, v11, v1

    if-nez v2, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v2, v0, LK/K$a$b;->b:La1/J;

    .line 5
    iget-object v3, v0, LK/K$a$b;->c:La1/U;

    invoke-virtual {v3}, La1/U;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LU0/W0;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, La1/J;->b(I)I

    move-result v2

    .line 6
    iget-object v3, v0, LK/K$a$b;->d:LK/y;

    invoke-virtual {v3}, LK/y;->j()LK/Z;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LK/Z;->f()LU0/T0;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, LU0/T0;->e(I)Lr0/h;

    move-result-object v2

    if-nez v2, :cond_2

    .line 7
    :cond_1
    new-instance v2, Lr0/h;

    invoke-direct {v2, v1, v1, v1, v1}, Lr0/h;-><init>(FFFF)V

    .line 8
    :cond_2
    invoke-static {}, LK/K;->b()F

    move-result v1

    move-object/from16 v3, p1

    invoke-interface {v3, v1}, Li1/d;->l1(F)F

    move-result v8

    .line 9
    invoke-virtual {v2}, Lr0/h;->i()F

    move-result v1

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v8, v4

    add-float/2addr v1, v4

    .line 10
    invoke-interface {v3}, Lu0/f;->f()J

    move-result-wide v5

    invoke-static {v5, v6}, Lr0/l;->i(J)F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v1, v5}, Loe/j;->h(FF)F

    move-result v1

    .line 11
    invoke-static {v1, v4}, Loe/j;->d(FF)F

    move-result v1

    .line 12
    invoke-virtual {v2}, Lr0/h;->l()F

    move-result v4

    invoke-static {v1, v4}, Lr0/g;->a(FF)J

    move-result-wide v4

    .line 13
    invoke-virtual {v2}, Lr0/h;->e()F

    move-result v2

    invoke-static {v1, v2}, Lr0/g;->a(FF)J

    move-result-wide v6

    .line 14
    iget-object v3, v0, LK/K$a$b;->e:Ls0/h0;

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    .line 15
    invoke-static/range {v2 .. v15}, Lu0/f;->R(Lu0/f;Ls0/h0;JJFILs0/n1;FLandroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
