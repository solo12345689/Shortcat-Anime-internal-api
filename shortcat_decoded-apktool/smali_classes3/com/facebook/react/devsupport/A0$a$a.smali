.class public final Lcom/facebook/react/devsupport/A0$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/A0$a;->b(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/A0$a$a;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/A0$a$a;->b:Lcom/facebook/react/bridge/ReactContext;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onHostDestroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/A0$a$a;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/A0$a$a;->b:Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
