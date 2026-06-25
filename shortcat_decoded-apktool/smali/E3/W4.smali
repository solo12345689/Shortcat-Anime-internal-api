.class public abstract LE3/W4;
.super Landroid/app/Service;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/W4$e;,
        LE3/W4$c;,
        LE3/W4$b;,
        LE3/W4$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/os/Handler;

.field private c:LE3/W4$e;

.field private d:LE3/g3;

.field private e:LE3/n;

.field private final f:Ljava/util/Map;

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

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
    iput-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LE3/W4;->b:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lt/a;

    .line 23
    .line 24
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LE3/W4;->f:Ljava/util/Map;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, LE3/W4;->g:Z

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(LE3/I3;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->f0()LE3/h3$g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LE3/W4;->g(Landroid/content/Intent;)LE3/h3$g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-virtual {p0, v0, p1}, LE3/I3;->B0(LE3/h3$g;Landroid/content/Intent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "MSessionService"

    .line 18
    .line 19
    const-string p1, "Ignored unrecognized media button intent."

    .line 20
    .line 21
    invoke-static {p0, p1}, Lt2/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public static synthetic b(LE3/W4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/W4;->i()LE3/W4$c;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(LE3/W4;LE3/h3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/W4;->j()LE3/g3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LE3/g3;->f(LE3/h3;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LE3/W4$d;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, LE3/W4$d;-><init>(LE3/W4;LE3/W4$a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, LE3/h3;->r(LE3/h3$h;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic d(LE3/W4;LE3/h3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/W4;->j()LE3/g3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, LE3/g3;->l(LE3/h3;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LE3/h3;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method static synthetic e(LE3/W4;)LE3/g3;
    .locals 0

    .line 1
    invoke-direct {p0}, LE3/W4;->j()LE3/g3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static g(Landroid/content/Intent;)LE3/h3$g;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "androidx.media3.session.MediaSessionService"

    .line 13
    .line 14
    :goto_0
    new-instance v0, LE3/h3$g;

    .line 15
    .line 16
    new-instance v1, LF3/q$b;

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    invoke-direct {v1, p0, v2, v2}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const v2, 0x3c14dd2c

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x7

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-direct/range {v0 .. v7}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method private h()LE3/n;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/W4;->e:LE3/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LE3/n;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LE3/n;-><init>(Landroid/app/Service;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LE3/W4;->e:LE3/n;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LE3/W4;->e:LE3/n;

    .line 13
    .line 14
    return-object v0
.end method

.method private i()LE3/W4$c;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    monitor-exit v0

    .line 6
    return-object v1

    .line 7
    :catchall_0
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw v1
.end method

.method private j()LE3/g3;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LE3/W4;->k(LE3/b3;)LE3/g3;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method private k(LE3/b3;)LE3/g3;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4;->d:LE3/g3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "Accessing service context before onCreate()"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lt2/a;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance p1, LE3/o$b;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p1, v0}, LE3/o$b;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, LE3/o$b;->e()LE3/o;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    new-instance v0, LE3/g3;

    .line 30
    .line 31
    invoke-direct {p0}, LE3/W4;->h()LE3/n;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, p0, p1, v1}, LE3/g3;-><init>(LE3/W4;LE3/b3;LE3/a3;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LE3/W4;->d:LE3/g3;

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, LE3/W4;->d:LE3/g3;

    .line 41
    .line 42
    return-object p1
.end method

.method private o()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LE3/U4;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LE3/U4;-><init>(LE3/W4;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(LE3/h3;)V
    .locals 4

    .line 1
    const-string v0, "session must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LE3/h3;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    xor-int/2addr v0, v1

    .line 12
    const-string v2, "session is already released"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    iget-object v2, p0, LE3/W4;->f:Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual {p1}, LE3/h3;->d()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LE3/h3;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    if-ne v2, p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :cond_1
    :goto_0
    const-string v3, "Session ID should be unique"

    .line 39
    .line 40
    invoke-static {v1, v3}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LE3/W4;->f:Ljava/util/Map;

    .line 44
    .line 45
    invoke-virtual {p1}, LE3/h3;->d()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-object v0, p0, LE3/W4;->b:Landroid/os/Handler;

    .line 56
    .line 57
    new-instance v1, LE3/T4;

    .line 58
    .line 59
    invoke-direct {v1, p0, p1}, LE3/T4;-><init>(LE3/W4;LE3/h3;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p1
.end method

.method l()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/W4;->c:LE3/W4$e;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE3/W4$e;

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/s$a;->asBinder()Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, LE3/W4;->f:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
.end method

.method public final n(LE3/h3;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/W4;->f:Ljava/util/Map;

    .line 5
    .line 6
    invoke-virtual {p1}, LE3/h3;->d()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    monitor-exit v0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    const-string v1, "androidx.media3.session.MediaSessionService"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    const-string v1, "android.media.browse.MediaBrowserService"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-static {}, LE3/h3$g;->a()LE3/h3$g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, LE3/W4;->p(LE3/h3$g;)LE3/h3;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_3
    invoke-virtual {p0, p1}, LE3/W4;->f(LE3/h3;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, LE3/h3;->f()Landroid/os/IBinder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_4
    invoke-virtual {p0}, LE3/W4;->l()Landroid/os/IBinder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE3/W4$e;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LE3/W4$e;-><init>(LE3/W4;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/W4;->c:LE3/W4$e;

    .line 10
    .line 11
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE3/W4;->c:LE3/W4$e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LE3/W4$e;->G3()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LE3/W4;->c:LE3/W4$e;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .line 1
    const/4 p2, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p2

    .line 5
    :cond_0
    invoke-direct {p0}, LE3/W4;->h()LE3/n;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, LE3/h3;->k(Landroid/net/Uri;)LE3/h3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p3, p1}, LE3/n;->e(Landroid/content/Intent;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    invoke-static {}, LE3/h3$g;->a()LE3/h3$g;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, p3}, LE3/W4;->p(LE3/h3$g;)LE3/h3;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    return p2

    .line 40
    :cond_2
    invoke-virtual {p0, v0}, LE3/W4;->f(LE3/h3;)V

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-virtual {v0}, LE3/h3;->e()LE3/I3;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p3}, LE3/I3;->X()Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, LE3/S4;

    .line 52
    .line 53
    invoke-direct {v1, p3, p1}, LE3/S4;-><init>(LE3/I3;Landroid/content/Intent;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    if-eqz v0, :cond_6

    .line 61
    .line 62
    invoke-virtual {p3, p1}, LE3/n;->d(Landroid/content/Intent;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    invoke-virtual {p3, p1}, LE3/n;->a(Landroid/content/Intent;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    return p2

    .line 75
    :cond_5
    invoke-virtual {p3, p1}, LE3/n;->b(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0}, LE3/W4;->j()LE3/g3;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3, v0, v1, p1}, LE3/g3;->j(LE3/h3;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    :goto_1
    return p2
.end method

.method public abstract p(LE3/h3$g;)LE3/h3;
.end method

.method public abstract q(LE3/h3;Z)V
.end method

.method r(LE3/h3;Z)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, LE3/W4;->j()LE3/g3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, LE3/g3;->n(Z)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, LE3/W4;->q(LE3/h3;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v0, 0x1f

    .line 18
    .line 19
    if-lt p2, v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, LE3/W4$b;->a(Ljava/lang/IllegalStateException;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, "MSessionService"

    .line 28
    .line 29
    const-string v0, "Failed to start foreground"

    .line 30
    .line 31
    invoke-static {p2, v0, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, LE3/W4;->o()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_0
    throw p1
.end method

.method public final s(LE3/h3;)V
    .locals 3

    .line 1
    const-string v0, "session must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE3/W4;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LE3/W4;->f:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {p1}, LE3/h3;->d()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "session not found"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LE3/W4;->f:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {p1}, LE3/h3;->d()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iget-object v0, p0, LE3/W4;->b:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v1, LE3/V4;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1}, LE3/V4;-><init>(LE3/W4;LE3/h3;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method
