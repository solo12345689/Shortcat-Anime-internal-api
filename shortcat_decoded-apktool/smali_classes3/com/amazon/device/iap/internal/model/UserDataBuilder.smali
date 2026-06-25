.class public Lcom/amazon/device/iap/internal/model/UserDataBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private lwaConsentStatus:Lcom/amazon/device/iap/model/LWAConsentStatus;

.field private marketplace:Ljava/lang/String;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .line 1
    new-instance v0, Lcom/amazon/device/iap/model/UserData;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/UserData;-><init>(Lcom/amazon/device/iap/internal/model/UserDataBuilder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getLWAConsentStatus()Lcom/amazon/device/iap/model/LWAConsentStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->lwaConsentStatus:Lcom/amazon/device/iap/model/LWAConsentStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMarketplace()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->marketplace:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setLWAConsentStatus(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/amazon/device/iap/model/LWAConsentStatus;->getEnumForValue(Ljava/lang/String;)Lcom/amazon/device/iap/model/LWAConsentStatus;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->lwaConsentStatus:Lcom/amazon/device/iap/model/LWAConsentStatus;

    .line 6
    .line 7
    return-object p0
.end method

.method public setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->marketplace:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
