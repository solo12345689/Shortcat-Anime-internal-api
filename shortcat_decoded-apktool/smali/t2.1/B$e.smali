.class final Lt2/B$e;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt2/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lt2/B;


# direct methods
.method private constructor <init>(Lt2/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/B$e;->a:Lt2/B;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lt2/B;Lt2/B$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lt2/B$e;-><init>(Lt2/B;)V

    return-void
.end method

.method public static synthetic a(Lt2/B$e;Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt2/B$e;->a:Lt2/B;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lt2/B;->c(Lt2/B;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lt2/B$e;->a:Lt2/B;

    .line 2
    .line 3
    invoke-static {p2}, Lt2/B;->b(Lt2/B;)Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lt2/G;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lt2/G;-><init>(Lt2/B$e;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
