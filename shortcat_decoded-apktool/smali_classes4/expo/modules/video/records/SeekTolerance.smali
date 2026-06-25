.class public final Lexpo/modules/video/records/SeekTolerance;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u0010\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\u0010\u0012\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0012\"\u0004\u0008\u0018\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/video/records/SeekTolerance;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "toleranceBefore",
        "toleranceAfter",
        "<init>",
        "(DD)V",
        "LA2/Q;",
        "toSeekParameters",
        "()LA2/Q;",
        "Lexpo/modules/video/player/VideoPlayer;",
        "videoPlayer",
        "LTd/L;",
        "applyToPlayer",
        "(Lexpo/modules/video/player/VideoPlayer;)V",
        "D",
        "getToleranceBefore",
        "()D",
        "setToleranceBefore",
        "(D)V",
        "getToleranceBefore$annotations",
        "()V",
        "getToleranceAfter",
        "setToleranceAfter",
        "getToleranceAfter$annotations",
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
.field private toleranceAfter:D

.field private toleranceBefore:D


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v5, 0x3

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lexpo/modules/video/records/SeekTolerance;-><init>(DDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceBefore:D

    .line 4
    iput-wide p3, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceAfter:D

    return-void
.end method

.method public synthetic constructor <init>(DDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    const-wide/16 v0, 0x0

    if-eqz p6, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    move-wide p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/video/records/SeekTolerance;-><init>(DD)V

    return-void
.end method

.method public static synthetic getToleranceAfter$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getToleranceBefore$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method private final toSeekParameters()LA2/Q;
    .locals 6

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceBefore:D

    .line 2
    .line 3
    const/16 v2, 0x3e8

    .line 4
    .line 5
    int-to-double v2, v2

    .line 6
    mul-double/2addr v0, v2

    .line 7
    double-to-long v0, v0

    .line 8
    iget-wide v4, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceAfter:D

    .line 9
    .line 10
    mul-double/2addr v4, v2

    .line 11
    double-to-long v2, v4

    .line 12
    new-instance v4, LA2/Q;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v2, v3}, Lt2/a0;->V0(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-direct {v4, v0, v1, v2, v3}, LA2/Q;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    return-object v4
.end method


# virtual methods
.method public final applyToPlayer(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 1

    .line 1
    const-string v0, "videoPlayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0}, Lexpo/modules/video/records/SeekTolerance;->toSeekParameters()LA2/Q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->d(LA2/Q;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final getToleranceAfter()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceAfter:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getToleranceBefore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceBefore:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final setToleranceAfter(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceAfter:D

    .line 2
    .line 3
    return-void
.end method

.method public final setToleranceBefore(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lexpo/modules/video/records/SeekTolerance;->toleranceBefore:D

    .line 2
    .line 3
    return-void
.end method
