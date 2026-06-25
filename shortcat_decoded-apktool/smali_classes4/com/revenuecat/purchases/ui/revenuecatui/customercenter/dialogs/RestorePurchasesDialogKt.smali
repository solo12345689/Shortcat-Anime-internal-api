.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001aK\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;",
        "state",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onDismiss",
        "onRestore",
        "onContactSupport",
        "RestorePurchasesDialog",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V",
        "RestoringDialog",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V",
        "PurchasesRecoveredDialog",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V",
        "PurchasesNotFoundDialog",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V",
        "RestorePurchasesDialogRestoringPreview",
        "(LY/m;I)V",
        "RestorePurchasesDialogRecoveredPreview",
        "RestorePurchasesDialogNotFoundPreview",
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
.method private static final PurchasesNotFoundDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Lie/a;",
            "Lie/a;",
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
    move/from16 v0, p4

    .line 6
    .line 7
    const v3, 0x5bae5e71

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p3

    .line 11
    .line 12
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, p5, 0x1

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    or-int/lit8 v5, v0, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v5, v0, 0x6

    .line 24
    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-interface {v4, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v5, 0x2

    .line 36
    :goto_0
    or-int/2addr v5, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v5, v0

    .line 39
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    or-int/lit8 v5, v5, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v6, v0, 0x30

    .line 47
    .line 48
    if-nez v6, :cond_5

    .line 49
    .line 50
    invoke-interface {v4, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    const/16 v6, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v6, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v5, v6

    .line 62
    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    .line 63
    .line 64
    if-eqz v6, :cond_7

    .line 65
    .line 66
    or-int/lit16 v5, v5, 0x180

    .line 67
    .line 68
    :cond_6
    move-object/from16 v7, p2

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_7
    and-int/lit16 v7, v0, 0x180

    .line 72
    .line 73
    if-nez v7, :cond_6

    .line 74
    .line 75
    move-object/from16 v7, p2

    .line 76
    .line 77
    invoke-interface {v4, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_8

    .line 82
    .line 83
    const/16 v8, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_8
    const/16 v8, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v5, v8

    .line 89
    :goto_5
    and-int/lit16 v8, v5, 0x93

    .line 90
    .line 91
    const/16 v9, 0x92

    .line 92
    .line 93
    if-ne v8, v9, :cond_a

    .line 94
    .line 95
    invoke-interface {v4}, LY/m;->i()Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_9

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_9
    invoke-interface {v4}, LY/m;->K()V

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v4

    .line 106
    .line 107
    move-object v3, v7

    .line 108
    goto/16 :goto_8

    .line 109
    .line 110
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 111
    .line 112
    const/4 v6, 0x0

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
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog (RestorePurchasesDialog.kt:114)"

    .line 123
    .line 124
    invoke-static {v3, v5, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_c
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$1;

    .line 128
    .line 129
    invoke-direct {v3, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$1;-><init>(Lie/a;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 130
    .line 131
    .line 132
    const v7, 0x7c3886b9

    .line 133
    .line 134
    .line 135
    const/4 v8, 0x1

    .line 136
    const/16 v9, 0x36

    .line 137
    .line 138
    invoke-static {v7, v8, v3, v4, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$2;

    .line 143
    .line 144
    invoke-direct {v7, v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$2;-><init>(Lie/a;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 145
    .line 146
    .line 147
    const v10, -0x3ec8eec5

    .line 148
    .line 149
    .line 150
    invoke-static {v10, v8, v7, v4, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$3;

    .line 155
    .line 156
    invoke-direct {v10, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$3;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 157
    .line 158
    .line 159
    const v11, 0x6359bbd

    .line 160
    .line 161
    .line 162
    invoke-static {v11, v8, v10, v4, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$4;

    .line 167
    .line 168
    invoke-direct {v11, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$4;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 169
    .line 170
    .line 171
    const v12, 0x28b4e0fe

    .line 172
    .line 173
    .line 174
    invoke-static {v12, v8, v11, v4, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    shr-int/lit8 v5, v5, 0x3

    .line 179
    .line 180
    and-int/lit8 v5, v5, 0xe

    .line 181
    .line 182
    const v9, 0x1b0c30

    .line 183
    .line 184
    .line 185
    or-int v21, v5, v9

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/16 v23, 0x3f94

    .line 190
    .line 191
    move-object/from16 v20, v4

    .line 192
    .line 193
    const/4 v4, 0x0

    .line 194
    move-object v5, v6

    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v9, 0x0

    .line 197
    move-object v12, v5

    .line 198
    move-object v5, v7

    .line 199
    move-object v7, v10

    .line 200
    const-wide/16 v10, 0x0

    .line 201
    .line 202
    move-object v14, v12

    .line 203
    const-wide/16 v12, 0x0

    .line 204
    .line 205
    move-object/from16 v16, v14

    .line 206
    .line 207
    const-wide/16 v14, 0x0

    .line 208
    .line 209
    move-object/from16 v18, v16

    .line 210
    .line 211
    const-wide/16 v16, 0x0

    .line 212
    .line 213
    move-object/from16 v19, v18

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    move-object/from16 v24, v19

    .line 218
    .line 219
    const/16 v19, 0x0

    .line 220
    .line 221
    invoke-static/range {v2 .. v23}, LU/c;->a(Lie/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JJJJFLandroidx/compose/ui/window/k;LY/m;III)V

    .line 222
    .line 223
    .line 224
    invoke-static {}, LY/w;->L()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    invoke-static {}, LY/w;->T()V

    .line 231
    .line 232
    .line 233
    :cond_d
    move-object/from16 v3, v24

    .line 234
    .line 235
    :goto_8
    invoke-interface/range {v20 .. v20}, LY/m;->k()LY/B1;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    if-eqz v6, :cond_e

    .line 240
    .line 241
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$5;

    .line 242
    .line 243
    move-object/from16 v2, p1

    .line 244
    .line 245
    move/from16 v4, p4

    .line 246
    .line 247
    move/from16 v5, p5

    .line 248
    .line 249
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesNotFoundDialog$5;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;II)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 253
    .line 254
    .line 255
    :cond_e
    return-void
.end method

.method private static final PurchasesRecoveredDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Lie/a;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x676e5059

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p2

    .line 9
    .line 10
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    and-int/lit8 v4, p3, 0x6

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v4, 0x2

    .line 27
    :goto_0
    or-int v4, p3, v4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v4, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v5, p3, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_3

    .line 35
    .line 36
    invoke-interface {v3, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v4, v5

    .line 48
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 49
    .line 50
    const/16 v6, 0x12

    .line 51
    .line 52
    if-ne v5, v6, :cond_5

    .line 53
    .line 54
    invoke-interface {v3}, LY/m;->i()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v3}, LY/m;->K()V

    .line 62
    .line 63
    .line 64
    move-object/from16 v19, v3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    const/4 v5, -0x1

    .line 74
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog (RestorePurchasesDialog.kt:78)"

    .line 75
    .line 76
    invoke-static {v2, v4, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$1;

    .line 80
    .line 81
    invoke-direct {v2, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$1;-><init>(Lie/a;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 82
    .line 83
    .line 84
    const v5, 0x68703711

    .line 85
    .line 86
    .line 87
    const/4 v6, 0x1

    .line 88
    const/16 v7, 0x36

    .line 89
    .line 90
    invoke-static {v5, v6, v2, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$2;

    .line 95
    .line 96
    invoke-direct {v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$2;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 97
    .line 98
    .line 99
    const v8, 0x56aad8d

    .line 100
    .line 101
    .line 102
    invoke-static {v8, v6, v5, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$3;

    .line 107
    .line 108
    invoke-direct {v8, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$3;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 109
    .line 110
    .line 111
    const v9, -0x1356b4d4

    .line 112
    .line 113
    .line 114
    invoke-static {v9, v6, v8, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    shr-int/lit8 v4, v4, 0x3

    .line 119
    .line 120
    and-int/lit8 v4, v4, 0xe

    .line 121
    .line 122
    const v6, 0x1b0030

    .line 123
    .line 124
    .line 125
    or-int v20, v4, v6

    .line 126
    .line 127
    const/16 v21, 0x0

    .line 128
    .line 129
    const/16 v22, 0x3f9c

    .line 130
    .line 131
    move-object/from16 v19, v3

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    move-object v6, v5

    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const-wide/16 v9, 0x0

    .line 139
    .line 140
    const-wide/16 v11, 0x0

    .line 141
    .line 142
    const-wide/16 v13, 0x0

    .line 143
    .line 144
    const-wide/16 v15, 0x0

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    invoke-static/range {v1 .. v22}, LU/c;->a(Lie/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JJJJFLandroidx/compose/ui/window/k;LY/m;III)V

    .line 151
    .line 152
    .line 153
    invoke-static {}, LY/w;->L()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_7

    .line 158
    .line 159
    invoke-static {}, LY/w;->T()V

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_4
    invoke-interface/range {v19 .. v19}, LY/m;->k()LY/B1;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    if-eqz v2, :cond_8

    .line 167
    .line 168
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$4;

    .line 169
    .line 170
    move/from16 v4, p3

    .line 171
    .line 172
    invoke-direct {v3, v0, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$PurchasesRecoveredDialog$4;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v2, v3}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    return-void
.end method

.method public static final synthetic RestorePurchasesDialog(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V
    .locals 7

    .line 1
    const-string v0, "state"

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
    const-string v0, "onDismiss"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onRestore"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v0, -0x5cdf8863

    .line 22
    .line 23
    .line 24
    invoke-interface {p5, v0}, LY/m;->g(I)LY/m;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    and-int/lit8 p5, p6, 0x6

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    if-nez p5, :cond_1

    .line 32
    .line 33
    invoke-interface {v4, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    if-eqz p5, :cond_0

    .line 38
    .line 39
    const/4 p5, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move p5, v1

    .line 42
    :goto_0
    or-int/2addr p5, p6

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move p5, p6

    .line 45
    :goto_1
    and-int/lit8 v2, p6, 0x30

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-interface {v4, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    const/16 v2, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v2, 0x10

    .line 59
    .line 60
    :goto_2
    or-int/2addr p5, v2

    .line 61
    :cond_3
    and-int/lit16 v2, p6, 0x180

    .line 62
    .line 63
    if-nez v2, :cond_5

    .line 64
    .line 65
    invoke-interface {v4, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    const/16 v2, 0x100

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/16 v2, 0x80

    .line 75
    .line 76
    :goto_3
    or-int/2addr p5, v2

    .line 77
    :cond_5
    and-int/lit16 v2, p6, 0xc00

    .line 78
    .line 79
    if-nez v2, :cond_7

    .line 80
    .line 81
    invoke-interface {v4, p3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    const/16 v2, 0x800

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    const/16 v2, 0x400

    .line 91
    .line 92
    :goto_4
    or-int/2addr p5, v2

    .line 93
    :cond_7
    and-int/lit16 v2, p6, 0x6000

    .line 94
    .line 95
    if-nez v2, :cond_9

    .line 96
    .line 97
    invoke-interface {v4, p4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_8

    .line 102
    .line 103
    const/16 v2, 0x4000

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/16 v2, 0x2000

    .line 107
    .line 108
    :goto_5
    or-int/2addr p5, v2

    .line 109
    :cond_9
    and-int/lit16 v2, p5, 0x2493

    .line 110
    .line 111
    const/16 v3, 0x2492

    .line 112
    .line 113
    if-ne v2, v3, :cond_b

    .line 114
    .line 115
    invoke-interface {v4}, LY/m;->i()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_a

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    invoke-interface {v4}, LY/m;->K()V

    .line 123
    .line 124
    .line 125
    move-object v2, p2

    .line 126
    move-object p2, p1

    .line 127
    move-object p1, p4

    .line 128
    goto/16 :goto_9

    .line 129
    .line 130
    :cond_b
    :goto_6
    invoke-static {}, LY/w;->L()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_c

    .line 135
    .line 136
    const/4 v2, -0x1

    .line 137
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialog (RestorePurchasesDialog.kt:28)"

    .line 138
    .line 139
    invoke-static {v0, p5, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_c
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    aget v0, v0, v2

    .line 149
    .line 150
    const/4 v2, 0x1

    .line 151
    const/4 v3, 0x3

    .line 152
    if-eq v0, v2, :cond_f

    .line 153
    .line 154
    if-eq v0, v1, :cond_e

    .line 155
    .line 156
    if-eq v0, v3, :cond_d

    .line 157
    .line 158
    const p5, -0x35d06b3f

    .line 159
    .line 160
    .line 161
    invoke-interface {v4, p5}, LY/m;->V(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v4}, LY/m;->O()V

    .line 165
    .line 166
    .line 167
    :goto_7
    move-object v2, p2

    .line 168
    move-object p2, p1

    .line 169
    move-object p1, p4

    .line 170
    goto :goto_8

    .line 171
    :cond_d
    const v0, -0x22c4ae37

    .line 172
    .line 173
    .line 174
    invoke-interface {v4, v0}, LY/m;->V(I)V

    .line 175
    .line 176
    .line 177
    shr-int/2addr p5, v3

    .line 178
    and-int/lit8 p5, p5, 0xe

    .line 179
    .line 180
    invoke-static {p1, v4, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestoringDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V

    .line 181
    .line 182
    .line 183
    sget-object p5, LTd/L;->a:LTd/L;

    .line 184
    .line 185
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    invoke-interface {v4}, LY/m;->O()V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_e
    const v0, -0x22c4cbef

    .line 193
    .line 194
    .line 195
    invoke-interface {v4, v0}, LY/m;->V(I)V

    .line 196
    .line 197
    .line 198
    shr-int/lit8 v0, p5, 0x3

    .line 199
    .line 200
    and-int/lit8 v0, v0, 0x7e

    .line 201
    .line 202
    shr-int/lit8 p5, p5, 0x6

    .line 203
    .line 204
    and-int/lit16 p5, p5, 0x380

    .line 205
    .line 206
    or-int v5, v0, p5

    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    move-object v1, p1

    .line 210
    move-object v2, p2

    .line 211
    move-object v3, p4

    .line 212
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->PurchasesNotFoundDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V

    .line 213
    .line 214
    .line 215
    move-object p2, v1

    .line 216
    move-object p1, v3

    .line 217
    invoke-interface {v4}, LY/m;->O()V

    .line 218
    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_f
    move-object v2, p2

    .line 222
    move-object p2, p1

    .line 223
    move-object p1, p4

    .line 224
    const p4, -0x22c4dd6b

    .line 225
    .line 226
    .line 227
    invoke-interface {v4, p4}, LY/m;->V(I)V

    .line 228
    .line 229
    .line 230
    shr-int/lit8 p4, p5, 0x3

    .line 231
    .line 232
    and-int/lit8 p4, p4, 0x7e

    .line 233
    .line 234
    invoke-static {p2, v2, v4, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->PurchasesRecoveredDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v4}, LY/m;->O()V

    .line 238
    .line 239
    .line 240
    :goto_8
    invoke-static {}, LY/w;->L()Z

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    if-eqz p4, :cond_10

    .line 245
    .line 246
    invoke-static {}, LY/w;->T()V

    .line 247
    .line 248
    .line 249
    :cond_10
    :goto_9
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_11

    .line 254
    .line 255
    move-object p5, p1

    .line 256
    move-object p1, p0

    .line 257
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialog$2;

    .line 258
    .line 259
    move-object p4, p3

    .line 260
    move-object p3, v2

    .line 261
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialog$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v0, p0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 265
    .line 266
    .line 267
    :cond_11
    return-void
.end method

.method private static final RestorePurchasesDialogNotFoundPreview(LY/m;I)V
    .locals 8
    .annotation runtime Lcom/emergetools/snapshots/annotations/EmergeSnapshotConfig;
        ignore = true
    .end annotation

    .line 1
    const v0, -0x2f118bc4

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogNotFoundPreview (RestorePurchasesDialog.kt:185)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->PURCHASES_NOT_FOUND:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 34
    .line 35
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {p0, v3, v3, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$1;

    .line 49
    .line 50
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$2;

    .line 51
    .line 52
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$3;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$3;

    .line 53
    .line 54
    const/16 v7, 0x6d86

    .line 55
    .line 56
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialog(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, LY/w;->L()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-static {}, LY/w;->T()V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$4;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$4;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private static final RestorePurchasesDialogRecoveredPreview(LY/m;I)V
    .locals 8
    .annotation runtime Lcom/emergetools/snapshots/annotations/EmergeSnapshotConfig;
        ignore = true
    .end annotation

    .line 1
    const v0, 0x5b0f455c

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRecoveredPreview (RestorePurchasesDialog.kt:172)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->PURCHASES_RECOVERED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 34
    .line 35
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {p0, v3, v3, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$1;

    .line 49
    .line 50
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$2;

    .line 51
    .line 52
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$3;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$3;

    .line 53
    .line 54
    const/16 v7, 0x6d86

    .line 55
    .line 56
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialog(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, LY/w;->L()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-static {}, LY/w;->T()V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$4;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$4;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private static final RestorePurchasesDialogRestoringPreview(LY/m;I)V
    .locals 8
    .annotation runtime Lcom/emergetools/snapshots/annotations/EmergeSnapshotConfig;
        ignore = true
    .end annotation

    .line 1
    const v0, 0x79786824

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRestoringPreview (RestorePurchasesDialog.kt:159)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->RESTORING:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 34
    .line 35
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {p0, v3, v3, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$1;

    .line 49
    .line 50
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$2;

    .line 51
    .line 52
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$3;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$3;

    .line 53
    .line 54
    const/16 v7, 0x6d86

    .line 55
    .line 56
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialog(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, LY/w;->L()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-static {}, LY/w;->T()V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$4;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$4;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private static final RestoringDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, -0x60ab4e91

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    and-int/lit8 v4, v1, 0x6

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v5

    .line 28
    :goto_0
    or-int/2addr v4, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v4, v1

    .line 31
    :goto_1
    and-int/lit8 v6, v4, 0x3

    .line 32
    .line 33
    if-ne v6, v5, :cond_3

    .line 34
    .line 35
    invoke-interface {v3}, LY/m;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v3}, LY/m;->K()V

    .line 43
    .line 44
    .line 45
    move-object/from16 v21, v3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    const/4 v5, -0x1

    .line 55
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestoringDialog (RestorePurchasesDialog.kt:50)"

    .line 56
    .line 57
    invoke-static {v2, v4, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$1;

    .line 61
    .line 62
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt;

    .line 63
    .line 64
    move-object v5, v4

    .line 65
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt;->getLambda-1$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$2;

    .line 70
    .line 71
    invoke-direct {v6, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$2;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 72
    .line 73
    .line 74
    const/16 v7, 0x36

    .line 75
    .line 76
    const v8, 0x437498bb

    .line 77
    .line 78
    .line 79
    const/4 v9, 0x1

    .line 80
    invoke-static {v8, v9, v6, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt;->getLambda-2$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    const/16 v23, 0x0

    .line 89
    .line 90
    const/16 v24, 0x3f9c

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    const-wide/16 v11, 0x0

    .line 97
    .line 98
    const-wide/16 v13, 0x0

    .line 99
    .line 100
    const-wide/16 v15, 0x0

    .line 101
    .line 102
    const-wide/16 v17, 0x0

    .line 103
    .line 104
    const/16 v19, 0x0

    .line 105
    .line 106
    const/16 v20, 0x0

    .line 107
    .line 108
    const v22, 0x1b0036

    .line 109
    .line 110
    .line 111
    move-object/from16 v21, v3

    .line 112
    .line 113
    move-object v3, v2

    .line 114
    invoke-static/range {v3 .. v24}, LU/c;->a(Lie/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JJJJFLandroidx/compose/ui/window/k;LY/m;III)V

    .line 115
    .line 116
    .line 117
    invoke-static {}, LY/w;->L()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    invoke-static {}, LY/w;->T()V

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_3
    invoke-interface/range {v21 .. v21}, LY/m;->k()LY/B1;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$3;

    .line 133
    .line 134
    invoke-direct {v3, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt$RestoringDialog$3;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v2, v3}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-void
.end method

.method public static final synthetic access$PurchasesNotFoundDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->PurchasesNotFoundDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PurchasesRecoveredDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->PurchasesRecoveredDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$RestorePurchasesDialogNotFoundPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialogNotFoundPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$RestorePurchasesDialogRecoveredPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialogRecoveredPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$RestorePurchasesDialogRestoringPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestorePurchasesDialogRestoringPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$RestoringDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesDialogKt;->RestoringDialog(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
