.class public final LE7/e;
.super Landroid/graphics/drawable/LayerDrawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/e$a;
    }
.end annotation


# static fields
.field public static final l:LE7/e$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Ljava/util/List;

.field private final d:LE7/a;

.field private final e:LE7/b;

.field private final f:LE7/c;

.field private final g:Landroid/graphics/drawable/Drawable;

.field private final h:Ljava/util/List;

.field private final i:LE7/h;

.field private j:LH7/h;

.field private k:LH7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE7/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LE7/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE7/e;->l:LE7/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V
    .locals 9

    move-object/from16 v7, p8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outerShadows"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "innerShadows"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, LE7/e;->l:LE7/e$a;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p9

    invoke-static/range {v0 .. v8}, LE7/e$a;->a(LE7/e$a;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 6
    iput-object p1, p0, LE7/e;->a:Landroid/content/Context;

    .line 7
    iput-object p2, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 8
    iput-object p3, p0, LE7/e;->c:Ljava/util/List;

    .line 9
    iput-object p4, p0, LE7/e;->d:LE7/a;

    .line 10
    iput-object p5, p0, LE7/e;->e:LE7/b;

    .line 11
    iput-object p6, p0, LE7/e;->f:LE7/c;

    .line 12
    iput-object v6, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 13
    iput-object v7, p0, LE7/e;->h:Ljava/util/List;

    .line 14
    iput-object v8, p0, LE7/e;->i:LE7/h;

    move-object/from16 p1, p10

    .line 15
    iput-object p1, p0, LE7/e;->j:LH7/h;

    move-object/from16 p1, p11

    .line 16
    iput-object p1, p0, LE7/e;->k:LH7/j;

    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/LayerDrawable;->setPaddingMode(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x2

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object p3

    :cond_1
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_6

    .line 2
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object p8

    :cond_6
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_7

    move-object p9, v0

    :cond_7
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_8

    move-object p10, v0

    :cond_8
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_9

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p12, p11

    goto :goto_0

    .line 3
    :goto_1
    invoke-direct/range {p1 .. p12}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    return-void
.end method


# virtual methods
.method public final a()LE7/a;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->d:LE7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LE7/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->e:LE7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LE7/c;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->f:LE7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LH7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->j:LH7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LH7/j;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->k:LH7/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "outline"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, LE7/e;->k:LH7/j;

    .line 11
    .line 12
    if-eqz v2, :cond_c

    .line 13
    .line 14
    invoke-virtual {v2}, LH7/j;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v2, v3, :cond_c

    .line 20
    .line 21
    new-instance v2, Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v4, v0, LE7/e;->k:LH7/j;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    iget-object v7, v0, LE7/e;->a:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    int-to-float v8, v8

    .line 46
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    int-to-float v9, v9

    .line 55
    invoke-virtual {v4, v6, v7, v8, v9}, LH7/j;->c(ILandroid/content/Context;FF)LH7/p;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v4, v5

    .line 61
    :goto_0
    iget-object v6, v0, LE7/e;->j:LH7/h;

    .line 62
    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v7, v0, LE7/e;->a:Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {v6, v5, v7}, LH7/h;->a(ILandroid/content/Context;)Landroid/graphics/RectF;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :cond_1
    if-eqz v4, :cond_a

    .line 76
    .line 77
    new-instance v6, Landroid/graphics/RectF;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-direct {v6, v7}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 84
    .line 85
    .line 86
    sget-object v7, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 87
    .line 88
    invoke-virtual {v4}, LH7/p;->c()LH7/q;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v8}, LH7/q;->a()F

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    const/4 v9, 0x0

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    iget v10, v5, Landroid/graphics/RectF;->left:F

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move v10, v9

    .line 103
    :goto_1
    add-float/2addr v8, v10

    .line 104
    invoke-virtual {v7, v8}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    invoke-virtual {v4}, LH7/p;->c()LH7/q;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, LH7/q;->b()F

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v5, :cond_3

    .line 117
    .line 118
    iget v11, v5, Landroid/graphics/RectF;->top:F

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    move v11, v9

    .line 122
    :goto_2
    add-float/2addr v10, v11

    .line 123
    invoke-virtual {v7, v10}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    invoke-virtual {v4}, LH7/p;->d()LH7/q;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-virtual {v11}, LH7/q;->a()F

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    iget v12, v5, Landroid/graphics/RectF;->right:F

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    move v12, v9

    .line 141
    :goto_3
    add-float/2addr v11, v12

    .line 142
    invoke-virtual {v7, v11}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    invoke-virtual {v4}, LH7/p;->d()LH7/q;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-virtual {v12}, LH7/q;->b()F

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    iget v13, v5, Landroid/graphics/RectF;->top:F

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    move v13, v9

    .line 160
    :goto_4
    add-float/2addr v12, v13

    .line 161
    invoke-virtual {v7, v12}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    invoke-virtual {v4}, LH7/p;->b()LH7/q;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-virtual {v13}, LH7/q;->a()F

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eqz v5, :cond_6

    .line 174
    .line 175
    iget v14, v5, Landroid/graphics/RectF;->right:F

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_6
    move v14, v9

    .line 179
    :goto_5
    add-float/2addr v13, v14

    .line 180
    invoke-virtual {v7, v13}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    invoke-virtual {v4}, LH7/p;->b()LH7/q;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-virtual {v14}, LH7/q;->b()F

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-eqz v5, :cond_7

    .line 193
    .line 194
    iget v15, v5, Landroid/graphics/RectF;->bottom:F

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_7
    move v15, v9

    .line 198
    :goto_6
    add-float/2addr v14, v15

    .line 199
    invoke-virtual {v7, v14}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    invoke-virtual {v4}, LH7/p;->a()LH7/q;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-virtual {v15}, LH7/q;->a()F

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    move/from16 v16, v3

    .line 212
    .line 213
    if-eqz v5, :cond_8

    .line 214
    .line 215
    iget v3, v5, Landroid/graphics/RectF;->left:F

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_8
    move v3, v9

    .line 219
    :goto_7
    add-float/2addr v15, v3

    .line 220
    invoke-virtual {v7, v15}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-virtual {v4}, LH7/p;->a()LH7/q;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v4}, LH7/q;->b()F

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v5, :cond_9

    .line 233
    .line 234
    iget v9, v5, Landroid/graphics/RectF;->bottom:F

    .line 235
    .line 236
    :cond_9
    add-float/2addr v4, v9

    .line 237
    invoke-virtual {v7, v4}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    const/16 v5, 0x8

    .line 242
    .line 243
    new-array v5, v5, [F

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    aput v8, v5, v7

    .line 247
    .line 248
    aput v10, v5, v16

    .line 249
    .line 250
    const/4 v7, 0x2

    .line 251
    aput v11, v5, v7

    .line 252
    .line 253
    const/4 v7, 0x3

    .line 254
    aput v12, v5, v7

    .line 255
    .line 256
    const/4 v7, 0x4

    .line 257
    aput v13, v5, v7

    .line 258
    .line 259
    const/4 v7, 0x5

    .line 260
    aput v14, v5, v7

    .line 261
    .line 262
    const/4 v7, 0x6

    .line 263
    aput v3, v5, v7

    .line 264
    .line 265
    const/4 v3, 0x7

    .line 266
    aput v4, v5, v3

    .line 267
    .line 268
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 269
    .line 270
    invoke-virtual {v2, v6, v5, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 271
    .line 272
    .line 273
    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 274
    .line 275
    const/16 v4, 0x1e

    .line 276
    .line 277
    if-lt v3, v4, :cond_b

    .line 278
    .line 279
    invoke-static {v1, v2}, Lv0/K;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_b
    invoke-virtual {v1, v2}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :cond_c
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v1, v2}, Landroid/graphics/Outline;->setRect(Landroid/graphics/Rect;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LE7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LE7/e;->i:LE7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(LH7/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE7/e;->j:LH7/h;

    .line 2
    .line 3
    return-void
.end method

.method public final k(LH7/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE7/e;->k:LH7/j;

    .line 2
    .line 3
    return-void
.end method

.method public final l(LE7/a;)LE7/e;
    .locals 12

    .line 1
    new-instance v0, LE7/e;

    .line 2
    .line 3
    iget-object v1, p0, LE7/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    iget-object v3, p0, LE7/e;->c:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, LE7/e;->e:LE7/b;

    .line 10
    .line 11
    iget-object v6, p0, LE7/e;->f:LE7/c;

    .line 12
    .line 13
    iget-object v7, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    iget-object v8, p0, LE7/e;->h:Ljava/util/List;

    .line 16
    .line 17
    iget-object v9, p0, LE7/e;->i:LE7/h;

    .line 18
    .line 19
    iget-object v10, p0, LE7/e;->j:LH7/h;

    .line 20
    .line 21
    iget-object v11, p0, LE7/e;->k:LH7/j;

    .line 22
    .line 23
    move-object v4, p1

    .line 24
    invoke-direct/range {v0 .. v11}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final m(LE7/b;)LE7/e;
    .locals 12

    .line 1
    new-instance v0, LE7/e;

    .line 2
    .line 3
    iget-object v1, p0, LE7/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    iget-object v3, p0, LE7/e;->c:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, LE7/e;->d:LE7/a;

    .line 10
    .line 11
    iget-object v6, p0, LE7/e;->f:LE7/c;

    .line 12
    .line 13
    iget-object v7, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    iget-object v8, p0, LE7/e;->h:Ljava/util/List;

    .line 16
    .line 17
    iget-object v9, p0, LE7/e;->i:LE7/h;

    .line 18
    .line 19
    iget-object v10, p0, LE7/e;->j:LH7/h;

    .line 20
    .line 21
    iget-object v11, p0, LE7/e;->k:LH7/j;

    .line 22
    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v0 .. v11}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final n(LE7/c;)LE7/e;
    .locals 13

    .line 1
    const-string v0, "border"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE7/e;

    .line 7
    .line 8
    iget-object v2, p0, LE7/e;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v3, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    iget-object v4, p0, LE7/e;->c:Ljava/util/List;

    .line 13
    .line 14
    iget-object v5, p0, LE7/e;->d:LE7/a;

    .line 15
    .line 16
    iget-object v6, p0, LE7/e;->e:LE7/b;

    .line 17
    .line 18
    iget-object v8, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    iget-object v9, p0, LE7/e;->h:Ljava/util/List;

    .line 21
    .line 22
    iget-object v10, p0, LE7/e;->i:LE7/h;

    .line 23
    .line 24
    iget-object v11, p0, LE7/e;->j:LH7/h;

    .line 25
    .line 26
    iget-object v12, p0, LE7/e;->k:LH7/j;

    .line 27
    .line 28
    move-object v7, p1

    .line 29
    invoke-direct/range {v1 .. v12}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public final o(Landroid/graphics/drawable/Drawable;)LE7/e;
    .locals 12

    .line 1
    new-instance v0, LE7/e;

    .line 2
    .line 3
    iget-object v1, p0, LE7/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    iget-object v3, p0, LE7/e;->c:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, LE7/e;->d:LE7/a;

    .line 10
    .line 11
    iget-object v5, p0, LE7/e;->e:LE7/b;

    .line 12
    .line 13
    iget-object v6, p0, LE7/e;->f:LE7/c;

    .line 14
    .line 15
    iget-object v8, p0, LE7/e;->h:Ljava/util/List;

    .line 16
    .line 17
    iget-object v9, p0, LE7/e;->i:LE7/h;

    .line 18
    .line 19
    iget-object v10, p0, LE7/e;->j:LH7/h;

    .line 20
    .line 21
    iget-object v11, p0, LE7/e;->k:LH7/j;

    .line 22
    .line 23
    move-object v7, p1

    .line 24
    invoke-direct/range {v0 .. v11}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final p(LE7/h;)LE7/e;
    .locals 13

    .line 1
    const-string v0, "outline"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE7/e;

    .line 7
    .line 8
    iget-object v2, p0, LE7/e;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v3, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    iget-object v4, p0, LE7/e;->c:Ljava/util/List;

    .line 13
    .line 14
    iget-object v5, p0, LE7/e;->d:LE7/a;

    .line 15
    .line 16
    iget-object v6, p0, LE7/e;->e:LE7/b;

    .line 17
    .line 18
    iget-object v7, p0, LE7/e;->f:LE7/c;

    .line 19
    .line 20
    iget-object v8, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    iget-object v9, p0, LE7/e;->h:Ljava/util/List;

    .line 23
    .line 24
    iget-object v11, p0, LE7/e;->j:LH7/h;

    .line 25
    .line 26
    iget-object v12, p0, LE7/e;->k:LH7/j;

    .line 27
    .line 28
    move-object v10, p1

    .line 29
    invoke-direct/range {v1 .. v12}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public final q(Ljava/util/List;Ljava/util/List;)LE7/e;
    .locals 13

    .line 1
    const-string v0, "outerShadows"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "innerShadows"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LE7/e;

    .line 12
    .line 13
    iget-object v2, p0, LE7/e;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v3, p0, LE7/e;->b:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget-object v5, p0, LE7/e;->d:LE7/a;

    .line 18
    .line 19
    iget-object v6, p0, LE7/e;->e:LE7/b;

    .line 20
    .line 21
    iget-object v7, p0, LE7/e;->f:LE7/c;

    .line 22
    .line 23
    iget-object v8, p0, LE7/e;->g:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iget-object v10, p0, LE7/e;->i:LE7/h;

    .line 26
    .line 27
    iget-object v11, p0, LE7/e;->j:LH7/h;

    .line 28
    .line 29
    iget-object v12, p0, LE7/e;->k:LH7/j;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    move-object v9, p2

    .line 33
    invoke-direct/range {v1 .. v12}, LE7/e;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;LH7/h;LH7/j;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method
