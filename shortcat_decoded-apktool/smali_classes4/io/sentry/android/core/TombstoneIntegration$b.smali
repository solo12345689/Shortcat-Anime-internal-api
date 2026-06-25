.class public Lio/sentry/android/core/TombstoneIntegration$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/core/f0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/TombstoneIntegration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/android/core/cache/f;->a0(Lio/sentry/z3;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Tombstone"

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(Landroid/app/ApplicationExitInfo;Z)Lio/sentry/android/core/f0$b;
    .locals 10

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lio/sentry/android/core/X;->a(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 9
    .line 10
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    sget-object v0, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 15
    .line 16
    const-string v2, "No tombstone InputStream available for ApplicationExitInfo from %s"

    .line 17
    .line 18
    invoke-static {}, Lio/sentry/android/core/g1;->a()Ljava/time/format/DateTimeFormatter;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {p1}, Lo4/h;->a(Landroid/app/ApplicationExitInfo;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-static {v4, v5}, Lpc/q;->a(J)Ljava/time/Instant;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v3, v4}, Lio/sentry/android/core/h1;->a(Ljava/time/format/DateTimeFormatter;Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {p2, v0, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p2, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    new-instance v2, Lio/sentry/android/core/internal/tombstone/a;

    .line 46
    .line 47
    invoke-direct {v2, v0}, Lio/sentry/android/core/internal/tombstone/a;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/android/core/internal/tombstone/a;->l()Lio/sentry/V2;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/android/core/internal/tombstone/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lo4/h;->a(Landroid/app/ApplicationExitInfo;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    invoke-static {v7, v8}, Lio/sentry/l;->e(J)Ljava/util/Date;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p1}, Lio/sentry/V2;->G0(Ljava/util/Date;)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lio/sentry/android/core/TombstoneIntegration$a;

    .line 69
    .line 70
    iget-object p1, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 71
    .line 72
    invoke-virtual {p1}, Lio/sentry/z3;->getFlushTimeoutMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    iget-object p1, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 77
    .line 78
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    move v9, p2

    .line 83
    invoke-direct/range {v3 .. v9}, Lio/sentry/android/core/TombstoneIntegration$a;-><init>(JLio/sentry/ILogger;JZ)V

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Lio/sentry/util/l;->c(Ljava/lang/Object;)Lio/sentry/H;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p2, Lio/sentry/android/core/f0$b;

    .line 91
    .line 92
    invoke-direct {p2, v0, p1, v3}, Lio/sentry/android/core/f0$b;-><init>(Lio/sentry/V2;Lio/sentry/H;Lio/sentry/hints/d;)V

    .line 93
    .line 94
    .line 95
    return-object p2

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object p2, v0

    .line 98
    :try_start_3
    invoke-virtual {v2}, Lio/sentry/android/core/internal/tombstone/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    :try_start_4
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/TombstoneIntegration$b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 108
    .line 109
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 114
    .line 115
    invoke-static {}, Lio/sentry/android/core/g1;->a()Ljava/time/format/DateTimeFormatter;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {p1}, Lo4/h;->a(Landroid/app/ApplicationExitInfo;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    invoke-static {v4, v5}, Lpc/q;->a(J)Ljava/time/Instant;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {v3, p1}, Lio/sentry/android/core/h1;->a(Ljava/time/format/DateTimeFormatter;Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string p2, "Failed to parse tombstone from %s: %s"

    .line 140
    .line 141
    invoke-interface {v0, v2, p2, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v1
.end method

.method public e()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
.end method
