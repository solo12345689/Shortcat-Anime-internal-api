.class public final Lb5/Q$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lb5/Q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/data/k;

.field private final b:LV4/b;

.field private final c:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/util/List;LV4/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LV4/b;

    .line 9
    .line 10
    iput-object v0, p0, Lb5/Q$b;->b:LV4/b;

    .line 11
    .line 12
    invoke-static {p2}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Ljava/util/List;

    .line 17
    .line 18
    iput-object p2, p0, Lb5/Q$b;->c:Ljava/util/List;

    .line 19
    .line 20
    new-instance p2, Lcom/bumptech/glide/load/data/k;

    .line 21
    .line 22
    invoke-direct {p2, p1, p3}, Lcom/bumptech/glide/load/data/k;-><init>(Ljava/io/InputStream;LV4/b;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/k;->d()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1, p0}, Lb5/N;->b(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lb5/Q;)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public b()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/Q$b;->c:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/k;->d()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lb5/Q$b;->b:LV4/b;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/a;->j(Ljava/util/List;Ljava/io/InputStream;LV4/b;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/k;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()I
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/Q$b;->c:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/k;->d()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lb5/Q$b;->b:LV4/b;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/a;->b(Ljava/util/List;Ljava/io/InputStream;LV4/b;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public e()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/Q$b;->c:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$b;->a:Lcom/bumptech/glide/load/data/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/k;->d()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lb5/Q$b;->b:LV4/b;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/a;->f(Ljava/util/List;Ljava/io/InputStream;LV4/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
