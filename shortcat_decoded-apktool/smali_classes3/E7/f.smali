.class public final LE7/f;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:I

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private g:LH7/h;

.field private h:LH7/j;

.field private final i:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;IFFFFLH7/h;LH7/j;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LE7/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput p2, p0, LE7/f;->b:I

    .line 12
    .line 13
    iput p3, p0, LE7/f;->c:F

    .line 14
    .line 15
    iput p4, p0, LE7/f;->d:F

    .line 16
    .line 17
    iput p5, p0, LE7/f;->e:F

    .line 18
    .line 19
    iput p6, p0, LE7/f;->f:F

    .line 20
    .line 21
    iput-object p7, p0, LE7/f;->g:LH7/h;

    .line 22
    .line 23
    iput-object p8, p0, LE7/f;->h:LH7/j;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    sget-object p2, Lcom/facebook/react/uimanager/j;->a:Lcom/facebook/react/uimanager/j;

    .line 34
    .line 35
    const/high16 p3, 0x3f000000    # 0.5f

    .line 36
    .line 37
    mul-float/2addr p5, p3

    .line 38
    invoke-virtual {p2, p5}, Lcom/facebook/react/uimanager/j;->x(F)F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/4 p3, 0x0

    .line 43
    cmpl-float p3, p2, p3

    .line 44
    .line 45
    if-lez p3, :cond_0

    .line 46
    .line 47
    new-instance p3, Landroid/graphics/BlurMaskFilter;

    .line 48
    .line 49
    sget-object p4, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 50
    .line 51
    invoke-direct {p3, p2, p4}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 55
    .line 56
    .line 57
    :cond_0
    iput-object p1, p0, LE7/f;->i:Landroid/graphics/Paint;

    .line 58
    .line 59
    return-void
.end method

.method private final a()Landroid/graphics/RectF;
    .locals 6

    .line 1
    iget-object v0, p0, LE7/f;->g:LH7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, LE7/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, LH7/h;->a(ILandroid/content/Context;)Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/RectF;

    .line 18
    .line 19
    sget-object v2, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 20
    .line 21
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    invoke-virtual {v2, v4}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 34
    .line 35
    invoke-virtual {v2, v5}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {v1, v3, v4, v5, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    return-object v0
.end method

.method private final b()LH7/p;
    .locals 8

    .line 1
    iget-object v0, p0, LE7/f;->h:LH7/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget-object v3, p0, LE7/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    sget-object v4, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    int-to-float v5, v5

    .line 23
    invoke-virtual {v4, v5}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    int-to-float v6, v6

    .line 36
    invoke-virtual {v4, v6}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v0, v2, v3, v5, v4}, LH7/j;->c(ILandroid/content/Context;FF)LH7/p;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v1

    .line 46
    :goto_0
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, LH7/p;->e()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x1

    .line 53
    if-ne v2, v3, :cond_1

    .line 54
    .line 55
    new-instance v1, LH7/p;

    .line 56
    .line 57
    new-instance v2, LH7/q;

    .line 58
    .line 59
    sget-object v3, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 60
    .line 61
    invoke-virtual {v0}, LH7/p;->c()LH7/q;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, LH7/q;->a()F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v0}, LH7/p;->c()LH7/q;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, LH7/q;->b()F

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v3, v5}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-direct {v2, v4, v5}, LH7/q;-><init>(FF)V

    .line 86
    .line 87
    .line 88
    new-instance v4, LH7/q;

    .line 89
    .line 90
    invoke-virtual {v0}, LH7/p;->d()LH7/q;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5}, LH7/q;->a()F

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {v3, v5}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-virtual {v0}, LH7/p;->d()LH7/q;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v6}, LH7/q;->b()F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {v3, v6}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-direct {v4, v5, v6}, LH7/q;-><init>(FF)V

    .line 115
    .line 116
    .line 117
    new-instance v5, LH7/q;

    .line 118
    .line 119
    invoke-virtual {v0}, LH7/p;->a()LH7/q;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v6}, LH7/q;->a()F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v3, v6}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v0}, LH7/p;->a()LH7/q;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v7}, LH7/q;->b()F

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-virtual {v3, v7}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    invoke-direct {v5, v6, v7}, LH7/q;-><init>(FF)V

    .line 144
    .line 145
    .line 146
    new-instance v6, LH7/q;

    .line 147
    .line 148
    invoke-virtual {v0}, LH7/p;->b()LH7/q;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {v7}, LH7/q;->a()F

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-virtual {v3, v7}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    invoke-virtual {v0}, LH7/p;->b()LH7/q;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, LH7/q;->b()F

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {v3, v0}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-direct {v6, v7, v0}, LH7/q;-><init>(FF)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v1, v2, v4, v5, v6}, LH7/p;-><init>(LH7/q;LH7/q;LH7/q;LH7/q;)V

    .line 176
    .line 177
    .line 178
    :cond_1
    return-object v1
.end method

.method private final c(FLjava/lang/Float;)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p2, v0

    .line 10
    :goto_0
    sub-float/2addr p1, p2

    .line 11
    invoke-static {p1, v0}, Loe/j;->d(FF)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method


# virtual methods
.method public final d(LH7/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE7/f;->g:LH7/h;

    .line 2
    .line 3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LE7/f;->b()LH7/p;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0}, LE7/f;->a()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Landroid/graphics/RectF;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    int-to-float v3, v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget v5, v1, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v4

    .line 30
    :goto_0
    add-float/2addr v3, v5

    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    int-to-float v5, v5

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget v6, v1, Landroid/graphics/RectF;->top:F

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v4

    .line 44
    :goto_1
    add-float/2addr v5, v6

    .line 45
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 50
    .line 51
    int-to-float v6, v6

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget v7, v1, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move v7, v4

    .line 58
    :goto_2
    sub-float/2addr v6, v7

    .line 59
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 64
    .line 65
    int-to-float v7, v7

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget v4, v1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    :cond_3
    sub-float/2addr v7, v4

    .line 71
    invoke-direct {v2, v3, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    if-eqz v0, :cond_c

    .line 78
    .line 79
    invoke-virtual {v0}, LH7/p;->c()LH7/q;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, LH7/q;->a()F

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    iget v7, v1, Landroid/graphics/RectF;->left:F

    .line 90
    .line 91
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v7, v5

    .line 97
    :goto_3
    invoke-direct {p0, v6, v7}, LE7/f;->c(FLjava/lang/Float;)F

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-virtual {v0}, LH7/p;->c()LH7/q;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v7}, LH7/q;->b()F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    iget v8, v1, Landroid/graphics/RectF;->top:F

    .line 112
    .line 113
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    goto :goto_4

    .line 118
    :cond_5
    move-object v8, v5

    .line 119
    :goto_4
    invoke-direct {p0, v7, v8}, LE7/f;->c(FLjava/lang/Float;)F

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v0}, LH7/p;->d()LH7/q;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v8}, LH7/q;->a()F

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    iget v9, v1, Landroid/graphics/RectF;->right:F

    .line 134
    .line 135
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    move-object v9, v5

    .line 141
    :goto_5
    invoke-direct {p0, v8, v9}, LE7/f;->c(FLjava/lang/Float;)F

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-virtual {v0}, LH7/p;->d()LH7/q;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-virtual {v9}, LH7/q;->b()F

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    iget v10, v1, Landroid/graphics/RectF;->top:F

    .line 156
    .line 157
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    goto :goto_6

    .line 162
    :cond_7
    move-object v10, v5

    .line 163
    :goto_6
    invoke-direct {p0, v9, v10}, LE7/f;->c(FLjava/lang/Float;)F

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    invoke-virtual {v0}, LH7/p;->b()LH7/q;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v10}, LH7/q;->a()F

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    iget v11, v1, Landroid/graphics/RectF;->right:F

    .line 178
    .line 179
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    goto :goto_7

    .line 184
    :cond_8
    move-object v11, v5

    .line 185
    :goto_7
    invoke-direct {p0, v10, v11}, LE7/f;->c(FLjava/lang/Float;)F

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual {v0}, LH7/p;->b()LH7/q;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-virtual {v11}, LH7/q;->b()F

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-eqz v1, :cond_9

    .line 198
    .line 199
    iget v12, v1, Landroid/graphics/RectF;->bottom:F

    .line 200
    .line 201
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    goto :goto_8

    .line 206
    :cond_9
    move-object v12, v5

    .line 207
    :goto_8
    invoke-direct {p0, v11, v12}, LE7/f;->c(FLjava/lang/Float;)F

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    invoke-virtual {v0}, LH7/p;->a()LH7/q;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    invoke-virtual {v12}, LH7/q;->a()F

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    if-eqz v1, :cond_a

    .line 220
    .line 221
    iget v13, v1, Landroid/graphics/RectF;->left:F

    .line 222
    .line 223
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    goto :goto_9

    .line 228
    :cond_a
    move-object v13, v5

    .line 229
    :goto_9
    invoke-direct {p0, v12, v13}, LE7/f;->c(FLjava/lang/Float;)F

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    invoke-virtual {v0}, LH7/p;->a()LH7/q;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, LH7/q;->b()F

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v1, :cond_b

    .line 242
    .line 243
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    :cond_b
    invoke-direct {p0, v0, v5}, LE7/f;->c(FLjava/lang/Float;)F

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    const/16 v1, 0x8

    .line 254
    .line 255
    new-array v5, v1, [F

    .line 256
    .line 257
    aput v6, v5, v4

    .line 258
    .line 259
    const/4 v1, 0x1

    .line 260
    aput v7, v5, v1

    .line 261
    .line 262
    aput v8, v5, v3

    .line 263
    .line 264
    const/4 v1, 0x3

    .line 265
    aput v9, v5, v1

    .line 266
    .line 267
    const/4 v1, 0x4

    .line 268
    aput v10, v5, v1

    .line 269
    .line 270
    const/4 v1, 0x5

    .line 271
    aput v11, v5, v1

    .line 272
    .line 273
    const/4 v1, 0x6

    .line 274
    aput v12, v5, v1

    .line 275
    .line 276
    const/4 v1, 0x7

    .line 277
    aput v0, v5, v1

    .line 278
    .line 279
    :cond_c
    sget-object v0, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 280
    .line 281
    iget v1, p0, LE7/f;->c:F

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    iget v6, p0, LE7/f;->d:F

    .line 288
    .line 289
    invoke-virtual {v0, v6}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    iget v7, p0, LE7/f;->f:F

    .line 294
    .line 295
    invoke-virtual {v0, v7}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    new-instance v10, Landroid/graphics/RectF;

    .line 300
    .line 301
    invoke-direct {v10, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 302
    .line 303
    .line 304
    int-to-float v3, v3

    .line 305
    mul-float/2addr v3, v0

    .line 306
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    cmpl-float v3, v3, v7

    .line 311
    .line 312
    if-lez v3, :cond_d

    .line 313
    .line 314
    invoke-virtual {v10}, Landroid/graphics/RectF;->setEmpty()V

    .line 315
    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_d
    invoke-virtual {v10, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 319
    .line 320
    .line 321
    :goto_a
    invoke-virtual {v10, v1, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 322
    .line 323
    .line 324
    sget-object v1, Lcom/facebook/react/uimanager/j;->a:Lcom/facebook/react/uimanager/j;

    .line 325
    .line 326
    iget v3, p0, LE7/f;->e:F

    .line 327
    .line 328
    invoke-virtual {v1, v3}, Lcom/facebook/react/uimanager/j;->x(F)F

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    new-instance v8, Landroid/graphics/RectF;

    .line 333
    .line 334
    invoke-direct {v8, v10}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 338
    .line 339
    .line 340
    neg-float v1, v1

    .line 341
    invoke-virtual {v8, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 342
    .line 343
    .line 344
    new-instance v1, Landroid/graphics/RectF;

    .line 345
    .line 346
    invoke-direct {v1, v10}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v8, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    if-eqz v5, :cond_f

    .line 357
    .line 358
    new-instance v3, Landroid/graphics/Path;

    .line 359
    .line 360
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 361
    .line 362
    .line 363
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 364
    .line 365
    invoke-virtual {v3, v2, v5, v6}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 369
    .line 370
    .line 371
    new-instance v2, Ljava/util/ArrayList;

    .line 372
    .line 373
    array-length v3, v5

    .line 374
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    .line 376
    .line 377
    array-length v3, v5

    .line 378
    :goto_b
    if-ge v4, v3, :cond_e

    .line 379
    .line 380
    aget v6, v5, v4

    .line 381
    .line 382
    neg-float v7, v0

    .line 383
    invoke-static {v6, v7}, LE7/d;->a(FF)F

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    add-int/lit8 v4, v4, 0x1

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_e
    invoke-static {v2}, LUd/u;->Y0(Ljava/util/Collection;)[F

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    invoke-static {}, LE7/g;->a()[F

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    iget-object v12, p0, LE7/f;->i:Landroid/graphics/Paint;

    .line 406
    .line 407
    move-object v7, p1

    .line 408
    invoke-static/range {v7 .. v12}, LV0/v;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    .line 409
    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_f
    move-object v7, p1

    .line 413
    invoke-virtual {v7, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 414
    .line 415
    .line 416
    invoke-static {}, LE7/g;->a()[F

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    invoke-static {}, LE7/g;->a()[F

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    iget-object v12, p0, LE7/f;->i:Landroid/graphics/Paint;

    .line 425
    .line 426
    invoke-static/range {v7 .. v12}, LV0/v;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    .line 427
    .line 428
    .line 429
    :goto_c
    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 430
    .line 431
    .line 432
    return-void
.end method

.method public final e(LH7/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE7/f;->h:LH7/j;

    .line 2
    .line 3
    return-void
.end method

.method public getOpacity()I
    .locals 3

    .line 1
    iget-object v0, p0, LE7/f;->i:Landroid/graphics/Paint;

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

.method public setAlpha(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LE7/f;->i:Landroid/graphics/Paint;

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    const/high16 v1, 0x437f0000    # 255.0f

    .line 5
    .line 6
    div-float/2addr p1, v1

    .line 7
    iget v2, p0, LE7/f;->b:I

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
    iget-object v0, p0, LE7/f;->i:Landroid/graphics/Paint;

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
