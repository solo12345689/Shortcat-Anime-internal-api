.class public final LQ8/k0;
.super Landroidx/fragment/app/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ8/i;


# static fields
.field private static final b:Ljava/util/WeakHashMap;


# instance fields
.field private final a:LQ8/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ8/k0;->b:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ8/j0;

    .line 5
    .line 6
    invoke-direct {v0}, LQ8/j0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 10
    .line 11
    return-void
.end method

.method public static w(Landroidx/fragment/app/v;)LQ8/k0;
    .locals 5

    .line 1
    const-string v0, "SLifecycleFragmentImpl"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LQ8/k0;->b:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LQ8/k0;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {v1, v0}, Landroidx/fragment/app/K;->q0(Ljava/lang/String;)Landroidx/fragment/app/q;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, LQ8/k0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Landroidx/fragment/app/q;->isRemoving()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    :cond_1
    new-instance v3, LQ8/k0;

    .line 41
    .line 42
    invoke-direct {v3}, LQ8/k0;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/fragment/app/K;->s()Landroidx/fragment/app/U;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v3, v0}, Landroidx/fragment/app/U;->e(Landroidx/fragment/app/q;Ljava/lang/String;)Landroidx/fragment/app/U;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroidx/fragment/app/U;->i()I

    .line 54
    .line 55
    .line 56
    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :catch_0
    move-exception p0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v1, "Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/Class;)LQ8/h;
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LQ8/j0;->a(Ljava/lang/String;Ljava/lang/Class;)LQ8/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(Ljava/lang/String;LQ8/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LQ8/j0;->b(Ljava/lang/String;LQ8/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/fragment/app/q;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3, p4}, LQ8/j0;->j(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f()Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/q;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, LQ8/j0;->f(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ8/j0;->c(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, LQ8/j0;->i()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, LQ8/j0;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ8/j0;->g(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, LQ8/j0;->d()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/k0;->a:LQ8/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, LQ8/j0;->h()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
