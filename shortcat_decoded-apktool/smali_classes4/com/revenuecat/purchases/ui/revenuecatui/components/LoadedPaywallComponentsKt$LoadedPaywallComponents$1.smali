.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt;->LoadedPaywallComponents(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
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
.field final synthetic $background:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;

.field final synthetic $footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

.field final synthetic $style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lkotlin/jvm/functions/Function2;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            "Lkotlin/jvm/functions/Function2;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$background:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$onClick:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 11

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

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous> (LoadedPaywallComponents.kt:82)"

    const v2, -0x464a07c6

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$background:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;

    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$onClick:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1;->$footerComponentStyle:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;

    invoke-direct {p2, v0, v3, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)V

    const/16 v0, 0x36

    const v1, 0x7035d7ed

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v7

    const/16 v9, 0x6000

    const/16 v10, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v3 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt;->WithOptionalBackgroundOverlay(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
