.class public final Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error$Creator;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;
    .locals 2

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    const-class v1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/PurchasesError;

    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error$Creator;->newArray(I)[Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    move-result-object p1

    return-object p1
.end method
