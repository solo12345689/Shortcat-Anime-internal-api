.class public final Lexpo/modules/video/records/StatusChangedEventPayload;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/video/records/VideoEventPayload;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\n\u001a\u0004\u0008\u000e\u0010\u000cR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/video/records/StatusChangedEventPayload;",
        "Lexpo/modules/video/records/VideoEventPayload;",
        "status",
        "Lexpo/modules/video/enums/PlayerStatus;",
        "oldStatus",
        "error",
        "Lexpo/modules/video/records/PlaybackError;",
        "<init>",
        "(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V",
        "getStatus$annotations",
        "()V",
        "getStatus",
        "()Lexpo/modules/video/enums/PlayerStatus;",
        "getOldStatus$annotations",
        "getOldStatus",
        "getError$annotations",
        "getError",
        "()Lexpo/modules/video/records/PlaybackError;",
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
.field private final error:Lexpo/modules/video/records/PlaybackError;

.field private final oldStatus:Lexpo/modules/video/enums/PlayerStatus;

.field private final status:Lexpo/modules/video/enums/PlayerStatus;


# direct methods
.method public constructor <init>(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->status:Lexpo/modules/video/enums/PlayerStatus;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->oldStatus:Lexpo/modules/video/enums/PlayerStatus;

    .line 12
    .line 13
    iput-object p3, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->error:Lexpo/modules/video/records/PlaybackError;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic getError$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getOldStatus$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getError()Lexpo/modules/video/records/PlaybackError;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->error:Lexpo/modules/video/records/PlaybackError;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOldStatus()Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->oldStatus:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/StatusChangedEventPayload;->status:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    return-object v0
.end method
