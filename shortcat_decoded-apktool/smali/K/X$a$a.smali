.class final LK/X$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/X$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/W;


# direct methods
.method constructor <init>(LK/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/X$a$a;->a:LK/W;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/l;

    .line 2
    .line 3
    check-cast p2, LI0/A;

    .line 4
    .line 5
    check-cast p3, Li1/b;

    .line 6
    .line 7
    invoke-virtual {p3}, Li1/b;->r()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, p1, p2, v0, v1}, LK/X$a$a;->invoke-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invoke-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 13

    .line 1
    iget-object v0, p0, LK/X$a$a;->a:LK/W;

    .line 2
    .line 3
    invoke-virtual {v0}, LK/W;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Li1/r;->g(J)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-static {v2, v3, v4}, Loe/j;->m(III)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-static {v0, v1}, Li1/r;->f(J)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static/range {p3 .. p4}, Li1/b;->m(J)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v0, v1, v2}, Loe/j;->m(III)I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    const/16 v11, 0xa

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    move-wide/from16 v5, p3

    .line 45
    .line 46
    invoke-static/range {v5 .. v12}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-interface {p2, v0, v1}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    new-instance v4, LK/X$a$a$a;

    .line 63
    .line 64
    invoke-direct {v4, p2}, LK/X$a$a$a;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 65
    .line 66
    .line 67
    const/4 v5, 0x4

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    move-object v0, p1

    .line 71
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method
