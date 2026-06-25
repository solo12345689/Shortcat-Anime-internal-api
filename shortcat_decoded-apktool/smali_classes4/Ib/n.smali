.class public abstract LIb/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(FFFZZ)F
    .locals 0

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    const/high16 p3, 0x42c80000    # 100.0f

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sub-float p0, p3, p0

    .line 8
    .line 9
    :cond_0
    div-float/2addr p0, p3

    .line 10
    sub-float/2addr p2, p1

    .line 11
    mul-float/2addr p0, p2

    .line 12
    return p0

    .line 13
    :cond_1
    if-eqz p4, :cond_2

    .line 14
    .line 15
    sub-float/2addr p2, p1

    .line 16
    sub-float/2addr p2, p0

    .line 17
    return p2

    .line 18
    :cond_2
    return p0
.end method

.method public static final b(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F
    .locals 1

    .line 1
    const-string v0, "imageRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p0, p1, p2, p3, p4}, LIb/n;->a(FFFZZ)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static synthetic c(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZILjava/lang/Object;)F
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, LIb/n;->b(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final d(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F
    .locals 1

    .line 1
    const-string v0, "imageRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p0, p1, p2, p3, p4}, LIb/n;->a(FFFZZ)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static synthetic e(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZILjava/lang/Object;)F
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, LIb/n;->d(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
