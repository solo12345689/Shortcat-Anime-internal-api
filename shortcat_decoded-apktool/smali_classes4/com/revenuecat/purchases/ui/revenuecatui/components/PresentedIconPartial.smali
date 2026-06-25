.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;",
        "colorStyles",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;",
        "background",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;",
        "partial",
        "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V",
        "getBackground",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;",
        "getColorStyles",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;",
        "getPartial",
        "()Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;",
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

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial$Companion;


# instance fields
.field private final background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

.field private final colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

.field private final partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V
    .locals 1

    .line 1
    const-string v0, "partial"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;
    .locals 13

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    if-eqz p1, :cond_1

    .line 4
    iget-object v2, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    :cond_2
    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 6
    :cond_4
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    if-eqz v0, :cond_5

    .line 7
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_5
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v4

    :cond_6
    if-eqz v0, :cond_7

    .line 8
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getBaseUrl()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_7
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getBaseUrl()Ljava/lang/String;

    move-result-object v5

    :cond_8
    if-eqz v0, :cond_9

    .line 9
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getIconName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_a

    :cond_9
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getIconName()Ljava/lang/String;

    move-result-object v6

    :cond_a
    if-eqz v0, :cond_b

    .line 10
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getFormats()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;

    move-result-object v7

    if-nez v7, :cond_c

    :cond_b
    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v7}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getFormats()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;

    move-result-object v7

    :cond_c
    if-eqz v0, :cond_d

    .line 11
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v8

    if-nez v8, :cond_e

    :cond_d
    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v8

    :cond_e
    if-eqz v0, :cond_f

    .line 12
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    move-result-object v9

    if-nez v9, :cond_10

    :cond_f
    iget-object v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v9}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    move-result-object v9

    :cond_10
    if-eqz v0, :cond_11

    .line 13
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v10

    if-nez v10, :cond_12

    :cond_11
    iget-object v10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v10}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v10

    :cond_12
    if-eqz v0, :cond_13

    .line 14
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v11

    if-nez v11, :cond_14

    :cond_13
    iget-object v11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v11}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v11

    :cond_14
    if-eqz v0, :cond_16

    .line 15
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getIconBackground()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;

    move-result-object v0

    if-nez v0, :cond_15

    goto :goto_2

    :cond_15
    :goto_1
    move-object v12, v0

    goto :goto_3

    :cond_16
    :goto_2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->getIconBackground()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;

    move-result-object v0

    goto :goto_1

    .line 16
    :goto_3
    invoke-direct/range {v3 .. v12}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;)V

    .line 17
    invoke-direct {v1, v2, p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V

    return-object v1
.end method

.method public bridge synthetic combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    move-result-object p1

    return-object p1
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
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 38
    .line 39
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final synthetic getBackground()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getColorStyles()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPartial()Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

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
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_1
    add-int/2addr v0, v1

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
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
    const-string v1, "PresentedIconPartial(colorStyles="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->colorStyles:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", background="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->background:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", partial="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x29

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
