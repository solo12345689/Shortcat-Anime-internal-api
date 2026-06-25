.class abstract Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "PendingRequest"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;,
        Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001f\u0008\u0004\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;",
        "",
        "LGf/x;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;",
        "deferred",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
        "owner",
        "<init>",
        "(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V",
        "LGf/x;",
        "getDeferred",
        "()LGf/x;",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
        "getOwner",
        "()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
        "Purchase",
        "Restore",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;",
        "hybridcommon-ui_bc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final deferred:LGf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGf/x;"
        }
    .end annotation
.end field

.field private final owner:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;


# direct methods
.method private constructor <init>(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGf/x;",
            "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->deferred:LGf/x;

    .line 4
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->owner:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;

    return-void
.end method

.method public synthetic constructor <init>(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;-><init>(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V

    return-void
.end method


# virtual methods
.method public final getDeferred()LGf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGf/x;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->deferred:LGf/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOwner()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;->owner:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;

    .line 2
    .line 3
    return-object v0
.end method
