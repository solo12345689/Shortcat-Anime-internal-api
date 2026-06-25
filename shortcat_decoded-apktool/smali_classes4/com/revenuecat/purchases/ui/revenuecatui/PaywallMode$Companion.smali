.class public final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;",
        "",
        "()V",
        "default",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "getDefault",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "footerMode",
        "condensed",
        "",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final footerMode(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->FOOTER_CONDENSED:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->FOOTER:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 7
    .line 8
    return-object p1
.end method

.method public final getDefault()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;
    .locals 1

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->access$getDefault$cp()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
