.class public final Lb5/Q$a;
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
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private final b:Ljava/util/List;

.field private final c:LV4/b;


# direct methods
.method constructor <init>(Ljava/nio/ByteBuffer;Ljava/util/List;LV4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/Q$a;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/Q$a;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lb5/Q$a;->c:LV4/b;

    .line 9
    .line 10
    return-void
.end method

.method private f()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/Q$a;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lo5/a;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lo5/a;->g(Ljava/nio/ByteBuffer;)Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-direct {p0}, Lb5/Q$a;->f()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1, p0}, Lb5/N;->b(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lb5/Q;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public b()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/Q$a;->b:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$a;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-static {v1}, Lo5/a;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lb5/Q$a;->c:LV4/b;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/a;->k(Ljava/util/List;Ljava/nio/ByteBuffer;LV4/b;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()I
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/Q$a;->b:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$a;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-static {v1}, Lo5/a;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lb5/Q$a;->c:LV4/b;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/a;->c(Ljava/util/List;Ljava/nio/ByteBuffer;LV4/b;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public e()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/Q$a;->b:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/Q$a;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-static {v1}, Lo5/a;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/load/a;->g(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
