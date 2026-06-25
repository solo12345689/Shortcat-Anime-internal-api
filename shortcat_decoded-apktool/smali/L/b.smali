.class public final LL/b;
.super LL/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LL/a;-><init>(Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 11

    .line 1
    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->b()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1, v0}, Li1/d;->s0(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->a()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p1, v1}, Li1/d;->s0(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    mul-int/lit8 v2, v1, 0x2

    .line 18
    .line 19
    mul-int/lit8 v3, v0, 0x2

    .line 20
    .line 21
    invoke-static {p3, p4, v2, v3}, Li1/c;->j(JII)J

    .line 22
    .line 23
    .line 24
    move-result-wide p3

    .line 25
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    sub-int v6, p3, v3

    .line 34
    .line 35
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    sub-int v5, p3, v2

    .line 40
    .line 41
    new-instance v8, LL/b$a;

    .line 42
    .line 43
    invoke-direct {v8, p2, v1, v0}, LL/b$a;-><init>(Landroidx/compose/ui/layout/s;II)V

    .line 44
    .line 45
    .line 46
    const/4 v9, 0x4

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    move-object v4, p1

    .line 50
    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public u1()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
