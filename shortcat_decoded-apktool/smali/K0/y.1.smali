.class public final LK0/y;
.super LK0/e0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/y$a;,
        LK0/y$b;
    }
.end annotation


# static fields
.field public static final x0:LK0/y$a;

.field private static final y0:Ls0/k1;


# instance fields
.field private final v0:LK0/E0;

.field private w0:LK0/U;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LK0/y$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK0/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/y;->x0:LK0/y$a;

    .line 8
    .line 9
    invoke-static {}, Ls0/Q;->a()Ls0/k1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ls0/r0$a;->h()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-interface {v0, v1, v2}, Ls0/k1;->p(J)V

    .line 20
    .line 21
    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ls0/k1;->A(F)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Ls0/l1;->a:Ls0/l1$a;

    .line 28
    .line 29
    invoke-virtual {v1}, Ls0/l1$a;->b()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-interface {v0, v1}, Ls0/k1;->z(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LK0/y;->y0:Ls0/k1;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(LK0/J;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LK0/e0;-><init>(LK0/J;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LK0/E0;

    .line 5
    .line 6
    invoke-direct {v0}, LK0/E0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LK0/y;->v0:LK0/E0;

    .line 10
    .line 11
    invoke-virtual {p0}, LK0/y;->K3()LK0/E0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0}, Landroidx/compose/ui/e$c;->updateCoordinator$ui_release(LK0/e0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance p1, LK0/y$b;

    .line 25
    .line 26
    invoke-direct {p1, p0}, LK0/y$b;-><init>(LK0/y;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    iput-object p1, p0, LK0/y;->w0:LK0/U;

    .line 32
    .line 33
    return-void
.end method

.method private final L3()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/T;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LK0/J;->l0()LK0/X;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, LK0/X;->h2()V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public I(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->h1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public I2()LK0/U;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/y;->w0:LK0/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public K3()LK0/E0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/y;->v0:LK0/E0;

    .line 2
    .line 3
    return-object v0
.end method

.method protected M3(LK0/U;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/y;->w0:LK0/U;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic N2()Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/y;->K3()LK0/E0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public X2(LK0/e0$f;JLK0/w;IZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, LK0/e0$f;->d(LK0/J;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p2, p3}, LK0/e0;->J3(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v6, p5

    .line 20
    move/from16 v5, p6

    .line 21
    .line 22
    :goto_0
    move v0, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object v0, LE0/Q;->a:LE0/Q$a;

    .line 25
    .line 26
    invoke-virtual {v0}, LE0/Q$a;->d()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    move v6, p5

    .line 31
    invoke-static {p5, v0}, LE0/Q;->g(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, LK0/e0;->J2()J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    invoke-virtual {p0, p2, p3, v7, v8}, LK0/e0;->t2(JJ)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const v7, 0x7fffffff

    .line 50
    .line 51
    .line 52
    and-int/2addr v0, v7

    .line 53
    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 54
    .line 55
    if-ge v0, v7, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v6, p5

    .line 59
    :cond_2
    move v0, v5

    .line 60
    move/from16 v5, p6

    .line 61
    .line 62
    :goto_1
    if-eqz v0, :cond_6

    .line 63
    .line 64
    invoke-static {p4}, LK0/w;->e(LK0/w;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, LK0/J;->H0()La0/c;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v8, v0, La0/c;->a:[Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v0}, La0/c;->p()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    sub-int/2addr v0, v4

    .line 83
    move v9, v0

    .line 84
    :goto_2
    if-ltz v9, :cond_5

    .line 85
    .line 86
    aget-object v0, v8, v9

    .line 87
    .line 88
    check-cast v0, LK0/J;

    .line 89
    .line 90
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_4

    .line 95
    .line 96
    move v1, v6

    .line 97
    move v6, v5

    .line 98
    move v5, v1

    .line 99
    move-wide v2, p2

    .line 100
    move-object v4, p4

    .line 101
    move-object v1, v0

    .line 102
    move-object v0, p1

    .line 103
    invoke-interface/range {v0 .. v6}, LK0/e0$f;->c(LK0/J;JLK0/w;IZ)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p4}, LK0/w;->u()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, LK0/e0;->x3()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    invoke-virtual {p4}, LK0/w;->b()V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move v6, v5

    .line 128
    :goto_3
    add-int/lit8 v9, v9, -0x1

    .line 129
    .line 130
    move v5, v6

    .line 131
    move v6, p5

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    invoke-static {p4, v7}, LK0/w;->l(LK0/w;I)V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void
.end method

.method protected Y0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LK0/e0;->Y0(JFLkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LK0/y;->L3()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Z(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->l1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method protected a1(JFLv0/c;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LK0/e0;->a1(JFLv0/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LK0/y;->L3()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public l0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->m1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public m3(Ls0/j0;Lv0/c;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LK0/J;->H0()La0/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v1, La0/c;->a:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v1}, La0/c;->p()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    aget-object v4, v2, v3

    .line 27
    .line 28
    check-cast v4, LK0/J;

    .line 29
    .line 30
    invoke-virtual {v4}, LK0/J;->p()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-virtual {v4, p1, p2}, LK0/J;->I(Ls0/j0;Lv0/c;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0}, LK0/p0;->getShowLayoutBounds()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    sget-object p2, LK0/y;->y0:Ls0/k1;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, LK0/e0;->v2(Ls0/j0;Ls0/k1;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public q0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->i1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public v0(J)Landroidx/compose/ui/layout/s;
    .locals 5

    .line 1
    invoke-virtual {p0}, LK0/e0;->E2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/y;->I2()LK0/U;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LK0/U;->h2()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    :cond_0
    invoke-static {p0, p1, p2}, LK0/e0;->p2(LK0/e0;J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v0}, La0/c;->p()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    if-ge v2, v0, :cond_1

    .line 37
    .line 38
    aget-object v3, v1, v2

    .line 39
    .line 40
    check-cast v3, LK0/J;

    .line 41
    .line 42
    invoke-virtual {v3}, LK0/J;->l0()LK0/X;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    sget-object v4, LK0/J$g;->c:LK0/J$g;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, LK0/X;->p2(LK0/J$g;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, LK0/J;->n0()LI0/B;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, LK0/J;->O()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v0, p0, v1, p1, p2}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, LK0/e0;->t3(LI0/C;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, LK0/e0;->h3()V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method

.method public x2()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/y;->I2()LK0/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LK0/y$b;

    .line 8
    .line 9
    invoke-direct {v0, p0}, LK0/y$b;-><init>(LK0/y;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LK0/y;->M3(LK0/U;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public y1(LI0/a;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/y;->I2()LK0/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LK0/T;->y1(LI0/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/e0;->C2()LK0/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LK0/b;->L()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    const/high16 p1, -0x80000000

    .line 34
    .line 35
    return p1
.end method
