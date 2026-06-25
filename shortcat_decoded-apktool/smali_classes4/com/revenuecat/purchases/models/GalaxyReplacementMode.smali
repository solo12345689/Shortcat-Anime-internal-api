.class public final enum Lcom/revenuecat/purchases/models/GalaxyReplacementMode;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ReplacementMode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;",
        ">;",
        "Lcom/revenuecat/purchases/ReplacementMode;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0087\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;",
        "",
        "Lcom/revenuecat/purchases/ReplacementMode;",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "LTd/L;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Companion",
        "INSTANT_PRORATED_DATE",
        "INSTANT_PRORATED_CHARGE",
        "INSTANT_NO_PRORATION",
        "DEFERRED",
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
.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;

.field public static final enum DEFERRED:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

.field public static final enum INSTANT_NO_PRORATION:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

.field public static final enum INSTANT_PRORATED_CHARGE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

.field public static final enum INSTANT_PRORATED_DATE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

.field private static final default:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;
    .locals 4

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_PRORATED_DATE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_PRORATED_CHARGE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_NO_PRORATION:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->DEFERRED:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 2
    .line 3
    const-string v1, "INSTANT_PRORATED_DATE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_PRORATED_DATE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 12
    .line 13
    const-string v1, "INSTANT_PRORATED_CHARGE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_PRORATED_CHARGE:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 20
    .line 21
    new-instance v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 22
    .line 23
    const-string v1, "INSTANT_NO_PRORATION"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->INSTANT_NO_PRORATION:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 30
    .line 31
    new-instance v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 32
    .line 33
    const-string v2, "DEFERRED"

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v1, v2, v3}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->DEFERRED:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 40
    .line 41
    invoke-static {}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->$values()[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sput-object v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->$VALUES:[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 46
    .line 47
    new-instance v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->Companion:Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;

    .line 54
    .line 55
    new-instance v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Creator;

    .line 56
    .line 57
    invoke-direct {v1}, Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Creator;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v1, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 61
    .line 62
    sput-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->default:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 63
    .line 64
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

.method public static final synthetic access$getDefault$cp()Lcom/revenuecat/purchases/models/GalaxyReplacementMode;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->default:Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/models/GalaxyReplacementMode;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/GalaxyReplacementMode;->$VALUES:[Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/models/GalaxyReplacementMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic getName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    const-string p2, "out"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
