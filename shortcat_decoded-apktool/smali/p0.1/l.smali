.class public abstract Lp0/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;FLs0/E1;ZJJ)Landroidx/compose/ui/e;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Li1/h;->n(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Li1/h;->m(FF)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gtz v0, :cond_1

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    :goto_0
    new-instance v1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    move v2, p1

    .line 21
    move-object v3, p2

    .line 22
    move v4, p3

    .line 23
    move-wide v5, p4

    .line 24
    move-wide/from16 v7, p6

    .line 25
    .line 26
    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;-><init>(FLs0/E1;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FLs0/E1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, p2

    .line 11
    :goto_0
    and-int/lit8 v1, p8, 0x4

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    int-to-float v2, v1

    .line 17
    invoke-static {v2}, Li1/h;->n(F)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p1, v2}, Li1/h;->m(FF)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, p3

    .line 30
    :cond_2
    :goto_1
    and-int/lit8 v2, p8, 0x8

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    invoke-static {}, Ls0/a1;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move-wide v3, p4

    .line 40
    :goto_2
    and-int/lit8 v2, p8, 0x10

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-static {}, Ls0/a1;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    move-wide p8, v5

    .line 49
    :goto_3
    move-object p2, p0

    .line 50
    move p3, p1

    .line 51
    move-object p4, v0

    .line 52
    move p5, v1

    .line 53
    move-wide p6, v3

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move-wide p8, p6

    .line 56
    goto :goto_3

    .line 57
    :goto_4
    invoke-static/range {p2 .. p9}, Lp0/l;->a(Landroidx/compose/ui/e;FLs0/E1;ZJJ)Landroidx/compose/ui/e;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
