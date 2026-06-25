.class public final enum Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/APIKeyValidator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ValidationResult"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;",
        "",
        "(Ljava/lang/String;I)V",
        "VALID",
        "GOOGLE_KEY_AMAZON_STORE",
        "GOOGLE_KEY_GALAXY_STORE",
        "AMAZON_KEY_GOOGLE_STORE",
        "AMAZON_KEY_GALAXY_STORE",
        "GALAXY_KEY_GOOGLE_STORE",
        "GALAXY_KEY_AMAZON_STORE",
        "LEGACY",
        "SIMULATED_STORE",
        "OTHER_PLATFORM",
        "purchases_defaultsBc8Release"
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
.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum AMAZON_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum AMAZON_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum GALAXY_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum GALAXY_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum GOOGLE_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum GOOGLE_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum LEGACY:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum OTHER_PLATFORM:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum SIMULATED_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

.field public static final enum VALID:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;
    .locals 10

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->VALID:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GOOGLE_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GOOGLE_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->AMAZON_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 8
    .line 9
    sget-object v4, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->AMAZON_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 10
    .line 11
    sget-object v5, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GALAXY_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 12
    .line 13
    sget-object v6, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GALAXY_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 14
    .line 15
    sget-object v7, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->LEGACY:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 16
    .line 17
    sget-object v8, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->SIMULATED_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 18
    .line 19
    sget-object v9, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->OTHER_PLATFORM:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 2
    .line 3
    const-string v1, "VALID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->VALID:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 12
    .line 13
    const-string v1, "GOOGLE_KEY_AMAZON_STORE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GOOGLE_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 20
    .line 21
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 22
    .line 23
    const-string v1, "GOOGLE_KEY_GALAXY_STORE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GOOGLE_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 30
    .line 31
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 32
    .line 33
    const-string v1, "AMAZON_KEY_GOOGLE_STORE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->AMAZON_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 40
    .line 41
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 42
    .line 43
    const-string v1, "AMAZON_KEY_GALAXY_STORE"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->AMAZON_KEY_GALAXY_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 50
    .line 51
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 52
    .line 53
    const-string v1, "GALAXY_KEY_GOOGLE_STORE"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GALAXY_KEY_GOOGLE_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 62
    .line 63
    const-string v1, "GALAXY_KEY_AMAZON_STORE"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->GALAXY_KEY_AMAZON_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 70
    .line 71
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 72
    .line 73
    const-string v1, "LEGACY"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->LEGACY:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 80
    .line 81
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 82
    .line 83
    const-string v1, "SIMULATED_STORE"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->SIMULATED_STORE:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 91
    .line 92
    new-instance v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 93
    .line 94
    const-string v1, "OTHER_PLATFORM"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->OTHER_PLATFORM:Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 102
    .line 103
    invoke-static {}, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->$values()[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->$VALUES:[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 108
    .line 109
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;->$VALUES:[Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 8
    .line 9
    return-object v0
.end method
