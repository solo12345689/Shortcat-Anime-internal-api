.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt$WhenMappings;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->values()[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    :try_start_0
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    :catch_0
    const/4 v2, 0x2

    .line 18
    :try_start_1
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;->NOT_EQUALS:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 25
    .line 26
    :catch_1
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 27
    .line 28
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;->values()[Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    array-length v0, v0

    .line 33
    new-array v0, v0, [I

    .line 34
    .line 35
    :try_start_2
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;->IN:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 42
    .line 43
    :catch_2
    :try_start_3
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;->NOT_IN:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    aput v2, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 50
    .line 51
    :catch_3
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 52
    .line 53
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->values()[Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    array-length v0, v0

    .line 58
    new-array v0, v0, [I

    .line 59
    .line 60
    :try_start_4
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->COMPACT:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    aput v1, v0, v3
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 67
    .line 68
    :catch_4
    :try_start_5
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 75
    .line 76
    :catch_5
    :try_start_6
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->EXPANDED:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v2, 0x3

    .line 83
    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 84
    .line 85
    :catch_6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartialKt$WhenMappings;->$EnumSwitchMapping$2:[I

    .line 86
    .line 87
    return-void
.end method
