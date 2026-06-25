.class public final synthetic Lcom/facebook/react/runtime/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/y;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleException(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/y;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->V(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
