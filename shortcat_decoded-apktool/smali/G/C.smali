.class public abstract LG/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# instance fields
.field private final A:LY/C0;

.field private final B:LI0/L;

.field private C:J

.field private final D:LF/B;

.field private final E:LY/C0;

.field private final F:LY/C0;

.field private final G:LY/C0;

.field private final H:LY/C0;

.field private final I:LY/C0;

.field private final J:LY/C0;

.field private final a:LY/C0;

.field private final b:LF/f;

.field private final c:LG/x;

.field private d:I

.field private e:I

.field private f:J

.field private g:J

.field private h:F

.field private i:F

.field private final j:Lz/x;

.field private k:I

.field private l:I

.field private m:Z

.field private n:I

.field private o:Landroidx/compose/foundation/lazy/layout/d$b;

.field private p:Z

.field private q:LY/C0;

.field private r:Li1/d;

.field private final s:LB/m;

.field private final t:LY/A0;

.field private final u:LY/A0;

.field private final v:LY/h2;

.field private final w:LY/h2;

.field private final x:Landroidx/compose/foundation/lazy/layout/d;

.field private final y:LF/h;

.field private final z:LF/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IF)V
    .locals 1

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, LG/C;-><init>(IFLF/N;)V

    return-void
.end method

.method public constructor <init>(IFLF/N;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    float-to-double v0, p2

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 2
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    invoke-virtual {v0}, Lr0/f$a;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v0

    iput-object v0, p0, LG/C;->a:LY/C0;

    .line 3
    invoke-static {p0}, LG/q;->a(LG/C;)LF/f;

    move-result-object v0

    iput-object v0, p0, LG/C;->b:LF/f;

    .line 4
    new-instance v0, LG/x;

    invoke-direct {v0, p1, p2, p0}, LG/x;-><init>(IFLG/C;)V

    iput-object v0, p0, LG/C;->c:LG/x;

    .line 5
    iput p1, p0, LG/C;->d:I

    const-wide v3, 0x7fffffffffffffffL

    .line 6
    iput-wide v3, p0, LG/C;->f:J

    .line 7
    new-instance p2, LG/C$f;

    invoke-direct {p2, p0}, LG/C$f;-><init>(LG/C;)V

    invoke-static {p2}, Lz/y;->a(Lkotlin/jvm/functions/Function1;)Lz/x;

    move-result-object p2

    iput-object p2, p0, LG/C;->j:Lz/x;

    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, LG/C;->m:Z

    const/4 v3, -0x1

    .line 9
    iput v3, p0, LG/C;->n:I

    .line 10
    invoke-static {}, LG/D;->j()LG/u;

    move-result-object v4

    invoke-static {}, LY/U1;->j()LY/T1;

    move-result-object v5

    invoke-static {v4, v5}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    move-result-object v4

    iput-object v4, p0, LG/C;->q:LY/C0;

    .line 11
    invoke-static {}, LG/D;->c()LG/D$b;

    move-result-object v4

    iput-object v4, p0, LG/C;->r:Li1/d;

    .line 12
    invoke-static {}, LB/l;->a()LB/m;

    move-result-object v4

    iput-object v4, p0, LG/C;->s:LB/m;

    .line 13
    invoke-static {v3}, LY/J1;->a(I)LY/A0;

    move-result-object v3

    iput-object v3, p0, LG/C;->t:LY/A0;

    .line 14
    invoke-static {p1}, LY/J1;->a(I)LY/A0;

    move-result-object p1

    iput-object p1, p0, LG/C;->u:LY/A0;

    .line 15
    invoke-static {}, LY/U1;->q()LY/T1;

    move-result-object p1

    new-instance v3, LG/C$g;

    invoke-direct {v3, p0}, LG/C$g;-><init>(LG/C;)V

    invoke-static {p1, v3}, LY/U1;->c(LY/T1;Lie/a;)LY/h2;

    move-result-object p1

    iput-object p1, p0, LG/C;->v:LY/h2;

    .line 16
    invoke-static {}, LY/U1;->q()LY/T1;

    move-result-object p1

    new-instance v3, LG/C$h;

    invoke-direct {v3, p0}, LG/C$h;-><init>(LG/C;)V

    invoke-static {p1, v3}, LY/U1;->c(LY/T1;Lie/a;)LY/h2;

    move-result-object p1

    iput-object p1, p0, LG/C;->w:LY/h2;

    .line 17
    new-instance p1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-direct {p1, p3, v1, v2, v1}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LF/N;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LG/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    .line 18
    new-instance p1, LF/h;

    invoke-direct {p1}, LF/h;-><init>()V

    iput-object p1, p0, LG/C;->y:LF/h;

    .line 19
    new-instance p1, LF/b;

    invoke-direct {p1}, LF/b;-><init>()V

    iput-object p1, p0, LG/C;->z:LF/b;

    .line 20
    invoke-static {v1, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LG/C;->A:LY/C0;

    .line 21
    new-instance p1, LG/C$c;

    invoke-direct {p1, p0}, LG/C$c;-><init>(LG/C;)V

    iput-object p1, p0, LG/C;->B:LI0/L;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 22
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v3

    iput-wide v3, p0, LG/C;->C:J

    .line 23
    new-instance p1, LF/B;

    invoke-direct {p1}, LF/B;-><init>()V

    iput-object p1, p0, LG/C;->D:LF/B;

    .line 24
    invoke-virtual {v0}, LG/x;->d()LF/y;

    .line 25
    invoke-static {v1, p2, v1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LG/C;->E:LY/C0;

    .line 26
    invoke-static {v1, p2, v1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LG/C;->F:LY/C0;

    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LG/C;->G:LY/C0;

    .line 28
    invoke-static {p1, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LG/C;->H:LY/C0;

    .line 29
    invoke-static {p1, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LG/C;->I:LY/C0;

    .line 30
    invoke-static {p1, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LG/C;->J:LY/C0;

    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "currentPageOffsetFraction "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is not within the range -0.5 to 0.5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final N()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->t:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/j0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final Q()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->u:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/j0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final S(F)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->C()LG/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LG/n;->a()Lz/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lz/q;->a:Lz/q;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, LG/C;->R()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Lr0/f;->n(J)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    neg-float v0, v0

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    cmpg-float p1, p1, v0

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0}, LG/C;->R()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Lr0/f;->m(J)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    neg-float v0, v0

    .line 48
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    cmpg-float p1, p1, v0

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-direct {p0}, LG/C;->T()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    :goto_0
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method private final T()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->R()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lr0/f;->m(J)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    float-to-int v0, v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LG/C;->R()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Lr0/f;->n(J)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    float-to-int v0, v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method private final V(FLG/n;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, LG/C;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    invoke-interface {p2}, LG/n;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_6

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    cmpl-float v0, p1, v0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    move v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p2}, LG/n;->i()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, LG/f;

    .line 37
    .line 38
    invoke-interface {v2}, LG/f;->getIndex()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-interface {p2}, LG/n;->k()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v2, v3

    .line 47
    add-int/2addr v2, v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-interface {p2}, LG/n;->i()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LG/f;

    .line 58
    .line 59
    invoke-interface {v2}, LG/f;->getIndex()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-interface {p2}, LG/n;->k()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    sub-int/2addr v2, v3

    .line 68
    sub-int/2addr v2, v1

    .line 69
    :goto_1
    if-ltz v2, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0}, LG/C;->F()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ge v2, v1, :cond_6

    .line 76
    .line 77
    iget v1, p0, LG/C;->n:I

    .line 78
    .line 79
    if-eq v2, v1, :cond_4

    .line 80
    .line 81
    iget-boolean v1, p0, LG/C;->p:Z

    .line 82
    .line 83
    if-eq v1, v0, :cond_3

    .line 84
    .line 85
    iget-object v1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    .line 90
    .line 91
    .line 92
    :cond_3
    iput-boolean v0, p0, LG/C;->p:Z

    .line 93
    .line 94
    iput v2, p0, LG/C;->n:I

    .line 95
    .line 96
    iget-object v1, p0, LG/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    .line 97
    .line 98
    iget-wide v3, p0, LG/C;->C:J

    .line 99
    .line 100
    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 105
    .line 106
    :cond_4
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-interface {p2}, LG/n;->i()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, LG/f;

    .line 117
    .line 118
    invoke-interface {p2}, LG/n;->h()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-interface {p2}, LG/n;->j()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-int/2addr v1, v2

    .line 127
    invoke-interface {v0}, LG/f;->getOffset()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    add-int/2addr v0, v1

    .line 132
    invoke-interface {p2}, LG/n;->d()I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    sub-int/2addr v0, p2

    .line 137
    int-to-float p2, v0

    .line 138
    cmpg-float p1, p2, p1

    .line 139
    .line 140
    if-gez p1, :cond_6

    .line 141
    .line 142
    iget-object p1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->a()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_5
    invoke-interface {p2}, LG/n;->i()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, LG/f;

    .line 159
    .line 160
    invoke-interface {p2}, LG/n;->f()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-interface {v0}, LG/f;->getOffset()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    sub-int/2addr p2, v0

    .line 169
    int-to-float p2, p2

    .line 170
    neg-float p1, p1

    .line 171
    cmpg-float p1, p2, p1

    .line 172
    .line 173
    if-gez p1, :cond_6

    .line 174
    .line 175
    iget-object p1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 176
    .line 177
    if-eqz p1, :cond_6

    .line 178
    .line 179
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->a()V

    .line 180
    .line 181
    .line 182
    :cond_6
    :goto_2
    return-void
.end method

.method private final W(F)F
    .locals 11

    .line 1
    invoke-static {p0}, LG/y;->a(LG/C;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, LG/C;->h:F

    .line 6
    .line 7
    add-float/2addr v2, p1

    .line 8
    invoke-static {v2}, Lke/a;->f(F)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    long-to-float v5, v3

    .line 13
    sub-float/2addr v2, v5

    .line 14
    iput v2, p0, LG/C;->h:F

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const v5, 0x38d1b717    # 1.0E-4f

    .line 21
    .line 22
    .line 23
    cmpg-float v2, v2, v5

    .line 24
    .line 25
    if-gez v2, :cond_0

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    add-long v5, v0, v3

    .line 29
    .line 30
    iget-wide v7, p0, LG/C;->g:J

    .line 31
    .line 32
    iget-wide v9, p0, LG/C;->f:J

    .line 33
    .line 34
    invoke-static/range {v5 .. v10}, Loe/j;->o(JJJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    cmp-long v4, v5, v2

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move v4, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v4, v5

    .line 47
    :goto_0
    sub-long/2addr v2, v0

    .line 48
    long-to-float v0, v2

    .line 49
    iput v0, p0, LG/C;->i:F

    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    const-wide/16 v9, 0x0

    .line 56
    .line 57
    cmp-long v1, v7, v9

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, LG/C;->I:LY/C0;

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    cmpl-float v8, v0, v7

    .line 65
    .line 66
    if-lez v8, :cond_2

    .line 67
    .line 68
    move v8, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v8, v5

    .line 71
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-interface {v1, v8}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, LG/C;->J:LY/C0;

    .line 79
    .line 80
    cmpg-float v0, v0, v7

    .line 81
    .line 82
    if-gez v0, :cond_3

    .line 83
    .line 84
    move v5, v6

    .line 85
    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v1, v0}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    iget-object v0, p0, LG/C;->q:LY/C0;

    .line 93
    .line 94
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, LG/u;

    .line 99
    .line 100
    long-to-int v1, v2

    .line 101
    neg-int v5, v1

    .line 102
    invoke-virtual {v0, v5}, LG/u;->s(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_5

    .line 107
    .line 108
    invoke-virtual {p0, v0, v6}, LG/C;->o(LG/u;Z)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, LG/C;->E:LY/C0;

    .line 112
    .line 113
    invoke-static {v0}, LF/J;->d(LY/C0;)V

    .line 114
    .line 115
    .line 116
    iget v0, p0, LG/C;->l:I

    .line 117
    .line 118
    add-int/2addr v0, v6

    .line 119
    iput v0, p0, LG/C;->l:I

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, LG/x;->a(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, LG/C;->O()LI0/K;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    invoke-interface {v0}, LI0/K;->i()V

    .line 134
    .line 135
    .line 136
    :cond_6
    iget v0, p0, LG/C;->k:I

    .line 137
    .line 138
    add-int/2addr v0, v6

    .line 139
    iput v0, p0, LG/C;->k:I

    .line 140
    .line 141
    :goto_2
    if-eqz v4, :cond_7

    .line 142
    .line 143
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_3

    .line 148
    :cond_7
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    return p1
.end method

.method static synthetic X(LG/C;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, LG/C$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LG/C$d;

    .line 7
    .line 8
    iget v1, v0, LG/C$d;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LG/C$d;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LG/C$d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LG/C$d;-><init>(LG/C;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LG/C$d;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LG/C$d;->f:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, LG/C$d;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, LG/C;

    .line 44
    .line 45
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    iget-object p0, v0, LG/C$d;->c:Ljava/lang/Object;

    .line 58
    .line 59
    move-object p2, p0

    .line 60
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    iget-object p0, v0, LG/C$d;->b:Ljava/lang/Object;

    .line 63
    .line 64
    move-object p1, p0

    .line 65
    check-cast p1, Lx/L;

    .line 66
    .line 67
    iget-object p0, v0, LG/C$d;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, LG/C;

    .line 70
    .line 71
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p0, v0, LG/C$d;->a:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p1, v0, LG/C$d;->b:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p2, v0, LG/C$d;->c:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, v0, LG/C$d;->f:I

    .line 85
    .line 86
    invoke-direct {p0, v0}, LG/C;->q(LZd/e;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    if-ne p3, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    :goto_1
    invoke-virtual {p0}, LG/C;->a()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-nez p3, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0}, LG/C;->v()I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-direct {p0, p3}, LG/C;->g0(I)V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget-object p3, p0, LG/C;->j:Lz/x;

    .line 107
    .line 108
    iput-object p0, v0, LG/C$d;->a:Ljava/lang/Object;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    iput-object v2, v0, LG/C$d;->b:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v2, v0, LG/C$d;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput v3, v0, LG/C$d;->f:I

    .line 116
    .line 117
    invoke-interface {p3, p1, p2, v0}, Lz/x;->b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v1, :cond_6

    .line 122
    .line 123
    :goto_2
    return-object v1

    .line 124
    :cond_6
    :goto_3
    const/4 p1, -0x1

    .line 125
    invoke-direct {p0, p1}, LG/C;->e0(I)V

    .line 126
    .line 127
    .line 128
    sget-object p0, LTd/L;->a:LTd/L;

    .line 129
    .line 130
    return-object p0
.end method

.method public static synthetic Z(LG/C;IFLZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LG/C;->Y(IFLZd/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: scrollToPage"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final a0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->H:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final b0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->G:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final e0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->t:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/A0;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final f0(LI0/K;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->A:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic g(LG/C;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG/C;->q(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->u:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/A0;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic h(LG/C;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG/C;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic i(LG/C;)I
    .locals 0

    .line 1
    invoke-direct {p0}, LG/C;->N()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic j(LG/C;)I
    .locals 0

    .line 1
    invoke-direct {p0}, LG/C;->Q()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final j0(LG/u;)V
    .locals 6

    .line 1
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/l$a;->d()Li0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    iget v4, p0, LG/C;->i:F

    .line 20
    .line 21
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/high16 v5, 0x3f000000    # 0.5f

    .line 26
    .line 27
    cmpl-float v4, v4, v5

    .line 28
    .line 29
    if-lez v4, :cond_1

    .line 30
    .line 31
    iget-boolean v4, p0, LG/C;->m:Z

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget v4, p0, LG/C;->i:F

    .line 36
    .line 37
    invoke-direct {p0, v4}, LG/C;->S(F)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget v4, p0, LG/C;->i:F

    .line 44
    .line 45
    invoke-direct {p0, v4, p1}, LG/C;->V(FLG/n;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    invoke-virtual {v0, v1, v3, v2}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public static final synthetic k(LG/C;F)F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG/C;->W(F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic l(LG/C;LI0/K;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG/C;->f0(LI0/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(LG/C;IFLw/i;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p6, :cond_2

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    move p2, v0

    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    const/4 p3, 0x7

    .line 14
    const/4 p5, 0x0

    .line 15
    invoke-static {v0, v0, p5, p3, p5}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LG/C;->m(IFLw/i;LZd/e;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: animateScrollToPage"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static synthetic p(LG/C;LG/u;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, LG/C;->o(LG/u;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: applyMeasureResult"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final q(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->z:LF/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF/b;->a(LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method

.method private final r(LG/n;)V
    .locals 2

    .line 1
    iget v0, p0, LG/C;->n:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    invoke-interface {p1}, LG/n;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, p0, LG/C;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, LG/n;->i()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LG/f;

    .line 29
    .line 30
    invoke-interface {v0}, LG/f;->getIndex()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p1}, LG/n;->k()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/2addr v0, p1

    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {p1}, LG/n;->i()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, LG/f;

    .line 51
    .line 52
    invoke-interface {v0}, LG/f;->getIndex()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-interface {p1}, LG/n;->k()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sub-int/2addr v0, p1

    .line 61
    add-int/lit8 v0, v0, -0x1

    .line 62
    .line 63
    :goto_0
    iget p1, p0, LG/C;->n:I

    .line 64
    .line 65
    if-eq p1, v0, :cond_2

    .line 66
    .line 67
    iput v1, p0, LG/C;->n:I

    .line 68
    .line 69
    iget-object p1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    .line 74
    .line 75
    .line 76
    :cond_1
    const/4 p1, 0x0

    .line 77
    iput-object p1, p0, LG/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method private final s(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->F()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LG/C;->F()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, Loe/j;->m(III)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return v1
.end method


# virtual methods
.method public final A()LB/m;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->s:LB/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->I:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final C()LG/n;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->q:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public final D()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->F:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Loe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/x;->d()LF/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Loe/f;

    .line 12
    .line 13
    return-object v0
.end method

.method public abstract F()I
.end method

.method public final G()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->q:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG/u;

    .line 8
    .line 9
    invoke-virtual {v0}, LG/u;->h()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final H()I
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LG/C;->I()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public final I()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->q:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG/u;

    .line 8
    .line 9
    invoke-virtual {v0}, LG/u;->j()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final J()LF/B;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->D:LF/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->E:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()F
    .locals 3

    .line 1
    iget-object v0, p0, LG/C;->r:Li1/d;

    .line 2
    .line 3
    invoke-static {}, LG/D;->i()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Li1/d;->l1(F)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, LG/C;->G()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    const/high16 v2, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float/2addr v1, v2

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, LG/C;->G()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    div-float/2addr v0, v1

    .line 29
    return v0
.end method

.method public final M()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()LI0/K;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->A:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LI0/K;

    .line 8
    .line 9
    return-object v0
.end method

.method public final P()LI0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->B:LI0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R()J
    .locals 2

    .line 1
    iget-object v0, p0, LG/C;->a:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr0/f;->u()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public final U(LG/r;I)I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LG/x;->e(LG/r;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final Y(IFLZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v2, LG/C$e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, p2, p1, v0}, LG/C$e;-><init>(LG/C;FILZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p3

    .line 12
    invoke-static/range {v0 .. v5}, Lz/x;->d(Lz/x;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->j:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LG/C;->X(LG/C;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->H:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final c0(Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/C;->r:Li1/d;

    .line 2
    .line 3
    return-void
.end method

.method public final d0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LG/C;->C:J

    .line 2
    .line 3
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->G:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public f(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->j:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz/x;->f(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final h0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->a:LY/C0;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lr0/f;->d(J)Lr0/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final i0(IFZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LG/x;->f(IF)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, LG/C;->O()LI0/K;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, LI0/K;->i()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    iget-object p1, p0, LG/C;->F:LY/C0;

    .line 19
    .line 20
    invoke-static {p1}, LF/J;->d(LY/C0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final k0(Lz/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LG/C;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p1}, LG/C;->e0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m(IFLw/i;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, LG/C$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LG/C$a;

    .line 7
    .line 8
    iget v1, v0, LG/C$a;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LG/C$a;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, LG/C$a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, LG/C$a;-><init>(LG/C;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, LG/C$a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, LG/C$a;->g:I

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget p2, v6, LG/C$a;->d:F

    .line 57
    .line 58
    iget p1, v6, LG/C$a;->c:I

    .line 59
    .line 60
    iget-object p3, v6, LG/C$a;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p3, Lw/i;

    .line 63
    .line 64
    iget-object v1, v6, LG/C$a;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, LG/C;

    .line 67
    .line 68
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    move-object v4, p3

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, LG/C;->v()I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    if-ne p1, p4, :cond_4

    .line 81
    .line 82
    invoke-virtual {p0}, LG/C;->w()F

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    cmpg-float p4, p4, p2

    .line 87
    .line 88
    if-nez p4, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    invoke-virtual {p0}, LG/C;->F()I

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    if-nez p4, :cond_5

    .line 96
    .line 97
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_5
    iput-object p0, v6, LG/C$a;->a:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object p3, v6, LG/C$a;->b:Ljava/lang/Object;

    .line 103
    .line 104
    iput p1, v6, LG/C$a;->c:I

    .line 105
    .line 106
    iput p2, v6, LG/C$a;->d:F

    .line 107
    .line 108
    iput v3, v6, LG/C$a;->g:I

    .line 109
    .line 110
    invoke-direct {p0, v6}, LG/C;->q(LZd/e;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    if-ne p4, v0, :cond_6

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    move-object v1, p0

    .line 118
    goto :goto_2

    .line 119
    :goto_4
    float-to-double p3, p2

    .line 120
    const-wide/high16 v7, -0x4020000000000000L    # -0.5

    .line 121
    .line 122
    cmpg-double v3, v7, p3

    .line 123
    .line 124
    if-gtz v3, :cond_8

    .line 125
    .line 126
    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    .line 127
    .line 128
    cmpg-double p3, p3, v7

    .line 129
    .line 130
    if-gtz p3, :cond_8

    .line 131
    .line 132
    invoke-direct {v1, p1}, LG/C;->s(I)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-virtual {v1}, LG/C;->H()I

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    int-to-float p3, p3

    .line 141
    mul-float v3, p2, p3

    .line 142
    .line 143
    move-object p2, v1

    .line 144
    iget-object v1, p2, LG/C;->b:LF/f;

    .line 145
    .line 146
    new-instance v5, LG/C$b;

    .line 147
    .line 148
    invoke-direct {v5, p2}, LG/C$b;-><init>(LG/C;)V

    .line 149
    .line 150
    .line 151
    const/4 p2, 0x0

    .line 152
    iput-object p2, v6, LG/C$a;->a:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object p2, v6, LG/C$a;->b:Ljava/lang/Object;

    .line 155
    .line 156
    iput v2, v6, LG/C$a;->g:I

    .line 157
    .line 158
    move v2, p1

    .line 159
    invoke-static/range {v1 .. v6}, LG/D;->a(LF/f;IFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-ne p1, v0, :cond_7

    .line 164
    .line 165
    :goto_5
    return-object v0

    .line 166
    :cond_7
    :goto_6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string p3, "pageOffsetFraction "

    .line 175
    .line 176
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p2, " is not within the range -0.5 to 0.5"

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p2
.end method

.method public final o(LG/u;Z)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, LG/C;->c:LG/x;

    .line 4
    .line 5
    invoke-virtual {p1}, LG/u;->p()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p2, v0}, LG/x;->j(F)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p2, p0, LG/C;->c:LG/x;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, LG/x;->k(LG/u;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, LG/C;->r(LG/n;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p2, p0, LG/C;->q:LY/C0;

    .line 22
    .line 23
    invoke-interface {p2, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, LG/u;->n()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-direct {p0, p2}, LG/C;->b0(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, LG/u;->m()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-direct {p0, p2}, LG/C;->a0(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, LG/u;->q()LG/e;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p2}, LG/e;->getIndex()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput p2, p0, LG/C;->d:I

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, LG/u;->r()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput p2, p0, LG/C;->e:I

    .line 57
    .line 58
    invoke-direct {p0, p1}, LG/C;->j0(LG/u;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, LG/C;->F()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-static {p1, p2}, LG/D;->g(LG/n;I)J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    iput-wide v0, p0, LG/C;->f:J

    .line 70
    .line 71
    invoke-virtual {p0}, LG/C;->F()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {p1, p2}, LG/D;->b(LG/u;I)J

    .line 76
    .line 77
    .line 78
    move-result-wide p1

    .line 79
    iput-wide p1, p0, LG/C;->g:J

    .line 80
    .line 81
    return-void
.end method

.method public final t()LF/b;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->z:LF/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()LF/h;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->y:LF/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/x;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final w()F
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->c:LG/x;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/x;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final x()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LG/C;->r:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()I
    .locals 1

    .line 1
    iget v0, p0, LG/C;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final z()I
    .locals 1

    .line 1
    iget v0, p0, LG/C;->e:I

    .line 2
    .line 3
    return v0
.end method
