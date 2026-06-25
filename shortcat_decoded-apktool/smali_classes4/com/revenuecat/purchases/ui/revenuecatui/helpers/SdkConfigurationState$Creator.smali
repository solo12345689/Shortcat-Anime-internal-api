.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState$Creator;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;
    .locals 12

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    move v0, v5

    move v5, v6

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/revenuecat/purchases/Store;->valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/Store;

    move-result-object v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    move-object v6, v7

    move v7, v8

    goto :goto_1

    :cond_1
    move v8, v6

    move-object v6, v7

    move v7, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/revenuecat/purchases/EntitlementVerificationMode;->valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/EntitlementVerificationMode;

    move-result-object v9

    const-class v10, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;

    invoke-virtual {v10}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-virtual {p1, v10}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/DangerousSettings;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_2

    move-object v11, v10

    move v10, v8

    move-object v8, v9

    move-object v9, v11

    goto :goto_2

    :cond_2
    move-object v8, v9

    move-object v9, v10

    move v10, v0

    :goto_2
    invoke-direct/range {v1 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/Store;ZLcom/revenuecat/purchases/EntitlementVerificationMode;Lcom/revenuecat/purchases/DangerousSettings;Z)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState$Creator;->newArray(I)[Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;

    move-result-object p1

    return-object p1
.end method
