.class public final Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;->launchPaywallIfNeeded(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/revenuecat/purchases/hybridcommon/ui/PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;",
        "",
        "wasDisplayed",
        "LTd/L;",
        "onPaywallDisplayResult",
        "(Z)V",
        "hybridcommon-ui_bc8Release"
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
.field final synthetic this$0:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1;->this$0:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPaywallDisplayResult(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1;->this$0:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 4
    .line 5
    const-string v0, "NOT_PRESENTED"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;->access$setFragmentResult(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1;->this$0:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;->access$removeFragment(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
