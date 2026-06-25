.class public final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a5\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0008\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\u000e\u001a\u00020\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2 \u0008\u0002\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u001bH\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!\u00b2\u0006\u000e\u0010\u001e\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;",
        "paywallDialogOptions",
        "LTd/L;",
        "PaywallDialog",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;LY/m;I)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
        "offeringSelection",
        "Lkotlin/Function1;",
        "onDismissRequest",
        "PaywallDialogContent",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V",
        "Lkotlin/Function0;",
        "handleCloseRequest",
        "content",
        "PaywallDialogScaffold",
        "(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V",
        "dismissRequest",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/Offering;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
        "dismissRequestWithExitOffering",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "buildPaywallOptions",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "",
        "getDialogMaxHeightPercentage",
        "(LY/m;I)F",
        "",
        "shouldUsePlatformDefaultWidth",
        "(LY/m;I)Z",
        "shouldDisplayDialog",
        "currentDialogOffering",
        "pendingExitOffering",
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
.method public static final PaywallDialog(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;LY/m;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "paywallDialogOptions"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v2, 0x69a0da47

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    and-int/lit8 v3, v1, 0x6

    .line 20
    .line 21
    const/4 v10, 0x4

    .line 22
    const/4 v11, 0x2

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v7, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    move v3, v10

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v11

    .line 34
    :goto_0
    or-int/2addr v3, v1

    .line 35
    move v12, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v12, v1

    .line 38
    :goto_1
    and-int/lit8 v3, v12, 0x3

    .line 39
    .line 40
    if-ne v3, v11, :cond_3

    .line 41
    .line 42
    invoke-interface {v7}, LY/m;->i()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-interface {v7}, LY/m;->K()V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    const/4 v3, -0x1

    .line 61
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialog (PaywallDialog.kt:48)"

    .line 62
    .line 63
    invoke-static {v2, v12, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getShouldDisplayBlock()Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    const/4 v2, 0x0

    .line 71
    new-array v3, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    const v4, 0x2cc8393f

    .line 74
    .line 75
    .line 76
    invoke-interface {v7, v4}, LY/m;->V(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v7, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    sget-object v4, LY/m;->a:LY/m$a;

    .line 90
    .line 91
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-ne v5, v4, :cond_6

    .line 96
    .line 97
    :cond_5
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1;

    .line 98
    .line 99
    invoke-direct {v5, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_6
    move-object v6, v5

    .line 106
    check-cast v6, Lie/a;

    .line 107
    .line 108
    invoke-interface {v7}, LY/m;->O()V

    .line 109
    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x6

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-static/range {v3 .. v9}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, LY/C0;

    .line 120
    .line 121
    const v4, 0x2cc84043

    .line 122
    .line 123
    .line 124
    invoke-interface {v7, v4}, LY/m;->V(I)V

    .line 125
    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    if-eqz v14, :cond_9

    .line 129
    .line 130
    const v5, 0x2cc849ce

    .line 131
    .line 132
    .line 133
    invoke-interface {v7, v5}, LY/m;->V(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v7, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-interface {v7, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    or-int/2addr v5, v6

    .line 145
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    if-nez v5, :cond_7

    .line 150
    .line 151
    sget-object v5, LY/m;->a:LY/m$a;

    .line 152
    .line 153
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    if-ne v6, v5, :cond_8

    .line 158
    .line 159
    :cond_7
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$1$1;

    .line 160
    .line 161
    invoke-direct {v6, v14, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$1$1;-><init>(Lkotlin/jvm/functions/Function1;LY/C0;LZd/e;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v7, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 168
    .line 169
    invoke-interface {v7}, LY/m;->O()V

    .line 170
    .line 171
    .line 172
    and-int/lit8 v5, v12, 0xe

    .line 173
    .line 174
    invoke-static {v0, v6, v7, v5}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 175
    .line 176
    .line 177
    :cond_9
    invoke-interface {v7}, LY/m;->O()V

    .line 178
    .line 179
    .line 180
    const v5, 0x2cc85eae

    .line 181
    .line 182
    .line 183
    invoke-interface {v7, v5}, LY/m;->V(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    sget-object v6, LY/m;->a:LY/m$a;

    .line 191
    .line 192
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    if-ne v5, v8, :cond_b

    .line 197
    .line 198
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$1(LY/C0;)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_a

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getOfferingSelection$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    goto :goto_3

    .line 209
    :cond_a
    move-object v5, v4

    .line 210
    :goto_3
    invoke-static {v5, v4, v11, v4}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_b
    check-cast v5, LY/C0;

    .line 218
    .line 219
    invoke-interface {v7}, LY/m;->O()V

    .line 220
    .line 221
    .line 222
    const v8, 0x2cc875e6

    .line 223
    .line 224
    .line 225
    invoke-interface {v7, v8}, LY/m;->V(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    if-ne v8, v9, :cond_c

    .line 237
    .line 238
    invoke-static {v4, v4, v11, v4}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-interface {v7, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_c
    move-object/from16 v17, v8

    .line 246
    .line 247
    check-cast v17, LY/C0;

    .line 248
    .line 249
    invoke-interface {v7}, LY/m;->O()V

    .line 250
    .line 251
    .line 252
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$1(LY/C0;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    const v9, 0x2cc88231

    .line 261
    .line 262
    .line 263
    invoke-interface {v7, v9}, LY/m;->V(I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v7, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    and-int/lit8 v11, v12, 0xe

    .line 271
    .line 272
    const/4 v12, 0x1

    .line 273
    if-ne v11, v10, :cond_d

    .line 274
    .line 275
    move v13, v12

    .line 276
    goto :goto_4

    .line 277
    :cond_d
    move v13, v2

    .line 278
    :goto_4
    or-int/2addr v9, v13

    .line 279
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v13

    .line 283
    if-nez v9, :cond_e

    .line 284
    .line 285
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    if-ne v13, v9, :cond_f

    .line 290
    .line 291
    :cond_e
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$2$1;

    .line 292
    .line 293
    invoke-direct {v13, v0, v3, v5, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;LY/C0;LY/C0;LZd/e;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v7, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_f
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 300
    .line 301
    invoke-interface {v7}, LY/m;->O()V

    .line 302
    .line 303
    .line 304
    invoke-static {v8, v13, v7, v2}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 305
    .line 306
    .line 307
    const v4, 0x2cc89ad7

    .line 308
    .line 309
    .line 310
    invoke-interface {v7, v4}, LY/m;->V(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v7, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-ne v11, v10, :cond_10

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_10
    move v12, v2

    .line 321
    :goto_5
    or-int/2addr v4, v12

    .line 322
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    if-nez v4, :cond_11

    .line 327
    .line 328
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    if-ne v8, v4, :cond_12

    .line 333
    .line 334
    :cond_11
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$dismissDialog$1$1;

    .line 335
    .line 336
    invoke-direct {v8, v0, v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$dismissDialog$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;LY/C0;LY/C0;)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v7, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_12
    move-object v15, v8

    .line 343
    check-cast v15, Lie/a;

    .line 344
    .line 345
    invoke-interface {v7}, LY/m;->O()V

    .line 346
    .line 347
    .line 348
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$5(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-static/range {v17 .. v17}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$8(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    const v8, 0x2cc8c40c

    .line 357
    .line 358
    .line 359
    invoke-interface {v7, v8}, LY/m;->V(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v7, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    invoke-interface {v7, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    or-int/2addr v8, v9

    .line 371
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    if-nez v8, :cond_14

    .line 376
    .line 377
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    if-ne v9, v8, :cond_13

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_13
    move-object/from16 v8, v17

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_14
    :goto_6
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$3$1;

    .line 388
    .line 389
    const/16 v18, 0x0

    .line 390
    .line 391
    move-object/from16 v16, v5

    .line 392
    .line 393
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$3$1;-><init>(Lkotlin/jvm/functions/Function1;Lie/a;LY/C0;LY/C0;LZd/e;)V

    .line 394
    .line 395
    .line 396
    move-object/from16 v8, v17

    .line 397
    .line 398
    invoke-interface {v7, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    move-object v9, v13

    .line 402
    :goto_7
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 403
    .line 404
    invoke-interface {v7}, LY/m;->O()V

    .line 405
    .line 406
    .line 407
    invoke-static {v3, v4, v9, v7, v2}, LY/b0;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 408
    .line 409
    .line 410
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$5(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-nez v2, :cond_15

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_15
    const v3, 0x2a9746d2

    .line 418
    .line 419
    .line 420
    invoke-interface {v7, v3}, LY/m;->V(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v7, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    if-nez v3, :cond_16

    .line 432
    .line 433
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    if-ne v4, v3, :cond_17

    .line 438
    .line 439
    :cond_16
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$4$1$1;

    .line 440
    .line 441
    invoke-direct {v4, v15, v8, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$4$1$1;-><init>(Lie/a;LY/C0;LY/C0;)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v7, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_17
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 448
    .line 449
    invoke-interface {v7}, LY/m;->O()V

    .line 450
    .line 451
    .line 452
    invoke-static {v0, v2, v4, v7, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialogContent(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 453
    .line 454
    .line 455
    :goto_8
    invoke-static {}, LY/w;->L()Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-eqz v2, :cond_18

    .line 460
    .line 461
    invoke-static {}, LY/w;->T()V

    .line 462
    .line 463
    .line 464
    :cond_18
    :goto_9
    invoke-interface {v7}, LY/m;->k()LY/B1;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    if-eqz v2, :cond_19

    .line 469
    .line 470
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$5;

    .line 471
    .line 472
    invoke-direct {v3, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialog$5;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v2, v3}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 476
    .line 477
    .line 478
    :cond_19
    return-void
.end method

.method private static final PaywallDialog$lambda$1(LY/C0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final PaywallDialog$lambda$2(LY/C0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final PaywallDialog$lambda$5(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final PaywallDialog$lambda$6(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final PaywallDialog$lambda$8(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final PaywallDialog$lambda$9(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final PaywallDialogContent(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
            "Lkotlin/jvm/functions/Function1;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0xcf001cd

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    :goto_0
    or-int/2addr v1, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p4

    .line 25
    :goto_1
    and-int/lit8 v3, p4, 0x30

    .line 26
    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    invoke-interface {p3, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    move v3, v4

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v3, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v1, v3

    .line 42
    :cond_3
    and-int/lit16 v3, p4, 0x180

    .line 43
    .line 44
    if-nez v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p3, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_4

    .line 51
    .line 52
    const/16 v3, 0x100

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/16 v3, 0x80

    .line 56
    .line 57
    :goto_3
    or-int/2addr v1, v3

    .line 58
    :cond_5
    and-int/lit16 v3, v1, 0x93

    .line 59
    .line 60
    const/16 v5, 0x92

    .line 61
    .line 62
    if-ne v3, v5, :cond_7

    .line 63
    .line 64
    invoke-interface {p3}, LY/m;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    invoke-interface {p3}, LY/m;->K()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_8

    .line 81
    .line 82
    const/4 v3, -0x1

    .line 83
    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogContent (PaywallDialog.kt:117)"

    .line 84
    .line 85
    invoke-static {v0, v1, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_8
    const v0, -0x37369ee7

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, v0}, LY/m;->V(I)V

    .line 92
    .line 93
    .line 94
    and-int/lit8 v0, v1, 0xe

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    const/4 v5, 0x0

    .line 98
    if-ne v0, v2, :cond_9

    .line 99
    .line 100
    move v0, v3

    .line 101
    goto :goto_5

    .line 102
    :cond_9
    move v0, v5

    .line 103
    :goto_5
    and-int/lit8 v1, v1, 0x70

    .line 104
    .line 105
    if-ne v1, v4, :cond_a

    .line 106
    .line 107
    move v1, v3

    .line 108
    goto :goto_6

    .line 109
    :cond_a
    move v1, v5

    .line 110
    :goto_6
    or-int/2addr v0, v1

    .line 111
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-nez v0, :cond_b

    .line 116
    .line 117
    sget-object v0, LY/m;->a:LY/m$a;

    .line 118
    .line 119
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-ne v1, v0, :cond_c

    .line 124
    .line 125
    :cond_b
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$paywallOptions$1$1;

    .line 126
    .line 127
    invoke-direct {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$paywallOptions$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2;

    .line 131
    .line 132
    invoke-direct {v1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p0, p1, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->buildPaywallOptions(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {p3, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_c
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 143
    .line 144
    invoke-interface {p3}, LY/m;->O()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getShouldDisplayBlock()Lkotlin/jvm/functions/Function1;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v1, v0, p3, v5, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->getPaywallViewModel(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lkotlin/jvm/functions/Function1;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v2, LTd/L;->a:LTd/L;

    .line 156
    .line 157
    const v4, -0x373653e9

    .line 158
    .line 159
    .line 160
    invoke-interface {p3, v4}, LY/m;->V(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    if-nez v4, :cond_d

    .line 172
    .line 173
    sget-object v4, LY/m;->a:LY/m$a;

    .line 174
    .line 175
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-ne v5, v4, :cond_e

    .line 180
    .line 181
    :cond_d
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$1$1;

    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    invoke-direct {v5, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LZd/e;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p3, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_e
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 191
    .line 192
    invoke-interface {p3}, LY/m;->O()V

    .line 193
    .line 194
    .line 195
    const/4 v4, 0x6

    .line 196
    invoke-static {v2, v5, p3, v4}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 197
    .line 198
    .line 199
    const v2, -0x373646e1

    .line 200
    .line 201
    .line 202
    invoke-interface {p3, v2}, LY/m;->V(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    if-nez v2, :cond_f

    .line 214
    .line 215
    sget-object v2, LY/m;->a:LY/m$a;

    .line 216
    .line 217
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-ne v4, v2, :cond_10

    .line 222
    .line 223
    :cond_f
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$2$1;

    .line 224
    .line 225
    invoke-direct {v4, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$2$1;-><init>(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {p3, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_10
    check-cast v4, Lie/a;

    .line 232
    .line 233
    invoke-interface {p3}, LY/m;->O()V

    .line 234
    .line 235
    .line 236
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$3;

    .line 237
    .line 238
    invoke-direct {v2, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;)V

    .line 239
    .line 240
    .line 241
    const/16 v0, 0x36

    .line 242
    .line 243
    const v1, -0x4c54e58f

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v3, v2, p3, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const/16 v1, 0x30

    .line 251
    .line 252
    invoke-static {v4, v0, p3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialogScaffold(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 253
    .line 254
    .line 255
    invoke-static {}, LY/w;->L()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_11

    .line 260
    .line 261
    invoke-static {}, LY/w;->T()V

    .line 262
    .line 263
    .line 264
    :cond_11
    :goto_7
    invoke-interface {p3}, LY/m;->k()LY/B1;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    if-eqz p3, :cond_12

    .line 269
    .line 270
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$4;

    .line 271
    .line 272
    invoke-direct {v0, p0, p1, p2, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogContent$4;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;I)V

    .line 273
    .line 274
    .line 275
    invoke-interface {p3, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 276
    .line 277
    .line 278
    :cond_12
    return-void
.end method

.method private static final PaywallDialogScaffold(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move/from16 v7, p3

    .line 6
    .line 7
    const v1, 0xf3e3e25

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    and-int/lit8 v2, v7, 0x6

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v7

    .line 32
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    invoke-interface {v3, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v4, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v2, v4

    .line 48
    :cond_3
    and-int/lit8 v4, v2, 0x13

    .line 49
    .line 50
    const/16 v5, 0x12

    .line 51
    .line 52
    if-ne v4, v5, :cond_5

    .line 53
    .line 54
    invoke-interface {v3}, LY/m;->i()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v3}, LY/m;->K()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    const/4 v4, -0x1

    .line 73
    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold (PaywallDialog.kt:149)"

    .line 74
    .line 75
    invoke-static {v1, v2, v4, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    const v1, 0x783a2267

    .line 79
    .line 80
    .line 81
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 82
    .line 83
    .line 84
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v4, 0x22

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    if-le v1, v4, :cond_7

    .line 90
    .line 91
    sget-object v8, LC/P;->a:LC/P$a;

    .line 92
    .line 93
    const/4 v9, 0x6

    .line 94
    invoke-static {v8, v3, v9}, LC/X;->b(LC/P$a;LY/m;I)LC/P;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-static {v10, v3, v5}, LC/S;->b(LC/P;LY/m;I)LC/A;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-interface {v10}, LC/A;->c()F

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    invoke-static {v8, v3, v9}, LC/X;->d(LC/P$a;LY/m;I)LC/P;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-static {v8, v3, v5}, LC/S;->b(LC/P;LY/m;I)LC/A;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-interface {v8}, LC/A;->d()F

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    add-float/2addr v10, v8

    .line 119
    invoke-static {v10}, Li1/h;->n(F)F

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    goto :goto_4

    .line 124
    :cond_7
    int-to-float v8, v5

    .line 125
    invoke-static {v8}, Li1/h;->n(F)F

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    :goto_4
    invoke-interface {v3}, LY/m;->O()V

    .line 130
    .line 131
    .line 132
    shl-int/lit8 v9, v2, 0x3

    .line 133
    .line 134
    and-int/lit8 v9, v9, 0x70

    .line 135
    .line 136
    const/4 v10, 0x1

    .line 137
    invoke-static {v5, v0, v3, v9, v10}, Le/a;->a(ZLie/a;LY/m;II)V

    .line 138
    .line 139
    .line 140
    new-instance v11, Landroidx/compose/ui/window/k;

    .line 141
    .line 142
    invoke-static {v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->shouldUsePlatformDefaultWidth(LY/m;I)Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-gt v1, v4, :cond_8

    .line 147
    .line 148
    move/from16 v16, v10

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_8
    move/from16 v16, v5

    .line 152
    .line 153
    :goto_5
    const/16 v17, 0x7

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const/4 v12, 0x0

    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    invoke-direct/range {v11 .. v18}, Landroidx/compose/ui/window/k;-><init>(ZZLandroidx/compose/ui/window/u;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 161
    .line 162
    .line 163
    move-object v1, v11

    .line 164
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;

    .line 165
    .line 166
    invoke-direct {v4, v8, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;-><init>(FLkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    const/16 v5, 0x36

    .line 170
    .line 171
    const v8, 0x1ec15bbc

    .line 172
    .line 173
    .line 174
    invoke-static {v8, v10, v4, v3, v5}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    and-int/lit8 v2, v2, 0xe

    .line 179
    .line 180
    or-int/lit16 v2, v2, 0x180

    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    move-object/from16 v19, v4

    .line 184
    .line 185
    move v4, v2

    .line 186
    move-object/from16 v2, v19

    .line 187
    .line 188
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/window/a;->a(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 189
    .line 190
    .line 191
    invoke-static {}, LY/w;->L()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    invoke-static {}, LY/w;->T()V

    .line 198
    .line 199
    .line 200
    :cond_9
    :goto_6
    invoke-interface {v3}, LY/m;->k()LY/B1;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eqz v1, :cond_a

    .line 205
    .line 206
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$2;

    .line 207
    .line 208
    invoke-direct {v2, v0, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$2;-><init>(Lie/a;Lkotlin/jvm/functions/Function2;I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    :cond_a
    return-void
.end method

.method public static final synthetic access$PaywallDialog$lambda$1(LY/C0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$1(LY/C0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$PaywallDialog$lambda$2(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$2(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PaywallDialog$lambda$5(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$5(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$PaywallDialog$lambda$6(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$6(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PaywallDialog$lambda$8(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$8(LY/C0;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$PaywallDialog$lambda$9(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialog$lambda$9(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PaywallDialogContent(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialogContent(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$PaywallDialogScaffold(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialogScaffold(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getDialogMaxHeightPercentage(LY/m;I)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->getDialogMaxHeightPercentage(LY/m;I)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final buildPaywallOptions(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
            "Lie/a;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setOfferingSelection$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getShouldDisplayDismissButton()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setShouldDisplayDismissButton(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getFontProvider()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getListener()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setListener(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getPurchaseLogic()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setPurchaseLogic(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;->getCustomVariables()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->setCustomVariables(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method static synthetic buildPaywallOptions$default(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x8

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->buildPaywallOptions(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final getDialogMaxHeightPercentage(LY/m;I)F
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.getDialogMaxHeightPercentage (PaywallDialog.kt:211)"

    .line 9
    .line 10
    const v2, -0x5db06272

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->windowAspectRatio(LY/m;I)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/high16 v1, 0x3fa00000    # 1.25f

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    const/high16 v1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    invoke-static {}, LY/w;->L()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {}, LY/w;->T()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return v1

    .line 39
    :cond_2
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->hasCompactDimension(LY/m;I)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const v1, 0x3f59999a    # 0.85f

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    invoke-static {}, LY/w;->T()V

    .line 56
    .line 57
    .line 58
    :cond_4
    return v1
.end method

.method private static final shouldUsePlatformDefaultWidth(LY/m;I)Z
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.shouldUsePlatformDefaultWidth (PaywallDialog.kt:220)"

    .line 9
    .line 10
    const v2, 0x7c22d56b

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->hasCompactDimension(LY/m;I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    xor-int/lit8 p0, p0, 0x1

    .line 22
    .line 23
    invoke-static {}, LY/w;->L()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-static {}, LY/w;->T()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return p0
.end method
