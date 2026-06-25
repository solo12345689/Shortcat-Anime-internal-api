.class public abstract LMd/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Landroid/app/Activity;Landroid/app/PictureInPictureParams$Builder;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LMd/l;->e(Landroid/app/Activity;Landroid/app/PictureInPictureParams$Builder;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Landroid/app/Activity;Landroid/graphics/Rect;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LMd/l;->g(Landroid/app/Activity;Landroid/graphics/Rect;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(Landroid/app/Activity;ZLandroid/util/Rational;)V
    .locals 5

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/util/Rational;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    float-to-double v1, v1

    .line 14
    const-wide v3, 0x3fdac73abc947065L    # 0.41841

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmpg-double v3, v3, v1

    .line 20
    .line 21
    if-gtz v3, :cond_0

    .line 22
    .line 23
    const-wide v3, 0x40031eb851eb851fL    # 2.39

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmpg-double v1, v1, v3

    .line 29
    .line 30
    if-gtz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object p2, v0

    .line 34
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1a

    .line 37
    .line 38
    if-lt v1, v2, :cond_3

    .line 39
    .line 40
    sget-object v2, Lexpo/modules/video/VideoView;->Companion:Lexpo/modules/video/VideoView$a;

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Lexpo/modules/video/VideoView$a;->a(Landroid/app/Activity;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-static {}, LId/f;->a()Landroid/app/PictureInPictureParams$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    invoke-static {v2, p2}, LMd/f;->a(Landroid/app/PictureInPictureParams$Builder;Landroid/util/Rational;)Landroid/app/PictureInPictureParams$Builder;

    .line 55
    .line 56
    .line 57
    :cond_1
    const/16 p2, 0x1f

    .line 58
    .line 59
    if-lt v1, p2, :cond_2

    .line 60
    .line 61
    invoke-static {v2, p1}, LMd/g;->a(Landroid/app/PictureInPictureParams$Builder;Z)Landroid/app/PictureInPictureParams$Builder;

    .line 62
    .line 63
    .line 64
    :cond_2
    new-instance p1, LMd/j;

    .line 65
    .line 66
    invoke-direct {p1, p0, v2}, LMd/j;-><init>(Landroid/app/Activity;Landroid/app/PictureInPictureParams$Builder;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-static {p2, p1, p0, v0}, LMd/l;->k(ZLie/a;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void
.end method

.method public static synthetic d(Landroid/app/Activity;ZLandroid/util/Rational;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, LMd/l;->c(Landroid/app/Activity;ZLandroid/util/Rational;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final e(Landroid/app/Activity;Landroid/app/PictureInPictureParams$Builder;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p1}, LId/g;->a(Landroid/app/PictureInPictureParams$Builder;)Landroid/app/PictureInPictureParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, LMd/h;->a(Landroid/app/Activity;Landroid/app/PictureInPictureParams;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final f(Landroid/app/Activity;Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rectHint"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    sget-object v0, Lexpo/modules/video/VideoView;->Companion:Lexpo/modules/video/VideoView$a;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lexpo/modules/video/VideoView$a;->a(Landroid/app/Activity;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, LMd/k;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, LMd/k;-><init>(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    const/4 p1, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v1, v0, p0, p1}, LMd/l;->k(ZLie/a;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method private static final g(Landroid/app/Activity;Landroid/graphics/Rect;)LTd/L;
    .locals 1

    .line 1
    invoke-static {}, LId/f;->a()Landroid/app/PictureInPictureParams$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LMd/i;->a(Landroid/app/PictureInPictureParams$Builder;Landroid/graphics/Rect;)Landroid/app/PictureInPictureParams$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, LId/g;->a(Landroid/app/PictureInPictureParams$Builder;)Landroid/app/PictureInPictureParams;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, LMd/h;->a(Landroid/app/Activity;Landroid/app/PictureInPictureParams;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, LTd/L;->a:LTd/L;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final h(Lq2/l0;IILexpo/modules/video/enums/ContentFit;)Landroid/util/Rational;
    .locals 1

    .line 1
    const-string v0, "videoSize"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentFit"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/video/enums/ContentFit;->CONTAIN:Lexpo/modules/video/enums/ContentFit;

    .line 12
    .line 13
    if-ne p3, v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Landroid/util/Rational;

    .line 16
    .line 17
    iget p2, p0, Lq2/l0;->a:I

    .line 18
    .line 19
    iget p0, p0, Lq2/l0;->b:I

    .line 20
    .line 21
    invoke-direct {p1, p2, p0}, Landroid/util/Rational;-><init>(II)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Landroid/util/Rational;

    .line 26
    .line 27
    invoke-direct {p0, p1, p2}, Landroid/util/Rational;-><init>(II)V

    .line 28
    .line 29
    .line 30
    move-object p1, p0

    .line 31
    :goto_0
    new-instance p0, Landroid/util/Rational;

    .line 32
    .line 33
    const/16 p2, 0xef

    .line 34
    .line 35
    const/16 p3, 0x64

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Landroid/util/Rational;-><init>(II)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/util/Rational;

    .line 41
    .line 42
    invoke-direct {v0, p3, p2}, Landroid/util/Rational;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    cmpl-float p2, p2, p3

    .line 54
    .line 55
    if-lez p2, :cond_1

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-virtual {v0}, Landroid/util/Rational;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    cmpg-float p0, p0, p2

    .line 67
    .line 68
    if-gez p0, :cond_2

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    return-object p1
.end method

.method public static final i(Landroidx/media3/ui/PlayerView;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    const-string v0, "playerView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->getVideoSurfaceView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    new-array v1, v1, [I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->getVideoSurfaceView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget p0, v0, Landroid/graphics/Rect;->bottom:I

    .line 33
    .line 34
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    sub-int/2addr p0, v2

    .line 37
    const/4 v2, 0x1

    .line 38
    aget v1, v1, v2

    .line 39
    .line 40
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    add-int/2addr v1, p0

    .line 43
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    return-object v0
.end method

.method public static final j(ZLie/a;)V
    .locals 1

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    const-string p1, "ExpoVideo"

    .line 11
    .line 12
    const-string v0, "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly."

    .line 13
    .line 14
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p0, LFd/s;

    .line 21
    .line 22
    invoke-direct {p0}, LFd/s;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic k(ZLie/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1}, LMd/l;->j(ZLie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
