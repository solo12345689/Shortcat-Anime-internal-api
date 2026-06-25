.class public abstract LK/U;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/U$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(Li1/d;ILa1/d0;LU0/T0;ZI)Lr0/h;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LK/U;->b(Li1/d;ILa1/d0;LU0/T0;ZI)Lr0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Li1/d;ILa1/d0;LU0/T0;ZI)Lr0/h;
    .locals 7

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2}, La1/d0;->a()La1/J;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p2, p1}, La1/J;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p3, p1}, LU0/T0;->e(I)Lr0/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    move-object v0, p1

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_1
    sget-object p1, Lr0/h;->e:Lr0/h$a;

    .line 21
    .line 22
    invoke-virtual {p1}, Lr0/h$a;->a()Lr0/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :goto_2
    invoke-static {}, LK/K;->b()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-interface {p0, p1}, Li1/d;->s0(F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p4, :cond_2

    .line 36
    .line 37
    int-to-float p1, p5

    .line 38
    invoke-virtual {v0}, Lr0/h;->i()F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    sub-float/2addr p1, p2

    .line 43
    int-to-float p2, p0

    .line 44
    sub-float/2addr p1, p2

    .line 45
    :goto_3
    move v1, p1

    .line 46
    goto :goto_4

    .line 47
    :cond_2
    invoke-virtual {v0}, Lr0/h;->i()F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    goto :goto_3

    .line 52
    :goto_4
    if-eqz p4, :cond_3

    .line 53
    .line 54
    int-to-float p0, p5

    .line 55
    invoke-virtual {v0}, Lr0/h;->i()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    sub-float/2addr p0, p1

    .line 60
    :goto_5
    move v3, p0

    .line 61
    goto :goto_6

    .line 62
    :cond_3
    invoke-virtual {v0}, Lr0/h;->i()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    int-to-float p0, p0

    .line 67
    add-float/2addr p0, p1

    .line 68
    goto :goto_5

    .line 69
    :goto_6
    const/16 v5, 0xa

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-static/range {v0 .. v6}, Lr0/h;->d(Lr0/h;FFFFILjava/lang/Object;)Lr0/h;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LK/V;La1/U;La1/f0;Lie/a;)Landroidx/compose/ui/e;
    .locals 4

    .line 1
    invoke-virtual {p1}, LK/V;->f()Lz/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, La1/U;->k()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p1, v1, v2}, LK/V;->e(J)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p2}, La1/U;->k()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-virtual {p1, v2, v3}, LK/V;->i(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, La1/U;->i()LU0/e;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p3, p2}, LK/n0;->c(La1/f0;LU0/e;)La1/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    sget-object p3, LK/U$a;->a:[I

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aget p3, p3, v0

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    if-eq p3, v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-ne p3, v0, :cond_0

    .line 41
    .line 42
    new-instance p3, LK/o;

    .line 43
    .line 44
    invoke-direct {p3, p1, v1, p2, p4}, LK/o;-><init>(LK/V;ILa1/d0;Lie/a;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p0, LTd/r;

    .line 49
    .line 50
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_1
    new-instance p3, LK/o0;

    .line 55
    .line 56
    invoke-direct {p3, p1, v1, p2, p4}, LK/o0;-><init>(LK/V;ILa1/d0;Lie/a;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {p0}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p0, p3}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LK/V;LB/m;Z)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LK/U$b;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, p3}, LK/U$b;-><init>(LK/V;LB/m;Z)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    new-instance v1, LK/U$c;

    .line 18
    .line 19
    invoke-direct {v1, p1, p3, p2}, LK/U$c;-><init>(LK/V;ZLB/m;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
