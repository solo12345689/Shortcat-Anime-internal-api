.class public Lio/invertase/notifee/NotifeeInitProvider;
.super Lapp/notifee/core/InitProvider;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lapp/notifee/core/InitProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onCreate()Z
    .locals 2

    .line 1
    invoke-super {p0}, Lapp/notifee/core/InitProvider;->onCreate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lio/invertase/notifee/NotifeeEventSubscriber;

    .line 6
    .line 7
    invoke-direct {v1}, Lio/invertase/notifee/NotifeeEventSubscriber;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lapp/notifee/core/Notifee;->initialize(Lapp/notifee/core/interfaces/EventListener;)V

    .line 11
    .line 12
    .line 13
    return v0
.end method
