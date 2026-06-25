.class final Landroidx/compose/foundation/layout/r$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/r;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:Landroidx/compose/ui/layout/l;

.field final synthetic c:Landroidx/compose/foundation/layout/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;Landroidx/compose/foundation/layout/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/r$a;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/layout/r$a;->b:Landroidx/compose/ui/layout/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/r$a;->c:Landroidx/compose/foundation/layout/r;

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/r$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 7

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/layout/r$a;->a:Landroidx/compose/ui/layout/s;

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/layout/r$a;->b:Landroidx/compose/ui/layout/l;

    iget-object v2, p0, Landroidx/compose/foundation/layout/r$a;->c:Landroidx/compose/foundation/layout/r;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/r;->E1()LC/A;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/foundation/layout/r$a;->b:Landroidx/compose/ui/layout/l;

    invoke-interface {v3}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v3

    invoke-interface {v2, v3}, LC/A;->b(Li1/t;)F

    move-result v2

    invoke-interface {v0, v2}, Li1/d;->s0(F)I

    move-result v2

    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/layout/r$a;->b:Landroidx/compose/ui/layout/l;

    iget-object v3, p0, Landroidx/compose/foundation/layout/r$a;->c:Landroidx/compose/foundation/layout/r;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/r;->E1()LC/A;

    move-result-object v3

    invoke-interface {v3}, LC/A;->d()F

    move-result v3

    invoke-interface {v0, v3}, Li1/d;->s0(F)I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    .line 5
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
