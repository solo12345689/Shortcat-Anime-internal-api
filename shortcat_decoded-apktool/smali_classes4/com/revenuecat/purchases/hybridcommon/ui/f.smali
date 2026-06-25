.class public final synthetic Lcom/revenuecat/purchases/hybridcommon/ui/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/v;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

.field public final synthetic d:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->a:Landroidx/fragment/app/v;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->c:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->d:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->a:Landroidx/fragment/app/v;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->c:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/hybridcommon/ui/f;->d:Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->a(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
