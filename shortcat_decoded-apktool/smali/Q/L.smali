.class public abstract LQ/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LU0/T0;IZZ)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    :cond_0
    if-nez p2, :cond_2

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    :cond_1
    move p2, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_2
    add-int/lit8 p2, p1, -0x1

    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :goto_0
    invoke-virtual {p0, p2}, LU0/T0;->c(I)Lg1/i;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p0, p1}, LU0/T0;->y(I)Lg1/i;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    if-ne p2, p3, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    :cond_3
    invoke-virtual {p0, p1, v0}, LU0/T0;->j(IZ)F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public static final b(LU0/T0;IZZ)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LU0/T0;->q(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LU0/T0;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0

    .line 18
    :cond_0
    invoke-static {p0, p1, p2, p3}, LQ/L;->a(LU0/T0;IZZ)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0}, LU0/T0;->B()J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    invoke-static {p2, p3}, Li1/r;->g(J)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    int-to-float p2, p2

    .line 31
    const/4 p3, 0x0

    .line 32
    invoke-static {p1, p3, p2}, Loe/j;->l(FFF)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, v0}, LU0/T0;->m(I)F

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p0}, LU0/T0;->B()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-static {v0, v1}, Li1/r;->f(J)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-float p0, p0

    .line 49
    invoke-static {p2, p3, p0}, Loe/j;->l(FFF)F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p1, p0}, Lr0/g;->a(FF)J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    return-wide p0
.end method
