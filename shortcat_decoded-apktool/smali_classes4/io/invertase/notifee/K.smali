.class public final synthetic Lio/invertase/notifee/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/invertase/notifee/b$d;


# instance fields
.field public final synthetic a:Lapp/notifee/core/event/ForegroundServiceEvent;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/event/ForegroundServiceEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/invertase/notifee/K;->a:Lapp/notifee/core/event/ForegroundServiceEvent;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/K;->a:Lapp/notifee/core/event/ForegroundServiceEvent;

    .line 2
    .line 3
    invoke-virtual {v0}, Lapp/notifee/core/event/ForegroundServiceEvent;->setCompletionResult()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
