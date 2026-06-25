.class public final LC2/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/i$f;,
        LC2/i$c;,
        LC2/i$e;,
        LC2/i$d;,
        LC2/i$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LC2/i$f;

.field private final c:Landroid/os/Handler;

.field private final d:LC2/i$c;

.field private final e:Landroid/content/BroadcastReceiver;

.field private final f:LC2/i$d;

.field private g:LC2/e;

.field private h:LC2/j;

.field private i:Lq2/c;

.field private j:Z


# direct methods
.method constructor <init>(Landroid/content/Context;LC2/i$f;Lq2/c;LC2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LC2/i;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, LC2/i$f;

    .line 15
    .line 16
    iput-object p2, p0, LC2/i;->b:LC2/i$f;

    .line 17
    .line 18
    iput-object p3, p0, LC2/i;->i:Lq2/c;

    .line 19
    .line 20
    iput-object p4, p0, LC2/i;->h:LC2/j;

    .line 21
    .line 22
    invoke-static {}, Lt2/a0;->E()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, LC2/i;->c:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance p3, LC2/i$c;

    .line 29
    .line 30
    const/4 p4, 0x0

    .line 31
    invoke-direct {p3, p0, p4}, LC2/i$c;-><init>(LC2/i;LC2/i$a;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, LC2/i;->d:LC2/i$c;

    .line 35
    .line 36
    new-instance p3, LC2/i$e;

    .line 37
    .line 38
    invoke-direct {p3, p0, p4}, LC2/i$e;-><init>(LC2/i;LC2/i$a;)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, LC2/i;->e:Landroid/content/BroadcastReceiver;

    .line 42
    .line 43
    invoke-static {}, LC2/e;->i()Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_0

    .line 48
    .line 49
    new-instance p4, LC2/i$d;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p4, p0, p2, p1, p3}, LC2/i$d;-><init>(LC2/i;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iput-object p4, p0, LC2/i;->f:LC2/i$d;

    .line 59
    .line 60
    return-void
.end method

.method static synthetic a(LC2/i;)Lq2/c;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/i;->i:Lq2/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LC2/i;)LC2/j;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/i;->h:LC2/j;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LC2/i;LC2/j;)LC2/j;
    .locals 0

    .line 1
    iput-object p1, p0, LC2/i;->h:LC2/j;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic d(LC2/i;LC2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC2/i;->f(LC2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic e(LC2/i;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method private f(LC2/e;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LC2/i;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LC2/i;->g:LC2/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LC2/e;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, LC2/i;->g:LC2/e;

    .line 14
    .line 15
    iget-object v0, p0, LC2/i;->b:LC2/i$f;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LC2/i$f;->a(LC2/e;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public g(LC2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC2/i;->f(LC2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public h()LC2/e;
    .locals 5

    .line 1
    iget-boolean v0, p0, LC2/i;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LC2/i;->g:LC2/e;

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LC2/e;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LC2/i;->j:Z

    .line 16
    .line 17
    iget-object v0, p0, LC2/i;->f:LC2/i$d;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, LC2/i$d;->a()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, LC2/i;->d:LC2/i$c;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, LC2/i;->a:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v2, p0, LC2/i;->c:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {v1, v0, v2}, LC2/i$b;->a(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, LC2/i;->a:Landroid/content/Context;

    .line 36
    .line 37
    iget-object v1, p0, LC2/i;->e:Landroid/content/BroadcastReceiver;

    .line 38
    .line 39
    new-instance v2, Landroid/content/IntentFilter;

    .line 40
    .line 41
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 42
    .line 43
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iget-object v4, p0, LC2/i;->c:Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, LC2/i;->a:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v2, p0, LC2/i;->i:Lq2/c;

    .line 56
    .line 57
    iget-object v3, p0, LC2/i;->h:LC2/j;

    .line 58
    .line 59
    invoke-static {v1, v0, v2, v3}, LC2/e;->e(Landroid/content/Context;Landroid/content/Intent;Lq2/c;LC2/j;)LC2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, LC2/i;->g:LC2/e;

    .line 64
    .line 65
    return-object v0
.end method

.method public i(Lq2/c;)V
    .locals 2

    .line 1
    iput-object p1, p0, LC2/i;->i:Lq2/c;

    .line 2
    .line 3
    iget-object v0, p0, LC2/i;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LC2/i;->h:LC2/j;

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, LC2/e;->f(Landroid/content/Context;Lq2/c;LC2/j;)LC2/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, LC2/i;->f(LC2/e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public j(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/i;->h:LC2/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, LC2/j;->a:Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    :goto_0
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    new-instance v1, LC2/j;

    .line 20
    .line 21
    invoke-direct {v1, p1}, LC2/j;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    iput-object v1, p0, LC2/i;->h:LC2/j;

    .line 25
    .line 26
    iget-object p1, p0, LC2/i;->a:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v0, p0, LC2/i;->i:Lq2/c;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, LC2/e;->f(Landroid/content/Context;Lq2/c;LC2/j;)LC2/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, LC2/i;->f(LC2/e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/i;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, LC2/i;->g:LC2/e;

    .line 8
    .line 9
    iget-object v0, p0, LC2/i;->d:LC2/i$c;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, LC2/i;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v1, v0}, LC2/i$b;->b(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, LC2/i;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v1, p0, LC2/i;->e:Landroid/content/BroadcastReceiver;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LC2/i;->f:LC2/i$d;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, LC2/i$d;->b()V

    .line 30
    .line 31
    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, LC2/i;->j:Z

    .line 34
    .line 35
    return-void
.end method
