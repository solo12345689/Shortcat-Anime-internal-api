.class public final Lu0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lu0/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/a$a;
    }
.end annotation


# instance fields
.field private final a:Lu0/a$a;

.field private final b:Lu0/d;

.field private c:Ls0/k1;

.field private d:Ls0/k1;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu0/a$a;

    .line 5
    .line 6
    const/16 v6, 0xf

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lu0/a$a;-><init>(Li1/d;Li1/t;Ls0/j0;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 18
    .line 19
    new-instance v0, Lu0/a$b;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lu0/a$b;-><init>(Lu0/a;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lu0/a;->b:Lu0/d;

    .line 25
    .line 26
    return-void
.end method

.method static synthetic B(Lu0/a;JFFIILs0/n1;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;
    .locals 13

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lu0/f$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    move v12, v0

    .line 14
    :goto_0
    move-object v1, p0

    .line 15
    move-wide v2, p1

    .line 16
    move/from16 v4, p3

    .line 17
    .line 18
    move/from16 v5, p4

    .line 19
    .line 20
    move/from16 v6, p5

    .line 21
    .line 22
    move/from16 v7, p6

    .line 23
    .line 24
    move-object/from16 v8, p7

    .line 25
    .line 26
    move/from16 v9, p8

    .line 27
    .line 28
    move-object/from16 v10, p9

    .line 29
    .line 30
    move/from16 v11, p10

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move/from16 v12, p11

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-direct/range {v1 .. v12}, Lu0/a;->z(JFFIILs0/n1;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method private final I(Ls0/h0;FFIILs0/n1;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;
    .locals 3

    .line 1
    invoke-direct {p0}, Lu0/a;->V()Ls0/k1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lu0/f;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {p1, v1, v2, v0, p7}, Ls0/h0;->applyTo-Pq9zytI(JLs0/k1;F)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v0}, Ls0/k1;->a()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    cmpg-float p1, p1, p7

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-interface {v0, p7}, Ls0/k1;->e(F)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {v0}, Ls0/k1;->f()Landroidx/compose/ui/graphics/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1, p8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, p8}, Ls0/k1;->d(Landroidx/compose/ui/graphics/d;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-interface {v0}, Ls0/k1;->j()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1, p9}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0, p9}, Ls0/k1;->c(I)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-interface {v0}, Ls0/k1;->B()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    cmpg-float p1, p1, p2

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-interface {v0, p2}, Ls0/k1;->A(F)V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-interface {v0}, Ls0/k1;->s()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    cmpg-float p1, p1, p3

    .line 70
    .line 71
    if-nez p1, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    invoke-interface {v0, p3}, Ls0/k1;->x(F)V

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-interface {v0}, Ls0/k1;->n()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {p1, p4}, Ls0/G1;->e(II)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    invoke-interface {v0, p4}, Ls0/k1;->l(I)V

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-interface {v0}, Ls0/k1;->r()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-static {p1, p5}, Ls0/H1;->e(II)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_7

    .line 99
    .line 100
    invoke-interface {v0, p5}, Ls0/k1;->o(I)V

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-interface {v0}, Ls0/k1;->q()Ls0/n1;

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_8

    .line 112
    .line 113
    invoke-interface {v0, p6}, Ls0/k1;->t(Ls0/n1;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-interface {v0}, Ls0/k1;->y()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1, p10}, Ls0/X0;->d(II)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_9

    .line 125
    .line 126
    invoke-interface {v0, p10}, Ls0/k1;->m(I)V

    .line 127
    .line 128
    .line 129
    :cond_9
    return-object v0
.end method

.method static synthetic L(Lu0/a;Ls0/h0;FFIILs0/n1;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;
    .locals 12

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lu0/f$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    move v11, v0

    .line 14
    :goto_0
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move v3, p2

    .line 17
    move v4, p3

    .line 18
    move/from16 v5, p4

    .line 19
    .line 20
    move/from16 v6, p5

    .line 21
    .line 22
    move-object/from16 v7, p6

    .line 23
    .line 24
    move/from16 v8, p7

    .line 25
    .line 26
    move-object/from16 v9, p8

    .line 27
    .line 28
    move/from16 v10, p9

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move/from16 v11, p10

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    invoke-direct/range {v1 .. v11}, Lu0/a;->I(Ls0/h0;FFIILs0/n1;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method private final S(JF)J
    .locals 9

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v0, p3, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide p1

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ls0/r0;->t(J)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    mul-float v3, v0, p3

    .line 13
    .line 14
    const/16 v7, 0xe

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-wide v1, p1

    .line 21
    invoke-static/range {v1 .. v8}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    return-wide p1
.end method

.method private final U()Ls0/k1;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/a;->c:Ls0/k1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls0/Q;->a()Ls0/k1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ls0/l1;->a:Ls0/l1$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ls0/l1$a;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {v0, v1}, Ls0/k1;->z(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lu0/a;->c:Ls0/k1;

    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method private final V()Ls0/k1;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/a;->d:Ls0/k1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls0/Q;->a()Ls0/k1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ls0/l1;->a:Ls0/l1$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ls0/l1$a;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {v0, v1}, Ls0/k1;->z(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lu0/a;->d:Ls0/k1;

    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method private final W(Lu0/g;)Ls0/k1;
    .locals 3

    .line 1
    sget-object v0, Lu0/j;->a:Lu0/j;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lu0/a;->U()Ls0/k1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    instance-of v0, p1, Lu0/k;

    .line 15
    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    invoke-direct {p0}, Lu0/a;->V()Ls0/k1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ls0/k1;->B()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    check-cast p1, Lu0/k;

    .line 27
    .line 28
    invoke-virtual {p1}, Lu0/k;->f()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    cmpg-float v1, v1, v2

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Lu0/k;->f()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-interface {v0, v1}, Ls0/k1;->A(F)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-interface {v0}, Ls0/k1;->n()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1}, Lu0/k;->b()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v1, v2}, Ls0/G1;->e(II)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Lu0/k;->b()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-interface {v0, v1}, Ls0/k1;->l(I)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-interface {v0}, Ls0/k1;->s()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p1}, Lu0/k;->d()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    cmpg-float v1, v1, v2

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {p1}, Lu0/k;->d()F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-interface {v0, v1}, Ls0/k1;->x(F)V

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-interface {v0}, Ls0/k1;->r()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {p1}, Lu0/k;->c()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v1, v2}, Ls0/H1;->e(II)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p1}, Lu0/k;->c()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-interface {v0, v1}, Ls0/k1;->o(I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-interface {v0}, Ls0/k1;->q()Ls0/n1;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lu0/k;->e()Ls0/n1;

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-static {v1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Lu0/k;->e()Ls0/n1;

    .line 120
    .line 121
    .line 122
    invoke-interface {v0, v1}, Ls0/k1;->t(Ls0/n1;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    return-object v0

    .line 126
    :cond_6
    new-instance p1, LTd/r;

    .line 127
    .line 128
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 129
    .line 130
    .line 131
    throw p1
.end method

.method private final b(JLu0/g;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lu0/a;->W(Lu0/g;)Ls0/k1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p4}, Lu0/a;->S(JF)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-interface {p3}, Ls0/k1;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1, p1, p2}, Ls0/r0;->s(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    invoke-interface {p3, p1, p2}, Ls0/k1;->p(J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p3}, Ls0/k1;->w()Landroid/graphics/Shader;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {p3, p1}, Ls0/k1;->v(Landroid/graphics/Shader;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {p3}, Ls0/k1;->f()Landroidx/compose/ui/graphics/d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-interface {p3, p5}, Ls0/k1;->d(Landroidx/compose/ui/graphics/d;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {p3}, Ls0/k1;->j()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1, p6}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-interface {p3, p6}, Ls0/k1;->c(I)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-interface {p3}, Ls0/k1;->y()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p1, p7}, Ls0/X0;->d(II)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    invoke-interface {p3, p7}, Ls0/k1;->m(I)V

    .line 69
    .line 70
    .line 71
    :cond_4
    return-object p3
.end method

.method static synthetic j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;
    .locals 9

    .line 1
    and-int/lit8 v0, p8, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lu0/f$a;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    move v8, v0

    .line 12
    :goto_0
    move-object v1, p0

    .line 13
    move-wide v2, p1

    .line 14
    move-object v4, p3

    .line 15
    move v5, p4

    .line 16
    move-object v6, p5

    .line 17
    move v7, p6

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move/from16 v8, p7

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :goto_1
    invoke-direct/range {v1 .. v8}, Lu0/a;->b(JLu0/g;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private final p(Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lu0/a;->W(Lu0/g;)Ls0/k1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lu0/f;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p1, v0, v1, p2, p3}, Ls0/h0;->applyTo-Pq9zytI(JLs0/k1;F)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p2}, Ls0/k1;->w()Landroid/graphics/Shader;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-interface {p2, p1}, Ls0/k1;->v(Landroid/graphics/Shader;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-interface {p2}, Ls0/k1;->b()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    sget-object p1, Ls0/r0;->b:Ls0/r0$a;

    .line 30
    .line 31
    invoke-virtual {p1}, Ls0/r0$a;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Ls0/r0;->s(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Ls0/r0$a;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-interface {p2, v0, v1}, Ls0/k1;->p(J)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-interface {p2}, Ls0/k1;->a()F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    cmpg-float p1, p1, p3

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {p2, p3}, Ls0/k1;->e(F)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-interface {p2}, Ls0/k1;->f()Landroidx/compose/ui/graphics/d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    invoke-interface {p2, p4}, Ls0/k1;->d(Landroidx/compose/ui/graphics/d;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-interface {p2}, Ls0/k1;->j()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {p1, p5}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    invoke-interface {p2, p5}, Ls0/k1;->c(I)V

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-interface {p2}, Ls0/k1;->y()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1, p6}, Ls0/X0;->d(II)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    invoke-interface {p2, p6}, Ls0/k1;->m(I)V

    .line 97
    .line 98
    .line 99
    :cond_6
    return-object p2
.end method

.method static synthetic q(Lu0/a;Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p6, Lu0/f;->j0:Lu0/f$a;

    .line 6
    .line 7
    invoke-virtual {p6}, Lu0/f$a;->b()I

    .line 8
    .line 9
    .line 10
    move-result p6

    .line 11
    :cond_0
    move-object v0, p0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move v3, p3

    .line 15
    move-object v4, p4

    .line 16
    move v5, p5

    .line 17
    move v6, p6

    .line 18
    invoke-direct/range {v0 .. v6}, Lu0/a;->p(Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private final z(JFFIILs0/n1;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;
    .locals 3

    .line 1
    invoke-direct {p0}, Lu0/a;->V()Ls0/k1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, p2, p8}, Lu0/a;->S(JF)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-interface {v0}, Ls0/k1;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2, p1, p2}, Ls0/r0;->s(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result p8

    .line 17
    if-nez p8, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Ls0/k1;->p(J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {v0}, Ls0/k1;->w()Landroid/graphics/Shader;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {v0, p2}, Ls0/k1;->v(Landroid/graphics/Shader;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {v0}, Ls0/k1;->f()Landroidx/compose/ui/graphics/d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1, p9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-interface {v0, p9}, Ls0/k1;->d(Landroidx/compose/ui/graphics/d;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {v0}, Ls0/k1;->j()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1, p10}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0, p10}, Ls0/k1;->c(I)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-interface {v0}, Ls0/k1;->B()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    cmpg-float p1, p1, p3

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-interface {v0, p3}, Ls0/k1;->A(F)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-interface {v0}, Ls0/k1;->s()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    cmpg-float p1, p1, p4

    .line 75
    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-interface {v0, p4}, Ls0/k1;->x(F)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-interface {v0}, Ls0/k1;->n()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p1, p5}, Ls0/G1;->e(II)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_6

    .line 91
    .line 92
    invoke-interface {v0, p5}, Ls0/k1;->l(I)V

    .line 93
    .line 94
    .line 95
    :cond_6
    invoke-interface {v0}, Ls0/k1;->r()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1, p6}, Ls0/H1;->e(II)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_7

    .line 104
    .line 105
    invoke-interface {v0, p6}, Ls0/k1;->o(I)V

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-interface {v0}, Ls0/k1;->q()Ls0/n1;

    .line 109
    .line 110
    .line 111
    invoke-static {p2, p7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_8

    .line 116
    .line 117
    invoke-interface {v0, p7}, Ls0/k1;->t(Ls0/n1;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-interface {v0}, Ls0/k1;->y()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {p1, p11}, Ls0/X0;->d(II)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_9

    .line 129
    .line 130
    invoke-interface {v0, p11}, Ls0/k1;->m(I)V

    .line 131
    .line 132
    .line 133
    :cond_9
    return-object v0
.end method


# virtual methods
.method public A1(Ls0/b1;JJJJFLu0/g;Landroidx/compose/ui/graphics/d;II)V
    .locals 12

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move/from16 v5, p10

    .line 10
    .line 11
    move-object/from16 v4, p11

    .line 12
    .line 13
    move-object/from16 v6, p12

    .line 14
    .line 15
    move/from16 v7, p13

    .line 16
    .line 17
    move/from16 v8, p14

    .line 18
    .line 19
    invoke-direct/range {v2 .. v8}, Lu0/a;->p(Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;II)Ls0/k1;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    move-object v2, p1

    .line 24
    move-wide v3, p2

    .line 25
    move-wide/from16 v5, p4

    .line 26
    .line 27
    move-wide/from16 v7, p6

    .line 28
    .line 29
    move-wide/from16 v9, p8

    .line 30
    .line 31
    invoke-interface/range {v1 .. v11}, Ls0/j0;->l(Ls0/b1;JJJJLs0/k1;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public C1(Ls0/m1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v9, 0x20

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-wide v2, p2

    .line 13
    move v5, p4

    .line 14
    move-object/from16 v4, p5

    .line 15
    .line 16
    move-object/from16 v6, p6

    .line 17
    .line 18
    move/from16 v7, p7

    .line 19
    .line 20
    invoke-static/range {v1 .. v10}, Lu0/a;->j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {v0, p1, p2}, Ls0/j0;->t(Ls0/m1;Ls0/k1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public D0(Ls0/b1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v8, 0x20

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move v4, p4

    .line 14
    move-object v3, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    move/from16 v6, p7

    .line 18
    .line 19
    invoke-static/range {v1 .. v9}, Lu0/a;->q(Lu0/a;Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    invoke-interface {v0, p1, p2, p3, p4}, Ls0/j0;->x(Ls0/b1;JLs0/k1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final N()Lu0/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public N0(JJJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V
    .locals 15

    .line 1
    iget-object v1, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v14

    .line 7
    sget-object v1, Ls0/H1;->a:Ls0/H1$a;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls0/H1$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v6

    .line 13
    const/16 v12, 0x200

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/high16 v4, 0x40800000    # 4.0f

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    move-object v0, p0

    .line 20
    move-wide/from16 v1, p1

    .line 21
    .line 22
    move/from16 v3, p7

    .line 23
    .line 24
    move/from16 v5, p8

    .line 25
    .line 26
    move-object/from16 v7, p9

    .line 27
    .line 28
    move/from16 v8, p10

    .line 29
    .line 30
    move-object/from16 v9, p11

    .line 31
    .line 32
    move/from16 v10, p12

    .line 33
    .line 34
    invoke-static/range {v0 .. v13}, Lu0/a;->B(Lu0/a;JFFIILs0/n1;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-wide/from16 p8, p3

    .line 39
    .line 40
    move-wide/from16 p10, p5

    .line 41
    .line 42
    move-object/from16 p12, v1

    .line 43
    .line 44
    move-object/from16 p7, v14

    .line 45
    .line 46
    invoke-interface/range {p7 .. p12}, Ls0/j0;->g(JJLs0/k1;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public U0(Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 14

    .line 1
    iget-object v1, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v9

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    shr-long v2, p2, v1

    .line 10
    .line 11
    long-to-int v2, v2

    .line 12
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v10

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long v5, p2, v3

    .line 22
    .line 23
    long-to-int v5, v5

    .line 24
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    shr-long v6, p4, v1

    .line 33
    .line 34
    long-to-int v1, v6

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float v12, v2, v1

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    and-long v2, p4, v3

    .line 46
    .line 47
    long-to-int v2, v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-float v13, v1, v2

    .line 53
    .line 54
    const/16 v7, 0x20

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    move-object v0, p0

    .line 59
    move-object v1, p1

    .line 60
    move/from16 v3, p6

    .line 61
    .line 62
    move-object/from16 v2, p7

    .line 63
    .line 64
    move-object/from16 v4, p8

    .line 65
    .line 66
    move/from16 v5, p9

    .line 67
    .line 68
    invoke-static/range {v0 .. v8}, Lu0/a;->q(Lu0/a;Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object/from16 p6, v1

    .line 73
    .line 74
    move-object p1, v9

    .line 75
    move/from16 p2, v10

    .line 76
    .line 77
    move/from16 p3, v11

    .line 78
    .line 79
    move/from16 p4, v12

    .line 80
    .line 81
    move/from16 p5, v13

    .line 82
    .line 83
    invoke-interface/range {p1 .. p6}, Ls0/j0;->w(FFFFLs0/k1;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public V0(JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 15

    .line 1
    iget-object v1, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v10

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    shr-long v2, p3, v1

    .line 10
    .line 11
    long-to-int v2, v2

    .line 12
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v11

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long v5, p3, v3

    .line 22
    .line 23
    long-to-int v5, v5

    .line 24
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v12

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    shr-long v6, p5, v1

    .line 33
    .line 34
    long-to-int v1, v6

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float v13, v2, v1

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    and-long v2, p5, v3

    .line 46
    .line 47
    long-to-int v2, v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-float v14, v1, v2

    .line 53
    .line 54
    const/16 v8, 0x20

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    move-object v0, p0

    .line 59
    move-wide/from16 v1, p1

    .line 60
    .line 61
    move/from16 v4, p7

    .line 62
    .line 63
    move-object/from16 v3, p8

    .line 64
    .line 65
    move-object/from16 v5, p9

    .line 66
    .line 67
    move/from16 v6, p10

    .line 68
    .line 69
    invoke-static/range {v0 .. v9}, Lu0/a;->j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object/from16 p6, v1

    .line 74
    .line 75
    move-object/from16 p1, v10

    .line 76
    .line 77
    move/from16 p2, v11

    .line 78
    .line 79
    move/from16 p3, v12

    .line 80
    .line 81
    move/from16 p4, v13

    .line 82
    .line 83
    move/from16 p5, v14

    .line 84
    .line 85
    invoke-interface/range {p1 .. p6}, Ls0/j0;->w(FFFFLs0/k1;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public Z0(JFFZJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 15

    .line 1
    iget-object v1, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v10

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    shr-long v2, p6, v1

    .line 10
    .line 11
    long-to-int v2, v2

    .line 12
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v11

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long v5, p6, v3

    .line 22
    .line 23
    long-to-int v5, v5

    .line 24
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v12

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    shr-long v6, p8, v1

    .line 33
    .line 34
    long-to-int v1, v6

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float v13, v2, v1

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    and-long v2, p8, v3

    .line 46
    .line 47
    long-to-int v2, v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-float v14, v1, v2

    .line 53
    .line 54
    const/16 v8, 0x20

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    move-object v0, p0

    .line 59
    move-wide/from16 v1, p1

    .line 60
    .line 61
    move/from16 v4, p10

    .line 62
    .line 63
    move-object/from16 v3, p11

    .line 64
    .line 65
    move-object/from16 v5, p12

    .line 66
    .line 67
    move/from16 v6, p13

    .line 68
    .line 69
    invoke-static/range {v0 .. v9}, Lu0/a;->j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move/from16 v7, p3

    .line 74
    .line 75
    move/from16 v8, p4

    .line 76
    .line 77
    move/from16 v9, p5

    .line 78
    .line 79
    move-object v2, v10

    .line 80
    move v3, v11

    .line 81
    move v4, v12

    .line 82
    move v5, v13

    .line 83
    move v6, v14

    .line 84
    move-object v10, v1

    .line 85
    invoke-interface/range {v2 .. v10}, Ls0/j0;->i(FFFFFFZLs0/k1;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public a0(Ls0/h0;JJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V
    .locals 14

    .line 1
    iget-object v1, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v13

    .line 7
    sget-object v1, Ls0/H1;->a:Ls0/H1$a;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls0/H1$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const/16 v11, 0x200

    .line 14
    .line 15
    const/4 v12, 0x0

    .line 16
    const/high16 v3, 0x40800000    # 4.0f

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move/from16 v2, p6

    .line 22
    .line 23
    move/from16 v4, p7

    .line 24
    .line 25
    move-object/from16 v6, p8

    .line 26
    .line 27
    move/from16 v7, p9

    .line 28
    .line 29
    move-object/from16 v8, p10

    .line 30
    .line 31
    move/from16 v9, p11

    .line 32
    .line 33
    invoke-static/range {v0 .. v12}, Lu0/a;->L(Lu0/a;Ls0/h0;FFIILs0/n1;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-wide/from16 p7, p2

    .line 38
    .line 39
    move-wide/from16 p9, p4

    .line 40
    .line 41
    move-object/from16 p11, v1

    .line 42
    .line 43
    move-object/from16 p6, v13

    .line 44
    .line 45
    invoke-interface/range {p6 .. p11}, Ls0/j0;->g(JJLs0/k1;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public c1(JFJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v9, 0x20

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-wide v2, p1

    .line 13
    move/from16 v5, p6

    .line 14
    .line 15
    move-object/from16 v4, p7

    .line 16
    .line 17
    move-object/from16 v6, p8

    .line 18
    .line 19
    move/from16 v7, p9

    .line 20
    .line 21
    invoke-static/range {v1 .. v10}, Lu0/a;->j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    move-wide v1, p4

    .line 26
    invoke-interface {v0, v1, v2, p3, p1}, Ls0/j0;->u(JFLs0/k1;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public g1(JJJJLu0/g;FLandroidx/compose/ui/graphics/d;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lu0/a;->a:Lu0/a$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v10

    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    shr-long v2, p3, v1

    .line 12
    .line 13
    long-to-int v2, v2

    .line 14
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v11

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long v5, p3, v3

    .line 24
    .line 25
    long-to-int v5, v5

    .line 26
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v12

    .line 30
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    shr-long v6, p5, v1

    .line 35
    .line 36
    long-to-int v6, v6

    .line 37
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    add-float v13, v2, v6

    .line 42
    .line 43
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    and-long v5, p5, v3

    .line 48
    .line 49
    long-to-int v5, v5

    .line 50
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    add-float v14, v2, v5

    .line 55
    .line 56
    shr-long v1, p7, v1

    .line 57
    .line 58
    long-to-int v1, v1

    .line 59
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v15

    .line 63
    and-long v1, p7, v3

    .line 64
    .line 65
    long-to-int v1, v1

    .line 66
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v16

    .line 70
    const/16 v8, 0x20

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    move-wide/from16 v1, p1

    .line 75
    .line 76
    move-object/from16 v3, p9

    .line 77
    .line 78
    move/from16 v4, p10

    .line 79
    .line 80
    move-object/from16 v5, p11

    .line 81
    .line 82
    move/from16 v6, p12

    .line 83
    .line 84
    invoke-static/range {v0 .. v9}, Lu0/a;->j(Lu0/a;JLu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object/from16 p8, v1

    .line 89
    .line 90
    move-object/from16 p1, v10

    .line 91
    .line 92
    move/from16 p2, v11

    .line 93
    .line 94
    move/from16 p3, v12

    .line 95
    .line 96
    move/from16 p4, v13

    .line 97
    .line 98
    move/from16 p5, v14

    .line 99
    .line 100
    move/from16 p6, v15

    .line 101
    .line 102
    move/from16 p7, v16

    .line 103
    .line 104
    invoke-interface/range {p1 .. p8}, Ls0/j0;->f(FFFFFFLs0/k1;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->f()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->g()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->f()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/l;->j1()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public m1(Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lu0/a;->a:Lu0/a$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lu0/a$a;->e()Ls0/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    shr-long v2, p2, v1

    .line 12
    .line 13
    long-to-int v2, v2

    .line 14
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v10

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long v5, p2, v3

    .line 24
    .line 25
    long-to-int v5, v5

    .line 26
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    shr-long v6, p4, v1

    .line 35
    .line 36
    long-to-int v6, v6

    .line 37
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    add-float v12, v2, v6

    .line 42
    .line 43
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    and-long v5, p4, v3

    .line 48
    .line 49
    long-to-int v5, v5

    .line 50
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    add-float v13, v2, v5

    .line 55
    .line 56
    shr-long v1, p6, v1

    .line 57
    .line 58
    long-to-int v1, v1

    .line 59
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    and-long v1, p6, v3

    .line 64
    .line 65
    long-to-int v1, v1

    .line 66
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    const/16 v7, 0x20

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    move-object/from16 v1, p1

    .line 75
    .line 76
    move/from16 v3, p8

    .line 77
    .line 78
    move-object/from16 v2, p9

    .line 79
    .line 80
    move-object/from16 v4, p10

    .line 81
    .line 82
    move/from16 v5, p11

    .line 83
    .line 84
    invoke-static/range {v0 .. v8}, Lu0/a;->q(Lu0/a;Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object/from16 p8, v1

    .line 89
    .line 90
    move-object/from16 p1, v9

    .line 91
    .line 92
    move/from16 p2, v10

    .line 93
    .line 94
    move/from16 p3, v11

    .line 95
    .line 96
    move/from16 p4, v12

    .line 97
    .line 98
    move/from16 p5, v13

    .line 99
    .line 100
    move/from16 p6, v14

    .line 101
    .line 102
    move/from16 p7, v15

    .line 103
    .line 104
    invoke-interface/range {p1 .. p8}, Ls0/j0;->f(FFFFFFLs0/k1;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public n1()Lu0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->b:Lu0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public p1(Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v8, 0x20

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p2

    .line 13
    move v4, p3

    .line 14
    move-object v3, p4

    .line 15
    move-object v5, p5

    .line 16
    move/from16 v6, p6

    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lu0/a;->q(Lu0/a;Ls0/h0;Lu0/g;FLandroidx/compose/ui/graphics/d;IIILjava/lang/Object;)Ls0/k1;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {v0, p1, p2}, Ls0/j0;->t(Ls0/m1;Ls0/k1;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
