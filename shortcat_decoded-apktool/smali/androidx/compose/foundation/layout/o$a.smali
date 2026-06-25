.class final Landroidx/compose/foundation/layout/o$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/o;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/layout/o;

.field final synthetic b:Landroidx/compose/ui/layout/s;

.field final synthetic c:Landroidx/compose/ui/layout/l;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/o;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/layout/o$a;->b:Landroidx/compose/ui/layout/s;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/o$a;->c:Landroidx/compose/ui/layout/l;

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

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/o$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 16

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/o;->E1()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v3, v0, Landroidx/compose/foundation/layout/o$a;->b:Landroidx/compose/ui/layout/s;

    iget-object v1, v0, Landroidx/compose/foundation/layout/o$a;->c:Landroidx/compose/ui/layout/l;

    iget-object v2, v0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/o;->F1()F

    move-result v2

    invoke-interface {v1, v2}, Li1/d;->s0(F)I

    move-result v4

    iget-object v1, v0, Landroidx/compose/foundation/layout/o$a;->c:Landroidx/compose/ui/layout/l;

    iget-object v2, v0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/o;->G1()F

    move-result v2

    invoke-interface {v1, v2}, Li1/d;->s0(F)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v10, v0, Landroidx/compose/foundation/layout/o$a;->b:Landroidx/compose/ui/layout/s;

    iget-object v1, v0, Landroidx/compose/foundation/layout/o$a;->c:Landroidx/compose/ui/layout/l;

    iget-object v2, v0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/o;->F1()F

    move-result v2

    invoke-interface {v1, v2}, Li1/d;->s0(F)I

    move-result v11

    iget-object v1, v0, Landroidx/compose/foundation/layout/o$a;->c:Landroidx/compose/ui/layout/l;

    iget-object v2, v0, Landroidx/compose/foundation/layout/o$a;->a:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/o;->G1()F

    move-result v2

    invoke-interface {v1, v2}, Li1/d;->s0(F)I

    move-result v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
