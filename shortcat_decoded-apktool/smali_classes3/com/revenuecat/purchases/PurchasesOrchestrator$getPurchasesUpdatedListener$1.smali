.class public final Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/PurchasesOrchestrator;->getPurchasesUpdatedListener()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1",
        "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;",
        "",
        "Lcom/revenuecat/purchases/models/StoreTransaction;",
        "purchases",
        "LTd/L;",
        "onPurchasesUpdated",
        "(Ljava/util/List;)V",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "purchasesError",
        "onPurchasesFailedToUpdate",
        "(Lcom/revenuecat/purchases/PurchasesError;)V",
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


# instance fields
.field final synthetic this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPurchasesFailedToUpdate(Lcom/revenuecat/purchases/PurchasesError;)V
    .locals 3

    .line 1
    const-string v0, "purchasesError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getAndClearProductChangeCallback(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$dispatch(Lcom/revenuecat/purchases/PurchasesOrchestrator;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getAndClearAllPurchaseCallbacks(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lcom/revenuecat/purchases/interfaces/PurchaseCallback;

    .line 45
    .line 46
    invoke-static {v0, v2, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$dispatch(Lcom/revenuecat/purchases/PurchasesOrchestrator;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :goto_2
    monitor-exit v0

    .line 55
    throw p1
.end method

.method public onPurchasesUpdated(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/models/StoreTransaction;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "purchases"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    move v7, v0

    .line 19
    goto :goto_3

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    move-object p1, v0

    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/revenuecat/purchases/models/StoreTransaction;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/revenuecat/purchases/models/StoreTransaction;->getProductIds()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getState$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/PurchasesState;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Lcom/revenuecat/purchases/PurchasesState;->getPurchaseCallbacksByProductId()Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 85
    goto :goto_0

    .line 86
    :goto_3
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getState$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/PurchasesState;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesState;->getDeprecatedProductChangeCallback()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    invoke-static {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getAndClearProductChangeCallback(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getProductChangeCompletedCallbacks(Lcom/revenuecat/purchases/PurchasesOrchestrator;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    invoke-static {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getPurchaseCompletedCallbacks(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Landroid/util/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_4
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    monitor-exit v1

    .line 112
    iget-object v1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 113
    .line 114
    invoke-static {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$getPostTransactionWithProductDetailsHelper$p(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iget-object v1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAllowSharingPlayStoreAccount()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iget-object v1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAppUserID()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    sget-object v6, Lcom/revenuecat/purchases/PostReceiptInitiationSource;->PURCHASE:Lcom/revenuecat/purchases/PostReceiptInitiationSource;

    .line 131
    .line 132
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v8, v1

    .line 135
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v9, v0

    .line 140
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 141
    .line 142
    move-object v3, p1

    .line 143
    invoke-virtual/range {v2 .. v9}, Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;->postTransactions(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1;->this$0:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 147
    .line 148
    sget-object v0, Lcom/revenuecat/purchases/common/Delay;->NONE:Lcom/revenuecat/purchases/common/Delay;

    .line 149
    .line 150
    invoke-static {p1, v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->access$flushEvents(Lcom/revenuecat/purchases/PurchasesOrchestrator;Lcom/revenuecat/purchases/common/Delay;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_5
    monitor-exit v1

    .line 155
    throw p1
.end method
