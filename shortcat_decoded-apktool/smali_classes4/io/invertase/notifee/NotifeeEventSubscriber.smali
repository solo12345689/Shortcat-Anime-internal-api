.class public Lio/invertase/notifee/NotifeeEventSubscriber;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lapp/notifee/core/interfaces/EventListener;


# static fields
.field static final FOREGROUND_NOTIFICATION_TASK_KEY:Ljava/lang/String; = "app.notifee.foreground-service-headless-task"

.field private static final KEY_BLOCKED:Ljava/lang/String; = "blocked"

.field private static final KEY_DETAIL:Ljava/lang/String; = "detail"

.field private static final KEY_DETAIL_INPUT:Ljava/lang/String; = "input"

.field private static final KEY_DETAIL_PRESS_ACTION:Ljava/lang/String; = "pressAction"

.field private static final KEY_HEADLESS:Ljava/lang/String; = "headless"

.field private static final KEY_NOTIFICATION:Ljava/lang/String; = "notification"

.field private static final KEY_TYPE:Ljava/lang/String; = "type"

.field static final NOTIFICATION_EVENT_KEY:Ljava/lang/String; = "app.notifee.notification-event"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onBlockStateEvent(Lapp/notifee/core/event/BlockStateEvent;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "type"

    .line 10
    .line 11
    invoke-virtual {p1}, Lapp/notifee/core/event/BlockStateEvent;->getType()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lapp/notifee/core/event/BlockStateEvent;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x5

    .line 23
    if-eq v2, v3, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x6

    .line 26
    if-ne v2, v4, :cond_2

    .line 27
    .line 28
    :cond_0
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    const-string v3, "channel"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v3, "channelGroup"

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1}, Lapp/notifee/core/event/BlockStateEvent;->getChannelOrGroupBundle()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Lapp/notifee/core/event/BlockStateEvent;->getChannelOrGroupBundle()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    const/4 v3, 0x4

    .line 53
    if-ne v2, v3, :cond_3

    .line 54
    .line 55
    const-string v2, "blocked"

    .line 56
    .line 57
    invoke-virtual {p1}, Lapp/notifee/core/event/BlockStateEvent;->isBlocked()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    :cond_3
    const-string v2, "detail"

    .line 65
    .line 66
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lio/invertase/notifee/L;->b()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const-string v2, "app.notifee.notification-event"

    .line 74
    .line 75
    const-string v3, "headless"

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-interface {v0, v3, p1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v0}, Lio/invertase/notifee/L;->h(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    const/4 v1, 0x1

    .line 88
    invoke-interface {v0, v3, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lio/invertase/notifee/J;

    .line 92
    .line 93
    invoke-direct {v1, p1}, Lio/invertase/notifee/J;-><init>(Lapp/notifee/core/event/BlockStateEvent;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v3, 0x0

    .line 97
    .line 98
    invoke-static {v2, v0, v3, v4, v1}, Lio/invertase/notifee/L;->i(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/b$d;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public onForegroundServiceEvent(Lapp/notifee/core/event/ForegroundServiceEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lapp/notifee/core/event/ForegroundServiceEvent;->getNotification()Lapp/notifee/core/model/NotificationModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "notification"

    .line 18
    .line 19
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lio/invertase/notifee/K;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lio/invertase/notifee/K;-><init>(Lapp/notifee/core/event/ForegroundServiceEvent;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "app.notifee.foreground-service-headless-task"

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    invoke-static {p1, v1, v2, v3, v0}, Lio/invertase/notifee/L;->i(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/b$d;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onLogEvent(Lapp/notifee/core/event/LogEvent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onNotificationEvent(Lapp/notifee/core/event/NotificationEvent;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "type"

    .line 10
    .line 11
    invoke-virtual {p1}, Lapp/notifee/core/event/NotificationEvent;->getType()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lapp/notifee/core/event/NotificationEvent;->getNotification()Lapp/notifee/core/model/NotificationModel;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "notification"

    .line 31
    .line 32
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lapp/notifee/core/event/NotificationEvent;->getExtras()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const-string v2, "pressAction"

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-static {v3}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    const-string v2, "input"

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-interface {v1, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    const-string p1, "detail"

    .line 68
    .line 69
    invoke-interface {v0, p1, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lio/invertase/notifee/L;->b()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const-string v1, "app.notifee.notification-event"

    .line 77
    .line 78
    const-string v2, "headless"

    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v0}, Lio/invertase/notifee/L;->h(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    const/4 p1, 0x1

    .line 91
    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-wide/32 v2, 0xea60

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    invoke-static {v1, v0, v2, v3, p1}, Lio/invertase/notifee/L;->i(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/b$d;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
