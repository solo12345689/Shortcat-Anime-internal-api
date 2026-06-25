.class final Lx/f$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/f;->M1(Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr0/h;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:J

.field final synthetic d:Landroidx/compose/ui/graphics/d;


# direct methods
.method constructor <init>(Lr0/h;Lkotlin/jvm/internal/N;JLandroidx/compose/ui/graphics/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/f$b;->a:Lr0/h;

    .line 2
    .line 3
    iput-object p2, p0, Lx/f$b;->b:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iput-wide p3, p0, Lx/f$b;->c:J

    .line 6
    .line 7
    iput-object p5, p0, Lx/f$b;->d:Landroidx/compose/ui/graphics/d;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, Lx/f$b;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 21

    move-object/from16 v1, p0

    .line 2
    invoke-interface/range {p1 .. p1}, Lu0/c;->B1()V

    .line 3
    iget-object v0, v1, Lx/f$b;->a:Lr0/h;

    invoke-virtual {v0}, Lr0/h;->i()F

    move-result v2

    iget-object v0, v1, Lx/f$b;->a:Lr0/h;

    invoke-virtual {v0}, Lr0/h;->l()F

    move-result v3

    iget-object v0, v1, Lx/f$b;->b:Lkotlin/jvm/internal/N;

    iget-wide v8, v1, Lx/f$b;->c:J

    iget-object v4, v1, Lx/f$b;->d:Landroidx/compose/ui/graphics/d;

    .line 4
    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v5

    invoke-interface {v5}, Lu0/d;->a()Lu0/h;

    move-result-object v5

    invoke-interface {v5, v2, v3}, Lu0/h;->d(FF)V

    .line 5
    :try_start_0
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ls0/b1;

    const/16 v19, 0x37a

    const/16 v20, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v4

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v20}, Lu0/f;->m0(Lu0/f;Ls0/b1;JJJJFLu0/g;Landroidx/compose/ui/graphics/d;IIILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v0

    invoke-interface {v0}, Lu0/d;->a()Lu0/h;

    move-result-object v0

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v0, v2, v3}, Lu0/h;->d(FF)V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v4

    invoke-interface {v4}, Lu0/d;->a()Lu0/h;

    move-result-object v4

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v4, v2, v3}, Lu0/h;->d(FF)V

    throw v0
.end method
