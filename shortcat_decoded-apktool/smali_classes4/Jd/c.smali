.class public final LJd/c;
.super Landroid/os/Binder;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;


# direct methods
.method public constructor <init>(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LJd/c;->a:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/c;->a:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 2
    .line 3
    return-object v0
.end method
