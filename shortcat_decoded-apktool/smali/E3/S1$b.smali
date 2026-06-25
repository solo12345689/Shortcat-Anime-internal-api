.class LE3/S1$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/S1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field final synthetic b:LE3/S1;


# direct methods
.method public constructor <init>(LE3/S1;Landroid/os/Looper;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE3/S1$b;->b:LE3/S1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, LE3/T1;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LE3/T1;-><init>(LE3/S1$b;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LE3/S1$b;->a:Landroid/os/Handler;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(LE3/S1$b;Landroid/os/Message;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/S1$b;->c(Landroid/os/Message;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private b()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LE3/S1$b;->b:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->Z2(LE3/S1;)LE3/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LE3/S1$b;->b:LE3/S1;

    .line 8
    .line 9
    iget-object v1, v1, LE3/S1;->c:LE3/X2;

    .line 10
    .line 11
    invoke-interface {v0, v1}, LE3/r;->N0(LE3/q;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    const-string v0, "MCImplBase"

    .line 16
    .line 17
    const-string v1, "Error in sending flushCommandQueue"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private c(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, LE3/S1$b;->b()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return v0
.end method


# virtual methods
.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1$b;->a:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, LE3/S1$b;->b()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LE3/S1$b;->a:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1$b;->b:LE3/S1;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->Z2(LE3/S1;)LE3/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE3/S1$b;->a:Landroid/os/Handler;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, LE3/S1$b;->a:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
