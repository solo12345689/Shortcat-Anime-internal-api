.class Lcom/revenuecat/purchases/react/GoogleUpgradeInfo;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final oldProductIdentifier:Ljava/lang/String;

.field private final prorationMode:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/react/GoogleUpgradeInfo;->oldProductIdentifier:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/react/GoogleUpgradeInfo;->prorationMode:Ljava/lang/Integer;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getOldProductIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/GoogleUpgradeInfo;->oldProductIdentifier:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProrationMode()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/GoogleUpgradeInfo;->prorationMode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
