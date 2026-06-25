.class final Landroidx/compose/foundation/layout/o;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:F

.field private b:F

.field private c:Z


# direct methods
.method private constructor <init>(FFZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/o;->a:F

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/o;->b:F

    .line 5
    iput-boolean p3, p0, Landroidx/compose/foundation/layout/o;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/o;-><init>(FFZ)V

    return-void
.end method


# virtual methods
.method public final E1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/o;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F1()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/o;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public final G1()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/o;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final H1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/o;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public final I1(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/o;->a:F

    .line 2
    .line 3
    return-void
.end method

.method public final J1(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/o;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    new-instance v4, Landroidx/compose/foundation/layout/o$a;

    .line 14
    .line 15
    invoke-direct {v4, p0, p2, p1}, Landroidx/compose/foundation/layout/o$a;-><init>(Landroidx/compose/foundation/layout/o;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v0, p1

    .line 22
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
