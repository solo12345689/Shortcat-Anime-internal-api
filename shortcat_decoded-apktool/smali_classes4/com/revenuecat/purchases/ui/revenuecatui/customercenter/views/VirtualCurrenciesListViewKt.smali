.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001aE\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
        "virtualCurrencies",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;",
        "appearance",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;",
        "LTd/L;",
        "onAction",
        "Landroidx/compose/ui/e;",
        "modifier",
        "VirtualCurrenciesListView",
        "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V",
        "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;",
        "virtualCurrency",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;",
        "position",
        "VirtualCurrencyRow",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;Landroidx/compose/ui/e;LY/m;II)V",
        "ShowAllVirtualCurrenciesRow",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V",
        "VirtualCurrenciesListView_4_VCs_Preview",
        "(LY/m;I)V",
        "VirtualCurrenciesListView_5_VCs_Preview",
        "",
        "MAX_NUMBER_OF_ROWS",
        "I",
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


# static fields
.field private static final MAX_NUMBER_OF_ROWS:I = 0x4


# direct methods
.method private static final ShowAllVirtualCurrenciesRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/e;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const v0, 0x3a424e6a

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p3

    .line 11
    .line 12
    invoke-interface {v3, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v15

    .line 16
    and-int/lit8 v3, p5, 0x1

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    or-int/lit8 v3, v4, 0x6

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v4, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v15, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v3, v5

    .line 37
    :goto_0
    or-int/2addr v3, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v3, v4

    .line 40
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 41
    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    or-int/lit8 v3, v3, 0x30

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    and-int/lit8 v6, v4, 0x30

    .line 48
    .line 49
    if-nez v6, :cond_5

    .line 50
    .line 51
    invoke-interface {v15, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    const/16 v6, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v6, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v3, v6

    .line 63
    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    .line 64
    .line 65
    if-eqz v6, :cond_7

    .line 66
    .line 67
    or-int/lit16 v3, v3, 0x180

    .line 68
    .line 69
    :cond_6
    move-object/from16 v7, p2

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_7
    and-int/lit16 v7, v4, 0x180

    .line 73
    .line 74
    if-nez v7, :cond_6

    .line 75
    .line 76
    move-object/from16 v7, p2

    .line 77
    .line 78
    invoke-interface {v15, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_8

    .line 83
    .line 84
    const/16 v8, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    const/16 v8, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v8

    .line 90
    :goto_5
    and-int/lit16 v8, v3, 0x93

    .line 91
    .line 92
    const/16 v9, 0x92

    .line 93
    .line 94
    if-ne v8, v9, :cond_a

    .line 95
    .line 96
    invoke-interface {v15}, LY/m;->i()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-nez v8, :cond_9

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_9
    invoke-interface {v15}, LY/m;->K()V

    .line 104
    .line 105
    .line 106
    move-object v3, v7

    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 110
    .line 111
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_b
    move-object v6, v7

    .line 115
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_c

    .line 120
    .line 121
    const/4 v7, -0x1

    .line 122
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ShowAllVirtualCurrenciesRow (VirtualCurrenciesListView.kt:185)"

    .line 123
    .line 124
    invoke-static {v0, v3, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_c
    const/4 v0, 0x0

    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v7, 0x1

    .line 130
    invoke-static {v6, v0, v7, v3}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 135
    .line 136
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-static {v8, v9, v3, v10}, LJ/i;->e(FFFF)LJ/h;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    sget-object v8, LU/D;->a:LU/D;

    .line 157
    .line 158
    sget v9, LU/D;->b:I

    .line 159
    .line 160
    invoke-virtual {v8, v15, v9}, LU/D;->a(LY/m;I)LU/l;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    int-to-float v5, v5

    .line 165
    invoke-static {v5}, Li1/h;->n(F)F

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-static {v10, v5}, LU/m;->k(LU/l;F)J

    .line 170
    .line 171
    .line 172
    move-result-wide v10

    .line 173
    invoke-virtual {v8, v15, v9}, LU/D;->a(LY/m;I)LU/l;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v5}, LU/l;->w()J

    .line 178
    .line 179
    .line 180
    move-result-wide v8

    .line 181
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;

    .line 182
    .line 183
    invoke-direct {v5, v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 184
    .line 185
    .line 186
    const/16 v12, 0x36

    .line 187
    .line 188
    const v13, -0x360cdc11

    .line 189
    .line 190
    .line 191
    invoke-static {v13, v7, v5, v15, v12}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    const/high16 v16, 0xc00000

    .line 196
    .line 197
    const/16 v17, 0x70

    .line 198
    .line 199
    move-wide/from16 v18, v10

    .line 200
    .line 201
    move-wide v9, v8

    .line 202
    move-wide/from16 v7, v18

    .line 203
    .line 204
    const/4 v11, 0x0

    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v13, 0x0

    .line 207
    move-object v5, v0

    .line 208
    move-object v0, v6

    .line 209
    move-object v6, v3

    .line 210
    invoke-static/range {v5 .. v17}, LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, LY/w;->L()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_d

    .line 218
    .line 219
    invoke-static {}, LY/w;->T()V

    .line 220
    .line 221
    .line 222
    :cond_d
    move-object v3, v0

    .line 223
    :goto_8
    invoke-interface {v15}, LY/m;->k()LY/B1;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_e

    .line 228
    .line 229
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$2;

    .line 230
    .line 231
    move/from16 v5, p5

    .line 232
    .line 233
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$2;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;II)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    :cond_e
    return-void
.end method

.method public static final VirtualCurrenciesListView(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/e;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v6, p6

    .line 10
    .line 11
    const-string v0, "virtualCurrencies"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "appearance"

    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "localization"

    .line 22
    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "onAction"

    .line 27
    .line 28
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v0, 0x34949775

    .line 32
    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-interface {v5, v0}, LY/m;->g(I)LY/m;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    and-int/lit8 v7, p7, 0x1

    .line 41
    .line 42
    const/4 v8, 0x4

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    or-int/lit8 v7, v6, 0x6

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    and-int/lit8 v7, v6, 0x6

    .line 49
    .line 50
    if-nez v7, :cond_2

    .line 51
    .line 52
    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    move v7, v8

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v7, 0x2

    .line 61
    :goto_0
    or-int/2addr v7, v6

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v7, v6

    .line 64
    :goto_1
    and-int/lit8 v9, p7, 0x2

    .line 65
    .line 66
    if-eqz v9, :cond_3

    .line 67
    .line 68
    or-int/lit8 v7, v7, 0x30

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    and-int/lit8 v9, v6, 0x30

    .line 72
    .line 73
    if-nez v9, :cond_5

    .line 74
    .line 75
    invoke-interface {v5, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_4

    .line 80
    .line 81
    const/16 v9, 0x20

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const/16 v9, 0x10

    .line 85
    .line 86
    :goto_2
    or-int/2addr v7, v9

    .line 87
    :cond_5
    :goto_3
    and-int/lit8 v9, p7, 0x4

    .line 88
    .line 89
    if-eqz v9, :cond_6

    .line 90
    .line 91
    or-int/lit16 v7, v7, 0x180

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_6
    and-int/lit16 v9, v6, 0x180

    .line 95
    .line 96
    if-nez v9, :cond_8

    .line 97
    .line 98
    invoke-interface {v5, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_7

    .line 103
    .line 104
    const/16 v9, 0x100

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    const/16 v9, 0x80

    .line 108
    .line 109
    :goto_4
    or-int/2addr v7, v9

    .line 110
    :cond_8
    :goto_5
    and-int/lit8 v9, p7, 0x8

    .line 111
    .line 112
    if-eqz v9, :cond_9

    .line 113
    .line 114
    or-int/lit16 v7, v7, 0xc00

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    and-int/lit16 v9, v6, 0xc00

    .line 118
    .line 119
    if-nez v9, :cond_b

    .line 120
    .line 121
    invoke-interface {v5, v4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_a

    .line 126
    .line 127
    const/16 v9, 0x800

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_a
    const/16 v9, 0x400

    .line 131
    .line 132
    :goto_6
    or-int/2addr v7, v9

    .line 133
    :cond_b
    :goto_7
    and-int/lit8 v9, p7, 0x10

    .line 134
    .line 135
    if-eqz v9, :cond_d

    .line 136
    .line 137
    or-int/lit16 v7, v7, 0x6000

    .line 138
    .line 139
    :cond_c
    move-object/from16 v10, p4

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_d
    and-int/lit16 v10, v6, 0x6000

    .line 143
    .line 144
    if-nez v10, :cond_c

    .line 145
    .line 146
    move-object/from16 v10, p4

    .line 147
    .line 148
    invoke-interface {v5, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-eqz v11, :cond_e

    .line 153
    .line 154
    const/16 v11, 0x4000

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_e
    const/16 v11, 0x2000

    .line 158
    .line 159
    :goto_8
    or-int/2addr v7, v11

    .line 160
    :goto_9
    and-int/lit16 v11, v7, 0x2493

    .line 161
    .line 162
    const/16 v12, 0x2492

    .line 163
    .line 164
    if-ne v11, v12, :cond_10

    .line 165
    .line 166
    invoke-interface {v5}, LY/m;->i()Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-nez v11, :cond_f

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_f
    invoke-interface {v5}, LY/m;->K()V

    .line 174
    .line 175
    .line 176
    move-object v3, v5

    .line 177
    move-object v5, v10

    .line 178
    goto/16 :goto_11

    .line 179
    .line 180
    :cond_10
    :goto_a
    if-eqz v9, :cond_11

    .line 181
    .line 182
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_11
    move-object v9, v10

    .line 186
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_12

    .line 191
    .line 192
    const/4 v10, -0x1

    .line 193
    const-string v11, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView (VirtualCurrenciesListView.kt:47)"

    .line 194
    .line 195
    invoke-static {v0, v7, v10, v11}, LY/w;->U(IIILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_12
    invoke-virtual {v1}, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;->getAll()Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_14

    .line 207
    .line 208
    invoke-static {}, LY/w;->L()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_13

    .line 213
    .line 214
    invoke-static {}, LY/w;->T()V

    .line 215
    .line 216
    .line 217
    :cond_13
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    if-eqz v8, :cond_23

    .line 222
    .line 223
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$1;

    .line 224
    .line 225
    move/from16 v7, p7

    .line 226
    .line 227
    move-object v5, v9

    .line 228
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$1;-><init>(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;II)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_14
    move-object v0, v3

    .line 236
    move-object v1, v9

    .line 237
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;->getAll()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    check-cast v2, Ljava/lang/Iterable;

    .line 246
    .line 247
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$$inlined$sortedByDescending$1;

    .line 248
    .line 249
    invoke-direct {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$$inlined$sortedByDescending$1;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-static {v2, v3}, LUd/u;->R0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-gt v3, v8, :cond_15

    .line 261
    .line 262
    move-object/from16 v26, v2

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_15
    const/4 v3, 0x3

    .line 266
    invoke-static {v2, v3}, LUd/u;->T0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    move-object/from16 v26, v3

    .line 271
    .line 272
    :goto_c
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    const/4 v3, 0x0

    .line 277
    const/4 v4, 0x1

    .line 278
    if-le v2, v8, :cond_16

    .line 279
    .line 280
    move/from16 v27, v4

    .line 281
    .line 282
    goto :goto_d

    .line 283
    :cond_16
    move/from16 v27, v3

    .line 284
    .line 285
    :goto_d
    const/4 v2, 0x0

    .line 286
    const/4 v6, 0x0

    .line 287
    invoke-static {v1, v2, v4, v6}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    sget-object v6, Ll0/e;->a:Ll0/e$a;

    .line 292
    .line 293
    invoke-virtual {v6}, Ll0/e$a;->k()Ll0/e$b;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    sget-object v8, LC/b;->a:LC/b;

    .line 298
    .line 299
    invoke-virtual {v8}, LC/b;->h()LC/b$m;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    const/16 v9, 0x30

    .line 304
    .line 305
    invoke-static {v8, v6, v5, v9}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    invoke-static {v5, v3}, LY/h;->a(LY/m;I)I

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    invoke-interface {v5}, LY/m;->r()LY/I;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    invoke-static {v5, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    sget-object v10, LK0/g;->M:LK0/g$a;

    .line 322
    .line 323
    invoke-virtual {v10}, LK0/g$a;->a()Lie/a;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    invoke-interface {v5}, LY/m;->j()LY/d;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    if-nez v12, :cond_17

    .line 332
    .line 333
    invoke-static {}, LY/h;->d()V

    .line 334
    .line 335
    .line 336
    :cond_17
    invoke-interface {v5}, LY/m;->I()V

    .line 337
    .line 338
    .line 339
    invoke-interface {v5}, LY/m;->e()Z

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    if-eqz v12, :cond_18

    .line 344
    .line 345
    invoke-interface {v5, v11}, LY/m;->h(Lie/a;)V

    .line 346
    .line 347
    .line 348
    goto :goto_e

    .line 349
    :cond_18
    invoke-interface {v5}, LY/m;->s()V

    .line 350
    .line 351
    .line 352
    :goto_e
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    invoke-virtual {v10}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-static {v11, v6, v12}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v10}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-static {v11, v9, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-interface {v11}, LY/m;->e()Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-nez v9, :cond_19

    .line 379
    .line 380
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    if-nez v9, :cond_1a

    .line 393
    .line 394
    :cond_19
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    invoke-interface {v11, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-interface {v11, v8, v6}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 406
    .line 407
    .line 408
    :cond_1a
    invoke-virtual {v10}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-static {v11, v2, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 413
    .line 414
    .line 415
    sget-object v2, LC/j;->a:LC/j;

    .line 416
    .line 417
    sget-object v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 418
    .line 419
    invoke-virtual {v0, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    sget-object v6, LU/D;->a:LU/D;

    .line 424
    .line 425
    sget v8, LU/D;->b:I

    .line 426
    .line 427
    invoke-virtual {v6, v5, v8}, LU/D;->c(LY/m;I)LU/o0;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    invoke-virtual {v9}, LU/o0;->n()LU0/Y0;

    .line 432
    .line 433
    .line 434
    move-result-object v21

    .line 435
    invoke-virtual {v6, v5, v8}, LU/D;->a(LY/m;I)LU/l;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-virtual {v6}, LU/l;->w()J

    .line 440
    .line 441
    .line 442
    move-result-wide v8

    .line 443
    sget-object v10, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 444
    .line 445
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 446
    .line 447
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getSECTION_TITLE_BOTTOM_PADDING-D9Ej5fM()F

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    const/4 v15, 0x7

    .line 452
    const/16 v16, 0x0

    .line 453
    .line 454
    const/4 v11, 0x0

    .line 455
    const/4 v12, 0x0

    .line 456
    const/4 v13, 0x0

    .line 457
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    const/16 v24, 0x0

    .line 462
    .line 463
    const v25, 0xfff8

    .line 464
    .line 465
    .line 466
    move-object v10, v1

    .line 467
    move-object v1, v2

    .line 468
    move-object/from16 v22, v5

    .line 469
    .line 470
    move-object v2, v6

    .line 471
    const-wide/16 v5, 0x0

    .line 472
    .line 473
    move v11, v7

    .line 474
    const/4 v7, 0x0

    .line 475
    move v12, v4

    .line 476
    move-wide/from16 v32, v8

    .line 477
    .line 478
    move v9, v3

    .line 479
    move-wide/from16 v3, v32

    .line 480
    .line 481
    const/4 v8, 0x0

    .line 482
    move v13, v9

    .line 483
    const/4 v9, 0x0

    .line 484
    move-object v15, v10

    .line 485
    move v14, v11

    .line 486
    const-wide/16 v10, 0x0

    .line 487
    .line 488
    move/from16 v16, v12

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    move/from16 v17, v13

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    move/from16 v18, v14

    .line 495
    .line 496
    move-object/from16 v19, v15

    .line 497
    .line 498
    const-wide/16 v14, 0x0

    .line 499
    .line 500
    move/from16 v20, v16

    .line 501
    .line 502
    const/16 v16, 0x0

    .line 503
    .line 504
    move/from16 v23, v17

    .line 505
    .line 506
    const/16 v17, 0x0

    .line 507
    .line 508
    move/from16 v28, v18

    .line 509
    .line 510
    const/16 v18, 0x0

    .line 511
    .line 512
    move-object/from16 v29, v19

    .line 513
    .line 514
    const/16 v19, 0x0

    .line 515
    .line 516
    move/from16 v30, v20

    .line 517
    .line 518
    const/16 v20, 0x0

    .line 519
    .line 520
    move/from16 v31, v23

    .line 521
    .line 522
    const/16 v23, 0x30

    .line 523
    .line 524
    move/from16 v0, v30

    .line 525
    .line 526
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 527
    .line 528
    .line 529
    move-object/from16 v3, v22

    .line 530
    .line 531
    const v1, 0x6a359751

    .line 532
    .line 533
    .line 534
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 535
    .line 536
    .line 537
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    move/from16 v1, v31

    .line 542
    .line 543
    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    const/4 v4, 0x6

    .line 548
    if-eqz v2, :cond_20

    .line 549
    .line 550
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    add-int/lit8 v9, v1, 0x1

    .line 555
    .line 556
    if-gez v1, :cond_1b

    .line 557
    .line 558
    invoke-static {}, LUd/u;->w()V

    .line 559
    .line 560
    .line 561
    :cond_1b
    check-cast v2, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;

    .line 562
    .line 563
    const v5, 0x6a359b87

    .line 564
    .line 565
    .line 566
    invoke-interface {v3, v5}, LY/m;->V(I)V

    .line 567
    .line 568
    .line 569
    if-lez v1, :cond_1c

    .line 570
    .line 571
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 572
    .line 573
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 574
    .line 575
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getITEMS_SPACING-D9Ej5fM()F

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-static {v5, v3, v4}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 584
    .line 585
    .line 586
    :cond_1c
    invoke-interface {v3}, LY/m;->O()V

    .line 587
    .line 588
    .line 589
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    add-int v4, v4, v27

    .line 594
    .line 595
    if-ne v4, v0, :cond_1d

    .line 596
    .line 597
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->SINGLE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 598
    .line 599
    goto :goto_10

    .line 600
    :cond_1d
    if-nez v1, :cond_1e

    .line 601
    .line 602
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->FIRST:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_1e
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    sub-int/2addr v4, v0

    .line 610
    if-ne v1, v4, :cond_1f

    .line 611
    .line 612
    if-nez v27, :cond_1f

    .line 613
    .line 614
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->LAST:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 615
    .line 616
    goto :goto_10

    .line 617
    :cond_1f
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->MIDDLE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 618
    .line 619
    :goto_10
    shr-int/lit8 v4, v28, 0x3

    .line 620
    .line 621
    and-int/lit8 v6, v4, 0x7e

    .line 622
    .line 623
    const/16 v7, 0x10

    .line 624
    .line 625
    const/4 v4, 0x0

    .line 626
    move v12, v0

    .line 627
    move-object v5, v3

    .line 628
    move-object/from16 v0, p1

    .line 629
    .line 630
    move-object v3, v1

    .line 631
    move-object/from16 v1, p2

    .line 632
    .line 633
    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->VirtualCurrencyRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;Landroidx/compose/ui/e;LY/m;II)V

    .line 634
    .line 635
    .line 636
    move-object v3, v5

    .line 637
    move v1, v9

    .line 638
    move v0, v12

    .line 639
    goto :goto_f

    .line 640
    :cond_20
    invoke-interface {v3}, LY/m;->O()V

    .line 641
    .line 642
    .line 643
    const v0, 0x6a35fb54    # 5.500061E25f

    .line 644
    .line 645
    .line 646
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 647
    .line 648
    .line 649
    if-eqz v27, :cond_21

    .line 650
    .line 651
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 652
    .line 653
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 654
    .line 655
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getITEMS_SPACING-D9Ej5fM()F

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-static {v0, v3, v4}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 664
    .line 665
    .line 666
    shr-int/lit8 v0, v28, 0x6

    .line 667
    .line 668
    and-int/lit8 v4, v0, 0x7e

    .line 669
    .line 670
    const/4 v5, 0x4

    .line 671
    const/4 v2, 0x0

    .line 672
    move-object/from16 v0, p2

    .line 673
    .line 674
    move-object/from16 v1, p3

    .line 675
    .line 676
    invoke-static/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->ShowAllVirtualCurrenciesRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V

    .line 677
    .line 678
    .line 679
    :cond_21
    invoke-interface {v3}, LY/m;->O()V

    .line 680
    .line 681
    .line 682
    invoke-interface {v3}, LY/m;->x()V

    .line 683
    .line 684
    .line 685
    invoke-static {}, LY/w;->L()Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-eqz v0, :cond_22

    .line 690
    .line 691
    invoke-static {}, LY/w;->T()V

    .line 692
    .line 693
    .line 694
    :cond_22
    move-object/from16 v5, v29

    .line 695
    .line 696
    :goto_11
    invoke-interface {v3}, LY/m;->k()LY/B1;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    if-eqz v8, :cond_23

    .line 701
    .line 702
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$3;

    .line 703
    .line 704
    move-object/from16 v1, p0

    .line 705
    .line 706
    move-object/from16 v2, p1

    .line 707
    .line 708
    move-object/from16 v3, p2

    .line 709
    .line 710
    move-object/from16 v4, p3

    .line 711
    .line 712
    move/from16 v6, p6

    .line 713
    .line 714
    move/from16 v7, p7

    .line 715
    .line 716
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView$3;-><init>(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;II)V

    .line 717
    .line 718
    .line 719
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 720
    .line 721
    .line 722
    :cond_23
    return-void
.end method

.method private static final VirtualCurrenciesListView_4_VCs_Preview(LY/m;I)V
    .locals 4

    .line 1
    const v0, 0x62d57dc1

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_4_VCs_Preview (VirtualCurrenciesListView.kt:234)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v0, v3, v3, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$1;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$1;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x36

    .line 48
    .line 49
    const v2, 0x435bb3e2

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-static {v2, v3, v1, p0, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x6

    .line 58
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, LY/w;->L()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-static {}, LY/w;->T()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$2;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$2;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method private static final VirtualCurrenciesListView_5_VCs_Preview(LY/m;I)V
    .locals 4

    .line 1
    const v0, 0x3c9f4b02

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_5_VCs_Preview (VirtualCurrenciesListView.kt:257)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v0, v3, v3, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$1;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$1;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x36

    .line 48
    .line 49
    const v2, 0x1d258123

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-static {v2, v3, v1, p0, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x6

    .line 58
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, LY/w;->L()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-static {}, LY/w;->T()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$2;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$2;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public static final VirtualCurrencyRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;Landroidx/compose/ui/e;LY/m;II)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v6, p6

    .line 10
    .line 11
    const-string v0, "appearance"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "localization"

    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "virtualCurrency"

    .line 22
    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "position"

    .line 27
    .line 28
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v0, -0x6afe17fc

    .line 32
    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-interface {v5, v0}, LY/m;->g(I)LY/m;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    and-int/lit8 v7, p7, 0x1

    .line 41
    .line 42
    const/4 v8, 0x4

    .line 43
    const/4 v9, 0x2

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    or-int/lit8 v7, v6, 0x6

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    and-int/lit8 v7, v6, 0x6

    .line 50
    .line 51
    if-nez v7, :cond_2

    .line 52
    .line 53
    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    move v7, v8

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v7, v9

    .line 62
    :goto_0
    or-int/2addr v7, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v7, v6

    .line 65
    :goto_1
    and-int/lit8 v10, p7, 0x2

    .line 66
    .line 67
    if-eqz v10, :cond_3

    .line 68
    .line 69
    or-int/lit8 v7, v7, 0x30

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    and-int/lit8 v10, v6, 0x30

    .line 73
    .line 74
    if-nez v10, :cond_5

    .line 75
    .line 76
    invoke-interface {v5, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_4

    .line 81
    .line 82
    const/16 v10, 0x20

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    const/16 v10, 0x10

    .line 86
    .line 87
    :goto_2
    or-int/2addr v7, v10

    .line 88
    :cond_5
    :goto_3
    and-int/lit8 v10, p7, 0x4

    .line 89
    .line 90
    if-eqz v10, :cond_6

    .line 91
    .line 92
    or-int/lit16 v7, v7, 0x180

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_6
    and-int/lit16 v10, v6, 0x180

    .line 96
    .line 97
    if-nez v10, :cond_8

    .line 98
    .line 99
    invoke-interface {v5, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_7

    .line 104
    .line 105
    const/16 v10, 0x100

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    const/16 v10, 0x80

    .line 109
    .line 110
    :goto_4
    or-int/2addr v7, v10

    .line 111
    :cond_8
    :goto_5
    and-int/lit8 v10, p7, 0x8

    .line 112
    .line 113
    if-eqz v10, :cond_9

    .line 114
    .line 115
    or-int/lit16 v7, v7, 0xc00

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_9
    and-int/lit16 v10, v6, 0xc00

    .line 119
    .line 120
    if-nez v10, :cond_b

    .line 121
    .line 122
    invoke-interface {v5, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_a

    .line 127
    .line 128
    const/16 v10, 0x800

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_a
    const/16 v10, 0x400

    .line 132
    .line 133
    :goto_6
    or-int/2addr v7, v10

    .line 134
    :cond_b
    :goto_7
    and-int/lit8 v10, p7, 0x10

    .line 135
    .line 136
    if-eqz v10, :cond_d

    .line 137
    .line 138
    or-int/lit16 v7, v7, 0x6000

    .line 139
    .line 140
    :cond_c
    move-object/from16 v11, p4

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_d
    and-int/lit16 v11, v6, 0x6000

    .line 144
    .line 145
    if-nez v11, :cond_c

    .line 146
    .line 147
    move-object/from16 v11, p4

    .line 148
    .line 149
    invoke-interface {v5, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    if-eqz v12, :cond_e

    .line 154
    .line 155
    const/16 v12, 0x4000

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_e
    const/16 v12, 0x2000

    .line 159
    .line 160
    :goto_8
    or-int/2addr v7, v12

    .line 161
    :goto_9
    and-int/lit16 v12, v7, 0x2493

    .line 162
    .line 163
    const/16 v13, 0x2492

    .line 164
    .line 165
    if-ne v12, v13, :cond_10

    .line 166
    .line 167
    invoke-interface {v5}, LY/m;->i()Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-nez v12, :cond_f

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_f
    invoke-interface {v5}, LY/m;->K()V

    .line 175
    .line 176
    .line 177
    move-object/from16 v17, v5

    .line 178
    .line 179
    move-object v5, v11

    .line 180
    goto/16 :goto_11

    .line 181
    .line 182
    :cond_10
    :goto_a
    if-eqz v10, :cond_11

    .line 183
    .line 184
    sget-object v10, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 185
    .line 186
    goto :goto_b

    .line 187
    :cond_11
    move-object v10, v11

    .line 188
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_12

    .line 193
    .line 194
    const/4 v11, -0x1

    .line 195
    const-string v12, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyRow (VirtualCurrenciesListView.kt:119)"

    .line 196
    .line 197
    invoke-static {v0, v7, v11, v12}, LY/w;->U(IIILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_12
    invoke-virtual {v3}, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;->getBalance()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    const v7, -0x139a722a

    .line 205
    .line 206
    .line 207
    invoke-interface {v5, v7}, LY/m;->V(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v5, v0}, LY/m;->c(I)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    if-nez v0, :cond_13

    .line 219
    .line 220
    sget-object v0, LY/m;->a:LY/m$a;

    .line 221
    .line 222
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v7, v0, :cond_15

    .line 227
    .line 228
    :cond_13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 229
    .line 230
    const/16 v7, 0x1e

    .line 231
    .line 232
    if-lt v0, v7, :cond_14

    .line 233
    .line 234
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/a;->a()Landroid/icu/number/UnlocalizedNumberFormatter;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->getLocale()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-static {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/LocaleHelpersKt;->createLocaleFromString(Ljava/lang/String;)Ljava/util/Locale;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-static {v0, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/b;->a(Landroid/icu/number/UnlocalizedNumberFormatter;Ljava/util/Locale;)Landroid/icu/number/LocalizedNumberFormatter;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v3}, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;->getBalance()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-static {v0, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/c;->a(Landroid/icu/number/LocalizedNumberFormatter;Ljava/lang/Number;)Landroid/icu/number/FormattedNumber;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/d;->a(Landroid/icu/number/FormattedNumber;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    :goto_c
    move-object v7, v0

    .line 267
    goto :goto_d

    .line 268
    :cond_14
    invoke-virtual {v3}, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;->getBalance()I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    goto :goto_c

    .line 277
    :goto_d
    invoke-interface {v5, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_15
    check-cast v7, Ljava/lang/String;

    .line 281
    .line 282
    invoke-interface {v5}, LY/m;->O()V

    .line 283
    .line 284
    .line 285
    const-string v0, "remember(virtualCurrency\u2026oString()\n        }\n    }"

    .line 286
    .line 287
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 291
    .line 292
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    aget v0, v0, v11

    .line 297
    .line 298
    const/4 v11, 0x1

    .line 299
    if-eq v0, v11, :cond_19

    .line 300
    .line 301
    if-eq v0, v9, :cond_18

    .line 302
    .line 303
    const/4 v12, 0x3

    .line 304
    if-eq v0, v12, :cond_17

    .line 305
    .line 306
    if-ne v0, v8, :cond_16

    .line 307
    .line 308
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 309
    .line 310
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    invoke-static {v0}, LJ/i;->d(F)LJ/h;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    :goto_e
    move-object v8, v0

    .line 319
    goto :goto_f

    .line 320
    :cond_16
    new-instance v0, LTd/r;

    .line 321
    .line 322
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :cond_17
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    invoke-static {v8, v12, v0, v13}, LJ/i;->e(FFFF)LJ/h;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    goto :goto_e

    .line 349
    :cond_18
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-static {v8, v12, v0, v13}, LJ/i;->e(FFFF)LJ/h;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    goto :goto_e

    .line 372
    :cond_19
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 373
    .line 374
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    invoke-static {v0}, LJ/i;->d(F)LJ/h;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    goto :goto_e

    .line 383
    :goto_f
    const/4 v0, 0x0

    .line 384
    invoke-static {v5, v0}, Lx/m;->a(LY/m;I)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    sget-object v12, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$textColor$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$textColor$1;

    .line 389
    .line 390
    invoke-static {v1, v0, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigDataExtensionsKt;->getColorForTheme(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;ZLkotlin/jvm/functions/Function1;)Ls0/r0;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const v12, -0x1399c7f5

    .line 395
    .line 396
    .line 397
    invoke-interface {v5, v12}, LY/m;->V(I)V

    .line 398
    .line 399
    .line 400
    if-nez v0, :cond_1a

    .line 401
    .line 402
    sget-object v0, LU/D;->a:LU/D;

    .line 403
    .line 404
    sget v12, LU/D;->b:I

    .line 405
    .line 406
    invoke-virtual {v0, v5, v12}, LU/D;->a(LY/m;I)LU/l;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0}, LU/l;->w()J

    .line 411
    .line 412
    .line 413
    move-result-wide v12

    .line 414
    goto :goto_10

    .line 415
    :cond_1a
    invoke-virtual {v0}, Ls0/r0;->A()J

    .line 416
    .line 417
    .line 418
    move-result-wide v12

    .line 419
    :goto_10
    invoke-interface {v5}, LY/m;->O()V

    .line 420
    .line 421
    .line 422
    const/4 v0, 0x0

    .line 423
    const/4 v14, 0x0

    .line 424
    invoke-static {v10, v0, v11, v14}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    sget-object v14, LU/D;->a:LU/D;

    .line 429
    .line 430
    sget v15, LU/D;->b:I

    .line 431
    .line 432
    invoke-virtual {v14, v5, v15}, LU/D;->a(LY/m;I)LU/l;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    int-to-float v9, v9

    .line 437
    invoke-static {v9}, Li1/h;->n(F)F

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    invoke-static {v11, v9}, LU/m;->k(LU/l;F)J

    .line 442
    .line 443
    .line 444
    move-result-wide v16

    .line 445
    invoke-virtual {v14, v5, v15}, LU/D;->a(LY/m;I)LU/l;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    invoke-virtual {v9}, LU/l;->w()J

    .line 450
    .line 451
    .line 452
    move-result-wide v14

    .line 453
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$1;

    .line 454
    .line 455
    invoke-direct {v9, v3, v12, v13, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$1;-><init>(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;JLjava/lang/String;)V

    .line 456
    .line 457
    .line 458
    const/16 v7, 0x36

    .line 459
    .line 460
    const v11, -0x67ff5321

    .line 461
    .line 462
    .line 463
    const/4 v12, 0x1

    .line 464
    invoke-static {v11, v12, v9, v5, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    const/high16 v18, 0xc00000

    .line 469
    .line 470
    const/16 v19, 0x70

    .line 471
    .line 472
    const/4 v13, 0x0

    .line 473
    move-wide v11, v14

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    move-object/from16 v20, v7

    .line 477
    .line 478
    move-object v7, v0

    .line 479
    move-object v0, v10

    .line 480
    move-wide/from16 v9, v16

    .line 481
    .line 482
    move-object/from16 v16, v20

    .line 483
    .line 484
    move-object/from16 v17, v5

    .line 485
    .line 486
    invoke-static/range {v7 .. v19}, LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 487
    .line 488
    .line 489
    invoke-static {}, LY/w;->L()Z

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    if-eqz v5, :cond_1b

    .line 494
    .line 495
    invoke-static {}, LY/w;->T()V

    .line 496
    .line 497
    .line 498
    :cond_1b
    move-object v5, v0

    .line 499
    :goto_11
    invoke-interface/range {v17 .. v17}, LY/m;->k()LY/B1;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    if-eqz v8, :cond_1c

    .line 504
    .line 505
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$2;

    .line 506
    .line 507
    move/from16 v7, p7

    .line 508
    .line 509
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt$VirtualCurrencyRow$2;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;Landroidx/compose/ui/e;II)V

    .line 510
    .line 511
    .line 512
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 513
    .line 514
    .line 515
    :cond_1c
    return-void
.end method

.method public static final synthetic access$ShowAllVirtualCurrenciesRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->ShowAllVirtualCurrenciesRow(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$VirtualCurrenciesListView_4_VCs_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->VirtualCurrenciesListView_4_VCs_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$VirtualCurrenciesListView_5_VCs_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrenciesListViewKt;->VirtualCurrenciesListView_5_VCs_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
