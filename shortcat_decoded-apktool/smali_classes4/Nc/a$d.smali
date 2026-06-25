.class public final LNc/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNc/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LNc/a;

.field final synthetic b:Lgc/d;


# direct methods
.method public constructor <init>(LNc/a;Lgc/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LNc/a$d;->a:LNc/a;

    .line 2
    .line 3
    iput-object p2, p0, LNc/a$d;->b:Lgc/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, LDc/b;->a:LDc/b;

    .line 2
    .line 3
    iget-object v1, p0, LNc/a$d;->a:LNc/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LDc/b;->a(LOc/c;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LNc/a$d;->a:LNc/a;

    .line 9
    .line 10
    new-instance v1, Landroid/os/HandlerThread;

    .line 11
    .line 12
    iget-object v2, p0, LNc/a$d;->b:Lgc/d;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v4, "NotificationsHandlerThread - "

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, LNc/a;->B(LNc/a;Landroid/os/HandlerThread;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LNc/a$d;->a:LNc/a;

    .line 42
    .line 43
    invoke-static {v0}, LNc/a;->x(LNc/a;)Landroid/os/HandlerThread;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    const-string v2, "notificationsHandlerThread"

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LNc/a$d;->a:LNc/a;

    .line 60
    .line 61
    new-instance v3, Landroid/os/Handler;

    .line 62
    .line 63
    iget-object v4, p0, LNc/a$d;->a:LNc/a;

    .line 64
    .line 65
    invoke-static {v4}, LNc/a;->x(LNc/a;)Landroid/os/HandlerThread;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    invoke-static {v2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v4

    .line 76
    :goto_0
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, LNc/a;->A(LNc/a;Landroid/os/Handler;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LNc/a$d;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
