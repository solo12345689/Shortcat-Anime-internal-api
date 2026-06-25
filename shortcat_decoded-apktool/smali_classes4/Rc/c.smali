.class public LRc/c;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u0008H\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001b2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "LRc/c;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lkotlin/Function2;",
        "",
        "Landroid/os/Bundle;",
        "LTd/L;",
        "Lexpo/modules/notifications/ResultReceiverBody;",
        "body",
        "Landroid/os/ResultReceiver;",
        "A",
        "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "",
        "identifier",
        "LUb/u;",
        "promise",
        "D",
        "(Ljava/lang/String;LUb/u;)V",
        "B",
        "(LUb/u;)V",
        "",
        "LPc/a;",
        "notifications",
        "",
        "G",
        "(Ljava/util/Collection;)Ljava/util/List;",
        "Landroid/content/Context;",
        "F",
        "()Landroid/content/Context;",
        "context",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final C(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-interface {p0, v0}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-eqz p2, :cond_1

    .line 9
    .line 10
    const-string p1, "exception"

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_0
    instance-of p2, p1, Ljava/lang/Exception;

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, Ljava/lang/Exception;

    .line 24
    .line 25
    :cond_2
    const-string p1, "ERR_NOTIFICATIONS_DISMISSAL_FAILED"

    .line 26
    .line 27
    const-string p2, "Notifications could not be dismissed."

    .line 28
    .line 29
    invoke-interface {p0, p1, p2, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p0
.end method

.method private static final E(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-interface {p0, v0}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-eqz p2, :cond_1

    .line 9
    .line 10
    const-string p1, "exception"

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_0
    instance-of p2, p1, Ljava/lang/Exception;

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, Ljava/lang/Exception;

    .line 24
    .line 25
    :cond_2
    const-string p1, "ERR_NOTIFICATION_DISMISSAL_FAILED"

    .line 26
    .line 27
    const-string p2, "Notification could not be dismissed."

    .line 28
    .line 29
    invoke-interface {p0, p1, p2, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p0
.end method

.method private final F()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public static synthetic x(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LRc/c;->E(LUb/u;ILandroid/os/Bundle;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LRc/c;->C(LUb/u;ILandroid/os/Bundle;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(LRc/c;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, LRc/c;->F()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method protected final A(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;
    .locals 1

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0, p1}, LBc/e;->b(Landroid/os/Handler;Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method protected B(LUb/u;)V
    .locals 3

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 7
    .line 8
    invoke-direct {p0}, LRc/c;->F()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, LRc/b;

    .line 13
    .line 14
    invoke-direct {v2, p1}, LRc/b;-><init>(LUb/u;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2}, LRc/c;->A(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, v1, p1}, Lexpo/modules/notifications/service/NotificationsService$a;->f(Landroid/content/Context;Landroid/os/ResultReceiver;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method protected D(Ljava/lang/String;LUb/u;)V
    .locals 3

    .line 1
    const-string v0, "identifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 12
    .line 13
    invoke-direct {p0}, LRc/c;->F()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    filled-new-array {p1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v2, LRc/a;

    .line 22
    .line 23
    invoke-direct {v2, p2}, LRc/a;-><init>(LUb/u;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v2}, LRc/c;->A(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {v0, v1, p1, p2}, Lexpo/modules/notifications/service/NotificationsService$a;->e(Landroid/content/Context;[Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method protected G(Ljava/util/Collection;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "notifications"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LPc/a;

    .line 34
    .line 35
    invoke-static {v1}, LDc/c;->b(LPc/a;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v0
.end method

.method public n()Lgc/e;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, LUb/u;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoNotificationPresenter"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "getPresentedNotificationsAsync"

    .line 67
    .line 68
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    const-class v9, LTd/L;

    .line 81
    .line 82
    const-class v10, Ljava/lang/String;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    :try_start_1
    new-instance v4, Ldc/f;

    .line 88
    .line 89
    new-array v12, v11, [Lpc/b;

    .line 90
    .line 91
    new-instance v13, LRc/c$b;

    .line 92
    .line 93
    invoke-direct {v13, v1}, LRc/c$b;-><init>(LRc/c;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v4, v3, v12, v13}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :catchall_0
    move-exception v0

    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_0
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    sget-object v12, Lpc/d;->a:Lpc/d;

    .line 109
    .line 110
    new-instance v13, Lkotlin/Pair;

    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-direct {v13, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Lpc/d;->a()Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    check-cast v12, Lpc/b;

    .line 130
    .line 131
    if-nez v12, :cond_1

    .line 132
    .line 133
    sget-object v12, LRc/c$c;->a:LRc/c$c;

    .line 134
    .line 135
    new-instance v13, Lpc/b;

    .line 136
    .line 137
    new-instance v14, Lpc/M;

    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    invoke-direct {v14, v15, v11, v12}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v13, v14, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 147
    .line 148
    .line 149
    move-object v12, v13

    .line 150
    :cond_1
    filled-new-array {v12}, [Lpc/b;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    new-instance v12, LRc/c$d;

    .line 155
    .line 156
    invoke-direct {v12, v1}, LRc/c$d;-><init>(LRc/c;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-eqz v13, :cond_2

    .line 164
    .line 165
    new-instance v13, Ldc/l;

    .line 166
    .line 167
    invoke-direct {v13, v3, v4, v12}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 168
    .line 169
    .line 170
    :goto_0
    move-object v4, v13

    .line 171
    goto :goto_1

    .line 172
    :cond_2
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-eqz v13, :cond_3

    .line 177
    .line 178
    new-instance v13, Ldc/h;

    .line 179
    .line 180
    invoke-direct {v13, v3, v4, v12}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_3
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    if-eqz v13, :cond_4

    .line 189
    .line 190
    new-instance v13, Ldc/i;

    .line 191
    .line 192
    invoke-direct {v13, v3, v4, v12}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_4
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-eqz v13, :cond_5

    .line 201
    .line 202
    new-instance v13, Ldc/j;

    .line 203
    .line 204
    invoke-direct {v13, v3, v4, v12}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_5
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-eqz v13, :cond_6

    .line 213
    .line 214
    new-instance v13, Ldc/n;

    .line 215
    .line 216
    invoke-direct {v13, v3, v4, v12}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_6
    new-instance v13, Ldc/s;

    .line 221
    .line 222
    invoke-direct {v13, v3, v4, v12}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-interface {v12, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const-string v3, "dismissNotificationAsync"

    .line 234
    .line 235
    new-instance v4, Ldc/f;

    .line 236
    .line 237
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    sget-object v13, Lpc/d;->a:Lpc/d;

    .line 242
    .line 243
    new-instance v14, Lkotlin/Pair;

    .line 244
    .line 245
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-direct {v14, v15, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v13}, Lpc/d;->a()Ljava/util/Map;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    check-cast v14, Lpc/b;

    .line 263
    .line 264
    if-nez v14, :cond_7

    .line 265
    .line 266
    sget-object v14, LRc/c$h;->a:LRc/c$h;

    .line 267
    .line 268
    new-instance v15, Lpc/b;

    .line 269
    .line 270
    move-object/from16 v16, v2

    .line 271
    .line 272
    new-instance v2, Lpc/M;

    .line 273
    .line 274
    move-object/from16 v17, v13

    .line 275
    .line 276
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    move-object/from16 v18, v10

    .line 281
    .line 282
    const/4 v10, 0x0

    .line 283
    invoke-direct {v2, v13, v10, v14}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 284
    .line 285
    .line 286
    invoke-direct {v15, v2, v12}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 287
    .line 288
    .line 289
    move-object v14, v15

    .line 290
    goto :goto_2

    .line 291
    :cond_7
    move-object/from16 v16, v2

    .line 292
    .line 293
    move-object/from16 v18, v10

    .line 294
    .line 295
    move-object/from16 v17, v13

    .line 296
    .line 297
    :goto_2
    filled-new-array {v14}, [Lpc/b;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    new-instance v10, LRc/c$i;

    .line 302
    .line 303
    invoke-direct {v10, v1}, LRc/c$i;-><init>(LRc/c;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {v4, v3, v2, v10}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v16 .. v16}, Lhc/f;->k()Ljava/util/Map;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    const-string v2, "dismissAllNotificationsAsync"

    .line 317
    .line 318
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_8

    .line 323
    .line 324
    new-instance v0, Ldc/f;

    .line 325
    .line 326
    const/4 v10, 0x0

    .line 327
    new-array v3, v10, [Lpc/b;

    .line 328
    .line 329
    new-instance v4, LRc/c$e;

    .line 330
    .line 331
    invoke-direct {v4, v1}, LRc/c$e;-><init>(LRc/c;)V

    .line 332
    .line 333
    .line 334
    invoke-direct {v0, v2, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_4

    .line 338
    .line 339
    :cond_8
    invoke-virtual/range {v16 .. v16}, Lhc/f;->m()Lpc/X;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    new-instance v4, Lkotlin/Pair;

    .line 344
    .line 345
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    invoke-direct {v4, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v17 .. v17}, Lpc/d;->a()Ljava/util/Map;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Lpc/b;

    .line 361
    .line 362
    if-nez v4, :cond_9

    .line 363
    .line 364
    sget-object v4, LRc/c$f;->a:LRc/c$f;

    .line 365
    .line 366
    new-instance v10, Lpc/b;

    .line 367
    .line 368
    new-instance v11, Lpc/M;

    .line 369
    .line 370
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    const/4 v12, 0x0

    .line 375
    invoke-direct {v11, v0, v12, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 376
    .line 377
    .line 378
    invoke-direct {v10, v11, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 379
    .line 380
    .line 381
    move-object v4, v10

    .line 382
    :cond_9
    filled-new-array {v4}, [Lpc/b;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    new-instance v3, LRc/c$g;

    .line 387
    .line 388
    invoke-direct {v3, v1}, LRc/c$g;-><init>(LRc/c;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    if-eqz v4, :cond_a

    .line 396
    .line 397
    new-instance v4, Ldc/l;

    .line 398
    .line 399
    invoke-direct {v4, v2, v0, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 400
    .line 401
    .line 402
    :goto_3
    move-object v0, v4

    .line 403
    goto :goto_4

    .line 404
    :cond_a
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    if-eqz v4, :cond_b

    .line 409
    .line 410
    new-instance v4, Ldc/h;

    .line 411
    .line 412
    invoke-direct {v4, v2, v0, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 413
    .line 414
    .line 415
    goto :goto_3

    .line 416
    :cond_b
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-eqz v4, :cond_c

    .line 421
    .line 422
    new-instance v4, Ldc/i;

    .line 423
    .line 424
    invoke-direct {v4, v2, v0, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 425
    .line 426
    .line 427
    goto :goto_3

    .line 428
    :cond_c
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-eqz v4, :cond_d

    .line 433
    .line 434
    new-instance v4, Ldc/j;

    .line 435
    .line 436
    invoke-direct {v4, v2, v0, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 437
    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_d
    move-object/from16 v4, v18

    .line 441
    .line 442
    invoke-static {v9, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-eqz v4, :cond_e

    .line 447
    .line 448
    new-instance v4, Ldc/n;

    .line 449
    .line 450
    invoke-direct {v4, v2, v0, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 451
    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_e
    new-instance v4, Ldc/s;

    .line 455
    .line 456
    invoke-direct {v4, v2, v0, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 457
    .line 458
    .line 459
    goto :goto_3

    .line 460
    :goto_4
    invoke-virtual/range {v16 .. v16}, Lhc/f;->k()Ljava/util/Map;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v16 .. v16}, Lgc/a;->u()Lgc/e;

    .line 468
    .line 469
    .line 470
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 471
    invoke-static {}, LX3/a;->f()V

    .line 472
    .line 473
    .line 474
    return-object v0

    .line 475
    :goto_5
    invoke-static {}, LX3/a;->f()V

    .line 476
    .line 477
    .line 478
    throw v0
.end method
