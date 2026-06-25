.class public Lexpo/modules/notifications/notifications/categories/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJE\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00122\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0014\u00a2\u0006\u0004\u0008!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/categories/a;",
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
        "B",
        "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "",
        "identifier",
        "",
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;",
        "actionArguments",
        "",
        "",
        "categoryOptions",
        "LUb/u;",
        "promise",
        "G",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;LUb/u;)V",
        "C",
        "(Ljava/lang/String;LUb/u;)V",
        "",
        "LPc/c;",
        "categories",
        "F",
        "(Ljava/util/Collection;)Ljava/util/List;",
        "LGc/a;",
        "d",
        "LGc/a;",
        "getSerializer",
        "()LGc/a;",
        "serializer",
        "Landroid/content/Context;",
        "E",
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


# instance fields
.field private final d:LGc/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LGc/a;

    .line 5
    .line 6
    invoke-direct {v0}, LGc/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lexpo/modules/notifications/notifications/categories/a;->d:LGc/a;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic A(Lexpo/modules/notifications/notifications/categories/a;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/categories/a;->E()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final B(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, LBc/e;->b(Landroid/os/Handler;Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method private static final D(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    const-string p1, "succeeded"

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {p0, v0}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-string p1, "ERR_CATEGORY_DELETE_FAILED"

    .line 21
    .line 22
    const-string p2, "The category could not be deleted."

    .line 23
    .line 24
    invoke-interface {p0, p1, p2, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 28
    .line 29
    return-object p0
.end method

.method private final E()Landroid/content/Context;
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

.method private static final H(LUb/u;Lexpo/modules/notifications/notifications/categories/a;ILandroid/os/Bundle;)LTd/L;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    const-string v1, "notificationCategory"

    .line 5
    .line 6
    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    check-cast p3, LPc/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p3, v0

    .line 14
    :goto_0
    if-nez p2, :cond_1

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lexpo/modules/notifications/notifications/categories/a;->d:LGc/a;

    .line 19
    .line 20
    invoke-virtual {p1, p3}, LGc/a;->c(LPc/c;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p0, p1}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string p1, "ERR_CATEGORY_SET_FAILED"

    .line 29
    .line 30
    const-string p2, "The provided category could not be set."

    .line 31
    .line 32
    invoke-interface {p0, p1, p2, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 36
    .line 37
    return-object p0
.end method

.method public static synthetic x(LUb/u;ILandroid/os/Bundle;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/notifications/notifications/categories/a;->D(LUb/u;ILandroid/os/Bundle;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(LUb/u;Lexpo/modules/notifications/notifications/categories/a;ILandroid/os/Bundle;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/notifications/notifications/categories/a;->H(LUb/u;Lexpo/modules/notifications/notifications/categories/a;ILandroid/os/Bundle;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lexpo/modules/notifications/notifications/categories/a;Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/notifications/notifications/categories/a;->B(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public C(Ljava/lang/String;LUb/u;)V
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
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/categories/a;->E()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, LFc/a;

    .line 18
    .line 19
    invoke-direct {v2, p2}, LFc/a;-><init>(LUb/u;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2}, Lexpo/modules/notifications/notifications/categories/a;->B(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {v0, v1, p1, p2}, Lexpo/modules/notifications/service/NotificationsService$a;->d(Landroid/content/Context;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method protected F(Ljava/util/Collection;)Ljava/util/List;
    .locals 3

    .line 1
    const-string v0, "categories"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/a;->d:LGc/a;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-static {p1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, LPc/c;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, LGc/a;->c(LPc/c;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v1
.end method

.method public G(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;LUb/u;)V
    .locals 5

    .line 1
    const-string p3, "identifier"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "actionArguments"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "promise"

    .line 12
    .line 13
    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p3, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;

    .line 36
    .line 37
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getTextInput()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance v2, LPc/j;

    .line 44
    .line 45
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getIdentifier()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getButtonTitle()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getOptions()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;->getOpensAppToForeground()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;->getPlaceholder()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {v2, v3, v4, v0, v1}, LPc/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v1, LPc/b;

    .line 73
    .line 74
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getIdentifier()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getButtonTitle()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->getOptions()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;->getOpensAppToForeground()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-direct {v1, v2, v3, v0}, LPc/b;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_2

    .line 102
    .line 103
    sget-object p2, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 104
    .line 105
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/categories/a;->E()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, LPc/c;

    .line 110
    .line 111
    invoke-direct {v1, p1, p3}, LPc/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, LFc/b;

    .line 115
    .line 116
    invoke-direct {p1, p4, p0}, LFc/b;-><init>(LUb/u;Lexpo/modules/notifications/notifications/categories/a;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {p0, p1}, Lexpo/modules/notifications/notifications/categories/a;->B(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p2, v0, v1, p1}, Lexpo/modules/notifications/service/NotificationsService$a;->A(Landroid/content/Context;LPc/c;Landroid/os/ResultReceiver;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_2
    new-instance p1, Lrb/d;

    .line 128
    .line 129
    const-string p2, "Invalid arguments provided for notification category. Must provide at least one action."

    .line 130
    .line 131
    invoke-direct {p1, p2}, Lrb/d;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
.end method

.method public n()Lgc/e;
    .locals 15

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    const-class v1, Ljava/util/List;

    .line 4
    .line 5
    const-class v2, LUb/u;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, ".ModuleDefinition"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "["

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v5, "ExpoModulesCore"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "] "

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, LX3/a;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v3, Lgc/d;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "ExpoNotificationCategoriesModule"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lgc/a;->s(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "getNotificationCategoriesAsync"

    .line 69
    .line 70
    invoke-static {v2, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    const-class v6, Ljava/lang/String;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    if-eqz v5, :cond_0

    .line 78
    .line 79
    :try_start_1
    new-instance v2, Ldc/f;

    .line 80
    .line 81
    new-array v5, v7, [Lpc/b;

    .line 82
    .line 83
    new-instance v8, Lexpo/modules/notifications/notifications/categories/a$b;

    .line 84
    .line 85
    invoke-direct {v8, p0}, Lexpo/modules/notifications/notifications/categories/a$b;-><init>(Lexpo/modules/notifications/notifications/categories/a;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v2, v4, v5, v8}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_0
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    sget-object v8, Lpc/d;->a:Lpc/d;

    .line 101
    .line 102
    new-instance v9, Lkotlin/Pair;

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, Lpc/d;->a()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lpc/b;

    .line 122
    .line 123
    if-nez v8, :cond_1

    .line 124
    .line 125
    sget-object v8, Lexpo/modules/notifications/notifications/categories/a$c;->a:Lexpo/modules/notifications/notifications/categories/a$c;

    .line 126
    .line 127
    new-instance v9, Lpc/b;

    .line 128
    .line 129
    new-instance v10, Lpc/M;

    .line 130
    .line 131
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {v10, v2, v7, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v9, v10, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 139
    .line 140
    .line 141
    move-object v8, v9

    .line 142
    :cond_1
    filled-new-array {v8}, [Lpc/b;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    new-instance v5, Lexpo/modules/notifications/notifications/categories/a$d;

    .line 147
    .line 148
    invoke-direct {v5, p0}, Lexpo/modules/notifications/notifications/categories/a$d;-><init>(Lexpo/modules/notifications/notifications/categories/a;)V

    .line 149
    .line 150
    .line 151
    const-class v8, LTd/L;

    .line 152
    .line 153
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 154
    .line 155
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_2

    .line 160
    .line 161
    new-instance v8, Ldc/l;

    .line 162
    .line 163
    invoke-direct {v8, v4, v2, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 164
    .line 165
    .line 166
    :goto_0
    move-object v2, v8

    .line 167
    goto :goto_1

    .line 168
    :cond_2
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 169
    .line 170
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_3

    .line 175
    .line 176
    new-instance v8, Ldc/h;

    .line 177
    .line 178
    invoke-direct {v8, v4, v2, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_3
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 183
    .line 184
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    if-eqz v9, :cond_4

    .line 189
    .line 190
    new-instance v8, Ldc/i;

    .line 191
    .line 192
    invoke-direct {v8, v4, v2, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_4
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 197
    .line 198
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_5

    .line 203
    .line 204
    new-instance v8, Ldc/j;

    .line 205
    .line 206
    invoke-direct {v8, v4, v2, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_5
    invoke-static {v8, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_6

    .line 215
    .line 216
    new-instance v8, Ldc/n;

    .line 217
    .line 218
    invoke-direct {v8, v4, v2, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_6
    new-instance v8, Ldc/s;

    .line 223
    .line 224
    invoke-direct {v8, v4, v2, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :goto_1
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-interface {v5, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const-string v2, "setNotificationCategoryAsync"

    .line 236
    .line 237
    new-instance v4, Ldc/f;

    .line 238
    .line 239
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    sget-object v8, Lpc/d;->a:Lpc/d;

    .line 244
    .line 245
    new-instance v9, Lkotlin/Pair;

    .line 246
    .line 247
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, Lpc/d;->a()Ljava/util/Map;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, Lpc/b;

    .line 265
    .line 266
    if-nez v9, :cond_7

    .line 267
    .line 268
    sget-object v9, Lexpo/modules/notifications/notifications/categories/a$e;->a:Lexpo/modules/notifications/notifications/categories/a$e;

    .line 269
    .line 270
    new-instance v10, Lpc/b;

    .line 271
    .line 272
    new-instance v12, Lpc/M;

    .line 273
    .line 274
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    invoke-direct {v12, v13, v7, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v10, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 282
    .line 283
    .line 284
    move-object v9, v10

    .line 285
    :cond_7
    new-instance v10, Lkotlin/Pair;

    .line 286
    .line 287
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-direct {v10, v12, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v8}, Lpc/d;->a()Ljava/util/Map;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    check-cast v10, Lpc/b;

    .line 303
    .line 304
    if-nez v10, :cond_8

    .line 305
    .line 306
    sget-object v10, Lexpo/modules/notifications/notifications/categories/a$f;->a:Lexpo/modules/notifications/notifications/categories/a$f;

    .line 307
    .line 308
    new-instance v12, Lpc/b;

    .line 309
    .line 310
    new-instance v13, Lpc/M;

    .line 311
    .line 312
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-direct {v13, v1, v7, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v12, v13, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 320
    .line 321
    .line 322
    move-object v10, v12

    .line 323
    :cond_8
    new-instance v1, Lkotlin/Pair;

    .line 324
    .line 325
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-direct {v1, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8}, Lpc/d;->a()Ljava/util/Map;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, Lpc/b;

    .line 343
    .line 344
    if-nez v1, :cond_9

    .line 345
    .line 346
    sget-object v1, Lexpo/modules/notifications/notifications/categories/a$g;->a:Lexpo/modules/notifications/notifications/categories/a$g;

    .line 347
    .line 348
    new-instance v12, Lpc/b;

    .line 349
    .line 350
    new-instance v13, Lpc/M;

    .line 351
    .line 352
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const/4 v14, 0x1

    .line 357
    invoke-direct {v13, v0, v14, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v12, v13, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 361
    .line 362
    .line 363
    move-object v1, v12

    .line 364
    :cond_9
    filled-new-array {v9, v10, v1}, [Lpc/b;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    new-instance v1, Lexpo/modules/notifications/notifications/categories/a$h;

    .line 369
    .line 370
    invoke-direct {v1, p0}, Lexpo/modules/notifications/notifications/categories/a$h;-><init>(Lexpo/modules/notifications/notifications/categories/a;)V

    .line 371
    .line 372
    .line 373
    invoke-direct {v4, v2, v0, v1}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    const-string v0, "deleteNotificationCategoryAsync"

    .line 384
    .line 385
    new-instance v1, Ldc/f;

    .line 386
    .line 387
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    new-instance v4, Lkotlin/Pair;

    .line 392
    .line 393
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-direct {v4, v5, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v8}, Lpc/d;->a()Ljava/util/Map;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    check-cast v4, Lpc/b;

    .line 409
    .line 410
    if-nez v4, :cond_a

    .line 411
    .line 412
    sget-object v4, Lexpo/modules/notifications/notifications/categories/a$i;->a:Lexpo/modules/notifications/notifications/categories/a$i;

    .line 413
    .line 414
    new-instance v5, Lpc/b;

    .line 415
    .line 416
    new-instance v8, Lpc/M;

    .line 417
    .line 418
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-direct {v8, v6, v7, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 423
    .line 424
    .line 425
    invoke-direct {v5, v8, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 426
    .line 427
    .line 428
    move-object v4, v5

    .line 429
    :cond_a
    filled-new-array {v4}, [Lpc/b;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    new-instance v4, Lexpo/modules/notifications/notifications/categories/a$j;

    .line 434
    .line 435
    invoke-direct {v4, p0}, Lexpo/modules/notifications/notifications/categories/a$j;-><init>(Lexpo/modules/notifications/notifications/categories/a;)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v1, v0, v2, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, Lgc/a;->u()Lgc/e;

    .line 449
    .line 450
    .line 451
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 452
    invoke-static {}, LX3/a;->f()V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :goto_2
    invoke-static {}, LX3/a;->f()V

    .line 457
    .line 458
    .line 459
    throw v0
.end method
