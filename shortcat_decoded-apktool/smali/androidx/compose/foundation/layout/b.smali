.class final Landroidx/compose/foundation/layout/b;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:LI0/a;

.field private b:F

.field private c:F


# direct methods
.method private constructor <init>(LI0/a;FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->a:LI0/a;

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/b;->b:F

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/b;->c:F

    return-void
.end method

.method public synthetic constructor <init>(LI0/a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/b;-><init>(LI0/a;FF)V

    return-void
.end method


# virtual methods
.method public final E1(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/b;->c:F

    .line 2
    .line 3
    return-void
.end method

.method public final F1(LI0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->a:LI0/a;

    .line 2
    .line 3
    return-void
.end method

.method public final G1(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/b;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 7

    .line 1
    iget-object v1, p0, Landroidx/compose/foundation/layout/b;->a:LI0/a;

    .line 2
    .line 3
    iget v2, p0, Landroidx/compose/foundation/layout/b;->b:F

    .line 4
    .line 5
    iget v3, p0, Landroidx/compose/foundation/layout/b;->c:F

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->a(Landroidx/compose/ui/layout/l;LI0/a;FFLI0/A;J)LI0/C;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
