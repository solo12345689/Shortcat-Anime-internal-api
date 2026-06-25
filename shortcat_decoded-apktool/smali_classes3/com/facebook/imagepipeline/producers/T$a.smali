.class Lcom/facebook/imagepipeline/producers/T$a;
.super Lcom/facebook/imagepipeline/producers/m0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/T;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Lcom/facebook/imagepipeline/producers/g0;

.field final synthetic g:Lcom/facebook/imagepipeline/producers/e0;

.field final synthetic h:LK6/b;

.field final synthetic i:Lcom/facebook/imagepipeline/producers/T;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/T;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;LK6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/T$a;->i:Lcom/facebook/imagepipeline/producers/T;

    .line 2
    .line 3
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/T$a;->f:Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 6
    .line 7
    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/T$a;->h:LK6/b;

    .line 8
    .line 9
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/facebook/imagepipeline/producers/m0;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/T$a;->j(LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected bridge synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/T$a;->l()LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected e(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/m0;->e(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/T$a;->f:Lcom/facebook/imagepipeline/producers/g0;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 7
    .line 8
    const-string v1, "VideoThumbnailProducer"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->b(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 15
    .line 16
    const-string v0, "local"

    .line 17
    .line 18
    const-string v1, "video"

    .line 19
    .line 20
    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method protected bridge synthetic f(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/T$a;->m(LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected bridge synthetic i(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/T$a;->k(LC5/a;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected j(LC5/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected k(LC5/a;)Ljava/util/Map;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "createdThumbnail"

    .line 11
    .line 12
    invoke-static {v0, p1}, Ly5/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method protected l()LC5/a;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/T$a;->i:Lcom/facebook/imagepipeline/producers/T;

    .line 3
    .line 4
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/T$a;->h:LK6/b;

    .line 5
    .line 6
    invoke-static {v1, v2}, Lcom/facebook/imagepipeline/producers/T;->d(Lcom/facebook/imagepipeline/producers/T;LK6/b;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-object v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/T$a;->h:LK6/b;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/T;->e(LK6/b;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v1, v2}, Landroid/media/ThumbnailUtils;->createVideoThumbnail(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move-object v1, v0

    .line 26
    :goto_1
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/T$a;->i:Lcom/facebook/imagepipeline/producers/T;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/T;->c(Lcom/facebook/imagepipeline/producers/T;)Landroid/content/ContentResolver;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/T$a;->h:LK6/b;

    .line 35
    .line 36
    invoke-virtual {v2}, LK6/b;->v()Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v1, v2}, Lcom/facebook/imagepipeline/producers/T;->f(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    if-nez v1, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    invoke-static {}, Lw6/f;->b()Lw6/f;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v2, LE6/o;->d:LE6/p;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-static {v1, v0, v2, v3}, LE6/f;->z0(Landroid/graphics/Bitmap;LC5/h;LE6/p;I)LE6/f;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 59
    .line 60
    const-string v2, "image_format"

    .line 61
    .line 62
    const-string v3, "thumbnail"

    .line 63
    .line 64
    invoke-interface {v1, v2, v3}, Lk6/a;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 68
    .line 69
    invoke-interface {v1}, Lk6/a;->getExtras()Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Lk6/a;->w(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, LC5/a;->J(Ljava/io/Closeable;)LC5/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method

.method protected m(LC5/a;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/m0;->f(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/T$a;->f:Lcom/facebook/imagepipeline/producers/g0;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    const-string v2, "VideoThumbnailProducer"

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/g0;->b(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/T$a;->g:Lcom/facebook/imagepipeline/producers/e0;

    .line 19
    .line 20
    const-string v0, "local"

    .line 21
    .line 22
    const-string v1, "video"

    .line 23
    .line 24
    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
