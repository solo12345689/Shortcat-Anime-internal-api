.class public LE6/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static n:Z


# instance fields
.field private final a:LC5/a;

.field private final b:Ly5/n;

.field private c:Lq6/c;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ly6/b;

.field private k:Landroid/graphics/ColorSpace;

.field private l:Ljava/lang/String;

.field private m:Z


# direct methods
.method public constructor <init>(LC5/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lq6/c;->d:Lq6/c;

    iput-object v0, p0, LE6/k;->c:Lq6/c;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LE6/k;->d:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, LE6/k;->e:I

    .line 5
    iput v0, p0, LE6/k;->f:I

    .line 6
    iput v0, p0, LE6/k;->g:I

    const/4 v1, 0x1

    .line 7
    iput v1, p0, LE6/k;->h:I

    .line 8
    iput v0, p0, LE6/k;->i:I

    .line 9
    invoke-static {p1}, LC5/a;->H(LC5/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ly5/k;->b(Ljava/lang/Boolean;)V

    .line 10
    invoke-virtual {p1}, LC5/a;->g()LC5/a;

    move-result-object p1

    iput-object p1, p0, LE6/k;->a:LC5/a;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, LE6/k;->b:Ly5/n;

    return-void
.end method

.method public constructor <init>(Ly5/n;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v0, Lq6/c;->d:Lq6/c;

    iput-object v0, p0, LE6/k;->c:Lq6/c;

    const/4 v0, -0x1

    .line 14
    iput v0, p0, LE6/k;->d:I

    const/4 v1, 0x0

    .line 15
    iput v1, p0, LE6/k;->e:I

    .line 16
    iput v0, p0, LE6/k;->f:I

    .line 17
    iput v0, p0, LE6/k;->g:I

    const/4 v1, 0x1

    .line 18
    iput v1, p0, LE6/k;->h:I

    .line 19
    iput v0, p0, LE6/k;->i:I

    .line 20
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, LE6/k;->a:LC5/a;

    .line 22
    iput-object p1, p0, LE6/k;->b:Ly5/n;

    return-void
.end method

.method public constructor <init>(Ly5/n;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, LE6/k;-><init>(Ly5/n;)V

    .line 24
    iput p2, p0, LE6/k;->i:I

    return-void
.end method

.method private B0()Lkotlin/Pair;
    .locals 2

    .line 1
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-static {v0}, Lcom/facebook/imageutils/WebpUtil;->getSize(Ljava/io/InputStream;)Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, p0, LE6/k;->f:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iput v1, p0, LE6/k;->g:I

    .line 38
    .line 39
    :cond_1
    return-object v0
.end method

.method private H()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq6/e;->d(Ljava/io/InputStream;)Lq6/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LE6/k;->c:Lq6/c;

    .line 10
    .line 11
    invoke-static {v0}, Lq6/b;->b(Lq6/c;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, LE6/k;->B0()Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, LE6/k;->p0()Lcom/facebook/imageutils/ImageMetaData;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getDimensions()Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    sget-object v2, Lq6/b;->b:Lq6/c;

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    if-ne v0, v2, :cond_1

    .line 34
    .line 35
    iget v2, p0, LE6/k;->d:I

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getOrientation(Ljava/io/InputStream;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, LE6/k;->e:I

    .line 50
    .line 51
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getAutoRotateAngleFromOrientation(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, LE6/k;->d:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    sget-object v1, Lq6/b;->l:Lq6/c;

    .line 59
    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    iget v0, p0, LE6/k;->d:I

    .line 63
    .line 64
    if-ne v0, v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/facebook/imageutils/HeifExifUtil;->getOrientation(Ljava/io/InputStream;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, LE6/k;->e:I

    .line 75
    .line 76
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getAutoRotateAngleFromOrientation(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, LE6/k;->d:I

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    iget v0, p0, LE6/k;->d:I

    .line 84
    .line 85
    if-ne v0, v3, :cond_3

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    iput v0, p0, LE6/k;->d:I

    .line 89
    .line 90
    :cond_3
    return-void
.end method

.method public static O(LE6/k;)Z
    .locals 1

    .line 1
    iget v0, p0, LE6/k;->d:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LE6/k;->f:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, LE6/k;->g:I

    .line 10
    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static Y(LE6/k;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LE6/k;->S()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static b(LE6/k;)LE6/k;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LE6/k;->a()LE6/k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public static g(LE6/k;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LE6/k;->close()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private k0()V
    .locals 1

    .line 1
    iget v0, p0, LE6/k;->f:I

    .line 2
    .line 3
    if-ltz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, LE6/k;->g:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p0}, LE6/k;->h0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private p0()Lcom/facebook/imageutils/ImageMetaData;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {v0}, Lcom/facebook/imageutils/BitmapUtil;->decodeDimensionsAndColorSpace(Ljava/io/InputStream;)Lcom/facebook/imageutils/ImageMetaData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getColorSpace()Landroid/graphics/ColorSpace;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, p0, LE6/k;->k:Landroid/graphics/ColorSpace;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getDimensions()Lkotlin/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, LE6/k;->f:I

    .line 32
    .line 33
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iput v2, p0, LE6/k;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    :cond_1
    return-object v1

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 59
    .line 60
    .line 61
    :catch_1
    :cond_2
    throw v1
.end method


# virtual methods
.method public C()I
    .locals 1

    .line 1
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 12
    .line 13
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LB5/h;

    .line 18
    .line 19
    invoke-interface {v0}, LB5/h;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    iget v0, p0, LE6/k;->i:I

    .line 25
    .line 26
    return v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE6/k;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE6/k;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public F0(Ly6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE6/k;->j:Ly6/b;

    .line 2
    .line 3
    return-void
.end method

.method public G0(I)V
    .locals 0

    .line 1
    iput p1, p0, LE6/k;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public J(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, LE6/k;->c:Lq6/c;

    .line 2
    .line 3
    sget-object v1, Lq6/b;->b:Lq6/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lq6/b;->m:Lq6/c;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget-object v0, p0, LE6/k;->b:Ly5/n;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 19
    .line 20
    invoke-static {v0}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 24
    .line 25
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LB5/h;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    if-ge p1, v3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    add-int/lit8 v3, p1, -0x2

    .line 37
    .line 38
    invoke-interface {v0, v3}, LB5/h;->G(I)B

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, -0x1

    .line 43
    if-ne v3, v4, :cond_3

    .line 44
    .line 45
    sub-int/2addr p1, v2

    .line 46
    invoke-interface {v0, p1}, LB5/h;->G(I)B

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/16 v0, -0x27

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    return v1
.end method

.method public M0(I)V
    .locals 0

    .line 1
    iput p1, p0, LE6/k;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized S()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 3
    .line 4
    invoke-static {v0}, LC5/a;->H(LC5/a;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LE6/k;->b:Ly5/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    :goto_1
    monitor-exit p0

    .line 21
    return v0

    .line 22
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public U0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LE6/k;->e:I

    .line 5
    .line 6
    return v0
.end method

.method public a()LE6/k;
    .locals 3

    .line 1
    iget-object v0, p0, LE6/k;->b:Ly5/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LE6/k;

    .line 6
    .line 7
    iget v2, p0, LE6/k;->i:I

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, LE6/k;-><init>(Ly5/n;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 14
    .line 15
    invoke-static {v0}, LC5/a;->j(LC5/a;)LC5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :try_start_0
    new-instance v1, LE6/k;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LE6/k;-><init>(LC5/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v0}, LC5/a;->m(LC5/a;)V

    .line 29
    .line 30
    .line 31
    :goto_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1, p0}, LE6/k;->h(LE6/k;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-object v1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v0}, LC5/a;->m(LC5/a;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public a1(Lq6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE6/k;->c:Lq6/c;

    .line 2
    .line 3
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 2
    .line 3
    invoke-static {v0}, LC5/a;->m(LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LE6/k;->g:I

    .line 5
    .line 6
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LE6/k;->f:I

    .line 5
    .line 6
    return v0
.end method

.method public h(LE6/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LE6/k;->o()Lq6/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LE6/k;->c:Lq6/c;

    .line 6
    .line 7
    invoke-virtual {p1}, LE6/k;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, LE6/k;->f:I

    .line 12
    .line 13
    invoke-virtual {p1}, LE6/k;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, LE6/k;->g:I

    .line 18
    .line 19
    invoke-virtual {p1}, LE6/k;->h1()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, LE6/k;->d:I

    .line 24
    .line 25
    invoke-virtual {p1}, LE6/k;->U0()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, LE6/k;->e:I

    .line 30
    .line 31
    invoke-virtual {p1}, LE6/k;->z()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, LE6/k;->h:I

    .line 36
    .line 37
    invoke-virtual {p1}, LE6/k;->C()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, LE6/k;->i:I

    .line 42
    .line 43
    invoke-virtual {p1}, LE6/k;->k()Ly6/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, LE6/k;->j:Ly6/b;

    .line 48
    .line 49
    invoke-virtual {p1}, LE6/k;->l()Landroid/graphics/ColorSpace;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, LE6/k;->k:Landroid/graphics/ColorSpace;

    .line 54
    .line 55
    invoke-virtual {p1}, LE6/k;->E()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput-boolean p1, p0, LE6/k;->m:Z

    .line 60
    .line 61
    return-void
.end method

.method public h0()V
    .locals 1

    .line 1
    sget-boolean v0, LE6/k;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LE6/k;->H()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v0, p0, LE6/k;->m:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-direct {p0}, LE6/k;->H()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, LE6/k;->m:Z

    .line 19
    .line 20
    return-void
.end method

.method public h1()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LE6/k;->d:I

    .line 5
    .line 6
    return v0
.end method

.method public j()LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 2
    .line 3
    invoke-static {v0}, LC5/a;->j(LC5/a;)LC5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()Ly6/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE6/k;->j:Ly6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE6/k;->k:Landroid/graphics/ColorSpace;

    .line 5
    .line 6
    return-object v0
.end method

.method public m(I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, LE6/k;->j()LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-virtual {p0}, LE6/k;->C()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    new-array v2, p1, [B

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, LB5/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, LC5/a;->close()V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :try_start_1
    invoke-interface {v3, v1, v2, v1, p1}, LB5/h;->u(I[BII)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, LC5/a;->close()V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    mul-int/lit8 v3, p1, 0x2

    .line 42
    .line 43
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    if-ge v1, p1, :cond_2

    .line 47
    .line 48
    aget-byte v3, v2, v1

    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "%02X"

    .line 59
    .line 60
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    invoke-virtual {v0}, LC5/a;->close()V

    .line 77
    .line 78
    .line 79
    throw p1
.end method

.method public o()Lq6/c;
    .locals 1

    .line 1
    invoke-direct {p0}, LE6/k;->k0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE6/k;->c:Lq6/c;

    .line 5
    .line 6
    return-object v0
.end method

.method public q()Ljava/io/InputStream;
    .locals 3

    .line 1
    iget-object v0, p0, LE6/k;->b:Ly5/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/io/InputStream;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, LE6/k;->a:LC5/a;

    .line 13
    .line 14
    invoke-static {v0}, LC5/a;->j(LC5/a;)LC5/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    new-instance v1, LB5/j;

    .line 21
    .line 22
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LB5/h;

    .line 27
    .line 28
    invoke-direct {v1, v2}, LB5/j;-><init>(LB5/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LC5/a;->m(LC5/a;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    invoke-static {v0}, LC5/a;->m(LC5/a;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return-object v0
.end method

.method public q1(I)V
    .locals 0

    .line 1
    iput p1, p0, LE6/k;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public t1(I)V
    .locals 0

    .line 1
    iput p1, p0, LE6/k;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public u1(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE6/k;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public w()Ljava/io/InputStream;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE6/k;->q()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/io/InputStream;

    .line 10
    .line 11
    return-object v0
.end method

.method public y1(I)V
    .locals 0

    .line 1
    iput p1, p0, LE6/k;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, LE6/k;->h:I

    .line 2
    .line 3
    return v0
.end method
