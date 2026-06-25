.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;,
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;,
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002!\"B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ9\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J9\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ5\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;",
        "",
        "<init>",
        "()V",
        "",
        "string",
        "Lkotlin/Function1;",
        "executeAndReplaceWith",
        "handleVariablesAndReplace",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
        "variableDataProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
        "context",
        "variableNameString",
        "Lcom/revenuecat/purchases/Package;",
        "rcPackage",
        "Ljava/util/Locale;",
        "locale",
        "variableValue",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;",
        "variableName",
        "processVariable",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;",
        "originalString",
        "",
        "validateVariables",
        "(Ljava/lang/String;)Ljava/util/Set;",
        "processVariables",
        "LDf/p;",
        "REGEX",
        "LDf/p;",
        "PackageContext",
        "VariableName",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;

.field private static final REGEX:LDf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;

    .line 7
    .line 8
    new-instance v0, LDf/p;

    .line 9
    .line 10
    const-string v1, "\\{\\{\\s[a-zA-Z0-9_]+\\s\\}\\}"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->REGEX:LDf/p;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->$stable:I

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$variableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->variableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final handleVariablesAndReplace(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->REGEX:LDf/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    invoke-static {v0, p1, v2, v3, v1}, LDf/p;->e(LDf/p;Ljava/lang/CharSequence;IILjava/lang/Object;)LCf/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LCf/l;->T(LCf/i;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LUd/u;->K0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LDf/l;

    .line 33
    .line 34
    invoke-interface {v1}, LDf/l;->getValue()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sub-int/2addr v4, v3

    .line 43
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v4, "substring(...)"

    .line 48
    .line 49
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, LDf/r;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, LDf/l;->c()Loe/f;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p1, v1, v2}, LDf/r;->H0(Ljava/lang/CharSequence;Loe/f;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-object p1
.end method

.method private final processVariable(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, LTd/r;

    .line 13
    .line 14
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getDiscountRelativeToMostExpensivePerMonth()Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedRelativeDiscount(Ljava/lang/Double;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_1
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedSecondIntroductoryOfferPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_2
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedFirstIntroductoryOfferPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_3
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->secondIntroductoryOfferDuration(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_4
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->firstIntroductoryOfferDuration(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_5
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->subscriptionDurationInMonths(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_6
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->subscriptionDuration(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :pswitch_7
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerMonth(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_8
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerWeek(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :pswitch_9
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->periodNameAbbreviation(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_a
    invoke-virtual {p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->periodLength(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_b
    invoke-virtual {p2, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->periodName(Lcom/revenuecat/purchases/Package;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_c
    invoke-virtual {p2, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->productName(Lcom/revenuecat/purchases/Package;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :pswitch_d
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPriceAndPerMonthFull(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :pswitch_e
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPriceAndPerMonth(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :pswitch_f
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerPeriodFull(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :pswitch_10
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerPeriod(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_11
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {p2, p4, p5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    :pswitch_12
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->getApplicationName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final variableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName$Companion;->valueOfIdentifier(Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 10
    .line 11
    new-instance p2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string p4, "Unknown variable: "

    .line 17
    .line 18
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1

    .line 33
    :cond_0
    move-object v1, p0

    .line 34
    move-object v3, p1

    .line 35
    move-object v4, p2

    .line 36
    move-object v5, p4

    .line 37
    move-object v6, p5

    .line 38
    invoke-direct/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->processVariable(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string p4, "Could not process value for variable \'"

    .line 52
    .line 53
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p3, "\' for package \'"

    .line 60
    .line 61
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p3, "\'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string."

    .line 72
    .line 73
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string p1, ""

    .line 84
    .line 85
    :cond_1
    return-object p1
.end method


# virtual methods
.method public final processVariables(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "variableDataProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "originalString"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "rcPackage"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "locale"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, p4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->handleVariablesAndReplace(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final validateVariables(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "originalString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$validateVariables$1;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$validateVariables$1;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->handleVariablesAndReplace(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
