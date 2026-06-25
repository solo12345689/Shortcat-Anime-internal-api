.class public final enum Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EqualityOperator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0001\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;",
        "",
        "(Ljava/lang/String;I)V",
        "EQUALS",
        "NOT_EQUALS",
        "Companion",
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
.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;

.field public static final enum EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

.field public static final enum NOT_EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;
    .locals 2

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->NOT_EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 2
    .line 3
    const-string v1, "EQUALS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 12
    .line 13
    const-string v1, "NOT_EQUALS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->NOT_EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 20
    .line 21
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->$values()[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->$VALUES:[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 26
    .line 27
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->Companion:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;

    .line 34
    .line 35
    sget-object v0, LTd/q;->b:LTd/q;

    .line 36
    .line 37
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion$1;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion$1;

    .line 38
    .line 39
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 44
    .line 45
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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->$VALUES:[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 8
    .line 9
    return-object v0
.end method
