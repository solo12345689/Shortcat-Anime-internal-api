.class public final synthetic Lcom/facebook/react/runtime/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/devsupport/inspector/TracingStateListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Lcom/facebook/react/runtime/ReactHostInspectorTarget;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostInspectorTarget;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/B;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/runtime/B;->b:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onStateChanged(Lcom/facebook/react/devsupport/inspector/TracingState;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/B;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/runtime/B;->b:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->B(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostInspectorTarget;Lcom/facebook/react/devsupport/inspector/TracingState;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
