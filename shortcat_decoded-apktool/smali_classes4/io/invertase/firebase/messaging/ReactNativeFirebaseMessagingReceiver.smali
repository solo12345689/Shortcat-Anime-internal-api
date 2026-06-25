.class public Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    const-string v0, "broadcast received for message"

    .line 2
    .line 3
    const-string v1, "RNFirebaseMsgReceiver"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lio/invertase/firebase/app/a;->a()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lio/invertase/firebase/app/a;->b(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string p1, "broadcast intent received with no extras"

    .line 28
    .line 29
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v0, Lcom/google/firebase/messaging/W;

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {v0, p2}, Lcom/google/firebase/messaging/W;-><init>(Landroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, LPd/g;->i()LPd/g;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    sget-object v2, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->f()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lio/invertase/firebase/messaging/w;->a()Lio/invertase/firebase/messaging/w;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lio/invertase/firebase/messaging/w;->b()Lio/invertase/firebase/messaging/v;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v2, v0}, Lio/invertase/firebase/messaging/v;->c(Lcom/google/firebase/messaging/W;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {p1}, LPd/m;->c(Landroid/content/Context;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v0, p1}, Lio/invertase/firebase/messaging/u;->h(Lcom/google/firebase/messaging/W;Ljava/lang/Boolean;)LPd/b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p2, p1}, LPd/g;->o(LQd/a;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    .line 89
    .line 90
    const-class v2, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingHeadlessService;

    .line 91
    .line 92
    invoke-direct {p2, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    const-string v2, "message"

    .line 96
    .line 97
    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    invoke-static {p1}, Lcom/facebook/react/g;->g(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catch_0
    move-exception p1

    .line 111
    goto :goto_0

    .line 112
    :cond_4
    return-void

    .line 113
    :goto_0
    const-string p2, "Background messages only work if the message priority is set to \'high\'"

    .line 114
    .line 115
    invoke-static {v1, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    return-void
.end method
