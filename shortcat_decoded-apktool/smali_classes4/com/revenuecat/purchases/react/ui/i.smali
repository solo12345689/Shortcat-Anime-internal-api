.class public final synthetic Lcom/revenuecat/purchases/react/ui/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/v;

.field public final synthetic b:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Boolean;

.field public final synthetic e:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

.field public final synthetic f:Ljava/util/Map;

.field public final synthetic g:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/i;->a:Landroidx/fragment/app/v;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/react/ui/i;->b:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/i;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/revenuecat/purchases/react/ui/i;->d:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/revenuecat/purchases/react/ui/i;->e:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/revenuecat/purchases/react/ui/i;->f:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/revenuecat/purchases/react/ui/i;->g:Lcom/facebook/react/bridge/Promise;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/i;->a:Landroidx/fragment/app/v;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/i;->b:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/react/ui/i;->d:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/react/ui/i;->e:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/revenuecat/purchases/react/ui/i;->f:Ljava/util/Map;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/revenuecat/purchases/react/ui/i;->g:Lcom/facebook/react/bridge/Promise;

    .line 14
    .line 15
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->a(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
