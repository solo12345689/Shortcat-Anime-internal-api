.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;",
        "partial",
        "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;",
        "(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V",
        "getPartial",
        "()Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;",
        "combine",
        "with",
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


# instance fields
.field private final partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V
    .locals 1

    .line 1
    const-string v0, "partial"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;

    move-result-object p1

    return-object p1
.end method

.method public combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;
    .locals 10

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;

    .line 4
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getVisible()Ljava/lang/Boolean;

    move-result-object v2

    :cond_2
    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getItemSpacing()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getItemSpacing()Ljava/lang/Integer;

    move-result-object v3

    :cond_4
    if-eqz p1, :cond_5

    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getTextSpacing()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_5
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getTextSpacing()Ljava/lang/Integer;

    move-result-object v4

    :cond_6
    if-eqz p1, :cond_7

    .line 8
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getColumnGutter()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_7
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getColumnGutter()Ljava/lang/Integer;

    move-result-object v5

    :cond_8
    if-eqz p1, :cond_9

    .line 9
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getIconAlignment()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    move-result-object v6

    if-nez v6, :cond_a

    :cond_9
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getIconAlignment()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    move-result-object v6

    :cond_a
    if-eqz p1, :cond_b

    .line 10
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v7

    if-nez v7, :cond_c

    :cond_b
    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v7}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v7

    :cond_c
    if-eqz p1, :cond_d

    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v8

    if-nez v8, :cond_e

    :cond_d
    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {v8}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v8

    :cond_e
    if-eqz p1, :cond_10

    .line 12
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object p1

    if-nez p1, :cond_f

    goto :goto_2

    :cond_f
    :goto_1
    move-object v9, p1

    goto :goto_3

    :cond_10
    :goto_2
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object p1

    goto :goto_1

    .line 13
    :goto_3
    invoke-direct/range {v1 .. v9}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;)V

    .line 14
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;-><init>(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final synthetic getPartial()Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
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
    const-string v1, "PresentedTimelinePartial(partial="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x29

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
