.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\u000c\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "replaceVariables",
        "",
        "template",
        "replacements",
        "",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;",
        "getLocalizedDescription",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "localization",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "locale",
        "Ljava/util/Locale;",
        "getThreePhaseDescription",
        "getTwoPhaseDescription",
        "localizedTotalDuration",
        "Lcom/revenuecat/purchases/models/PricingPhase;",
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
.method public static final synthetic getLocalizedDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localization"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "locale"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->getThreePhaseDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->getTwoPhaseDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private static final getThreePhaseDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 10
    .line 11
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 21
    .line 22
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-static {v4, v3, p2, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PriceExtensionsKt;->localizedPerPeriod(Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getOfferPaymentMode()Lcom/revenuecat/purchases/models/OfferPaymentMode;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sget-object v6, Lcom/revenuecat/purchases/models/OfferPaymentMode;->FREE_TRIAL:Lcom/revenuecat/purchases/models/OfferPaymentMode;

    .line 50
    .line 51
    if-eq v4, v6, :cond_0

    .line 52
    .line 53
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->getTwoPhaseDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_0
    invoke-static {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->localizedTotalDuration(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->localizedTotalDuration(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingCycleCount()Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :cond_1
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v4, v6, p2, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PriceExtensionsKt;->localizedPerPeriod(Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    sget-object v4, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->SUB_OFFER_DURATION:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 89
    .line 90
    invoke-static {v4, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->SUB_OFFER_DURATION_2:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 95
    .line 96
    invoke-static {p0, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->SUB_OFFER_PRICE_2:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {p0, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 115
    .line 116
    invoke-static {p0, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 121
    .line 122
    invoke-static {p0, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->DISCOUNTED_RECURRING_PAYMENT_CYCLES:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 127
    .line 128
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p0, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    filled-new-array/range {v5 .. v10}, [Lkotlin/Pair;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhase;->getOfferPaymentMode()Lcom/revenuecat/purchases/models/OfferPaymentMode;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-nez p2, :cond_2

    .line 149
    .line 150
    const/4 p2, -0x1

    .line 151
    goto :goto_0

    .line 152
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    aget p2, v0, p2

    .line 159
    .line 160
    :goto_0
    const/4 v0, 0x2

    .line 161
    if-eq p2, v0, :cond_4

    .line 162
    .line 163
    const/4 v0, 0x3

    .line 164
    if-eq p2, v0, :cond_3

    .line 165
    .line 166
    return-object v3

    .line 167
    :cond_3
    sget-object p2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :cond_4
    sget-object p2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0
.end method

.method private static final getTwoPhaseDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 10
    .line 11
    invoke-static {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->localizedTotalDuration(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getPricingPhases()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {v2, p0, p2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PriceExtensionsKt;->localizedPerPeriod(Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingCycleCount()Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v4, 0x1

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v4

    .line 51
    :goto_0
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v5, v6, p2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PriceExtensionsKt;->localizedPerPeriod(Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->SUB_OFFER_DURATION:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 64
    .line 65
    invoke-static {v3, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->SUB_OFFER_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v5, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 84
    .line 85
    invoke-static {v5, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    sget-object v6, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 90
    .line 91
    invoke-static {v6, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    sget-object v6, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;->DISCOUNTED_RECURRING_PAYMENT_CYCLES:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;

    .line 96
    .line 97
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v6, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    filled-new-array {v1, v3, v5, p2, v2}, [Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/PricingPhase;->getOfferPaymentMode()Lcom/revenuecat/purchases/models/OfferPaymentMode;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_1

    .line 118
    .line 119
    const/4 v0, -0x1

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    aget v0, v1, v0

    .line 128
    .line 129
    :goto_1
    if-eq v0, v4, :cond_4

    .line 130
    .line 131
    const/4 v1, 0x2

    .line 132
    if-eq v0, v1, :cond_3

    .line 133
    .line 134
    const/4 v1, 0x3

    .line 135
    if-eq v0, v1, :cond_2

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_2
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_3
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->SINGLE_PAYMENT_THEN_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 150
    .line 151
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_4
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->FREE_TRIAL_THEN_PRICE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0
.end method

.method private static final localizedTotalDuration(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingCycleCount()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    :goto_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    mul-int/2addr v0, v1

    .line 22
    sget-object v1, Landroid/icu/text/MeasureFormat$FormatWidth;->WIDE:Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 23
    .line 24
    invoke-static {p1, v1}, Landroid/icu/text/MeasureFormat;->getInstance(Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Landroid/icu/text/MeasureFormat;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Landroid/icu/util/Measure;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->getMeasureUnit(Lcom/revenuecat/purchases/models/Period$Unit;)Landroid/icu/util/MeasureUnit;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v1, v0, p0}, Landroid/icu/util/Measure;-><init>(Ljava/lang/Number;Landroid/icu/util/MeasureUnit;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "getInstance(locale, Meas\u2026.unit.measureUnit),\n    )"

    .line 54
    .line 55
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method private static final replaceVariables(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, LDf/p;

    .line 2
    .line 3
    const-string v1, "\\{\\{\\s*([^}]+)\\s*\\}\\}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt$replaceVariables$1;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt$replaceVariables$1;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, v1}, LDf/p;->j(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
