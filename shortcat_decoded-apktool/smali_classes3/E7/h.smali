.class public final LE7/h;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/h$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:LH7/j;

.field private final c:F

.field private d:F

.field private e:LH7/u;

.field private f:I

.field private g:F

.field private final h:Landroid/graphics/Paint;

.field private i:LH7/p;

.field private j:Landroid/graphics/RectF;

.field private final k:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;LH7/j;IFLH7/u;F)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outlineStyle"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LE7/h;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, LE7/h;->b:LH7/j;

    .line 17
    .line 18
    const p1, 0x3f4ccccd    # 0.8f

    .line 19
    .line 20
    .line 21
    iput p1, p0, LE7/h;->c:F

    .line 22
    .line 23
    iput p4, p0, LE7/h;->d:F

    .line 24
    .line 25
    iput-object p5, p0, LE7/h;->e:LH7/u;

    .line 26
    .line 27
    iput p3, p0, LE7/h;->f:I

    .line 28
    .line 29
    iput p6, p0, LE7/h;->g:F

    .line 30
    .line 31
    new-instance p1, Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p5, p6}, LE7/h;->d(LH7/u;F)Landroid/graphics/PathEffect;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 55
    .line 56
    new-instance p1, Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LE7/h;->j:Landroid/graphics/RectF;

    .line 62
    .line 63
    new-instance p1, Landroid/graphics/Path;

    .line 64
    .line 65
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 69
    .line 70
    return-void
.end method

.method private final a(FFF)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 8
    .line 9
    mul-float/2addr p2, v0

    .line 10
    add-float/2addr p1, p2

    .line 11
    add-float/2addr p1, p3

    .line 12
    return p1
.end method

.method private final b(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    iget-object v1, p0, LE7/h;->j:Landroid/graphics/RectF;

    .line 4
    .line 5
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 11
    .line 12
    iget-object v1, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final c(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    iget-object v0, p0, LE7/h;->i:LH7/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LH7/p;->c()LH7/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LH7/q;->c()LH7/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    new-instance v0, LH7/q;

    .line 19
    .line 20
    invoke-direct {v0, v1, v1}, LH7/q;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, LE7/h;->i:LH7/p;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2}, LH7/p;->d()LH7/q;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2}, LH7/q;->c()LH7/q;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    :cond_2
    new-instance v2, LH7/q;

    .line 40
    .line 41
    invoke-direct {v2, v1, v1}, LH7/q;-><init>(FF)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object v3, p0, LE7/h;->i:LH7/p;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v3}, LH7/p;->a()LH7/q;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {v3}, LH7/q;->c()LH7/q;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    :cond_4
    new-instance v3, LH7/q;

    .line 61
    .line 62
    invoke-direct {v3, v1, v1}, LH7/q;-><init>(FF)V

    .line 63
    .line 64
    .line 65
    :cond_5
    iget-object v4, p0, LE7/h;->i:LH7/p;

    .line 66
    .line 67
    if-eqz v4, :cond_6

    .line 68
    .line 69
    invoke-virtual {v4}, LH7/p;->b()LH7/q;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_6

    .line 74
    .line 75
    invoke-virtual {v4}, LH7/q;->c()LH7/q;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_7

    .line 80
    .line 81
    :cond_6
    new-instance v4, LH7/q;

    .line 82
    .line 83
    invoke-direct {v4, v1, v1}, LH7/q;-><init>(FF)V

    .line 84
    .line 85
    .line 86
    :cond_7
    iget-object v1, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 87
    .line 88
    iget-object v5, p0, LE7/h;->j:Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-virtual {v0}, LH7/q;->a()F

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    iget v7, p0, LE7/h;->g:F

    .line 95
    .line 96
    iget v8, p0, LE7/h;->d:F

    .line 97
    .line 98
    invoke-direct {p0, v6, v7, v8}, LE7/h;->a(FFF)F

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v0}, LH7/q;->b()F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget v7, p0, LE7/h;->g:F

    .line 107
    .line 108
    iget v8, p0, LE7/h;->d:F

    .line 109
    .line 110
    invoke-direct {p0, v0, v7, v8}, LE7/h;->a(FFF)F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {v2}, LH7/q;->a()F

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    iget v8, p0, LE7/h;->g:F

    .line 119
    .line 120
    iget v9, p0, LE7/h;->d:F

    .line 121
    .line 122
    invoke-direct {p0, v7, v8, v9}, LE7/h;->a(FFF)F

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    invoke-virtual {v2}, LH7/q;->b()F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    iget v8, p0, LE7/h;->g:F

    .line 131
    .line 132
    iget v9, p0, LE7/h;->d:F

    .line 133
    .line 134
    invoke-direct {p0, v2, v8, v9}, LE7/h;->a(FFF)F

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-virtual {v4}, LH7/q;->a()F

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    iget v9, p0, LE7/h;->g:F

    .line 143
    .line 144
    iget v10, p0, LE7/h;->d:F

    .line 145
    .line 146
    invoke-direct {p0, v8, v9, v10}, LE7/h;->a(FFF)F

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v4}, LH7/q;->b()F

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    iget v9, p0, LE7/h;->g:F

    .line 155
    .line 156
    iget v10, p0, LE7/h;->d:F

    .line 157
    .line 158
    invoke-direct {p0, v4, v9, v10}, LE7/h;->a(FFF)F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-virtual {v3}, LH7/q;->a()F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    iget v10, p0, LE7/h;->g:F

    .line 167
    .line 168
    iget v11, p0, LE7/h;->d:F

    .line 169
    .line 170
    invoke-direct {p0, v9, v10, v11}, LE7/h;->a(FFF)F

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    invoke-virtual {v3}, LH7/q;->b()F

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    iget v10, p0, LE7/h;->g:F

    .line 179
    .line 180
    iget v11, p0, LE7/h;->d:F

    .line 181
    .line 182
    invoke-direct {p0, v3, v10, v11}, LE7/h;->a(FFF)F

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    const/16 v10, 0x8

    .line 187
    .line 188
    new-array v10, v10, [F

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    aput v6, v10, v11

    .line 192
    .line 193
    const/4 v6, 0x1

    .line 194
    aput v0, v10, v6

    .line 195
    .line 196
    const/4 v0, 0x2

    .line 197
    aput v7, v10, v0

    .line 198
    .line 199
    const/4 v0, 0x3

    .line 200
    aput v2, v10, v0

    .line 201
    .line 202
    const/4 v0, 0x4

    .line 203
    aput v8, v10, v0

    .line 204
    .line 205
    const/4 v0, 0x5

    .line 206
    aput v4, v10, v0

    .line 207
    .line 208
    const/4 v0, 0x6

    .line 209
    aput v9, v10, v0

    .line 210
    .line 211
    const/4 v0, 0x7

    .line 212
    aput v3, v10, v0

    .line 213
    .line 214
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 215
    .line 216
    invoke-virtual {v1, v5, v10, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 220
    .line 221
    iget-object v1, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 222
    .line 223
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method private final d(LH7/u;F)Landroid/graphics/PathEffect;
    .locals 7

    .line 1
    sget-object v0, LE7/h$a;->a:[I

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
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq p1, v3, :cond_1

    .line 18
    .line 19
    if-ne p1, v5, :cond_0

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/DashPathEffect;

    .line 22
    .line 23
    new-array v2, v2, [F

    .line 24
    .line 25
    aput p2, v2, v1

    .line 26
    .line 27
    aput p2, v2, v0

    .line 28
    .line 29
    aput p2, v2, v3

    .line 30
    .line 31
    aput p2, v2, v5

    .line 32
    .line 33
    invoke-direct {p1, v2, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    new-instance p1, LTd/r;

    .line 38
    .line 39
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    new-instance p1, Landroid/graphics/DashPathEffect;

    .line 44
    .line 45
    int-to-float v6, v5

    .line 46
    mul-float/2addr p2, v6

    .line 47
    new-array v2, v2, [F

    .line 48
    .line 49
    aput p2, v2, v1

    .line 50
    .line 51
    aput p2, v2, v0

    .line 52
    .line 53
    aput p2, v2, v3

    .line 54
    .line 55
    aput p2, v2, v5

    .line 56
    .line 57
    invoke-direct {p1, v2, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method private final j()V
    .locals 7

    .line 1
    iget-object v0, p0, LE7/h;->j:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LE7/h;->j:Landroid/graphics/RectF;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 13
    .line 14
    iget v2, p0, LE7/h;->g:F

    .line 15
    .line 16
    const/high16 v3, 0x3f000000    # 0.5f

    .line 17
    .line 18
    mul-float v4, v2, v3

    .line 19
    .line 20
    iget v5, p0, LE7/h;->d:F

    .line 21
    .line 22
    add-float/2addr v4, v5

    .line 23
    iget v6, p0, LE7/h;->c:F

    .line 24
    .line 25
    sub-float/2addr v4, v6

    .line 26
    sub-float/2addr v1, v4

    .line 27
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 30
    .line 31
    mul-float v4, v2, v3

    .line 32
    .line 33
    add-float/2addr v4, v5

    .line 34
    sub-float/2addr v4, v6

    .line 35
    add-float/2addr v1, v4

    .line 36
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 37
    .line 38
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    mul-float v4, v2, v3

    .line 41
    .line 42
    add-float/2addr v4, v5

    .line 43
    sub-float/2addr v4, v6

    .line 44
    sub-float/2addr v1, v4

    .line 45
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 46
    .line 47
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    mul-float/2addr v2, v3

    .line 50
    add-float/2addr v2, v5

    .line 51
    sub-float/2addr v2, v6

    .line 52
    add-float/2addr v1, v2

    .line 53
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, LE7/h;->g:F

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LE7/h;->k:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LE7/h;->b:LH7/j;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, LE7/h;->a:Landroid/content/Context;

    .line 28
    .line 29
    sget-object v3, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/B;->f(I)F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v3, v5}, Lcom/facebook/react/uimanager/B;->f(I)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v0, v1, v2, v4, v3}, LH7/j;->c(ILandroid/content/Context;FF)LH7/p;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x0

    .line 61
    :goto_0
    iput-object v0, p0, LE7/h;->i:LH7/p;

    .line 62
    .line 63
    invoke-direct {p0}, LE7/h;->j()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, LE7/h;->i:LH7/p;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0}, LH7/p;->e()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x1

    .line 77
    if-ne v0, v1, :cond_2

    .line 78
    .line 79
    invoke-direct {p0, p1}, LE7/h;->c(Landroid/graphics/Canvas;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-direct {p0, p1}, LE7/h;->b(Landroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final e(LH7/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE7/h;->b:LH7/j;

    .line 2
    .line 3
    return-void
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget v0, p0, LE7/h;->f:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, LE7/h;->f:I

    .line 6
    .line 7
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iget v0, p0, LE7/h;->d:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, LE7/h;->d:F

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getOpacity()I
    .locals 3

    .line 1
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v2, 0x1

    .line 14
    if-gt v2, v0, :cond_1

    .line 15
    .line 16
    if-ge v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v0, -0x3

    .line 19
    return v0

    .line 20
    :cond_1
    const/4 v0, -0x2

    .line 21
    return v0
.end method

.method public final h(LH7/u;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE7/h;->e:LH7/u;

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, LE7/h;->e:LH7/u;

    .line 11
    .line 12
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 13
    .line 14
    iget v1, p0, LE7/h;->g:F

    .line 15
    .line 16
    invoke-direct {p0, p1, v1}, LE7/h;->d(LH7/u;F)Landroid/graphics/PathEffect;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final i(F)V
    .locals 2

    .line 1
    iget v0, p0, LE7/h;->g:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, LE7/h;->g:F

    .line 9
    .line 10
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 16
    .line 17
    iget-object v1, p0, LE7/h;->e:LH7/u;

    .line 18
    .line 19
    invoke-direct {p0, v1, p1}, LE7/h;->d(LH7/u;F)Landroid/graphics/PathEffect;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setAlpha(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    const/high16 v1, 0x437f0000    # 255.0f

    .line 5
    .line 6
    div-float/2addr p1, v1

    .line 7
    iget v2, p0, LE7/h;->f:I

    .line 8
    .line 9
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    div-float/2addr v2, v1

    .line 15
    mul-float/2addr p1, v2

    .line 16
    mul-float/2addr p1, v1

    .line 17
    invoke-static {p1}, Lke/a;->d(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE7/h;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
