.class public final enum Lcom/revenuecat/purchases/react/ui/PaywallEventKey;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
        "",
        "key",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "PACKAGE",
        "REQUEST_ID",
        "CUSTOMER_INFO",
        "STORE_TRANSACTION",
        "ERROR",
        "MEASUREMENTS",
        "HEIGHT",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum CUSTOMER_INFO:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum HEIGHT:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum MEASUREMENTS:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum PACKAGE:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum REQUEST_ID:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

.field public static final enum STORE_TRANSACTION:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;
    .locals 7

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->PACKAGE:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->REQUEST_ID:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->CUSTOMER_INFO:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->STORE_TRANSACTION:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 8
    .line 9
    sget-object v4, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 10
    .line 11
    sget-object v5, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->MEASUREMENTS:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 12
    .line 13
    sget-object v6, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->HEIGHT:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

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
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "packageBeingPurchased"

    .line 5
    .line 6
    const-string v3, "PACKAGE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->PACKAGE:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 12
    .line 13
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "requestId"

    .line 17
    .line 18
    const-string v3, "REQUEST_ID"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->REQUEST_ID:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 24
    .line 25
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "customerInfo"

    .line 29
    .line 30
    const-string v3, "CUSTOMER_INFO"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->CUSTOMER_INFO:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 36
    .line 37
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "storeTransaction"

    .line 41
    .line 42
    const-string v3, "STORE_TRANSACTION"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->STORE_TRANSACTION:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 48
    .line 49
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "error"

    .line 53
    .line 54
    const-string v3, "ERROR"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "measurements"

    .line 65
    .line 66
    const-string v3, "MEASUREMENTS"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->MEASUREMENTS:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 72
    .line 73
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "height"

    .line 77
    .line 78
    const-string v3, "HEIGHT"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->HEIGHT:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 84
    .line 85
    invoke-static {}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->$values()[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->$VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 90
    .line 91
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 96
    .line 97
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
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->key:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/react/ui/PaywallEventKey;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->$VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
