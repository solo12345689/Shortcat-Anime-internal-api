.class final Landroidx/compose/foundation/layout/g$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/g;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:LI0/A;

.field final synthetic c:Landroidx/compose/ui/layout/l;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Landroidx/compose/foundation/layout/g;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;LI0/A;Landroidx/compose/ui/layout/l;IILandroidx/compose/foundation/layout/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/g$b;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/layout/g$b;->b:LI0/A;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/g$b;->c:Landroidx/compose/ui/layout/l;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/foundation/layout/g$b;->d:I

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/foundation/layout/g$b;->e:I

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/layout/g$b;->f:Landroidx/compose/foundation/layout/g;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/g$b;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 7

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/layout/g$b;->a:Landroidx/compose/ui/layout/s;

    iget-object v2, p0, Landroidx/compose/foundation/layout/g$b;->b:LI0/A;

    iget-object v0, p0, Landroidx/compose/foundation/layout/g$b;->c:Landroidx/compose/ui/layout/l;

    invoke-interface {v0}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v3

    iget v4, p0, Landroidx/compose/foundation/layout/g$b;->d:I

    iget v5, p0, Landroidx/compose/foundation/layout/g$b;->e:I

    iget-object v0, p0, Landroidx/compose/foundation/layout/g$b;->f:Landroidx/compose/foundation/layout/g;

    invoke-static {v0}, Landroidx/compose/foundation/layout/g;->a(Landroidx/compose/foundation/layout/g;)Ll0/e;

    move-result-object v6

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/f;->c(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;LI0/A;Li1/t;IILl0/e;)V

    return-void
.end method
