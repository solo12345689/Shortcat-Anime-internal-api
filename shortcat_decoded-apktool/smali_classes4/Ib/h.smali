.class public final LIb/h;
.super Landroidx/appcompat/widget/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private d:LIb/o;

.field private e:Z

.field private f:Z

.field private g:Lexpo/modules/image/enums/ContentFit;

.field private h:Lexpo/modules/image/enums/ContentFit;

.field private i:Lexpo/modules/image/records/ContentPosition;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/r;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lexpo/modules/image/enums/ContentFit;->Cover:Lexpo/modules/image/enums/ContentFit;

    .line 19
    .line 20
    iput-object p1, p0, LIb/h;->g:Lexpo/modules/image/enums/ContentFit;

    .line 21
    .line 22
    sget-object p1, Lexpo/modules/image/enums/ContentFit;->ScaleDown:Lexpo/modules/image/enums/ContentFit;

    .line 23
    .line 24
    iput-object p1, p0, LIb/h;->h:Lexpo/modules/image/enums/ContentFit;

    .line 25
    .line 26
    sget-object p1, Lexpo/modules/image/records/ContentPosition;->Companion:Lexpo/modules/image/records/ContentPosition$a;

    .line 27
    .line 28
    invoke-virtual {p1}, Lexpo/modules/image/records/ContentPosition$a;->a()Lexpo/modules/image/records/ContentPosition;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, LIb/h;->i:Lexpo/modules/image/records/ContentPosition;

    .line 33
    .line 34
    return-void
.end method

.method private final d(Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    int-to-float p1, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    invoke-direct {p1, v2, v2, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 30
    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    if-eqz p4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p4, v1

    .line 41
    :goto_0
    if-eqz p5, :cond_1

    .line 42
    .line 43
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_1
    invoke-virtual {p2, v0, p1, p4, v1}, Lexpo/modules/image/enums/ContentFit;->toMatrix$expo_image_release(Landroid/graphics/RectF;Landroid/graphics/RectF;II)Landroid/graphics/Matrix;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p2, v0, p1}, Lexpo/modules/image/records/ContentPosition;->apply$expo_image_release(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method static synthetic e(LIb/h;Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p3, Lexpo/modules/image/records/ContentPosition;->Companion:Lexpo/modules/image/records/ContentPosition$a;

    .line 6
    .line 7
    invoke-virtual {p3}, Lexpo/modules/image/records/ContentPosition$a;->a()Lexpo/modules/image/records/ContentPosition;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    :cond_0
    move-object v3, p3

    .line 12
    and-int/lit8 p3, p6, 0x8

    .line 13
    .line 14
    const/4 p7, 0x0

    .line 15
    if-eqz p3, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, LIb/h;->d:LIb/o;

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p3}, LIb/o;->s()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    move-object p4, p3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object p4, p7

    .line 32
    :cond_2
    :goto_0
    move-object v4, p4

    .line 33
    and-int/lit8 p3, p6, 0x10

    .line 34
    .line 35
    if-eqz p3, :cond_4

    .line 36
    .line 37
    iget-object p3, p0, LIb/h;->d:LIb/o;

    .line 38
    .line 39
    if-eqz p3, :cond_3

    .line 40
    .line 41
    invoke-virtual {p3}, LIb/o;->r()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    move-object p5, p3

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move-object p5, p7

    .line 52
    :cond_4
    :goto_1
    move-object v0, p0

    .line 53
    move-object v1, p1

    .line 54
    move-object v2, p2

    .line 55
    move-object v5, p5

    .line 56
    invoke-direct/range {v0 .. v5}, LIb/h;->d(Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, p0, LIb/h;->e:Z

    .line 9
    .line 10
    const-string v2, "getDrawable(...)"

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, LIb/h;->h:Lexpo/modules/image/enums/ContentFit;

    .line 22
    .line 23
    iget-object v3, p0, LIb/h;->d:LIb/o;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3}, LIb/o;->p()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v5, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v5, v4

    .line 39
    :goto_0
    iget-object v3, p0, LIb/h;->d:LIb/o;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v3}, LIb/o;->q()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_2
    const/4 v6, 0x4

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v3, 0x0

    .line 54
    move-object v0, p0

    .line 55
    invoke-static/range {v0 .. v7}, LIb/h;->e(LIb/h;Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, LIb/h;->g:Lexpo/modules/image/enums/ContentFit;

    .line 67
    .line 68
    iget-object v3, p0, LIb/h;->i:Lexpo/modules/image/records/ContentPosition;

    .line 69
    .line 70
    const/16 v6, 0x18

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    move-object v0, p0

    .line 76
    invoke-static/range {v0 .. v7}, LIb/h;->e(LIb/h;Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    const-string v0, "ExpoImage"

    .line 35
    .line 36
    const-string v1, "Trying to use a recycled bitmap"

    .line 37
    .line 38
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LIb/h;->g()LIb/o;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v3, v1, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 57
    .line 58
    :cond_1
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2}, Lexpo/modules/image/ExpoImageViewWrapper;->getRequestManager$expo_image_release()Lcom/bumptech/glide/k;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0, v1}, LIb/o;->e(Lcom/bumptech/glide/k;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LIb/h;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()LIb/o;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/r;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LIb/h;->d:LIb/o;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v2}, LIb/o;->C(Z)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    :goto_0
    iput-object v0, p0, LIb/h;->d:LIb/o;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iput-boolean v2, p0, LIb/h;->e:Z

    .line 23
    .line 24
    return-object v1
.end method

.method public final getContentFit$expo_image_release()Lexpo/modules/image/enums/ContentFit;
    .locals 1

    .line 1
    iget-object v0, p0, LIb/h;->g:Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContentPosition$expo_image_release()Lexpo/modules/image/records/ContentPosition;
    .locals 1

    .line 1
    iget-object v0, p0, LIb/h;->i:Lexpo/modules/image/records/ContentPosition;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentTarget()LIb/o;
    .locals 1

    .line 1
    iget-object v0, p0, LIb/h;->d:LIb/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholderContentFit$expo_image_release()Lexpo/modules/image/enums/ContentFit;
    .locals 1

    .line 1
    iget-object v0, p0, LIb/h;->h:Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LIb/h;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setContentFit$expo_image_release(Lexpo/modules/image/enums/ContentFit;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LIb/h;->g:Lexpo/modules/image/enums/ContentFit;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LIb/h;->f:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setContentPosition$expo_image_release(Lexpo/modules/image/records/ContentPosition;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LIb/h;->i:Lexpo/modules/image/records/ContentPosition;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LIb/h;->f:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setCurrentTarget(LIb/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LIb/h;->d:LIb/o;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaceholder(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LIb/h;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaceholderContentFit$expo_image_release(Lexpo/modules/image/enums/ContentFit;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LIb/h;->h:Lexpo/modules/image/enums/ContentFit;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LIb/h;->f:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setTintColor$expo_image_release(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
