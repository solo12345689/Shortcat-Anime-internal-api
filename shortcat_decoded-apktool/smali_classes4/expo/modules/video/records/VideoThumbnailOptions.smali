.class public final Lexpo/modules/video/records/VideoThumbnailOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\n\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\n\u0012\u0004\u0008\u0010\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoThumbnailOptions;",
        "Ljc/b;",
        "",
        "maxWidth",
        "maxHeight",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "Lkotlin/Pair;",
        "toNativeSizeLimit",
        "()Lkotlin/Pair;",
        "Ljava/lang/Integer;",
        "getMaxWidth",
        "()Ljava/lang/Integer;",
        "getMaxWidth$annotations",
        "()V",
        "getMaxHeight",
        "getMaxHeight$annotations",
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
.field private final maxHeight:Ljava/lang/Integer;

.field private final maxWidth:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lexpo/modules/video/records/VideoThumbnailOptions;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxWidth:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxHeight:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lexpo/modules/video/records/VideoThumbnailOptions;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic getMaxHeight$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMaxWidth$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getMaxHeight()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxHeight:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxWidth()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxWidth:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toNativeSizeLimit()Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxWidth:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxHeight:Ljava/lang/Integer;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    const v1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v1

    .line 22
    :goto_0
    iget-object v2, p0, Lexpo/modules/video/records/VideoThumbnailOptions;->maxHeight:Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :cond_2
    const/4 v2, 0x1

    .line 31
    if-lt v0, v2, :cond_3

    .line 32
    .line 33
    if-lt v1, v2, :cond_3

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string v1, "Failed to generate a thumbnail: The maxWidth and maxHeight parameters must be greater than zero"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method
