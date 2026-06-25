.class public interface abstract Li1/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public O(F)J
    .locals 2

    .line 1
    sget-object v0, Lj1/b;->a:Lj1/b;

    .line 2
    .line 3
    invoke-interface {p0}, Li1/l;->j1()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lj1/b;->f(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Li1/l;->j1()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    div-float/2addr p1, v0

    .line 18
    invoke-static {p1}, Li1/w;->e(F)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_0
    invoke-interface {p0}, Li1/l;->j1()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Lj1/b;->b(F)Lj1/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lj1/a;->a(F)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {p0}, Li1/l;->j1()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    div-float/2addr p1, v0

    .line 43
    :goto_0
    invoke-static {p1}, Li1/w;->e(F)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0
.end method

.method public T(J)F
    .locals 4

    .line 1
    invoke-static {p1, p2}, Li1/v;->g(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Li1/x;->b:Li1/x$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Li1/x$a;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Only Sp can convert to Px"

    .line 18
    .line 19
    invoke-static {v0}, Li1/m;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object v0, Lj1/b;->a:Lj1/b;

    .line 23
    .line 24
    invoke-interface {p0}, Li1/l;->j1()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lj1/b;->f(F)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p1, p2}, Li1/v;->h(J)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-interface {p0}, Li1/l;->j1()F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    mul-float/2addr p1, p2

    .line 43
    invoke-static {p1}, Li1/h;->n(F)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_1
    invoke-interface {p0}, Li1/l;->j1()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Lj1/b;->b(F)Lj1/a;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p1, p2}, Li1/v;->h(J)F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    invoke-interface {p0}, Li1/l;->j1()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    mul-float/2addr p1, p2

    .line 67
    invoke-static {p1}, Li1/h;->n(F)F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_2
    invoke-interface {v0, p1}, Lj1/a;->b(F)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p1}, Li1/h;->n(F)F

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1
.end method

.method public abstract j1()F
.end method
