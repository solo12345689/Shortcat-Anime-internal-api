.class Lcom/swmansion/reanimated/CopiedEvent$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/events/RCTEventEmitter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/CopiedEvent;-><init>(Lcom/facebook/react/uimanager/events/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/CopiedEvent;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/CopiedEvent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/reanimated/CopiedEvent$1;->this$0:Lcom/swmansion/reanimated/CopiedEvent;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/CopiedEvent$1;->this$0:Lcom/swmansion/reanimated/CopiedEvent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/swmansion/reanimated/CopiedEvent;->c(Lcom/swmansion/reanimated/CopiedEvent;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/swmansion/reanimated/CopiedEvent$1;->this$0:Lcom/swmansion/reanimated/CopiedEvent;

    .line 7
    .line 8
    invoke-static {p1, p2}, Lcom/swmansion/reanimated/CopiedEvent;->a(Lcom/swmansion/reanimated/CopiedEvent;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/swmansion/reanimated/CopiedEvent$1;->this$0:Lcom/swmansion/reanimated/CopiedEvent;

    .line 12
    .line 13
    invoke-interface {p3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Lcom/swmansion/reanimated/CopiedEvent;->b(Lcom/swmansion/reanimated/CopiedEvent;Lcom/facebook/react/bridge/WritableMap;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V
    .locals 0

    .line 1
    return-void
.end method
