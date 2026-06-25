.class public Lcom/amazon/device/drm/model/LicenseResponse;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;
    }
.end annotation


# static fields
.field private static final REQUEST_ID:Ljava/lang/String; = "REQUEST_ID"

.field private static final REQUEST_STATUS:Ljava/lang/String; = "REQUEST_STATUS"

.field private static final TO_STRING_FORMAT:Ljava/lang/String; = "LicenseResponse: {requestId: \"%s\", requestStatus: \"%s\"}"


# instance fields
.field private final requestId:Lcom/amazon/device/drm/model/RequestId;

.field private final requestStatus:Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;


# direct methods
.method public constructor <init>(Lcom/amazon/device/drm/a/c/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/amazon/device/drm/a/c/a;->b()Lcom/amazon/device/drm/model/RequestId;

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
    invoke-virtual {p1}, Lcom/amazon/device/drm/a/c/a;->c()Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

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
    invoke-virtual {p1}, Lcom/amazon/device/drm/a/c/a;->b()Lcom/amazon/device/drm/model/RequestId;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestId:Lcom/amazon/device/drm/model/RequestId;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/amazon/device/drm/a/c/a;->c()Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestStatus:Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public getRequestId()Lcom/amazon/device/drm/model/RequestId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestId:Lcom/amazon/device/drm/model/RequestId;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestStatus:Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

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
    const-string v1, "REQUEST_STATUS"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestStatus:Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "REQUEST_ID"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestId:Lcom/amazon/device/drm/model/RequestId;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestId:Lcom/amazon/device/drm/model/RequestId;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/amazon/device/drm/model/LicenseResponse;->requestStatus:Lcom/amazon/device/drm/model/LicenseResponse$RequestStatus;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "null"

    .line 13
    .line 14
    :goto_0
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "LicenseResponse: {requestId: \"%s\", requestStatus: \"%s\"}"

    .line 19
    .line 20
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
