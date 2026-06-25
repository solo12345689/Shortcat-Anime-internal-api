.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "purchaseInformation",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "LTd/L;",
        "PurchaseStatusBadge",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;",
        "status",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;",
        "getBadgeInfo",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;",
        "determinePurchaseStatus",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;",
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
.method public static final PurchaseStatusBadge(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "purchaseInformation"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "localization"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, 0xf4db0e2

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v14

    .line 26
    and-int/lit8 v4, v2, 0x6

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    invoke-interface {v14, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v2

    .line 42
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    invoke-interface {v14, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v5, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v4, v5

    .line 58
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 59
    .line 60
    const/16 v6, 0x12

    .line 61
    .line 62
    if-ne v5, v6, :cond_5

    .line 63
    .line 64
    invoke-interface {v14}, LY/m;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-interface {v14}, LY/m;->K()V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_6

    .line 80
    .line 81
    const/4 v5, -0x1

    .line 82
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge (PurchaseStatusBadge.kt:21)"

    .line 83
    .line 84
    invoke-static {v3, v4, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_6
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;->determinePurchaseStatus(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    and-int/lit8 v4, v4, 0x70

    .line 92
    .line 93
    invoke-static {v3, v1, v14, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt;->getBadgeInfo(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getText()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getColor-QN2ZGVo()Ls0/r0;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-nez v4, :cond_7

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_7
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getBADGE_CORNER_SIZE-D9Ej5fM()F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {v4}, LJ/i;->d(F)LJ/h;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getColor-QN2ZGVo()Ls0/r0;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v4}, Ls0/r0;->A()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;->getBorder()Lx/g;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;

    .line 133
    .line 134
    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;)V

    .line 135
    .line 136
    .line 137
    const/16 v3, 0x36

    .line 138
    .line 139
    const v8, 0x4037473d

    .line 140
    .line 141
    .line 142
    const/4 v9, 0x1

    .line 143
    invoke-static {v8, v9, v4, v14, v3}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    const/high16 v15, 0xc00000

    .line 148
    .line 149
    const/16 v16, 0x39

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    const-wide/16 v8, 0x0

    .line 153
    .line 154
    const/4 v10, 0x0

    .line 155
    const/4 v11, 0x0

    .line 156
    invoke-static/range {v4 .. v16}, LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, LY/w;->L()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_8

    .line 164
    .line 165
    invoke-static {}, LY/w;->T()V

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_4
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-eqz v3, :cond_b

    .line 173
    .line 174
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$3;

    .line 175
    .line 176
    invoke-direct {v4, v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v3, v4}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_9
    :goto_5
    invoke-static {}, LY/w;->L()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    invoke-static {}, LY/w;->T()V

    .line 190
    .line 191
    .line 192
    :cond_a
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    if-eqz v3, :cond_b

    .line 197
    .line 198
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$1;

    .line 199
    .line 200
    invoke-direct {v4, v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatusBadgeKt$PurchaseStatusBadge$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v3, v4}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    :cond_b
    return-void
.end method

.method private static final determinePurchaseStatus(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isExpired()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->EXPIRED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isCancelled()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isTrial()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->FREE_TRIAL_CANCELLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isCancelled()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Lcom/revenuecat/purchases/Store;->PROMOTIONAL:Lcom/revenuecat/purchases/Store;

    .line 36
    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->CANCELLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isTrial()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->FREE_TRIAL:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isLifetime()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->LIFETIME:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getExpirationOrRenewal()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->ACTIVE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_5
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->NONE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 70
    .line 71
    return-object p0
.end method

.method private static final getBadgeInfo(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;
    .locals 11

    .line 1
    const v0, 0x30159cd0

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.getBadgeInfo (PurchaseStatusBadge.kt:57)"

    .line 15
    .line 16
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->EXPIRED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 20
    .line 21
    if-ne p0, p3, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 24
    .line 25
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->EXPIRED:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const p0, 0x1a1d1b20

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ls0/s0;->b(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/16 v5, 0xc

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_1
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->FREE_TRIAL_CANCELLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 53
    .line 54
    const v0, 0x33f2545b

    .line 55
    .line 56
    .line 57
    if-ne p0, p3, :cond_2

    .line 58
    .line 59
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 60
    .line 61
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->BADGE_FREE_TRIAL_CANCELLED:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const/16 v6, 0xc

    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    move-object v0, v1

    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :cond_2
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->CANCELLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 87
    .line 88
    if-ne p0, p3, :cond_3

    .line 89
    .line 90
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 91
    .line 92
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->BADGE_CANCELLED:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/16 v6, 0xc

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->FREE_TRIAL:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 116
    .line 117
    if-ne p0, p3, :cond_4

    .line 118
    .line 119
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 120
    .line 121
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->BADGE_FREE_TRIAL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const p0, 0x5bf5ca5c

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, Ls0/s0;->b(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide p0

    .line 134
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const/16 v5, 0xc

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    const/4 v3, 0x0

    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->LIFETIME:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 148
    .line 149
    if-ne p0, p3, :cond_5

    .line 150
    .line 151
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 152
    .line 153
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->BADGE_LIFETIME:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 154
    .line 155
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object p0, Ls0/r0;->b:Ls0/r0$a;

    .line 160
    .line 161
    invoke-virtual {p0}, Ls0/r0$a;->i()J

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/4 p0, 0x1

    .line 170
    int-to-float p0, p0

    .line 171
    invoke-static {p0}, Li1/h;->n(F)F

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    sget-object p1, LU/D;->a:LU/D;

    .line 176
    .line 177
    sget p3, LU/D;->b:I

    .line 178
    .line 179
    invoke-virtual {p1, p2, p3}, LU/D;->a(LY/m;I)LU/l;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, LU/l;->w()J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    const/16 v9, 0xe

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    const v5, 0x3e947ae1    # 0.29f

    .line 191
    .line 192
    .line 193
    const/4 v6, 0x0

    .line 194
    const/4 v7, 0x0

    .line 195
    const/4 v8, 0x0

    .line 196
    invoke-static/range {v3 .. v10}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    invoke-static {p0, v3, v4}, Lx/h;->a(FJ)Lx/g;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const/16 v5, 0x8

    .line 205
    .line 206
    const/4 v6, 0x0

    .line 207
    const/4 v4, 0x0

    .line 208
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_5
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->ACTIVE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 213
    .line 214
    if-ne p0, p3, :cond_6

    .line 215
    .line 216
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 217
    .line 218
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->ACTIVE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 219
    .line 220
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-wide p0, 0x9911d483L

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-static {p0, p1}, Ls0/s0;->d(J)J

    .line 230
    .line 231
    .line 232
    move-result-wide p0

    .line 233
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const/16 v5, 0xc

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    const/4 v3, 0x0

    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_6
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;->NONE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;

    .line 247
    .line 248
    if-ne p0, p1, :cond_8

    .line 249
    .line 250
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;

    .line 251
    .line 252
    const/16 v5, 0xc

    .line 253
    .line 254
    const/4 v6, 0x0

    .line 255
    const/4 v1, 0x0

    .line 256
    const/4 v2, 0x0

    .line 257
    const/4 v3, 0x0

    .line 258
    const/4 v4, 0x0

    .line 259
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;-><init>(Ljava/lang/String;Ls0/r0;Lx/g;Ls0/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 260
    .line 261
    .line 262
    :goto_1
    invoke-static {}, LY/w;->L()Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-eqz p0, :cond_7

    .line 267
    .line 268
    invoke-static {}, LY/w;->T()V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-interface {p2}, LY/m;->O()V

    .line 272
    .line 273
    .line 274
    return-object v0

    .line 275
    :cond_8
    new-instance p0, LTd/r;

    .line 276
    .line 277
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 278
    .line 279
    .line 280
    throw p0
.end method
