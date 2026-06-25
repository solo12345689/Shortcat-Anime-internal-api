.class public final LJd/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private b:LJd/c;

.field private c:Z

.field private final d:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;LUb/d;)V
    .locals 1

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appContext"

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
    iput-object p1, p0, LJd/d;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LJd/d;->d:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    return-void
.end method

.method private final a()LUb/d;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/d;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LUb/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/e;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/e;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public final b()LJd/c;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/d;->b:LJd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJd/d;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public onBindingDied(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LJd/d;->c:Z

    .line 3
    .line 4
    invoke-direct {p0}, LJd/d;->a()LUb/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string v1, "Expo-video has lost connection to the playback service binder"

    .line 15
    .line 16
    const-string v2, "This will cause issues with now playing notification and sustaining background playback."

    .line 17
    .line 18
    invoke-static {v1, v2}, LFd/G;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v0, v1, v3, v2, v3}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-super {p0, p1}, Landroid/content/ServiceConnection;->onBindingDied(Landroid/content/ComponentName;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onNullBinding(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LJd/d;->c:Z

    .line 8
    .line 9
    invoke-direct {p0}, LJd/d;->a()LUb/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "Expo Video could not bind to the playback service"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-static {v1, v2, v3, v2}, LFd/G;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1, v2, v3, v2}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-super {p0, p1}, Landroid/content/ServiceConnection;->onNullBinding(Landroid/content/ComponentName;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "binder"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LJd/d;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lexpo/modules/video/player/VideoPlayer;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v0, p2, LJd/c;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p2, LJd/c;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p2, v1

    .line 31
    :goto_0
    if-nez p2, :cond_3

    .line 32
    .line 33
    invoke-direct {p0}, LJd/d;->a()LUb/d;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, LUb/d;->u()Lub/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    const-string p2, "Expo-video could not bind to the playback service"

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-static {p2, v1, v0, v1}, LFd/G;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p1, p2, v1, v0, v1}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    return-void

    .line 54
    :cond_3
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, LJd/d;->c:Z

    .line 56
    .line 57
    iput-object p2, p0, LJd/d;->b:LJd/c;

    .line 58
    .line 59
    invoke-virtual {p2}, LJd/c;->a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p0}, LJd/d;->a()LUb/d;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->K(LUb/d;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, LJd/c;->a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2, p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->J(Lexpo/modules/video/player/VideoPlayer;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LJd/d;->b:LJd/c;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, LJd/d;->c:Z

    .line 11
    .line 12
    return-void
.end method
