.class public final Lx/b0;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:Landroidx/compose/foundation/o;

.field private b:Z

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/o;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/b0;->a:Landroidx/compose/foundation/o;

    .line 5
    .line 6
    iput-boolean p2, p0, Lx/b0;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lx/b0;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final E1()Landroidx/compose/foundation/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/b0;->a:Landroidx/compose/foundation/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/b0;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final H1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx/b0;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final I1(Landroidx/compose/foundation/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/b0;->a:Landroidx/compose/foundation/o;

    .line 2
    .line 3
    return-void
.end method

.method public final J1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public maxIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p2, p3}, LI0/l;->I(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const p1, 0x7fffffff

    .line 11
    .line 12
    .line 13
    invoke-interface {p2, p1}, LI0/l;->I(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public maxIntrinsicWidth(LI0/m;LI0/l;I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const p1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, p1}, LI0/l;->q0(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-interface {p2, p3}, LI0/l;->q0(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lz/q;->a:Lz/q;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lz/q;->b:Lz/q;

    .line 9
    .line 10
    :goto_0
    invoke-static {p3, p4, v0}, Lx/j;->a(JLz/q;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v7, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-static {p3, p4}, Li1/b;->k(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    move v7, v0

    .line 27
    :goto_1
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :cond_2
    move v5, v1

    .line 36
    const/4 v8, 0x5

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    move-wide v2, p3

    .line 41
    invoke-static/range {v2 .. v9}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-static {v2, v3}, Li1/b;->l(J)I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    invoke-static {p3, p4}, Loe/j;->i(II)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    invoke-static {v2, v3}, Li1/b;->k(J)I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    invoke-static {p3, p4}, Loe/j;->i(II)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    sub-int/2addr p3, v2

    .line 78
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 79
    .line 80
    .line 81
    move-result p4

    .line 82
    sub-int/2addr p4, v1

    .line 83
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move p3, p4

    .line 89
    :goto_2
    iget-object p4, p0, Lx/b0;->a:Landroidx/compose/foundation/o;

    .line 90
    .line 91
    invoke-virtual {p4, p3}, Landroidx/compose/foundation/o;->n(I)V

    .line 92
    .line 93
    .line 94
    iget-object p4, p0, Lx/b0;->a:Landroidx/compose/foundation/o;

    .line 95
    .line 96
    iget-boolean v0, p0, Lx/b0;->c:Z

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    move v0, v2

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move v0, v1

    .line 103
    :goto_3
    invoke-virtual {p4, v0}, Landroidx/compose/foundation/o;->p(I)V

    .line 104
    .line 105
    .line 106
    new-instance v4, Lx/b0$a;

    .line 107
    .line 108
    invoke-direct {v4, p0, p3, p2}, Lx/b0$a;-><init>(Lx/b0;ILandroidx/compose/ui/layout/s;)V

    .line 109
    .line 110
    .line 111
    const/4 v5, 0x4

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v3, 0x0

    .line 114
    move-object v0, p1

    .line 115
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1
.end method

.method public minIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p2, p3}, LI0/l;->Z(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const p1, 0x7fffffff

    .line 11
    .line 12
    .line 13
    invoke-interface {p2, p1}, LI0/l;->Z(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public minIntrinsicWidth(LI0/m;LI0/l;I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lx/b0;->c:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const p1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, p1}, LI0/l;->l0(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-interface {p2, p3}, LI0/l;->l0(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
