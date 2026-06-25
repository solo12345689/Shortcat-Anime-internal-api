.class public Lio/sentry/react/replay/RNSentryReplayUnmaskManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/A0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lio/sentry/react/replay/c;",
        ">;",
        "Lcom/facebook/react/uimanager/A0;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "RNSentryReplayUnmask"
.end annotation


# instance fields
.field private final delegate:LK7/d1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LK7/d1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LK7/d1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LK7/d1;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;->delegate:LK7/d1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lio/sentry/react/replay/c;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lio/sentry/react/replay/c;
    .locals 1

    .line 2
    new-instance v0, Lio/sentry/react/replay/c;

    invoke-direct {v0, p1}, Lio/sentry/react/replay/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/q0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;->delegate:LK7/d1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNSentryReplayUnmask"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/m;->removeAllViews(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
