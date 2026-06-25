.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PaddingValuesKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LC/A;",
        "Li1/t;",
        "layoutDirection",
        "Li1/h;",
        "calculateHorizontalPadding",
        "(LC/A;Li1/t;)F",
        "calculateVerticalPadding",
        "(LC/A;)F",
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
.method public static final synthetic calculateHorizontalPadding(LC/A;Li1/t;)F
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "layoutDirection"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/p;->g(LC/A;Li1/t;)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/p;->f(LC/A;Li1/t;)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    add-float/2addr v0, p0

    .line 20
    invoke-static {v0}, Li1/h;->n(F)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public static final synthetic calculateVerticalPadding(LC/A;)F
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LC/A;->d()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p0}, LC/A;->c()F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    add-float/2addr v0, p0

    .line 15
    invoke-static {v0}, Li1/h;->n(F)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method
