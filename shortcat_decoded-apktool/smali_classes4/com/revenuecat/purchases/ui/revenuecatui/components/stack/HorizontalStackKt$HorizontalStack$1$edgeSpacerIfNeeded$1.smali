.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "(LY/m;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

.field final synthetic $fillSpaceSpacer:Lie/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/o;"
        }
    .end annotation
.end field

.field final synthetic $scope:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;Lie/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;",
            "Lie/o;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$scope:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$fillSpaceSpacer:Lie/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStack.<anonymous>.<anonymous> (HorizontalStack.kt:56)"

    const v2, -0x704c1d83

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$scope:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;->getShouldApplyFillSpacers()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 5
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getDistribution()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    move-result-object p2

    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;->SPACE_AROUND:Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    if-eq p2, v0, :cond_3

    .line 6
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getDistribution()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    move-result-object p2

    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;->SPACE_EVENLY:Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    if-ne p2, v0, :cond_4

    .line 7
    :cond_3
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;->$fillSpaceSpacer:Lie/o;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
