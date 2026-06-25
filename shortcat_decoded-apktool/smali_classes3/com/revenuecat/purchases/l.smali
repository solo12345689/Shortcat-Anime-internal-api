.class public final synthetic Lcom/revenuecat/purchases/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Lcom/android/billingclient/api/e;

.field public final synthetic c:Lcom/revenuecat/purchases/interfaces/Callback;

.field public final synthetic d:Lcom/android/billingclient/api/a;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/android/billingclient/api/e;Lcom/revenuecat/purchases/interfaces/Callback;Lcom/android/billingclient/api/a;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/l;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/l;->b:Lcom/android/billingclient/api/e;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/l;->c:Lcom/revenuecat/purchases/interfaces/Callback;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/revenuecat/purchases/l;->d:Lcom/android/billingclient/api/a;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/revenuecat/purchases/l;->e:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/l;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/l;->b:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/l;->c:Lcom/revenuecat/purchases/interfaces/Callback;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/l;->d:Lcom/android/billingclient/api/a;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/l;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/android/billingclient/api/e;Lcom/revenuecat/purchases/interfaces/Callback;Lcom/android/billingclient/api/a;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
