.class final Landroidx/compose/foundation/layout/v$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/v;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/layout/v;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/s;

.field final synthetic d:I

.field final synthetic e:Landroidx/compose/ui/layout/l;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/v;ILandroidx/compose/ui/layout/s;ILandroidx/compose/ui/layout/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/v$a;->a:Landroidx/compose/foundation/layout/v;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/layout/v$a;->b:I

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/v$a;->c:Landroidx/compose/ui/layout/s;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/foundation/layout/v$a;->d:I

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/layout/v$a;->e:Landroidx/compose/ui/layout/l;

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/v$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/layout/v$a;->a:Landroidx/compose/foundation/layout/v;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/v;->E1()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 3
    iget v1, p0, Landroidx/compose/foundation/layout/v$a;->b:I

    iget-object v2, p0, Landroidx/compose/foundation/layout/v$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Landroidx/compose/foundation/layout/v$a;->d:I

    iget-object v3, p0, Landroidx/compose/foundation/layout/v$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Li1/s;->a(II)J

    move-result-wide v1

    invoke-static {v1, v2}, Li1/r;->b(J)Li1/r;

    move-result-object v1

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/layout/v$a;->e:Landroidx/compose/ui/layout/l;

    invoke-interface {v2}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v2

    .line 5
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/n;

    invoke-virtual {v0}, Li1/n;->q()J

    move-result-wide v3

    .line 6
    iget-object v2, p0, Landroidx/compose/foundation/layout/v$a;->c:Landroidx/compose/ui/layout/s;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->U(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFILjava/lang/Object;)V

    return-void
.end method
