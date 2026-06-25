.class Lr/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/h$b;,
        Lr/h$c;
    }
.end annotation


# instance fields
.field private final a:Lr/h$c;

.field private b:Landroid/os/CancellationSignal;

.field private c:LG1/d;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr/h$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lr/h$a;-><init>(Lr/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr/h;->a:Lr/h$c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/h;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "CancelSignalProvider"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-static {v0}, Lr/h$b;->a(Landroid/os/CancellationSignal;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    const-string v3, "Got NPE while canceling biometric authentication."

    .line 14
    .line 15
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    :goto_0
    iput-object v1, p0, Lr/h;->b:Landroid/os/CancellationSignal;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lr/h;->c:LG1/d;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {v0}, LG1/d;->a()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catch_1
    move-exception v0

    .line 29
    const-string v3, "Got NPE while canceling fingerprint authentication."

    .line 30
    .line 31
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    :goto_1
    iput-object v1, p0, Lr/h;->c:LG1/d;

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method b()Landroid/os/CancellationSignal;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/h;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/h;->a:Lr/h$c;

    .line 6
    .line 7
    invoke-interface {v0}, Lr/h$c;->b()Landroid/os/CancellationSignal;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lr/h;->b:Landroid/os/CancellationSignal;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lr/h;->b:Landroid/os/CancellationSignal;

    .line 14
    .line 15
    return-object v0
.end method

.method c()LG1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/h;->c:LG1/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/h;->a:Lr/h$c;

    .line 6
    .line 7
    invoke-interface {v0}, Lr/h$c;->a()LG1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lr/h;->c:LG1/d;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lr/h;->c:LG1/d;

    .line 14
    .line 15
    return-object v0
.end method
