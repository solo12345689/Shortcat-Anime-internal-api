.class public final enum Lcom/revenuecat/purchases/react/ui/PaywallEventName;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventName;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/PaywallEventName;",
        "",
        "eventName",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getEventName",
        "()Ljava/lang/String;",
        "ON_PURCHASE_STARTED",
        "ON_PURCHASE_COMPLETED",
        "ON_PURCHASE_ERROR",
        "ON_PURCHASE_CANCELLED",
        "ON_RESTORE_STARTED",
        "ON_RESTORE_COMPLETED",
        "ON_RESTORE_ERROR",
        "ON_DISMISS",
        "ON_MEASURE",
        "ON_PURCHASE_PACKAGE_INITIATED",
        "ON_PERFORM_PURCHASE",
        "ON_PERFORM_RESTORE",
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

.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_DISMISS:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_MEASURE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PERFORM_PURCHASE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PERFORM_RESTORE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PURCHASE_CANCELLED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PURCHASE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PURCHASE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PURCHASE_PACKAGE_INITIATED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_PURCHASE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_RESTORE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_RESTORE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

.field public static final enum ON_RESTORE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;


# instance fields
.field private final eventName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/react/ui/PaywallEventName;
    .locals 12

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_CANCELLED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 8
    .line 9
    sget-object v4, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 10
    .line 11
    sget-object v5, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 12
    .line 13
    sget-object v6, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 14
    .line 15
    sget-object v7, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_DISMISS:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 16
    .line 17
    sget-object v8, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_MEASURE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 18
    .line 19
    sget-object v9, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_PACKAGE_INITIATED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 20
    .line 21
    sget-object v10, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PERFORM_PURCHASE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 22
    .line 23
    sget-object v11, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PERFORM_RESTORE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "onPurchaseStarted"

    .line 5
    .line 6
    const-string v3, "ON_PURCHASE_STARTED"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 12
    .line 13
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "onPurchaseCompleted"

    .line 17
    .line 18
    const-string v3, "ON_PURCHASE_COMPLETED"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 24
    .line 25
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "onPurchaseError"

    .line 29
    .line 30
    const-string v3, "ON_PURCHASE_ERROR"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 36
    .line 37
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "onPurchaseCancelled"

    .line 41
    .line 42
    const-string v3, "ON_PURCHASE_CANCELLED"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_CANCELLED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 48
    .line 49
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "onRestoreStarted"

    .line 53
    .line 54
    const-string v3, "ON_RESTORE_STARTED"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "onRestoreCompleted"

    .line 65
    .line 66
    const-string v3, "ON_RESTORE_COMPLETED"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_COMPLETED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 72
    .line 73
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "onRestoreError"

    .line 77
    .line 78
    const-string v3, "ON_RESTORE_ERROR"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_RESTORE_ERROR:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 84
    .line 85
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-string v2, "onDismiss"

    .line 89
    .line 90
    const-string v3, "ON_DISMISS"

    .line 91
    .line 92
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_DISMISS:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 96
    .line 97
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 98
    .line 99
    const/16 v1, 0x8

    .line 100
    .line 101
    const-string v2, "onMeasure"

    .line 102
    .line 103
    const-string v3, "ON_MEASURE"

    .line 104
    .line 105
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_MEASURE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 109
    .line 110
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 111
    .line 112
    const/16 v1, 0x9

    .line 113
    .line 114
    const-string v2, "onPurchasePackageInitiated"

    .line 115
    .line 116
    const-string v3, "ON_PURCHASE_PACKAGE_INITIATED"

    .line 117
    .line 118
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_PACKAGE_INITIATED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 122
    .line 123
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 124
    .line 125
    const/16 v1, 0xa

    .line 126
    .line 127
    const-string v2, "onPerformPurchase"

    .line 128
    .line 129
    const-string v3, "ON_PERFORM_PURCHASE"

    .line 130
    .line 131
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PERFORM_PURCHASE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 135
    .line 136
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 137
    .line 138
    const/16 v1, 0xb

    .line 139
    .line 140
    const-string v2, "onPerformRestore"

    .line 141
    .line 142
    const-string v3, "ON_PERFORM_RESTORE"

    .line 143
    .line 144
    invoke-direct {v0, v3, v1, v2}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PERFORM_RESTORE:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 148
    .line 149
    invoke-static {}, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->$values()[Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->$VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 154
    .line 155
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 160
    .line 161
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
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->eventName:Ljava/lang/String;

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
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/react/ui/PaywallEventName;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/react/ui/PaywallEventName;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->$VALUES:[Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->eventName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
