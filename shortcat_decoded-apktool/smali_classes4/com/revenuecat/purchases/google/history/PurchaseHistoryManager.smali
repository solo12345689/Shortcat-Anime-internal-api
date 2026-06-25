.class public final Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J~\u0010\u0013\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\u0016\u0008\u0004\u0010\t\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00080\u00072\u001c\u0008\u0004\u0010\u000c\u001a\u0016\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u001e\u0008\u0004\u0010\u0012\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0082H\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0015\u001a\u00020\r2\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008 \u0010!J \u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008&\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R,\u00104\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\"0\u0008038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105\u00a8\u00067"
    }
    d2 = {
        "Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "T",
        "Lkotlin/Function0;",
        "LGf/x;",
        "getDeferred",
        "Lkotlin/Function1;",
        "LTd/L;",
        "setDeferred",
        "",
        "debugMessage",
        "",
        "clearOnCompletion",
        "LZd/e;",
        "operation",
        "getOrExecute",
        "(Lie/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;",
        "type",
        "continuationToken",
        "Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;",
        "queryPurchaseHistory",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;",
        "Landroid/os/Bundle;",
        "response",
        "parseResponse",
        "(Landroid/os/Bundle;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;",
        "cleanup",
        "()V",
        "connect",
        "(LZd/e;)Ljava/lang/Object;",
        "",
        "Lcom/revenuecat/purchases/models/StoreTransaction;",
        "queryAllPurchaseHistory",
        "(Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "disconnect",
        "Landroid/content/Context;",
        "Lcom/android/vending/billing/IInAppBillingService;",
        "billingService",
        "Lcom/android/vending/billing/IInAppBillingService;",
        "Landroid/content/ServiceConnection;",
        "serviceConnection",
        "Landroid/content/ServiceConnection;",
        "LPf/a;",
        "operationsMutex",
        "LPf/a;",
        "connectDeferred",
        "LGf/x;",
        "",
        "queryDeferreds",
        "Ljava/util/Map;",
        "Companion",
        "purchases_defaultsBc8Release"
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
.field public static final Companion:Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$Companion;

.field private static final MAX_PAGINATION_PAGES:I = 0x32


# instance fields
.field private billingService:Lcom/android/vending/billing/IInAppBillingService;

.field private connectDeferred:LGf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGf/x;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final operationsMutex:LPf/a;

.field private final queryDeferreds:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LGf/x;",
            ">;"
        }
    .end annotation
.end field

.field private serviceConnection:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->Companion:Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->context:Landroid/content/Context;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, p1, v0}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->operationsMutex:LPf/a;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryDeferreds:Ljava/util/Map;

    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic access$cleanup(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->cleanup()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LGf/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->connectDeferred:LGf/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->operationsMutex:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryDeferreds:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$queryPurchaseHistory(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryPurchaseHistory(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setBillingService$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Lcom/android/vending/billing/IInAppBillingService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->billingService:Lcom/android/vending/billing/IInAppBillingService;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LGf/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->connectDeferred:LGf/x;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setServiceConnection$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Landroid/content/ServiceConnection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->serviceConnection:Landroid/content/ServiceConnection;

    .line 2
    .line 3
    return-void
.end method

.method private final cleanup()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->connectDeferred:LGf/x;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0, v2, v1, v2}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryDeferreds:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, LGf/C0;

    .line 37
    .line 38
    invoke-static {v3, v2, v1, v2}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->serviceConnection:Landroid/content/ServiceConnection;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    :try_start_0
    iget-object v1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->context:Landroid/content/Context;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 52
    .line 53
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-gtz v3, :cond_2

    .line 68
    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v4, "[Purchases] - "

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v3, "AIDL Billing service disconnected"

    .line 91
    .line 92
    invoke-interface {v1, v0, v3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v3, "[Purchases] - ERROR"

    .line 102
    .line 103
    const-string v4, "Error disconnecting from AIDL Billing service"

    .line 104
    .line 105
    invoke-interface {v1, v3, v4, v0}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    :goto_1
    iput-object v2, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->billingService:Lcom/android/vending/billing/IInAppBillingService;

    .line 109
    .line 110
    iput-object v2, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->serviceConnection:Landroid/content/ServiceConnection;

    .line 111
    .line 112
    iput-object v2, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->connectDeferred:LGf/x;

    .line 113
    .line 114
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryDeferreds:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method private final getOrExecute(Lie/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lie/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1}, Lkotlin/jvm/internal/q;->c(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v2, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-static {v3}, Lkotlin/jvm/internal/q;->c(I)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, LGf/x;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-interface {p1}, LGf/C0;->j()Z

    .line 26
    .line 27
    .line 28
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-string v5, "[Purchases] - "

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    :try_start_1
    sget-object v4, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 34
    .line 35
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    sget-object v7, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 40
    .line 41
    invoke-virtual {v7}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v7, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-gtz v7, :cond_1

    .line 50
    .line 51
    new-instance v7, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p3, " (already completed)"

    .line 79
    .line 80
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-interface {v6, v4, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p3, LTd/L;->a:LTd/L;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto/16 :goto_7

    .line 95
    .line 96
    :cond_0
    sget-object v4, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 97
    .line 98
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v7, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 103
    .line 104
    invoke-virtual {v7}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v7, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-gtz v7, :cond_1

    .line 113
    .line 114
    new-instance v7, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v6, v4, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object p3, LTd/L;->a:LTd/L;

    .line 137
    .line 138
    :cond_1
    :goto_0
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {p1, p3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_1

    .line 145
    :cond_2
    invoke-static {v2, v3, v2}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-static {p1, p3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 155
    .line 156
    .line 157
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    check-cast p3, LGf/x;

    .line 172
    .line 173
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-nez p1, :cond_3

    .line 184
    .line 185
    invoke-static {v1}, Lkotlin/jvm/internal/q;->c(I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {p3, p6}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {v3}, Lkotlin/jvm/internal/q;->c(I)V

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_3
    :try_start_2
    invoke-interface {p5, p6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-interface {p3, p1}, LGf/x;->O(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 201
    .line 202
    .line 203
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 204
    .line 205
    .line 206
    if-eqz p4, :cond_4

    .line 207
    .line 208
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-static {v1}, Lkotlin/jvm/internal/q;->c(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p3, v2, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-static {v3}, Lkotlin/jvm/internal/q;->c(I)V

    .line 219
    .line 220
    .line 221
    :try_start_3
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 225
    .line 226
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {p3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :catchall_1
    move-exception p1

    .line 237
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_4
    :goto_2
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 248
    .line 249
    .line 250
    return-object p1

    .line 251
    :catchall_2
    move-exception p1

    .line 252
    goto :goto_3

    .line 253
    :catch_0
    move-exception p1

    .line 254
    goto :goto_4

    .line 255
    :goto_3
    :try_start_4
    invoke-interface {p3, p1}, LGf/x;->h(Ljava/lang/Throwable;)Z

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :catchall_3
    move-exception p1

    .line 260
    goto :goto_5

    .line 261
    :goto_4
    invoke-static {p3, v2, v3, v2}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 265
    :goto_5
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 266
    .line 267
    .line 268
    if-eqz p4, :cond_5

    .line 269
    .line 270
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 271
    .line 272
    .line 273
    move-result-object p3

    .line 274
    invoke-static {v1}, Lkotlin/jvm/internal/q;->c(I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {p3, v2, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    invoke-static {v3}, Lkotlin/jvm/internal/q;->c(I)V

    .line 281
    .line 282
    .line 283
    :try_start_5
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 287
    .line 288
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :catchall_4
    move-exception p1

    .line 299
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {p3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 306
    .line 307
    .line 308
    throw p1

    .line 309
    :cond_5
    :goto_6
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 310
    .line 311
    .line 312
    throw p1

    .line 313
    :goto_7
    invoke-static {v3}, Lkotlin/jvm/internal/q;->b(I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    .line 320
    .line 321
    .line 322
    throw p1
.end method

.method static synthetic getOrExecute$default(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Lie/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p7, p7, 0x8

    .line 2
    .line 3
    const/4 p8, 0x1

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move p4, p8

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 8
    .line 9
    .line 10
    move-result-object p7

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/q;->c(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p7, v1, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {p8}, Lkotlin/jvm/internal/q;->c(I)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LGf/x;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, LGf/C0;->j()Z

    .line 31
    .line 32
    .line 33
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    const-string v3, "[Purchases] - "

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    :try_start_1
    sget-object v2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 39
    .line 40
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 45
    .line 46
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-gtz v5, :cond_2

    .line 55
    .line 56
    new-instance v5, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p3, " (already completed)"

    .line 84
    .line 85
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-interface {v4, v2, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :cond_1
    sget-object v2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 100
    .line 101
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 106
    .line 107
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v5, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-gtz v5, :cond_2

    .line 116
    .line 117
    new-instance v5, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v4, v2, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    :goto_0
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-static {p1, p3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-static {v1, p8, v1}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-static {p1, p3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 156
    .line 157
    .line 158
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    :goto_1
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p7, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    check-cast p3, LGf/x;

    .line 173
    .line 174
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_4

    .line 185
    .line 186
    invoke-static {v0}, Lkotlin/jvm/internal/q;->c(I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p3, p6}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p8}, Lkotlin/jvm/internal/q;->c(I)V

    .line 194
    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_4
    :try_start_2
    invoke-static {v0}, Lkotlin/jvm/internal/q;->c(I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p5, p6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p8}, Lkotlin/jvm/internal/q;->c(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {p3, p1}, LGf/x;->O(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 208
    .line 209
    .line 210
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 211
    .line 212
    .line 213
    if-eqz p4, :cond_5

    .line 214
    .line 215
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {v0}, Lkotlin/jvm/internal/q;->c(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0, v1, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    invoke-static {p8}, Lkotlin/jvm/internal/q;->c(I)V

    .line 226
    .line 227
    .line 228
    :try_start_3
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    .line 233
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :catchall_1
    move-exception p1

    .line 244
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p0, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 251
    .line 252
    .line 253
    throw p1

    .line 254
    :cond_5
    :goto_2
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 255
    .line 256
    .line 257
    return-object p1

    .line 258
    :catchall_2
    move-exception p1

    .line 259
    goto :goto_3

    .line 260
    :catch_0
    move-exception p1

    .line 261
    goto :goto_4

    .line 262
    :goto_3
    :try_start_4
    invoke-interface {p3, p1}, LGf/x;->h(Ljava/lang/Throwable;)Z

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :catchall_3
    move-exception p1

    .line 267
    goto :goto_5

    .line 268
    :goto_4
    invoke-static {p3, v1, p8, v1}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 272
    :goto_5
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 273
    .line 274
    .line 275
    if-eqz p4, :cond_6

    .line 276
    .line 277
    invoke-static {p0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {v0}, Lkotlin/jvm/internal/q;->c(I)V

    .line 282
    .line 283
    .line 284
    invoke-interface {p0, v1, p6}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    invoke-static {p8}, Lkotlin/jvm/internal/q;->c(I)V

    .line 288
    .line 289
    .line 290
    :try_start_5
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 294
    .line 295
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p0, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :catchall_4
    move-exception p1

    .line 306
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {p0, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 313
    .line 314
    .line 315
    throw p1

    .line 316
    :cond_6
    :goto_6
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 317
    .line 318
    .line 319
    throw p1

    .line 320
    :goto_7
    invoke-static {p8}, Lkotlin/jvm/internal/q;->b(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p7, v1}, LPf/a;->e(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static {p8}, Lkotlin/jvm/internal/q;->a(I)V

    .line 327
    .line 328
    .line 329
    throw p0
.end method

.method private final parseResponse(Landroid/os/Bundle;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;
    .locals 10

    .line 1
    const-string v0, "RESPONSE_CODE"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, "[Purchases] - "

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 14
    .line 15
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 20
    .line 21
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-gtz v4, :cond_0

    .line 30
    .line 31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v4, "Purchase history query returned non-OK response: "

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/revenuecat/purchases/google/ErrorsKt;->getBillingResponseCodeName(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v3, p1, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    new-instance p1, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 75
    .line 76
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-direct {p1, v0, v2, v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_1
    const-string v3, "INAPP_PURCHASE_DATA_LIST"

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-nez v3, :cond_2

    .line 91
    .line 92
    new-instance v3, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    :cond_2
    const-string v4, "INAPP_DATA_SIGNATURE_LIST"

    .line 98
    .line 99
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-nez v4, :cond_3

    .line 104
    .line 105
    new-instance v4, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    :cond_3
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    .line 111
    .line 112
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v3, v4}, LUd/u;->j1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v4, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_4
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_7

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Lkotlin/Pair;

    .line 140
    .line 141
    invoke-virtual {v5}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v5}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Ljava/lang/String;

    .line 152
    .line 153
    sget-object v7, Lcom/revenuecat/purchases/google/history/PurchaseData;->Companion:Lcom/revenuecat/purchases/google/history/PurchaseData$Companion;

    .line 154
    .line 155
    const-string v8, "purchaseJson"

    .line 156
    .line 157
    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v6}, Lcom/revenuecat/purchases/google/history/PurchaseData$Companion;->fromJson(Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseData;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-eqz v7, :cond_5

    .line 165
    .line 166
    new-instance v8, Lcom/revenuecat/purchases/google/history/PurchaseHistoryRecord;

    .line 167
    .line 168
    const-string v9, "signature"

    .line 169
    .line 170
    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v8, v7, v5, v6}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryRecord;-><init>(Lcom/revenuecat/purchases/google/history/PurchaseData;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_5
    sget-object v5, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 178
    .line 179
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    sget-object v8, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 184
    .line 185
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v8, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-gtz v8, :cond_6

    .line 194
    .line 195
    new-instance v8, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    new-instance v8, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v9, "Failed to parse purchase data: "

    .line 220
    .line 221
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-interface {v7, v5, v6}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_6
    move-object v8, v1

    .line 235
    :goto_1
    if-eqz v8, :cond_4

    .line 236
    .line 237
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_7
    sget-object v1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 242
    .line 243
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 248
    .line 249
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v5, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-gtz v5, :cond_8

    .line 258
    .line 259
    new-instance v5, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    new-instance v2, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const-string v5, "Parsed "

    .line 284
    .line 285
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v5, " purchase history records from AIDL."

    .line 296
    .line 297
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-interface {v3, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_8
    new-instance v1, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 308
    .line 309
    invoke-direct {v1, v0, v4, p1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-object v1
.end method

.method public static synthetic queryAllPurchaseHistory$default(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Ljava/lang/String;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p1, "inapp"

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryAllPurchaseHistory(Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final queryPurchaseHistory(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->billingService:Lcom/android/vending/billing/IInAppBillingService;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p1, p2, v0, v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    :try_start_0
    new-instance v7, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 23
    .line 24
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-gtz v3, :cond_1

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v4, "[Purchases] - "

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v4, "Calling getPurchaseHistory via AIDL with API version 7, type="

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-interface {v2, v0, v3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->billingService:Lcom/android/vending/billing/IInAppBillingService;

    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->context:Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const/4 v3, 0x7

    .line 97
    move-object v5, p1

    .line 98
    move-object v6, p2

    .line 99
    invoke-interface/range {v2 .. v7}, Lcom/android/vending/billing/IInAppBillingService;->getPurchaseHistory(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string p2, "response"

    .line 104
    .line 105
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->parseResponse(Landroid/os/Bundle;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 109
    .line 110
    .line 111
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    return-object p1

    .line 113
    :goto_1
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const-string v0, "[Purchases] - ERROR"

    .line 118
    .line 119
    const-string v2, "Error querying purchase history via AIDL"

    .line 120
    .line 121
    invoke-interface {p2, v0, v2, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 125
    .line 126
    const/4 p2, 0x6

    .line 127
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p1, p2, v0, v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object p1
.end method

.method static synthetic queryPurchaseHistory$default(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const-string p1, "inapp"

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->queryPurchaseHistory(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final connect(LZd/e;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "[Purchases] - ERROR"

    .line 6
    .line 7
    instance-of v3, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;-><init>(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LZd/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x5

    .line 41
    const/4 v8, 0x4

    .line 42
    const/4 v9, 0x3

    .line 43
    const/4 v10, 0x2

    .line 44
    const/4 v11, 0x1

    .line 45
    const/4 v12, 0x0

    .line 46
    if-eqz v5, :cond_6

    .line 47
    .line 48
    if-eq v5, v11, :cond_5

    .line 49
    .line 50
    if-eq v5, v10, :cond_4

    .line 51
    .line 52
    if-eq v5, v9, :cond_3

    .line 53
    .line 54
    if-eq v5, v8, :cond_2

    .line 55
    .line 56
    if-eq v5, v7, :cond_1

    .line 57
    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_1
    iget-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LPf/a;

    .line 69
    .line 70
    iget-object v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Ljava/lang/Throwable;

    .line 73
    .line 74
    iget-object v3, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 77
    .line 78
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_d

    .line 82
    .line 83
    :cond_2
    iget-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, LPf/a;

    .line 86
    .line 87
    iget-object v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v3, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 92
    .line 93
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_3
    iget v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->I$0:I

    .line 99
    .line 100
    iget-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;

    .line 103
    .line 104
    iget-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, LGf/x;

    .line 107
    .line 108
    iget-object v6, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v6, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 111
    .line 112
    iget-object v9, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 115
    .line 116
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    move-object v7, v9

    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto/16 :goto_9

    .line 124
    .line 125
    :catch_0
    move-exception v0

    .line 126
    goto/16 :goto_a

    .line 127
    .line 128
    :cond_4
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_5
    iget v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->I$0:I

    .line 133
    .line 134
    iget-object v13, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v13, LPf/a;

    .line 137
    .line 138
    iget-object v14, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v14, Ljava/lang/String;

    .line 141
    .line 142
    iget-object v15, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v15, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 145
    .line 146
    iget-object v7, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v7, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 149
    .line 150
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    iput-object v1, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    const-string v14, "Connection already in progress or completed, hooking into existing operation"

    .line 166
    .line 167
    iput-object v14, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v13, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 170
    .line 171
    iput v6, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->I$0:I

    .line 172
    .line 173
    iput v11, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 174
    .line 175
    invoke-interface {v13, v12, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v4, :cond_7

    .line 180
    .line 181
    goto/16 :goto_c

    .line 182
    .line 183
    :cond_7
    move-object v7, v1

    .line 184
    move-object v15, v7

    .line 185
    move v5, v6

    .line 186
    :goto_1
    :try_start_1
    invoke-static {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LGf/x;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 193
    .line 194
    .line 195
    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    move/from16 v17, v6

    .line 197
    .line 198
    const-string v6, "[Purchases] - "

    .line 199
    .line 200
    if-eqz v16, :cond_8

    .line 201
    .line 202
    :try_start_2
    sget-object v8, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 203
    .line 204
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    sget-object v18, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-virtual {v10, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-gtz v10, :cond_9

    .line 219
    .line 220
    new-instance v10, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    new-instance v8, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v10, " (already completed)"

    .line 248
    .line 249
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-interface {v9, v6, v8}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :cond_8
    sget-object v8, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 264
    .line 265
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    sget-object v10, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 270
    .line 271
    invoke-virtual {v10}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    invoke-virtual {v10, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-gtz v10, :cond_9

    .line 280
    .line 281
    new-instance v10, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-interface {v9, v6, v14}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :cond_9
    :goto_2
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-static {v0, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    goto :goto_3

    .line 312
    :cond_a
    invoke-static {v12, v11, v12}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v7, v0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$setConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LGf/x;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    invoke-static {v0, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 324
    .line 325
    .line 326
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 327
    :goto_3
    invoke-interface {v13, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    check-cast v6, LGf/x;

    .line 335
    .line 336
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, Ljava/lang/Boolean;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_c

    .line 347
    .line 348
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 355
    .line 356
    const/4 v0, 0x2

    .line 357
    iput v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 358
    .line 359
    invoke-interface {v6, v3}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    if-ne v0, v4, :cond_b

    .line 364
    .line 365
    goto/16 :goto_c

    .line 366
    .line 367
    :cond_b
    return-object v0

    .line 368
    :cond_c
    :try_start_3
    iput-object v7, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v15, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v6, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v3, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 375
    .line 376
    iput v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->I$0:I

    .line 377
    .line 378
    const/4 v0, 0x3

    .line 379
    iput v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 380
    .line 381
    new-instance v8, LGf/p;

    .line 382
    .line 383
    invoke-static {v3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-direct {v8, v0, v11}, LGf/p;-><init>(LZd/e;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8}, LGf/p;->C()V

    .line 391
    .line 392
    .line 393
    new-instance v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$4$1$connection$1;

    .line 394
    .line 395
    invoke-direct {v0, v8, v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$4$1$connection$1;-><init>(LGf/n;Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)V

    .line 396
    .line 397
    .line 398
    new-instance v9, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$4$1$1;

    .line 399
    .line 400
    invoke-direct {v9, v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$4$1$1;-><init>(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v8, v9}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 404
    .line 405
    .line 406
    :try_start_4
    new-instance v9, Landroid/content/Intent;

    .line 407
    .line 408
    const-string v10, "com.android.vending.billing.InAppBillingService.BIND"

    .line 409
    .line 410
    invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const-string v10, "com.android.vending"

    .line 414
    .line 415
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 416
    .line 417
    .line 418
    invoke-static {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getContext$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Landroid/content/Context;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    invoke-virtual {v10, v9, v0, v11}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-nez v0, :cond_d

    .line 427
    .line 428
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    const-string v9, "Failed to bind to AIDL billing service"

    .line 433
    .line 434
    invoke-interface {v0, v2, v9, v12}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 435
    .line 436
    .line 437
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 438
    .line 439
    new-instance v0, Ljava/lang/Exception;

    .line 440
    .line 441
    const-string v9, "Failed to bind to Google Play billing service"

    .line 442
    .line 443
    invoke-direct {v0, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-interface {v8, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 455
    .line 456
    .line 457
    goto :goto_4

    .line 458
    :catchall_2
    move-exception v0

    .line 459
    :try_start_5
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    const-string v10, "Error binding to AIDL billing service"

    .line 464
    .line 465
    invoke-interface {v9, v2, v10, v0}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    sget-object v2, LTd/u;->b:LTd/u$a;

    .line 469
    .line 470
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-interface {v8, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_d
    :goto_4
    invoke-virtual {v8}, LGf/p;->v()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    if-ne v0, v2, :cond_e

    .line 490
    .line 491
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 492
    .line 493
    .line 494
    goto :goto_5

    .line 495
    :catchall_3
    move-exception v0

    .line 496
    move v2, v5

    .line 497
    move-object v5, v6

    .line 498
    move-object v9, v7

    .line 499
    move-object v6, v15

    .line 500
    goto :goto_9

    .line 501
    :catch_1
    move-exception v0

    .line 502
    move v2, v5

    .line 503
    move-object v5, v6

    .line 504
    move-object v9, v7

    .line 505
    move-object v6, v15

    .line 506
    goto :goto_a

    .line 507
    :cond_e
    :goto_5
    if-ne v0, v4, :cond_f

    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_f
    move v2, v5

    .line 511
    move-object v5, v6

    .line 512
    move-object v6, v15

    .line 513
    :goto_6
    :try_start_6
    invoke-interface {v5, v0}, LGf/x;->O(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 514
    .line 515
    .line 516
    if-eqz v2, :cond_11

    .line 517
    .line 518
    invoke-static {v6}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    iput-object v7, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 529
    .line 530
    const/4 v5, 0x4

    .line 531
    iput v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 532
    .line 533
    invoke-interface {v2, v12, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    if-ne v3, v4, :cond_10

    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_10
    move-object v4, v0

    .line 541
    move-object v3, v7

    .line 542
    :goto_7
    :try_start_7
    invoke-static {v3, v12}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$setConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LGf/x;)V

    .line 543
    .line 544
    .line 545
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 546
    .line 547
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    move-object v0, v4

    .line 551
    goto :goto_8

    .line 552
    :catchall_4
    move-exception v0

    .line 553
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    throw v0

    .line 557
    :cond_11
    :goto_8
    return-object v0

    .line 558
    :catchall_5
    move-exception v0

    .line 559
    move-object v9, v7

    .line 560
    goto :goto_9

    .line 561
    :catch_2
    move-exception v0

    .line 562
    move-object v9, v7

    .line 563
    goto :goto_a

    .line 564
    :goto_9
    :try_start_8
    invoke-interface {v5, v0}, LGf/x;->h(Ljava/lang/Throwable;)Z

    .line 565
    .line 566
    .line 567
    throw v0

    .line 568
    :catchall_6
    move-exception v0

    .line 569
    goto :goto_b

    .line 570
    :goto_a
    invoke-static {v5, v12, v11, v12}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 574
    :goto_b
    if-eqz v2, :cond_13

    .line 575
    .line 576
    invoke-static {v6}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    iput-object v9, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$0:Ljava/lang/Object;

    .line 581
    .line 582
    iput-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$1:Ljava/lang/Object;

    .line 583
    .line 584
    iput-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$2:Ljava/lang/Object;

    .line 585
    .line 586
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->L$3:Ljava/lang/Object;

    .line 587
    .line 588
    const/4 v5, 0x5

    .line 589
    iput v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$connect$1;->label:I

    .line 590
    .line 591
    invoke-interface {v2, v12, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    if-ne v3, v4, :cond_12

    .line 596
    .line 597
    :goto_c
    return-object v4

    .line 598
    :cond_12
    move-object v4, v0

    .line 599
    move-object v3, v9

    .line 600
    :goto_d
    :try_start_9
    invoke-static {v3, v12}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$setConnectDeferred$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LGf/x;)V

    .line 601
    .line 602
    .line 603
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 604
    .line 605
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    move-object v0, v4

    .line 609
    goto :goto_e

    .line 610
    :catchall_7
    move-exception v0

    .line 611
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :cond_13
    :goto_e
    throw v0

    .line 616
    :goto_f
    invoke-interface {v13, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    throw v0
.end method

.method public final disconnect(LZd/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;-><init>(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, LPf/a;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 46
    .line 47
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->operationsMutex:LPf/a;

    .line 63
    .line 64
    iput-object p0, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p1, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, v0, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$disconnect$1;->label:I

    .line 69
    .line 70
    invoke-interface {p1, v4, v0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    :goto_1
    :try_start_0
    invoke-direct {v0}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->cleanup()V

    .line 80
    .line 81
    .line 82
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    invoke-interface {v1, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p1, LTd/L;->a:LTd/L;

    .line 88
    .line 89
    return-object p1

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    invoke-interface {v1, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final queryAllPurchaseHistory(Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;-><init>(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;LZd/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    const/4 v7, 0x3

    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    if-eqz v5, :cond_5

    .line 45
    .line 46
    if-eq v5, v9, :cond_4

    .line 47
    .line 48
    if-eq v5, v8, :cond_3

    .line 49
    .line 50
    if-eq v5, v7, :cond_2

    .line 51
    .line 52
    if-eq v5, v6, :cond_1

    .line 53
    .line 54
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    iget-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LPf/a;

    .line 65
    .line 66
    iget-object v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Ljava/lang/Throwable;

    .line 69
    .line 70
    iget-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 77
    .line 78
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object v2, v0

    .line 82
    move-object v7, v10

    .line 83
    goto/16 :goto_10

    .line 84
    .line 85
    :cond_2
    iget-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, LPf/a;

    .line 88
    .line 89
    iget-object v4, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ljava/util/List;

    .line 92
    .line 93
    iget-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v3, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 100
    .line 101
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v13, v3

    .line 105
    move-object v2, v10

    .line 106
    :goto_1
    move-object v3, v0

    .line 107
    goto/16 :goto_b

    .line 108
    .line 109
    :cond_3
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_4
    iget v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->I$0:I

    .line 114
    .line 115
    iget-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, LPf/a;

    .line 118
    .line 119
    iget-object v11, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v11, Ljava/lang/String;

    .line 122
    .line 123
    iget-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v12, Ljava/lang/String;

    .line 126
    .line 127
    iget-object v13, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v13, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 130
    .line 131
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move v2, v0

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v5, "Query for type "

    .line 145
    .line 146
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v5, " already in progress, hooking into existing operation"

    .line 153
    .line 154
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v1}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    iput-object v1, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v11, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 172
    .line 173
    iput v9, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->I$0:I

    .line 174
    .line 175
    iput v9, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 176
    .line 177
    invoke-interface {v5, v10, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-ne v2, v4, :cond_6

    .line 182
    .line 183
    goto/16 :goto_f

    .line 184
    .line 185
    :cond_6
    move-object v12, v0

    .line 186
    move-object v13, v1

    .line 187
    move v2, v9

    .line 188
    :goto_2
    :try_start_0
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, LGf/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 197
    .line 198
    const-string v14, "[Purchases] - "

    .line 199
    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    :try_start_1
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    if-eqz v15, :cond_7

    .line 207
    .line 208
    sget-object v15, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 209
    .line 210
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    sget-object v16, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 215
    .line 216
    invoke-virtual/range {v16 .. v16}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v7, v15}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-gtz v7, :cond_8

    .line 225
    .line 226
    new-instance v7, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    new-instance v15, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v11, " (already completed)"

    .line 254
    .line 255
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    invoke-interface {v6, v7, v11}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :catchall_0
    move-exception v0

    .line 267
    move-object v7, v10

    .line 268
    goto/16 :goto_12

    .line 269
    .line 270
    :cond_7
    sget-object v6, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 271
    .line 272
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    sget-object v15, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 277
    .line 278
    invoke-virtual {v15}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    invoke-virtual {v15, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 283
    .line 284
    .line 285
    move-result v15

    .line 286
    if-gtz v15, :cond_8

    .line 287
    .line 288
    new-instance v15, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-interface {v7, v6, v11}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_8
    :goto_3
    const/4 v6, 0x0

    .line 311
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-static {v0, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 316
    .line 317
    .line 318
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 319
    goto :goto_5

    .line 320
    :cond_9
    :try_start_2
    invoke-static {v10, v9, v10}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 321
    .line 322
    .line 323
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 324
    if-eqz v0, :cond_a

    .line 325
    .line 326
    :try_start_3
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-interface {v6, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_a
    :try_start_4
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-interface {v6, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :goto_4
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-static {v0, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 346
    .line 347
    .line 348
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 349
    :goto_5
    invoke-interface {v5, v10}, LPf/a;->e(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    check-cast v5, LGf/x;

    .line 357
    .line 358
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_c

    .line 369
    .line 370
    iput-object v10, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v10, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v10, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v10, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 377
    .line 378
    iput v8, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 379
    .line 380
    invoke-interface {v5, v3}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    if-ne v0, v4, :cond_b

    .line 385
    .line 386
    goto/16 :goto_f

    .line 387
    .line 388
    :cond_b
    return-object v0

    .line 389
    :cond_c
    :try_start_5
    new-instance v0, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 392
    .line 393
    .line 394
    new-instance v6, Lkotlin/jvm/internal/L;

    .line 395
    .line 396
    invoke-direct {v6}, Lkotlin/jvm/internal/L;-><init>()V

    .line 397
    .line 398
    .line 399
    move-object v7, v10

    .line 400
    :goto_6
    iget v8, v6, Lkotlin/jvm/internal/L;->a:I
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 401
    .line 402
    const/16 v11, 0x32

    .line 403
    .line 404
    if-lt v8, v11, :cond_d

    .line 405
    .line 406
    :try_start_6
    sget-object v6, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 407
    .line 408
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    sget-object v8, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 413
    .line 414
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    invoke-virtual {v8, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-gtz v8, :cond_11

    .line 423
    .line 424
    new-instance v8, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    const-string v8, "Reached maximum pagination limit for AIDL purchase history (50 pages). Will stop querying further pages."

    .line 444
    .line 445
    invoke-interface {v7, v6, v8}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 446
    .line 447
    .line 448
    goto/16 :goto_8

    .line 449
    .line 450
    :catchall_1
    move-exception v0

    .line 451
    goto/16 :goto_c

    .line 452
    .line 453
    :catch_0
    move-exception v0

    .line 454
    move v6, v9

    .line 455
    move-object v7, v10

    .line 456
    goto/16 :goto_d

    .line 457
    .line 458
    :cond_d
    :try_start_7
    invoke-static {v13, v12, v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$queryPurchaseHistory(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    invoke-virtual {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;->isSuccess()Z

    .line 463
    .line 464
    .line 465
    move-result v8
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 466
    if-nez v8, :cond_e

    .line 467
    .line 468
    :try_start_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    const-string v8, "[Purchases] - ERROR"

    .line 473
    .line 474
    new-instance v11, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 477
    .line 478
    .line 479
    const-string v14, "Error querying purchase history through AIDL: "

    .line 480
    .line 481
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;->getResponseCodeString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    invoke-interface {v6, v8, v7, v10}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 496
    .line 497
    .line 498
    goto/16 :goto_8

    .line 499
    .line 500
    :cond_e
    :try_start_9
    invoke-virtual {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;->getRecords()Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v8

    .line 504
    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 505
    .line 506
    .line 507
    invoke-virtual {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;->getContinuationToken()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    iget v11, v6, Lkotlin/jvm/internal/L;->a:I

    .line 512
    .line 513
    add-int/2addr v11, v9

    .line 514
    iput v11, v6, Lkotlin/jvm/internal/L;->a:I

    .line 515
    .line 516
    sget-object v11, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 517
    .line 518
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 519
    .line 520
    .line 521
    move-result-object v15

    .line 522
    sget-object v16, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 523
    .line 524
    invoke-virtual/range {v16 .. v16}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 525
    .line 526
    .line 527
    move-result-object v9

    .line 528
    invoke-virtual {v9, v11}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 529
    .line 530
    .line 531
    move-result v9

    .line 532
    if-gtz v9, :cond_f

    .line 533
    .line 534
    new-instance v9, Ljava/lang/StringBuilder;

    .line 535
    .line 536
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v11

    .line 546
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    new-instance v11, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 556
    .line 557
    .line 558
    const-string v10, "Retrieved "

    .line 559
    .line 560
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v7}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;->getRecords()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    const-string v7, " records from AIDL queryPurchaseHistory (page "

    .line 575
    .line 576
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    iget v7, v6, Lkotlin/jvm/internal/L;->a:I

    .line 580
    .line 581
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const/16 v7, 0x29

    .line 585
    .line 586
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    invoke-interface {v15, v9, v7}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    goto :goto_7

    .line 597
    :catch_1
    move-exception v0

    .line 598
    const/4 v6, 0x1

    .line 599
    const/4 v7, 0x0

    .line 600
    goto/16 :goto_d

    .line 601
    .line 602
    :cond_f
    :goto_7
    if-eqz v8, :cond_11

    .line 603
    .line 604
    invoke-interface {v3}, LZd/e;->getContext()LZd/i;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    invoke-static {v7}, LGf/F0;->n(LZd/i;)Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    if-nez v7, :cond_10

    .line 613
    .line 614
    goto :goto_8

    .line 615
    :cond_10
    move-object v7, v8

    .line 616
    const/4 v9, 0x1

    .line 617
    const/4 v10, 0x0

    .line 618
    goto/16 :goto_6

    .line 619
    .line 620
    :cond_11
    :goto_8
    const-string v6, "subs"

    .line 621
    .line 622
    invoke-static {v12, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    move-result v6

    .line 626
    if-eqz v6, :cond_12

    .line 627
    .line 628
    sget-object v6, Lcom/revenuecat/purchases/ProductType;->SUBS:Lcom/revenuecat/purchases/ProductType;

    .line 629
    .line 630
    goto :goto_9

    .line 631
    :cond_12
    sget-object v6, Lcom/revenuecat/purchases/ProductType;->INAPP:Lcom/revenuecat/purchases/ProductType;

    .line 632
    .line 633
    :goto_9
    new-instance v7, Ljava/util/ArrayList;

    .line 634
    .line 635
    const/16 v8, 0xa

    .line 636
    .line 637
    invoke-static {v0, v8}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 638
    .line 639
    .line 640
    move-result v8

    .line 641
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 642
    .line 643
    .line 644
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    if-eqz v8, :cond_13

    .line 653
    .line 654
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    check-cast v8, Lcom/revenuecat/purchases/google/history/PurchaseHistoryRecord;

    .line 659
    .line 660
    invoke-virtual {v8, v6}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryRecord;->toStoreTransaction(Lcom/revenuecat/purchases/ProductType;)Lcom/revenuecat/purchases/models/StoreTransaction;

    .line 661
    .line 662
    .line 663
    move-result-object v8

    .line 664
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto :goto_a

    .line 668
    :cond_13
    invoke-interface {v5, v7}, LGf/x;->O(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 669
    .line 670
    .line 671
    if-eqz v2, :cond_15

    .line 672
    .line 673
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    iput-object v13, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 678
    .line 679
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 680
    .line 681
    iput-object v7, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 682
    .line 683
    iput-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 684
    .line 685
    const/4 v2, 0x3

    .line 686
    iput v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 687
    .line 688
    const/4 v2, 0x0

    .line 689
    invoke-interface {v0, v2, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v3

    .line 693
    if-ne v3, v4, :cond_14

    .line 694
    .line 695
    goto :goto_f

    .line 696
    :cond_14
    move-object v4, v7

    .line 697
    move-object v5, v12

    .line 698
    goto/16 :goto_1

    .line 699
    .line 700
    :goto_b
    :try_start_a
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 708
    .line 709
    invoke-interface {v3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v4

    .line 713
    :catchall_2
    move-exception v0

    .line 714
    invoke-interface {v3, v2}, LPf/a;->e(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    throw v0

    .line 718
    :cond_15
    return-object v7

    .line 719
    :goto_c
    :try_start_b
    invoke-interface {v5, v0}, LGf/x;->h(Ljava/lang/Throwable;)Z

    .line 720
    .line 721
    .line 722
    throw v0

    .line 723
    :catchall_3
    move-exception v0

    .line 724
    goto :goto_e

    .line 725
    :goto_d
    invoke-static {v5, v7, v6, v7}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 729
    :goto_e
    if-eqz v2, :cond_17

    .line 730
    .line 731
    invoke-static {v13}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getOperationsMutex$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)LPf/a;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    iput-object v13, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$0:Ljava/lang/Object;

    .line 736
    .line 737
    iput-object v12, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$1:Ljava/lang/Object;

    .line 738
    .line 739
    iput-object v0, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$2:Ljava/lang/Object;

    .line 740
    .line 741
    iput-object v2, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->L$3:Ljava/lang/Object;

    .line 742
    .line 743
    const/4 v5, 0x4

    .line 744
    iput v5, v3, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager$queryAllPurchaseHistory$1;->label:I

    .line 745
    .line 746
    const/4 v7, 0x0

    .line 747
    invoke-interface {v2, v7, v3}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    if-ne v3, v4, :cond_16

    .line 752
    .line 753
    :goto_f
    return-object v4

    .line 754
    :cond_16
    move-object v4, v0

    .line 755
    move-object v5, v12

    .line 756
    move-object v3, v13

    .line 757
    :goto_10
    :try_start_c
    invoke-static {v3}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;->access$getQueryDeferreds$p(Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;)Ljava/util/Map;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 765
    .line 766
    invoke-interface {v2, v7}, LPf/a;->e(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    move-object v0, v4

    .line 770
    goto :goto_11

    .line 771
    :catchall_4
    move-exception v0

    .line 772
    invoke-interface {v2, v7}, LPf/a;->e(Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    throw v0

    .line 776
    :cond_17
    :goto_11
    throw v0

    .line 777
    :catchall_5
    move-exception v0

    .line 778
    const/4 v7, 0x0

    .line 779
    :goto_12
    invoke-interface {v5, v7}, LPf/a;->e(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    throw v0
.end method
