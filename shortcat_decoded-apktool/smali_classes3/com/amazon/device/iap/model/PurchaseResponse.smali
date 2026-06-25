.class public final Lcom/amazon/device/iap/model/PurchaseResponse;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    }
.end annotation


# static fields
.field private static final RECEIPT:Ljava/lang/String; = "receipt"

.field private static final REQUEST_ID:Ljava/lang/String; = "requestId"

.field private static final REQUEST_STATUS:Ljava/lang/String; = "requestStatus"

.field private static final TO_STRING_FORMAT:Ljava/lang/String; = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)"

.field private static final USER_DATA:Ljava/lang/String; = "userData"


# instance fields
.field private final receipt:Lcom/amazon/device/iap/model/Receipt;

.field private final requestId:Lcom/amazon/device/iap/model/RequestId;

.field private final requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field private final userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "requestId"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "requestStatus"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 27
    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getReceipt()Lcom/amazon/device/iap/model/Receipt;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "receipt"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "userData"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getReceipt()Lcom/amazon/device/iap/model/Receipt;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->receipt:Lcom/amazon/device/iap/model/Receipt;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public getReceipt()Lcom/amazon/device/iap/model/Receipt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->receipt:Lcom/amazon/device/iap/model/Receipt;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 2
    .line 3
    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "requestId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "requestStatus"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v2

    .line 32
    :goto_0
    const-string v3, "userData"

    .line 33
    .line 34
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->toJSON()Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_1
    const-string v1, "receipt"

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v2, "null"

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->receipt:Lcom/amazon/device/iap/model/Receipt;

    .line 21
    .line 22
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)"

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
