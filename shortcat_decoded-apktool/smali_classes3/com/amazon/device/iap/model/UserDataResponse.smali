.class public final Lcom/amazon/device/iap/model/UserDataResponse;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    }
.end annotation


# static fields
.field private static final REQUEST_ID:Ljava/lang/String; = "REQUEST_ID"

.field private static final REQUEST_STATUS:Ljava/lang/String; = "REQUEST_STATUS"

.field private static final TO_STRING_FORMAT:Ljava/lang/String; = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")"

.field private static final USER_DATA:Ljava/lang/String; = "USER_DATA"


# instance fields
.field private final requestId:Lcom/amazon/device/iap/model/RequestId;

.field private final requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field private final userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

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
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

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
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 2
    .line 3
    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3

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
    iget-object v2, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "REQUEST_STATUS"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

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
    iget-object v1, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 8
    .line 9
    const-string v3, "null"

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v3

    .line 19
    :goto_0
    iget-object v4, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/amazon/device/iap/model/UserData;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :cond_1
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")"

    .line 32
    .line 33
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
