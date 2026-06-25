.class final LK/a$e$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a$e$a;->invoke(Lp0/f;)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Ls0/b1;

.field final synthetic c:Landroidx/compose/ui/graphics/d;


# direct methods
.method constructor <init>(FLs0/b1;Landroidx/compose/ui/graphics/d;)V
    .locals 0

    .line 1
    iput p1, p0, LK/a$e$a$a;->a:F

    .line 2
    .line 3
    iput-object p2, p0, LK/a$e$a$a;->b:Ls0/b1;

    .line 4
    .line 5
    iput-object p3, p0, LK/a$e$a$a;->c:Landroidx/compose/ui/graphics/d;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, LK/a$e$a$a;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 14

    .line 2
    invoke-interface {p1}, Lu0/c;->B1()V

    .line 3
    iget v0, p0, LK/a$e$a$a;->a:F

    iget-object v2, p0, LK/a$e$a$a;->b:Ls0/b1;

    iget-object v7, p0, LK/a$e$a$a;->c:Landroidx/compose/ui/graphics/d;

    .line 4
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v11

    .line 5
    invoke-interface {v11}, Lu0/d;->f()J

    move-result-wide v12

    .line 6
    invoke-interface {v11}, Lu0/d;->b()Ls0/j0;

    move-result-object v1

    invoke-interface {v1}, Ls0/j0;->p()V

    .line 7
    :try_start_0
    invoke-interface {v11}, Lu0/d;->a()Lu0/h;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 8
    invoke-static {v1, v0, v5, v3, v4}, Lu0/h;->e(Lu0/h;FFILjava/lang/Object;)V

    .line 9
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    invoke-virtual {v0}, Lr0/f$a;->c()J

    move-result-wide v3

    const/high16 v0, 0x42340000    # 45.0f

    invoke-interface {v1, v0, v3, v4}, Lu0/h;->g(FJ)V

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    .line 10
    invoke-static/range {v1 .. v10}, Lu0/f;->K0(Lu0/f;Ls0/b1;JFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-interface {v11}, Lu0/d;->b()Ls0/j0;

    move-result-object p1

    invoke-interface {p1}, Ls0/j0;->k()V

    .line 12
    invoke-interface {v11, v12, v13}, Lu0/d;->e(J)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 13
    invoke-interface {v11}, Lu0/d;->b()Ls0/j0;

    move-result-object v0

    invoke-interface {v0}, Ls0/j0;->k()V

    .line 14
    invoke-interface {v11, v12, v13}, Lu0/d;->e(J)V

    throw p1
.end method
