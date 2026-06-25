.class public final Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000cR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "requestId",
        "resultString",
        "errorMessage",
        "LTd/L;",
        "resolveResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "EVENT_KEY_PACKAGE_BEING_PURCHASED",
        "Ljava/lang/String;",
        "EVENT_KEY_REQUEST_ID",
        "RESULT_CANCELLATION",
        "RESULT_ERROR",
        "RESULT_SUCCESS",
        "TAG",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;",
        "pendingRequests",
        "Ljava/util/concurrent/ConcurrentHashMap;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;-><init>()V

    return-void
.end method

.method public static synthetic resolveResult$default(Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;->resolveResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final resolveResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resultString"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->access$getPendingRequests$cp()Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string p3, "No pending callback for requestId \'"

    .line 29
    .line 30
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, "\'. It may have already been resolved."

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "HybridPurchaseLogicBridge"

    .line 46
    .line 47
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const v1, -0x447f341d

    .line 56
    .line 57
    .line 58
    if-eq p1, v1, :cond_6

    .line 59
    .line 60
    const v1, 0x3f2d9e8

    .line 61
    .line 62
    .line 63
    if-eq p1, v1, :cond_3

    .line 64
    .line 65
    const v1, 0x474f7103

    .line 66
    .line 67
    .line 68
    if-eq p1, v1, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const-string p1, "CANCELLATION"

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Cancellation;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Cancellation;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const-string p1, "ERROR"

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;

    .line 93
    .line 94
    new-instance p2, Lcom/revenuecat/purchases/PurchasesError;

    .line 95
    .line 96
    sget-object v1, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 97
    .line 98
    if-nez p3, :cond_5

    .line 99
    .line 100
    const-string p3, "Operation failed"

    .line 101
    .line 102
    :cond_5
    invoke-direct {p2, v1, p3}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    const-string p1, "SUCCESS"

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_8

    .line 116
    .line 117
    :goto_0
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;

    .line 118
    .line 119
    new-instance v1, Lcom/revenuecat/purchases/PurchasesError;

    .line 120
    .line 121
    sget-object v2, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 122
    .line 123
    if-nez p3, :cond_7

    .line 124
    .line 125
    new-instance p3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v3, "Unknown result: "

    .line 131
    .line 132
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    :cond_7
    invoke-direct {v1, v2, p3}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_8
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Success;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult$Success;

    .line 150
    .line 151
    :goto_1
    invoke-virtual {v0}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->getDeferred()LGf/x;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-interface {p2, p1}, LGf/x;->O(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    return-void
.end method
