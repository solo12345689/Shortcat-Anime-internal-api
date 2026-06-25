.class public abstract Lg1/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(FLie/a;)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg1/m;->d(FLie/a;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final b(Lg1/p;Lg1/p;F)Lg1/p;
    .locals 3

    .line 1
    instance-of v0, p0, Lg1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v1, p1, Lg1/c;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lg1/p;->a:Lg1/p$a;

    .line 10
    .line 11
    invoke-interface {p0}, Lg1/p;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-interface {p1}, Lg1/p;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    invoke-static {v1, v2, p0, p1, p2}, Ls0/s0;->i(JJF)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-virtual {v0, p0, p1}, Lg1/p$a;->b(J)Lg1/p;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    instance-of v0, p1, Lg1/c;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object v0, Lg1/p;->a:Lg1/p$a;

    .line 35
    .line 36
    check-cast p0, Lg1/c;

    .line 37
    .line 38
    invoke-virtual {p0}, Lg1/c;->i()Ls0/h0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast p1, Lg1/c;

    .line 43
    .line 44
    invoke-virtual {p1}, Lg1/c;->i()Ls0/h0;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v1, v2, p2}, LU0/K0;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ls0/h0;

    .line 53
    .line 54
    invoke-virtual {p0}, Lg1/c;->a()F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {p1}, Lg1/c;->a()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p0, p1, p2}, Lk1/b;->b(FFF)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-virtual {v0, v1, p0}, Lg1/p$a;->a(Ls0/h0;F)Lg1/p;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_1
    invoke-static {p0, p1, p2}, LU0/K0;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lg1/p;

    .line 76
    .line 77
    return-object p0
.end method

.method public static final c(JF)J
    .locals 9

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, p2, v0

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    move-wide v1, p0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-static {p0, p1}, Ls0/r0;->t(J)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    mul-float v3, v0, p2

    .line 20
    .line 21
    const/16 v7, 0xe

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move-wide v1, p0

    .line 28
    invoke-static/range {v1 .. v8}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    return-wide p0

    .line 33
    :goto_0
    return-wide v1
.end method

.method private static final d(FLie/a;)F
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    :cond_0
    return p0
.end method
