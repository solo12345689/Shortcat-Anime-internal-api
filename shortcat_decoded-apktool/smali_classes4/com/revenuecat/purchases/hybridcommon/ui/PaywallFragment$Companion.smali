.class public final Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J[\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0018\u0008\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;",
        "",
        "()V",
        "notPresentedPaywallResult",
        "",
        "tag",
        "newInstance",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;",
        "requestKey",
        "requiredEntitlementIdentifier",
        "shouldDisplayDismissButton",
        "",
        "paywallSource",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;",
        "fontFamily",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;",
        "customVariables",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;",
        "OptionKey",
        "hybridcommon-ui_bc8Release"
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
    invoke-direct {p0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x4

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x10

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    move-object p5, v0

    .line 17
    :cond_2
    and-int/lit8 p7, p7, 0x20

    .line 18
    .line 19
    if-eqz p7, :cond_3

    .line 20
    .line 21
    move-object p6, v0

    .line 22
    :cond_3
    invoke-virtual/range {p0 .. p6}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;"
        }
    .end annotation

    .line 1
    const-string v0, "requestKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paywallSource"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUEST_KEY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->REQUIRED_ENTITLEMENT_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    sget-object p2, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->SHOULD_DISPLAY_DISMISS_BUTTON:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {v1, p2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    :cond_0
    instance-of p1, p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;

    .line 65
    .line 66
    invoke-virtual {p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;->getValue()Lcom/revenuecat/purchases/Offering;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Offering;->getIdentifier()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;->getPresentedOfferingContext$hybridcommon_ui_bc8Release()Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    sget-object p2, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->PRESENTED_OFFERING_CONTEXT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    instance-of p1, p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifier;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifier;

    .line 104
    .line 105
    invoke-virtual {p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifier;->getValue()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    instance-of p1, p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;

    .line 114
    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->OFFERING_IDENTIFIER:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p4, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;

    .line 124
    .line 125
    invoke-virtual {p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;->getOfferingIdentifier()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->PRESENTED_OFFERING_CONTEXT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;->getPresentedOfferingContext()Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    :goto_0
    if-eqz p5, :cond_4

    .line 146
    .line 147
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->FONT_FAMILY:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {v1, p1, p5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    if-eqz p6, :cond_5

    .line 157
    .line 158
    sget-object p1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->CUSTOM_VARIABLES:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;->getKey()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance p2, Ljava/util/HashMap;

    .line 165
    .line 166
    invoke-direct {p2, p6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    .line 173
    .line 174
    .line 175
    return-object v0
.end method
