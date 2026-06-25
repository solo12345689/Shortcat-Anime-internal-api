.class public final Lcom/facebook/react/views/text/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lcom/facebook/react/views/text/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/text/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/text/b;->a:Lcom/facebook/react/views/text/b;

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

.method public static final a(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "text"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "layout"

    .line 11
    .line 12
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v3, "context"

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-direct {v5, v6}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/graphics/Paint;->getTextSize()F

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const/high16 v7, 0x42c80000    # 100.0f

    .line 48
    .line 49
    mul-float/2addr v6, v7

    .line 50
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v8, "T"

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v10, 0x1

    .line 62
    invoke-virtual {v5, v8, v9, v10, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    int-to-float v6, v6

    .line 70
    div-float/2addr v6, v7

    .line 71
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 72
    .line 73
    div-float/2addr v6, v8

    .line 74
    new-instance v8, Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v11, "x"

    .line 80
    .line 81
    invoke-virtual {v5, v11, v9, v10, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-float v5, v5

    .line 89
    div-float/2addr v5, v7

    .line 90
    iget v7, v3, Landroid/util/DisplayMetrics;->density:F

    .line 91
    .line 92
    div-float/2addr v5, v7

    .line 93
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    :goto_0
    if-ge v9, v7, :cond_1

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-lez v8, :cond_0

    .line 104
    .line 105
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineEnd(I)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    sub-int/2addr v8, v10

    .line 110
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    const/16 v12, 0xa

    .line 115
    .line 116
    if-ne v8, v12, :cond_0

    .line 117
    .line 118
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineMax(I)F

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    goto :goto_1

    .line 123
    :cond_0
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineWidth(I)F

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    :goto_1
    new-instance v12, Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v9, v12}, Landroid/text/Layout;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    new-instance v14, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 140
    .line 141
    invoke-direct {v14, v13}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineLeft(I)F

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    iget v10, v3, Landroid/util/DisplayMetrics;->density:F

    .line 149
    .line 150
    div-float/2addr v15, v10

    .line 151
    move v10, v7

    .line 152
    move/from16 v16, v8

    .line 153
    .line 154
    float-to-double v7, v15

    .line 155
    invoke-virtual {v14, v11, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 156
    .line 157
    .line 158
    iget v7, v12, Landroid/graphics/Rect;->top:I

    .line 159
    .line 160
    int-to-float v7, v7

    .line 161
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 162
    .line 163
    div-float/2addr v7, v8

    .line 164
    float-to-double v7, v7

    .line 165
    const-string v15, "y"

    .line 166
    .line 167
    invoke-virtual {v14, v15, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 168
    .line 169
    .line 170
    iget v7, v3, Landroid/util/DisplayMetrics;->density:F

    .line 171
    .line 172
    div-float v8, v16, v7

    .line 173
    .line 174
    float-to-double v7, v8

    .line 175
    const-string v15, "width"

    .line 176
    .line 177
    invoke-virtual {v14, v15, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Landroid/graphics/Rect;->height()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    int-to-float v7, v7

    .line 185
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 186
    .line 187
    div-float/2addr v7, v8

    .line 188
    float-to-double v7, v7

    .line 189
    const-string v12, "height"

    .line 190
    .line 191
    invoke-virtual {v14, v12, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineDescent(I)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    int-to-float v7, v7

    .line 199
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 200
    .line 201
    div-float/2addr v7, v8

    .line 202
    float-to-double v7, v7

    .line 203
    const-string v12, "descender"

    .line 204
    .line 205
    invoke-virtual {v14, v12, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineAscent(I)I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    neg-int v7, v7

    .line 213
    int-to-float v7, v7

    .line 214
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 215
    .line 216
    div-float/2addr v7, v8

    .line 217
    float-to-double v7, v7

    .line 218
    const-string v12, "ascender"

    .line 219
    .line 220
    invoke-virtual {v14, v12, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    int-to-float v7, v7

    .line 228
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    .line 229
    .line 230
    div-float/2addr v7, v8

    .line 231
    float-to-double v7, v7

    .line 232
    const-string v12, "baseline"

    .line 233
    .line 234
    invoke-virtual {v14, v12, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 235
    .line 236
    .line 237
    const-string v7, "capHeight"

    .line 238
    .line 239
    move v12, v10

    .line 240
    move-object v8, v11

    .line 241
    float-to-double v10, v6

    .line 242
    invoke-virtual {v14, v7, v10, v11}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 243
    .line 244
    .line 245
    const-string v7, "xHeight"

    .line 246
    .line 247
    float-to-double v10, v5

    .line 248
    invoke-virtual {v14, v7, v10, v11}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineStart(I)I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    invoke-virtual {v1, v9}, Landroid/text/Layout;->getLineEnd(I)I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-interface {v0, v7, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-virtual {v14, v2, v7}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v4, v13}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 271
    .line 272
    .line 273
    add-int/lit8 v9, v9, 0x1

    .line 274
    .line 275
    move-object v11, v8

    .line 276
    move v7, v12

    .line 277
    const/4 v10, 0x1

    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_1
    return-object v4
.end method
