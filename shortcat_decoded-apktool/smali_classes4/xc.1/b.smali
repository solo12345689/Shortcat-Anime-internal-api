.class public Lxc/b;
.super Landroid/view/View;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/Path;

.field private c:Landroid/graphics/RectF;

.field private d:[F

.field private e:[F

.field private f:[F

.field private g:[I

.field private h:[I

.field private i:[F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lxc/b;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    new-array v0, p1, [F

    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lxc/b;->e:[F

    .line 19
    .line 20
    new-array p1, p1, [F

    .line 21
    .line 22
    fill-array-data p1, :array_1

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lxc/b;->f:[F

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    filled-new-array {p1, p1}, [I

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lxc/b;->h:[I

    .line 33
    .line 34
    const/16 p1, 0x8

    .line 35
    .line 36
    new-array p1, p1, [F

    .line 37
    .line 38
    fill-array-data p1, :array_2

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lxc/b;->i:[F

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x0
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    :array_1
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    :array_2
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lxc/b;->g:[I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lxc/b;->d:[F

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    array-length v1, v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v2, Landroid/graphics/LinearGradient;

    .line 15
    .line 16
    iget-object v0, p0, Lxc/b;->e:[F

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aget v3, v0, v1

    .line 20
    .line 21
    iget-object v4, p0, Lxc/b;->h:[I

    .line 22
    .line 23
    aget v5, v4, v1

    .line 24
    .line 25
    int-to-float v6, v5

    .line 26
    mul-float/2addr v3, v6

    .line 27
    const/4 v6, 0x1

    .line 28
    aget v0, v0, v6

    .line 29
    .line 30
    aget v4, v4, v6

    .line 31
    .line 32
    int-to-float v7, v4

    .line 33
    mul-float/2addr v0, v7

    .line 34
    iget-object v7, p0, Lxc/b;->f:[F

    .line 35
    .line 36
    aget v1, v7, v1

    .line 37
    .line 38
    int-to-float v5, v5

    .line 39
    mul-float/2addr v5, v1

    .line 40
    aget v1, v7, v6

    .line 41
    .line 42
    int-to-float v4, v4

    .line 43
    mul-float v6, v1, v4

    .line 44
    .line 45
    iget-object v7, p0, Lxc/b;->g:[I

    .line 46
    .line 47
    iget-object v8, p0, Lxc/b;->d:[F

    .line 48
    .line 49
    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 50
    .line 51
    move v4, v0

    .line 52
    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lxc/b;->a:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-void
.end method

.method private d(F)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method private e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxc/b;->b:Landroid/graphics/Path;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Path;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxc/b;->b:Landroid/graphics/Path;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxc/b;->c:Landroid/graphics/RectF;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lxc/b;->b:Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lxc/b;->c:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget-object v1, p0, Lxc/b;->h:[I

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    aget v2, v1, v2

    .line 30
    .line 31
    int-to-float v2, v2

    .line 32
    const/4 v3, 0x1

    .line 33
    aget v1, v1, v3

    .line 34
    .line 35
    int-to-float v1, v1

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3, v3, v2, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lxc/b;->b:Landroid/graphics/Path;

    .line 41
    .line 42
    iget-object v1, p0, Lxc/b;->c:Landroid/graphics/RectF;

    .line 43
    .line 44
    iget-object v2, p0, Lxc/b;->i:[F

    .line 45
    .line 46
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public b(FF)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput p2, v0, p1

    .line 9
    .line 10
    iput-object v0, p0, Lxc/b;->f:[F

    .line 11
    .line 12
    invoke-direct {p0}, Lxc/b;->a()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(FF)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput p2, v0, p1

    .line 9
    .line 10
    iput-object v0, p0, Lxc/b;->e:[F

    .line 11
    .line 12
    invoke-direct {p0}, Lxc/b;->a()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxc/b;->b:Landroid/graphics/Path;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lxc/b;->a:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Lxc/b;->a:Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    filled-new-array {p1, p2}, [I

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lxc/b;->h:[I

    .line 6
    .line 7
    invoke-direct {p0}, Lxc/b;->e()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lxc/b;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBorderRadii([F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    aget v1, p1, v0

    .line 6
    .line 7
    invoke-direct {p0, v1}, Lxc/b;->d(F)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aput v1, p1, v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object p1, p0, Lxc/b;->i:[F

    .line 17
    .line 18
    invoke-direct {p0}, Lxc/b;->e()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lxc/b;->a()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setColors([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxc/b;->g:[I

    .line 2
    .line 3
    invoke-direct {p0}, Lxc/b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDither(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxc/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lxc/b;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLocations([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxc/b;->d:[F

    .line 2
    .line 3
    invoke-direct {p0}, Lxc/b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
