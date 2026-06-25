.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;-><init>(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;
    .locals 7

    .line 2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getWindowSize(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lb4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;->from(Lb4/c;)Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getPackageAwareDelegate$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;->SELECTED:Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;->DEFAULT:Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getStyle$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;->getOverrides()Ljava/util/List;

    move-result-object v2

    .line 5
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getPackageAwareDelegate$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;->getOfferEligibility()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;

    move-result-object v3

    .line 6
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/ConditionContext;

    .line 7
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getSelectedPackageInfoProvider$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lie/a;

    move-result-object v5

    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;->getRcPackage()Lcom/revenuecat/purchases/Package;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 8
    :goto_1
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getCustomVariablesProvider$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Lie/a;

    move-result-object v6

    invoke-interface {v6}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    .line 9
    invoke-direct {v4, v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ConditionContext;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 10
    invoke-static {v2, v0, v3, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt;->buildPresentedPartial(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;Lcom/revenuecat/purchases/ui/revenuecatui/components/ConditionContext;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;

    move-result-object v0

    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$presentedPartial$2;->invoke()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;

    move-result-object v0

    return-object v0
.end method
