.class public Lapp/notifee/core/model/NotificationAndroidPressActionModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private mNotificationAndroidPressActionBundle:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 5
    .line 6
    return-void
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;
    .locals 1

    .line 1
    new-instance v0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "id"

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

.method public getLaunchActivity()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "launchActivity"

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

.method public getLaunchActivityFlags()I
    .locals 5

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "launchActivityFlags"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v1, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    packed-switch v3, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v4, 0x1c

    .line 47
    .line 48
    if-lt v3, v4, :cond_1

    .line 49
    .line 50
    const/16 v3, 0x800

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_1
    const/16 v3, 0x1000

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_2
    const/16 v3, 0x2000

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_3
    const/16 v3, 0x4000

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_4
    const v3, 0x8000

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_5
    const/high16 v3, 0x10000

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_6
    const/high16 v3, 0x20000

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_7
    const/high16 v3, 0x40000

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_8
    const/high16 v3, 0x80000

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_9
    const/high16 v3, 0x100000

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_a
    const/high16 v3, 0x200000

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_b
    const/high16 v3, 0x400000

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_c
    const/high16 v3, 0x800000

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_d
    const/high16 v3, 0x1000000

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_e
    const/high16 v3, 0x2000000

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_f
    const/high16 v3, 0x4000000

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_10
    const/high16 v3, 0x8000000

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_11
    const/high16 v3, 0x10000000

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_12
    const/high16 v3, 0x20000000

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_13
    const/high16 v3, 0x40000000    # 2.0f

    .line 109
    .line 110
    :goto_1
    or-int/2addr v2, v3

    .line 111
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    return v2

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getMainComponent()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "mainComponent"

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

.method public toBundle()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->mNotificationAndroidPressActionBundle:Landroid/os/Bundle;

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
