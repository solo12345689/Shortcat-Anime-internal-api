.class public abstract Lp0/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;FFLs0/E1;)Landroidx/compose/ui/e;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    sget-object v1, Ls0/I1;->a:Ls0/I1$a;

    .line 5
    .line 6
    invoke-virtual {v1}, Ls0/I1$a;->a()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    move v7, v2

    .line 12
    :goto_0
    move v5, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object v1, Ls0/I1;->a:Ls0/I1$a;

    .line 15
    .line 16
    invoke-virtual {v1}, Ls0/I1$a;->b()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    move v7, v0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    int-to-float v0, v0

    .line 23
    invoke-static {v0}, Li1/h;->n(F)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {p1, v1}, Li1/h;->m(FF)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Li1/h;->n(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {p2, v0}, Li1/h;->m(FF)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-gtz v0, :cond_2

    .line 42
    .line 43
    :cond_1
    if-eqz v7, :cond_3

    .line 44
    .line 45
    :cond_2
    new-instance v2, Lp0/b$a;

    .line 46
    .line 47
    move v3, p1

    .line 48
    move v4, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-direct/range {v2 .. v7}, Lp0/b$a;-><init>(FFILs0/E1;Z)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v2}, Landroidx/compose/ui/graphics/f;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_3
    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;FLs0/E1;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    invoke-static {p0, p1, p1, p2}, Lp0/b;->a(Landroidx/compose/ui/e;FFLs0/E1;)Landroidx/compose/ui/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;FLp0/c;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lp0/c;->b:Lp0/c$a;

    .line 6
    .line 7
    invoke-virtual {p2}, Lp0/c$a;->a()Ls0/E1;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p2}, Lp0/c;->c(Ls0/E1;)Lp0/c;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_0
    invoke-virtual {p2}, Lp0/c;->h()Ls0/E1;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p0, p1, p2}, Lp0/b;->b(Landroidx/compose/ui/e;FLs0/E1;)Landroidx/compose/ui/e;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
