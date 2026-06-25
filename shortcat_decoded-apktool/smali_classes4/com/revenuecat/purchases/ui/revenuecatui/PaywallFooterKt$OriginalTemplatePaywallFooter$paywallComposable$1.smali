.class final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt;->OriginalTemplatePaywallFooter(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V
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
.field final synthetic $condensed:Z

.field final synthetic $options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;


# direct methods
.method constructor <init>(ZLcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;->$condensed:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

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

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.OriginalTemplatePaywallFooter.<anonymous> (PaywallFooter.kt:56)"

    const v2, -0x75b530ca

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;

    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;->$condensed:Z

    invoke-virtual {p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;->footerMode(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    move-result-object v7

    .line 6
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;->$options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    const/16 v11, 0x1dd

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;->copy$revenuecatui_defaultsBc8Release$default(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;ZLcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lie/a;Lkotlin/jvm/functions/Function2;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    move-result-object p2

    const/4 v0, 0x0

    .line 7
    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallKt;->Paywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
