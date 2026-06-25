.class public final Lud/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lud/a;


# instance fields
.field private final a:Lxd/g;

.field private b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lxd/g;)V
    .locals 1

    .line 1
    const-string v0, "logger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lud/c;->a:Lxd/g;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lud/c;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-void
.end method

.method public b(LCd/b;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lud/c;->a:Lxd/g;

    .line 7
    .line 8
    const-string v1, "Sending state machine context to observer"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-static {v0, v1, v2, v3, v2}, Lxd/g;->e(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lud/c;->c()Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lud/b;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lud/b;->b(LCd/b;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lud/c;->a:Lxd/g;

    .line 34
    .line 35
    const-string v0, "Sent state machine context to observer"

    .line 36
    .line 37
    invoke-static {p1, v0, v2, v3, v2}, Lxd/g;->e(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p1

    .line 42
    iget-object v0, p0, Lud/c;->a:Lxd/g;

    .line 43
    .line 44
    const-string v1, "Could not send state machine context to observer"

    .line 45
    .line 46
    sget-object v2, Lxd/b;->j:Lxd/b;

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    :goto_0
    iget-object p1, p0, Lud/c;->a:Lxd/g;

    .line 53
    .line 54
    const-string v0, "Unable to send state machine context to observer, no observer"

    .line 55
    .line 56
    sget-object v1, Lxd/b;->j:Lxd/b;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lxd/g;->c(Ljava/lang/String;Lxd/b;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public c()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/c;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method
