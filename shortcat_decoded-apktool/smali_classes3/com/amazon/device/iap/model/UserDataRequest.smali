.class public Lcom/amazon/device/iap/model/UserDataRequest;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/iap/model/UserDataRequest$Builder;
    }
.end annotation


# instance fields
.field private fetchLWAConsentStatus:Z


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/UserDataRequest$Builder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/amazon/device/iap/model/UserDataRequest$Builder;->access$000(Lcom/amazon/device/iap/model/UserDataRequest$Builder;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-boolean p1, p0, Lcom/amazon/device/iap/model/UserDataRequest;->fetchLWAConsentStatus:Z

    .line 9
    .line 10
    return-void
.end method

.method public static newBuilder()Lcom/amazon/device/iap/model/UserDataRequest$Builder;
    .locals 2

    .line 1
    new-instance v0, Lcom/amazon/device/iap/model/UserDataRequest$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/amazon/device/iap/model/UserDataRequest$Builder;-><init>(Lcom/amazon/device/iap/model/UserDataRequest$1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public getFetchLWAConsentStatus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/amazon/device/iap/model/UserDataRequest;->fetchLWAConsentStatus:Z

    .line 2
    .line 3
    return v0
.end method
