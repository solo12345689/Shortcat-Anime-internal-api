.class public final synthetic Lcom/revenuecat/purchases/simulatedstore/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;


# direct methods
.method public synthetic constructor <init>(Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/simulatedstore/a;->a:Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/simulatedstore/a;->a:Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;->a(Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
