.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a*\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#\u00b2\u0006\u000c\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010!\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\"\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lcom/revenuecat/purchases/storage/FileRepository;",
        "repository",
        "LTd/L;",
        "VideoComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;II)V",
        "Lr0/h;",
        "",
        "viewportWidth",
        "viewportHeight",
        "",
        "isVisibleInViewport",
        "(Lr0/h;II)Z",
        "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;",
        "videoUrls",
        "Ljava/net/URI;",
        "rememberVideoContentState",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;I)Ljava/net/URI;",
        "resolveVideoUrl",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;)Ljava/net/URI;",
        "Ljava/net/URL;",
        "url",
        "Lcom/revenuecat/purchases/models/Checksum;",
        "checksum",
        "cacheVideo",
        "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)Ljava/lang/Object;",
        "Ls0/E1;",
        "composeShape",
        "isVisible",
        "videoReady",
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
.method public static final synthetic VideoComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;II)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p5

    .line 6
    .line 7
    const-string v3, "style"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "state"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, 0x2831de5a

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p4

    .line 21
    .line 22
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v12

    .line 26
    and-int/lit8 v4, p6, 0x1

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    or-int/lit8 v4, v0, 0x6

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    and-int/lit8 v4, v0, 0x6

    .line 34
    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    invoke-interface {v12, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v4, 0x2

    .line 46
    :goto_0
    or-int/2addr v4, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v4, v0

    .line 49
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v6, v0, 0x30

    .line 57
    .line 58
    if-nez v6, :cond_5

    .line 59
    .line 60
    invoke-interface {v12, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    const/16 v6, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    const/16 v6, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v4, v6

    .line 72
    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    .line 73
    .line 74
    if-eqz v6, :cond_7

    .line 75
    .line 76
    or-int/lit16 v4, v4, 0x180

    .line 77
    .line 78
    :cond_6
    move-object/from16 v7, p2

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    and-int/lit16 v7, v0, 0x180

    .line 82
    .line 83
    if-nez v7, :cond_6

    .line 84
    .line 85
    move-object/from16 v7, p2

    .line 86
    .line 87
    invoke-interface {v12, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_8

    .line 92
    .line 93
    const/16 v8, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    const/16 v8, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v4, v8

    .line 99
    :goto_5
    and-int/lit16 v8, v0, 0xc00

    .line 100
    .line 101
    if-nez v8, :cond_b

    .line 102
    .line 103
    and-int/lit8 v8, p6, 0x8

    .line 104
    .line 105
    if-nez v8, :cond_9

    .line 106
    .line 107
    move-object/from16 v8, p3

    .line 108
    .line 109
    invoke-interface {v12, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eqz v9, :cond_a

    .line 114
    .line 115
    const/16 v9, 0x800

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_9
    move-object/from16 v8, p3

    .line 119
    .line 120
    :cond_a
    const/16 v9, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v4, v9

    .line 123
    goto :goto_7

    .line 124
    :cond_b
    move-object/from16 v8, p3

    .line 125
    .line 126
    :goto_7
    and-int/lit16 v9, v4, 0x493

    .line 127
    .line 128
    const/16 v10, 0x492

    .line 129
    .line 130
    if-ne v9, v10, :cond_d

    .line 131
    .line 132
    invoke-interface {v12}, LY/m;->i()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_c

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_c
    invoke-interface {v12}, LY/m;->K()V

    .line 140
    .line 141
    .line 142
    move-object v3, v7

    .line 143
    move-object v4, v8

    .line 144
    goto/16 :goto_17

    .line 145
    .line 146
    :cond_d
    :goto_8
    invoke-interface {v12}, LY/m;->G()V

    .line 147
    .line 148
    .line 149
    and-int/lit8 v9, v0, 0x1

    .line 150
    .line 151
    if-eqz v9, :cond_10

    .line 152
    .line 153
    invoke-interface {v12}, LY/m;->N()Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_e

    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_e
    invoke-interface {v12}, LY/m;->K()V

    .line 161
    .line 162
    .line 163
    and-int/lit8 v6, p6, 0x8

    .line 164
    .line 165
    if-eqz v6, :cond_f

    .line 166
    .line 167
    and-int/lit16 v4, v4, -0x1c01

    .line 168
    .line 169
    :cond_f
    move v6, v4

    .line 170
    move-object v13, v7

    .line 171
    :goto_9
    move-object v4, v8

    .line 172
    goto :goto_c

    .line 173
    :cond_10
    :goto_a
    if-eqz v6, :cond_11

    .line 174
    .line 175
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 176
    .line 177
    goto :goto_b

    .line 178
    :cond_11
    move-object v6, v7

    .line 179
    :goto_b
    and-int/lit8 v7, p6, 0x8

    .line 180
    .line 181
    if-eqz v7, :cond_12

    .line 182
    .line 183
    sget-object v7, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 184
    .line 185
    invoke-virtual {v7}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual {v7}, Lcom/revenuecat/purchases/Purchases;->getFileRepository()Lcom/revenuecat/purchases/storage/FileRepository;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    and-int/lit16 v4, v4, -0x1c01

    .line 194
    .line 195
    move-object v13, v6

    .line 196
    move v6, v4

    .line 197
    move-object v4, v7

    .line 198
    goto :goto_c

    .line 199
    :cond_12
    move-object v13, v6

    .line 200
    move v6, v4

    .line 201
    goto :goto_9

    .line 202
    :goto_c
    invoke-interface {v12}, LY/m;->y()V

    .line 203
    .line 204
    .line 205
    invoke-static {}, LY/w;->L()Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_13

    .line 210
    .line 211
    const/4 v7, -0x1

    .line 212
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentView (VideoComponentView.kt:51)"

    .line 213
    .line 214
    invoke-static {v3, v6, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_13
    and-int/lit8 v3, v6, 0x70

    .line 218
    .line 219
    and-int/lit8 v7, v6, 0x7e

    .line 220
    .line 221
    invoke-static {v1, v2, v12, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentStateKt;->rememberUpdatedVideoComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getVisible()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_2e

    .line 230
    .line 231
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    const v9, -0x7bcd5ca8

    .line 236
    .line 237
    .line 238
    invoke-interface {v12, v9}, LY/m;->V(I)V

    .line 239
    .line 240
    .line 241
    const/4 v9, 0x0

    .line 242
    const/4 v10, 0x0

    .line 243
    if-nez v8, :cond_14

    .line 244
    .line 245
    move-object v8, v10

    .line 246
    goto :goto_d

    .line 247
    :cond_14
    invoke-static {v8, v12, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    :goto_d
    invoke-interface {v12}, LY/m;->O()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getBorder()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    const v14, -0x7bcd54ef

    .line 259
    .line 260
    .line 261
    invoke-interface {v12, v14}, LY/m;->V(I)V

    .line 262
    .line 263
    .line 264
    if-nez v11, :cond_15

    .line 265
    .line 266
    move-object v11, v10

    .line 267
    goto :goto_e

    .line 268
    :cond_15
    invoke-static {v11, v12, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;->rememberBorderStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    :goto_e
    invoke-interface {v12}, LY/m;->O()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getShadow()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    const v15, -0x7bcd4a2f

    .line 280
    .line 281
    .line 282
    invoke-interface {v12, v15}, LY/m;->V(I)V

    .line 283
    .line 284
    .line 285
    if-nez v14, :cond_16

    .line 286
    .line 287
    move-object v14, v10

    .line 288
    goto :goto_f

    .line 289
    :cond_16
    invoke-static {v14, v12, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyleKt;->rememberShadowStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    :goto_f
    invoke-interface {v12}, LY/m;->O()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getShape()Ls0/E1;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    const v9, -0x7bcd4163

    .line 301
    .line 302
    .line 303
    invoke-interface {v12, v9}, LY/m;->V(I)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v12, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    if-nez v9, :cond_17

    .line 315
    .line 316
    sget-object v9, LY/m;->a:LY/m$a;

    .line 317
    .line 318
    invoke-virtual {v9}, LY/m$a;->a()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    if-ne v15, v9, :cond_18

    .line 323
    .line 324
    :cond_17
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$composeShape$2$1;

    .line 325
    .line 326
    invoke-direct {v9, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$composeShape$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v9}, LY/U1;->d(Lie/a;)LY/h2;

    .line 330
    .line 331
    .line 332
    move-result-object v15

    .line 333
    invoke-interface {v12, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    :cond_18
    move-object v9, v15

    .line 337
    check-cast v9, LY/h2;

    .line 338
    .line 339
    invoke-interface {v12}, LY/m;->O()V

    .line 340
    .line 341
    .line 342
    const v15, -0x7bcd33b5

    .line 343
    .line 344
    .line 345
    invoke-interface {v12, v15}, LY/m;->V(I)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v15

    .line 352
    sget-object v19, LY/m;->a:LY/m$a;

    .line 353
    .line 354
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    if-ne v15, v5, :cond_19

    .line 359
    .line 360
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 361
    .line 362
    const/4 v15, 0x2

    .line 363
    invoke-static {v5, v10, v15, v10}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-interface {v12, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    move-object v15, v5

    .line 371
    :cond_19
    move-object v5, v15

    .line 372
    check-cast v5, LY/C0;

    .line 373
    .line 374
    invoke-interface {v12}, LY/m;->O()V

    .line 375
    .line 376
    .line 377
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$5(LY/C0;)Z

    .line 378
    .line 379
    .line 380
    move-result v15

    .line 381
    const v10, -0x7bcd2c0a

    .line 382
    .line 383
    .line 384
    invoke-interface {v12, v10}, LY/m;->V(I)V

    .line 385
    .line 386
    .line 387
    invoke-interface {v12, v15}, LY/m;->a(Z)Z

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v15

    .line 395
    if-nez v10, :cond_1b

    .line 396
    .line 397
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    if-ne v15, v10, :cond_1a

    .line 402
    .line 403
    goto :goto_10

    .line 404
    :cond_1a
    const/4 v0, 0x0

    .line 405
    goto :goto_11

    .line 406
    :cond_1b
    :goto_10
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 407
    .line 408
    const/4 v0, 0x0

    .line 409
    const/4 v15, 0x2

    .line 410
    invoke-static {v10, v0, v15, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    invoke-interface {v12, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :goto_11
    move-object v10, v15

    .line 418
    check-cast v10, LY/C0;

    .line 419
    .line 420
    invoke-interface {v12}, LY/m;->O()V

    .line 421
    .line 422
    .line 423
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->k()LY/b1;

    .line 424
    .line 425
    .line 426
    move-result-object v15

    .line 427
    invoke-interface {v12, v15}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v15

    .line 431
    check-cast v15, Landroid/view/View;

    .line 432
    .line 433
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getFallbackSources()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    const v1, -0x7bcd11f1

    .line 438
    .line 439
    .line 440
    invoke-interface {v12, v1}, LY/m;->V(I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v12, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    if-nez v0, :cond_1c

    .line 452
    .line 453
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    if-ne v1, v0, :cond_1e

    .line 458
    .line 459
    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getFallbackSources()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 460
    .line 461
    .line 462
    move-result-object v21

    .line 463
    if-eqz v21, :cond_1d

    .line 464
    .line 465
    new-instance v20, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;

    .line 466
    .line 467
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getVisible()Z

    .line 468
    .line 469
    .line 470
    move-result v22

    .line 471
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 472
    .line 473
    .line 474
    move-result-object v23

    .line 475
    const/4 v0, 0x0

    .line 476
    int-to-float v1, v0

    .line 477
    invoke-static {v1}, Li1/h;->n(F)F

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-static {v0}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    .line 482
    .line 483
    .line 484
    move-result-object v24

    .line 485
    invoke-static {v1}, Li1/h;->n(F)F

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    invoke-static {v0}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    .line 490
    .line 491
    .line 492
    move-result-object v25

    .line 493
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 494
    .line 495
    .line 496
    move-result-object v29

    .line 497
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getContentScale()LI0/f;

    .line 498
    .line 499
    .line 500
    move-result-object v30

    .line 501
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 502
    .line 503
    .line 504
    move-result-object v31

    .line 505
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getTabIndex()Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v33

    .line 509
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v35

    .line 513
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getIgnoreTopWindowInsets()Z

    .line 514
    .line 515
    .line 516
    move-result v36

    .line 517
    const/16 v37, 0x2800

    .line 518
    .line 519
    const/16 v38, 0x0

    .line 520
    .line 521
    const/16 v26, 0x0

    .line 522
    .line 523
    const/16 v27, 0x0

    .line 524
    .line 525
    const/16 v28, 0x0

    .line 526
    .line 527
    const/16 v32, 0x0

    .line 528
    .line 529
    const/16 v34, 0x0

    .line 530
    .line 531
    invoke-direct/range {v20 .. v38}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v1, v20

    .line 535
    .line 536
    goto :goto_12

    .line 537
    :cond_1d
    const/4 v1, 0x0

    .line 538
    :goto_12
    invoke-interface {v12, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    :cond_1e
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;

    .line 542
    .line 543
    invoke-interface {v12}, LY/m;->O()V

    .line 544
    .line 545
    .line 546
    const v0, -0x7bcca1f3

    .line 547
    .line 548
    .line 549
    invoke-interface {v12, v0}, LY/m;->V(I)V

    .line 550
    .line 551
    .line 552
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$5(LY/C0;)Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-eqz v0, :cond_1f

    .line 557
    .line 558
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getVideoUrls()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    shr-int/lit8 v6, v6, 0x6

    .line 563
    .line 564
    and-int/lit8 v6, v6, 0x70

    .line 565
    .line 566
    invoke-static {v0, v4, v12, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->rememberVideoContentState(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;I)Ljava/net/URI;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    goto :goto_13

    .line 571
    :cond_1f
    const/4 v0, 0x0

    .line 572
    :goto_13
    invoke-interface {v12}, LY/m;->O()V

    .line 573
    .line 574
    .line 575
    move-object v6, v14

    .line 576
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getSizePlusMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 577
    .line 578
    .line 579
    move-result-object v14

    .line 580
    const/16 v17, 0x6

    .line 581
    .line 582
    const/16 v18, 0x0

    .line 583
    .line 584
    move-object/from16 v16, v15

    .line 585
    .line 586
    const/4 v15, 0x0

    .line 587
    move-object/from16 v20, v16

    .line 588
    .line 589
    const/16 v16, 0x0

    .line 590
    .line 591
    move-object/from16 p3, v0

    .line 592
    .line 593
    move-object/from16 v0, v20

    .line 594
    .line 595
    invoke-static/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 596
    .line 597
    .line 598
    move-result-object v14

    .line 599
    move-object v15, v13

    .line 600
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getMarginAdjustedAspectRatio()Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    move-object/from16 p4, v1

    .line 605
    .line 606
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$1;

    .line 607
    .line 608
    invoke-static {v14, v13, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getMargin()LC/A;

    .line 613
    .line 614
    .line 615
    move-result-object v13

    .line 616
    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    const v13, -0x7bcc6f7b

    .line 621
    .line 622
    .line 623
    invoke-interface {v12, v13}, LY/m;->V(I)V

    .line 624
    .line 625
    .line 626
    invoke-interface {v12, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v13

    .line 630
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v14

    .line 634
    if-nez v13, :cond_20

    .line 635
    .line 636
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v13

    .line 640
    if-ne v14, v13, :cond_21

    .line 641
    .line 642
    :cond_20
    new-instance v14, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$2$1;

    .line 643
    .line 644
    invoke-direct {v14, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$2$1;-><init>(LY/h2;)V

    .line 645
    .line 646
    .line 647
    invoke-interface {v12, v14}, LY/m;->u(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_21
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 651
    .line 652
    invoke-interface {v12}, LY/m;->O()V

    .line 653
    .line 654
    .line 655
    invoke-static {v1, v6, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$3(LY/h2;)Ls0/E1;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-static {v1, v6}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    const v6, -0x7bcc61a9

    .line 668
    .line 669
    .line 670
    invoke-interface {v12, v6}, LY/m;->V(I)V

    .line 671
    .line 672
    .line 673
    invoke-interface {v12, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v13

    .line 681
    if-nez v6, :cond_22

    .line 682
    .line 683
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    if-ne v13, v6, :cond_23

    .line 688
    .line 689
    :cond_22
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$3$1;

    .line 690
    .line 691
    invoke-direct {v13, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$3$1;-><init>(LY/h2;)V

    .line 692
    .line 693
    .line 694
    invoke-interface {v12, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    :cond_23
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 698
    .line 699
    invoke-interface {v12}, LY/m;->O()V

    .line 700
    .line 701
    .line 702
    invoke-static {v1, v11, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    const v6, -0x7bcc56ab

    .line 707
    .line 708
    .line 709
    invoke-interface {v12, v6}, LY/m;->V(I)V

    .line 710
    .line 711
    .line 712
    invoke-interface {v12, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    if-nez v6, :cond_24

    .line 721
    .line 722
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v6

    .line 726
    if-ne v9, v6, :cond_25

    .line 727
    .line 728
    :cond_24
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$4$1;

    .line 729
    .line 730
    invoke-direct {v9, v0, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$4$1;-><init>(Landroid/view/View;LY/C0;)V

    .line 731
    .line 732
    .line 733
    invoke-interface {v12, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    :cond_25
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 737
    .line 738
    invoke-interface {v12}, LY/m;->O()V

    .line 739
    .line 740
    .line 741
    invoke-static {v1, v9}, Landroidx/compose/ui/layout/n;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    .line 746
    .line 747
    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    const/4 v6, 0x0

    .line 752
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    invoke-static {v12, v6}, LY/h;->a(LY/m;I)I

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    invoke-interface {v12}, LY/m;->r()LY/I;

    .line 761
    .line 762
    .line 763
    move-result-object v9

    .line 764
    invoke-static {v12, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    sget-object v11, LK0/g;->M:LK0/g$a;

    .line 769
    .line 770
    invoke-virtual {v11}, LK0/g$a;->a()Lie/a;

    .line 771
    .line 772
    .line 773
    move-result-object v13

    .line 774
    invoke-interface {v12}, LY/m;->j()LY/d;

    .line 775
    .line 776
    .line 777
    move-result-object v14

    .line 778
    if-nez v14, :cond_26

    .line 779
    .line 780
    invoke-static {}, LY/h;->d()V

    .line 781
    .line 782
    .line 783
    :cond_26
    invoke-interface {v12}, LY/m;->I()V

    .line 784
    .line 785
    .line 786
    invoke-interface {v12}, LY/m;->e()Z

    .line 787
    .line 788
    .line 789
    move-result v14

    .line 790
    if-eqz v14, :cond_27

    .line 791
    .line 792
    invoke-interface {v12, v13}, LY/m;->h(Lie/a;)V

    .line 793
    .line 794
    .line 795
    goto :goto_14

    .line 796
    :cond_27
    invoke-interface {v12}, LY/m;->s()V

    .line 797
    .line 798
    .line 799
    :goto_14
    invoke-static {v12}, LY/m2;->b(LY/m;)LY/m;

    .line 800
    .line 801
    .line 802
    move-result-object v13

    .line 803
    invoke-virtual {v11}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 804
    .line 805
    .line 806
    move-result-object v14

    .line 807
    invoke-static {v13, v1, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v11}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v13, v9, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v11}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-interface {v13}, LY/m;->e()Z

    .line 822
    .line 823
    .line 824
    move-result v9

    .line 825
    if-nez v9, :cond_28

    .line 826
    .line 827
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v9

    .line 831
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object v14

    .line 835
    invoke-static {v9, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v9

    .line 839
    if-nez v9, :cond_29

    .line 840
    .line 841
    :cond_28
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-interface {v13, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    invoke-interface {v13, v6, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 853
    .line 854
    .line 855
    :cond_29
    invoke-virtual {v11}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-static {v13, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 860
    .line 861
    .line 862
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 863
    .line 864
    const v0, -0x47cf5c93

    .line 865
    .line 866
    .line 867
    invoke-interface {v12, v0}, LY/m;->V(I)V

    .line 868
    .line 869
    .line 870
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$5(LY/C0;)Z

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    if-eqz v0, :cond_2c

    .line 875
    .line 876
    if-eqz p3, :cond_2c

    .line 877
    .line 878
    invoke-virtual/range {p3 .. p3}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    const-string v1, "videoUrl.toString()"

    .line 883
    .line 884
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    sget-object v20, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 888
    .line 889
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 890
    .line 891
    .line 892
    move-result-object v21

    .line 893
    const/16 v24, 0x6

    .line 894
    .line 895
    const/16 v25, 0x0

    .line 896
    .line 897
    const/16 v22, 0x0

    .line 898
    .line 899
    const/16 v23, 0x0

    .line 900
    .line 901
    invoke-static/range {v20 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getAspectRatio()Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$1;

    .line 910
    .line 911
    invoke-static {v1, v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$2;

    .line 916
    .line 917
    invoke-static {v1, v8, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getPadding()LC/A;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    .line 926
    .line 927
    .line 928
    move-result-object v5

    .line 929
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getShowControls()Z

    .line 930
    .line 931
    .line 932
    move-result v6

    .line 933
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getAutoplay()Z

    .line 934
    .line 935
    .line 936
    move-result v7

    .line 937
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getLoop()Z

    .line 938
    .line 939
    .line 940
    move-result v8

    .line 941
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getMuteAudio()Z

    .line 942
    .line 943
    .line 944
    move-result v9

    .line 945
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;->getContentScale()LI0/f;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    const v11, -0x47cf0983

    .line 950
    .line 951
    .line 952
    invoke-interface {v12, v11}, LY/m;->V(I)V

    .line 953
    .line 954
    .line 955
    invoke-interface {v12, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v11

    .line 959
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v13

    .line 963
    if-nez v11, :cond_2a

    .line 964
    .line 965
    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v11

    .line 969
    if-ne v13, v11, :cond_2b

    .line 970
    .line 971
    :cond_2a
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$3$1;

    .line 972
    .line 973
    invoke-direct {v13, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$5$3$1;-><init>(LY/C0;)V

    .line 974
    .line 975
    .line 976
    invoke-interface {v12, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    :cond_2b
    move-object v11, v13

    .line 980
    check-cast v11, Lie/a;

    .line 981
    .line 982
    invoke-interface {v12}, LY/m;->O()V

    .line 983
    .line 984
    .line 985
    const/4 v13, 0x0

    .line 986
    const/4 v14, 0x0

    .line 987
    move-object/from16 v39, v4

    .line 988
    .line 989
    move-object v4, v0

    .line 990
    move-object/from16 v0, v39

    .line 991
    .line 992
    move-object/from16 v39, v10

    .line 993
    .line 994
    move-object v10, v1

    .line 995
    move-object/from16 v1, v39

    .line 996
    .line 997
    invoke-static/range {v4 .. v14}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;->VideoView(Ljava/lang/String;Landroidx/compose/ui/e;ZZZZLI0/f;Lie/a;LY/m;II)V

    .line 998
    .line 999
    .line 1000
    goto :goto_15

    .line 1001
    :cond_2c
    move-object v0, v4

    .line 1002
    move-object v1, v10

    .line 1003
    :goto_15
    invoke-interface {v12}, LY/m;->O()V

    .line 1004
    .line 1005
    .line 1006
    const v4, -0x47cef746

    .line 1007
    .line 1008
    .line 1009
    invoke-interface {v12, v4}, LY/m;->V(I)V

    .line 1010
    .line 1011
    .line 1012
    if-eqz p4, :cond_2d

    .line 1013
    .line 1014
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$8(LY/C0;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v1

    .line 1018
    if-nez v1, :cond_2d

    .line 1019
    .line 1020
    const/4 v4, 0x0

    .line 1021
    const/4 v7, 0x4

    .line 1022
    move v6, v3

    .line 1023
    move-object v5, v12

    .line 1024
    move-object v3, v2

    .line 1025
    move-object/from16 v2, p4

    .line 1026
    .line 1027
    invoke-static/range {v2 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt;->ImageComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 1028
    .line 1029
    .line 1030
    :cond_2d
    invoke-interface {v12}, LY/m;->O()V

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v12}, LY/m;->x()V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_16

    .line 1037
    :cond_2e
    move-object v0, v4

    .line 1038
    move-object v15, v13

    .line 1039
    :goto_16
    invoke-static {}, LY/w;->L()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    if-eqz v1, :cond_2f

    .line 1044
    .line 1045
    invoke-static {}, LY/w;->T()V

    .line 1046
    .line 1047
    .line 1048
    :cond_2f
    move-object v4, v0

    .line 1049
    move-object v3, v15

    .line 1050
    :goto_17
    invoke-interface {v12}, LY/m;->k()LY/B1;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v7

    .line 1054
    if-eqz v7, :cond_30

    .line 1055
    .line 1056
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$6;

    .line 1057
    .line 1058
    move-object/from16 v1, p0

    .line 1059
    .line 1060
    move-object/from16 v2, p1

    .line 1061
    .line 1062
    move/from16 v5, p5

    .line 1063
    .line 1064
    move/from16 v6, p6

    .line 1065
    .line 1066
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$VideoComponentView$6;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;II)V

    .line 1067
    .line 1068
    .line 1069
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_30
    return-void
.end method

.method private static final VideoComponentView$lambda$3(LY/h2;)Ls0/E1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")",
            "Ls0/E1;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/E1;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final VideoComponentView$lambda$5(LY/C0;)Z
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

.method private static final VideoComponentView$lambda$6(LY/C0;Z)V
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

.method private static final VideoComponentView$lambda$8(LY/C0;)Z
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

.method private static final VideoComponentView$lambda$9(LY/C0;Z)V
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

.method public static final synthetic access$VideoComponentView$lambda$3(LY/h2;)Ls0/E1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$3(LY/h2;)Ls0/E1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$VideoComponentView$lambda$6(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$6(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$VideoComponentView$lambda$9(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView$lambda$9(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic cacheVideo(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/net/URL;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iput-object p0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$cacheVideo$1;->label:I

    .line 62
    .line 63
    invoke-interface {p2, p0, p1, v0}, Lcom/revenuecat/purchases/storage/FileRepository;->generateOrGetCachedFileURL(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    if-ne p0, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :goto_1
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 71
    .line 72
    new-instance p3, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v0, "Failed to cache video: "

    .line 78
    .line 79
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p2, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 93
    .line 94
    return-object p0
.end method

.method public static final synthetic isVisibleInViewport(Lr0/h;II)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lr0/h;->j()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    cmpl-float v0, v0, v1

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lr0/h;->e()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lr0/h;->i()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float p1, p1

    .line 28
    cmpg-float p1, v0, p1

    .line 29
    .line 30
    if-gez p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lr0/h;->l()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    int-to-float p1, p2

    .line 37
    cmpg-float p0, p0, p1

    .line 38
    .line 39
    if-gez p0, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method private static final rememberVideoContentState(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;I)Ljava/net/URI;
    .locals 11

    .line 1
    const v0, 0x2046962c

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberVideoContentState (VideoComponentView.kt:140)"

    .line 15
    .line 16
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const v0, -0x1d793226

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 31
    .line 32
    .line 33
    and-int/lit8 v0, p3, 0xe

    .line 34
    .line 35
    xor-int/lit8 v0, v0, 0x6

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x4

    .line 40
    if-le v0, v10, :cond_1

    .line 41
    .line 42
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    :cond_1
    and-int/lit8 v2, p3, 0x6

    .line 49
    .line 50
    if-ne v2, v10, :cond_3

    .line 51
    .line 52
    :cond_2
    move v2, v8

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    move v2, v9

    .line 55
    :goto_0
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    or-int/2addr v2, v3

    .line 60
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    sget-object v2, LY/m;->a:LY/m$a;

    .line 67
    .line 68
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-ne v3, v2, :cond_5

    .line 73
    .line 74
    :cond_4
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1;

    .line 75
    .line 76
    invoke-direct {v3, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p2, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    move-object v4, v3

    .line 83
    check-cast v4, Lie/a;

    .line 84
    .line 85
    invoke-interface {p2}, LY/m;->O()V

    .line 86
    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x6

    .line 90
    const/4 v2, 0x0

    .line 91
    const/4 v3, 0x0

    .line 92
    move-object v5, p2

    .line 93
    invoke-static/range {v1 .. v7}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Ljava/net/URI;

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const v2, -0x1d791eaf

    .line 104
    .line 105
    .line 106
    invoke-interface {v5, v2}, LY/m;->V(I)V

    .line 107
    .line 108
    .line 109
    if-le v0, v10, :cond_6

    .line 110
    .line 111
    invoke-interface {v5, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_8

    .line 116
    .line 117
    :cond_6
    and-int/lit8 p3, p3, 0x6

    .line 118
    .line 119
    if-ne p3, v10, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    move v8, v9

    .line 123
    :cond_8
    :goto_1
    invoke-interface {v5, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    or-int/2addr p3, v8

    .line 128
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-nez p3, :cond_9

    .line 133
    .line 134
    sget-object p3, LY/m;->a:LY/m$a;

    .line 135
    .line 136
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    if-ne v0, p3, :cond_a

    .line 141
    .line 142
    :cond_9
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1;

    .line 143
    .line 144
    const/4 p3, 0x0

    .line 145
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v5, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 152
    .line 153
    invoke-interface {v5}, LY/m;->O()V

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v0, v5, v9}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, LY/w;->L()Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_b

    .line 164
    .line 165
    invoke-static {}, LY/w;->T()V

    .line 166
    .line 167
    .line 168
    :cond_b
    invoke-interface {v5}, LY/m;->O()V

    .line 169
    .line 170
    .line 171
    return-object p2
.end method

.method public static final synthetic resolveVideoUrl(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;)Ljava/net/URI;
    .locals 2

    .line 1
    const-string v0, "videoUrls"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "repository"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksum()Lcom/revenuecat/purchases/models/Checksum;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/revenuecat/purchases/storage/FileRepository;->getFile(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrlLowRes()Ljava/net/URL;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_0
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksumLowRes()Lcom/revenuecat/purchases/models/Checksum;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {p1, v0, v1}, Lcom/revenuecat/purchases/storage/FileRepository;->getFile(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "videoUrls.url.toURI()"

    .line 66
    .line 67
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method
