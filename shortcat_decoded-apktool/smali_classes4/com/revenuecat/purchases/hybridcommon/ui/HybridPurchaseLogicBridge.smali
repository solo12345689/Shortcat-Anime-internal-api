.class public final Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;,
        Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aBO\u0012\"\u0010\u0007\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\"\u0010\u0008\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R0\u0010\u0007\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018R0\u0010\u0008\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;",
        "Lkotlin/Function1;",
        "",
        "",
        "",
        "LTd/L;",
        "onPerformPurchase",
        "onPerformRestore",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/revenuecat/purchases/Package;",
        "rcPackage",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;",
        "performPurchase",
        "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "customerInfo",
        "performRestore",
        "(Lcom/revenuecat/purchases/CustomerInfo;LZd/e;)Ljava/lang/Object;",
        "cancelPending",
        "()V",
        "Lkotlin/jvm/functions/Function1;",
        "Companion",
        "PendingRequest",
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


# static fields
.field public static final Companion:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;

.field public static final EVENT_KEY_PACKAGE_BEING_PURCHASED:Ljava/lang/String; = "packageBeingPurchased"

.field public static final EVENT_KEY_REQUEST_ID:Ljava/lang/String; = "requestId"

.field public static final RESULT_CANCELLATION:Ljava/lang/String; = "CANCELLATION"

.field public static final RESULT_ERROR:Ljava/lang/String; = "ERROR"

.field public static final RESULT_SUCCESS:Ljava/lang/String; = "SUCCESS"

.field private static final TAG:Ljava/lang/String; = "HybridPurchaseLogicBridge"

.field private static final pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final onPerformPurchase:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final onPerformRestore:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->Companion:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->onPerformPurchase:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->onPerformRestore:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->performRestore$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getPendingRequests$cp()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->performPurchase$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final performPurchase$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final performRestore$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final resolveResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->Companion:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;->resolveResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final cancelPending()V
    .locals 3

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "iterator.next()"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->getOwner()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-ne v2, p0, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->getDeferred()LGf/x;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Cancellation;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Cancellation;

    .line 54
    .line 55
    invoke-interface {v1, v2}, LGf/x;->O(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void
.end method

.method public performPurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;LZd/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/revenuecat/purchases/Package;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->onPerformPurchase:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    .line 3
    const-string p1, "HybridPurchaseLogicBridge"

    const-string p2, "No onPerformPurchase handler registered"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;

    .line 5
    new-instance p3, Lcom/revenuecat/purchases/PurchasesError;

    .line 6
    sget-object v0, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 7
    invoke-direct {p3, v0, p2}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 8
    invoke-direct {p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    return-object p1

    .line 9
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "randomUUID().toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 10
    invoke-static {v2, v1, v2}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    move-result-object v1

    .line 11
    sget-object v2, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;

    invoke-direct {v3, v1, p0}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;-><init>(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    const-string v2, "requestId"

    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 13
    const-string v2, "packageBeingPurchased"

    invoke-static {p2}, Lcom/revenuecat/purchases/hybridcommon/mappers/OfferingsMapperKt;->map(Lcom/revenuecat/purchases/Package;)Ljava/util/Map;

    move-result-object p2

    invoke-static {v2, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    filled-new-array {v0, p2}, [Lkotlin/Pair;

    move-result-object p2

    .line 14
    invoke-static {p2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    .line 15
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/revenuecat/purchases/hybridcommon/ui/a;

    invoke-direct {v2, p1, p2}, Lcom/revenuecat/purchases/hybridcommon/ui/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    invoke-interface {v1, p3}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public performPurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic$DefaultImpls;->performPurchase(Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public performRestore(Lcom/revenuecat/purchases/CustomerInfo;LZd/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/CustomerInfo;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->onPerformRestore:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, "HybridPurchaseLogicBridge"

    .line 6
    .line 7
    const-string p2, "No onPerformRestore handler registered"

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;

    .line 13
    .line 14
    new-instance v0, Lcom/revenuecat/purchases/PurchasesError;

    .line 15
    .line 16
    sget-object v1, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 17
    .line 18
    invoke-direct {v0, v1, p2}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "randomUUID().toString()"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v2, v1, v2}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->pendingRequests:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    new-instance v3, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;

    .line 47
    .line 48
    invoke-direct {v3, v1, p0}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;-><init>(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const-string v2, "requestId"

    .line 55
    .line 56
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v2, Landroid/os/Handler;

    .line 65
    .line 66
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/revenuecat/purchases/hybridcommon/ui/b;

    .line 74
    .line 75
    invoke-direct {v3, p1, v0}, Lcom/revenuecat/purchases/hybridcommon/ui/b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, p2}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method
