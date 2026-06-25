.class final Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView$paywallOptionsState$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "()V",
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
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView$paywallOptionsState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView$paywallOptionsState$1;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView$paywallOptionsState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;

    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;->access$getDismissHandler$p(Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;)Lie/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
