.class public LNc/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Ltb/a;

.field private c:LPc/a;

.field private d:Landroid/content/Context;

.field private e:LNc/a;

.field private f:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Landroid/content/Context;Ltb/a;Landroid/os/Handler;LPc/a;LNc/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LNc/b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LNc/b;-><init>(LNc/c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LNc/c;->f:Ljava/lang/Runnable;

    .line 10
    .line 11
    iput-object p1, p0, LNc/c;->d:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p3, p0, LNc/c;->a:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p2, p0, LNc/c;->b:Ltb/a;

    .line 16
    .line 17
    iput-object p4, p0, LNc/c;->c:LPc/a;

    .line 18
    .line 19
    iput-object p5, p0, LNc/c;->e:LNc/a;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(LNc/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LNc/c;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic b(LNc/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LNc/c;->d:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(LNc/c;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LNc/c;->a:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(LNc/c;)LPc/a;
    .locals 0

    .line 1
    iget-object p0, p0, LNc/c;->c:LPc/a;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(LNc/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LNc/c;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, LNc/c;->a:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LNc/c;->f:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LNc/c;->e:LNc/a;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, LNc/a;->D(LNc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private h()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-virtual {p0}, LNc/c;->g()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LNc/c;->c:LPc/a;

    .line 16
    .line 17
    invoke-static {v1}, LDc/c;->b(LPc/a;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "notification"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LNc/c;->b:Ltb/a;

    .line 27
    .line 28
    const-string v2, "onHandleNotificationTimeout"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Ltb/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, LNc/c;->f()V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LNc/c;->c:LPc/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LPc/a;->a()LPc/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LPc/g;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method i(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LUb/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, LNc/c;->a:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LNc/c$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, LNc/c$a;-><init>(LNc/c;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LUb/u;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method j()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-virtual {p0}, LNc/c;->g()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LNc/c;->c:LPc/a;

    .line 16
    .line 17
    invoke-static {v1}, LDc/c;->b(LPc/a;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "notification"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LNc/c;->b:Ltb/a;

    .line 27
    .line 28
    const-string v2, "onHandleNotification"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Ltb/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LNc/c;->a:Landroid/os/Handler;

    .line 34
    .line 35
    iget-object v1, p0, LNc/c;->f:Ljava/lang/Runnable;

    .line 36
    .line 37
    const-wide/16 v2, 0xbb8

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method k()V
    .locals 0

    .line 1
    invoke-direct {p0}, LNc/c;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
