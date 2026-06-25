.class final Landroidx/compose/foundation/layout/r;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;


# instance fields
.field private a:LC/A;


# direct methods
.method public constructor <init>(LC/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E1()LC/A;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1(LC/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 2
    .line 3
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, LC/A;->b(Li1/t;)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    int-to-float v1, v1

    .line 13
    invoke-static {v1}, Li1/h;->n(F)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v0, v2}, Li1/h;->m(FF)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 24
    .line 25
    invoke-interface {v0}, LC/A;->d()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v1}, Li1/h;->n(F)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v0, v2}, Li1/h;->m(FF)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ltz v0, :cond_0

    .line 38
    .line 39
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 40
    .line 41
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v0, v2}, LC/A;->a(Li1/t;)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v1}, Li1/h;->n(F)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v0, v2}, Li1/h;->m(FF)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ltz v0, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 60
    .line 61
    invoke-interface {v0}, LC/A;->c()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v1}, Li1/h;->n(F)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v0, v1}, Li1/h;->m(FF)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-ltz v0, :cond_0

    .line 74
    .line 75
    iget-object v0, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 76
    .line 77
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, v1}, LC/A;->b(Li1/t;)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-interface {p1, v0}, Li1/d;->s0(F)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v1, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 90
    .line 91
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v1, v2}, LC/A;->a(Li1/t;)F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-interface {p1, v1}, Li1/d;->s0(F)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    iget-object v1, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 105
    .line 106
    invoke-interface {v1}, LC/A;->d()F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-interface {p1, v1}, Li1/d;->s0(F)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iget-object v2, p0, Landroidx/compose/foundation/layout/r;->a:LC/A;

    .line 115
    .line 116
    invoke-interface {v2}, LC/A;->c()F

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-interface {p1, v2}, Li1/d;->s0(F)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    add-int/2addr v1, v2

    .line 125
    neg-int v2, v0

    .line 126
    neg-int v3, v1

    .line 127
    invoke-static {p3, p4, v2, v3}, Li1/c;->j(JII)J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    invoke-interface {p2, v2, v3}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    add-int/2addr v2, v0

    .line 140
    invoke-static {p3, p4, v2}, Li1/c;->g(JI)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    add-int/2addr v0, v1

    .line 149
    invoke-static {p3, p4, v0}, Li1/c;->f(JI)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    new-instance v7, Landroidx/compose/foundation/layout/r$a;

    .line 154
    .line 155
    invoke-direct {v7, p2, p1, p0}, Landroidx/compose/foundation/layout/r$a;-><init>(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;Landroidx/compose/foundation/layout/r;)V

    .line 156
    .line 157
    .line 158
    const/4 v8, 0x4

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    move-object v3, p1

    .line 162
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    const-string p2, "Padding must be non-negative"

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1
.end method
