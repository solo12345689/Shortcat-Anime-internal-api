.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\t\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004\"\u001e\u0010\t\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\u0004\"\u0018\u0010\r\u001a\u00020\u000e*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u000e*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\u000e*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "periodUnitAbbreviatedLocalizationKey",
        "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
        "Lcom/revenuecat/purchases/models/Period;",
        "getPeriodUnitAbbreviatedLocalizationKey",
        "(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
        "periodUnitLocalizationKey",
        "getPeriodUnitLocalizationKey",
        "periodValueWithUnitAbbreviatedLocalizationKey",
        "getPeriodValueWithUnitAbbreviatedLocalizationKey",
        "periodValueWithUnitLocalizationKey",
        "getPeriodValueWithUnitLocalizationKey$annotations",
        "(Lcom/revenuecat/purchases/models/Period;)V",
        "getPeriodValueWithUnitLocalizationKey",
        "roundedValueInDays",
        "",
        "getRoundedValueInDays",
        "(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;",
        "roundedValueInMonths",
        "getRoundedValueInMonths",
        "roundedValueInWeeks",
        "getRoundedValueInWeeks",
        "roundedValueInYears",
        "getRoundedValueInYears",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getPeriodUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v0, p0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_0
    new-instance p0, LTd/r;

    .line 36
    .line 37
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_1
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->YEAR_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->MONTH_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->WEEK_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->DAY_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final getPeriodUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v0, p0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_0
    new-instance p0, LTd/r;

    .line 36
    .line 37
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_1
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->YEAR:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->MONTH:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->WEEK:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->DAY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final getPeriodValueWithUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v0, p0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_0
    new-instance p0, LTd/r;

    .line 36
    .line 37
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_1
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEARS_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTHS_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEKS_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAYS_SHORT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final getPeriodValueWithUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_ZERO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 34
    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_ZERO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 51
    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_ZERO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 68
    .line 69
    if-ne v0, v1, :cond_3

    .line 70
    .line 71
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_ZERO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/4 v1, 0x1

    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 86
    .line 87
    if-ne v0, v2, :cond_4

    .line 88
    .line 89
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_ONE:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-ne v0, v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 103
    .line 104
    if-ne v0, v2, :cond_5

    .line 105
    .line 106
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_ONE:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-ne v0, v1, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 120
    .line 121
    if-ne v0, v2, :cond_6

    .line 122
    .line 123
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_ONE:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ne v0, v1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 137
    .line 138
    if-ne v0, v1, :cond_7

    .line 139
    .line 140
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_ONE:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_7
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v1, 0x2

    .line 148
    if-ne v0, v1, :cond_8

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 155
    .line 156
    if-ne v0, v2, :cond_8

    .line 157
    .line 158
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_TWO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_8
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-ne v0, v1, :cond_9

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 172
    .line 173
    if-ne v0, v2, :cond_9

    .line 174
    .line 175
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_TWO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-ne v0, v1, :cond_a

    .line 183
    .line 184
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sget-object v2, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 189
    .line 190
    if-ne v0, v2, :cond_a

    .line 191
    .line 192
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_TWO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_a
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-ne v0, v1, :cond_b

    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 206
    .line 207
    if-ne v0, v1, :cond_b

    .line 208
    .line 209
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_TWO:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 210
    .line 211
    return-object p0

    .line 212
    :cond_b
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    const/4 v1, 0x3

    .line 217
    const/4 v2, 0x5

    .line 218
    if-gt v1, v0, :cond_c

    .line 219
    .line 220
    if-ge v0, v2, :cond_c

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 227
    .line 228
    if-ne v0, v3, :cond_c

    .line 229
    .line 230
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_FEW:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 231
    .line 232
    return-object p0

    .line 233
    :cond_c
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-gt v1, v0, :cond_d

    .line 238
    .line 239
    if-ge v0, v2, :cond_d

    .line 240
    .line 241
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 246
    .line 247
    if-ne v0, v3, :cond_d

    .line 248
    .line 249
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_FEW:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 250
    .line 251
    return-object p0

    .line 252
    :cond_d
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-gt v1, v0, :cond_e

    .line 257
    .line 258
    if-ge v0, v2, :cond_e

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 265
    .line 266
    if-ne v0, v3, :cond_e

    .line 267
    .line 268
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_FEW:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 269
    .line 270
    return-object p0

    .line 271
    :cond_e
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-gt v1, v0, :cond_f

    .line 276
    .line 277
    if-ge v0, v2, :cond_f

    .line 278
    .line 279
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 284
    .line 285
    if-ne v0, v1, :cond_f

    .line 286
    .line 287
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_FEW:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_f
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    const/16 v1, 0xb

    .line 295
    .line 296
    if-gt v2, v0, :cond_10

    .line 297
    .line 298
    if-ge v0, v1, :cond_10

    .line 299
    .line 300
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 305
    .line 306
    if-ne v0, v3, :cond_10

    .line 307
    .line 308
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_MANY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 309
    .line 310
    return-object p0

    .line 311
    :cond_10
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-gt v2, v0, :cond_11

    .line 316
    .line 317
    if-ge v0, v1, :cond_11

    .line 318
    .line 319
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 324
    .line 325
    if-ne v0, v3, :cond_11

    .line 326
    .line 327
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_MANY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 328
    .line 329
    return-object p0

    .line 330
    :cond_11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-gt v2, v0, :cond_12

    .line 335
    .line 336
    if-ge v0, v1, :cond_12

    .line 337
    .line 338
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    sget-object v3, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 343
    .line 344
    if-ne v0, v3, :cond_12

    .line 345
    .line 346
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_MANY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 347
    .line 348
    return-object p0

    .line 349
    :cond_12
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-gt v2, v0, :cond_13

    .line 354
    .line 355
    if-ge v0, v1, :cond_13

    .line 356
    .line 357
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 362
    .line 363
    if-ne v0, v1, :cond_13

    .line 364
    .line 365
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_MANY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 366
    .line 367
    return-object p0

    .line 368
    :cond_13
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 373
    .line 374
    if-ne v0, v1, :cond_14

    .line 375
    .line 376
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_OTHER:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 377
    .line 378
    return-object p0

    .line 379
    :cond_14
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 384
    .line 385
    if-ne v0, v1, :cond_15

    .line 386
    .line 387
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_WEEK_OTHER:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 388
    .line 389
    return-object p0

    .line 390
    :cond_15
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 395
    .line 396
    if-ne v0, v1, :cond_16

    .line 397
    .line 398
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_MONTH_OTHER:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 399
    .line 400
    return-object p0

    .line 401
    :cond_16
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 406
    .line 407
    if-ne p0, v0, :cond_17

    .line 408
    .line 409
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_YEAR_OTHER:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 410
    .line 411
    return-object p0

    .line 412
    :cond_17
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->NUM_DAY_OTHER:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 413
    .line 414
    return-object p0
.end method

.method public static synthetic getPeriodValueWithUnitLocalizationKey$annotations(Lcom/revenuecat/purchases/models/Period;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getRoundedValueInDays(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValueInDays()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lke/a;->c(D)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final getRoundedValueInMonths(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValueInMonths()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lke/a;->c(D)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final getRoundedValueInWeeks(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValueInWeeks()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lke/a;->c(D)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final getRoundedValueInYears(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValueInYears()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lke/a;->c(D)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
