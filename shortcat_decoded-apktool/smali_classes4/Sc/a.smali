.class public abstract LSc/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSc/a$a;
    }
.end annotation


# static fields
.field public static final d:LSc/a$a;

.field private static final e:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LPc/a;

.field private c:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSc/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LSc/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LSc/a;->d:LSc/a$a;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    sput v0, LSc/a;->e:I

    .line 11
    .line 12
    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;LPc/a;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notification"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LSc/a;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, LSc/a;->b:LPc/a;

    .line 17
    .line 18
    return-void
.end method

.method private final e()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LSc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    sget v1, LBc/c;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private final f()Landroid/app/NotificationChannel;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-direct {p0}, LSc/a;->j()Landroid/app/NotificationManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "expo_notifications_fallback_notification_channel"

    .line 14
    .line 15
    invoke-static {v0, v1}, LO8/d;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LSc/a;->b()Landroid/app/NotificationChannel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    return-object v0
.end method

.method private final j()Landroid/app/NotificationManager;
    .locals 2

    .line 1
    iget-object v0, p0, LSc/a;->a:Landroid/content/Context;

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
    return-object v0
.end method


# virtual methods
.method public final a()Landroidx/core/app/m$e;
    .locals 3

    .line 1
    invoke-virtual {p0}, LSc/a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroidx/core/app/m$e;

    .line 8
    .line 9
    iget-object v2, p0, LSc/a;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, Landroidx/core/app/m$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    new-instance v0, Landroidx/core/app/m$e;

    .line 16
    .line 17
    iget-object v1, p0, LSc/a;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroidx/core/app/m$e;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method protected final b()Landroid/app/NotificationChannel;
    .locals 3

    .line 1
    invoke-static {}, Lr4/t;->a()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LSc/a;->e()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, LSc/a;->e:I

    .line 9
    .line 10
    const-string v2, "expo_notifications_fallback_notification_channel"

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lr4/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Lr4/k;->a(Landroid/app/NotificationChannel;Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lr4/u;->a(Landroid/app/NotificationChannel;Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, LSc/a;->j()Landroid/app/NotificationManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1, v0}, LO8/e;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method protected final c()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget-object v0, p0, LSc/a;->b:LPc/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LPc/a;->a()LPc/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LPc/g;->c()LOc/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_1
    const-string v0, "format(...)"

    .line 22
    .line 23
    const-string v1, "expo_notifications_fallback_notification_channel"

    .line 24
    .line 25
    const-string v3, "notifications"

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    sget-object v2, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "Couldn\'t get channel for the notifications - trigger is \'null\'. Fallback to \'%s\' channel"

    .line 41
    .line 42
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, LSc/a;->f()Landroid/app/NotificationChannel;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lr4/x;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_2
    invoke-interface {v2}, LOc/d;->t()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    invoke-direct {p0}, LSc/a;->f()Landroid/app/NotificationChannel;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lr4/x;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :cond_3
    invoke-virtual {p0}, LSc/a;->k()LIc/f;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4, v2}, LIc/f;->b(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-nez v4, :cond_4

    .line 91
    .line 92
    sget-object v4, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 93
    .line 94
    const/4 v4, 0x2

    .line 95
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "Channel \'%s\' doesn\'t exists. Fallback to \'%s\' channel"

    .line 104
    .line 105
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    invoke-direct {p0}, LSc/a;->f()Landroid/app/NotificationChannel;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lr4/x;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :cond_4
    invoke-static {v4}, Lr4/x;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
.end method

.method protected final d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LSc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final g()LPc/a;
    .locals 1

    .line 1
    iget-object v0, p0, LSc/a;->b:LPc/a;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final h()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;
    .locals 1

    .line 1
    iget-object v0, p0, LSc/a;->c:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final i()LOc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LSc/a;->b:LPc/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LPc/a;->a()LPc/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LPc/g;->a()LOc/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getContent(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public k()LIc/f;
    .locals 3

    .line 1
    new-instance v0, LIc/d;

    .line 2
    .line 3
    iget-object v1, p0, LSc/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v2, LIc/b;

    .line 6
    .line 7
    invoke-direct {v2, v1}, LIc/b;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, LIc/d;-><init>(Landroid/content/Context;LIc/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public l(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)LOc/b;
    .locals 0

    .line 1
    iput-object p1, p0, LSc/a;->c:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    return-object p0
.end method
