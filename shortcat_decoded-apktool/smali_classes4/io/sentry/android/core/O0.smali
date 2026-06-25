.class abstract Lio/sentry/android/core/O0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static a(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;)V
    .locals 11

    .line 1
    const-string v0, ""

    const-string v1, "io.sentry.traces.trace-propagation-targets"

    const-string v2, "The application context is required."

    invoke-static {p0, v2}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    const-string v2, "The options object is required."

    invoke-static {p1, v2}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    invoke-static {p0, v2, p2}, Lio/sentry/android/core/O0;->b(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)Landroid/os/Bundle;

    move-result-object p0

    .line 4
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz p0, :cond_22

    .line 5
    const-string v3, "io.sentry.debug"

    invoke-virtual {p1}, Lio/sentry/z3;->isDebug()Z

    move-result v4

    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setDebug(Z)V

    .line 6
    invoke-virtual {p1}, Lio/sentry/z3;->isDebug()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 7
    const-string v3, "io.sentry.debug.level"

    .line 8
    invoke-virtual {p1}, Lio/sentry/z3;->getDiagnosticLevel()Lio/sentry/i3;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 10
    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/sentry/i3;->valueOf(Ljava/lang/String;)Lio/sentry/i3;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setDiagnosticLevel(Lio/sentry/i3;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_c

    .line 11
    :cond_0
    :goto_0
    const-string v3, "io.sentry.anr.enable"

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v4

    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    .line 12
    const-string v3, "io.sentry.auto-session-tracking.enable"

    .line 13
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableAutoSessionTracking()Z

    move-result v4

    .line 14
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 15
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnableAutoSessionTracking(Z)V

    .line 16
    invoke-virtual {p1}, Lio/sentry/z3;->getSampleRate()Ljava/lang/Double;

    move-result-object v3

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    if-nez v3, :cond_1

    .line 17
    const-string v3, "io.sentry.sample-rate"

    invoke-static {p0, p2, v3}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v6

    cmpl-double v3, v6, v4

    if-eqz v3, :cond_1

    .line 18
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setSampleRate(Ljava/lang/Double;)V

    .line 19
    :cond_1
    const-string v3, "io.sentry.anr.report-debug"

    .line 20
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 21
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    .line 22
    const-string v3, "io.sentry.anr.timeout-interval-millis"

    .line 23
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v6

    .line 24
    invoke-static {p0, p2, v3, v6, v7}, Lio/sentry/android/core/O0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v6

    .line 25
    invoke-virtual {p1, v6, v7}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    .line 26
    const-string v3, "io.sentry.anr.attach-thread-dumps"

    .line 27
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 28
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachAnrThreadDump(Z)V

    .line 29
    const-string v3, "io.sentry.dsn"

    invoke-virtual {p1}, Lio/sentry/z3;->getDsn()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 30
    const-string v6, "io.sentry.enabled"

    invoke-virtual {p1}, Lio/sentry/z3;->isEnabled()Z

    move-result v7

    invoke-static {p0, p2, v6, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v3, :cond_2

    .line 31
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_4

    .line 32
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object v7

    sget-object v8, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    const-string v9, "DSN is required. Use empty string to disable SDK."

    new-array v10, v2, [Ljava/lang/Object;

    .line 33
    invoke-interface {v7, v8, v9, v10}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 34
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object v7

    sget-object v8, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    const-string v9, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android"

    new-array v10, v2, [Ljava/lang/Object;

    .line 35
    invoke-interface {v7, v8, v9, v10}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    :cond_4
    :goto_2
    invoke-virtual {p1, v6}, Lio/sentry/z3;->setEnabled(Z)V

    .line 37
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setDsn(Ljava/lang/String;)V

    .line 38
    const-string v3, "io.sentry.ndk.enable"

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdk()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    .line 39
    const-string v3, "io.sentry.ndk.scope-sync.enable"

    .line 40
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableScopeSync()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 41
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    .line 42
    const-string v3, "io.sentry.ndk.sdk-name"

    .line 43
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getNativeSdkName()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 44
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setNativeSdkName(Ljava/lang/String;)V

    .line 45
    :cond_5
    const-string v3, "io.sentry.release"

    invoke-virtual {p1}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setRelease(Ljava/lang/String;)V

    .line 46
    const-string v3, "io.sentry.environment"

    invoke-virtual {p1}, Lio/sentry/z3;->getEnvironment()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnvironment(Ljava/lang/String;)V

    .line 47
    const-string v3, "io.sentry.session-tracking.timeout-interval-millis"

    .line 48
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionTrackingIntervalMillis()J

    move-result-wide v6

    .line 49
    invoke-static {p0, p2, v3, v6, v7}, Lio/sentry/android/core/O0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v6

    .line 50
    invoke-virtual {p1, v6, v7}, Lio/sentry/z3;->setSessionTrackingIntervalMillis(J)V

    .line 51
    const-string v3, "io.sentry.max-breadcrumbs"

    .line 52
    invoke-virtual {p1}, Lio/sentry/z3;->getMaxBreadcrumbs()I

    move-result v6

    int-to-long v6, v6

    invoke-static {p0, p2, v3, v6, v7}, Lio/sentry/android/core/O0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v6

    long-to-int v3, v6

    .line 53
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setMaxBreadcrumbs(I)V

    .line 54
    const-string v3, "io.sentry.breadcrumbs.activity-lifecycle"

    .line 55
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    move-result v6

    .line 56
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 57
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    .line 58
    const-string v3, "io.sentry.breadcrumbs.app-lifecycle"

    .line 59
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    move-result v6

    .line 60
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 61
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    .line 62
    const-string v3, "io.sentry.breadcrumbs.system-events"

    .line 63
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result v6

    .line 64
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 65
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 66
    const-string v3, "io.sentry.breadcrumbs.app-components"

    .line 67
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    move-result v6

    .line 68
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 69
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    .line 70
    const-string v3, "io.sentry.breadcrumbs.user-interaction"

    .line 71
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableUserInteractionBreadcrumbs()Z

    move-result v6

    .line 72
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 73
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnableUserInteractionBreadcrumbs(Z)V

    .line 74
    const-string v3, "io.sentry.breadcrumbs.network-events"

    .line 75
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    move-result v6

    .line 76
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 77
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNetworkEventBreadcrumbs(Z)V

    .line 78
    const-string v3, "io.sentry.uncaught-exception-handler.enable"

    .line 79
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableUncaughtExceptionHandler()Z

    move-result v6

    .line 80
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 81
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnableUncaughtExceptionHandler(Z)V

    .line 82
    const-string v3, "io.sentry.attach-threads"

    .line 83
    invoke-virtual {p1}, Lio/sentry/z3;->isAttachThreads()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 84
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setAttachThreads(Z)V

    .line 85
    const-string v3, "io.sentry.attach-screenshot"

    .line 86
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 87
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    .line 88
    const-string v3, "io.sentry.attach-view-hierarchy"

    .line 89
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 90
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    .line 91
    const-string v3, "io.sentry.send-client-reports"

    .line 92
    invoke-virtual {p1}, Lio/sentry/z3;->isSendClientReports()Z

    move-result v6

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 93
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setSendClientReports(Z)V

    .line 94
    const-string v3, "io.sentry.auto-init"

    const/4 v6, 0x1

    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 95
    sget-object v3, Lio/sentry/n0;->LOW:Lio/sentry/n0;

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setInitPriority(Lio/sentry/n0;)V

    .line 96
    :cond_6
    const-string v3, "io.sentry.force-init"

    invoke-virtual {p1}, Lio/sentry/z3;->isForceInit()Z

    move-result v7

    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setForceInit(Z)V

    .line 97
    const-string v3, "io.sentry.additional-context"

    .line 98
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    move-result v7

    .line 99
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 100
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    .line 101
    const-string v3, "io.sentry.external-storage-context"

    .line 102
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    move-result v7

    .line 103
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 104
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectExternalStorageContext(Z)V

    .line 105
    invoke-virtual {p1}, Lio/sentry/z3;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_7

    .line 106
    const-string v3, "io.sentry.traces.sample-rate"

    invoke-static {p0, p2, v3}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_7

    .line 107
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setTracesSampleRate(Ljava/lang/Double;)V

    .line 108
    :cond_7
    const-string v3, "io.sentry.traces.trace-sampling"

    .line 109
    invoke-virtual {p1}, Lio/sentry/z3;->isTraceSampling()Z

    move-result v7

    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 110
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setTraceSampling(Z)V

    .line 111
    const-string v3, "io.sentry.traces.activity.enable"

    .line 112
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    move-result v7

    .line 113
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 114
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    .line 115
    const-string v3, "io.sentry.traces.activity.auto-finish.enable"

    .line 116
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    move-result v7

    .line 117
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 118
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    .line 119
    invoke-virtual {p1}, Lio/sentry/z3;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_8

    .line 120
    const-string v3, "io.sentry.traces.profiling.sample-rate"

    invoke-static {p0, p2, v3}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_8

    .line 121
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setProfilesSampleRate(Ljava/lang/Double;)V

    .line 122
    :cond_8
    invoke-virtual {p1}, Lio/sentry/z3;->getProfileSessionSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_9

    .line 123
    const-string v3, "io.sentry.traces.profiling.session-sample-rate"

    .line 124
    invoke-static {p0, p2, v3}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_9

    .line 125
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 126
    :cond_9
    const-string v3, "io.sentry.traces.profiling.lifecycle"

    .line 127
    invoke-virtual {p1}, Lio/sentry/z3;->getProfileLifecycle()Lio/sentry/t1;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 128
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 129
    invoke-virtual {v3, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/sentry/t1;->valueOf(Ljava/lang/String;)Lio/sentry/t1;

    move-result-object v3

    .line 130
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setProfileLifecycle(Lio/sentry/t1;)V

    .line 131
    :cond_a
    const-string v3, "io.sentry.traces.profiling.start-on-app-start"

    .line 132
    invoke-virtual {p1}, Lio/sentry/z3;->isStartProfilerOnAppStart()Z

    move-result v7

    .line 133
    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 134
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setStartProfilerOnAppStart(Z)V

    .line 135
    const-string v3, "io.sentry.traces.user-interaction.enable"

    .line 136
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableUserInteractionTracing()Z

    move-result v7

    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 137
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnableUserInteractionTracing(Z)V

    .line 138
    const-string v3, "io.sentry.traces.time-to-full-display.enable"

    .line 139
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableTimeToFullDisplayTracing()Z

    move-result v7

    invoke-static {p0, p2, v3, v7}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v3

    .line 140
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setEnableTimeToFullDisplayTracing(Z)V

    .line 141
    const-string v3, "io.sentry.traces.idle-timeout"

    const-wide/16 v7, -0x1

    invoke-static {p0, p2, v3, v7, v8}, Lio/sentry/android/core/O0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v9

    cmp-long v3, v9, v7

    if-eqz v3, :cond_b

    .line 142
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/sentry/z3;->setIdleTimeout(Ljava/lang/Long;)V

    .line 143
    :cond_b
    invoke-static {p0, p2, v1}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 144
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    if-nez v3, :cond_c

    .line 145
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p1, v1}, Lio/sentry/z3;->setTracePropagationTargets(Ljava/util/List;)V

    goto :goto_3

    :cond_c
    if-eqz v3, :cond_d

    .line 146
    invoke-virtual {p1, v3}, Lio/sentry/z3;->setTracePropagationTargets(Ljava/util/List;)V

    .line 147
    :cond_d
    :goto_3
    const-string v1, "io.sentry.traces.frames-tracking"

    invoke-static {p0, p2, v1, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    .line 148
    const-string v1, "io.sentry.proguard-uuid"

    .line 149
    invoke-virtual {p1}, Lio/sentry/z3;->getProguardUuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setProguardUuid(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p1}, Lio/sentry/z3;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v1

    if-nez v1, :cond_e

    .line 152
    new-instance v1, Lio/sentry/protocol/r;

    invoke-direct {v1, v0, v0}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    :cond_e
    const-string v0, "io.sentry.sdk.name"

    invoke-virtual {v1}, Lio/sentry/protocol/r;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p2, v0, v3}, Lio/sentry/android/core/O0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/r;->i(Ljava/lang/String;)V

    .line 154
    const-string v0, "io.sentry.sdk.version"

    invoke-virtual {v1}, Lio/sentry/protocol/r;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p2, v0, v3}, Lio/sentry/android/core/O0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/r;->k(Ljava/lang/String;)V

    .line 155
    invoke-virtual {p1, v1}, Lio/sentry/z3;->setSdkVersion(Lio/sentry/protocol/r;)V

    .line 156
    const-string v0, "io.sentry.send-default-pii"

    .line 157
    invoke-virtual {p1}, Lio/sentry/z3;->isSendDefaultPii()Z

    move-result v1

    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 158
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setSendDefaultPii(Z)V

    .line 159
    const-string v0, "io.sentry.gradle-plugin-integrations"

    .line 160
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 161
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 162
    invoke-static {}, Lio/sentry/g3;->d()Lio/sentry/g3;

    move-result-object v3

    invoke-virtual {v3, v1}, Lio/sentry/g3;->a(Ljava/lang/String;)V

    goto :goto_4

    .line 163
    :cond_f
    const-string v0, "io.sentry.enable-root-check"

    .line 164
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    move-result v1

    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 165
    invoke-virtual {p1, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableRootCheck(Z)V

    .line 166
    const-string v0, "io.sentry.send-modules"

    invoke-virtual {p1}, Lio/sentry/z3;->isSendModules()Z

    move-result v1

    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, Lio/sentry/z3;->setSendModules(Z)V

    .line 167
    const-string v0, "io.sentry.performance-v2.enable"

    .line 168
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v1

    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 169
    invoke-virtual {p1, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnablePerformanceV2(Z)V

    .line 170
    const-string v0, "io.sentry.profiling.enable-app-start"

    .line 171
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableAppStartProfiling()Z

    move-result v1

    .line 172
    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 173
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setEnableAppStartProfiling(Z)V

    .line 174
    const-string v0, "io.sentry.enable-scope-persistence"

    .line 175
    invoke-virtual {p1}, Lio/sentry/z3;->isEnableScopePersistence()Z

    move-result v1

    .line 176
    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 177
    invoke-virtual {p1, v0}, Lio/sentry/z3;->setEnableScopePersistence(Z)V

    .line 178
    const-string v0, "io.sentry.traces.enable-auto-id-generation"

    .line 179
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v1

    .line 180
    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    .line 181
    invoke-virtual {p1, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoTraceIdGeneration(Z)V

    .line 182
    const-string v0, "io.sentry.traces.deadline-timeout"

    .line 183
    invoke-virtual {p1}, Lio/sentry/z3;->getDeadlineTimeout()J

    move-result-wide v7

    invoke-static {p0, p2, v0, v7, v8}, Lio/sentry/android/core/O0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v0

    .line 184
    invoke-virtual {p1, v0, v1}, Lio/sentry/z3;->setDeadlineTimeout(J)V

    .line 185
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->q()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_10

    .line 186
    const-string v0, "io.sentry.session-replay.session-sample-rate"

    .line 187
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v3, v0, v4

    if-eqz v3, :cond_10

    .line 188
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/sentry/B3;->N(Ljava/lang/Double;)V

    .line 189
    :cond_10
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->l()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_11

    .line 190
    const-string v0, "io.sentry.session-replay.on-error-sample-rate"

    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v3, v0, v4

    if-eqz v3, :cond_11

    .line 191
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/sentry/B3;->J(Ljava/lang/Double;)V

    .line 192
    :cond_11
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-text"

    .line 193
    invoke-static {p0, p2, v1, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/B3;->C(Z)V

    .line 194
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-images"

    .line 195
    invoke-static {p0, p2, v1, v6}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/B3;->B(Z)V

    .line 196
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.debug"

    invoke-static {p0, p2, v1, v2}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/B3;->A(Z)V

    .line 197
    const-string v0, "io.sentry.session-replay.screenshot-strategy"

    const/4 v1, 0x0

    .line 198
    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/O0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 199
    const-string v1, "canvas"

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 200
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    sget-object v1, Lio/sentry/S1;->CANVAS:Lio/sentry/S1;

    invoke-virtual {v0, v1}, Lio/sentry/B3;->L(Lio/sentry/S1;)V

    goto :goto_5

    .line 201
    :cond_12
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    sget-object v1, Lio/sentry/S1;->PIXEL_COPY:Lio/sentry/S1;

    invoke-virtual {v0, v1}, Lio/sentry/B3;->L(Lio/sentry/S1;)V

    .line 202
    :cond_13
    :goto_5
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 203
    const-string v0, "io.sentry.session-replay.network-detail-allow-urls"

    .line 204
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 205
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    .line 206
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 207
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 208
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 209
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    .line 210
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 211
    :cond_15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    .line 212
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/B3;->F(Ljava/util/List;)V

    .line 213
    :cond_16
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 214
    const-string v0, "io.sentry.session-replay.network-detail-deny-urls"

    .line 215
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 216
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_19

    .line 217
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 218
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 219
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 220
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_17

    .line 221
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 222
    :cond_18
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    .line 223
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/B3;->G(Ljava/util/List;)V

    .line 224
    :cond_19
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.network-capture-bodies"

    .line 225
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/B3;->v()Z

    move-result v3

    .line 226
    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 227
    invoke-virtual {v0, v1}, Lio/sentry/B3;->E(Z)V

    .line 228
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 229
    invoke-static {}, Lio/sentry/B3;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1c

    .line 230
    const-string v0, "io.sentry.session-replay.network-request-headers"

    .line 231
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 232
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 233
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 234
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 235
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1a

    .line 236
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 237
    :cond_1b
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 238
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/B3;->H(Ljava/util/List;)V

    .line 239
    :cond_1c
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/B3;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 240
    invoke-static {}, Lio/sentry/B3;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1f

    .line 241
    const-string v0, "io.sentry.session-replay.network-response-headers"

    .line 242
    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1f

    .line 243
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1f

    .line 244
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 245
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1d
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 246
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 247
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1d

    .line 248
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 249
    :cond_1e
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    .line 250
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/B3;->I(Ljava/util/List;)V

    .line 251
    :cond_1f
    const-string v0, "io.sentry.ignored-errors"

    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/z3;->setIgnoredErrors(Ljava/util/List;)V

    .line 252
    const-string v0, "io.sentry.in-app-includes"

    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 253
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_20

    .line 254
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 255
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addInAppInclude(Ljava/lang/String;)V

    goto :goto_a

    .line 256
    :cond_20
    const-string v0, "io.sentry.in-app-excludes"

    invoke-static {p0, p2, v0}, Lio/sentry/android/core/O0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 257
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_21

    .line 258
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 259
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addInAppExclude(Ljava/lang/String;)V

    goto :goto_b

    .line 260
    :cond_21
    invoke-virtual {p1}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    move-result-object v0

    const-string v1, "io.sentry.logs.enabled"

    .line 261
    invoke-virtual {p1}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/z3$h;->b()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/z3$h;->c(Z)V

    .line 262
    invoke-virtual {p1}, Lio/sentry/z3;->getMetrics()Lio/sentry/z3$i;

    move-result-object v0

    const-string v1, "io.sentry.metrics.enabled"

    .line 263
    invoke-virtual {p1}, Lio/sentry/z3;->getMetrics()Lio/sentry/z3$i;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/z3$i;->b()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 264
    invoke-virtual {v0, v1}, Lio/sentry/z3$i;->c(Z)V

    .line 265
    invoke-virtual {p1}, Lio/sentry/z3;->getFeedbackOptions()Lio/sentry/a3;

    move-result-object v0

    .line 266
    const-string v1, "io.sentry.feedback.is-name-required"

    .line 267
    invoke-virtual {v0}, Lio/sentry/a3;->b()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 268
    invoke-virtual {v0, v1}, Lio/sentry/a3;->i(Z)V

    .line 269
    const-string v1, "io.sentry.feedback.show-name"

    .line 270
    invoke-virtual {v0}, Lio/sentry/a3;->e()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 271
    invoke-virtual {v0, v1}, Lio/sentry/a3;->l(Z)V

    .line 272
    const-string v1, "io.sentry.feedback.is-email-required"

    .line 273
    invoke-virtual {v0}, Lio/sentry/a3;->a()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 274
    invoke-virtual {v0, v1}, Lio/sentry/a3;->h(Z)V

    .line 275
    const-string v1, "io.sentry.feedback.show-email"

    .line 276
    invoke-virtual {v0}, Lio/sentry/a3;->d()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 277
    invoke-virtual {v0, v1}, Lio/sentry/a3;->k(Z)V

    .line 278
    const-string v1, "io.sentry.feedback.use-sentry-user"

    .line 279
    invoke-virtual {v0}, Lio/sentry/a3;->f()Z

    move-result v3

    .line 280
    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    .line 281
    invoke-virtual {v0, v1}, Lio/sentry/a3;->m(Z)V

    .line 282
    const-string v1, "io.sentry.feedback.show-branding"

    .line 283
    invoke-virtual {v0}, Lio/sentry/a3;->c()Z

    move-result v3

    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result p0

    .line 284
    invoke-virtual {v0, p0}, Lio/sentry/a3;->j(Z)V

    .line 285
    :cond_22
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object p0

    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    const-string v0, "Retrieving configuration from AndroidManifest.xml"

    new-array v1, v2, [Ljava/lang/Object;

    .line 286
    invoke-interface {p0, p2, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 287
    :goto_c
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    const-string v0, "Failed to read configuration from android manifest metadata."

    .line 288
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)Landroid/os/Bundle;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lio/sentry/android/core/g0;

    .line 5
    .line 6
    invoke-direct {p2, p1}, Lio/sentry/android/core/g0;-><init>(Lio/sentry/ILogger;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-static {p0, p2}, Lio/sentry/android/core/p0;->h(Landroid/content/Context;Lio/sentry/android/core/g0;)Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method static c(Landroid/content/Context;Lio/sentry/ILogger;)Z
    .locals 3

    .line 1
    const-string v0, "The application context is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-static {p0, p1, v0}, Lio/sentry/android/core/O0;->b(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string v0, "io.sentry.auto-init"

    .line 15
    .line 16
    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/O0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v1

    .line 24
    :goto_0
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 25
    .line 26
    const-string v2, "Failed to read auto-init from android manifest metadata."

    .line 27
    .line 28
    invoke-interface {p1, v0, v2, p0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    return v1
.end method

.method private static d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " read: "

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return p0
.end method

.method private static e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D
    .locals 4

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 16
    .line 17
    cmpl-double v2, v0, v2

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    :cond_0
    sget-object p0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, " read: "

    .line 45
    .line 46
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const/4 v2, 0x0

    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p1, p0, p2, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-wide v0
.end method

.method private static f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " read: "

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v1, 0x0

    .line 28
    new-array v1, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const-string p1, ","

    .line 36
    .line 37
    const/4 p2, -0x1

    .line 38
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method private static g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J
    .locals 1

    .line 1
    long-to-int p3, p3

    .line 2
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    int-to-long p3, p0

    .line 7
    sget-object p0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p2, " read: "

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {p1, p0, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-wide p3
.end method

.method private static h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " read: "

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method private static i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " read: "

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method
