.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0006\u001aC\u0010\u0004\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\"\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a*\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0014"
    }
    d2 = {
        "LTd/y;",
        "",
        "color1",
        "color2",
        "colorDistance",
        "(LTd/y;LTd/y;)D",
        "Ls0/r0;",
        "color",
        "relativeLuminance-8_81llA",
        "(J)D",
        "relativeLuminance",
        "contrastRatio--OWjLjI",
        "(JJ)D",
        "contrastRatio",
        "",
        "from",
        "againstColor",
        "selectColorWithBestContrast-4WTKRHQ",
        "(Ljava/util/List;J)Ls0/r0;",
        "selectColorWithBestContrast",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final colorDistance(LTd/y;LTd/y;)D
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTd/y;",
            "LTd/y;",
            ")D"
        }
    .end annotation

    .line 1
    const-string v0, "color1"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "color2"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LTd/y;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0}, LTd/y;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-virtual {p0}, LTd/y;->c()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {p1}, LTd/y;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    invoke-virtual {p1}, LTd/y;->b()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    invoke-virtual {p1}, LTd/y;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    sub-double/2addr v0, v6

    .line 72
    const/4 v6, 0x2

    .line 73
    int-to-double v6, v6

    .line 74
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    sub-double/2addr v2, v8

    .line 79
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    add-double/2addr v0, v2

    .line 84
    sub-double/2addr v4, p0

    .line 85
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 86
    .line 87
    .line 88
    move-result-wide p0

    .line 89
    add-double/2addr v0, p0

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide p0

    .line 94
    return-wide p0
.end method

.method public static final contrastRatio--OWjLjI(JJ)D
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->relativeLuminance-8_81llA(J)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->relativeLuminance-8_81llA(J)D

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    const-wide p2, 0x3fa999999999999aL    # 0.05

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    add-double/2addr v0, p2

    .line 23
    add-double/2addr p0, p2

    .line 24
    div-double/2addr v0, p0

    .line 25
    return-wide v0
.end method

.method public static final relativeLuminance-8_81llA(J)D
    .locals 6

    .line 1
    invoke-static {p0, p1}, Ls0/r0;->x(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->relativeLuminance_8_81llA$adjust(F)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide v2, 0x3fcb367a0f9096bcL    # 0.2126

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    mul-double/2addr v0, v2

    .line 15
    invoke-static {p0, p1}, Ls0/r0;->w(J)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->relativeLuminance_8_81llA$adjust(F)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide v4, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    mul-double/2addr v2, v4

    .line 29
    add-double/2addr v0, v2

    .line 30
    invoke-static {p0, p1}, Ls0/r0;->u(J)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->relativeLuminance_8_81llA$adjust(F)D

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    const-wide v2, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    mul-double/2addr p0, v2

    .line 44
    add-double/2addr v0, p0

    .line 45
    return-wide v0
.end method

.method private static final relativeLuminance_8_81llA$adjust(F)D
    .locals 4

    .line 1
    const v0, 0x3d20e411    # 0.03928f

    .line 2
    .line 3
    .line 4
    cmpg-float v0, p0, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    float-to-double v0, p0

    .line 9
    const-wide v2, 0x4029d70a3d70a3d7L    # 12.92

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    div-double/2addr v0, v2

    .line 15
    return-wide v0

    .line 16
    :cond_0
    float-to-double v0, p0

    .line 17
    const-wide v2, 0x3fac28f5c28f5c29L    # 0.055

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    add-double/2addr v0, v2

    .line 23
    const-wide v2, 0x3ff0e147ae147ae1L    # 1.055

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    div-double/2addr v0, v2

    .line 29
    const-wide v2, 0x4003333333333333L    # 2.4

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
.end method

.method public static final selectColorWithBestContrast-4WTKRHQ(Ljava/util/List;J)Ls0/r0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls0/r0;",
            ">;J)",
            "Ls0/r0;"
        }
    .end annotation

    .line 1
    const-string v0, "from"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    :goto_0
    move-object p0, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v1, v0

    .line 31
    check-cast v1, Ls0/r0;

    .line 32
    .line 33
    invoke-virtual {v1}, Ls0/r0;->A()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-static {v1, v2, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->contrastRatio--OWjLjI(JJ)D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v4, v3

    .line 46
    check-cast v4, Ls0/r0;

    .line 47
    .line 48
    invoke-virtual {v4}, Ls0/r0;->A()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-static {v4, v5, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ColorComputationHelpersKt;->contrastRatio--OWjLjI(JJ)D

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-gez v6, :cond_3

    .line 61
    .line 62
    move-object v0, v3

    .line 63
    move-wide v1, v4

    .line 64
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_1
    check-cast p0, Ls0/r0;

    .line 72
    .line 73
    return-object p0
.end method
