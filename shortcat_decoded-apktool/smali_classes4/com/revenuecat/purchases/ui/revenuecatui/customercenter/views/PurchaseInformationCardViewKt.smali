.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001aM\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0011\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "purchaseInformation",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;",
        "position",
        "",
        "isDetailedView",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onCardClick",
        "PurchaseInformationCardView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;LY/m;II)V",
        "",
        "getSubtitle",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;",
        "Lcom/revenuecat/purchases/Store;",
        "store",
        "getStoreText",
        "(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;",
        "getPrice",
        "details",
        "PurchaseInformationCardView_Preview",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V",
        "PurchaseInformationCardView_Preview_Scale2",
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
.method public static final PurchaseInformationCardView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;LY/m;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Landroidx/compose/ui/e;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;",
            "Z",
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
    move-object/from16 v6, p5

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    const-string v0, "purchaseInformation"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "localization"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x60ce0ca

    .line 20
    .line 21
    .line 22
    move-object/from16 v3, p6

    .line 23
    .line 24
    invoke-interface {v3, v0}, LY/m;->g(I)LY/m;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    and-int/lit8 v4, p8, 0x1

    .line 29
    .line 30
    const/4 v8, 0x2

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    or-int/lit8 v4, v7, 0x6

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    and-int/lit8 v4, v7, 0x6

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v3, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v4, v8

    .line 49
    :goto_0
    or-int/2addr v4, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v4, v7

    .line 52
    :goto_1
    and-int/lit8 v9, p8, 0x2

    .line 53
    .line 54
    if-eqz v9, :cond_3

    .line 55
    .line 56
    or-int/lit8 v4, v4, 0x30

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    and-int/lit8 v9, v7, 0x30

    .line 60
    .line 61
    if-nez v9, :cond_5

    .line 62
    .line 63
    invoke-interface {v3, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    const/16 v9, 0x20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/16 v9, 0x10

    .line 73
    .line 74
    :goto_2
    or-int/2addr v4, v9

    .line 75
    :cond_5
    :goto_3
    and-int/lit8 v9, p8, 0x4

    .line 76
    .line 77
    if-eqz v9, :cond_7

    .line 78
    .line 79
    or-int/lit16 v4, v4, 0x180

    .line 80
    .line 81
    :cond_6
    move-object/from16 v10, p2

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_7
    and-int/lit16 v10, v7, 0x180

    .line 85
    .line 86
    if-nez v10, :cond_6

    .line 87
    .line 88
    move-object/from16 v10, p2

    .line 89
    .line 90
    invoke-interface {v3, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_8

    .line 95
    .line 96
    const/16 v11, 0x100

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    const/16 v11, 0x80

    .line 100
    .line 101
    :goto_4
    or-int/2addr v4, v11

    .line 102
    :goto_5
    and-int/lit8 v11, p8, 0x8

    .line 103
    .line 104
    if-eqz v11, :cond_a

    .line 105
    .line 106
    or-int/lit16 v4, v4, 0xc00

    .line 107
    .line 108
    :cond_9
    move-object/from16 v12, p3

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_a
    and-int/lit16 v12, v7, 0xc00

    .line 112
    .line 113
    if-nez v12, :cond_9

    .line 114
    .line 115
    move-object/from16 v12, p3

    .line 116
    .line 117
    invoke-interface {v3, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-eqz v13, :cond_b

    .line 122
    .line 123
    const/16 v13, 0x800

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_b
    const/16 v13, 0x400

    .line 127
    .line 128
    :goto_6
    or-int/2addr v4, v13

    .line 129
    :goto_7
    and-int/lit8 v13, p8, 0x10

    .line 130
    .line 131
    if-eqz v13, :cond_d

    .line 132
    .line 133
    or-int/lit16 v4, v4, 0x6000

    .line 134
    .line 135
    :cond_c
    move/from16 v14, p4

    .line 136
    .line 137
    goto :goto_9

    .line 138
    :cond_d
    and-int/lit16 v14, v7, 0x6000

    .line 139
    .line 140
    if-nez v14, :cond_c

    .line 141
    .line 142
    move/from16 v14, p4

    .line 143
    .line 144
    invoke-interface {v3, v14}, LY/m;->a(Z)Z

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    if-eqz v15, :cond_e

    .line 149
    .line 150
    const/16 v15, 0x4000

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_e
    const/16 v15, 0x2000

    .line 154
    .line 155
    :goto_8
    or-int/2addr v4, v15

    .line 156
    :goto_9
    and-int/lit8 v15, p8, 0x20

    .line 157
    .line 158
    const/high16 v16, 0x30000

    .line 159
    .line 160
    if-eqz v15, :cond_f

    .line 161
    .line 162
    or-int v4, v4, v16

    .line 163
    .line 164
    goto :goto_b

    .line 165
    :cond_f
    and-int v15, v7, v16

    .line 166
    .line 167
    if-nez v15, :cond_11

    .line 168
    .line 169
    invoke-interface {v3, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-eqz v15, :cond_10

    .line 174
    .line 175
    const/high16 v15, 0x20000

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_10
    const/high16 v15, 0x10000

    .line 179
    .line 180
    :goto_a
    or-int/2addr v4, v15

    .line 181
    :cond_11
    :goto_b
    const v15, 0x12493

    .line 182
    .line 183
    .line 184
    and-int/2addr v15, v4

    .line 185
    const v5, 0x12492

    .line 186
    .line 187
    .line 188
    if-ne v15, v5, :cond_13

    .line 189
    .line 190
    invoke-interface {v3}, LY/m;->i()Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_12

    .line 195
    .line 196
    goto :goto_c

    .line 197
    :cond_12
    invoke-interface {v3}, LY/m;->K()V

    .line 198
    .line 199
    .line 200
    move-object/from16 v18, v3

    .line 201
    .line 202
    move-object v3, v10

    .line 203
    move-object v4, v12

    .line 204
    move v5, v14

    .line 205
    goto/16 :goto_10

    .line 206
    .line 207
    :cond_13
    :goto_c
    if-eqz v9, :cond_14

    .line 208
    .line 209
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 210
    .line 211
    move-object v10, v5

    .line 212
    :cond_14
    if-eqz v11, :cond_15

    .line 213
    .line 214
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->SINGLE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 215
    .line 216
    goto :goto_d

    .line 217
    :cond_15
    move-object v5, v12

    .line 218
    :goto_d
    if-eqz v13, :cond_16

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    goto :goto_e

    .line 222
    :cond_16
    move v9, v14

    .line 223
    :goto_e
    invoke-static {}, LY/w;->L()Z

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-eqz v11, :cond_17

    .line 228
    .line 229
    const/4 v11, -0x1

    .line 230
    const-string v12, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView (PurchaseInformationCardView.kt:43)"

    .line 231
    .line 232
    invoke-static {v0, v4, v11, v12}, LY/w;->U(IIILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_17
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    aget v0, v0, v11

    .line 242
    .line 243
    const/4 v11, 0x1

    .line 244
    if-eq v0, v11, :cond_1b

    .line 245
    .line 246
    if-eq v0, v8, :cond_1a

    .line 247
    .line 248
    const/4 v12, 0x3

    .line 249
    if-eq v0, v12, :cond_19

    .line 250
    .line 251
    const/4 v12, 0x4

    .line 252
    if-ne v0, v12, :cond_18

    .line 253
    .line 254
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-static {v0}, LJ/i;->d(F)LJ/h;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    goto :goto_f

    .line 265
    :cond_18
    new-instance v0, LTd/r;

    .line 266
    .line 267
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_19
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-static {v12, v13, v0, v14}, LJ/i;->e(FFFF)LJ/h;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    goto :goto_f

    .line 294
    :cond_1a
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 295
    .line 296
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getMIDDLE_CORNER_SIZE-D9Ej5fM()F

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-static {v12, v13, v0, v14}, LJ/i;->e(FFFF)LJ/h;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    goto :goto_f

    .line 317
    :cond_1b
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 318
    .line 319
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {v0}, LJ/i;->d(F)LJ/h;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    :goto_f
    sget-object v12, LU/D;->a:LU/D;

    .line 328
    .line 329
    sget v13, LU/D;->b:I

    .line 330
    .line 331
    invoke-virtual {v12, v3, v13}, LU/D;->a(LY/m;I)LU/l;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    int-to-float v8, v8

    .line 336
    invoke-static {v8}, Li1/h;->n(F)F

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    invoke-static {v14, v8}, LU/m;->k(LU/l;F)J

    .line 341
    .line 342
    .line 343
    move-result-wide v14

    .line 344
    invoke-virtual {v12, v3, v13}, LU/D;->a(LY/m;I)LU/l;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-virtual {v8}, LU/l;->w()J

    .line 349
    .line 350
    .line 351
    move-result-wide v12

    .line 352
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;

    .line 353
    .line 354
    invoke-direct {v8, v6, v1, v2, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$1;-><init>(Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Z)V

    .line 355
    .line 356
    .line 357
    move-object/from16 p2, v0

    .line 358
    .line 359
    const/16 v0, 0x36

    .line 360
    .line 361
    const v1, -0x3cb022f

    .line 362
    .line 363
    .line 364
    invoke-static {v1, v11, v8, v3, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 365
    .line 366
    .line 367
    move-result-object v17

    .line 368
    shr-int/lit8 v0, v4, 0x6

    .line 369
    .line 370
    and-int/lit8 v0, v0, 0xe

    .line 371
    .line 372
    const/high16 v1, 0xc00000

    .line 373
    .line 374
    or-int v19, v0, v1

    .line 375
    .line 376
    const/16 v20, 0x70

    .line 377
    .line 378
    move-object v8, v10

    .line 379
    move-wide v10, v14

    .line 380
    const/4 v14, 0x0

    .line 381
    const/4 v15, 0x0

    .line 382
    const/16 v16, 0x0

    .line 383
    .line 384
    move-object/from16 v18, v3

    .line 385
    .line 386
    move v0, v9

    .line 387
    move-object/from16 v9, p2

    .line 388
    .line 389
    invoke-static/range {v8 .. v20}, LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 390
    .line 391
    .line 392
    invoke-static {}, LY/w;->L()Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_1c

    .line 397
    .line 398
    invoke-static {}, LY/w;->T()V

    .line 399
    .line 400
    .line 401
    :cond_1c
    move-object v4, v5

    .line 402
    move-object v3, v8

    .line 403
    move v5, v0

    .line 404
    :goto_10
    invoke-interface/range {v18 .. v18}, LY/m;->k()LY/B1;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    if-eqz v9, :cond_1d

    .line 409
    .line 410
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$2;

    .line 411
    .line 412
    move-object/from16 v1, p0

    .line 413
    .line 414
    move/from16 v8, p8

    .line 415
    .line 416
    invoke-direct/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;II)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 420
    .line 421
    .line 422
    :cond_1d
    return-void
.end method

.method private static final PurchaseInformationCardView_Preview(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V
    .locals 4

    .line 1
    const v0, -0x671c29ec

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const/4 v2, -0x1

    .line 47
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview (PurchaseInformationCardView.kt:201)"

    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$1;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x36

    .line 58
    .line 59
    const v2, 0x319e8613

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-static {v2, v3, v0, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x6

    .line 68
    invoke-static {v0, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, LY/w;->L()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-static {}, LY/w;->T()V

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$2;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    return-void
.end method

.method private static final PurchaseInformationCardView_Preview_Scale2(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V
    .locals 4

    .line 1
    const v0, -0x5dfe1a5d

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const/4 v2, -0x1

    .line 47
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview_Scale2 (PurchaseInformationCardView.kt:218)"

    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$1;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x36

    .line 58
    .line 59
    const v2, 0xb0008c4

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-static {v2, v3, v0, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x6

    .line 68
    invoke-static {v0, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, LY/w;->L()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-static {}, LY/w;->T()V

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$2;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    return-void
.end method

.method public static final synthetic access$PurchaseInformationCardView_Preview(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->PurchaseInformationCardView_Preview(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PurchaseInformationCardView_Preview_Scale2(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->PurchaseInformationCardView_Preview_Scale2(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getStoreText(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->getStoreText(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getSubtitle(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->getSubtitle(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final getPrice(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getPricePaid()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getPricePaid()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;->getPrice()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;

    .line 21
    .line 22
    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->FREE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    new-instance p0, LTd/r;

    .line 46
    .line 47
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method private static final getStoreText(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, LTd/r;

    .line 13
    .line 14
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_0
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->TEST_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->UNKNOWN_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_2
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->WEB_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_3
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->CARD_STORE_PROMOTIONAL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_4
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->GALAXY_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_5
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->AMAZON_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_6
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->GOOGLE_PLAY_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_7
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->MAC_APP_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_8
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->APP_STORE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 43
    .line 44
    :goto_0
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final getSubtitle(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getExpirationOrRenewal()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getExpirationOrRenewal()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;->getDate()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->expirationString(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getExpirationOrRenewal()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;->getDate()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->renewalString(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->getPrice(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_2
    new-instance p0, LTd/r;

    .line 51
    .line 52
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0
.end method
