.class final Landroidx/compose/ui/graphics/i$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/graphics/i;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:Landroidx/compose/ui/graphics/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/graphics/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/i$b;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/graphics/i$b;->b:Landroidx/compose/ui/graphics/i;

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/graphics/i$b;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    .line 2
    iget-object v1, p0, Landroidx/compose/ui/graphics/i$b;->a:Landroidx/compose/ui/layout/s;

    iget-object v0, p0, Landroidx/compose/ui/graphics/i$b;->b:Landroidx/compose/ui/graphics/i;

    invoke-static {v0}, Landroidx/compose/ui/graphics/i;->E1(Landroidx/compose/ui/graphics/i;)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/s$a;->v0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
