.class Lcom/swmansion/worklets/runloop/AnimationFrameQueue$1;
.super Lcom/facebook/react/uimanager/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/worklets/runloop/AnimationFrameQueue;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;


# direct methods
.method constructor <init>(Lcom/swmansion/worklets/runloop/AnimationFrameQueue;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue$1;->this$0:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/l;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected doFrameGuarded(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue$1;->this$0:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->a(Lcom/swmansion/worklets/runloop/AnimationFrameQueue;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
