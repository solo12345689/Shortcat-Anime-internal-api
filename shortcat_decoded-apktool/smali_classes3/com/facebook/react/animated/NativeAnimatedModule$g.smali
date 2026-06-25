.class public final Lcom/facebook/react/animated/NativeAnimatedModule$g;
.super Lcom/facebook/react/uimanager/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$g;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/l;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected doFrameGuarded(J)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$g;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$setEnqueuedAnimationOnFrame$p(Lcom/facebook/react/animated/NativeAnimatedModule;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$g;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {v0}, LT6/t;->o()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, LT6/t;->u(J)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$g;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$enqueueFrameCallback(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_1
    new-instance p2, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p2
.end method
