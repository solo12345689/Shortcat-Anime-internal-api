.class LE3/S1$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/S1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:LE3/S1;


# direct methods
.method private constructor <init>(LE3/S1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/S1$f;->a:LE3/S1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LE3/S1;LE3/S1$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE3/S1$f;-><init>(LE3/S1;)V

    return-void
.end method

.method public static synthetic a(LE3/S1$f;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    iget-object v0, p0, LE3/S1;->c:LE3/X2;

    .line 4
    .line 5
    invoke-static {p0}, LE3/S1;->d3(LE3/S1;)Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1, v0, p2, p0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic b(LE3/S1$f;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    iget-object v0, p0, LE3/S1;->c:LE3/X2;

    .line 4
    .line 5
    invoke-static {p0}, LE3/S1;->d3(LE3/S1;)Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1, v0, p2, p0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic c(LE3/S1$f;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, p0, p2, v0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic d(LE3/S1$f;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, p0, p2, v0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 10
    .line 11
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 23
    .line 24
    new-instance v1, Landroid/view/Surface;

    .line 25
    .line 26
    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, LE3/S1;->e3(LE3/S1;Landroid/view/Surface;)Landroid/view/Surface;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 33
    .line 34
    new-instance v0, LE3/W1;

    .line 35
    .line 36
    invoke-direct {v0, p0}, LE3/W1;-><init>(LE3/S1$f;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, LE3/S1;->f3(LE3/S1;LE3/S1$d;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 43
    .line 44
    invoke-static {p1, p2, p3}, LE3/S1;->g3(LE3/S1;II)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 11
    .line 12
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eq v0, p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, LE3/S1;->e3(LE3/S1;Landroid/view/Surface;)Landroid/view/Surface;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 30
    .line 31
    new-instance v0, LE3/X1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, LE3/X1;-><init>(LE3/S1$f;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, LE3/S1;->f3(LE3/S1;LE3/S1$d;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {p1, v0, v0}, LE3/S1;->g3(LE3/S1;II)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    return v1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 10
    .line 11
    invoke-static {v0}, LE3/S1;->h3(LE3/S1;)Landroid/view/TextureView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 23
    .line 24
    invoke-static {p1, p2, p3}, LE3/S1;->g3(LE3/S1;II)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 1
    iget-object p2, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {p2}, LE3/S1;->c3(LE3/S1;)Landroid/view/SurfaceHolder;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eq p2, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 11
    .line 12
    invoke-static {p1, p3, p4}, LE3/S1;->g3(LE3/S1;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->c3(LE3/S1;)Landroid/view/SurfaceHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 11
    .line 12
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, LE3/S1;->e3(LE3/S1;Landroid/view/Surface;)Landroid/view/Surface;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 20
    .line 21
    new-instance v1, LE3/U1;

    .line 22
    .line 23
    invoke-direct {v1, p0}, LE3/U1;-><init>(LE3/S1$f;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, LE3/S1;->f3(LE3/S1;LE3/S1$d;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {v0, v1, p1}, LE3/S1;->g3(LE3/S1;II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1$f;->a:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->c3(LE3/S1;)Landroid/view/SurfaceHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0}, LE3/S1;->e3(LE3/S1;Landroid/view/Surface;)Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 17
    .line 18
    new-instance v0, LE3/V1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LE3/V1;-><init>(LE3/S1$f;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, LE3/S1;->f3(LE3/S1;LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LE3/S1$f;->a:LE3/S1;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0, v0}, LE3/S1;->g3(LE3/S1;II)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
