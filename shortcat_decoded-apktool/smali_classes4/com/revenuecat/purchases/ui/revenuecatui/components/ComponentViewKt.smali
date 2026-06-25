.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "LZd/e;",
        "LTd/L;",
        "",
        "onClick",
        "Landroidx/compose/ui/e;",
        "modifier",
        "ComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V",
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
.method public static final synthetic ComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
    .locals 9

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "state"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x119136e1

    .line 17
    .line 18
    .line 19
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    and-int/lit8 p4, p6, 0x1

    .line 24
    .line 25
    if-eqz p4, :cond_0

    .line 26
    .line 27
    or-int/lit8 p4, p5, 0x6

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 p4, p5, 0x6

    .line 31
    .line 32
    if-nez p4, :cond_2

    .line 33
    .line 34
    invoke-interface {v5, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-eqz p4, :cond_1

    .line 39
    .line 40
    const/4 p4, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p4, 0x2

    .line 43
    :goto_0
    or-int/2addr p4, p5

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move p4, p5

    .line 46
    :goto_1
    and-int/lit8 v1, p6, 0x2

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    or-int/lit8 p4, p4, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v1, p5, 0x30

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    invoke-interface {v5, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/16 v1, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v1, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr p4, v1

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v1, p6, 0x4

    .line 70
    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    or-int/lit16 p4, p4, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v1, p5, 0x180

    .line 77
    .line 78
    if-nez v1, :cond_8

    .line 79
    .line 80
    invoke-interface {v5, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    const/16 v1, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v1, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr p4, v1

    .line 92
    :cond_8
    :goto_5
    and-int/lit8 v1, p6, 0x8

    .line 93
    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    or-int/lit16 p4, p4, 0xc00

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_9
    and-int/lit16 v2, p5, 0xc00

    .line 100
    .line 101
    if-nez v2, :cond_b

    .line 102
    .line 103
    invoke-interface {v5, p3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    const/16 v2, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_a
    const/16 v2, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr p4, v2

    .line 115
    :cond_b
    :goto_7
    and-int/lit16 v2, p4, 0x493

    .line 116
    .line 117
    const/16 v3, 0x492

    .line 118
    .line 119
    if-ne v2, v3, :cond_d

    .line 120
    .line 121
    invoke-interface {v5}, LY/m;->i()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_c

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_c
    invoke-interface {v5}, LY/m;->K()V

    .line 129
    .line 130
    .line 131
    move-object v2, p1

    .line 132
    move-object v3, p2

    .line 133
    move-object p4, p3

    .line 134
    goto/16 :goto_b

    .line 135
    .line 136
    :cond_d
    :goto_8
    if-eqz v1, :cond_e

    .line 137
    .line 138
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 139
    .line 140
    :cond_e
    move-object v4, p3

    .line 141
    invoke-static {}, LY/w;->L()Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-eqz p3, :cond_f

    .line 146
    .line 147
    const/4 p3, -0x1

    .line 148
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.ComponentView (ComponentView.kt:49)"

    .line 149
    .line 150
    invoke-static {v0, p4, p3, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_f
    instance-of p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 154
    .line 155
    if-eqz p3, :cond_10

    .line 156
    .line 157
    const p3, 0x2cfc61b7

    .line 158
    .line 159
    .line 160
    invoke-interface {v5, p3}, LY/m;->V(I)V

    .line 161
    .line 162
    .line 163
    move-object v1, p0

    .line 164
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 165
    .line 166
    and-int/lit16 v7, p4, 0x1ff0

    .line 167
    .line 168
    const/16 v8, 0x10

    .line 169
    .line 170
    move-object v6, v5

    .line 171
    const/4 v5, 0x0

    .line 172
    move-object v2, p1

    .line 173
    move-object v3, p2

    .line 174
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 175
    .line 176
    .line 177
    move-object p3, v3

    .line 178
    move-object v5, v6

    .line 179
    invoke-interface {v5}, LY/m;->O()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_a

    .line 183
    .line 184
    :cond_10
    move-object v2, p1

    .line 185
    move-object p3, p2

    .line 186
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    .line 187
    .line 188
    if-eqz p1, :cond_11

    .line 189
    .line 190
    const p1, 0x2cfc75d6

    .line 191
    .line 192
    .line 193
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 194
    .line 195
    .line 196
    move-object v1, p0

    .line 197
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    .line 198
    .line 199
    and-int/lit8 p1, p4, 0x70

    .line 200
    .line 201
    shr-int/lit8 p2, p4, 0x3

    .line 202
    .line 203
    and-int/lit16 p2, p2, 0x380

    .line 204
    .line 205
    or-int/2addr p1, p2

    .line 206
    const/4 v6, 0x0

    .line 207
    move-object v3, v4

    .line 208
    move-object v4, v5

    .line 209
    move v5, p1

    .line 210
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt;->TextComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 211
    .line 212
    .line 213
    move-object v5, v4

    .line 214
    move-object v4, v3

    .line 215
    invoke-interface {v5}, LY/m;->O()V

    .line 216
    .line 217
    .line 218
    :goto_9
    move-object v3, p3

    .line 219
    goto/16 :goto_a

    .line 220
    .line 221
    :cond_11
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;

    .line 222
    .line 223
    if-eqz p1, :cond_12

    .line 224
    .line 225
    const p1, 0x2cfc85f8

    .line 226
    .line 227
    .line 228
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 229
    .line 230
    .line 231
    move-object v1, p0

    .line 232
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;

    .line 233
    .line 234
    and-int/lit8 p1, p4, 0x70

    .line 235
    .line 236
    shr-int/lit8 p2, p4, 0x3

    .line 237
    .line 238
    and-int/lit16 p2, p2, 0x380

    .line 239
    .line 240
    or-int/2addr p1, p2

    .line 241
    const/4 v6, 0x0

    .line 242
    move-object v3, v4

    .line 243
    move-object v4, v5

    .line 244
    move v5, p1

    .line 245
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/ImageComponentViewKt;->ImageComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 246
    .line 247
    .line 248
    move-object v5, v4

    .line 249
    move-object v4, v3

    .line 250
    invoke-interface {v5}, LY/m;->O()V

    .line 251
    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_12
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;

    .line 255
    .line 256
    if-eqz p1, :cond_13

    .line 257
    .line 258
    const p1, 0x7295c42b

    .line 259
    .line 260
    .line 261
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 262
    .line 263
    .line 264
    move-object v1, p0

    .line 265
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;

    .line 266
    .line 267
    and-int/lit8 p1, p4, 0x70

    .line 268
    .line 269
    shr-int/lit8 p2, p4, 0x3

    .line 270
    .line 271
    and-int/lit16 p2, p2, 0x380

    .line 272
    .line 273
    or-int v6, p1, p2

    .line 274
    .line 275
    const/16 v7, 0x8

    .line 276
    .line 277
    move-object v3, v4

    .line 278
    const/4 v4, 0x0

    .line 279
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;II)V

    .line 280
    .line 281
    .line 282
    move-object v4, v3

    .line 283
    invoke-interface {v5}, LY/m;->O()V

    .line 284
    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_13
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 288
    .line 289
    if-eqz p1, :cond_14

    .line 290
    .line 291
    const p1, 0x2cfca70c

    .line 292
    .line 293
    .line 294
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 295
    .line 296
    .line 297
    move-object v1, p0

    .line 298
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 299
    .line 300
    and-int/lit16 v6, p4, 0x1ff0

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    move-object v3, p3

    .line 304
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt;->ButtonComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v5}, LY/m;->O()V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_a

    .line 311
    .line 312
    :cond_14
    move-object v3, p3

    .line 313
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;

    .line 314
    .line 315
    if-eqz p1, :cond_15

    .line 316
    .line 317
    const p1, 0x2cfcb71e

    .line 318
    .line 319
    .line 320
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 321
    .line 322
    .line 323
    move-object v1, p0

    .line 324
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;

    .line 325
    .line 326
    and-int/lit16 v6, p4, 0x1ff0

    .line 327
    .line 328
    const/4 v7, 0x0

    .line 329
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stickyfooter/StickyFooterComponentViewKt;->StickyFooterComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v5}, LY/m;->O()V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_a

    .line 336
    .line 337
    :cond_15
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;

    .line 338
    .line 339
    if-eqz p1, :cond_16

    .line 340
    .line 341
    const p1, 0x2cfccc99

    .line 342
    .line 343
    .line 344
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 345
    .line 346
    .line 347
    move-object v1, p0

    .line 348
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;

    .line 349
    .line 350
    and-int/lit16 v6, p4, 0x1ff0

    .line 351
    .line 352
    const/4 v7, 0x0

    .line 353
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt;->PackageComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 354
    .line 355
    .line 356
    move-object p3, v3

    .line 357
    invoke-interface {v5}, LY/m;->O()V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_a

    .line 361
    .line 362
    :cond_16
    move-object p3, v3

    .line 363
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    .line 364
    .line 365
    if-eqz p1, :cond_17

    .line 366
    .line 367
    const p1, 0x2cfce0d7

    .line 368
    .line 369
    .line 370
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 371
    .line 372
    .line 373
    move-object v1, p0

    .line 374
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;

    .line 375
    .line 376
    and-int/lit8 p1, p4, 0x70

    .line 377
    .line 378
    shr-int/lit8 p2, p4, 0x3

    .line 379
    .line 380
    and-int/lit16 p2, p2, 0x380

    .line 381
    .line 382
    or-int/2addr p1, p2

    .line 383
    const/4 v6, 0x0

    .line 384
    move-object v3, v4

    .line 385
    move-object v4, v5

    .line 386
    move v5, p1

    .line 387
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 388
    .line 389
    .line 390
    move-object v5, v4

    .line 391
    move-object v4, v3

    .line 392
    invoke-interface {v5}, LY/m;->O()V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_9

    .line 396
    .line 397
    :cond_17
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;

    .line 398
    .line 399
    if-eqz p1, :cond_18

    .line 400
    .line 401
    const p1, 0x2cfced9b

    .line 402
    .line 403
    .line 404
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 405
    .line 406
    .line 407
    move-object v1, p0

    .line 408
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;

    .line 409
    .line 410
    and-int/lit8 p1, p4, 0x70

    .line 411
    .line 412
    shr-int/lit8 p2, p4, 0x3

    .line 413
    .line 414
    and-int/lit16 p2, p2, 0x380

    .line 415
    .line 416
    or-int/2addr p1, p2

    .line 417
    const/4 v6, 0x0

    .line 418
    move-object v3, v4

    .line 419
    move-object v4, v5

    .line 420
    move v5, p1

    .line 421
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt;->TimelineComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 422
    .line 423
    .line 424
    move-object v5, v4

    .line 425
    move-object v4, v3

    .line 426
    invoke-interface {v5}, LY/m;->O()V

    .line 427
    .line 428
    .line 429
    goto/16 :goto_9

    .line 430
    .line 431
    :cond_18
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;

    .line 432
    .line 433
    if-eqz p1, :cond_19

    .line 434
    .line 435
    const p1, 0x2cfcfb1a

    .line 436
    .line 437
    .line 438
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 439
    .line 440
    .line 441
    move-object v1, p0

    .line 442
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;

    .line 443
    .line 444
    and-int/lit16 v6, p4, 0x1ff0

    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    move-object v3, p3

    .line 448
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt;->CarouselComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v5}, LY/m;->O()V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_a

    .line 455
    .line 456
    :cond_19
    move-object v3, p3

    .line 457
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;

    .line 458
    .line 459
    if-eqz p1, :cond_1a

    .line 460
    .line 461
    const p1, 0x2cfd0fb6

    .line 462
    .line 463
    .line 464
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 465
    .line 466
    .line 467
    move-object v1, p0

    .line 468
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;

    .line 469
    .line 470
    and-int/lit16 v6, p4, 0x1ff0

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentViewKt;->TabsComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 474
    .line 475
    .line 476
    invoke-interface {v5}, LY/m;->O()V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_a

    .line 480
    .line 481
    :cond_1a
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Buttons;

    .line 482
    .line 483
    if-eqz p1, :cond_1b

    .line 484
    .line 485
    const p1, 0x2cfd2e9d

    .line 486
    .line 487
    .line 488
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 489
    .line 490
    .line 491
    move-object p1, p0

    .line 492
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Buttons;

    .line 493
    .line 494
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Buttons;->getStack()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    and-int/lit16 v7, p4, 0x1ff0

    .line 499
    .line 500
    const/16 v8, 0x10

    .line 501
    .line 502
    move-object v6, v5

    .line 503
    const/4 v5, 0x0

    .line 504
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 505
    .line 506
    .line 507
    move-object v5, v6

    .line 508
    invoke-interface {v5}, LY/m;->O()V

    .line 509
    .line 510
    .line 511
    goto/16 :goto_a

    .line 512
    .line 513
    :cond_1b
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Toggle;

    .line 514
    .line 515
    if-eqz p1, :cond_1c

    .line 516
    .line 517
    const p1, 0x2cfd4e1d

    .line 518
    .line 519
    .line 520
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 521
    .line 522
    .line 523
    move-object p1, p0

    .line 524
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Toggle;

    .line 525
    .line 526
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle$Toggle;->getStack()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    and-int/lit16 v7, p4, 0x1ff0

    .line 531
    .line 532
    const/16 v8, 0x10

    .line 533
    .line 534
    move-object v6, v5

    .line 535
    const/4 v5, 0x0

    .line 536
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 537
    .line 538
    .line 539
    move-object p3, v3

    .line 540
    move-object v5, v6

    .line 541
    invoke-interface {v5}, LY/m;->O()V

    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_1c
    move-object p3, v3

    .line 546
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;

    .line 547
    .line 548
    if-eqz p1, :cond_1d

    .line 549
    .line 550
    const p1, 0x2cfd6479

    .line 551
    .line 552
    .line 553
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 554
    .line 555
    .line 556
    move-object v1, p0

    .line 557
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;

    .line 558
    .line 559
    and-int/lit8 p1, p4, 0x70

    .line 560
    .line 561
    shr-int/lit8 p2, p4, 0x3

    .line 562
    .line 563
    and-int/lit16 p2, p2, 0x380

    .line 564
    .line 565
    or-int/2addr p1, p2

    .line 566
    const/4 v6, 0x0

    .line 567
    move-object v3, v4

    .line 568
    move-object v4, v5

    .line 569
    move v5, p1

    .line 570
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt;->TabControlButtonView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 571
    .line 572
    .line 573
    move-object v5, v4

    .line 574
    move-object v4, v3

    .line 575
    invoke-interface {v5}, LY/m;->O()V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_9

    .line 579
    .line 580
    :cond_1d
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;

    .line 581
    .line 582
    if-eqz p1, :cond_1e

    .line 583
    .line 584
    const p1, 0x2cfd7679

    .line 585
    .line 586
    .line 587
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 588
    .line 589
    .line 590
    move-object v1, p0

    .line 591
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;

    .line 592
    .line 593
    and-int/lit8 p1, p4, 0x70

    .line 594
    .line 595
    shr-int/lit8 p2, p4, 0x3

    .line 596
    .line 597
    and-int/lit16 p2, p2, 0x380

    .line 598
    .line 599
    or-int/2addr p1, p2

    .line 600
    const/4 v6, 0x0

    .line 601
    move-object v3, v4

    .line 602
    move-object v4, v5

    .line 603
    move v5, p1

    .line 604
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 605
    .line 606
    .line 607
    move-object v5, v4

    .line 608
    move-object v4, v3

    .line 609
    invoke-interface {v5}, LY/m;->O()V

    .line 610
    .line 611
    .line 612
    goto/16 :goto_9

    .line 613
    .line 614
    :cond_1e
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;

    .line 615
    .line 616
    if-eqz p1, :cond_21

    .line 617
    .line 618
    const p1, 0x2cfd87b6

    .line 619
    .line 620
    .line 621
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 622
    .line 623
    .line 624
    move-object v1, p0

    .line 625
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;

    .line 626
    .line 627
    and-int/lit16 v6, p4, 0x1ff0

    .line 628
    .line 629
    const/4 v7, 0x0

    .line 630
    move-object v3, p3

    .line 631
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;->CountdownComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 632
    .line 633
    .line 634
    invoke-interface {v5}, LY/m;->O()V

    .line 635
    .line 636
    .line 637
    :goto_a
    invoke-static {}, LY/w;->L()Z

    .line 638
    .line 639
    .line 640
    move-result p1

    .line 641
    if-eqz p1, :cond_1f

    .line 642
    .line 643
    invoke-static {}, LY/w;->T()V

    .line 644
    .line 645
    .line 646
    :cond_1f
    move-object p4, v4

    .line 647
    :goto_b
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    if-eqz v0, :cond_20

    .line 652
    .line 653
    move-object p1, p0

    .line 654
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt$ComponentView$1;

    .line 655
    .line 656
    move-object p2, v2

    .line 657
    move-object p3, v3

    .line 658
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewKt$ComponentView$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;II)V

    .line 659
    .line 660
    .line 661
    invoke-interface {v0, p0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 662
    .line 663
    .line 664
    :cond_20
    return-void

    .line 665
    :cond_21
    const p0, 0x2cface93

    .line 666
    .line 667
    .line 668
    invoke-interface {v5, p0}, LY/m;->V(I)V

    .line 669
    .line 670
    .line 671
    invoke-interface {v5}, LY/m;->O()V

    .line 672
    .line 673
    .line 674
    new-instance p0, LTd/r;

    .line 675
    .line 676
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 677
    .line 678
    .line 679
    throw p0
.end method
