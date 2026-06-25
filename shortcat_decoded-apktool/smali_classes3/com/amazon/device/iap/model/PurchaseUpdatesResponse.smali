.class public final Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    }
.end annotation


# static fields
.field private static final HAS_MORE:Ljava/lang/String; = "HAS_MORE"

.field private static final RECEIPTS:Ljava/lang/String; = "RECEIPTS"

.field private static final REQUEST_ID:Ljava/lang/String; = "REQUEST_ID"

.field private static final REQUEST_STATUS:Ljava/lang/String; = "REQUEST_STATUS"

.field private static final TO_STRING_FORMAT:Ljava/lang/String; = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")"

.field private static final USER_DATA:Ljava/lang/String; = "USER_DATA"


# instance fields
.field private final hasMore:Z

.field private final receipts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/amazon/device/iap/model/Receipt;",
            ">;"
        }
    .end annotation
.end field

.field private final requestId:Lcom/amazon/device/iap/model/RequestId;

.field private final requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

.field private final userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

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
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

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
    sget-object v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "userData"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getReceipts()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "receipts"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/amazon/a/a/o/f;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getReceipts()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    new-instance v0, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->getReceipts()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_0
    iput-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->hasMore()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iput-boolean p1, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public getReceipts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amazon/device/iap/model/Receipt;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasMore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z

    .line 2
    .line 3
    return v0
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
    const-string v1, "REQUEST_ID"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "REQUEST_STATUS"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v1, ""

    .line 30
    .line 31
    :goto_0
    const-string v2, "USER_DATA"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    new-instance v1, Lorg/json/JSONArray;

    .line 37
    .line 38
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lcom/amazon/device/iap/model/Receipt;

    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/amazon/device/iap/model/Receipt;->toJSON()Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const-string v2, "RECEIPTS"

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    const-string v1, "HAS_MORE"

    .line 75
    .line 76
    iget-boolean v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v4, "null"

    .line 25
    .line 26
    :goto_0
    iget-boolean v5, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z

    .line 27
    .line 28
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")"

    .line 37
    .line 38
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
