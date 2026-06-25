.class public final synthetic Lcom/revenuecat/purchases/hybridcommon/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;


# instance fields
.field public final synthetic a:Lcom/revenuecat/purchases/hybridcommon/OnResult;


# direct methods
.method public synthetic constructor <init>(Lcom/revenuecat/purchases/hybridcommon/OnResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/c;->a:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleResult(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/c;->a:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->c(Lcom/revenuecat/purchases/hybridcommon/OnResult;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
