.class public Lapp/notifee/core/model/NotificationAndroidActionModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private mNotificationAndroidActionBundle:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 5
    .line 6
    return-void
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidActionModel;
    .locals 1

    .line 1
    new-instance v0, Lapp/notifee/core/model/NotificationAndroidActionModel;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationAndroidActionModel;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getIcon()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "icon"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPressAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "pressAction"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getRemoteInput(Landroidx/core/app/m$a$a;)Landroidx/core/app/w;
    .locals 4

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "input"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    new-instance v1, Landroidx/core/app/w$e;

    .line 21
    .line 22
    const-string v2, "app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Landroidx/core/app/w$e;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "allowFreeFormInput"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Landroidx/core/app/w$e;->b(Z)Landroidx/core/app/w$e;

    .line 40
    .line 41
    .line 42
    :cond_0
    const-string v2, "allowGeneratedReplies"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {p1, v2}, Landroidx/core/app/m$a$a;->d(Z)Landroidx/core/app/m$a$a;

    .line 55
    .line 56
    .line 57
    :cond_1
    const-string p1, "placeholder"

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v1, p1}, Landroidx/core/app/w$e;->e(Ljava/lang/CharSequence;)Landroidx/core/app/w$e;

    .line 70
    .line 71
    .line 72
    :cond_2
    const-string p1, "choices"

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    new-array v2, v2, [Ljava/lang/CharSequence;

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, [Ljava/lang/CharSequence;

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Landroidx/core/app/w$e;->c([Ljava/lang/CharSequence;)Landroidx/core/app/w$e;

    .line 100
    .line 101
    .line 102
    :cond_3
    const-string p1, "editableChoices"

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    const/4 p1, 0x2

    .line 117
    invoke-virtual {v1, p1}, Landroidx/core/app/w$e;->d(I)Landroidx/core/app/w$e;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    const/4 p1, 0x1

    .line 122
    invoke-virtual {v1, p1}, Landroidx/core/app/w$e;->d(I)Landroidx/core/app/w$e;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    const/4 p1, 0x0

    .line 127
    invoke-virtual {v1, p1}, Landroidx/core/app/w$e;->d(I)Landroidx/core/app/w$e;

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {v1}, Landroidx/core/app/w$e;->a()Landroidx/core/app/w;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_6
    const/4 p1, 0x0

    .line 136
    return-object p1
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "title"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Bundle;

    .line 8
    .line 9
    return-object v0
.end method
