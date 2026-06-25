.class public Lcom/swmansion/worklets/WorkletsMessageQueueThread;
.super Lcom/swmansion/worklets/WorkletsMessageQueueThreadBase;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/worklets/WorkletsMessageQueueThreadBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public isIdle()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsMessageQueueThreadBase;->messageQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->isIdle()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public runOnQueue(Ljava/lang/Runnable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsMessageQueueThreadBase;->messageQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->runOnQueue(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
