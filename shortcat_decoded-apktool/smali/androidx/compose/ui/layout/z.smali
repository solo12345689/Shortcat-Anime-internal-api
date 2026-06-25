.class public abstract Landroidx/compose/ui/layout/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Landroidx/compose/ui/layout/s$a;Z[Landroidx/compose/ui/layout/y;F)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/z;->b(Landroidx/compose/ui/layout/s$a;Z[Landroidx/compose/ui/layout/y;F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final b(Landroidx/compose/ui/layout/s$a;Z[Landroidx/compose/ui/layout/y;F)F
    .locals 7

    .line 1
    array-length v0, p2

    .line 2
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v4, v1

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_3

    .line 8
    .line 9
    aget-object v5, p2, v3

    .line 10
    .line 11
    invoke-virtual {p0, v5, v1}, Landroidx/compose/ui/layout/s$a;->q(Landroidx/compose/ui/layout/y;F)F

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    cmpl-float v6, v5, v4

    .line 22
    .line 23
    if-lez v6, :cond_0

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v6, v2

    .line 28
    :goto_1
    if-ne p1, v6, :cond_2

    .line 29
    .line 30
    :cond_1
    move v4, v5

    .line 31
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    return p3

    .line 41
    :cond_4
    return v4
.end method
