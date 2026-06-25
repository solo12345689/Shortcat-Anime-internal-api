.class public final Lexpo/modules/video/records/VideoSourceLoadedEventPayload;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/video/records/VideoEventPayload;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u00002\u00020\u0001BC\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0018R\"\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0010\u001a\u0004\u0008\u001a\u0010\u0018R\"\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0010\u001a\u0004\u0008\u001c\u0010\u0018\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoSourceLoadedEventPayload;",
        "Lexpo/modules/video/records/VideoEventPayload;",
        "videoSource",
        "Lexpo/modules/video/records/VideoSource;",
        "duration",
        "",
        "availableVideoTracks",
        "",
        "Lexpo/modules/video/records/VideoTrack;",
        "availableSubtitleTracks",
        "Lexpo/modules/video/records/SubtitleTrack;",
        "availableAudioTracks",
        "Lexpo/modules/video/records/AudioTrack;",
        "<init>",
        "(Lexpo/modules/video/records/VideoSource;DLjava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getVideoSource$annotations",
        "()V",
        "getVideoSource",
        "()Lexpo/modules/video/records/VideoSource;",
        "getDuration$annotations",
        "getDuration",
        "()D",
        "getAvailableVideoTracks$annotations",
        "getAvailableVideoTracks",
        "()Ljava/util/List;",
        "getAvailableSubtitleTracks$annotations",
        "getAvailableSubtitleTracks",
        "getAvailableAudioTracks$annotations",
        "getAvailableAudioTracks",
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
.field private final availableAudioTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/video/records/AudioTrack;",
            ">;"
        }
    .end annotation
.end field

.field private final availableSubtitleTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/video/records/SubtitleTrack;",
            ">;"
        }
    .end annotation
.end field

.field private final availableVideoTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/video/records/VideoTrack;",
            ">;"
        }
    .end annotation
.end field

.field private final duration:D

.field private final videoSource:Lexpo/modules/video/records/VideoSource;


# direct methods
.method public constructor <init>(Lexpo/modules/video/records/VideoSource;DLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/video/records/VideoSource;",
            "D",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/VideoTrack;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/SubtitleTrack;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/AudioTrack;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "availableVideoTracks"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "availableSubtitleTracks"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "availableAudioTracks"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->videoSource:Lexpo/modules/video/records/VideoSource;

    .line 20
    .line 21
    iput-wide p2, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->duration:D

    .line 22
    .line 23
    iput-object p4, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableVideoTracks:Ljava/util/List;

    .line 24
    .line 25
    iput-object p5, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableSubtitleTracks:Ljava/util/List;

    .line 26
    .line 27
    iput-object p6, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableAudioTracks:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic getAvailableAudioTracks$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getAvailableSubtitleTracks$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getAvailableVideoTracks$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getDuration$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getVideoSource$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getAvailableAudioTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/AudioTrack;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableAudioTracks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvailableSubtitleTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/SubtitleTrack;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableSubtitleTracks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvailableVideoTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/video/records/VideoTrack;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->availableVideoTracks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDuration()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->duration:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getVideoSource()Lexpo/modules/video/records/VideoSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;->videoSource:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    return-object v0
.end method
