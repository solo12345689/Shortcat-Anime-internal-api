.class Landroidx/fragment/app/Y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/h;
.implements LP3/i;
.implements Landroidx/lifecycle/Y;


# instance fields
.field private final a:Landroidx/fragment/app/q;

.field private final b:Landroidx/lifecycle/X;

.field private final c:Ljava/lang/Runnable;

.field private d:Landroidx/lifecycle/W$c;

.field private e:Landroidx/lifecycle/t;

.field private f:LP3/h;


# direct methods
.method constructor <init>(Landroidx/fragment/app/q;Landroidx/lifecycle/X;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/fragment/app/Y;->f:LP3/h;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/fragment/app/Y;->b:Landroidx/lifecycle/X;

    .line 12
    .line 13
    iput-object p3, p0, Landroidx/fragment/app/Y;->c:Ljava/lang/Runnable;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/k$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->g(Landroidx/lifecycle/k$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/t;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 11
    .line 12
    invoke-static {p0}, LP3/h;->a(LP3/i;)LP3/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Landroidx/fragment/app/Y;->f:LP3/h;

    .line 17
    .line 18
    invoke-virtual {v0}, LP3/h;->c()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/fragment/app/Y;->c:Ljava/lang/Runnable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method d(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->f:LP3/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP3/h;->d(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->f:LP3/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP3/h;->e(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method f(Landroidx/lifecycle/k$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->l(Landroidx/lifecycle/k$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getDefaultViewModelCreationExtras()Lm2/a;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_1
    new-instance v1, Lm2/b;

    .line 31
    .line 32
    invoke-direct {v1}, Lm2/b;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v2, Landroidx/lifecycle/W$a;->e:Lm2/a$c;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Lm2/b;->c(Lm2/a$c;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    sget-object v0, Landroidx/lifecycle/L;->a:Lm2/a$c;

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lm2/b;->c(Lm2/a$c;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Landroidx/lifecycle/L;->b:Lm2/a$c;

    .line 50
    .line 51
    invoke-virtual {v1, v0, p0}, Lm2/b;->c(Lm2/a$c;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    sget-object v0, Landroidx/lifecycle/L;->c:Lm2/a$c;

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v0, v2}, Lm2/b;->c(Lm2/a$c;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-object v1
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/W$c;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/q;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/W$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/fragment/app/q;->mDefaultFactory:Landroidx/lifecycle/W$c;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/Y;->d:Landroidx/lifecycle/W$c;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Y;->d:Landroidx/lifecycle/W$c;

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    instance-of v1, v0, Landroid/app/Application;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Landroid/app/Application;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v0, 0x0

    .line 53
    :goto_1
    new-instance v1, Landroidx/lifecycle/P;

    .line 54
    .line 55
    iget-object v2, p0, Landroidx/fragment/app/Y;->a:Landroidx/fragment/app/q;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-direct {v1, v0, v2, v3}, Landroidx/lifecycle/P;-><init>(Landroid/app/Application;LP3/i;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Landroidx/fragment/app/Y;->d:Landroidx/lifecycle/W$c;

    .line 65
    .line 66
    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/Y;->d:Landroidx/lifecycle/W$c;

    .line 67
    .line 68
    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Y;->e:Landroidx/lifecycle/t;

    .line 5
    .line 6
    return-object v0
.end method

.method public getSavedStateRegistry()LP3/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Y;->f:LP3/h;

    .line 5
    .line 6
    invoke-virtual {v0}, LP3/h;->b()LP3/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/X;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Y;->b:Landroidx/lifecycle/X;

    .line 5
    .line 6
    return-object v0
.end method
