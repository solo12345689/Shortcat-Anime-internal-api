.class public Lapp/notifee/core/ForegroundService;
.super Landroid/app/Service;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:I = -0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lapp/notifee/core/ForegroundService;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lapp/notifee/core/ForegroundService;->b(Ljava/lang/Exception;Ljava/lang/Void;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic b(Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Service;->stopForeground(Z)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    sput-object p1, Lapp/notifee/core/ForegroundService;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    sput p1, Lapp/notifee/core/ForegroundService;->b:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    const-string v0, "app.notifee.core.ForegroundService.STOP"

    .line 9
    .line 10
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_7

    .line 23
    .line 24
    const-string p3, "hashCode"

    .line 25
    .line 26
    invoke-virtual {p1, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    const-string v0, "notification"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Notification;

    .line 37
    .line 38
    const-string v1, "notificationBundle"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v1, 0x1

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    move v2, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, p2

    .line 50
    :goto_0
    if-eqz p1, :cond_2

    .line 51
    .line 52
    move p2, v1

    .line 53
    :cond_2
    and-int/2addr p2, v2

    .line 54
    if-eqz p2, :cond_7

    .line 55
    .line 56
    new-instance p2, Lapp/notifee/core/model/NotificationModel;

    .line 57
    .line 58
    invoke-direct {p2, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Lapp/notifee/core/ForegroundService;->a:Ljava/lang/String;

    .line 62
    .line 63
    const/16 v1, 0x1d

    .line 64
    .line 65
    if-nez p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sput-object p1, Lapp/notifee/core/ForegroundService;->a:Ljava/lang/String;

    .line 72
    .line 73
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    if-lt p1, v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidModel;->getForegroundServiceType()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p0, p3, v0, p1}, Lr4/d;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    .line 86
    .line 87
    .line 88
    sput p1, Lapp/notifee/core/ForegroundService;->b:I

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {p0, p3, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    new-instance p1, Lr4/e;

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lr4/e;-><init>(Lapp/notifee/core/ForegroundService;)V

    .line 97
    .line 98
    .line 99
    new-instance p3, Lapp/notifee/core/event/ForegroundServiceEvent;

    .line 100
    .line 101
    invoke-direct {p3, p2, p1}, Lapp/notifee/core/event/ForegroundServiceEvent;-><init>(Lapp/notifee/core/model/NotificationModel;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p3}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    if-lt p1, v1, :cond_5

    .line 121
    .line 122
    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidModel;->getForegroundServiceType()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    sget p2, Lapp/notifee/core/ForegroundService;->b:I

    .line 131
    .line 132
    if-eq p1, p2, :cond_5

    .line 133
    .line 134
    invoke-static {p0, p3, v0, p1}, Lr4/d;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    .line 135
    .line 136
    .line 137
    sput p1, Lapp/notifee/core/ForegroundService;->b:I

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    sget-object p1, Lcg/f;->a:Landroid/content/Context;

    .line 141
    .line 142
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, p3, v0}, Landroidx/core/app/q;->p(ILandroid/app/Notification;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    .line 151
    .line 152
    const/16 p3, 0x8

    .line 153
    .line 154
    invoke-direct {p1, p3, p2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    :goto_2
    const/4 p1, 0x2

    .line 161
    return p1

    .line 162
    :cond_8
    :goto_3
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    sput-object p1, Lapp/notifee/core/ForegroundService;->a:Ljava/lang/String;

    .line 167
    .line 168
    const/4 p1, -0x1

    .line 169
    sput p1, Lapp/notifee/core/ForegroundService;->b:I

    .line 170
    .line 171
    return p2
.end method
