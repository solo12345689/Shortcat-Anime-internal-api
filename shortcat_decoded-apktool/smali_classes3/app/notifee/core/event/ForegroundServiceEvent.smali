.class public Lapp/notifee/core/event/ForegroundServiceEvent;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final a:Lapp/notifee/core/model/NotificationModel;

.field public b:Lapp/notifee/core/interfaces/MethodCallResult;

.field public c:Z


# direct methods
.method public constructor <init>(Lapp/notifee/core/model/NotificationModel;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->c:Z

    .line 6
    .line 7
    iput-object p1, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->a:Lapp/notifee/core/model/NotificationModel;

    .line 8
    .line 9
    iput-object p2, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->b:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getNotification()Lapp/notifee/core/model/NotificationModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->a:Lapp/notifee/core/model/NotificationModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public setCompletionResult()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lapp/notifee/core/event/ForegroundServiceEvent;->b:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
