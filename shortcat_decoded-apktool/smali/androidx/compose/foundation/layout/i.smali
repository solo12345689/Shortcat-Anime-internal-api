.class final Landroidx/compose/foundation/layout/i;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:LC/n;

.field private b:F


# direct methods
.method public constructor <init>(LC/n;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/i;->a:LC/n;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/foundation/layout/i;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final E1(LC/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/i;->a:LC/n;

    .line 2
    .line 3
    return-void
.end method

.method public final F1(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/i;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 7

    .line 1
    invoke-static {p3, p4}, Li1/b;->h(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/layout/i;->a:LC/n;

    .line 8
    .line 9
    sget-object v1, LC/n;->a:LC/n;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    iget v1, p0, Landroidx/compose/foundation/layout/i;->b:F

    .line 19
    .line 20
    mul-float/2addr v0, v1

    .line 21
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p3, p4}, Li1/b;->n(J)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v0, v1, v2}, Loe/j;->m(III)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    move v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p3, p4}, Li1/b;->n(J)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    invoke-static {p3, p4}, Li1/b;->g(J)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/compose/foundation/layout/i;->a:LC/n;

    .line 54
    .line 55
    sget-object v3, LC/n;->b:LC/n;

    .line 56
    .line 57
    if-eq v2, v3, :cond_1

    .line 58
    .line 59
    invoke-static {p3, p4}, Li1/b;->k(J)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    int-to-float v2, v2

    .line 64
    iget v3, p0, Landroidx/compose/foundation/layout/i;->b:F

    .line 65
    .line 66
    mul-float/2addr v2, v3

    .line 67
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {p3, p4}, Li1/b;->m(J)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {p3, p4}, Li1/b;->k(J)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-static {v2, v3, p3}, Loe/j;->m(III)I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    move p4, p3

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-static {p3, p4}, Li1/b;->m(J)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-static {p3, p4}, Li1/b;->k(J)I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    move p4, p3

    .line 94
    move p3, v2

    .line 95
    :goto_1
    invoke-static {v0, v1, p3, p4}, Li1/c;->a(IIII)J

    .line 96
    .line 97
    .line 98
    move-result-wide p3

    .line 99
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    new-instance v4, Landroidx/compose/foundation/layout/i$a;

    .line 112
    .line 113
    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/i$a;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 114
    .line 115
    .line 116
    const/4 v5, 0x4

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v3, 0x0

    .line 119
    move-object v0, p1

    .line 120
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1
.end method
