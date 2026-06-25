.class final LM9/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:LM9/t;


# direct methods
.method synthetic constructor <init>(LM9/t;LM9/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM9/s;->a:LM9/t;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM9/s;->a:LM9/t;

    .line 2
    .line 3
    invoke-static {v0}, LM9/t;->f(LM9/t;)LM9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, LM9/i;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LM9/s;->a:LM9/t;

    .line 17
    .line 18
    new-instance v0, LM9/p;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2}, LM9/p;-><init>(LM9/s;Landroid/os/IBinder;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LM9/t;->c()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM9/s;->a:LM9/t;

    .line 2
    .line 3
    invoke-static {v0}, LM9/t;->f(LM9/t;)LM9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, LM9/i;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LM9/s;->a:LM9/t;

    .line 17
    .line 18
    new-instance v0, LM9/q;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LM9/q;-><init>(LM9/s;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LM9/t;->c()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method
