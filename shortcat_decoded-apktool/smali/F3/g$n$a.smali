.class LF3/g$n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g$n;->a(Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;LF3/g$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF3/g$o;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/os/IBinder;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:LF3/g$n;


# direct methods
.method constructor <init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$n$a;->e:LF3/g$n;

    .line 2
    .line 3
    iput-object p2, p0, LF3/g$n$a;->a:LF3/g$o;

    .line 4
    .line 5
    iput-object p3, p0, LF3/g$n$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LF3/g$n$a;->c:Landroid/os/IBinder;

    .line 8
    .line 9
    iput-object p5, p0, LF3/g$n$a;->d:Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, LF3/g$n$a;->a:LF3/g$o;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/g$o;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LF3/g$n$a;->e:LF3/g$n;

    .line 8
    .line 9
    iget-object v1, v1, LF3/g$n;->a:LF3/g;

    .line 10
    .line 11
    iget-object v1, v1, LF3/g;->e:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LF3/g$f;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "addSubscription for callback that isn\'t registered id="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LF3/g$n$a;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "MBServiceCompat"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object v1, p0, LF3/g$n$a;->e:LF3/g$n;

    .line 47
    .line 48
    iget-object v1, v1, LF3/g$n;->a:LF3/g;

    .line 49
    .line 50
    iget-object v2, p0, LF3/g$n$a;->b:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, p0, LF3/g$n$a;->c:Landroid/os/IBinder;

    .line 53
    .line 54
    iget-object v4, p0, LF3/g$n$a;->d:Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v0, v3, v4}, LF3/g;->a(Ljava/lang/String;LF3/g$f;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
