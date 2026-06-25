.class final LK/o0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/o0;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/l;

.field final synthetic b:LK/o0;

.field final synthetic c:Landroidx/compose/ui/layout/s;

.field final synthetic d:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/l;LK/o0;Landroidx/compose/ui/layout/s;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/o0$a;->a:Landroidx/compose/ui/layout/l;

    .line 2
    .line 3
    iput-object p2, p0, LK/o0$a;->b:LK/o0;

    .line 4
    .line 5
    iput-object p3, p0, LK/o0$a;->c:Landroidx/compose/ui/layout/s;

    .line 6
    .line 7
    iput p4, p0, LK/o0$a;->d:I

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LK/o0$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    .line 2
    iget-object v0, p0, LK/o0$a;->a:Landroidx/compose/ui/layout/l;

    .line 3
    iget-object v1, p0, LK/o0$a;->b:LK/o0;

    invoke-virtual {v1}, LK/o0;->a()I

    move-result v1

    .line 4
    iget-object v2, p0, LK/o0$a;->b:LK/o0;

    invoke-virtual {v2}, LK/o0;->i()La1/d0;

    move-result-object v2

    .line 5
    iget-object v3, p0, LK/o0$a;->b:LK/o0;

    invoke-virtual {v3}, LK/o0;->h()Lie/a;

    move-result-object v3

    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK/Z;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LK/Z;->f()LU0/T0;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 6
    :goto_0
    iget-object v4, p0, LK/o0$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v5

    const/4 v4, 0x0

    .line 7
    invoke-static/range {v0 .. v5}, LK/U;->a(Li1/d;ILa1/d0;LU0/T0;ZI)Lr0/h;

    move-result-object v0

    .line 8
    iget-object v1, p0, LK/o0$a;->b:LK/o0;

    invoke-virtual {v1}, LK/o0;->c()LK/V;

    move-result-object v1

    .line 9
    sget-object v2, Lz/q;->a:Lz/q;

    .line 10
    iget v3, p0, LK/o0$a;->d:I

    .line 11
    iget-object v4, p0, LK/o0$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v4

    .line 12
    invoke-virtual {v1, v2, v0, v3, v4}, LK/V;->j(Lz/q;Lr0/h;II)V

    .line 13
    iget-object v0, p0, LK/o0$a;->b:LK/o0;

    invoke-virtual {v0}, LK/o0;->c()LK/V;

    move-result-object v0

    invoke-virtual {v0}, LK/V;->d()F

    move-result v0

    neg-float v0, v0

    .line 14
    iget-object v2, p0, LK/o0$a;->c:Landroidx/compose/ui/layout/s;

    .line 15
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    .line 16
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
