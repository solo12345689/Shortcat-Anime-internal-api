.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template3TestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template3",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate3",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;",
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
.method public static final getTemplate3(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
    .locals 34

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->TEMPLATE_3:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->getId()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v0, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 28
    .line 29
    const/4 v10, 0x3

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const-string v9, "954459_1695680948.jpg"

    .line 34
    .line 35
    invoke-direct/range {v6 .. v11}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    new-instance v14, Ljava/net/URL;

    .line 39
    .line 40
    const-string v0, "https://revenuecat.com/tos"

    .line 41
    .line 42
    invoke-direct {v14, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 46
    .line 47
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 48
    .line 49
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 50
    .line 51
    const-string v1, "#FAFAFA"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 57
    .line 58
    const-string v2, "#000000"

    .line 59
    .line 60
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 64
    .line 65
    const-string v4, "#2A2A2A"

    .line 66
    .line 67
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 71
    .line 72
    const-string v7, "#222222"

    .line 73
    .line 74
    invoke-direct {v4, v7}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 78
    .line 79
    const-string v8, "#FFFFFF"

    .line 80
    .line 81
    invoke-direct {v7, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 85
    .line 86
    const-string v11, "#F4E971"

    .line 87
    .line 88
    invoke-direct {v10, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 92
    .line 93
    const-string v13, "#121212"

    .line 94
    .line 95
    invoke-direct {v12, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/16 v31, 0x7e48

    .line 99
    .line 100
    const/16 v32, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const/16 v25, 0x0

    .line 107
    .line 108
    const/16 v26, 0x0

    .line 109
    .line 110
    const/16 v27, 0x0

    .line 111
    .line 112
    const/16 v28, 0x0

    .line 113
    .line 114
    const/16 v29, 0x0

    .line 115
    .line 116
    const/16 v30, 0x0

    .line 117
    .line 118
    move-object/from16 v16, v0

    .line 119
    .line 120
    move-object/from16 v17, v1

    .line 121
    .line 122
    move-object/from16 v18, v2

    .line 123
    .line 124
    move-object/from16 v20, v4

    .line 125
    .line 126
    move-object/from16 v21, v7

    .line 127
    .line 128
    move-object/from16 v23, v10

    .line 129
    .line 130
    move-object/from16 v24, v12

    .line 131
    .line 132
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    .line 134
    .line 135
    new-instance v16, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 136
    .line 137
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 138
    .line 139
    const-string v1, "#1c1c1c"

    .line 140
    .line 141
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 145
    .line 146
    const-string v2, "#ffffff"

    .line 147
    .line 148
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 152
    .line 153
    const-string v4, "#B7B7B7"

    .line 154
    .line 155
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 159
    .line 160
    const-string v7, "#45c186"

    .line 161
    .line 162
    invoke-direct {v4, v7}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 166
    .line 167
    invoke-direct {v7, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 171
    .line 172
    invoke-direct {v8, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 176
    .line 177
    const-string v11, "#4a4a4a"

    .line 178
    .line 179
    invoke-direct {v10, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/16 v32, 0x7e48

    .line 183
    .line 184
    const/16 v33, 0x0

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    const/16 v23, 0x0

    .line 189
    .line 190
    const/16 v31, 0x0

    .line 191
    .line 192
    move-object/from16 v17, v0

    .line 193
    .line 194
    move-object/from16 v18, v1

    .line 195
    .line 196
    move-object/from16 v19, v2

    .line 197
    .line 198
    move-object/from16 v21, v4

    .line 199
    .line 200
    move-object/from16 v22, v7

    .line 201
    .line 202
    move-object/from16 v24, v8

    .line 203
    .line 204
    move-object/from16 v25, v10

    .line 205
    .line 206
    invoke-direct/range {v16 .. v33}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 207
    .line 208
    .line 209
    move-object/from16 v0, v16

    .line 210
    .line 211
    invoke-direct {v9, v15, v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V

    .line 212
    .line 213
    .line 214
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 215
    .line 216
    const/16 v16, 0x4ea

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    move-object v7, v6

    .line 221
    const/4 v6, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v10, 0x0

    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v13, 0x1

    .line 227
    const/4 v15, 0x0

    .line 228
    invoke-direct/range {v4 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 229
    .line 230
    .line 231
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 232
    .line 233
    const-string v1, "Today"

    .line 234
    .line 235
    const-string v2, "**Full** access to ~~100~~ 1000+ workouts plus free meal plan worth _{{ price }}_."

    .line 236
    .line 237
    const-string v5, "tick"

    .line 238
    .line 239
    invoke-direct {v0, v1, v2, v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 243
    .line 244
    const-string v2, "Day 7"

    .line 245
    .line 246
    const-string v6, "Get a reminder about when your trial is about to end."

    .line 247
    .line 248
    const-string v7, "notification"

    .line 249
    .line 250
    invoke-direct {v1, v2, v6, v7}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 254
    .line 255
    const-string v6, "Day 14"

    .line 256
    .line 257
    const-string v8, "You\'ll automatically get subscribed. Cancel anytime before if you didn\'t love our app."

    .line 258
    .line 259
    const-string v9, "attachment"

    .line 260
    .line 261
    invoke-direct {v2, v6, v8, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    filled-new-array {v0, v1, v2}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v20

    .line 272
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 273
    .line 274
    const/16 v23, 0xd92

    .line 275
    .line 276
    const/16 v24, 0x0

    .line 277
    .line 278
    const-string v11, "How your free trial works"

    .line 279
    .line 280
    const/4 v12, 0x0

    .line 281
    const-string v13, "Start"

    .line 282
    .line 283
    const-string v14, "Start your {{ sub_offer_duration }} free"

    .line 284
    .line 285
    const-string v16, "Only {{ price_per_period }}"

    .line 286
    .line 287
    const-string v17, "First {{ sub_offer_duration }} free, then\n{{ price }} per year ({{ sub_price_per_month }} per month)"

    .line 288
    .line 289
    const/16 v18, 0x0

    .line 290
    .line 291
    const/16 v19, 0x0

    .line 292
    .line 293
    const/16 v21, 0x0

    .line 294
    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    invoke-direct/range {v10 .. v24}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 298
    .line 299
    .line 300
    const-string v0, "en_US"

    .line 301
    .line 302
    invoke-static {v0, v10}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 307
    .line 308
    const-string v2, "Hoy"

    .line 309
    .line 310
    const-string v6, "Acceso completo a m\u00e1s de 1000 entrenamientos m\u00e1s un plan de comidas gratuito valorado en {{ price }}."

    .line 311
    .line 312
    invoke-direct {v1, v2, v6, v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 316
    .line 317
    const-string v5, "D\u00eda 7"

    .line 318
    .line 319
    const-string v6, "Recibir\u00e1s un recordatorio cuando tu prueba est\u00e9 a punto de finalizar."

    .line 320
    .line 321
    invoke-direct {v2, v5, v6, v7}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 325
    .line 326
    const-string v6, "D\u00eda 14"

    .line 327
    .line 328
    const-string v7, "Ser\u00e1s suscrito autom\u00e1ticamente. Cancela en cualquier momento antes si no te encanta nuestra aplicaci\u00f3n."

    .line 329
    .line 330
    invoke-direct {v5, v6, v7, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    filled-new-array {v1, v2, v5}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 342
    .line 343
    const/16 v18, 0xd9a

    .line 344
    .line 345
    const-string v6, "C\u00f3mo funciona tu prueba gratuita"

    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const-string v8, "Comenzar"

    .line 349
    .line 350
    const/4 v9, 0x0

    .line 351
    const/4 v10, 0x0

    .line 352
    const-string v11, "{{ total_price_and_per_month }}"

    .line 353
    .line 354
    const-string v12, "{{ total_price_and_per_month }} despu\u00e9s de {{ sub_offer_duration }} de prueba"

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const/4 v14, 0x0

    .line 358
    const/16 v16, 0x0

    .line 359
    .line 360
    const/16 v17, 0x0

    .line 361
    .line 362
    invoke-direct/range {v5 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 363
    .line 364
    .line 365
    const-string v1, "es_ES"

    .line 366
    .line 367
    invoke-static {v1, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData;

    .line 390
    .line 391
    const/16 v11, 0x151

    .line 392
    .line 393
    const/4 v12, 0x0

    .line 394
    const/4 v2, 0x0

    .line 395
    const/4 v6, 0x0

    .line 396
    const/4 v8, 0x0

    .line 397
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 398
    .line 399
    .line 400
    return-object v1
.end method
