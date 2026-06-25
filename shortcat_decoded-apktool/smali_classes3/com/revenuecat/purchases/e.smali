.class public final synthetic Lcom/revenuecat/purchases/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ForceServerErrorStrategy;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final shouldForceServerError(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/ForceServerErrorStrategy$Companion;->c(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
