.class public final Lt0/F$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt0/F$a;-><init>()V

    return-void
.end method

.method private static final A(Lt0/G;D)D
    .locals 12

    .line 1
    invoke-virtual {p0}, Lt0/G;->a()D

    .line 2
    .line 3
    .line 4
    move-result-wide v2

    .line 5
    invoke-virtual {p0}, Lt0/G;->b()D

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    invoke-virtual {p0}, Lt0/G;->c()D

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    invoke-virtual {p0}, Lt0/G;->d()D

    .line 14
    .line 15
    .line 16
    move-result-wide v8

    .line 17
    invoke-virtual {p0}, Lt0/G;->g()D

    .line 18
    .line 19
    .line 20
    move-result-wide v10

    .line 21
    move-wide v0, p1

    .line 22
    invoke-static/range {v0 .. v11}, Lt0/d;->o(DDDDDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
.end method

.method private static final B(Lt0/G;D)D
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Lt0/G;->a()D

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    invoke-virtual/range {p0 .. p0}, Lt0/G;->b()D

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    invoke-virtual/range {p0 .. p0}, Lt0/G;->c()D

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    invoke-virtual/range {p0 .. p0}, Lt0/G;->d()D

    .line 14
    .line 15
    .line 16
    move-result-wide v10

    .line 17
    invoke-virtual/range {p0 .. p0}, Lt0/G;->e()D

    .line 18
    .line 19
    .line 20
    move-result-wide v12

    .line 21
    invoke-virtual/range {p0 .. p0}, Lt0/G;->f()D

    .line 22
    .line 23
    .line 24
    move-result-wide v14

    .line 25
    invoke-virtual/range {p0 .. p0}, Lt0/G;->g()D

    .line 26
    .line 27
    .line 28
    move-result-wide v16

    .line 29
    move-wide/from16 v2, p1

    .line 30
    .line 31
    invoke-static/range {v2 .. v17}, Lt0/d;->p(DDDDDDDD)D

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0
.end method

.method private final C([FLt0/I;Lt0/n;Lt0/n;FFI)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p7, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object p7, Lt0/k;->a:Lt0/k;

    .line 6
    .line 7
    invoke-virtual {p7}, Lt0/k;->H()[F

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Lt0/d;->g([F[F)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    sget-object p1, Lt0/o;->a:Lt0/o;

    .line 20
    .line 21
    invoke-virtual {p1}, Lt0/o;->e()Lt0/I;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2, p1}, Lt0/d;->f(Lt0/I;Lt0/I;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    const/4 p1, 0x0

    .line 33
    cmpg-float p1, p5, p1

    .line 34
    .line 35
    if-nez p1, :cond_6

    .line 36
    .line 37
    const/high16 p1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpg-float p1, p6, p1

    .line 40
    .line 41
    if-nez p1, :cond_6

    .line 42
    .line 43
    invoke-virtual {p7}, Lt0/k;->G()Lt0/F;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-wide/16 p5, 0x0

    .line 48
    .line 49
    :goto_0
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 50
    .line 51
    cmpg-double p2, p5, v2

    .line 52
    .line 53
    if-gtz p2, :cond_5

    .line 54
    .line 55
    invoke-virtual {p1}, Lt0/F;->B()Lt0/n;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p0, p5, p6, p3, p2}, Lt0/F$a;->p(DLt0/n;Lt0/n;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    return v1

    .line 66
    :cond_3
    invoke-virtual {p1}, Lt0/F;->x()Lt0/n;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p0, p5, p6, p4, p2}, Lt0/F$a;->p(DLt0/n;Lt0/n;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    return v1

    .line 77
    :cond_4
    const-wide v2, 0x3f70101010101010L    # 0.00392156862745098

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    add-double/2addr p5, v2

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    return v0

    .line 85
    :cond_6
    return v1
.end method

.method private final D([FFF)Z
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lt0/F$a;->o([F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lt0/k;->a:Lt0/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Lt0/k;->C()[F

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, v2}, Lt0/F$a;->o([F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    div-float/2addr v0, v2

    .line 16
    const v2, 0x3f666666    # 0.9f

    .line 17
    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lt0/k;->H()[F

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p0, p1, v0}, Lt0/F$a;->r([F[F)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    cmpg-float p1, p2, p1

    .line 35
    .line 36
    if-gez p1, :cond_2

    .line 37
    .line 38
    const/high16 p1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    cmpl-float p1, p3, p1

    .line 41
    .line 42
    if-lez p1, :cond_2

    .line 43
    .line 44
    :cond_1
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method private final E([F)[F
    .locals 10

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v2, v0, [F

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/16 v3, 0x9

    .line 6
    .line 7
    if-ne v1, v3, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget v3, p1, v1

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    aget v5, p1, v4

    .line 14
    .line 15
    add-float v6, v3, v5

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    aget v8, p1, v7

    .line 19
    .line 20
    add-float/2addr v6, v8

    .line 21
    div-float/2addr v3, v6

    .line 22
    aput v3, v2, v1

    .line 23
    .line 24
    div-float/2addr v5, v6

    .line 25
    aput v5, v2, v4

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    aget v3, p1, v1

    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    aget v5, p1, v4

    .line 32
    .line 33
    add-float v6, v3, v5

    .line 34
    .line 35
    const/4 v8, 0x5

    .line 36
    aget v9, p1, v8

    .line 37
    .line 38
    add-float/2addr v6, v9

    .line 39
    div-float/2addr v3, v6

    .line 40
    aput v3, v2, v7

    .line 41
    .line 42
    div-float/2addr v5, v6

    .line 43
    aput v5, v2, v1

    .line 44
    .line 45
    aget v0, p1, v0

    .line 46
    .line 47
    const/4 v1, 0x7

    .line 48
    aget v1, p1, v1

    .line 49
    .line 50
    add-float v3, v0, v1

    .line 51
    .line 52
    const/16 v5, 0x8

    .line 53
    .line 54
    aget p1, p1, v5

    .line 55
    .line 56
    add-float/2addr v3, p1

    .line 57
    div-float/2addr v0, v3

    .line 58
    aput v0, v2, v4

    .line 59
    .line 60
    div-float/2addr v1, v3

    .line 61
    aput v1, v2, v8

    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_0
    const/4 v6, 0x6

    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x6

    .line 69
    move-object v1, p1

    .line 70
    invoke-static/range {v1 .. v7}, LUd/n;->o([F[FIIIILjava/lang/Object;)[F

    .line 71
    .line 72
    .line 73
    return-object v2
.end method

.method public static synthetic a(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->B(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic b(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->u(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic c(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->v(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic d(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->w(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic e(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->z(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic f(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->y(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic g(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->A(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic h(Lt0/G;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt0/F$a;->t(Lt0/G;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic i(Lt0/F$a;[FLt0/I;)[F
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lt0/F$a;->q([FLt0/I;)[F

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lt0/F$a;Lt0/G;)Lt0/n;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt0/F$a;->s(Lt0/G;)Lt0/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Lt0/F$a;Lt0/G;)Lt0/n;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt0/F$a;->x(Lt0/G;)Lt0/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic l(Lt0/F$a;[FLt0/I;Lt0/n;Lt0/n;FFI)Z
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lt0/F$a;->C([FLt0/I;Lt0/n;Lt0/n;FFI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic m(Lt0/F$a;[FFF)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lt0/F$a;->D([FFF)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic n(Lt0/F$a;[F)[F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt0/F$a;->E([F)[F

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final o([F)F
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v1, p1, v1

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    aget v3, p1, v3

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    aget v4, p1, v4

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    aget v5, p1, v5

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    aget p1, p1, v6

    .line 24
    .line 25
    mul-float v6, v0, v4

    .line 26
    .line 27
    mul-float v7, v1, v5

    .line 28
    .line 29
    add-float/2addr v6, v7

    .line 30
    mul-float v7, v3, p1

    .line 31
    .line 32
    add-float/2addr v6, v7

    .line 33
    mul-float/2addr v4, v5

    .line 34
    sub-float/2addr v6, v4

    .line 35
    mul-float/2addr v1, v3

    .line 36
    sub-float/2addr v6, v1

    .line 37
    mul-float/2addr v0, p1

    .line 38
    sub-float/2addr v6, v0

    .line 39
    const/high16 p1, 0x3f000000    # 0.5f

    .line 40
    .line 41
    mul-float/2addr v6, p1

    .line 42
    cmpg-float p1, v6, v2

    .line 43
    .line 44
    if-gez p1, :cond_1

    .line 45
    .line 46
    neg-float p1, v6

    .line 47
    return p1

    .line 48
    :cond_1
    return v6
.end method

.method private final p(DLt0/n;Lt0/n;)Z
    .locals 2

    .line 1
    invoke-interface {p3, p1, p2}, Lt0/n;->a(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p4, p1, p2}, Lt0/n;->a(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    sub-double/2addr v0, p1

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    const-wide p3, 0x3f50624dd2f1a9fcL    # 0.001

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmpg-double p1, p1, p3

    .line 20
    .line 21
    if-gtz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method private final q([FLt0/I;)[F
    .locals 21

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    aget v3, p1, v2

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    aget v5, p1, v4

    .line 9
    .line 10
    const/4 v6, 0x3

    .line 11
    aget v7, p1, v6

    .line 12
    .line 13
    const/4 v8, 0x4

    .line 14
    aget v9, p1, v8

    .line 15
    .line 16
    const/4 v10, 0x5

    .line 17
    aget v11, p1, v10

    .line 18
    .line 19
    invoke-virtual/range {p2 .. p2}, Lt0/I;->a()F

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    invoke-virtual/range {p2 .. p2}, Lt0/I;->b()F

    .line 24
    .line 25
    .line 26
    move-result v13

    .line 27
    int-to-float v14, v2

    .line 28
    sub-float v15, v14, v1

    .line 29
    .line 30
    div-float/2addr v15, v3

    .line 31
    sub-float v16, v14, v5

    .line 32
    .line 33
    div-float v16, v16, v7

    .line 34
    .line 35
    sub-float v17, v14, v9

    .line 36
    .line 37
    div-float v17, v17, v11

    .line 38
    .line 39
    sub-float/2addr v14, v12

    .line 40
    div-float/2addr v14, v13

    .line 41
    div-float v18, v1, v3

    .line 42
    .line 43
    div-float v19, v5, v7

    .line 44
    .line 45
    div-float v20, v9, v11

    .line 46
    .line 47
    div-float/2addr v12, v13

    .line 48
    sub-float/2addr v14, v15

    .line 49
    sub-float v19, v19, v18

    .line 50
    .line 51
    mul-float v14, v14, v19

    .line 52
    .line 53
    sub-float v12, v12, v18

    .line 54
    .line 55
    sub-float v16, v16, v15

    .line 56
    .line 57
    mul-float v13, v12, v16

    .line 58
    .line 59
    sub-float/2addr v14, v13

    .line 60
    sub-float v17, v17, v15

    .line 61
    .line 62
    mul-float v17, v17, v19

    .line 63
    .line 64
    sub-float v20, v20, v18

    .line 65
    .line 66
    mul-float v16, v16, v20

    .line 67
    .line 68
    sub-float v17, v17, v16

    .line 69
    .line 70
    div-float v14, v14, v17

    .line 71
    .line 72
    mul-float v20, v20, v14

    .line 73
    .line 74
    sub-float v12, v12, v20

    .line 75
    .line 76
    div-float v12, v12, v19

    .line 77
    .line 78
    const/high16 v13, 0x3f800000    # 1.0f

    .line 79
    .line 80
    sub-float v15, v13, v12

    .line 81
    .line 82
    sub-float/2addr v15, v14

    .line 83
    div-float v16, v15, v3

    .line 84
    .line 85
    div-float v17, v12, v7

    .line 86
    .line 87
    div-float v18, v14, v11

    .line 88
    .line 89
    mul-float v19, v16, v1

    .line 90
    .line 91
    sub-float v1, v13, v1

    .line 92
    .line 93
    sub-float/2addr v1, v3

    .line 94
    mul-float v16, v16, v1

    .line 95
    .line 96
    mul-float v1, v17, v5

    .line 97
    .line 98
    sub-float v3, v13, v5

    .line 99
    .line 100
    sub-float/2addr v3, v7

    .line 101
    mul-float v17, v17, v3

    .line 102
    .line 103
    mul-float v3, v18, v9

    .line 104
    .line 105
    sub-float/2addr v13, v9

    .line 106
    sub-float/2addr v13, v11

    .line 107
    mul-float v18, v18, v13

    .line 108
    .line 109
    const/16 v5, 0x9

    .line 110
    .line 111
    new-array v5, v5, [F

    .line 112
    .line 113
    aput v19, v5, v0

    .line 114
    .line 115
    aput v15, v5, v2

    .line 116
    .line 117
    aput v16, v5, v4

    .line 118
    .line 119
    aput v1, v5, v6

    .line 120
    .line 121
    aput v12, v5, v8

    .line 122
    .line 123
    aput v17, v5, v10

    .line 124
    .line 125
    const/4 v0, 0x6

    .line 126
    aput v3, v5, v0

    .line 127
    .line 128
    const/4 v0, 0x7

    .line 129
    aput v14, v5, v0

    .line 130
    .line 131
    const/16 v0, 0x8

    .line 132
    .line 133
    aput v18, v5, v0

    .line 134
    .line 135
    return-object v5
.end method

.method private final r([F[F)Z
    .locals 19

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    aget v2, p2, v0

    .line 5
    .line 6
    sub-float/2addr v1, v2

    .line 7
    const/4 v3, 0x1

    .line 8
    aget v4, p1, v3

    .line 9
    .line 10
    aget v5, p2, v3

    .line 11
    .line 12
    sub-float/2addr v4, v5

    .line 13
    const/4 v6, 0x2

    .line 14
    aget v7, p1, v6

    .line 15
    .line 16
    aget v8, p2, v6

    .line 17
    .line 18
    sub-float/2addr v7, v8

    .line 19
    const/4 v9, 0x3

    .line 20
    aget v10, p1, v9

    .line 21
    .line 22
    aget v11, p2, v9

    .line 23
    .line 24
    sub-float/2addr v10, v11

    .line 25
    const/4 v12, 0x4

    .line 26
    aget v13, p1, v12

    .line 27
    .line 28
    aget v14, p2, v12

    .line 29
    .line 30
    sub-float/2addr v13, v14

    .line 31
    const/4 v15, 0x5

    .line 32
    aget v16, p1, v15

    .line 33
    .line 34
    aget v17, p2, v15

    .line 35
    .line 36
    sub-float v16, v16, v17

    .line 37
    .line 38
    move/from16 v18, v0

    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    new-array v0, v0, [F

    .line 42
    .line 43
    aput v1, v0, v18

    .line 44
    .line 45
    aput v4, v0, v3

    .line 46
    .line 47
    aput v7, v0, v6

    .line 48
    .line 49
    aput v10, v0, v9

    .line 50
    .line 51
    aput v13, v0, v12

    .line 52
    .line 53
    aput v16, v0, v15

    .line 54
    .line 55
    aget v1, v0, v18

    .line 56
    .line 57
    aget v4, v0, v3

    .line 58
    .line 59
    sub-float v7, v2, v14

    .line 60
    .line 61
    sub-float v10, v5, v17

    .line 62
    .line 63
    mul-float/2addr v10, v1

    .line 64
    mul-float/2addr v7, v4

    .line 65
    sub-float/2addr v10, v7

    .line 66
    const/4 v7, 0x0

    .line 67
    cmpg-float v10, v10, v7

    .line 68
    .line 69
    if-ltz v10, :cond_2

    .line 70
    .line 71
    sub-float v10, v2, v8

    .line 72
    .line 73
    sub-float v13, v5, v11

    .line 74
    .line 75
    mul-float/2addr v10, v4

    .line 76
    mul-float/2addr v13, v1

    .line 77
    sub-float/2addr v10, v13

    .line 78
    cmpg-float v1, v10, v7

    .line 79
    .line 80
    if-gez v1, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    aget v1, v0, v6

    .line 84
    .line 85
    aget v4, v0, v9

    .line 86
    .line 87
    sub-float v6, v8, v2

    .line 88
    .line 89
    sub-float v9, v11, v5

    .line 90
    .line 91
    mul-float/2addr v9, v1

    .line 92
    mul-float/2addr v6, v4

    .line 93
    sub-float/2addr v9, v6

    .line 94
    cmpg-float v6, v9, v7

    .line 95
    .line 96
    if-ltz v6, :cond_2

    .line 97
    .line 98
    sub-float v6, v8, v14

    .line 99
    .line 100
    sub-float v9, v11, v17

    .line 101
    .line 102
    mul-float/2addr v6, v4

    .line 103
    mul-float/2addr v9, v1

    .line 104
    sub-float/2addr v6, v9

    .line 105
    cmpg-float v1, v6, v7

    .line 106
    .line 107
    if-gez v1, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    aget v1, v0, v12

    .line 111
    .line 112
    aget v0, v0, v15

    .line 113
    .line 114
    sub-float v4, v14, v8

    .line 115
    .line 116
    sub-float v6, v17, v11

    .line 117
    .line 118
    mul-float/2addr v6, v1

    .line 119
    mul-float/2addr v4, v0

    .line 120
    sub-float/2addr v6, v4

    .line 121
    cmpg-float v4, v6, v7

    .line 122
    .line 123
    if-ltz v4, :cond_2

    .line 124
    .line 125
    sub-float/2addr v14, v2

    .line 126
    sub-float v17, v17, v5

    .line 127
    .line 128
    mul-float/2addr v14, v0

    .line 129
    mul-float v17, v17, v1

    .line 130
    .line 131
    sub-float v14, v14, v17

    .line 132
    .line 133
    cmpg-float v0, v14, v7

    .line 134
    .line 135
    if-ltz v0, :cond_2

    .line 136
    .line 137
    return v3

    .line 138
    :cond_2
    :goto_0
    return v18
.end method

.method private final s(Lt0/G;)Lt0/n;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lt0/G;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lt0/x;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lt0/x;-><init>(Lt0/G;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lt0/G;->i()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lt0/y;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lt0/y;-><init>(Lt0/G;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lt0/G;->e()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmpg-double v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lt0/G;->f()D

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    cmpg-double v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    new-instance v0, Lt0/z;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Lt0/z;-><init>(Lt0/G;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    new-instance v0, Lt0/A;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lt0/A;-><init>(Lt0/G;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private static final t(Lt0/G;D)D
    .locals 1

    .line 1
    sget-object v0, Lt0/k;->a:Lt0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lt0/k;->J(Lt0/G;D)D

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method private static final u(Lt0/G;D)D
    .locals 1

    .line 1
    sget-object v0, Lt0/k;->a:Lt0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lt0/k;->L(Lt0/G;D)D

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method private static final v(Lt0/G;D)D
    .locals 12

    .line 1
    invoke-virtual {p0}, Lt0/G;->a()D

    .line 2
    .line 3
    .line 4
    move-result-wide v2

    .line 5
    invoke-virtual {p0}, Lt0/G;->b()D

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    invoke-virtual {p0}, Lt0/G;->c()D

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    invoke-virtual {p0}, Lt0/G;->d()D

    .line 14
    .line 15
    .line 16
    move-result-wide v8

    .line 17
    invoke-virtual {p0}, Lt0/G;->g()D

    .line 18
    .line 19
    .line 20
    move-result-wide v10

    .line 21
    move-wide v0, p1

    .line 22
    invoke-static/range {v0 .. v11}, Lt0/d;->q(DDDDDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
.end method

.method private static final w(Lt0/G;D)D
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Lt0/G;->a()D

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    invoke-virtual/range {p0 .. p0}, Lt0/G;->b()D

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    invoke-virtual/range {p0 .. p0}, Lt0/G;->c()D

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    invoke-virtual/range {p0 .. p0}, Lt0/G;->d()D

    .line 14
    .line 15
    .line 16
    move-result-wide v10

    .line 17
    invoke-virtual/range {p0 .. p0}, Lt0/G;->e()D

    .line 18
    .line 19
    .line 20
    move-result-wide v12

    .line 21
    invoke-virtual/range {p0 .. p0}, Lt0/G;->f()D

    .line 22
    .line 23
    .line 24
    move-result-wide v14

    .line 25
    invoke-virtual/range {p0 .. p0}, Lt0/G;->g()D

    .line 26
    .line 27
    .line 28
    move-result-wide v16

    .line 29
    move-wide/from16 v2, p1

    .line 30
    .line 31
    invoke-static/range {v2 .. v17}, Lt0/d;->r(DDDDDDDD)D

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0
.end method

.method private final x(Lt0/G;)Lt0/n;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lt0/G;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lt0/B;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lt0/B;-><init>(Lt0/G;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lt0/G;->i()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lt0/C;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lt0/C;-><init>(Lt0/G;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lt0/G;->e()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmpg-double v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lt0/G;->f()D

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    cmpg-double v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    new-instance v0, Lt0/D;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Lt0/D;-><init>(Lt0/G;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    new-instance v0, Lt0/E;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lt0/E;-><init>(Lt0/G;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private static final y(Lt0/G;D)D
    .locals 1

    .line 1
    sget-object v0, Lt0/k;->a:Lt0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lt0/k;->K(Lt0/G;D)D

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method private static final z(Lt0/G;D)D
    .locals 1

    .line 1
    sget-object v0, Lt0/k;->a:Lt0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lt0/k;->M(Lt0/G;D)D

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
