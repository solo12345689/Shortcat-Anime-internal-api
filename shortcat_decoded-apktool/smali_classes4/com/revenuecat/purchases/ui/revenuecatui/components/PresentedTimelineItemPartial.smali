.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0000H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;",
        "partial",
        "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;",
        "connectorStyle",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;",
        "(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;)V",
        "getConnectorStyle",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;",
        "getPartial",
        "()Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;",
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

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial$Companion;


# instance fields
.field private final connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

.field private final partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;)V
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
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;

    move-result-object p1

    return-object p1
.end method

.method public combine(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;
    .locals 4

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;

    .line 4
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;->getVisible()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;->getVisible()Ljava/lang/Boolean;

    move-result-object v3

    :cond_2
    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;->getConnector()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;->getConnector()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;

    move-result-object v0

    .line 7
    :cond_4
    invoke-direct {v2, v3, v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;-><init>(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;)V

    if-eqz p1, :cond_5

    .line 8
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    if-nez p1, :cond_6

    :cond_5
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 9
    :cond_6
    invoke-direct {v1, v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;-><init>(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;)V

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
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final synthetic getConnectorStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPartial()Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
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
    const-string v1, "PresentedTimelineItemPartial(partial="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->partial:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", connectorStyle="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;->connectorStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x29

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
