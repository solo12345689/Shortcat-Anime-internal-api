.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$Companion;",
        "",
        "()V",
        "from",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;",
        "error",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;
    .locals 2

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingPaywall;

    .line 7
    .line 8
    const-string v1, "unknown"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$NoPaywall;

    .line 13
    .line 14
    invoke-direct {p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$NoPaywall;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidTemplate;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidTemplate;

    .line 23
    .line 24
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidTemplate;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidTemplate;->getTemplateName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidTemplate;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidVariables;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidVariables;

    .line 39
    .line 40
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidVariables;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidVariables;->getUnrecognizedVariables()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidVariables;-><init>(Ljava/util/Set;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidIcons;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidIcons;

    .line 55
    .line 56
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidIcons;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidIcons;->getInvalidIcons()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$InvalidIcons;-><init>(Ljava/util/Set;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingTiers;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingTiers;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingTiers;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingTierConfigurations;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingTier;

    .line 78
    .line 79
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingTierConfigurations;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingTierConfigurations;->getTierIds()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-static {p1}, LUd/u;->n0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Ljava/lang/String;

    .line 92
    .line 93
    if-nez p1, :cond_5

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move-object v1, p1

    .line 97
    :goto_0
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingTier;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_6
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingStringLocalization;

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    move v0, v1

    .line 107
    goto :goto_1

    .line 108
    :cond_7
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingVideoLocalization;

    .line 109
    .line 110
    :goto_1
    if-eqz v0, :cond_8

    .line 111
    .line 112
    move v0, v1

    .line 113
    goto :goto_2

    .line 114
    :cond_8
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$AllVariableLocalizationsMissing;

    .line 115
    .line 116
    :goto_2
    if-eqz v0, :cond_9

    .line 117
    .line 118
    move v0, v1

    .line 119
    goto :goto_3

    .line 120
    :cond_9
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$AllLocalizationsMissing;

    .line 121
    .line 122
    :goto_3
    if-eqz v0, :cond_a

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_a
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingImageLocalization;

    .line 126
    .line 127
    :goto_4
    if-eqz v1, :cond_b

    .line 128
    .line 129
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingLocalization;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingLocalization;

    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_b
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$Other;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-nez p1, :cond_c

    .line 139
    .line 140
    const-string p1, "Unknown error"

    .line 141
    .line 142
    :cond_c
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$Other;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v0
.end method
