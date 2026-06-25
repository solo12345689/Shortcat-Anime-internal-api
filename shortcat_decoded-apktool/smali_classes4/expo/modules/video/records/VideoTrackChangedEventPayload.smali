.class public final Lexpo/modules/video/records/VideoTrackChangedEventPayload;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/video/records/VideoEventPayload;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoTrackChangedEventPayload;",
        "Lexpo/modules/video/records/VideoEventPayload;",
        "videoTrack",
        "Lexpo/modules/video/records/VideoTrack;",
        "oldVideoTrack",
        "<init>",
        "(Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V",
        "getVideoTrack$annotations",
        "()V",
        "getVideoTrack",
        "()Lexpo/modules/video/records/VideoTrack;",
        "getOldVideoTrack$annotations",
        "getOldVideoTrack",
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
.field private final oldVideoTrack:Lexpo/modules/video/records/VideoTrack;

.field private final videoTrack:Lexpo/modules/video/records/VideoTrack;


# direct methods
.method public constructor <init>(Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/video/records/VideoTrackChangedEventPayload;->videoTrack:Lexpo/modules/video/records/VideoTrack;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/video/records/VideoTrackChangedEventPayload;->oldVideoTrack:Lexpo/modules/video/records/VideoTrack;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic getOldVideoTrack$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getVideoTrack$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getOldVideoTrack()Lexpo/modules/video/records/VideoTrack;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrackChangedEventPayload;->oldVideoTrack:Lexpo/modules/video/records/VideoTrack;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoTrack()Lexpo/modules/video/records/VideoTrack;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrackChangedEventPayload;->videoTrack:Lexpo/modules/video/records/VideoTrack;

    .line 2
    .line 3
    return-object v0
.end method
