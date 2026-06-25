.class public Lio/sentry/react/RNSentryOnDrawReporterManager$a;
.super Landroid/view/View;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/react/RNSentryOnDrawReporterManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final h:Lio/sentry/ILogger;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:Lio/sentry/p2;

.field private final c:Lio/sentry/android/core/g0;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/core/z;

    .line 2
    .line 3
    const-string v1, "RNSentryOnDrawReporterView"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lio/sentry/android/core/g0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/android/core/Z0;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/android/core/Z0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->b:Lio/sentry/p2;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->e:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->f:Z

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 22
    .line 23
    iput-object p2, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c:Lio/sentry/android/core/g0;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Lio/sentry/react/RNSentryOnDrawReporterManager$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->b:Lio/sentry/p2;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o2;->m()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    long-to-double v0, v0

    .line 12
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    div-double/2addr v0, v2

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 28
    .line 29
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 30
    .line 31
    const-string v3, "[TimeToDisplay] parentSpanId removed before frame was rendered."

    .line 32
    .line 33
    new-array v2, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-boolean v1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "ttid-"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1, v0}, Lio/sentry/react/w;->e(Ljava/lang/String;Ljava/lang/Double;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-boolean v1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->e:Z

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "ttfd-"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v2, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1, v0}, Lio/sentry/react/w;->e(Ljava/lang/String;Ljava/lang/Double;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 94
    .line 95
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 96
    .line 97
    const-string v3, "[TimeToDisplay] display type removed before frame was rendered."

    .line 98
    .line 99
    new-array v2, v2, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->f:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 12
    .line 13
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v4, "[TimeToDisplay] Already recorded time to display for spanId: "

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v4, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d:Z

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 45
    .line 46
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 47
    .line 48
    const-string v3, "[TimeToDisplay] Register initial display event emitter."

    .line 49
    .line 50
    new-array v4, v1, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->e:Z

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 61
    .line 62
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 63
    .line 64
    const-string v3, "[TimeToDisplay] Register full display event emitter."

    .line 65
    .line 66
    new-array v4, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c:Lio/sentry/android/core/g0;

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 76
    .line 77
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 78
    .line 79
    const-string v3, "[TimeToDisplay] Won\'t emit next frame drawn event, buildInfo is null."

    .line 80
    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    iget-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 92
    .line 93
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 94
    .line 95
    const-string v3, "[TimeToDisplay] Won\'t emit next frame drawn event, reactContext is null."

    .line 96
    .line 97
    new-array v1, v1, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    sget-object v2, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 104
    .line 105
    invoke-static {v0, v2}, Lio/sentry/react/utils/a;->a(Lcom/facebook/react/bridge/ReactApplicationContext;Lio/sentry/ILogger;)Landroid/app/Activity;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-nez v0, :cond_5

    .line 110
    .line 111
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 112
    .line 113
    const-string v3, "[TimeToDisplay] Won\'t emit next frame drawn event, activity is null."

    .line 114
    .line 115
    new-array v1, v1, [Ljava/lang/Object;

    .line 116
    .line 117
    invoke-interface {v2, v0, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    const/4 v1, 0x1

    .line 122
    iput-boolean v1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->f:Z

    .line 123
    .line 124
    new-instance v1, Lio/sentry/react/o;

    .line 125
    .line 126
    invoke-direct {v1, p0}, Lio/sentry/react/o;-><init>(Lio/sentry/react/RNSentryOnDrawReporterManager$a;)V

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c:Lio/sentry/android/core/g0;

    .line 130
    .line 131
    invoke-virtual {p0, v0, v1, v2}, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/g0;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    sget-object v0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->h:Lio/sentry/ILogger;

    .line 136
    .line 137
    sget-object v2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 138
    .line 139
    const-string v3, "[TimeToDisplay] Not ready, missing displayType prop."

    .line 140
    .line 141
    new-array v1, v1, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method


# virtual methods
.method protected d(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/g0;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lio/sentry/android/core/internal/util/t;->d(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/g0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setFullDisplay(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->e:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->e:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setInitialDisplay(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->d:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setParentSpanId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->g:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->f:Z

    .line 13
    .line 14
    invoke-direct {p0}, Lio/sentry/react/RNSentryOnDrawReporterManager$a;->c()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
