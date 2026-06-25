.class public abstract LU0/Z0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU0/Z0$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LU0/F;LU0/E;)LU0/G;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LU0/Z0;->b(LU0/F;LU0/E;)LU0/G;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(LU0/F;LU0/E;)LU0/G;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-static {p0, p1}, LU0/d;->a(LU0/F;LU0/E;)LU0/G;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final c(LU0/Y0;LU0/Y0;F)LU0/Y0;
    .locals 3

    .line 1
    new-instance v0, LU0/Y0;

    .line 2
    .line 3
    invoke-virtual {p0}, LU0/Y0;->O()LU0/I0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, LU0/Y0;->O()LU0/I0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v1, v2, p2}, LU0/K0;->c(LU0/I0;LU0/I0;F)LU0/I0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, LU0/Y0;->N()LU0/B;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, LU0/Y0;->N()LU0/B;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p0, p1, p2}, LU0/C;->b(LU0/B;LU0/B;F)LU0/B;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, LU0/Y0;-><init>(LU0/I0;LU0/B;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static final d(LU0/Y0;Li1/t;)LU0/Y0;
    .locals 3

    .line 1
    new-instance v0, LU0/Y0;

    .line 2
    .line 3
    invoke-virtual {p0}, LU0/Y0;->A()LU0/I0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, LU0/K0;->h(LU0/I0;)LU0/I0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LU0/Y0;->x()LU0/B;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2, p1}, LU0/C;->e(LU0/B;Li1/t;)LU0/B;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0}, LU0/Y0;->y()LU0/G;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, v1, p1, p0}, LU0/Y0;-><init>(LU0/I0;LU0/B;LU0/G;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static final e(Li1/t;I)I
    .locals 4

    .line 1
    sget-object v0, Lg1/l;->b:Lg1/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg1/l$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Lg1/l;->j(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    sget-object p1, LU0/Z0$a;->a:[I

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    aget p0, p1, p0

    .line 22
    .line 23
    if-eq p0, v3, :cond_1

    .line 24
    .line 25
    if-ne p0, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lg1/l$a;->c()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_0
    new-instance p0, LTd/r;

    .line 33
    .line 34
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_1
    invoke-virtual {v0}, Lg1/l$a;->b()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_2
    invoke-virtual {v0}, Lg1/l$a;->f()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {p1, v1}, Lg1/l;->j(II)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    sget-object p1, LU0/Z0$a;->a:[I

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    aget p0, p1, p0

    .line 60
    .line 61
    if-eq p0, v3, :cond_4

    .line 62
    .line 63
    if-ne p0, v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0}, Lg1/l$a;->e()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :cond_3
    new-instance p0, LTd/r;

    .line 71
    .line 72
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_4
    invoke-virtual {v0}, Lg1/l$a;->d()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0

    .line 81
    :cond_5
    return p1
.end method
