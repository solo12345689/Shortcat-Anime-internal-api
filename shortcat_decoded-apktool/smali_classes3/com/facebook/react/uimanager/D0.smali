.class public final Lcom/facebook/react/uimanager/D0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/D0;

.field public static final b:[I

.field public static final c:[I

.field private static final d:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 47

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/D0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/D0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/D0;->a:Lcom/facebook/react/uimanager/D0;

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    fill-array-data v0, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/uimanager/D0;->b:[I

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    new-array v0, v0, [I

    .line 19
    .line 20
    fill-array-data v0, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/uimanager/D0;->c:[I

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashSet;

    .line 26
    .line 27
    const-string v45, "paddingStart"

    .line 28
    .line 29
    const-string v46, "paddingEnd"

    .line 30
    .line 31
    const-string v1, "alignSelf"

    .line 32
    .line 33
    const-string v2, "alignItems"

    .line 34
    .line 35
    const-string v3, "collapsable"

    .line 36
    .line 37
    const-string v4, "flex"

    .line 38
    .line 39
    const-string v5, "flexBasis"

    .line 40
    .line 41
    const-string v6, "flexDirection"

    .line 42
    .line 43
    const-string v7, "flexGrow"

    .line 44
    .line 45
    const-string v8, "rowGap"

    .line 46
    .line 47
    const-string v9, "columnGap"

    .line 48
    .line 49
    const-string v10, "gap"

    .line 50
    .line 51
    const-string v11, "flexShrink"

    .line 52
    .line 53
    const-string v12, "flexWrap"

    .line 54
    .line 55
    const-string v13, "justifyContent"

    .line 56
    .line 57
    const-string v14, "alignContent"

    .line 58
    .line 59
    const-string v15, "display"

    .line 60
    .line 61
    const-string v16, "position"

    .line 62
    .line 63
    const-string v17, "right"

    .line 64
    .line 65
    const-string v18, "top"

    .line 66
    .line 67
    const-string v19, "bottom"

    .line 68
    .line 69
    const-string v20, "left"

    .line 70
    .line 71
    const-string v21, "start"

    .line 72
    .line 73
    const-string v22, "end"

    .line 74
    .line 75
    const-string v23, "width"

    .line 76
    .line 77
    const-string v24, "height"

    .line 78
    .line 79
    const-string v25, "minWidth"

    .line 80
    .line 81
    const-string v26, "maxWidth"

    .line 82
    .line 83
    const-string v27, "minHeight"

    .line 84
    .line 85
    const-string v28, "maxHeight"

    .line 86
    .line 87
    const-string v29, "margin"

    .line 88
    .line 89
    const-string v30, "marginVertical"

    .line 90
    .line 91
    const-string v31, "marginHorizontal"

    .line 92
    .line 93
    const-string v32, "marginLeft"

    .line 94
    .line 95
    const-string v33, "marginRight"

    .line 96
    .line 97
    const-string v34, "marginTop"

    .line 98
    .line 99
    const-string v35, "marginBottom"

    .line 100
    .line 101
    const-string v36, "marginStart"

    .line 102
    .line 103
    const-string v37, "marginEnd"

    .line 104
    .line 105
    const-string v38, "padding"

    .line 106
    .line 107
    const-string v39, "paddingVertical"

    .line 108
    .line 109
    const-string v40, "paddingHorizontal"

    .line 110
    .line 111
    const-string v41, "paddingLeft"

    .line 112
    .line 113
    const-string v42, "paddingRight"

    .line 114
    .line 115
    const-string v43, "paddingTop"

    .line 116
    .line 117
    const-string v44, "paddingBottom"

    .line 118
    .line 119
    filled-new-array/range {v1 .. v46}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    sput-object v0, Lcom/facebook/react/uimanager/D0;->d:Ljava/util/HashSet;

    .line 131
    .line 132
    return-void

    .line 133
    :array_0
    .array-data 4
        0x8
        0x4
        0x5
        0x1
        0x3
        0x0
        0x2
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :array_1
    .array-data 4
        0x8
        0x7
        0x6
        0x4
        0x5
        0x1
        0x3
        0x0
        0x2
    .end array-data
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

.method public static final a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "prop"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/uimanager/D0;->d:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    const-string v0, "pointerEvents"

    .line 22
    .line 23
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string p1, "auto"

    .line 35
    .line 36
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    const-string p1, "box-none"

    .line 43
    .line 44
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return v2

    .line 52
    :cond_2
    :goto_0
    return v1

    .line 53
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const-wide/16 v3, 0x0

    .line 58
    .line 59
    const-string v5, "borderWidth"

    .line 60
    .line 61
    sparse-switch v0, :sswitch_data_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_9

    .line 65
    .line 66
    :sswitch_0
    const-string v0, "borderRadius"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_4
    const-string p1, "backgroundColor"

    .line 77
    .line 78
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v6, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 89
    .line 90
    if-ne v0, v6, :cond_5

    .line 91
    .line 92
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    return v2

    .line 99
    :cond_5
    sget-object p1, Lcom/facebook/react/bridge/ReadableType;->Null:Lcom/facebook/react/bridge/ReadableType;

    .line 100
    .line 101
    if-eq v0, p1, :cond_6

    .line 102
    .line 103
    return v2

    .line 104
    :cond_6
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_8

    .line 115
    .line 116
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 117
    .line 118
    .line 119
    move-result-wide p0

    .line 120
    cmpg-double p0, p0, v3

    .line 121
    .line 122
    if-nez p0, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    return v2

    .line 126
    :cond_8
    :goto_1
    return v1

    .line 127
    :sswitch_1
    const-string v0, "borderBlockEndColor"

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_9

    .line 134
    .line 135
    goto/16 :goto_9

    .line 136
    .line 137
    :cond_9
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 142
    .line 143
    if-ne p1, v3, :cond_a

    .line 144
    .line 145
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_a

    .line 150
    .line 151
    return v1

    .line 152
    :cond_a
    return v2

    .line 153
    :sswitch_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_b

    .line 158
    .line 159
    goto/16 :goto_9

    .line 160
    .line 161
    :cond_b
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_d

    .line 166
    .line 167
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 168
    .line 169
    .line 170
    move-result-wide p0

    .line 171
    cmpg-double p0, p0, v3

    .line 172
    .line 173
    if-nez p0, :cond_c

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_c
    return v2

    .line 177
    :cond_d
    :goto_2
    return v1

    .line 178
    :sswitch_3
    const-string v0, "borderBlockColor"

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_e

    .line 185
    .line 186
    goto/16 :goto_9

    .line 187
    .line 188
    :cond_e
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 193
    .line 194
    if-ne p1, v3, :cond_f

    .line 195
    .line 196
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_f

    .line 201
    .line 202
    return v1

    .line 203
    :cond_f
    return v2

    .line 204
    :sswitch_4
    const-string v0, "overflow"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-nez p1, :cond_10

    .line 211
    .line 212
    goto/16 :goto_9

    .line 213
    .line 214
    :cond_10
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_12

    .line 219
    .line 220
    const-string p1, "visible"

    .line 221
    .line 222
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-eqz p0, :cond_11

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_11
    return v2

    .line 234
    :cond_12
    :goto_3
    return v1

    .line 235
    :sswitch_5
    const-string v0, "borderBlockStartColor"

    .line 236
    .line 237
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-nez p1, :cond_13

    .line 242
    .line 243
    goto/16 :goto_9

    .line 244
    .line 245
    :cond_13
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 250
    .line 251
    if-ne p1, v3, :cond_14

    .line 252
    .line 253
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    if-nez p0, :cond_14

    .line 258
    .line 259
    return v1

    .line 260
    :cond_14
    return v2

    .line 261
    :sswitch_6
    const-string v0, "borderLeftWidth"

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-nez p1, :cond_15

    .line 268
    .line 269
    goto/16 :goto_9

    .line 270
    .line 271
    :cond_15
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-nez p1, :cond_17

    .line 276
    .line 277
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 278
    .line 279
    .line 280
    move-result-wide p0

    .line 281
    cmpg-double p0, p0, v3

    .line 282
    .line 283
    if-nez p0, :cond_16

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_16
    return v2

    .line 287
    :cond_17
    :goto_4
    return v1

    .line 288
    :sswitch_7
    const-string v0, "borderLeftColor"

    .line 289
    .line 290
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-nez p1, :cond_18

    .line 295
    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_18
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 303
    .line 304
    if-ne p1, v3, :cond_19

    .line 305
    .line 306
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    if-nez p0, :cond_19

    .line 311
    .line 312
    return v1

    .line 313
    :cond_19
    return v2

    .line 314
    :sswitch_8
    const-string v0, "opacity"

    .line 315
    .line 316
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-nez p1, :cond_1a

    .line 321
    .line 322
    goto/16 :goto_9

    .line 323
    .line 324
    :cond_1a
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    if-nez p1, :cond_1c

    .line 329
    .line 330
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 331
    .line 332
    .line 333
    move-result-wide p0

    .line 334
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 335
    .line 336
    cmpg-double p0, p0, v3

    .line 337
    .line 338
    if-nez p0, :cond_1b

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_1b
    return v2

    .line 342
    :cond_1c
    :goto_5
    return v1

    .line 343
    :sswitch_9
    const-string v0, "borderBottomWidth"

    .line 344
    .line 345
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    if-nez p1, :cond_1d

    .line 350
    .line 351
    goto/16 :goto_9

    .line 352
    .line 353
    :cond_1d
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-nez p1, :cond_1f

    .line 358
    .line 359
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 360
    .line 361
    .line 362
    move-result-wide p0

    .line 363
    cmpg-double p0, p0, v3

    .line 364
    .line 365
    if-nez p0, :cond_1e

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_1e
    return v2

    .line 369
    :cond_1f
    :goto_6
    return v1

    .line 370
    :sswitch_a
    const-string v0, "borderBottomColor"

    .line 371
    .line 372
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    if-nez p1, :cond_20

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_20
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 384
    .line 385
    if-ne p1, v3, :cond_21

    .line 386
    .line 387
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    if-nez p0, :cond_21

    .line 392
    .line 393
    return v1

    .line 394
    :cond_21
    return v2

    .line 395
    :sswitch_b
    const-string v0, "borderTopWidth"

    .line 396
    .line 397
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-nez p1, :cond_22

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_22
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    if-nez p1, :cond_24

    .line 409
    .line 410
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 411
    .line 412
    .line 413
    move-result-wide p0

    .line 414
    cmpg-double p0, p0, v3

    .line 415
    .line 416
    if-nez p0, :cond_23

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_23
    return v2

    .line 420
    :cond_24
    :goto_7
    return v1

    .line 421
    :sswitch_c
    const-string v0, "borderTopColor"

    .line 422
    .line 423
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result p1

    .line 427
    if-nez p1, :cond_25

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_25
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 435
    .line 436
    if-ne p1, v3, :cond_26

    .line 437
    .line 438
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    if-nez p0, :cond_26

    .line 443
    .line 444
    return v1

    .line 445
    :cond_26
    return v2

    .line 446
    :sswitch_d
    const-string v0, "borderRightWidth"

    .line 447
    .line 448
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result p1

    .line 452
    if-nez p1, :cond_27

    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_27
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    if-nez p1, :cond_29

    .line 460
    .line 461
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 462
    .line 463
    .line 464
    move-result-wide p0

    .line 465
    cmpg-double p0, p0, v3

    .line 466
    .line 467
    if-nez p0, :cond_28

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_28
    return v2

    .line 471
    :cond_29
    :goto_8
    return v1

    .line 472
    :sswitch_e
    const-string v0, "borderRightColor"

    .line 473
    .line 474
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    if-nez p1, :cond_2a

    .line 479
    .line 480
    :goto_9
    return v2

    .line 481
    :cond_2a
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 486
    .line 487
    if-ne p1, v3, :cond_2b

    .line 488
    .line 489
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    move-result p0

    .line 493
    if-nez p0, :cond_2b

    .line 494
    .line 495
    return v1

    .line 496
    :cond_2b
    return v2

    .line 497
    :sswitch_data_0
    .sparse-switch
        -0x7696880d -> :sswitch_e
        -0x757f89aa -> :sswitch_d
        -0x57ab08a6 -> :sswitch_c
        -0x56940a43 -> :sswitch_b
        -0x4e0397d4 -> :sswitch_a
        -0x4cec9971 -> :sswitch_9
        -0x4b8807f5 -> :sswitch_8
        -0xe70d730 -> :sswitch_7
        -0xd59d8cd -> :sswitch_6
        0x124be2c2 -> :sswitch_5
        0x1f91b402 -> :sswitch_4
        0x28ce5422 -> :sswitch_3
        0x2c2c84fa -> :sswitch_2
        0x2d7a3629 -> :sswitch_1
        0x506afbde -> :sswitch_0
    .end sparse-switch
.end method
