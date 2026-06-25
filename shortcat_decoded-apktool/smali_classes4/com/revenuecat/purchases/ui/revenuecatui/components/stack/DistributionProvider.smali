.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh1/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh1/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;",
        "Lh1/a;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;",
        "<init>",
        "()V",
        "LCf/i;",
        "values",
        "LCf/i;",
        "getValues",
        "()LCf/i;",
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


# instance fields
.field private final values:LCf/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCf/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;->values()[Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LUd/n;->M([Ljava/lang/Object;)LCf/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider$values$1;

    .line 13
    .line 14
    invoke-static {v0, v1}, LCf/l;->E(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;->values:LCf/i;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public bridge synthetic getCount()I
    .locals 1

    .line 1
    invoke-super {p0}, Lh1/a;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getValues()LCf/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LCf/i;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;->values:LCf/i;

    .line 2
    .line 3
    return-object v0
.end method
