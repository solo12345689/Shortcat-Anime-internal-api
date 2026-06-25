.class public LYc/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZc/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYc/e$a;
    }
.end annotation


# static fields
.field public static final c:LYc/e$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroidx/core/app/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LYc/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LYc/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LYc/e;->c:LYc/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/core/app/q;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYc/e;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, LYc/e;->b:Landroidx/core/app/q;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/core/app/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, LYc/e;-><init>(Landroid/content/Context;Landroidx/core/app/q;)V

    return-void
.end method

.method static synthetic f(LYc/e;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LSc/c;

    .line 2
    .line 3
    iget-object v1, p0, LYc/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v2, LYc/h;

    .line 6
    .line 7
    iget-object p0, p0, LYc/e;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v2, p0}, LYc/h;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, p1, v2}, LSc/c;-><init>(Landroid/content/Context;LPc/a;LYc/h;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, LSc/a;->l(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)LOc/b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3}, LSc/c;->o(LZd/e;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private final j(LPc/a;)Landroid/net/Uri;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, LPc/a;->a()LPc/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LPc/g;->c()LOc/d;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, LOc/d;->t()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, LYc/e;->b:Landroidx/core/app/q;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, Lr4/l;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_0
    return-object v0

    .line 36
    :cond_1
    invoke-virtual {p1}, LPc/a;->a()LPc/g;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, LPc/g;->a()LOc/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, LOc/a;->P()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, LDc/e;

    .line 49
    .line 50
    iget-object v1, p0, LYc/e;->a:Landroid/content/Context;

    .line 51
    .line 52
    invoke-direct {v0, v1}, LDc/e;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, LDc/e;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 5

    .line 1
    const-string v0, "identifiers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    sget-object v1, LYc/e;->c:LYc/e$a;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, LYc/e$a;->b(Ljava/lang/String;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, LYc/e;->a:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 43
    .line 44
    const-string v3, "second"

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v1, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v2, v1}, Landroidx/core/app/q;->c(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p0}, LYc/e;->b()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    const/4 v3, 0x0

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move-object v4, v2

    .line 81
    check-cast v4, LPc/a;

    .line 82
    .line 83
    invoke-virtual {v4}, LPc/a;->a()LPc/g;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, LPc/g;->b()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move-object v2, v3

    .line 99
    :goto_1
    check-cast v2, LPc/a;

    .line 100
    .line 101
    iget-object v1, p0, LYc/e;->a:Landroid/content/Context;

    .line 102
    .line 103
    invoke-static {v1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2}, LPc/a;->a()LPc/g;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_3
    invoke-virtual {p0, v3}, LYc/e;->k(LPc/g;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-virtual {v1, v0, v2}, Landroidx/core/app/q;->c(Ljava/lang/String;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 5

    .line 1
    iget-object v0, p0, LYc/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroid/app/NotificationManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "getActiveNotifications(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    array-length v2, v0

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_1

    .line 33
    .line 34
    aget-object v4, v0, v3

    .line 35
    .line 36
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v4}, LYc/e;->i(Landroid/service/notification/StatusBarNotification;)LPc/a;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v1
.end method

.method public c(LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V
    .locals 7

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    invoke-virtual {p2}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPresentAlert()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p2}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPlaySound()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-direct {p0, p1}, LYc/e;->j(LPc/a;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    sget-object p1, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 27
    .line 28
    :cond_0
    iget-object p2, p0, LYc/e;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {p2, p1}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/media/Ringtone;->play()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v4, LYc/e$b;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {v4, p0, p1, p2, v0}, LYc/e$b;-><init>(LYc/e;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LYc/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/q;->d()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected e(LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LYc/e;->f(LYc/e;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected g(Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    const-string v0, "bundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lorg/json/JSONObject;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v3

    .line 44
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v6, "Error encountered while serializing Android notification extras: "

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, " -> "

    .line 62
    .line 63
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v4, "expo-notifications"

    .line 74
    .line 75
    invoke-static {v4, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    return-object v0
.end method

.method protected final h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LYc/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method protected i(Landroid/service/notification/StatusBarNotification;)LPc/a;
    .locals 5

    .line 1
    const-string v0, "statusBarNotification"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 11
    .line 12
    const-string v2, "expo.notification_request"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    array-length v3, v1

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-virtual {v2, v1, v4, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 30
    .line 31
    .line 32
    sget-object v1, LPc/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 33
    .line 34
    invoke-interface {v1, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "createFromParcel(...)"

    .line 39
    .line 40
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast v1, LPc/g;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 46
    .line 47
    .line 48
    new-instance v2, Ljava/util/Date;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 55
    .line 56
    .line 57
    new-instance v3, LPc/a;

    .line 58
    .line 59
    invoke-direct {v3, v1, v2}, LPc/a;-><init>(LPc/g;Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :catch_0
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v4, "Could not have unmarshalled NotificationRequest from ("

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", "

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ")."

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "expo-notifications"

    .line 102
    .line 103
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    :cond_0
    new-instance v1, LPc/e$b;

    .line 107
    .line 108
    invoke-direct {v1}, LPc/e$b;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Landroidx/core/app/m;->c(Landroid/app/Notification;)Ljava/lang/CharSequence;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const/4 v3, 0x0

    .line 116
    if-eqz v2, :cond_1

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_0

    .line 123
    :cond_1
    move-object v2, v3

    .line 124
    :goto_0
    invoke-virtual {v1, v2}, LPc/e$b;->l(Ljava/lang/String;)LPc/e$b;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v0}, Landroidx/core/app/m;->b(Landroid/app/Notification;)Ljava/lang/CharSequence;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    move-object v2, v3

    .line 140
    :goto_1
    invoke-virtual {v1, v2}, LPc/e$b;->k(Ljava/lang/String;)LPc/e$b;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v0}, Landroidx/core/app/m;->f(Landroid/app/Notification;)Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    move-object v2, v3

    .line 156
    :goto_2
    invoke-virtual {v1, v2}, LPc/e$b;->j(Ljava/lang/String;)LPc/e$b;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v0}, Landroidx/core/app/m;->a(Landroid/app/Notification;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-virtual {v1, v2}, LPc/e$b;->b(Z)LPc/e$b;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v0}, Landroidx/core/app/m;->e(Landroid/app/Notification;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-virtual {v1, v2}, LPc/e$b;->i(Z)LPc/e$b;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget v2, v0, Landroid/app/Notification;->priority:I

    .line 177
    .line 178
    invoke-static {v2}, LMc/d;->c(I)LMc/d;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v1, v2}, LPc/e$b;->g(LMc/d;)LPc/e$b;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v2, v0, Landroid/app/Notification;->vibrate:[J

    .line 187
    .line 188
    invoke-virtual {v1, v2}, LPc/e$b;->m([J)LPc/e$b;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iget-object v2, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 193
    .line 194
    invoke-virtual {v1, v2}, LPc/e$b;->h(Landroid/net/Uri;)LPc/e$b;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iget-object v0, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 199
    .line 200
    const-string v2, "extras"

    .line 201
    .line 202
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, LYc/e;->g(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v1, v0}, LPc/e$b;->d(Lorg/json/JSONObject;)LPc/e$b;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, LPc/e$b;->a()LPc/e;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    new-instance v1, LPc/g;

    .line 218
    .line 219
    sget-object v2, LYc/e;->c:LYc/e$a;

    .line 220
    .line 221
    invoke-virtual {v2, p1}, LYc/e$a;->a(Landroid/service/notification/StatusBarNotification;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-direct {v1, v2, v0, v3}, LPc/g;-><init>(Ljava/lang/String;LOc/a;LOc/d;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, LPc/a;

    .line 229
    .line 230
    new-instance v2, Ljava/util/Date;

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v0, v1, v2}, LPc/a;-><init>(LPc/g;Ljava/util/Date;)V

    .line 240
    .line 241
    .line 242
    return-object v0
.end method

.method protected k(LPc/g;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
