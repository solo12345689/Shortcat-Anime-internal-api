.class public final synthetic Lcom/facebook/react/runtime/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/MemoryPressureListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/u;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/runtime/u;->b:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMemoryPressure(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/u;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/runtime/u;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->H(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/ref/WeakReference;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
