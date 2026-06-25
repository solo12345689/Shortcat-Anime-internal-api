.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;",
        "distribution",
        "LCf/i;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;",
        "invoke",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)LCf/i;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)LCf/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;",
            ")",
            "LCf/i;"
        }
    .end annotation

    const-string v0, "distribution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;->CENTER:Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;

    invoke-direct {v0, v1, p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)V

    .line 3
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;

    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;->CENTER:Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;

    invoke-direct {v1, v2, p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)V

    const/4 p1, 0x2

    new-array p1, p1, [Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;

    const/4 v2, 0x0

    aput-object v0, p1, v2

    const/4 v0, 0x1

    aput-object v1, p1, v0

    .line 4
    invoke-static {p1}, LCf/l;->s([Ljava/lang/Object;)LCf/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;->invoke(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)LCf/i;

    move-result-object p1

    return-object p1
.end method
