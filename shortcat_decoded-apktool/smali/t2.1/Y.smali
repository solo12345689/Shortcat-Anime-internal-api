.class public final synthetic Lt2/Y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/common/util/concurrent/p;

.field public final synthetic b:Lcom/google/common/util/concurrent/w;

.field public final synthetic c:Lcom/google/common/util/concurrent/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/w;Lcom/google/common/util/concurrent/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/Y;->a:Lcom/google/common/util/concurrent/p;

    .line 5
    .line 6
    iput-object p2, p0, Lt2/Y;->b:Lcom/google/common/util/concurrent/w;

    .line 7
    .line 8
    iput-object p3, p0, Lt2/Y;->c:Lcom/google/common/util/concurrent/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/Y;->a:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    iget-object v1, p0, Lt2/Y;->b:Lcom/google/common/util/concurrent/w;

    .line 4
    .line 5
    iget-object v2, p0, Lt2/Y;->c:Lcom/google/common/util/concurrent/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lt2/a0;->c(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/w;Lcom/google/common/util/concurrent/d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
