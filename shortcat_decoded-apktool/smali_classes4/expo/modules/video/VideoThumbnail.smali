.class public final Lexpo/modules/video/VideoThumbnail;
.super Lexpo/modules/kotlin/sharedobjects/SharedRef;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lexpo/modules/kotlin/sharedobjects/SharedRef<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\r\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/video/VideoThumbnail;",
        "Lexpo/modules/kotlin/sharedobjects/SharedRef;",
        "Landroid/graphics/Bitmap;",
        "ref",
        "LEf/a;",
        "requestedTime",
        "actualTime",
        "<init>",
        "(Landroid/graphics/Bitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "k",
        "()I",
        "e",
        "J",
        "Y",
        "()J",
        "f",
        "S",
        "g",
        "I",
        "getWidth",
        "width",
        "h",
        "getHeight",
        "height",
        "",
        "i",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "nativeRefType",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final e:J

.field private final f:J

.field private final g:I

.field private final h:I

.field private final i:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/graphics/Bitmap;JJ)V
    .locals 2

    const-string v0, "ref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 2
    invoke-direct {p0, p1, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedRef;-><init>(Ljava/lang/Object;Llc/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-wide p2, p0, Lexpo/modules/video/VideoThumbnail;->e:J

    .line 4
    iput-wide p4, p0, Lexpo/modules/video/VideoThumbnail;->f:J

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    iput p2, p0, Lexpo/modules/video/VideoThumbnail;->g:I

    .line 6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lexpo/modules/video/VideoThumbnail;->h:I

    .line 7
    const-string p1, "image"

    iput-object p1, p0, Lexpo/modules/video/VideoThumbnail;->i:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Bitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lexpo/modules/video/VideoThumbnail;-><init>(Landroid/graphics/Bitmap;JJ)V

    return-void
.end method


# virtual methods
.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/VideoThumbnail;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/VideoThumbnail;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final Y()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/VideoThumbnail;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/video/VideoThumbnail;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/video/VideoThumbnail;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedRef;->O()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/Bitmap;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
