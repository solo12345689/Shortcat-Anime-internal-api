.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;",
        "",
        "()V",
        "create",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;",
        "paywallDataColors",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ColorsFactory;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;
    .locals 42

    .line 1
    const-string v0, "paywallDataColors"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getBackground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getText1()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getText2()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v2

    .line 36
    :goto_0
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getText3()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v4, v3

    .line 48
    :goto_1
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getCallToActionBackground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getCallToActionForeground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getCallToActionSecondaryBackground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const/4 v8, 0x0

    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    invoke-virtual {v7}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move-object v7, v8

    .line 81
    :goto_2
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getAccent1()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    invoke-virtual {v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move v9, v6

    .line 93
    :goto_3
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getAccent2()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-eqz v10, :cond_4

    .line 98
    .line 99
    invoke-virtual {v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    move v10, v9

    .line 105
    :goto_4
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getAccent3()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    if-eqz v11, :cond_5

    .line 110
    .line 111
    invoke-virtual {v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    goto :goto_5

    .line 116
    :cond_5
    move v11, v10

    .line 117
    :goto_5
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getCloseButton()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    if-eqz v12, :cond_6

    .line 122
    .line 123
    invoke-virtual {v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    goto :goto_6

    .line 132
    :cond_6
    move-object v12, v8

    .line 133
    :goto_6
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getTierControlBackground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    if-eqz v13, :cond_7

    .line 138
    .line 139
    invoke-virtual {v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    goto :goto_7

    .line 148
    :cond_7
    move-object v13, v8

    .line 149
    :goto_7
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getTierControlForeground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    if-eqz v14, :cond_8

    .line 154
    .line 155
    invoke-virtual {v14}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    goto :goto_8

    .line 164
    :cond_8
    move-object v14, v8

    .line 165
    :goto_8
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getTierControlSelectedBackground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    if-eqz v15, :cond_9

    .line 170
    .line 171
    invoke-virtual {v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    goto :goto_9

    .line 180
    :cond_9
    move-object v15, v8

    .line 181
    :goto_9
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;->getTierControlSelectedForeground()Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-eqz v1, :cond_a

    .line 186
    .line 187
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;->getColorInt()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_a

    .line 196
    :cond_a
    move-object v1, v8

    .line 197
    :goto_a
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 198
    .line 199
    .line 200
    move-result-wide v17

    .line 201
    invoke-static {v2}, Ls0/s0;->b(I)J

    .line 202
    .line 203
    .line 204
    move-result-wide v19

    .line 205
    invoke-static {v3}, Ls0/s0;->b(I)J

    .line 206
    .line 207
    .line 208
    move-result-wide v21

    .line 209
    invoke-static {v4}, Ls0/s0;->b(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v23

    .line 213
    invoke-static {v5}, Ls0/s0;->b(I)J

    .line 214
    .line 215
    .line 216
    move-result-wide v25

    .line 217
    invoke-static {v6}, Ls0/s0;->b(I)J

    .line 218
    .line 219
    .line 220
    move-result-wide v27

    .line 221
    if-eqz v7, :cond_b

    .line 222
    .line 223
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v2

    .line 231
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    move-object/from16 v29, v0

    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_b
    move-object/from16 v29, v8

    .line 239
    .line 240
    :goto_b
    invoke-static {v9}, Ls0/s0;->b(I)J

    .line 241
    .line 242
    .line 243
    move-result-wide v30

    .line 244
    invoke-static {v10}, Ls0/s0;->b(I)J

    .line 245
    .line 246
    .line 247
    move-result-wide v32

    .line 248
    invoke-static {v11}, Ls0/s0;->b(I)J

    .line 249
    .line 250
    .line 251
    move-result-wide v34

    .line 252
    if-eqz v12, :cond_c

    .line 253
    .line 254
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v2

    .line 262
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    move-object/from16 v36, v0

    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_c
    move-object/from16 v36, v8

    .line 270
    .line 271
    :goto_c
    if-eqz v13, :cond_d

    .line 272
    .line 273
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    move-object/from16 v37, v0

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_d
    move-object/from16 v37, v8

    .line 289
    .line 290
    :goto_d
    if-eqz v14, :cond_e

    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 297
    .line 298
    .line 299
    move-result-wide v2

    .line 300
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    move-object/from16 v38, v0

    .line 305
    .line 306
    goto :goto_e

    .line 307
    :cond_e
    move-object/from16 v38, v8

    .line 308
    .line 309
    :goto_e
    if-eqz v15, :cond_f

    .line 310
    .line 311
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 316
    .line 317
    .line 318
    move-result-wide v2

    .line 319
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    move-object/from16 v39, v0

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_f
    move-object/from16 v39, v8

    .line 327
    .line 328
    :goto_f
    if-eqz v1, :cond_10

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-static {v0}, Ls0/s0;->b(I)J

    .line 335
    .line 336
    .line 337
    move-result-wide v0

    .line 338
    invoke-static {v0, v1}, Ls0/r0;->m(J)Ls0/r0;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    :cond_10
    move-object/from16 v40, v8

    .line 343
    .line 344
    new-instance v16, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 345
    .line 346
    const/16 v41, 0x0

    .line 347
    .line 348
    invoke-direct/range {v16 .. v41}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;-><init>(JJJJJJLs0/r0;JJJLs0/r0;Ls0/r0;Ls0/r0;Ls0/r0;Ls0/r0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 349
    .line 350
    .line 351
    return-object v16
.end method
