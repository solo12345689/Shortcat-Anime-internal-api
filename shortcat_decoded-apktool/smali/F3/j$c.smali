.class LF3/j$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF3/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/j$c$b;,
        LF3/j$c$a;
    }
.end annotation


# instance fields
.field protected final a:Landroid/media/session/MediaController;

.field final b:Ljava/lang/Object;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/HashMap;

.field final e:LF3/n$j;


# direct methods
.method constructor <init>(Landroid/content/Context;LF3/n$j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LF3/j$c;->b:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LF3/j$c;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LF3/j$c;->d:Ljava/util/HashMap;

    .line 24
    .line 25
    iput-object p2, p0, LF3/j$c;->e:LF3/n$j;

    .line 26
    .line 27
    new-instance v0, Landroid/media/session/MediaController;

    .line 28
    .line 29
    invoke-virtual {p2}, LF3/n$j;->e()Landroid/media/session/MediaSession$Token;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 37
    .line 38
    invoke-virtual {p2}, LF3/n$j;->c()LF3/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    invoke-direct {p0}, LF3/j$c;->m()V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 1
    new-instance v0, LF3/j$c$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF3/j$c$a;-><init>(LF3/j$c;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v1, v2, v0}, LF3/j$c;->d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public A()I
    .locals 3

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, LF3/c;->A()I

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    :goto_0
    const-string v1, "MediaControllerCompat"

    .line 18
    .line 19
    const-string v2, "Dead object in getShuffleMode."

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, -0x1

    .line 25
    return v0
.end method

.method public B()Z
    .locals 3

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, LF3/c;->B()Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    :goto_0
    const-string v1, "MediaControllerCompat"

    .line 18
    .line 19
    const-string v2, "Dead object in isCaptioningEnabled."

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public E()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getQueueTitle()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public G()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getQueue()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LF3/n$h;->b(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public H(LF3/l;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LF3/j$c;->w()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x4

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    invoke-static {p1, v1}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    const-string p1, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p0, p1, v0, v1}, LF3/j$c;->d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 38
    .line 39
    const-string v0, "This session doesn\'t support queue management operations"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public a()LF3/j$e;
    .locals 7

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, LF3/j$e;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, LF3/a;->f(Ljava/lang/Object;)LF3/a;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct/range {v1 .. v6}, LF3/j$e;-><init>(ILF3/a;III)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method public final b(LF3/j$a;Landroid/os/Handler;)V
    .locals 4

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    iget-object v1, p1, LF3/j$a;->a:Landroid/media/session/MediaController$Callback;

    .line 4
    .line 5
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/media/session/MediaController$Callback;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p2}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, LF3/j$c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 18
    .line 19
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, LF3/j$c$b;

    .line 27
    .line 28
    invoke-direct {v2, p1}, LF3/j$c$b;-><init>(LF3/j$a;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, LF3/j$c;->d:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iput-object v2, p1, LF3/j$a;->c:LF3/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    :try_start_1
    invoke-interface {v0, v2}, LF3/c;->n1(LF3/b;)V

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xd

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, v1}, LF3/j$a;->m(ILjava/lang/Object;Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto :goto_0

    .line 51
    :catch_1
    move-exception p1

    .line 52
    :goto_0
    :try_start_2
    const-string v0, "MediaControllerCompat"

    .line 53
    .line 54
    const-string v1, "Dead object in registerCallback."

    .line 55
    .line 56
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    iput-object v1, p1, LF3/j$a;->c:LF3/b;

    .line 61
    .line 62
    iget-object v0, p0, LF3/j$c;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :goto_1
    monitor-exit p2

    .line 68
    return-void

    .line 69
    :goto_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    throw p1
.end method

.method public final c(LF3/j$a;)V
    .locals 4

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    iget-object v1, p1, LF3/j$a;->a:Landroid/media/session/MediaController$Callback;

    .line 4
    .line 5
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/media/session/MediaController$Callback;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LF3/j$c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, LF3/j$c;->e:LF3/n$j;

    .line 18
    .line 19
    invoke-virtual {v1}, LF3/n$j;->c()LF3/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    :try_start_1
    iget-object v2, p0, LF3/j$c;->d:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, LF3/j$c$b;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput-object v3, p1, LF3/j$a;->c:LF3/b;

    .line 37
    .line 38
    invoke-interface {v1, v2}, LF3/c;->M0(LF3/b;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :catch_1
    move-exception p1

    .line 47
    :goto_0
    :try_start_2
    const-string v1, "MediaControllerCompat"

    .line 48
    .line 49
    const-string v2, "Dead object in unregisterCallback."

    .line 50
    .line 51
    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    iget-object v1, p0, LF3/j$c;->c:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_1
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1
.end method

.method public d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()LF3/j$f;
    .locals 3

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x1d

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v1, LF3/j$j;

    .line 14
    .line 15
    invoke-direct {v1, v0}, LF3/j$j;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    new-instance v1, LF3/j$i;

    .line 20
    .line 21
    invoke-direct {v1, v0}, LF3/j$i;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public f(LF3/l;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LF3/j$c;->w()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x4

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    invoke-static {p1, v1}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    const-string p1, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const-string p1, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p0, p1, v0, p2}, LF3/j$c;->d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 43
    .line 44
    const-string p2, "This session doesn\'t support queue management operations"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public g(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/session/MediaController;->adjustVolume(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getMetadata()LF3/m;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LF3/m;->b(Ljava/lang/Object;)LF3/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public h(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public i(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/session/MediaController;->setVolumeTo(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    return-object v0
.end method

.method l()V
    .locals 5

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, LF3/j$c;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LF3/j$a;

    .line 27
    .line 28
    new-instance v3, LF3/j$c$b;

    .line 29
    .line 30
    invoke-direct {v3, v2}, LF3/j$c$b;-><init>(LF3/j$a;)V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, LF3/j$c;->d:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iput-object v3, v2, LF3/j$a;->c:LF3/b;

    .line 39
    .line 40
    :try_start_0
    invoke-interface {v0, v3}, LF3/c;->n1(LF3/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    const/16 v3, 0xd

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v2, v3, v4, v4}, LF3/j$a;->m(ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    goto :goto_1

    .line 52
    :catch_1
    move-exception v0

    .line 53
    :goto_1
    const-string v1, "MediaControllerCompat"

    .line 54
    .line 55
    const-string v2, "Dead object in registerCallback."

    .line 56
    .line 57
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object v0, p0, LF3/j$c;->c:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public p()LF3/v;
    .locals 3

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, LF3/c;->p()LF3/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    :goto_0
    const-string v1, "MediaControllerCompat"

    .line 18
    .line 19
    const-string v2, "Dead object in getPlaybackState."

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {v0}, LF3/v;->a(Landroid/media/session/PlaybackState;)LF3/v;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_1
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public w()J
    .locals 2

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getFlags()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public x()I
    .locals 3

    .line 1
    iget-object v0, p0, LF3/j$c;->e:LF3/n$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/n$j;->c()LF3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, LF3/c;->x()I

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    :goto_0
    const-string v1, "MediaControllerCompat"

    .line 18
    .line 19
    const-string v2, "Dead object in getRepeatMode."

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, -0x1

    .line 25
    return v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$c;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getRatingType()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
