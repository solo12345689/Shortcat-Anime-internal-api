.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PageControlExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0000\u00a8\u0006\n"
    }
    d2 = {
        "toPageControlStyles",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;",
        "aliases",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
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
.method public static final synthetic toPageControlStyles(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 32

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "aliases"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getActive()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getDefault()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getBackgroundColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v9, 0x0

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v1, v9

    .line 52
    :goto_0
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;->toBorderStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v1, v9

    .line 68
    :goto_1
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyleKt;->toShadowStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move-object v1, v9

    .line 84
    :goto_2
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getActive()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getStrokeColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    move-object v1, v9

    .line 104
    :goto_3
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getDefault()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getStrokeColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    move-object v0, v9

    .line 124
    :goto_4
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    filled-new-array/range {v3 .. v8}, [Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->access$collectErrors(Ljava/util/List;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->toNonEmptyListOrNull(Ljava/lang/Iterable;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_5

    .line 145
    .line 146
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_5
    const-string v1, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 153
    .line 154
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 158
    .line 159
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 164
    .line 165
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-string v4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 175
    .line 176
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 180
    .line 181
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 186
    .line 187
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 191
    .line 192
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    const-string v6, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 197
    .line 198
    invoke-static {v7, v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 202
    .line 203
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    const-string v7, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 208
    .line 209
    invoke-static {v8, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 213
    .line 214
    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    const-string v8, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<G of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 219
    .line 220
    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    move-object v14, v0

    .line 230
    check-cast v14, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 231
    .line 232
    move-object/from16 v19, v7

    .line 233
    .line 234
    check-cast v19, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 235
    .line 236
    move-object/from16 v28, v6

    .line 237
    .line 238
    check-cast v28, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 239
    .line 240
    move-object/from16 v27, v5

    .line 241
    .line 242
    check-cast v27, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 243
    .line 244
    move-object/from16 v25, v4

    .line 245
    .line 246
    check-cast v25, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 247
    .line 248
    move-object v13, v3

    .line 249
    check-cast v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 250
    .line 251
    move-object/from16 v18, v1

    .line 252
    .line 253
    check-cast v18, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 254
    .line 255
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;

    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getPosition()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getSpacing()Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    if-eqz v3, :cond_6

    .line 266
    .line 267
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    :goto_5
    int-to-float v3, v3

    .line 272
    invoke-static {v3}, Li1/h;->n(F)F

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    move/from16 v22, v3

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_6
    const/4 v3, 0x0

    .line 280
    goto :goto_5

    .line 281
    :goto_6
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/PaddingKt;->toPaddingValues(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;)LC/A;

    .line 286
    .line 287
    .line 288
    move-result-object v23

    .line 289
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/PaddingKt;->toPaddingValues(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;)LC/A;

    .line 294
    .line 295
    .line 296
    move-result-object v24

    .line 297
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getShape()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-nez v3, :cond_7

    .line 302
    .line 303
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$Companion;

    .line 304
    .line 305
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$Companion;->getDEFAULT_SHAPE$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    :cond_7
    move-object/from16 v26, v3

    .line 310
    .line 311
    new-instance v15, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;

    .line 312
    .line 313
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getActive()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getWidth-pVg5ArA()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    int-to-float v3, v3

    .line 322
    invoke-static {v3}, Li1/h;->n(F)F

    .line 323
    .line 324
    .line 325
    move-result v16

    .line 326
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getActive()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getHeight-pVg5ArA()I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    int-to-float v3, v3

    .line 335
    invoke-static {v3}, Li1/h;->n(F)F

    .line 336
    .line 337
    .line 338
    move-result v17

    .line 339
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getActive()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getStrokeWidth-0hXNFcg()LTd/D;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    if-eqz v3, :cond_8

    .line 348
    .line 349
    invoke-virtual {v3}, LTd/D;->m()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    int-to-float v3, v3

    .line 354
    invoke-static {v3}, Li1/h;->n(F)F

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    invoke-static {v3}, Li1/h;->h(F)Li1/h;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    move-object/from16 v20, v3

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_8
    move-object/from16 v20, v9

    .line 366
    .line 367
    :goto_7
    const/16 v21, 0x0

    .line 368
    .line 369
    invoke-direct/range {v15 .. v21}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;-><init>(FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Li1/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 370
    .line 371
    .line 372
    move-object/from16 v29, v15

    .line 373
    .line 374
    new-instance v30, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;

    .line 375
    .line 376
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getDefault()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getWidth-pVg5ArA()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    int-to-float v3, v3

    .line 385
    invoke-static {v3}, Li1/h;->n(F)F

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getDefault()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getHeight-pVg5ArA()I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    int-to-float v3, v3

    .line 398
    invoke-static {v3}, Li1/h;->n(F)F

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;->getDefault()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;->getStrokeWidth-0hXNFcg()LTd/D;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    if-eqz v2, :cond_9

    .line 411
    .line 412
    invoke-virtual {v2}, LTd/D;->m()I

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    int-to-float v2, v2

    .line 417
    invoke-static {v2}, Li1/h;->n(F)F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-static {v2}, Li1/h;->h(F)Li1/h;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    :cond_9
    move-object v15, v9

    .line 426
    const/16 v16, 0x0

    .line 427
    .line 428
    move-object/from16 v10, v30

    .line 429
    .line 430
    invoke-direct/range {v10 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;-><init>(FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Li1/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 431
    .line 432
    .line 433
    const/16 v31, 0x0

    .line 434
    .line 435
    move-object/from16 v20, v0

    .line 436
    .line 437
    move-object/from16 v21, v1

    .line 438
    .line 439
    invoke-direct/range {v20 .. v31}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;-><init>(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;FLC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 440
    .line 441
    .line 442
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 443
    .line 444
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return-object v1
.end method
