.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B+\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0013\u001a\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;",
        "backgroundStyles",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;",
        "borderStyles",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;",
        "shadowStyles",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;",
        "partial",
        "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;)V",
        "getBackgroundStyles",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;",
        "getBorderStyles",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;",
        "getPartial",
        "()Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;",
        "getShadowStyles",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;",
        "combine",
        "with",
        "Companion",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial$Companion;


# instance fields
.field private final backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

.field private final borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

.field private final partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

.field private final shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;)V
    .locals 1

    .line 1
    const-string v0, "partial"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;

    move-result-object p1

    return-object p1
.end method

.method public combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;
    .locals 14

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;

    if-eqz p1, :cond_1

    .line 4
    iget-object v2, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    :cond_2
    if-eqz p1, :cond_3

    .line 5
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    if-nez v3, :cond_4

    :cond_3
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    :cond_4
    if-eqz p1, :cond_5

    .line 6
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    if-nez p1, :cond_6

    :cond_5
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 7
    :cond_6
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    if-eqz v0, :cond_7

    .line 8
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_7
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v5

    :cond_8
    if-eqz v0, :cond_9

    .line 9
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v6

    if-nez v6, :cond_a

    :cond_9
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v6

    :cond_a
    if-eqz v0, :cond_b

    .line 10
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v7

    if-nez v7, :cond_c

    :cond_b
    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v7}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v7

    :cond_c
    if-eqz v0, :cond_d

    .line 11
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v8

    if-nez v8, :cond_e

    :cond_d
    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v8

    :cond_e
    if-eqz v0, :cond_f

    .line 12
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBackgroundColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    move-result-object v9

    if-nez v9, :cond_10

    :cond_f
    iget-object v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v9}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBackgroundColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    move-result-object v9

    :cond_10
    if-eqz v0, :cond_11

    .line 13
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBackground()Lcom/revenuecat/purchases/paywalls/components/common/Background;

    move-result-object v10

    if-nez v10, :cond_12

    :cond_11
    iget-object v10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v10}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBackground()Lcom/revenuecat/purchases/paywalls/components/common/Background;

    move-result-object v10

    :cond_12
    if-eqz v0, :cond_13

    .line 14
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getShape()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;

    move-result-object v11

    if-nez v11, :cond_14

    :cond_13
    iget-object v11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v11}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getShape()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;

    move-result-object v11

    :cond_14
    if-eqz v0, :cond_15

    .line 15
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    move-result-object v12

    if-nez v12, :cond_16

    :cond_15
    iget-object v12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v12}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    move-result-object v12

    :cond_16
    if-eqz v0, :cond_18

    .line 16
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    move-result-object v0

    if-nez v0, :cond_17

    goto :goto_2

    :cond_17
    :goto_1
    move-object v13, v0

    goto :goto_3

    :cond_18
    :goto_2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    move-result-object v0

    goto :goto_1

    .line 17
    :goto_3
    invoke-direct/range {v4 .. v13}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;-><init>(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V

    .line 18
    invoke-direct {v1, v2, v3, p1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 49
    .line 50
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final synthetic getBackgroundStyles()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getBorderStyles()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPartial()Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getShadowStyles()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :goto_2
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "PresentedTabsPartial(backgroundStyles="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->backgroundStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", borderStyles="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->borderStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", shadowStyles="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->shadowStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", partial="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
