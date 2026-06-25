.class public abstract LA/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Li1/d;F)I
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, LA/i;->k()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0, v1}, Li1/d;->l1(F)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    cmpg-float p0, v0, p0

    .line 14
    .line 15
    if-gez p0, :cond_0

    .line 16
    .line 17
    sget-object p0, LA/d;->a:LA/d$a;

    .line 18
    .line 19
    invoke-virtual {p0}, LA/d$a;->a()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    cmpl-float p0, p1, p0

    .line 26
    .line 27
    if-lez p0, :cond_1

    .line 28
    .line 29
    sget-object p0, LA/d;->a:LA/d$a;

    .line 30
    .line 31
    invoke-virtual {p0}, LA/d$a;->b()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_1
    sget-object p0, LA/d;->a:LA/d$a;

    .line 37
    .line 38
    invoke-virtual {p0}, LA/d$a;->c()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method
