.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/SizeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001e\u0010\u0005\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0008H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "LC/A;",
        "margin",
        "Li1/t;",
        "layoutDirection",
        "addMargin",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;",
        "LTd/D;",
        "addMargin-Qn1smSk",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;I)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;",
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
.method public static final synthetic addMargin(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "margin"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "layoutDirection"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PaddingValuesKt;->calculateHorizontalPadding(LC/A;Li1/t;)F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    float-to-double v2, p2

    .line 27
    invoke-static {v2, v3}, LTd/N;->a(D)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {v1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/SizeKt;->addMargin-Qn1smSk(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;I)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PaddingValuesKt;->calculateVerticalPadding(LC/A;)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    float-to-double v1, p1

    .line 44
    invoke-static {v1, v2}, LTd/N;->a(D)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/SizeKt;->addMargin-Qn1smSk(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;I)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p2, p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method private static final addMargin-Qn1smSk(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;I)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 6
    .line 7
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, p1

    .line 14
    invoke-static {p0}, LTd/D;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    instance-of p1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    instance-of p1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 30
    .line 31
    :goto_0
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    new-instance p0, LTd/r;

    .line 35
    .line 36
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0
.end method
