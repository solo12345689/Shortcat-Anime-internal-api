.class public Lr4/g0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field public static final b:Lcom/google/common/util/concurrent/r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lr4/g0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/common/util/concurrent/s;->b(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lr4/g0;->b:Lcom/google/common/util/concurrent/r;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    const-class v2, Lapp/notifee/core/NotificationAlarmReceiver;

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "notificationId"

    .line 11
    .line 12
    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/high16 v2, 0xa000000

    .line 20
    .line 21
    invoke-static {v0, p0, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string v0, "NotifeeAlarmManager"

    .line 28
    .line 29
    const-string v1, "Unable to create AlarmManager intent"

    .line 30
    .line 31
    invoke-static {v0, v1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static b()Lcom/google/common/util/concurrent/p;
    .locals 3

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ls4/i;->j(Landroid/content/Context;)Ls4/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcg/h;

    .line 8
    .line 9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ls4/i;->i(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {v1, v0}, Lcg/h;-><init>(Lcom/google/common/util/concurrent/p;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lr4/f0;

    .line 19
    .line 20
    invoke-direct {v0}, Lr4/f0;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lr4/g0;->b:Lcom/google/common/util/concurrent/r;

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lcg/h;->b(Lcom/google/common/util/concurrent/d;Ljava/util/concurrent/Executor;)Lcg/h;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public static c(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;Lcg/v;Ljava/lang/Void;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    const-string p4, "repeatFrequency"

    .line 2
    .line 3
    invoke-virtual {p0, p4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-static {p4}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    const/4 v0, -0x1

    .line 18
    if-eq p4, v0, :cond_0

    .line 19
    .line 20
    new-instance p4, Lt4/d;

    .line 21
    .line 22
    invoke-direct {p4, p0}, Lt4/d;-><init>(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4}, Lt4/d;->a()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p4}, Lr4/g0;->g(Lapp/notifee/core/model/NotificationModel;Lt4/d;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lcg/f;->a:Landroid/content/Context;

    .line 32
    .line 33
    invoke-static {p1}, Ls4/i;->j(Landroid/content/Context;)Ls4/i;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p4, Lcg/v;

    .line 38
    .line 39
    iget-object p3, p3, Lcg/v;->b:[B

    .line 40
    .line 41
    invoke-static {p0}, Lcg/q;->c(Landroid/os/Bundle;)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-direct {p4, p2, p3, p0, v0}, Lcg/v;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p4}, Ls4/i;->y(Lcg/v;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p0, Lcg/f;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {p0}, Ls4/i;->j(Landroid/content/Context;)Ls4/i;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, p2}, Ls4/i;->m(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static d(Ljava/lang/String;Lcg/v;)Lcom/google/common/util/concurrent/p;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcg/v;->b:[B

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p1, Lcg/v;->c:[B

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0}, Lcg/q;->b([B)Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p1, Lcg/v;->b:[B

    .line 17
    .line 18
    invoke-static {v1}, Lcg/q;->b([B)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lapp/notifee/core/model/NotificationModel;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lcg/h;

    .line 28
    .line 29
    invoke-static {v2, v0}, Lr4/E0;->y(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v1, v3}, Lcg/h;-><init>(Lcom/google/common/util/concurrent/p;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lr4/e0;

    .line 37
    .line 38
    invoke-direct {v3, v0, v2, p0, p1}, Lr4/e0;-><init>(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;Lcg/v;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lr4/g0;->a:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    invoke-virtual {v1, v3, p0}, Lcg/h;->b(Lcom/google/common/util/concurrent/d;Ljava/util/concurrent/Executor;)Lcg/h;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    :goto_0
    const-string p0, "NotifeeAlarmManager"

    .line 49
    .line 50
    const-string p1, "Attempted to handle doScheduledWork but no notification data was found."

    .line 51
    .line 52
    invoke-static {p0, p1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static e(Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcg/v;

    .line 18
    .line 19
    iget-object v0, v0, Lcg/v;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lr4/g0;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Lcg/a;->a()Landroid/app/AlarmManager;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static f(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "notificationId"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance v0, Ls4/i;

    .line 14
    .line 15
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lcg/h;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ls4/i;->p(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {v1, v0}, Lcg/h;-><init>(Lcom/google/common/util/concurrent/p;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lr4/c0;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lr4/c0;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lr4/g0;->a:Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    invoke-virtual {v1, v0, p0}, Lcg/h;->b(Lcom/google/common/util/concurrent/d;Ljava/util/concurrent/Executor;)Lcg/h;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lr4/d0;

    .line 41
    .line 42
    invoke-direct {v1}, Lr4/d0;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, p0}, Lcg/h;->a(Lcg/b;Ljava/util/concurrent/Executor;)Lcg/h;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static g(Lapp/notifee/core/model/NotificationModel;Lt4/d;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr4/g0;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lcg/a;->a()Landroid/app/AlarmManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p1, Lt4/d;->e:Lt4/d$a;

    .line 14
    .line 15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v4, 0x1f

    .line 18
    .line 19
    if-lt v3, v4, :cond_0

    .line 20
    .line 21
    sget-object v3, Lt4/d$a;->c:Lt4/d$a;

    .line 22
    .line 23
    sget-object v4, Lt4/d$a;->d:Lt4/d$a;

    .line 24
    .line 25
    sget-object v5, Lt4/d$a;->e:Lt4/d$a;

    .line 26
    .line 27
    filled-new-array {v3, v4, v5}, [Lt4/d$a;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-static {v1}, Lr4/f;->a(Landroid/app/AlarmManager;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 48
    .line 49
    const-string p1, "Missing SCHEDULE_EXACT_ALARM permission. Trigger not scheduled. See: https://notifee.app/react-native/docs/triggers#android-12-limitations"

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-virtual {p1}, Lt4/d;->a()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    if-eq v2, v3, :cond_4

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    if-eq v2, v3, :cond_3

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    if-eq v2, v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x4

    .line 75
    if-eq v2, v3, :cond_1

    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    sget-object v2, Lcg/f;->a:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    const/high16 v4, 0xc000000

    .line 101
    .line 102
    invoke-static {v2, p0, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object p1, p1, Lt4/d;->g:Ljava/lang/Long;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    invoke-static {v1, v2, v3, p0, v0}, Landroidx/core/app/e;->a(Landroid/app/AlarmManager;JLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    iget-object p0, p1, Lt4/d;->g:Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide p0

    .line 122
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->d(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    iget-object p0, p1, Lt4/d;->g:Ljava/lang/Long;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide p0

    .line 132
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->c(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    iget-object p0, p1, Lt4/d;->g:Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide p0

    .line 142
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->b(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_5
    iget-object p0, p1, Lt4/d;->g:Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide p0

    .line 152
    invoke-virtual {v1, v3, p0, p1, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public static synthetic h(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string p1, "NotifeeAlarmManager"

    .line 4
    .line 5
    const-string v0, "Failed to display notification"

    .line 6
    .line 7
    invoke-static {p1, v0, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public i()V
    .locals 3

    .line 1
    const-string v0, "NotifeeAlarmManager"

    .line 2
    .line 3
    const-string v1, "Reschedule Notifications on reboot"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ls4/i;

    .line 9
    .line 10
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ls4/i;->i(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lr4/g0$a;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lr4/g0$a;-><init>(Lr4/g0;)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lr4/g0;->b:Lcom/google/common/util/concurrent/r;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
