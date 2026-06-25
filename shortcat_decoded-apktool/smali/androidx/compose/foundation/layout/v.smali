.class final Landroidx/compose/foundation/layout/v;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:LC/n;

.field private b:Z

.field private c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LC/n;ZLkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/layout/v;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/layout/v;->c:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final E1()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/v;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/v;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method public final G1(LC/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 2
    .line 3
    return-void
.end method

.method public final H1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/v;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 2
    .line 3
    sget-object v2, LC/n;->a:LC/n;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eq v0, v2, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    iget-object v4, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 15
    .line 16
    sget-object v5, LC/n;->b:LC/n;

    .line 17
    .line 18
    if-eq v4, v5, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static/range {p3 .. p4}, Li1/b;->m(J)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    iget-object v4, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 26
    .line 27
    const v6, 0x7fffffff

    .line 28
    .line 29
    .line 30
    if-eq v4, v2, :cond_2

    .line 31
    .line 32
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/v;->b:Z

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move v2, v6

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_2
    iget-object v4, p0, Landroidx/compose/foundation/layout/v;->a:LC/n;

    .line 43
    .line 44
    if-eq v4, v5, :cond_3

    .line 45
    .line 46
    iget-boolean v4, p0, Landroidx/compose/foundation/layout/v;->b:Z

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    :goto_3
    invoke-static {v0, v2, v3, v6}, Li1/c;->a(IIII)J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-interface {p2, v2, v3}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->W0()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-static {v0, v2, v4}, Loe/j;->m(III)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->P0()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static/range {p3 .. p4}, Li1/b;->m(J)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-static {v0, v4, v5}, Loe/j;->m(III)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    new-instance v0, Landroidx/compose/foundation/layout/v$a;

    .line 96
    .line 97
    move-object v1, p0

    .line 98
    move-object v5, p1

    .line 99
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/v$a;-><init>(Landroidx/compose/foundation/layout/v;ILandroidx/compose/ui/layout/s;ILandroidx/compose/ui/layout/l;)V

    .line 100
    .line 101
    .line 102
    const/4 v10, 0x4

    .line 103
    const/4 v11, 0x0

    .line 104
    const/4 v8, 0x0

    .line 105
    move-object v9, v0

    .line 106
    move v6, v2

    .line 107
    move v7, v4

    .line 108
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0
.end method
