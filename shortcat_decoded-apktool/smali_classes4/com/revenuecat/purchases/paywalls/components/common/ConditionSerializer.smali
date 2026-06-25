.class public final Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;
.super Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault<",
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;",
        "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;",
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;",
        "()V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 13

    .line 1
    const-string v0, "compact"

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$1;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$1;

    .line 4
    .line 5
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v0, "medium"

    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$2;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$2;

    .line 12
    .line 13
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v0, "expanded"

    .line 18
    .line 19
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$3;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$3;

    .line 20
    .line 21
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v0, "intro_offer"

    .line 26
    .line 27
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$4;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$4;

    .line 28
    .line 29
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v0, "intro_offer_condition"

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$5;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$5;

    .line 36
    .line 37
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-string v0, "multiple_intro_offers"

    .line 42
    .line 43
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$6;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$6;

    .line 44
    .line 45
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v0, "selected"

    .line 50
    .line 51
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$7;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$7;

    .line 52
    .line 53
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const-string v0, "promo_offer"

    .line 58
    .line 59
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$8;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$8;

    .line 60
    .line 61
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const-string v0, "promo_offer_condition"

    .line 66
    .line 67
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$9;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$9;

    .line 68
    .line 69
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    const-string v0, "selected_package_condition"

    .line 74
    .line 75
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$10;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$10;

    .line 76
    .line 77
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    const-string v0, "variable_condition"

    .line 82
    .line 83
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$11;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$11;

    .line 84
    .line 85
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    filled-new-array/range {v2 .. v12}, [Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$12;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer$12;

    .line 98
    .line 99
    const/16 v6, 0x8

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    const-string v2, "Condition"

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    move-object v1, p0

    .line 106
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;-><init>(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method
