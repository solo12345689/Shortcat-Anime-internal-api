.class public final synthetic Lt2/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic b:I

.field public final synthetic c:Lt2/v$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILt2/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/u;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    iput p2, p0, Lt2/u;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lt2/u;->c:Lt2/v$a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/u;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    iget v1, p0, Lt2/u;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lt2/u;->c:Lt2/v$a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lt2/v;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILt2/v$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
