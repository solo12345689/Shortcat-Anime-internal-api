.class public Lcom/facebook/react/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Lcom/facebook/react/W;

.field private final c:Ljava/lang/String;

.field private d:Landroid/os/Bundle;

.field private e:Lcom/facebook/react/devsupport/d0;

.field private f:Lcom/facebook/react/N;

.field private g:Lcom/facebook/react/ReactHost;

.field private h:Lf7/a;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/react/N;Ljava/lang/String;Landroid/os/Bundle;Z)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-static {}, Lh7/i;->b()Z

    .line 10
    iput-boolean p5, p0, Lcom/facebook/react/w;->i:Z

    .line 11
    iput-object p1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 12
    iput-object p3, p0, Lcom/facebook/react/w;->c:Ljava/lang/String;

    .line 13
    iput-object p4, p0, Lcom/facebook/react/w;->d:Landroid/os/Bundle;

    .line 14
    new-instance p1, Lcom/facebook/react/devsupport/d0;

    invoke-direct {p1}, Lcom/facebook/react/devsupport/d0;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/w;->e:Lcom/facebook/react/devsupport/d0;

    .line 15
    iput-object p2, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/react/ReactHost;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lh7/i;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/react/w;->i:Z

    .line 3
    iput-object p1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 4
    iput-object p3, p0, Lcom/facebook/react/w;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/facebook/react/w;->d:Landroid/os/Bundle;

    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/d0;

    invoke-direct {p1}, Lcom/facebook/react/devsupport/d0;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/w;->e:Lcom/facebook/react/devsupport/d0;

    .line 7
    iput-object p2, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/w;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/w;->t(Lcom/facebook/react/w;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d()Lc7/f;
    .locals 3

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/facebook/react/ReactHost;->getDevSupportManager()Lc7/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/facebook/react/ReactHost;->getDevSupportManager()Lc7/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :cond_1
    return-object v1

    .line 30
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v0, v2, :cond_4

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, v1

    .line 51
    :goto_1
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/facebook/react/H;->C()Lc7/f;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :cond_4
    return-object v1
.end method

.method private static final t(Lcom/facebook/react/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/facebook/react/H;->g0()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method


# virtual methods
.method protected b()Lcom/facebook/react/W;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/W;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/facebook/react/W;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/facebook/react/w;->i:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/facebook/react/W;->setIsFabric(Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final c()Lcom/facebook/react/bridge/ReactContext;
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/facebook/react/ReactHost;->getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    return-object v1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/w;->e()Lcom/facebook/react/H;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/facebook/react/H;->B()Lcom/facebook/react/bridge/ReactContext;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final e()Lcom/facebook/react/H;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getReactInstanceManager(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "Cannot get ReactInstanceManager without a ReactNativeHost."

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public final f()Lcom/facebook/react/W;
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lf7/a;->a()Landroid/view/ViewGroup;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    check-cast v1, Lcom/facebook/react/W;

    .line 19
    .line 20
    :cond_1
    return-object v1

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 22
    .line 23
    return-object v0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "appKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh7/i;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/facebook/react/w;->d:Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-interface {v0, v1, p1, v2}, Lcom/facebook/react/ReactHost;->createSurface(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lf7/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, Lf7/a;->start()Le7/a;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/react/w;->b()Lcom/facebook/react/W;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v1, 0x0

    .line 62
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/w;->d:Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-virtual {v0, v1, p1, v2}, Lcom/facebook/react/W;->u(Lcom/facebook/react/H;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void

    .line 68
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v0, "Cannot loadApp while app is already running."

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method public final h(IILandroid/content/Intent;Z)V
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p4, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-interface {v0, p4, p1, p2, p3}, Lcom/facebook/react/ReactHost;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    if-eqz p4, :cond_1

    .line 33
    .line 34
    iget-object p4, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 35
    .line 36
    if-eqz p4, :cond_1

    .line 37
    .line 38
    invoke-virtual {p4}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 45
    .line 46
    invoke-virtual {p4, v0, p1, p2, p3}, Lcom/facebook/react/H;->R(Landroid/app/Activity;IILandroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/facebook/react/ReactHost;->onBackPressed()Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return v1

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/facebook/react/H;->S()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return v1

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method public final j(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Required value was null."

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/facebook/react/ReactHost;->onConfigurationChanged(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    return-void

    .line 30
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v0, v2, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/facebook/react/w;->e()Lcom/facebook/react/H;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v2, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0, v2, p1}, Lcom/facebook/react/H;->T(Landroid/content/Context;Landroid/content/res/Configuration;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_4
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/w;->x()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh7/i;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/ReactHost;->onHostDestroy(Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->V(Landroid/app/Activity;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/facebook/react/ReactHost;->onHostPause(Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->X(Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 2
    .line 3
    instance-of v0, v0, Lq7/a;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lh7/i;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object v1, v2

    .line 27
    check-cast v1, Lq7/a;

    .line 28
    .line 29
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/ReactHost;->onHostResume(Landroid/app/Activity;Lq7/a;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x1

    .line 42
    if-ne v0, v2, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v2, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 55
    .line 56
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object v1, v2

    .line 60
    check-cast v1, Lq7/a;

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/H;->Z(Landroid/app/Activity;Lq7/a;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v3, "Host Activity `"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, "` does not implement DefaultHardwareBackBtnHandler"

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0
.end method

.method public final n(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x5a

    .line 7
    .line 8
    if-ne p1, v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, Lh7/i;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/facebook/react/ReactHost;->getDevSupportManager()Lc7/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    if-nez p1, :cond_2

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/facebook/react/N;->g()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v0, :cond_3

    .line 38
    .line 39
    iget-object p1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/facebook/react/N;->f()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    .line 50
    .line 51
    .line 52
    return v0

    .line 53
    :cond_3
    const/4 p1, 0x0

    .line 54
    return p1
.end method

.method public final o(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0x5a

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-static {}, Lh7/i;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/facebook/react/ReactHost;->getDevSupportManager()Lc7/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-eqz p1, :cond_4

    .line 29
    .line 30
    instance-of v1, p1, Lcom/facebook/react/devsupport/C0;

    .line 31
    .line 32
    if-nez v1, :cond_4

    .line 33
    .line 34
    invoke-interface {p1}, Lc7/f;->F()V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/facebook/react/N;->g()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    iget-object p1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/facebook/react/N;->f()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v0, :cond_4

    .line 57
    .line 58
    iget-object p1, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/facebook/react/H;->o0()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return v0

    .line 72
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 73
    return p1
.end method

.method public final p(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh7/i;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/facebook/react/ReactHost;->onNewIntent(Landroid/content/Intent;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return v1

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/facebook/react/H;->b0(Landroid/content/Intent;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return v1

    .line 47
    :cond_3
    const/4 p1, 0x0

    .line 48
    return p1
.end method

.method public final q()V
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/facebook/react/ReactHost;->onHostLeaveHint(Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->c0(Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/facebook/react/ReactHost;->onWindowFocusChange(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/facebook/react/N;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/w;->f:Lcom/facebook/react/N;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/N;->c()Lcom/facebook/react/H;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/facebook/react/H;->d0(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/w;->d()Lc7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/devsupport/C0;

    .line 9
    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    invoke-static {}, Lh7/i;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/w;->g:Lcom/facebook/react/ReactHost;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string v1, "ReactDelegate.reload()"

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/facebook/react/ReactHost;->reload(Ljava/lang/String;)Le7/a;

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void

    .line 28
    :cond_2
    new-instance v0, Lcom/facebook/react/v;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/facebook/react/v;-><init>(Lcom/facebook/react/w;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_3
    invoke-interface {v0}, Lc7/f;->B()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final u(Lcom/facebook/react/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Lf7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 2
    .line 3
    return-void
.end method

.method public final w(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/w;->d()Lc7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p2, :cond_3

    .line 7
    .line 8
    invoke-interface {p2}, Lc7/f;->o()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    instance-of v1, p2, Lcom/facebook/react/devsupport/C0;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v1, 0x52

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p2}, Lc7/f;->F()V

    .line 25
    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/facebook/react/w;->e:Lcom/facebook/react/devsupport/d0;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/react/w;->a:Landroid/app/Activity;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, p1, v3}, Lcom/facebook/react/devsupport/d0;->b(ILandroid/view/View;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p1, 0x0

    .line 48
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-interface {p2}, Lc7/f;->B()V

    .line 57
    .line 58
    .line 59
    return v2

    .line 60
    :cond_3
    :goto_1
    return v0
.end method

.method public final x()V
    .locals 2

    .line 1
    invoke-static {}, Lh7/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lf7/a;->stop()Le7/a;

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object v1, p0, Lcom/facebook/react/w;->h:Lf7/a;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/facebook/react/W;->v()V

    .line 25
    .line 26
    .line 27
    :cond_2
    iput-object v1, p0, Lcom/facebook/react/w;->b:Lcom/facebook/react/W;

    .line 28
    .line 29
    :cond_3
    return-void
.end method
