.class public abstract LU0/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Ljava/lang/String;LU0/Y0;JLi1/d;LY0/u$b;Ljava/util/List;Ljava/util/List;IZ)LU0/v;
    .locals 11

    .line 1
    sget-object v0, Lg1/v;->a:Lg1/v$a;

    .line 2
    .line 3
    if-eqz p9, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg1/v$a;->b()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-wide v7, p2

    .line 12
    move-object v9, p4

    .line 13
    move-object/from16 v10, p5

    .line 14
    .line 15
    move-object/from16 v3, p6

    .line 16
    .line 17
    move-object/from16 v4, p7

    .line 18
    .line 19
    move/from16 v5, p8

    .line 20
    .line 21
    move v6, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v0}, Lg1/v$a;->a()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static/range {v1 .. v10}, Ld1/g;->b(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;IIJLi1/d;LY0/u$b;)LU0/v;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;LU0/Y0;JLi1/d;LY0/u$b;Ljava/util/List;Ljava/util/List;IZILjava/lang/Object;)LU0/v;
    .locals 12

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v8, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v8, p6

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v1, v0, 0x40

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v9, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object/from16 v9, p7

    .line 26
    .line 27
    :goto_1
    and-int/lit16 v1, v0, 0x80

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const v1, 0x7fffffff

    .line 32
    .line 33
    .line 34
    move v10, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move/from16 v10, p8

    .line 37
    .line 38
    :goto_2
    and-int/lit16 v0, v0, 0x100

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    move v11, v0

    .line 44
    :goto_3
    move-object v2, p0

    .line 45
    move-object v3, p1

    .line 46
    move-wide v4, p2

    .line 47
    move-object/from16 v6, p4

    .line 48
    .line 49
    move-object/from16 v7, p5

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_3
    move/from16 v11, p9

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :goto_4
    invoke-static/range {v2 .. v11}, LU0/A;->a(Ljava/lang/String;LU0/Y0;JLi1/d;LY0/u$b;Ljava/util/List;Ljava/util/List;IZ)LU0/v;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static final synthetic c(LU0/y;JIZ)LU0/v;
    .locals 0

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    sget-object p4, Lg1/v;->a:Lg1/v$a;

    .line 4
    .line 5
    invoke-virtual {p4}, Lg1/v$a;->b()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p4, Lg1/v;->a:Lg1/v$a;

    .line 11
    .line 12
    invoke-virtual {p4}, Lg1/v$a;->a()I

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    :goto_0
    invoke-static {p0, p3, p4, p1, p2}, Ld1/g;->a(LU0/y;IIJ)LU0/v;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final d(LU0/y;JII)LU0/v;
    .locals 0

    .line 1
    invoke-static {p0, p3, p4, p1, p2}, Ld1/g;->a(LU0/y;IIJ)LU0/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e(F)I
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    double-to-float p0, v0

    .line 7
    float-to-int p0, p0

    .line 8
    return p0
.end method
