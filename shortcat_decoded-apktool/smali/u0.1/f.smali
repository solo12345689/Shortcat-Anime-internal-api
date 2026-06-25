.class public interface abstract Lu0/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Li1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/f$a;
    }
.end annotation


# static fields
.field public static final j0:Lu0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lu0/f$a;->a:Lu0/f$a;

    .line 2
    .line 3
    sput-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 4
    .line 5
    return-void
.end method

.method public static synthetic B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 13

    .line 1
    if-nez p12, :cond_6

    .line 2
    .line 3
    and-int/lit8 v0, p11, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    move-wide v5, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-wide/from16 v5, p3

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v0, p11, 0x4

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Lu0/f;->f()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-direct {p0, v0, v1, v5, v6}, Lu0/f;->f1(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    move-wide v7, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-wide/from16 v7, p5

    .line 32
    .line 33
    :goto_1
    and-int/lit8 v0, p11, 0x8

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    move v9, v0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move/from16 v9, p7

    .line 42
    .line 43
    :goto_2
    and-int/lit8 v0, p11, 0x10

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, Lu0/j;->a:Lu0/j;

    .line 48
    .line 49
    move-object v10, v0

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v10, p8

    .line 52
    .line 53
    :goto_3
    and-int/lit8 v0, p11, 0x20

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    move-object v11, v0

    .line 59
    goto :goto_4

    .line 60
    :cond_4
    move-object/from16 v11, p9

    .line 61
    .line 62
    :goto_4
    and-int/lit8 v0, p11, 0x40

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 67
    .line 68
    invoke-virtual {v0}, Lu0/f$a;->a()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    move v12, v0

    .line 73
    :goto_5
    move-object v2, p0

    .line 74
    move-wide v3, p1

    .line 75
    goto :goto_6

    .line 76
    :cond_5
    move/from16 v12, p10

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :goto_6
    invoke-interface/range {v2 .. v12}, Lu0/f;->V0(JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 84
    .line 85
    const-string p1, "Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0"

    .line 86
    .line 87
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
.end method

.method public static synthetic K0(Lu0/f;Ls0/b1;JFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 6

    .line 1
    if-nez p9, :cond_5

    .line 2
    .line 3
    and-int/lit8 v0, p8, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v0, p2

    .line 15
    :goto_0
    and-int/lit8 v2, p8, 0x4

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v2, p4

    .line 23
    :goto_1
    and-int/lit8 v3, p8, 0x8

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    sget-object v3, Lu0/j;->a:Lu0/j;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object v3, p5

    .line 31
    :goto_2
    and-int/lit8 v4, p8, 0x10

    .line 32
    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    goto :goto_3

    .line 37
    :cond_3
    move-object v4, p6

    .line 38
    :goto_3
    and-int/lit8 v5, p8, 0x20

    .line 39
    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    sget-object v5, Lu0/f;->j0:Lu0/f$a;

    .line 43
    .line 44
    invoke-virtual {v5}, Lu0/f$a;->a()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    move p9, v5

    .line 49
    :goto_4
    move-object p2, p0

    .line 50
    move-object p3, p1

    .line 51
    move-wide p4, v0

    .line 52
    move p6, v2

    .line 53
    move-object p7, v3

    .line 54
    move-object p8, v4

    .line 55
    goto :goto_5

    .line 56
    :cond_4
    move p9, p7

    .line 57
    goto :goto_4

    .line 58
    :goto_5
    invoke-interface/range {p2 .. p9}, Lu0/f;->D0(Ls0/b1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 63
    .line 64
    const-string v1, "Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public static synthetic P(Lu0/f;Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 8

    .line 1
    if-nez p11, :cond_6

    .line 2
    .line 3
    and-int/lit8 v0, p10, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v0, p2

    .line 15
    :goto_0
    and-int/lit8 v2, p10, 0x4

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Lu0/f;->f()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-direct {p0, v2, v3, v0, v1}, Lu0/f;->f1(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-wide v2, p4

    .line 29
    :goto_1
    and-int/lit8 v4, p10, 0x8

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    const/high16 v4, 0x3f800000    # 1.0f

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v4, p6

    .line 37
    :goto_2
    and-int/lit8 v5, p10, 0x10

    .line 38
    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    sget-object v5, Lu0/j;->a:Lu0/j;

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move-object v5, p7

    .line 45
    :goto_3
    and-int/lit8 v6, p10, 0x20

    .line 46
    .line 47
    if-eqz v6, :cond_4

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move-object/from16 v6, p8

    .line 52
    .line 53
    :goto_4
    and-int/lit8 v7, p10, 0x40

    .line 54
    .line 55
    if-eqz v7, :cond_5

    .line 56
    .line 57
    sget-object v7, Lu0/f;->j0:Lu0/f$a;

    .line 58
    .line 59
    invoke-virtual {v7}, Lu0/f$a;->a()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    move/from16 p11, v7

    .line 64
    .line 65
    :goto_5
    move-object p2, p0

    .line 66
    move-object p3, p1

    .line 67
    move-wide p4, v0

    .line 68
    move-wide p6, v2

    .line 69
    move/from16 p8, v4

    .line 70
    .line 71
    move-object/from16 p9, v5

    .line 72
    .line 73
    move-object/from16 p10, v6

    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_5
    move/from16 p11, p9

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :goto_6
    invoke-interface/range {p2 .. p11}, Lu0/f;->U0(Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 84
    .line 85
    const-string v1, "Super calls with default arguments not supported in this target, function: drawRect-AsUm42w"

    .line 86
    .line 87
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
.end method

.method public static synthetic R(Lu0/f;Ls0/h0;JJFILs0/n1;FLandroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 14

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    if-nez p13, :cond_6

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x8

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v8, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v8, p6

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v1, v0, 0x10

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Lu0/k;->e:Lu0/k$a;

    .line 19
    .line 20
    invoke-virtual {v1}, Lu0/k$a;->a()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    move v9, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v9, p7

    .line 27
    .line 28
    :goto_1
    and-int/lit8 v1, v0, 0x20

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    move-object v10, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object/from16 v10, p8

    .line 36
    .line 37
    :goto_2
    and-int/lit8 v1, v0, 0x40

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/high16 v1, 0x3f800000    # 1.0f

    .line 42
    .line 43
    move v11, v1

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v11, p9

    .line 46
    .line 47
    :goto_3
    and-int/lit16 v1, v0, 0x80

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    move-object v12, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object/from16 v12, p10

    .line 54
    .line 55
    :goto_4
    and-int/lit16 v0, v0, 0x100

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 60
    .line 61
    invoke-virtual {v0}, Lu0/f$a;->a()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    move v13, v0

    .line 66
    :goto_5
    move-object v2, p0

    .line 67
    move-object v3, p1

    .line 68
    move-wide/from16 v4, p2

    .line 69
    .line 70
    move-wide/from16 v6, p4

    .line 71
    .line 72
    goto :goto_6

    .line 73
    :cond_5
    move/from16 v13, p11

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :goto_6
    invoke-interface/range {v2 .. v13}, Lu0/f;->a0(Ls0/h0;JJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 81
    .line 82
    const-string p1, "Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc"

    .line 83
    .line 84
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0
.end method

.method public static synthetic b0(Lu0/f;JFFZJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 17

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    if-nez p15, :cond_6

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x10

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lr0/f;->b:Lr0/f$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lr0/f$a;->c()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    move-wide v9, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-wide/from16 v9, p6

    .line 18
    .line 19
    :goto_0
    and-int/lit8 v1, v0, 0x20

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface/range {p0 .. p0}, Lu0/f;->f()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    move-object/from16 v3, p0

    .line 28
    .line 29
    invoke-direct {v3, v1, v2, v9, v10}, Lu0/f;->f1(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    move-wide v11, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v3, p0

    .line 36
    .line 37
    move-wide/from16 v11, p8

    .line 38
    .line 39
    :goto_1
    and-int/lit8 v1, v0, 0x40

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const/high16 v1, 0x3f800000    # 1.0f

    .line 44
    .line 45
    move v13, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move/from16 v13, p10

    .line 48
    .line 49
    :goto_2
    and-int/lit16 v1, v0, 0x80

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    sget-object v1, Lu0/j;->a:Lu0/j;

    .line 54
    .line 55
    move-object v14, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-object/from16 v14, p11

    .line 58
    .line 59
    :goto_3
    and-int/lit16 v1, v0, 0x100

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    move-object v15, v1

    .line 65
    goto :goto_4

    .line 66
    :cond_4
    move-object/from16 v15, p12

    .line 67
    .line 68
    :goto_4
    and-int/lit16 v0, v0, 0x200

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 73
    .line 74
    invoke-virtual {v0}, Lu0/f$a;->a()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    move/from16 v16, v0

    .line 79
    .line 80
    :goto_5
    move-wide/from16 v4, p1

    .line 81
    .line 82
    move/from16 v6, p3

    .line 83
    .line 84
    move/from16 v7, p4

    .line 85
    .line 86
    move/from16 v8, p5

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_5
    move/from16 v16, p13

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :goto_6
    invoke-interface/range {v3 .. v16}, Lu0/f;->Z0(JFFZJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 97
    .line 98
    const-string v1, "Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo"

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0
.end method

.method public static synthetic e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 10

    .line 1
    if-nez p11, :cond_6

    .line 2
    .line 3
    and-int/lit8 v0, p10, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lu0/f;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Lr0/l;->h(J)F

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    const/high16 v0, 0x40000000    # 2.0f

    .line 16
    .line 17
    div-float/2addr p3, v0

    .line 18
    :cond_0
    move v3, p3

    .line 19
    and-int/lit8 p3, p10, 0x4

    .line 20
    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Lu0/f;->t1()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    move-wide v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-wide v4, p4

    .line 30
    :goto_0
    and-int/lit8 p3, p10, 0x8

    .line 31
    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    const/high16 p3, 0x3f800000    # 1.0f

    .line 35
    .line 36
    move v6, p3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move/from16 v6, p6

    .line 39
    .line 40
    :goto_1
    and-int/lit8 p3, p10, 0x10

    .line 41
    .line 42
    if-eqz p3, :cond_3

    .line 43
    .line 44
    sget-object p3, Lu0/j;->a:Lu0/j;

    .line 45
    .line 46
    move-object v7, p3

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object/from16 v7, p7

    .line 49
    .line 50
    :goto_2
    and-int/lit8 p3, p10, 0x20

    .line 51
    .line 52
    if-eqz p3, :cond_4

    .line 53
    .line 54
    const/4 p3, 0x0

    .line 55
    move-object v8, p3

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move-object/from16 v8, p8

    .line 58
    .line 59
    :goto_3
    and-int/lit8 p3, p10, 0x40

    .line 60
    .line 61
    if-eqz p3, :cond_5

    .line 62
    .line 63
    sget-object p3, Lu0/f;->j0:Lu0/f$a;

    .line 64
    .line 65
    invoke-virtual {p3}, Lu0/f$a;->a()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    move v9, p3

    .line 70
    :goto_4
    move-object v0, p0

    .line 71
    move-wide v1, p1

    .line 72
    goto :goto_5

    .line 73
    :cond_5
    move/from16 v9, p9

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :goto_5
    invoke-interface/range {v0 .. v9}, Lu0/f;->c1(JFJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 81
    .line 82
    const-string p1, "Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg"

    .line 83
    .line 84
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0
.end method

.method private f1(JJ)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p3, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-float/2addr v1, v2

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p1, v2

    .line 24
    long-to-int p1, p1

    .line 25
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    and-long p2, p3, v2

    .line 30
    .line 31
    long-to-int p2, p2

    .line 32
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sub-float/2addr p1, p2

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    int-to-long p2, p2

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-long v4, p1

    .line 47
    shl-long p1, p2, v0

    .line 48
    .line 49
    and-long p3, v4, v2

    .line 50
    .line 51
    or-long/2addr p1, p3

    .line 52
    invoke-static {p1, p2}, Lr0/l;->d(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    return-wide p1
.end method

.method public static synthetic i0(Lu0/f;Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 7

    .line 1
    if-nez p8, :cond_4

    .line 2
    .line 3
    and-int/lit8 p8, p7, 0x4

    .line 4
    .line 5
    if-eqz p8, :cond_0

    .line 6
    .line 7
    const/high16 p3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    :cond_0
    move v3, p3

    .line 10
    and-int/lit8 p3, p7, 0x8

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    sget-object p4, Lu0/j;->a:Lu0/j;

    .line 15
    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    and-int/lit8 p3, p7, 0x10

    .line 18
    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    const/4 p5, 0x0

    .line 22
    :cond_2
    move-object v5, p5

    .line 23
    and-int/lit8 p3, p7, 0x20

    .line 24
    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    sget-object p3, Lu0/f;->j0:Lu0/f$a;

    .line 28
    .line 29
    invoke-virtual {p3}, Lu0/f$a;->a()I

    .line 30
    .line 31
    .line 32
    move-result p6

    .line 33
    :cond_3
    move-object v0, p0

    .line 34
    move-object v1, p1

    .line 35
    move-object v2, p2

    .line 36
    move v6, p6

    .line 37
    invoke-interface/range {v0 .. v6}, Lu0/f;->p1(Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 42
    .line 43
    const-string p1, "Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU"

    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static synthetic m0(Lu0/f;Ls0/b1;JJJJFLu0/g;Landroidx/compose/ui/graphics/d;IIILjava/lang/Object;)V
    .locals 13

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    if-nez p16, :cond_9

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Li1/n;->b:Li1/n$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Li1/n$a;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide v1, p2

    .line 17
    :goto_0
    and-int/lit8 v3, v0, 0x4

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ls0/b1;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-interface {p1}, Ls0/b1;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    int-to-long v5, v3

    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    shl-long/2addr v5, v3

    .line 33
    int-to-long v3, v4

    .line 34
    const-wide v7, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v3, v7

    .line 40
    or-long/2addr v3, v5

    .line 41
    invoke-static {v3, v4}, Li1/r;->c(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-wide/from16 v3, p4

    .line 47
    .line 48
    :goto_1
    and-int/lit8 v5, v0, 0x8

    .line 49
    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    sget-object v5, Li1/n;->b:Li1/n$a;

    .line 53
    .line 54
    invoke-virtual {v5}, Li1/n$a;->b()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-wide/from16 v5, p6

    .line 60
    .line 61
    :goto_2
    and-int/lit8 v7, v0, 0x10

    .line 62
    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    move-wide v7, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    move-wide/from16 v7, p8

    .line 68
    .line 69
    :goto_3
    and-int/lit8 v9, v0, 0x20

    .line 70
    .line 71
    if-eqz v9, :cond_4

    .line 72
    .line 73
    const/high16 v9, 0x3f800000    # 1.0f

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move/from16 v9, p10

    .line 77
    .line 78
    :goto_4
    and-int/lit8 v10, v0, 0x40

    .line 79
    .line 80
    if-eqz v10, :cond_5

    .line 81
    .line 82
    sget-object v10, Lu0/j;->a:Lu0/j;

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move-object/from16 v10, p11

    .line 86
    .line 87
    :goto_5
    and-int/lit16 v11, v0, 0x80

    .line 88
    .line 89
    if-eqz v11, :cond_6

    .line 90
    .line 91
    const/4 v11, 0x0

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    move-object/from16 v11, p12

    .line 94
    .line 95
    :goto_6
    and-int/lit16 v12, v0, 0x100

    .line 96
    .line 97
    if-eqz v12, :cond_7

    .line 98
    .line 99
    sget-object v12, Lu0/f;->j0:Lu0/f$a;

    .line 100
    .line 101
    invoke-virtual {v12}, Lu0/f$a;->a()I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    goto :goto_7

    .line 106
    :cond_7
    move/from16 v12, p13

    .line 107
    .line 108
    :goto_7
    and-int/lit16 v0, v0, 0x200

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 113
    .line 114
    invoke-virtual {v0}, Lu0/f$a;->b()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p16, v0

    .line 119
    .line 120
    :goto_8
    move-object p2, p0

    .line 121
    move-object/from16 p3, p1

    .line 122
    .line 123
    move-wide/from16 p4, v1

    .line 124
    .line 125
    move-wide/from16 p6, v3

    .line 126
    .line 127
    move-wide/from16 p8, v5

    .line 128
    .line 129
    move-wide/from16 p10, v7

    .line 130
    .line 131
    move/from16 p12, v9

    .line 132
    .line 133
    move-object/from16 p13, v10

    .line 134
    .line 135
    move-object/from16 p14, v11

    .line 136
    .line 137
    move/from16 p15, v12

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_8
    move/from16 p16, p14

    .line 141
    .line 142
    goto :goto_8

    .line 143
    :goto_9
    invoke-interface/range {p2 .. p16}, Lu0/f;->A1(Ls0/b1;JJJJFLu0/g;Landroidx/compose/ui/graphics/d;II)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_9
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 148
    .line 149
    const-string p1, "Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs"

    .line 150
    .line 151
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p0
.end method

.method public static synthetic r1(Lu0/f;JJJFILs0/n1;FLandroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 15

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    if-nez p14, :cond_6

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x8

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v9, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v9, p7

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v1, v0, 0x10

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Lu0/k;->e:Lu0/k$a;

    .line 19
    .line 20
    invoke-virtual {v1}, Lu0/k$a;->a()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    move v10, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v10, p8

    .line 27
    .line 28
    :goto_1
    and-int/lit8 v1, v0, 0x20

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    move-object v11, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object/from16 v11, p9

    .line 36
    .line 37
    :goto_2
    and-int/lit8 v1, v0, 0x40

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/high16 v1, 0x3f800000    # 1.0f

    .line 42
    .line 43
    move v12, v1

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v12, p10

    .line 46
    .line 47
    :goto_3
    and-int/lit16 v1, v0, 0x80

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    move-object v13, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object/from16 v13, p11

    .line 54
    .line 55
    :goto_4
    and-int/lit16 v0, v0, 0x100

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 60
    .line 61
    invoke-virtual {v0}, Lu0/f$a;->a()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    move v14, v0

    .line 66
    :goto_5
    move-object v2, p0

    .line 67
    move-wide/from16 v3, p1

    .line 68
    .line 69
    move-wide/from16 v5, p3

    .line 70
    .line 71
    move-wide/from16 v7, p5

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_5
    move/from16 v14, p12

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :goto_6
    invoke-interface/range {v2 .. v14}, Lu0/f;->N0(JJJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 82
    .line 83
    const-string v0, "Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0"

    .line 84
    .line 85
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public static synthetic v1(Lu0/f;Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 10

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    if-nez p13, :cond_7

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lr0/f;->b:Lr0/f$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lr0/f$a;->c()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide v1, p2

    .line 17
    :goto_0
    and-int/lit8 v3, v0, 0x4

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Lu0/f;->f()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-direct {p0, v3, v4, v1, v2}, Lu0/f;->f1(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide v3, p4

    .line 31
    :goto_1
    and-int/lit8 v5, v0, 0x8

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    sget-object v5, Lr0/a;->a:Lr0/a$a;

    .line 36
    .line 37
    invoke-virtual {v5}, Lr0/a$a;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-wide/from16 v5, p6

    .line 43
    .line 44
    :goto_2
    and-int/lit8 v7, v0, 0x10

    .line 45
    .line 46
    if-eqz v7, :cond_3

    .line 47
    .line 48
    const/high16 v7, 0x3f800000    # 1.0f

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move/from16 v7, p8

    .line 52
    .line 53
    :goto_3
    and-int/lit8 v8, v0, 0x20

    .line 54
    .line 55
    if-eqz v8, :cond_4

    .line 56
    .line 57
    sget-object v8, Lu0/j;->a:Lu0/j;

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    move-object/from16 v8, p9

    .line 61
    .line 62
    :goto_4
    and-int/lit8 v9, v0, 0x40

    .line 63
    .line 64
    if-eqz v9, :cond_5

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    goto :goto_5

    .line 68
    :cond_5
    move-object/from16 v9, p10

    .line 69
    .line 70
    :goto_5
    and-int/lit16 v0, v0, 0x80

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    sget-object v0, Lu0/f;->j0:Lu0/f$a;

    .line 75
    .line 76
    invoke-virtual {v0}, Lu0/f$a;->a()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    move/from16 p13, v0

    .line 81
    .line 82
    :goto_6
    move-object p2, p0

    .line 83
    move-object p3, p1

    .line 84
    move-wide p4, v1

    .line 85
    move-wide/from16 p6, v3

    .line 86
    .line 87
    move-wide/from16 p8, v5

    .line 88
    .line 89
    move/from16 p10, v7

    .line 90
    .line 91
    move-object/from16 p11, v8

    .line 92
    .line 93
    move-object/from16 p12, v9

    .line 94
    .line 95
    goto :goto_7

    .line 96
    :cond_6
    move/from16 p13, p11

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :goto_7
    invoke-interface/range {p2 .. p13}, Lu0/f;->m1(Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 104
    .line 105
    const-string v1, "Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ"

    .line 106
    .line 107
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0
.end method


# virtual methods
.method public abstract A1(Ls0/b1;JJJJFLu0/g;Landroidx/compose/ui/graphics/d;II)V
.end method

.method public abstract C1(Ls0/m1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract D0(Ls0/b1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract N0(JJJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract U0(Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract V0(JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract Z0(JFFZJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract a0(Ls0/h0;JJFILs0/n1;FLandroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract c1(JFJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public f()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lu0/f;->n1()Lu0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lu0/d;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public abstract g1(JJJJLu0/g;FLandroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract getLayoutDirection()Li1/t;
.end method

.method public abstract m1(Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public abstract n1()Lu0/d;
.end method

.method public abstract p1(Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V
.end method

.method public t1()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lu0/f;->n1()Lu0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lu0/d;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Lr0/m;->b(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method
