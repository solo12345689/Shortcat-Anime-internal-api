.class public abstract Lr0/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(FFFFFF)Lr0/j;
    .locals 16

    .line 1
    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-long v2, v2

    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v4

    .line 14
    const-wide v4, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v2, v4

    .line 20
    or-long/2addr v0, v2

    .line 21
    invoke-static {v0, v1}, Lr0/a;->b(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    new-instance v2, Lr0/j;

    .line 26
    .line 27
    const/4 v15, 0x0

    .line 28
    move-wide v9, v7

    .line 29
    move-wide v11, v7

    .line 30
    move-wide v13, v7

    .line 31
    move/from16 v3, p0

    .line 32
    .line 33
    move/from16 v4, p1

    .line 34
    .line 35
    move/from16 v5, p2

    .line 36
    .line 37
    move/from16 v6, p3

    .line 38
    .line 39
    invoke-direct/range {v2 .. v15}, Lr0/j;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    return-object v2
.end method

.method public static final b(Lr0/h;JJJJ)Lr0/j;
    .locals 14

    .line 1
    new-instance v0, Lr0/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr0/h;->i()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lr0/h;->l()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lr0/h;->j()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p0}, Lr0/h;->e()F

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v13, 0x0

    .line 20
    move-wide v5, p1

    .line 21
    move-wide/from16 v7, p3

    .line 22
    .line 23
    move-wide/from16 v9, p5

    .line 24
    .line 25
    move-wide/from16 v11, p7

    .line 26
    .line 27
    invoke-direct/range {v0 .. v13}, Lr0/j;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static final c(FFFFJ)Lr0/j;
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p4, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p4, v1

    .line 16
    long-to-int p4, p4

    .line 17
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    move p4, v0

    .line 22
    invoke-static/range {p0 .. p5}, Lr0/k;->a(FFFFFF)Lr0/j;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final d(Lr0/j;)Lr0/h;
    .locals 4

    .line 1
    new-instance v0, Lr0/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr0/j;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lr0/j;->g()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lr0/j;->f()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p0}, Lr0/j;->a()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-direct {v0, v1, v2, v3, p0}, Lr0/h;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static final e(Lr0/j;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/j;->h()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    ushr-long v2, v0, v2

    .line 8
    .line 9
    const-wide v4, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr v0, v4

    .line 15
    cmp-long v0, v2, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lr0/j;->h()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0}, Lr0/j;->i()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lr0/j;->h()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-virtual {p0}, Lr0/j;->c()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lr0/j;->h()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-virtual {p0}, Lr0/j;->b()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    cmp-long p0, v0, v2

    .line 52
    .line 53
    if-nez p0, :cond_0

    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :cond_0
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method public static final f(Lr0/j;J)Lr0/j;
    .locals 14

    .line 1
    new-instance v0, Lr0/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr0/j;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    shr-long v2, p1, v2

    .line 10
    .line 11
    long-to-int v2, v2

    .line 12
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    add-float/2addr v1, v3

    .line 17
    invoke-virtual {p0}, Lr0/j;->g()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const-wide v4, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v4, p1

    .line 27
    long-to-int v4, v4

    .line 28
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    add-float/2addr v3, v5

    .line 33
    invoke-virtual {p0}, Lr0/j;->f()F

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-float/2addr v5, v2

    .line 42
    invoke-virtual {p0}, Lr0/j;->a()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-float/2addr v4, v2

    .line 51
    move v2, v3

    .line 52
    move v3, v5

    .line 53
    invoke-virtual {p0}, Lr0/j;->h()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-virtual {p0}, Lr0/j;->i()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    invoke-virtual {p0}, Lr0/j;->c()J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    invoke-virtual {p0}, Lr0/j;->b()J

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    const/4 v13, 0x0

    .line 70
    invoke-direct/range {v0 .. v13}, Lr0/j;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method
