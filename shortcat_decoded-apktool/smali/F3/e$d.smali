.class abstract LF3/e$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF3/e$c;
.implements LF3/e$g;
.implements LF3/e$b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field protected final b:Landroid/media/browse/MediaBrowser;

.field protected final c:Landroid/os/Bundle;

.field protected final d:LF3/e$a;

.field private final e:Lt/a;

.field protected f:I

.field protected g:LF3/e$i;

.field protected h:Landroid/os/Messenger;

.field private i:LF3/n$j;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;LF3/e$b;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF3/e$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LF3/e$a;-><init>(LF3/e$g;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LF3/e$d;->d:LF3/e$a;

    .line 10
    .line 11
    new-instance v0, Lt/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LF3/e$d;->e:Lt/a;

    .line 17
    .line 18
    iput-object p1, p0, LF3/e$d;->a:Landroid/content/Context;

    .line 19
    .line 20
    new-instance v0, Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz p4, :cond_0

    .line 23
    .line 24
    invoke-direct {v0, p4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object v0, p0, LF3/e$d;->c:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string p4, "extra_client_version"

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, p4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    const-string p4, "extra_calling_pid"

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, p4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p0}, LF3/e$b;->d(LF3/e$b$b;)V

    .line 49
    .line 50
    .line 51
    new-instance p4, Landroid/media/browse/MediaBrowser;

    .line 52
    .line 53
    iget-object p3, p3, LF3/e$b;->a:Landroid/media/browse/MediaBrowser$ConnectionCallback;

    .line 54
    .line 55
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Landroid/media/browse/MediaBrowser$ConnectionCallback;

    .line 60
    .line 61
    invoke-direct {p4, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    iput-object p4, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public S()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p3, p0, LF3/e$d;->h:Landroid/os/Messenger;

    .line 2
    .line 3
    if-eq p3, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-nez p2, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, LF3/e$d;->e:Lt/a;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-boolean p1, LF3/e;->b:Z

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string p3, "onLoadChildren for id that isn\'t subscribed id="

    .line 28
    .line 29
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "MediaBrowserCompat"

    .line 40
    .line 41
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LF3/e$d;->g:LF3/e$i;

    .line 3
    .line 4
    iput-object v0, p0, LF3/e$d;->h:Landroid/os/Messenger;

    .line 5
    .line 6
    iput-object v0, p0, LF3/e$d;->i:LF3/n$j;

    .line 7
    .line 8
    iget-object v1, p0, LF3/e$d;->d:LF3/e$a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, LF3/e$a;->a(Landroid/os/Messenger;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public d()LF3/n$j;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e$d;->i:LF3/n$j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LF3/n$j;->a(Landroid/media/session/MediaSession$Token;)LF3/n$j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LF3/e$d;->i:LF3/n$j;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LF3/e$d;->i:LF3/n$j;

    .line 18
    .line 19
    return-object v0
.end method

.method public disconnect()V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/e$d;->g:LF3/e$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LF3/e$d;->h:Landroid/os/Messenger;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, v1}, LF3/e$i;->c(Landroid/os/Messenger;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const-string v0, "MediaBrowserCompat"

    .line 14
    .line 15
    const-string v1, "Remote error unregistering client messenger."

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    iget-object v0, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->disconnect()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onConnected()V
    .locals 5

    .line 1
    const-string v0, "MediaBrowserCompat"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v2, "extra_service_version"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iput v2, p0, LF3/e$d;->f:I

    .line 20
    .line 21
    const-string v2, "extra_messenger"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    new-instance v3, LF3/e$i;

    .line 30
    .line 31
    iget-object v4, p0, LF3/e$d;->c:Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {v3, v2, v4}, LF3/e$i;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, LF3/e$d;->g:LF3/e$i;

    .line 37
    .line 38
    new-instance v2, Landroid/os/Messenger;

    .line 39
    .line 40
    iget-object v4, p0, LF3/e$d;->d:LF3/e$a;

    .line 41
    .line 42
    invoke-direct {v2, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, LF3/e$d;->h:Landroid/os/Messenger;

    .line 46
    .line 47
    iget-object v4, p0, LF3/e$d;->d:LF3/e$a;

    .line 48
    .line 49
    invoke-virtual {v4, v2}, LF3/e$a;->a(Landroid/os/Messenger;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object v4, p0, LF3/e$d;->a:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, LF3/e$i;->a(Landroid/content/Context;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    const-string v2, "Remote error registering client messenger."

    .line 59
    .line 60
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    const-string v0, "extra_session_binder"

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, LF3/c$a;->c(Landroid/os/IBinder;)LF3/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget-object v1, p0, LF3/e$d;->b:Landroid/media/browse/MediaBrowser;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1, v0}, LF3/n$j;->b(Landroid/media/session/MediaSession$Token;LF3/c;)LF3/n$j;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, LF3/e$d;->i:LF3/n$j;

    .line 86
    .line 87
    :cond_2
    :goto_1
    return-void

    .line 88
    :catch_1
    move-exception v1

    .line 89
    const-string v2, "Unexpected IllegalStateException"

    .line 90
    .line 91
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 92
    .line 93
    .line 94
    return-void
.end method
