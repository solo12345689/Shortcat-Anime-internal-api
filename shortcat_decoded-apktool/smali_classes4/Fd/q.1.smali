.class public abstract LFd/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Landroid/media/MediaMetadataRetriever;J)J
    .locals 2

    .line 1
    invoke-static {p0}, LFd/q;->c(Landroid/media/MediaMetadataRetriever;)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {p1, p2}, LEf/a;->v(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    long-to-double p0, p0

    .line 16
    div-double/2addr p0, v0

    .line 17
    invoke-static {p0, p1}, Lke/a;->e(D)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-double p0, p0

    .line 22
    mul-double/2addr p0, v0

    .line 23
    sget-object p2, LEf/d;->c:LEf/d;

    .line 24
    .line 25
    invoke-static {p0, p1, p2}, LEf/c;->r(DLEf/d;)J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    return-wide p0

    .line 30
    :cond_0
    return-wide p1
.end method

.method private static final b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    int-to-float p1, p1

    .line 11
    div-float p1, v0, p1

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    int-to-float p2, p2

    .line 15
    div-float p2, v1, p2

    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/high16 p2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    cmpg-float p2, p1, p2

    .line 24
    .line 25
    if-gtz p2, :cond_0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    div-float/2addr v0, p1

    .line 29
    float-to-int p2, v0

    .line 30
    div-float/2addr v1, p1

    .line 31
    float-to-int p1, v1

    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-static {p0, p2, p1, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p1, "createScaledBitmap(...)"

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method private static final c(Landroid/media/MediaMetadataRetriever;)Ljava/lang/Double;
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    const/16 v0, 0x9

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 p0, 0x3e8

    .line 34
    .line 35
    int-to-double v4, p0

    .line 36
    mul-double/2addr v0, v4

    .line 37
    div-double/2addr v0, v2

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    return-object v2
.end method

.method public static final d(Landroid/media/MediaMetadataRetriever;JLexpo/modules/video/records/VideoThumbnailOptions;)Lexpo/modules/video/VideoThumbnail;
    .locals 9

    .line 1
    const-string v0, "$this$generateThumbnailAtTime"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lexpo/modules/video/records/VideoThumbnailOptions;->toNativeSizeLimit()Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p3, v0

    .line 15
    :goto_0
    const/4 v1, 0x3

    .line 16
    if-eqz p3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-virtual {p3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v2, 0x1b

    .line 41
    .line 42
    if-lt p3, v2, :cond_2

    .line 43
    .line 44
    invoke-static {p1, p2}, LEf/a;->v(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    const/4 v6, 0x3

    .line 49
    move-object v3, p0

    .line 50
    invoke-static/range {v3 .. v8}, Lb5/a0;->a(Landroid/media/MediaMetadataRetriever;JIII)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_1
    :goto_1
    move-object v2, v0

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v3, p0

    .line 57
    invoke-static {p1, p2}, LEf/a;->v(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-virtual {v3, v4, v5, v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    invoke-static {p0, v7, v8}, LFd/q;->b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v3, p0

    .line 73
    invoke-static {p1, p2}, LEf/a;->v(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-virtual {v3, v4, v5, v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_1

    .line 82
    :goto_2
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-static {v3, p1, p2}, LFd/q;->a(Landroid/media/MediaMetadataRetriever;J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    new-instance v1, Lexpo/modules/video/VideoThumbnail;

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    move-wide v3, p1

    .line 92
    invoke-direct/range {v1 .. v7}, Lexpo/modules/video/VideoThumbnail;-><init>(Landroid/graphics/Bitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p1, "Failed to generate thumbnail"

    .line 99
    .line 100
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public static final e(Landroid/media/MediaMetadataRetriever;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LFd/q$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LFd/q$a;

    .line 7
    .line 8
    iget v1, v0, LFd/q$a;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LFd/q$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LFd/q$a;

    .line 21
    .line 22
    invoke-direct {v0, p2}, LFd/q$a;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LFd/q$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LFd/q$a;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LFd/q$a;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/media/MediaMetadataRetriever;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iput-object p0, v0, LFd/q$a;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, LFd/q$a;->c:I

    .line 62
    .line 63
    invoke-interface {p1, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    invoke-static {p0}, Lz1/e;->a(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object p2

    .line 74
    :goto_2
    invoke-static {p0}, Lz1/e;->a(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method
