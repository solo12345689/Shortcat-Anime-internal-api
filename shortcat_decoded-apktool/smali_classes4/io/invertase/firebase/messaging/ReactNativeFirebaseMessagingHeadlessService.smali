.class public Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingHeadlessService;
.super Lcom/facebook/react/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/g;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected l(Landroid/content/Intent;)Lj7/a;
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const-string v0, "message"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/google/firebase/messaging/W;

    .line 16
    .line 17
    new-instance v0, Lj7/a;

    .line 18
    .line 19
    invoke-static {p1}, Lio/invertase/firebase/messaging/u;->i(Lcom/google/firebase/messaging/W;)Lcom/facebook/react/bridge/WritableMap;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {}, LPd/i;->g()LPd/i;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v1, "messaging_android_headless_task_timeout"

    .line 28
    .line 29
    const-wide/32 v3, 0xea60

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, v3, v4}, LPd/i;->e(Ljava/lang/String;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const/4 v5, 0x1

    .line 37
    const-string v1, "ReactNativeFirebaseMessagingHeadlessTask"

    .line 38
    .line 39
    invoke-direct/range {v0 .. v5}, Lj7/a;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method
