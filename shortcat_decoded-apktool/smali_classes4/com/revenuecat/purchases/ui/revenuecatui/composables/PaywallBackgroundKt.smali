.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0016\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "LC/c;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;",
        "templateConfiguration",
        "LTd/L;",
        "PaywallBackground",
        "(LC/c;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;LY/m;I)V",
        "Li1/h;",
        "",
        "toFloatPx-8Feqmps",
        "(FLY/m;I)F",
        "toFloatPx",
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
.method public static final PaywallBackground(LC/c;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;LY/m;I)V
    .locals 12

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "templateConfiguration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, -0x41f90f0a

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    and-int/lit8 p2, p3, 0x6

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    invoke-interface {v8, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x2

    .line 31
    :goto_0
    or-int/2addr p2, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p2, p3

    .line 34
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v8, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p2, v1

    .line 50
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 51
    .line 52
    const/16 v2, 0x12

    .line 53
    .line 54
    if-ne v1, v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v8}, LY/m;->i()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    invoke-interface {v8}, LY/m;->K()V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_a

    .line 67
    .line 68
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    const/4 v1, -0x1

    .line 75
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackground (PaywallBackground.kt:23)"

    .line 76
    .line 77
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v0, 0x1f

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    const/4 v2, 0x1

    .line 86
    if-lt p2, v0, :cond_7

    .line 87
    .line 88
    move p2, v2

    .line 89
    goto :goto_4

    .line 90
    :cond_7
    move p2, v1

    .line 91
    :goto_4
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getConfiguration()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getBlurredBackgroundImage()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_8

    .line 100
    .line 101
    const v3, 0x3f333333    # 0.7f

    .line 102
    .line 103
    .line 104
    :goto_5
    move v6, v3

    .line 105
    goto :goto_6

    .line 106
    :cond_8
    const/high16 v3, 0x3f800000    # 1.0f

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :goto_6
    const v3, 0x7505dbee

    .line 110
    .line 111
    .line 112
    invoke-interface {v8, v3}, LY/m;->V(I)V

    .line 113
    .line 114
    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    if-nez p2, :cond_9

    .line 118
    .line 119
    new-instance v3, La;

    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-interface {v8, v4}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Landroid/content/Context;

    .line 130
    .line 131
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

    .line 132
    .line 133
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->getBlurSize-D9Ej5fM()F

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    const/4 v7, 0x6

    .line 138
    invoke-static {v5, v8, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt;->toFloatPx-8Feqmps(FLY/m;I)F

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-direct {v3, v4, v5}, La;-><init>(Landroid/content/Context;F)V

    .line 143
    .line 144
    .line 145
    :goto_7
    move-object v5, v3

    .line 146
    goto :goto_8

    .line 147
    :cond_9
    const/4 v3, 0x0

    .line 148
    goto :goto_7

    .line 149
    :goto_8
    invoke-interface {v8}, LY/m;->O()V

    .line 150
    .line 151
    .line 152
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 153
    .line 154
    invoke-interface {p0, v3}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    if-eqz p2, :cond_a

    .line 161
    .line 162
    move v1, v2

    .line 163
    :cond_a
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt$PaywallBackground$modifier$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt$PaywallBackground$modifier$1;

    .line 164
    .line 165
    invoke-static {v3, v1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getConfiguration()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getImages()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getBackground()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    sget-object v1, Lcom/revenuecat/purchases/paywalls/PaywallData;->Companion:Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;

    .line 182
    .line 183
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PaywallDataExtensionsKt;->getDefaultBackgroundPlaceholder(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_b

    .line 192
    .line 193
    const p2, 0x2bbe1398

    .line 194
    .line 195
    .line 196
    invoke-interface {v8, p2}, LY/m;->V(I)V

    .line 197
    .line 198
    .line 199
    sget v1, Lcom/revenuecat/purchases/ui/revenuecatui/R$drawable;->default_background:I

    .line 200
    .line 201
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

    .line 202
    .line 203
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->getContentScale()LI0/f;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    const/16 v9, 0x180

    .line 208
    .line 209
    const/16 v10, 0x48

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    const/4 v7, 0x0

    .line 213
    invoke-static/range {v1 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->LocalImage(ILandroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v8}, LY/m;->O()V

    .line 217
    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_b
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getImages()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;->getBackgroundUri()Landroid/net/Uri;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    if-eqz p2, :cond_e

    .line 229
    .line 230
    const p2, 0x2bc3656a

    .line 231
    .line 232
    .line 233
    invoke-interface {v8, p2}, LY/m;->V(I)V

    .line 234
    .line 235
    .line 236
    if-nez v0, :cond_c

    .line 237
    .line 238
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getMode()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallModeKt;->isFullScreen(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-eqz p2, :cond_d

    .line 247
    .line 248
    :cond_c
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getImages()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;->getBackgroundUri()Landroid/net/Uri;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    const-string p2, "templateConfiguration.im\u2026.backgroundUri.toString()"

    .line 261
    .line 262
    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

    .line 266
    .line 267
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->getContentScale()LI0/f;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    const/16 v10, 0xc00

    .line 272
    .line 273
    const/16 v11, 0x94

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    move v7, v6

    .line 277
    move-object v6, v5

    .line 278
    const/4 v5, 0x0

    .line 279
    move-object v9, v8

    .line 280
    const/4 v8, 0x0

    .line 281
    invoke-static/range {v1 .. v11}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->RemoteImage(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V

    .line 282
    .line 283
    .line 284
    move-object v8, v9

    .line 285
    :cond_d
    invoke-interface {v8}, LY/m;->O()V

    .line 286
    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_e
    const p2, 0x2bca9113

    .line 290
    .line 291
    .line 292
    invoke-interface {v8, p2}, LY/m;->V(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v8}, LY/m;->O()V

    .line 296
    .line 297
    .line 298
    :goto_9
    invoke-static {}, LY/w;->L()Z

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    if-eqz p2, :cond_f

    .line 303
    .line 304
    invoke-static {}, LY/w;->T()V

    .line 305
    .line 306
    .line 307
    :cond_f
    :goto_a
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    if-eqz p2, :cond_10

    .line 312
    .line 313
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt$PaywallBackground$1;

    .line 314
    .line 315
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallBackgroundKt$PaywallBackground$1;-><init>(LC/c;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;I)V

    .line 316
    .line 317
    .line 318
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 319
    .line 320
    .line 321
    :cond_10
    return-void
.end method

.method private static final toFloatPx-8Feqmps(FLY/m;I)F
    .locals 3

    .line 1
    const v0, 0x1afd2040

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->V(I)V

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.composables.toFloatPx (PaywallBackground.kt:73)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p1, p2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Li1/d;

    .line 28
    .line 29
    invoke-interface {p2}, Li1/d;->getDensity()F

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    mul-float/2addr p0, p2

    .line 34
    invoke-static {}, LY/w;->L()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-static {}, LY/w;->T()V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-interface {p1}, LY/m;->O()V

    .line 44
    .line 45
    .line 46
    return p0
.end method
