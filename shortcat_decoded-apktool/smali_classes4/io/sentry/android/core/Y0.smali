.class public abstract Lio/sentry/android/core/Y0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:J

.field protected static final b:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lio/sentry/android/core/Y0;->a:J

    .line 6
    .line 7
    new-instance v0, Lio/sentry/util/a;

    .line 8
    .line 9
    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lio/sentry/android/core/Y0;->b:Lio/sentry/util/a;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic b(Ljava/util/concurrent/atomic/AtomicBoolean;Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lio/sentry/Y;->F()Lio/sentry/O3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/O3;->k()Ljava/util/Date;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static synthetic c(Lio/sentry/ILogger;Landroid/content/Context;Lio/sentry/g2$a;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 12

    .line 1
    new-instance v2, Lio/sentry/util/s;

    .line 2
    .line 3
    invoke-direct {v2}, Lio/sentry/util/s;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v3, "timber.log.Timber"

    .line 7
    .line 8
    invoke-virtual {v2, v3, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const-string v4, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks"

    .line 13
    .line 14
    invoke-virtual {v2, v4, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const-string v4, "io.sentry.android.fragment.FragmentLifecycleIntegration"

    .line 23
    .line 24
    invoke-virtual {v2, v4, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    move v4, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v4, v6

    .line 33
    move v6, v5

    .line 34
    :goto_0
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const-string v3, "io.sentry.android.timber.SentryTimberIntegration"

    .line 37
    .line 38
    invoke-virtual {v2, v3, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    move v7, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v7, v5

    .line 47
    :goto_1
    const-string v3, "io.sentry.android.replay.ReplayIntegration"

    .line 48
    .line 49
    invoke-virtual {v2, v3, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    const-string v3, "io.sentry.android.distribution.DistributionIntegration"

    .line 54
    .line 55
    invoke-virtual {v2, v3, p3}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    new-instance v3, Lio/sentry/android/core/g0;

    .line 60
    .line 61
    invoke-direct {v3, p0}, Lio/sentry/android/core/g0;-><init>(Lio/sentry/ILogger;)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lio/sentry/util/s;

    .line 65
    .line 66
    invoke-direct {v4}, Lio/sentry/util/s;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v5, Lio/sentry/android/core/i;

    .line 70
    .line 71
    invoke-direct {v5, v4, p3}, Lio/sentry/android/core/i;-><init>(Lio/sentry/util/s;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p3, p1, p0, v3}, Lio/sentry/android/core/K;->j(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V

    .line 75
    .line 76
    .line 77
    move-object v1, p1

    .line 78
    move-object v2, p3

    .line 79
    invoke-static/range {v1 .. v9}, Lio/sentry/android/core/K;->i(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;Lio/sentry/util/s;Lio/sentry/android/core/i;ZZZZ)V

    .line 80
    .line 81
    .line 82
    move v11, v7

    .line 83
    move v7, v6

    .line 84
    move v6, v8

    .line 85
    move v8, v11

    .line 86
    :try_start_0
    invoke-interface/range {p2 .. p3}, Lio/sentry/g2$a;->a(Lio/sentry/z3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    invoke-virtual {p3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 96
    .line 97
    const-string v9, "Error in the \'OptionsConfiguration.configure\' callback."

    .line 98
    .line 99
    invoke-interface {v1, v2, v9, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p3}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    invoke-virtual {v3}, Lio/sentry/android/core/g0;->d()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    const/16 v2, 0x18

    .line 117
    .line 118
    if-lt v1, v2, :cond_2

    .line 119
    .line 120
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->l()Lio/sentry/android/core/performance/i;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lio/sentry/android/core/performance/i;->s()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_2

    .line 129
    .line 130
    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    invoke-virtual {v1, v9, v10}, Lio/sentry/android/core/performance/i;->x(J)V

    .line 135
    .line 136
    .line 137
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    instance-of v1, v1, Landroid/app/Application;

    .line 142
    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Landroid/app/Application;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/h;->v(Landroid/app/Application;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->r()Lio/sentry/android/core/performance/i;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Lio/sentry/android/core/performance/i;->s()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_4

    .line 163
    .line 164
    sget-wide v1, Lio/sentry/android/core/Y0;->a:J

    .line 165
    .line 166
    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/performance/i;->x(J)V

    .line 167
    .line 168
    .line 169
    :cond_4
    move-object v2, p1

    .line 170
    move-object v1, p3

    .line 171
    invoke-static/range {v1 .. v6}, Lio/sentry/android/core/K;->h(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/util/s;Lio/sentry/android/core/i;Z)V

    .line 172
    .line 173
    .line 174
    invoke-static {p3, v7, v8}, Lio/sentry/android/core/Y0;->d(Lio/sentry/z3;ZZ)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method private static d(Lio/sentry/z3;ZZ)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lio/sentry/p0;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    instance-of v5, v4, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    .line 39
    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    if-eqz p2, :cond_2

    .line 46
    .line 47
    instance-of v5, v4, Lio/sentry/android/timber/SentryTimberIntegration;

    .line 48
    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_2
    instance-of v5, v4, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 55
    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 p2, 0x0

    .line 67
    const/4 v3, 0x1

    .line 68
    if-le p1, v3, :cond_4

    .line 69
    .line 70
    move p1, p2

    .line 71
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    sub-int/2addr v4, v3

    .line 76
    if-ge p1, v4, :cond_4

    .line 77
    .line 78
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lio/sentry/p0;

    .line 83
    .line 84
    invoke-virtual {p0}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v5, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 p1, p1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-le p1, v3, :cond_5

    .line 99
    .line 100
    move p1, p2

    .line 101
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    sub-int/2addr v1, v3

    .line 106
    if-ge p1, v1, :cond_5

    .line 107
    .line 108
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lio/sentry/p0;

    .line 113
    .line 114
    invoke-virtual {p0}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-interface {v4, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    add-int/lit8 p1, p1, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-le p1, v3, :cond_6

    .line 129
    .line 130
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    sub-int/2addr p1, v3

    .line 135
    if-ge p2, p1, :cond_6

    .line 136
    .line 137
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lio/sentry/p0;

    .line 142
    .line 143
    invoke-virtual {p0}, Lio/sentry/z3;->getIntegrations()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    add-int/lit8 p2, p2, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    return-void
.end method

.method public static e(Landroid/content/Context;Lio/sentry/ILogger;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/V0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/V0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0}, Lio/sentry/android/core/Y0;->f(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/g2$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static f(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/g2$a;)V
    .locals 5

    .line 1
    const-string v0, "Failed to initialize Sentry\'s SDK"

    .line 2
    .line 3
    const-string v1, "Fatal error during SentryAndroid.init(...)"

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lio/sentry/android/core/Y0;->b:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    const-class v3, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    invoke-static {v3}, Lio/sentry/l1;->a(Ljava/lang/Class;)Lio/sentry/l1;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-instance v4, Lio/sentry/android/core/W0;

    .line 18
    .line 19
    invoke-direct {v4, p1, p0, p2}, Lio/sentry/android/core/W0;-><init>(Lio/sentry/ILogger;Landroid/content/Context;Lio/sentry/g2$a;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    invoke-static {v3, v4, p0}, Lio/sentry/g2;->w(Lio/sentry/l1;Lio/sentry/g2$a;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {}, Lio/sentry/android/core/p0;->s()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Lio/sentry/z3;->isEnableAutoSessionTracking()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {p2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lio/sentry/android/core/X0;

    .line 53
    .line 54
    invoke-direct {v3, p2}, Lio/sentry/android/core/X0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v3}, Lio/sentry/a0;->r(Lio/sentry/G1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_0

    .line 65
    .line 66
    invoke-interface {p0}, Lio/sentry/a0;->p()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    invoke-interface {p0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Lio/sentry/z1;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    :cond_1
    if-eqz v2, :cond_2

    .line 84
    .line 85
    :try_start_2
    invoke-interface {v2}, Lio/sentry/e0;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :catch_1
    move-exception p0

    .line 92
    goto :goto_4

    .line 93
    :catch_2
    move-exception p0

    .line 94
    goto :goto_5

    .line 95
    :catch_3
    move-exception p0

    .line 96
    goto :goto_6

    .line 97
    :cond_2
    return-void

    .line 98
    :goto_1
    if-eqz v2, :cond_3

    .line 99
    .line 100
    :try_start_3
    invoke-interface {v2}, Lio/sentry/e0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_1
    move-exception p2

    .line 105
    :try_start_4
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_2
    throw p0
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_0

    .line 109
    :goto_3
    sget-object p2, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 110
    .line 111
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Ljava/lang/RuntimeException;

    .line 115
    .line 116
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :goto_4
    sget-object p2, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 121
    .line 122
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    new-instance p1, Ljava/lang/RuntimeException;

    .line 126
    .line 127
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :goto_5
    sget-object p2, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 132
    .line 133
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, Ljava/lang/RuntimeException;

    .line 137
    .line 138
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :goto_6
    sget-object p2, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 143
    .line 144
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, Ljava/lang/RuntimeException;

    .line 148
    .line 149
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method

.method public static g(Landroid/content/Context;Lio/sentry/g2$a;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/z;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/z;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, p1}, Lio/sentry/android/core/Y0;->f(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/g2$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
