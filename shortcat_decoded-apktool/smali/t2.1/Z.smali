.class public final synthetic Lt2/Z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/common/util/concurrent/w;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/w;Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/Z;->a:Lcom/google/common/util/concurrent/w;

    .line 5
    .line 6
    iput-object p2, p0, Lt2/Z;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    iput-object p3, p0, Lt2/Z;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/Z;->a:Lcom/google/common/util/concurrent/w;

    .line 2
    .line 3
    iget-object v1, p0, Lt2/Z;->b:Ljava/lang/Runnable;

    .line 4
    .line 5
    iget-object v2, p0, Lt2/Z;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lt2/a0;->a(Lcom/google/common/util/concurrent/w;Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
