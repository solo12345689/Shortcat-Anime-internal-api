.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;",
        "Ls0/E1;",
        "toShape",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/Shape;)Ls0/E1;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;)Ls0/E1;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;",
        "convertCornerRadiusesToShape",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)Ls0/E1;",
        "",
        "SCALE_Y_OFFSET_CONCAVE_CONVEX",
        "F",
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


# static fields
.field private static final SCALE_Y_OFFSET_CONCAVE_CONVEX:F = 0.1f


# direct methods
.method private static final convertCornerRadiusesToShape(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)Ls0/E1;
    .locals 5

    .line 1
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;->getTopLeading()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;->getTopTrailing()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;->getBottomTrailing()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;->getBottomLeading()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {v0, v1, v2, p0}, LJ/i;->b(IIII)LJ/h;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;->getTopLeading()D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    double-to-float v0, v0

    .line 39
    invoke-static {v0}, Li1/h;->n(F)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;->getTopTrailing()D

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    double-to-float v1, v1

    .line 48
    invoke-static {v1}, Li1/h;->n(F)F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;->getBottomTrailing()D

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    double-to-float v2, v2

    .line 57
    invoke-static {v2}, Li1/h;->n(F)F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;->getBottomLeading()D

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    double-to-float p0, v3

    .line 66
    invoke-static {p0}, Li1/h;->n(F)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {v0, v1, v2, p0}, LJ/i;->e(FFFF)LJ/h;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_1
    new-instance p0, LTd/r;

    .line 76
    .line 77
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public static final synthetic toShape(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;)Ls0/E1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;

    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;->getCorners()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt;->convertCornerRadiusesToShape(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)Ls0/E1;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object p0

    return-object p0

    .line 3
    :cond_2
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Concave;

    if-eqz v0, :cond_3

    new-instance p0, LJ/e;

    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;

    invoke-direct {p0, v0}, LJ/e;-><init>(Lie/o;)V

    return-object p0

    .line 4
    :cond_3
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Convex;

    if-eqz v0, :cond_4

    new-instance p0, LJ/e;

    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$2;

    invoke-direct {p0, v0}, LJ/e;-><init>(Lie/o;)V

    return-object p0

    .line 5
    :cond_4
    instance-of p0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Circle;

    if-eqz p0, :cond_5

    invoke-static {}, LJ/i;->g()LJ/h;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0
.end method

.method public static final synthetic toShape(Lcom/revenuecat/purchases/paywalls/components/properties/Shape;)Ls0/E1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Shape;->getCornerRadiuses()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;

    move-result-object p0

    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt;->convertCornerRadiusesToShape(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)Ls0/E1;

    move-result-object p0

    return-object p0
.end method
