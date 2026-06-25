.class Lcom/horcrux/svg/Y;
.super Lcom/horcrux/svg/l0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private q:Landroid/graphics/Path;

.field r:Ljava/lang/String;

.field private s:Lcom/horcrux/svg/Z;

.field private final t:Ljava/util/ArrayList;

.field private final u:Ljava/util/ArrayList;

.field private final v:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/l0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/Y;->t:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/horcrux/svg/Y;->u:Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 29
    .line 30
    return-void
.end method

.method private d0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget-wide v1, p2, Lcom/horcrux/svg/x;->n:D

    .line 4
    .line 5
    iget-wide v3, p2, Lcom/horcrux/svg/x;->a:D

    .line 6
    .line 7
    iget v5, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 8
    .line 9
    float-to-double v5, v5

    .line 10
    mul-double/2addr v3, v5

    .line 11
    div-double v3, v1, v3

    .line 12
    .line 13
    double-to-float v3, v3

    .line 14
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmpl-double v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p2, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/c0;

    .line 24
    .line 25
    sget-object v2, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/c0;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v2, p2, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v2, p2, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    const/16 v1, 0x1a

    .line 75
    .line 76
    if-lt v0, v1, :cond_1

    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "\'wght\' "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p2, Lcom/horcrux/svg/x;->f:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object p2, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {p1, p2}, LY0/n0;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method private e0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V
    .locals 10

    .line 1
    iget-object v0, p2, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/d0;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/d0;->c:Lcom/horcrux/svg/d0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    iget v0, p2, Lcom/horcrux/svg/x;->f:I

    .line 10
    .line 11
    const/16 v1, 0x226

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v3

    .line 19
    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/x;->c:Lcom/horcrux/svg/b0;

    .line 20
    .line 21
    sget-object v4, Lcom/horcrux/svg/b0;->b:Lcom/horcrux/svg/b0;

    .line 22
    .line 23
    if-ne v1, v4, :cond_2

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v1, v2

    .line 28
    :goto_2
    if-eqz v0, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    if-eqz v0, :cond_4

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_3

    .line 38
    :cond_4
    if-eqz v1, :cond_5

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/x;->f:I

    .line 42
    .line 43
    iget-object v4, p2, Lcom/horcrux/svg/x;->b:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-lez v6, :cond_7

    .line 53
    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v7, "fonts/"

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v8, ".otf"

    .line 68
    .line 69
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, ".ttf"

    .line 88
    .line 89
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    const/16 v9, 0x1a

    .line 99
    .line 100
    if-lt v8, v9, :cond_6

    .line 101
    .line 102
    invoke-static {}, Lcom/horcrux/svg/X;->a()V

    .line 103
    .line 104
    .line 105
    iget-object v5, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 106
    .line 107
    invoke-static {v5, v6}, LY0/l0;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v6, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v8, "\'wght\' "

    .line 117
    .line 118
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v9, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v5, v6}, Lcom/horcrux/svg/U;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v0}, Lcom/horcrux/svg/V;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v1}, Lcom/horcrux/svg/W;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 140
    .line 141
    .line 142
    invoke-static {v5}, LY0/j0;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    if-nez v5, :cond_7

    .line 147
    .line 148
    invoke-static {}, Lcom/horcrux/svg/X;->a()V

    .line 149
    .line 150
    .line 151
    iget-object v5, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 152
    .line 153
    invoke-static {v5, v7}, LY0/l0;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v6, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v7, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v5, v6}, Lcom/horcrux/svg/U;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 178
    .line 179
    .line 180
    invoke-static {v5, v0}, Lcom/horcrux/svg/V;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v1}, Lcom/horcrux/svg/W;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 184
    .line 185
    .line 186
    invoke-static {v5}, LY0/j0;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    goto :goto_4

    .line 191
    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 192
    .line 193
    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 198
    .line 199
    .line 200
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    goto :goto_4

    .line 202
    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 203
    .line 204
    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    .line 213
    .line 214
    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/e;->c()Lcom/facebook/react/views/text/e;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    iget-object v7, p0, Lcom/horcrux/svg/Y;->v:Landroid/content/res/AssetManager;

    .line 219
    .line 220
    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/e;->d(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 221
    .line 222
    .line 223
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 224
    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    const/16 v4, 0x1c

    .line 227
    .line 228
    if-lt v2, v4, :cond_9

    .line 229
    .line 230
    invoke-static {v5, v0, v1}, LY0/b0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 241
    .line 242
    .line 243
    iget-wide v0, p2, Lcom/horcrux/svg/x;->a:D

    .line 244
    .line 245
    iget p2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 246
    .line 247
    float-to-double v2, p2

    .line 248
    mul-double/2addr v0, v2

    .line 249
    double-to-float p2, v0

    .line 250
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 251
    .line 252
    .line 253
    const/4 p2, 0x0

    .line 254
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 255
    .line 256
    .line 257
    return-void
.end method

.method private f0(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->F()Lcom/horcrux/svg/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->H()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v3, Landroid/text/TextPaint;

    .line 13
    .line 14
    invoke-direct {v3, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/Y;->e0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/Y;->d0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->c()D

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    sget-object p2, Lcom/horcrux/svg/Y$a;->a:[I

    .line 28
    .line 29
    iget-object v1, v1, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/e0;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    aget p2, p2, v1

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-eq p2, v1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    if-eq p2, v1, :cond_0

    .line 42
    .line 43
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 50
    .line 51
    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/horcrux/svg/l0;->f:Lcom/horcrux/svg/SVGLength;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    int-to-double v5, v2

    .line 65
    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 66
    .line 67
    float-to-double v9, v2

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    invoke-static/range {v4 .. v12}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    double-to-int v7, v4

    .line 75
    const/4 v5, 0x1

    .line 76
    move-object v2, p0

    .line 77
    move-object v4, p2

    .line 78
    move-object v6, v1

    .line 79
    invoke-direct/range {v2 .. v7}, Lcom/horcrux/svg/Y;->i0(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineAscent(I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const-wide/16 v2, 0x0

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3}, Lcom/horcrux/svg/z;->l(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    double-to-float v2, v2

    .line 95
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->m()D

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    int-to-double v0, v1

    .line 100
    add-double/2addr v3, v0

    .line 101
    double-to-float v0, v3

    .line 102
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->G()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method private g0(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 10

    .line 1
    iget v0, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 2
    .line 3
    float-to-double v6, v0

    .line 4
    const-wide/16 v4, 0x0

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    move-wide v2, p2

    .line 8
    move-wide v8, p4

    .line 9
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
.end method

.method private h0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 68

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v7, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v8

    .line 11
    new-instance v9, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lcom/horcrux/svg/Y;->t:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lcom/horcrux/svg/Y;->u:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    if-nez v8, :cond_0

    .line 27
    .line 28
    :goto_0
    move-object v7, v0

    .line 29
    :goto_1
    move-object v1, v9

    .line 30
    goto/16 :goto_21

    .line 31
    .line 32
    :cond_0
    iget-object v1, v0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v12, 0x1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v12, v10

    .line 40
    :goto_2
    const-wide/16 v13, 0x0

    .line 41
    .line 42
    if-eqz v12, :cond_3

    .line 43
    .line 44
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 45
    .line 46
    iget-object v2, v0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 47
    .line 48
    invoke-virtual {v2, v7, v6}, Lcom/horcrux/svg/Z;->g0(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-direct {v1, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    float-to-double v2, v2

    .line 60
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->isClosed()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    cmpl-double v5, v2, v13

    .line 65
    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move/from16 v16, v4

    .line 70
    .line 71
    :goto_3
    move-object v15, v1

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    const/4 v1, 0x0

    .line 74
    move/from16 v16, v10

    .line 75
    .line 76
    move-wide v2, v13

    .line 77
    goto :goto_3

    .line 78
    :goto_4
    invoke-virtual {v0}, Lcom/horcrux/svg/B;->F()Lcom/horcrux/svg/z;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-direct {v0, v6, v4}, Lcom/horcrux/svg/Y;->e0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lcom/horcrux/svg/A;

    .line 90
    .line 91
    invoke-direct {v5, v6}, Lcom/horcrux/svg/A;-><init>(Landroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    move-wide/from16 v17, v13

    .line 95
    .line 96
    new-array v13, v8, [Z

    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    iget-wide v10, v4, Lcom/horcrux/svg/x;->l:D

    .line 103
    .line 104
    move-wide/from16 v20, v10

    .line 105
    .line 106
    iget-wide v10, v4, Lcom/horcrux/svg/x;->m:D

    .line 107
    .line 108
    move-wide/from16 v22, v10

    .line 109
    .line 110
    iget-wide v10, v4, Lcom/horcrux/svg/x;->n:D

    .line 111
    .line 112
    move-wide/from16 v24, v10

    .line 113
    .line 114
    iget-boolean v10, v4, Lcom/horcrux/svg/x;->o:Z

    .line 115
    .line 116
    cmpl-double v11, v24, v17

    .line 117
    .line 118
    if-nez v11, :cond_4

    .line 119
    .line 120
    iget-object v11, v4, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/c0;

    .line 121
    .line 122
    move-object/from16 v26, v1

    .line 123
    .line 124
    sget-object v1, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/c0;

    .line 125
    .line 126
    if-ne v11, v1, :cond_5

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    goto :goto_5

    .line 130
    :cond_4
    move-object/from16 v26, v1

    .line 131
    .line 132
    :cond_5
    const/4 v1, 0x0

    .line 133
    :goto_5
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 134
    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    move-wide/from16 v27, v2

    .line 143
    .line 144
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v2, v4, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    move-wide/from16 v27, v2

    .line 163
    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    iget-object v2, v4, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_6
    const/16 v1, 0x1a

    .line 187
    .line 188
    if-lt v11, v1, :cond_7

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v2, "\'wght\' "

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget v2, v4, Lcom/horcrux/svg/x;->f:I

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget-object v2, v4, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v6, v1}, LY0/n0;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    :cond_7
    iget-object v11, v4, Lcom/horcrux/svg/x;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 218
    .line 219
    new-array v1, v8, [F

    .line 220
    .line 221
    move-object/from16 v2, p1

    .line 222
    .line 223
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 224
    .line 225
    .line 226
    iget-object v2, v4, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/e0;

    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/horcrux/svg/l0;->Q()Lcom/horcrux/svg/l0;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3, v6}, Lcom/horcrux/svg/l0;->P(Landroid/graphics/Paint;)D

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    invoke-direct {v0, v2, v3, v4}, Lcom/horcrux/svg/Y;->j0(Lcom/horcrux/svg/e0;D)D

    .line 237
    .line 238
    .line 239
    move-result-wide v29

    .line 240
    invoke-virtual/range {v26 .. v26}, Lcom/horcrux/svg/z;->c()D

    .line 241
    .line 242
    .line 243
    move-result-wide v36

    .line 244
    const/16 v40, -0x1

    .line 245
    .line 246
    const-wide/high16 v41, 0x4000000000000000L    # 2.0

    .line 247
    .line 248
    if-eqz v12, :cond_c

    .line 249
    .line 250
    move-object/from16 v31, v1

    .line 251
    .line 252
    iget-object v1, v0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 253
    .line 254
    invoke-virtual {v1}, Lcom/horcrux/svg/Z;->d0()Lcom/horcrux/svg/i0;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    move-object/from16 v32, v2

    .line 259
    .line 260
    sget-object v2, Lcom/horcrux/svg/i0;->a:Lcom/horcrux/svg/i0;

    .line 261
    .line 262
    if-ne v1, v2, :cond_8

    .line 263
    .line 264
    const/16 v33, 0x1

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_8
    const/16 v33, 0x0

    .line 268
    .line 269
    :goto_7
    iget-object v1, v0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 270
    .line 271
    invoke-virtual {v1}, Lcom/horcrux/svg/Z;->e0()Lcom/horcrux/svg/j0;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    sget-object v2, Lcom/horcrux/svg/j0;->b:Lcom/horcrux/svg/j0;

    .line 276
    .line 277
    if-ne v1, v2, :cond_9

    .line 278
    .line 279
    move/from16 v34, v40

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_9
    const/16 v34, 0x1

    .line 283
    .line 284
    :goto_8
    iget-object v1, v0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 285
    .line 286
    invoke-virtual {v1}, Lcom/horcrux/svg/Z;->f0()Lcom/horcrux/svg/SVGLength;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    move-wide/from16 v44, v3

    .line 291
    .line 292
    move/from16 v43, v10

    .line 293
    .line 294
    move-object/from16 v10, v26

    .line 295
    .line 296
    move-wide/from16 v2, v27

    .line 297
    .line 298
    move-object/from16 v27, v31

    .line 299
    .line 300
    move/from16 v26, v12

    .line 301
    .line 302
    move-object/from16 v28, v13

    .line 303
    .line 304
    move-object/from16 v13, v32

    .line 305
    .line 306
    move-object v12, v5

    .line 307
    move-wide/from16 v4, v36

    .line 308
    .line 309
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Y;->g0(Lcom/horcrux/svg/SVGLength;DD)D

    .line 310
    .line 311
    .line 312
    move-result-wide v31

    .line 313
    move-wide/from16 v66, v2

    .line 314
    .line 315
    move-object v2, v0

    .line 316
    move-wide/from16 v0, v66

    .line 317
    .line 318
    add-double v29, v29, v31

    .line 319
    .line 320
    move-wide/from16 v38, v4

    .line 321
    .line 322
    if-eqz v16, :cond_b

    .line 323
    .line 324
    div-double v3, v0, v41

    .line 325
    .line 326
    sget-object v5, Lcom/horcrux/svg/e0;->b:Lcom/horcrux/svg/e0;

    .line 327
    .line 328
    if-ne v13, v5, :cond_a

    .line 329
    .line 330
    neg-double v3, v3

    .line 331
    goto :goto_9

    .line 332
    :cond_a
    move-wide/from16 v3, v17

    .line 333
    .line 334
    :goto_9
    add-double v31, v31, v3

    .line 335
    .line 336
    add-double v3, v31, v0

    .line 337
    .line 338
    move-wide/from16 v46, v29

    .line 339
    .line 340
    move-wide/from16 v48, v31

    .line 341
    .line 342
    move/from16 v13, v33

    .line 343
    .line 344
    move-wide/from16 v29, v3

    .line 345
    .line 346
    move/from16 v3, v34

    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_b
    move-wide/from16 v48, v17

    .line 350
    .line 351
    move-wide/from16 v46, v29

    .line 352
    .line 353
    move/from16 v13, v33

    .line 354
    .line 355
    move/from16 v3, v34

    .line 356
    .line 357
    :goto_a
    move-wide/from16 v29, v0

    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_c
    move-object v2, v0

    .line 361
    move-wide/from16 v44, v3

    .line 362
    .line 363
    move/from16 v43, v10

    .line 364
    .line 365
    move-object/from16 v10, v26

    .line 366
    .line 367
    move-wide/from16 v38, v36

    .line 368
    .line 369
    move/from16 v26, v12

    .line 370
    .line 371
    move-object v12, v5

    .line 372
    move-wide/from16 v66, v27

    .line 373
    .line 374
    move-object/from16 v27, v1

    .line 375
    .line 376
    move-object/from16 v28, v13

    .line 377
    .line 378
    move-wide/from16 v0, v66

    .line 379
    .line 380
    move-wide/from16 v48, v17

    .line 381
    .line 382
    move-wide/from16 v46, v29

    .line 383
    .line 384
    const/4 v3, 0x1

    .line 385
    const/4 v13, 0x0

    .line 386
    goto :goto_a

    .line 387
    :goto_b
    iget-object v4, v2, Lcom/horcrux/svg/l0;->g:Lcom/horcrux/svg/SVGLength;

    .line 388
    .line 389
    const-wide/high16 v50, 0x3ff0000000000000L    # 1.0

    .line 390
    .line 391
    if-eqz v4, :cond_f

    .line 392
    .line 393
    invoke-virtual {v7}, Landroid/graphics/Canvas;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    move-object/from16 v31, v4

    .line 398
    .line 399
    int-to-double v4, v5

    .line 400
    move-wide/from16 v32, v4

    .line 401
    .line 402
    iget v4, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 403
    .line 404
    float-to-double v4, v4

    .line 405
    const-wide/16 v34, 0x0

    .line 406
    .line 407
    move-wide/from16 v36, v4

    .line 408
    .line 409
    invoke-static/range {v31 .. v39}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 410
    .line 411
    .line 412
    move-result-wide v4

    .line 413
    cmpg-double v16, v4, v17

    .line 414
    .line 415
    if-ltz v16, :cond_e

    .line 416
    .line 417
    sget-object v16, Lcom/horcrux/svg/Y$a;->b:[I

    .line 418
    .line 419
    move-wide/from16 v31, v4

    .line 420
    .line 421
    iget-object v4, v2, Lcom/horcrux/svg/l0;->i:Lcom/horcrux/svg/g0;

    .line 422
    .line 423
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    aget v4, v16, v4

    .line 428
    .line 429
    const/4 v5, 0x2

    .line 430
    if-eq v4, v5, :cond_d

    .line 431
    .line 432
    sub-double v4, v31, v44

    .line 433
    .line 434
    move-wide/from16 v31, v4

    .line 435
    .line 436
    add-int/lit8 v4, v8, -0x1

    .line 437
    .line 438
    int-to-double v4, v4

    .line 439
    div-double v4, v31, v4

    .line 440
    .line 441
    add-double v4, v24, v4

    .line 442
    .line 443
    move-wide/from16 v24, v4

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_d
    div-double v50, v31, v44

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 450
    .line 451
    const-string v1, "Negative textLength value"

    .line 452
    .line 453
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v0

    .line 457
    :cond_f
    :goto_c
    int-to-double v4, v3

    .line 458
    move-wide/from16 v44, v4

    .line 459
    .line 460
    mul-double v4, v50, v44

    .line 461
    .line 462
    move/from16 v16, v13

    .line 463
    .line 464
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    move-object/from16 v52, v14

    .line 469
    .line 470
    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 471
    .line 472
    move/from16 v53, v3

    .line 473
    .line 474
    move-wide/from16 v54, v4

    .line 475
    .line 476
    float-to-double v3, v14

    .line 477
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->leading:F

    .line 478
    .line 479
    move-wide/from16 v56, v0

    .line 480
    .line 481
    float-to-double v0, v5

    .line 482
    add-double/2addr v0, v3

    .line 483
    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 484
    .line 485
    neg-float v14, v14

    .line 486
    add-float/2addr v14, v5

    .line 487
    move-wide/from16 v31, v0

    .line 488
    .line 489
    float-to-double v0, v14

    .line 490
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 491
    .line 492
    neg-float v5, v5

    .line 493
    float-to-double v13, v5

    .line 494
    add-double v33, v13, v31

    .line 495
    .line 496
    invoke-virtual {v2}, Lcom/horcrux/svg/l0;->N()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-virtual {v2}, Lcom/horcrux/svg/l0;->M()Lcom/horcrux/svg/a0;

    .line 501
    .line 502
    .line 503
    move-result-object v35

    .line 504
    if-eqz v35, :cond_10

    .line 505
    .line 506
    sget-object v36, Lcom/horcrux/svg/Y$a;->c:[I

    .line 507
    .line 508
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    .line 509
    .line 510
    .line 511
    move-result v37

    .line 512
    aget v36, v36, v37

    .line 513
    .line 514
    packed-switch v36, :pswitch_data_0

    .line 515
    .line 516
    .line 517
    move-wide/from16 v0, v17

    .line 518
    .line 519
    :goto_d
    :pswitch_0
    const/4 v13, 0x0

    .line 520
    goto :goto_f

    .line 521
    :pswitch_1
    move-wide v0, v13

    .line 522
    goto :goto_d

    .line 523
    :pswitch_2
    div-double v0, v33, v41

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :pswitch_3
    move-wide/from16 v0, v31

    .line 527
    .line 528
    goto :goto_d

    .line 529
    :pswitch_4
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    :goto_e
    mul-double/2addr v0, v3

    .line 535
    goto :goto_d

    .line 536
    :pswitch_5
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 537
    .line 538
    goto :goto_e

    .line 539
    :pswitch_6
    sub-double/2addr v0, v3

    .line 540
    div-double v0, v0, v41

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :pswitch_7
    new-instance v0, Landroid/graphics/Rect;

    .line 544
    .line 545
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 546
    .line 547
    .line 548
    const-string v1, "x"

    .line 549
    .line 550
    const/4 v3, 0x1

    .line 551
    const/4 v13, 0x0

    .line 552
    invoke-virtual {v6, v1, v13, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    int-to-double v0, v0

    .line 560
    div-double v0, v0, v41

    .line 561
    .line 562
    goto :goto_f

    .line 563
    :pswitch_8
    const/4 v13, 0x0

    .line 564
    neg-double v0, v3

    .line 565
    goto :goto_f

    .line 566
    :cond_10
    :pswitch_9
    const/4 v13, 0x0

    .line 567
    move-wide/from16 v0, v17

    .line 568
    .line 569
    :goto_f
    if-eqz v5, :cond_14

    .line 570
    .line 571
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    if-nez v3, :cond_14

    .line 576
    .line 577
    sget-object v3, Lcom/horcrux/svg/Y$a;->c:[I

    .line 578
    .line 579
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    aget v3, v3, v4

    .line 584
    .line 585
    const/16 v4, 0xe

    .line 586
    .line 587
    if-eq v3, v4, :cond_14

    .line 588
    .line 589
    const/16 v4, 0x10

    .line 590
    .line 591
    if-eq v3, v4, :cond_14

    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    sparse-switch v3, :sswitch_data_0

    .line 598
    .line 599
    .line 600
    goto :goto_10

    .line 601
    :sswitch_0
    const-string v3, "super"

    .line 602
    .line 603
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-nez v3, :cond_11

    .line 608
    .line 609
    goto :goto_10

    .line 610
    :cond_11
    const/16 v40, 0x2

    .line 611
    .line 612
    goto :goto_10

    .line 613
    :sswitch_1
    const-string v3, "sub"

    .line 614
    .line 615
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-nez v3, :cond_12

    .line 620
    .line 621
    goto :goto_10

    .line 622
    :cond_12
    const/16 v40, 0x1

    .line 623
    .line 624
    goto :goto_10

    .line 625
    :sswitch_2
    const-string v3, "baseline"

    .line 626
    .line 627
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-nez v3, :cond_13

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_13
    move/from16 v40, v13

    .line 635
    .line 636
    :goto_10
    const-string v3, "os2"

    .line 637
    .line 638
    const-string v4, "unitsPerEm"

    .line 639
    .line 640
    const-string v14, "tables"

    .line 641
    .line 642
    packed-switch v40, :pswitch_data_1

    .line 643
    .line 644
    .line 645
    iget v3, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 646
    .line 647
    float-to-double v13, v3

    .line 648
    mul-double v32, v13, v38

    .line 649
    .line 650
    float-to-double v3, v3

    .line 651
    move-wide/from16 v34, v3

    .line 652
    .line 653
    move-object/from16 v31, v5

    .line 654
    .line 655
    move-wide/from16 v36, v38

    .line 656
    .line 657
    invoke-static/range {v31 .. v37}, Lcom/horcrux/svg/M;->b(Ljava/lang/String;DDD)D

    .line 658
    .line 659
    .line 660
    move-result-wide v3

    .line 661
    sub-double/2addr v0, v3

    .line 662
    :cond_14
    :goto_11
    :pswitch_a
    move-wide/from16 v31, v0

    .line 663
    .line 664
    goto/16 :goto_12

    .line 665
    .line 666
    :pswitch_b
    if-eqz v11, :cond_14

    .line 667
    .line 668
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    if-eqz v5, :cond_14

    .line 673
    .line 674
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    if-eqz v5, :cond_14

    .line 679
    .line 680
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 689
    .line 690
    .line 691
    move-result v11

    .line 692
    if-eqz v11, :cond_15

    .line 693
    .line 694
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    const-string v5, "ySuperscriptYOffset"

    .line 699
    .line 700
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 701
    .line 702
    .line 703
    move-result v11

    .line 704
    if-eqz v11, :cond_15

    .line 705
    .line 706
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 707
    .line 708
    .line 709
    move-result-wide v13

    .line 710
    iget v3, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 711
    .line 712
    move-wide/from16 v31, v0

    .line 713
    .line 714
    float-to-double v0, v3

    .line 715
    mul-double v0, v0, v38

    .line 716
    .line 717
    mul-double/2addr v0, v13

    .line 718
    int-to-double v3, v4

    .line 719
    div-double/2addr v0, v3

    .line 720
    sub-double v0, v31, v0

    .line 721
    .line 722
    goto :goto_11

    .line 723
    :cond_15
    move-wide/from16 v31, v0

    .line 724
    .line 725
    :cond_16
    move-wide/from16 v0, v31

    .line 726
    .line 727
    goto :goto_11

    .line 728
    :pswitch_c
    move-wide/from16 v31, v0

    .line 729
    .line 730
    if-eqz v11, :cond_17

    .line 731
    .line 732
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-eqz v0, :cond_17

    .line 737
    .line 738
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    if-eqz v0, :cond_17

    .line 743
    .line 744
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    if-eqz v4, :cond_16

    .line 757
    .line 758
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    const-string v3, "ySubscriptYOffset"

    .line 763
    .line 764
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_16

    .line 769
    .line 770
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 771
    .line 772
    .line 773
    move-result-wide v3

    .line 774
    iget v1, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 775
    .line 776
    float-to-double v13, v1

    .line 777
    mul-double v13, v13, v38

    .line 778
    .line 779
    mul-double/2addr v13, v3

    .line 780
    int-to-double v0, v0

    .line 781
    div-double/2addr v13, v0

    .line 782
    add-double v0, v31, v13

    .line 783
    .line 784
    goto :goto_11

    .line 785
    :cond_17
    :goto_12
    new-instance v11, Landroid/graphics/Matrix;

    .line 786
    .line 787
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 788
    .line 789
    .line 790
    new-instance v13, Landroid/graphics/Matrix;

    .line 791
    .line 792
    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 793
    .line 794
    .line 795
    new-instance v14, Landroid/graphics/Matrix;

    .line 796
    .line 797
    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    .line 798
    .line 799
    .line 800
    const/16 v0, 0x9

    .line 801
    .line 802
    new-array v1, v0, [F

    .line 803
    .line 804
    new-array v0, v0, [F

    .line 805
    .line 806
    const/4 v3, 0x0

    .line 807
    :goto_13
    if-ge v3, v8, :cond_29

    .line 808
    .line 809
    aget-char v4, v52, v3

    .line 810
    .line 811
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    aget-boolean v33, v28, v3

    .line 816
    .line 817
    if-eqz v33, :cond_18

    .line 818
    .line 819
    const-string v5, ""

    .line 820
    .line 821
    const/16 v34, 0x0

    .line 822
    .line 823
    const/16 v36, 0x0

    .line 824
    .line 825
    goto :goto_15

    .line 826
    :cond_18
    move/from16 v19, v3

    .line 827
    .line 828
    const/16 v34, 0x0

    .line 829
    .line 830
    const/16 v36, 0x0

    .line 831
    .line 832
    :goto_14
    const/16 v35, 0x1

    .line 833
    .line 834
    add-int/lit8 v2, v19, 0x1

    .line 835
    .line 836
    if-ge v2, v8, :cond_1a

    .line 837
    .line 838
    aget v35, v27, v2

    .line 839
    .line 840
    cmpl-float v35, v35, v36

    .line 841
    .line 842
    if-lez v35, :cond_19

    .line 843
    .line 844
    goto :goto_15

    .line 845
    :cond_19
    move/from16 v35, v2

    .line 846
    .line 847
    new-instance v2, Ljava/lang/StringBuilder;

    .line 848
    .line 849
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    aget-char v5, v52, v35

    .line 856
    .line 857
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v5

    .line 864
    const/16 v19, 0x1

    .line 865
    .line 866
    aput-boolean v19, v28, v35

    .line 867
    .line 868
    move/from16 v19, v35

    .line 869
    .line 870
    const/16 v34, 0x1

    .line 871
    .line 872
    goto :goto_14

    .line 873
    :cond_1a
    :goto_15
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    move/from16 v35, v3

    .line 878
    .line 879
    float-to-double v2, v2

    .line 880
    mul-double v2, v2, v50

    .line 881
    .line 882
    move-wide/from16 v37, v2

    .line 883
    .line 884
    if-nez v43, :cond_1b

    .line 885
    .line 886
    aget v2, v27, v35

    .line 887
    .line 888
    float-to-double v2, v2

    .line 889
    mul-double v2, v2, v50

    .line 890
    .line 891
    sub-double v2, v2, v37

    .line 892
    .line 893
    move-wide/from16 v20, v2

    .line 894
    .line 895
    :cond_1b
    const/16 v2, 0x20

    .line 896
    .line 897
    if-ne v4, v2, :cond_1c

    .line 898
    .line 899
    const/4 v2, 0x1

    .line 900
    goto :goto_16

    .line 901
    :cond_1c
    const/4 v2, 0x0

    .line 902
    :goto_16
    if-eqz v2, :cond_1d

    .line 903
    .line 904
    move-wide/from16 v39, v22

    .line 905
    .line 906
    goto :goto_17

    .line 907
    :cond_1d
    move-wide/from16 v39, v17

    .line 908
    .line 909
    :goto_17
    add-double v39, v39, v24

    .line 910
    .line 911
    add-double v39, v37, v39

    .line 912
    .line 913
    if-eqz v33, :cond_1e

    .line 914
    .line 915
    move/from16 v60, v2

    .line 916
    .line 917
    move-wide/from16 v2, v17

    .line 918
    .line 919
    goto :goto_18

    .line 920
    :cond_1e
    add-double v58, v20, v39

    .line 921
    .line 922
    move/from16 v60, v2

    .line 923
    .line 924
    move-wide/from16 v2, v58

    .line 925
    .line 926
    :goto_18
    invoke-virtual {v10, v2, v3}, Lcom/horcrux/svg/z;->l(D)D

    .line 927
    .line 928
    .line 929
    move-result-wide v2

    .line 930
    move-wide/from16 v58, v2

    .line 931
    .line 932
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->m()D

    .line 933
    .line 934
    .line 935
    move-result-wide v2

    .line 936
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->i()D

    .line 937
    .line 938
    .line 939
    move-result-wide v61

    .line 940
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->j()D

    .line 941
    .line 942
    .line 943
    move-result-wide v63

    .line 944
    move-object/from16 v65, v5

    .line 945
    .line 946
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->k()D

    .line 947
    .line 948
    .line 949
    move-result-wide v5

    .line 950
    if-nez v33, :cond_1f

    .line 951
    .line 952
    if-eqz v60, :cond_20

    .line 953
    .line 954
    :cond_1f
    move-object/from16 v62, v0

    .line 955
    .line 956
    move-object v3, v7

    .line 957
    move/from16 v33, v8

    .line 958
    .line 959
    move-object/from16 v40, v10

    .line 960
    .line 961
    move-object v2, v12

    .line 962
    move-object v10, v13

    .line 963
    const/4 v4, 0x1

    .line 964
    move-object/from16 v7, p0

    .line 965
    .line 966
    move-object/from16 v0, p2

    .line 967
    .line 968
    move-object v8, v1

    .line 969
    move-object v1, v9

    .line 970
    const/4 v9, 0x2

    .line 971
    goto/16 :goto_20

    .line 972
    .line 973
    :cond_20
    mul-double v39, v39, v44

    .line 974
    .line 975
    mul-double v37, v37, v44

    .line 976
    .line 977
    add-double v58, v58, v61

    .line 978
    .line 979
    mul-double v58, v58, v44

    .line 980
    .line 981
    add-double v58, v46, v58

    .line 982
    .line 983
    move/from16 v33, v8

    .line 984
    .line 985
    move-object/from16 v60, v9

    .line 986
    .line 987
    sub-double v8, v58, v39

    .line 988
    .line 989
    if-eqz v26, :cond_26

    .line 990
    .line 991
    move/from16 v39, v4

    .line 992
    .line 993
    move-wide/from16 v58, v5

    .line 994
    .line 995
    add-double v4, v8, v37

    .line 996
    .line 997
    div-double v6, v37, v41

    .line 998
    .line 999
    move-wide/from16 v37, v2

    .line 1000
    .line 1001
    add-double v2, v8, v6

    .line 1002
    .line 1003
    cmpl-double v40, v2, v29

    .line 1004
    .line 1005
    if-lez v40, :cond_21

    .line 1006
    .line 1007
    :goto_19
    move-object/from16 v7, p0

    .line 1008
    .line 1009
    move-object/from16 v3, p3

    .line 1010
    .line 1011
    move-object/from16 v62, v0

    .line 1012
    .line 1013
    move-object v8, v1

    .line 1014
    move-object/from16 v40, v10

    .line 1015
    .line 1016
    move-object v2, v12

    .line 1017
    move-object v10, v13

    .line 1018
    move-object/from16 v1, v60

    .line 1019
    .line 1020
    const/4 v4, 0x1

    .line 1021
    const/4 v9, 0x2

    .line 1022
    move-object/from16 v0, p2

    .line 1023
    .line 1024
    goto/16 :goto_20

    .line 1025
    .line 1026
    :cond_21
    cmpg-double v40, v2, v48

    .line 1027
    .line 1028
    if-gez v40, :cond_22

    .line 1029
    .line 1030
    goto :goto_19

    .line 1031
    :cond_22
    move-object/from16 v40, v10

    .line 1032
    .line 1033
    const/4 v10, 0x3

    .line 1034
    if-eqz v16, :cond_23

    .line 1035
    .line 1036
    double-to-float v2, v2

    .line 1037
    invoke-virtual {v15, v2, v13, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1038
    .line 1039
    .line 1040
    move-object/from16 v62, v0

    .line 1041
    .line 1042
    move-object/from16 v61, v12

    .line 1043
    .line 1044
    move-object v10, v13

    .line 1045
    move-wide/from16 v2, v56

    .line 1046
    .line 1047
    const/16 p1, 0x2

    .line 1048
    .line 1049
    move-object/from16 v57, v1

    .line 1050
    .line 1051
    goto :goto_1c

    .line 1052
    :cond_23
    cmpg-double v61, v8, v17

    .line 1053
    .line 1054
    if-gez v61, :cond_24

    .line 1055
    .line 1056
    move-object/from16 v61, v12

    .line 1057
    .line 1058
    move/from16 v12, v36

    .line 1059
    .line 1060
    invoke-virtual {v15, v12, v11, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1061
    .line 1062
    .line 1063
    double-to-float v8, v8

    .line 1064
    invoke-virtual {v11, v8, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1065
    .line 1066
    .line 1067
    const/4 v9, 0x1

    .line 1068
    goto :goto_1a

    .line 1069
    :cond_24
    move-object/from16 v61, v12

    .line 1070
    .line 1071
    double-to-float v8, v8

    .line 1072
    const/4 v9, 0x1

    .line 1073
    invoke-virtual {v15, v8, v11, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1074
    .line 1075
    .line 1076
    :goto_1a
    double-to-float v2, v2

    .line 1077
    invoke-virtual {v15, v2, v13, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1078
    .line 1079
    .line 1080
    cmpl-double v2, v4, v56

    .line 1081
    .line 1082
    if-lez v2, :cond_25

    .line 1083
    .line 1084
    move-wide/from16 v2, v56

    .line 1085
    .line 1086
    double-to-float v8, v2

    .line 1087
    invoke-virtual {v15, v8, v14, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1088
    .line 1089
    .line 1090
    sub-double/2addr v4, v2

    .line 1091
    double-to-float v4, v4

    .line 1092
    const/4 v12, 0x0

    .line 1093
    invoke-virtual {v14, v4, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1094
    .line 1095
    .line 1096
    goto :goto_1b

    .line 1097
    :cond_25
    move-wide/from16 v2, v56

    .line 1098
    .line 1099
    double-to-float v4, v4

    .line 1100
    invoke-virtual {v15, v4, v14, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1101
    .line 1102
    .line 1103
    :goto_1b
    invoke-virtual {v11, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v14, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1107
    .line 1108
    .line 1109
    const/4 v5, 0x2

    .line 1110
    aget v4, v1, v5

    .line 1111
    .line 1112
    float-to-double v8, v4

    .line 1113
    const/4 v4, 0x5

    .line 1114
    aget v10, v1, v4

    .line 1115
    .line 1116
    move v12, v4

    .line 1117
    move/from16 p1, v5

    .line 1118
    .line 1119
    float-to-double v4, v10

    .line 1120
    aget v10, v0, p1

    .line 1121
    .line 1122
    move/from16 v57, v12

    .line 1123
    .line 1124
    move-object/from16 v56, v13

    .line 1125
    .line 1126
    float-to-double v12, v10

    .line 1127
    aget v10, v0, v57

    .line 1128
    .line 1129
    move-object/from16 v62, v0

    .line 1130
    .line 1131
    move-object/from16 v57, v1

    .line 1132
    .line 1133
    float-to-double v0, v10

    .line 1134
    sub-double/2addr v12, v8

    .line 1135
    sub-double/2addr v0, v4

    .line 1136
    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 1137
    .line 1138
    .line 1139
    move-result-wide v0

    .line 1140
    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    mul-double/2addr v0, v4

    .line 1146
    mul-double v0, v0, v44

    .line 1147
    .line 1148
    double-to-float v0, v0

    .line 1149
    move-object/from16 v10, v56

    .line 1150
    .line 1151
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 1152
    .line 1153
    .line 1154
    :goto_1c
    neg-double v0, v6

    .line 1155
    double-to-float v0, v0

    .line 1156
    add-double v4, v63, v31

    .line 1157
    .line 1158
    double-to-float v1, v4

    .line 1159
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1160
    .line 1161
    .line 1162
    move-wide/from16 v4, v54

    .line 1163
    .line 1164
    double-to-float v0, v4

    .line 1165
    move/from16 v1, v53

    .line 1166
    .line 1167
    int-to-float v6, v1

    .line 1168
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 1169
    .line 1170
    .line 1171
    move-wide/from16 v6, v37

    .line 1172
    .line 1173
    double-to-float v0, v6

    .line 1174
    const/4 v12, 0x0

    .line 1175
    invoke-virtual {v10, v12, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1176
    .line 1177
    .line 1178
    :goto_1d
    move-wide/from16 v6, v58

    .line 1179
    .line 1180
    goto :goto_1e

    .line 1181
    :cond_26
    move-object/from16 v62, v0

    .line 1182
    .line 1183
    move/from16 v39, v4

    .line 1184
    .line 1185
    move-wide/from16 v58, v5

    .line 1186
    .line 1187
    move-object/from16 v40, v10

    .line 1188
    .line 1189
    move-object/from16 v61, v12

    .line 1190
    .line 1191
    move-object v10, v13

    .line 1192
    move/from16 v12, v36

    .line 1193
    .line 1194
    move-wide/from16 v4, v54

    .line 1195
    .line 1196
    const/16 p1, 0x2

    .line 1197
    .line 1198
    move-wide v6, v2

    .line 1199
    move-wide/from16 v2, v56

    .line 1200
    .line 1201
    move-object/from16 v57, v1

    .line 1202
    .line 1203
    move/from16 v1, v53

    .line 1204
    .line 1205
    double-to-float v0, v8

    .line 1206
    add-double v6, v6, v63

    .line 1207
    .line 1208
    add-double v6, v6, v31

    .line 1209
    .line 1210
    double-to-float v6, v6

    .line 1211
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_1d

    .line 1215
    :goto_1e
    double-to-float v0, v6

    .line 1216
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 1217
    .line 1218
    .line 1219
    if-eqz v34, :cond_27

    .line 1220
    .line 1221
    new-instance v6, Landroid/graphics/Path;

    .line 1222
    .line 1223
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 1224
    .line 1225
    .line 1226
    move-wide v7, v2

    .line 1227
    invoke-virtual/range {v65 .. v65}, Ljava/lang/String;->length()I

    .line 1228
    .line 1229
    .line 1230
    move-result v3

    .line 1231
    move-wide/from16 v54, v4

    .line 1232
    .line 1233
    const/4 v4, 0x0

    .line 1234
    const/4 v5, 0x0

    .line 1235
    const/4 v2, 0x0

    .line 1236
    move-wide/from16 v66, v7

    .line 1237
    .line 1238
    move-object/from16 v8, v57

    .line 1239
    .line 1240
    move-wide/from16 v56, v66

    .line 1241
    .line 1242
    move-object/from16 v7, p0

    .line 1243
    .line 1244
    move/from16 v9, p1

    .line 1245
    .line 1246
    move-object/from16 v0, p2

    .line 1247
    .line 1248
    move/from16 v53, v1

    .line 1249
    .line 1250
    move-object/from16 v1, v65

    .line 1251
    .line 1252
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 1253
    .line 1254
    .line 1255
    move-object/from16 v2, v61

    .line 1256
    .line 1257
    goto :goto_1f

    .line 1258
    :cond_27
    move-object/from16 v7, p0

    .line 1259
    .line 1260
    move/from16 v9, p1

    .line 1261
    .line 1262
    move-object/from16 v0, p2

    .line 1263
    .line 1264
    move/from16 v53, v1

    .line 1265
    .line 1266
    move-wide/from16 v54, v4

    .line 1267
    .line 1268
    move-object/from16 v8, v57

    .line 1269
    .line 1270
    move-object/from16 v1, v65

    .line 1271
    .line 1272
    move-wide/from16 v56, v2

    .line 1273
    .line 1274
    move/from16 v3, v39

    .line 1275
    .line 1276
    move-object/from16 v2, v61

    .line 1277
    .line 1278
    invoke-virtual {v2, v3, v1}, Lcom/horcrux/svg/A;->b(CLjava/lang/String;)Landroid/graphics/Path;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v6

    .line 1282
    :goto_1f
    new-instance v3, Landroid/graphics/RectF;

    .line 1283
    .line 1284
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 1285
    .line 1286
    .line 1287
    const/4 v4, 0x1

    .line 1288
    invoke-virtual {v6, v3, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 1292
    .line 1293
    .line 1294
    move-result v3

    .line 1295
    cmpl-float v3, v3, v12

    .line 1296
    .line 1297
    if-nez v3, :cond_28

    .line 1298
    .line 1299
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 1300
    .line 1301
    .line 1302
    move-object/from16 v3, p3

    .line 1303
    .line 1304
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1305
    .line 1306
    .line 1307
    iget-object v5, v7, Lcom/horcrux/svg/Y;->t:Ljava/util/ArrayList;

    .line 1308
    .line 1309
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1310
    .line 1311
    .line 1312
    iget-object v5, v7, Lcom/horcrux/svg/Y;->u:Ljava/util/ArrayList;

    .line 1313
    .line 1314
    new-instance v6, Landroid/graphics/Matrix;

    .line 1315
    .line 1316
    invoke-direct {v6, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v3, v1, v12, v12, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 1326
    .line 1327
    .line 1328
    move-object/from16 v1, v60

    .line 1329
    .line 1330
    goto :goto_20

    .line 1331
    :cond_28
    move-object/from16 v3, p3

    .line 1332
    .line 1333
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 1334
    .line 1335
    .line 1336
    move-object/from16 v1, v60

    .line 1337
    .line 1338
    invoke-virtual {v1, v6}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1339
    .line 1340
    .line 1341
    :goto_20
    add-int/lit8 v5, v35, 0x1

    .line 1342
    .line 1343
    move-object v6, v0

    .line 1344
    move-object v9, v1

    .line 1345
    move-object v12, v2

    .line 1346
    move-object v2, v7

    .line 1347
    move-object v1, v8

    .line 1348
    move-object v13, v10

    .line 1349
    move/from16 v8, v33

    .line 1350
    .line 1351
    move-object/from16 v10, v40

    .line 1352
    .line 1353
    move-object/from16 v0, v62

    .line 1354
    .line 1355
    move-object v7, v3

    .line 1356
    move v3, v5

    .line 1357
    goto/16 :goto_13

    .line 1358
    .line 1359
    :cond_29
    move-object v7, v2

    .line 1360
    goto/16 :goto_1

    .line 1361
    .line 1362
    :goto_21
    return-object v1

    .line 1363
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private i0(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {p4, v0, v1, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    const/high16 p4, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method private j0(Lcom/horcrux/svg/e0;D)D
    .locals 2

    .line 1
    sget-object v0, Lcom/horcrux/svg/Y$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_0
    neg-double p1, p2

    .line 19
    return-wide p1

    .line 20
    :cond_1
    neg-double p1, p2

    .line 21
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 22
    .line 23
    div-double/2addr p1, v0

    .line 24
    return-wide p1
.end method

.method private l0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Lcom/horcrux/svg/Z;

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/horcrux/svg/Z;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/horcrux/svg/Y;->s:Lcom/horcrux/svg/Z;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/l0;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
.end method

.method public static m0(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    new-instance v0, Ljava/text/Bidi;

    .line 11
    .line 12
    const/4 v1, -0x2

    .line 13
    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    new-array v2, v1, [B

    .line 28
    .line 29
    new-array v3, v1, [Ljava/lang/Integer;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    :goto_0
    if-ge v5, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    int-to-byte v6, v6

    .line 40
    aput-byte v6, v2, v5

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aput-object v6, v3, v5

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    :goto_1
    if-ge v4, v1, :cond_5

    .line 60
    .line 61
    aget-object v6, v3, v4

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    aget-byte v6, v2, v6

    .line 76
    .line 77
    and-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    :goto_2
    add-int/lit8 v8, v8, -0x1

    .line 82
    .line 83
    if-lt v8, v7, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_6
    :goto_3
    return-object p0
.end method


# virtual methods
.method P(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/l0;->p:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/horcrux/svg/l0;->p:D

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v0, v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    instance-of v4, v3, Lcom/horcrux/svg/l0;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v3, Lcom/horcrux/svg/l0;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/l0;->P(Landroid/graphics/Paint;)D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    add-double/2addr v1, v3

    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/l0;->p:D

    .line 44
    .line 45
    return-wide v1

    .line 46
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    iput-wide v1, p0, Lcom/horcrux/svg/l0;->p:D

    .line 53
    .line 54
    return-wide v1

    .line 55
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->F()Lcom/horcrux/svg/z;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/Y;->e0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/Y;->d0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    float-to-double v0, p1

    .line 74
    iput-wide v0, p0, Lcom/horcrux/svg/l0;->p:D

    .line 75
    .line 76
    return-wide v0
.end method

.method clearCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/l0;->clearCache()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/horcrux/svg/l0;->f:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmpl-double v0, v0, v2

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->fillOpacity:F

    .line 18
    .line 19
    mul-float/2addr v0, p3

    .line 20
    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/RenderableView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/Y;->f0(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->strokeOpacity:F

    .line 30
    .line 31
    mul-float/2addr p3, v0

    .line 32
    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/RenderableView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/Y;->f0(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/horcrux/svg/Y;->t:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-lez v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->F()Lcom/horcrux/svg/z;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {p0, p2, v1}, Lcom/horcrux/svg/Y;->e0(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_0
    if-ge v1, v0, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, Lcom/horcrux/svg/Y;->t:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p0, Lcom/horcrux/svg/Y;->u:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->C(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->B(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/l0;->O(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-direct {p0}, Lcom/horcrux/svg/Y;->l0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->H()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/horcrux/svg/Y;->m0(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0, p2, p1}, Lcom/horcrux/svg/Y;->h0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->G()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 39
    .line 40
    return-object p1
.end method

.method hitTest([F)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/horcrux/svg/B;->hitTest([F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mInvertible:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [F

    .line 22
    .line 23
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mInvMatrix:Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    aget p1, v0, p1

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v2, 0x1

    .line 36
    aget v0, v0, v2

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableView;->initBounds()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mRegion:Landroid/graphics/Region;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mStrokeRegion:Landroid/graphics/Region;

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getClipPath()Landroid/graphics/Path;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mClipRegion:Landroid/graphics/Region;

    .line 73
    .line 74
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    return v1

    .line 81
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1

    .line 86
    :cond_5
    :goto_0
    return v1
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/Y;->q:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public k0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/Y;->r:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/Y;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
