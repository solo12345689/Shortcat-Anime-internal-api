.class public final Lexpo/modules/video/records/VideoMetadata;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\n\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\n\u0012\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u000eR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0007\u0010\u0014\u0012\u0004\u0008\u0019\u0010\u0010\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoMetadata;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "title",
        "artist",
        "Landroid/net/Uri;",
        "artwork",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V",
        "Ljava/lang/String;",
        "getTitle",
        "()Ljava/lang/String;",
        "setTitle",
        "(Ljava/lang/String;)V",
        "getTitle$annotations",
        "()V",
        "getArtist",
        "setArtist",
        "getArtist$annotations",
        "Landroid/net/Uri;",
        "getArtwork",
        "()Landroid/net/Uri;",
        "setArtwork",
        "(Landroid/net/Uri;)V",
        "getArtwork$annotations",
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
.field private artist:Ljava/lang/String;

.field private artwork:Landroid/net/Uri;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lexpo/modules/video/records/VideoMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/VideoMetadata;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lexpo/modules/video/records/VideoMetadata;->artist:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lexpo/modules/video/records/VideoMetadata;->artwork:Landroid/net/Uri;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/video/records/VideoMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic getArtist$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getArtwork$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getArtist()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoMetadata;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getArtwork()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoMetadata;->artwork:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoMetadata;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoMetadata;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtwork(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoMetadata;->artwork:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoMetadata;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
