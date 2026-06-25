.class Landroidx/fragment/app/v$a;
.super Landroidx/fragment/app/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly1/d;
.implements Ly1/e;
.implements Landroidx/core/app/r;
.implements Landroidx/core/app/s;
.implements Landroidx/lifecycle/Y;
.implements Landroidx/activity/K;
.implements Lg/g;
.implements LP3/i;
.implements Landroidx/fragment/app/O;
.implements Landroidx/core/view/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic f:Landroidx/fragment/app/v;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/fragment/app/A;-><init>(Landroidx/fragment/app/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/K;Landroidx/fragment/app/q;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/fragment/app/v;->H(Landroidx/fragment/app/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addMenuProvider(Landroidx/core/view/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addMenuProvider(Landroidx/core/view/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnConfigurationChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnConfigurationChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnMultiWindowModeChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnMultiWindowModeChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnPictureInPictureModeChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnPictureInPictureModeChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnTrimMemoryListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnTrimMemoryListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getActivityResultRegistry()Lg/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getActivityResultRegistry()Lg/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/v;->b:Landroidx/lifecycle/t;

    .line 4
    .line 5
    return-object v0
.end method

.method public getOnBackPressedDispatcher()Landroidx/activity/H;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getOnBackPressedDispatcher()Landroidx/activity/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSavedStateRegistry()LP3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getSavedStateRegistry()LP3/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/X;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getViewModelStore()Landroidx/lifecycle/X;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/v;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic j()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/v$a;->r()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public m(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/core/app/b;->u(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public p()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/v$a;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->invalidateMenu()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r()Landroidx/fragment/app/v;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public removeMenuProvider(Landroidx/core/view/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeMenuProvider(Landroidx/core/view/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnConfigurationChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnConfigurationChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnMultiWindowModeChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnMultiWindowModeChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnPictureInPictureModeChangedListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnPictureInPictureModeChangedListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnTrimMemoryListener(LK1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/v$a;->f:Landroidx/fragment/app/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnTrimMemoryListener(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
