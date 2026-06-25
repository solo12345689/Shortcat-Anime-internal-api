.class public final enum Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OptionKey"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;",
        "",
        "key",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "REQUEST_KEY",
        "REQUIRED_ENTITLEMENT_IDENTIFIER",
        "SHOULD_DISPLAY_DISMISS_BUTTON",
        "OFFERING_IDENTIFIER",
        "PRESENTED_OFFERING_CONTEXT",
        "FONT_FAMILY",
        "CUSTOM_VARIABLES",
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


# static fields
.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum CUSTOM_VARIABLES:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum FONT_FAMILY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum PRESENTED_OFFERING_CONTEXT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum REQUEST_KEY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum REQUIRED_ENTITLEMENT_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

.field public static final enum SHOULD_DISPLAY_DISMISS_BUTTON:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;
    .locals 7

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUEST_KEY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUIRED_ENTITLEMENT_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->SHOULD_DISPLAY_DISMISS_BUTTON:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 8
    .line 9
    sget-object v4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->PRESENTED_OFFERING_CONTEXT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 10
    .line 11
    sget-object v5, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->FONT_FAMILY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 12
    .line 13
    sget-object v6, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->CUSTOM_VARIABLES:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "requestKey"

    .line 5
    .line 6
    const-string v3, "REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUEST_KEY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 12
    .line 13
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "requiredEntitlementIdentifier"

    .line 17
    .line 18
    const-string v3, "REQUIRED_ENTITLEMENT_IDENTIFIER"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUIRED_ENTITLEMENT_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 24
    .line 25
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "shouldDisplayDismissButton"

    .line 29
    .line 30
    const-string v3, "SHOULD_DISPLAY_DISMISS_BUTTON"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->SHOULD_DISPLAY_DISMISS_BUTTON:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 36
    .line 37
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "offeringIdentifier"

    .line 41
    .line 42
    const-string v3, "OFFERING_IDENTIFIER"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 48
    .line 49
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "presentedOfferingContext"

    .line 53
    .line 54
    const-string v3, "PRESENTED_OFFERING_CONTEXT"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->PRESENTED_OFFERING_CONTEXT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "fontProvider"

    .line 65
    .line 66
    const-string v3, "FONT_FAMILY"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->FONT_FAMILY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 72
    .line 73
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "customVariables"

    .line 77
    .line 78
    const-string v3, "CUSTOM_VARIABLES"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->CUSTOM_VARIABLES:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 84
    .line 85
    invoke-static {}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->$values()[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->$VALUES:[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 90
    .line 91
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->key:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->$VALUES:[Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
