.class final Landroidx/fragment/app/f$g$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f$g$b;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/f$g;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f$g;Ljava/lang/Object;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/f$g$b$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/f$g$b$a;->c:Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/f$g$b$a;->c(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/fragment/app/f$g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/fragment/app/f$g$b$a;->e(Landroidx/fragment/app/f$g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final c(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$container"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->w()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroidx/fragment/app/f$h;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroidx/fragment/app/q;->getView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/c0$d$b;->b(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
.end method

.method private static final e(Landroidx/fragment/app/f$g;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "FragmentManager"

    .line 14
    .line 15
    const-string v1, "Transition for all operations has completed"

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->w()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroidx/fragment/app/f$h;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1, p0}, Landroidx/fragment/app/c0$d;->e(Landroidx/fragment/app/c0$b;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f$g$b$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v0}, Landroidx/fragment/app/f$g;->w()Ljava/util/List;

    move-result-object v0

    .line 3
    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/f$h;

    .line 5
    invoke-virtual {v3}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->m()Z

    move-result v3

    if-nez v3, :cond_1

    .line 6
    invoke-static {v2}, Landroidx/fragment/app/K;->Q0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    const-string v0, "Completing animating immediately"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_2
    new-instance v0, LG1/d;

    invoke-direct {v0}, LG1/d;-><init>()V

    .line 9
    iget-object v1, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->v()Landroidx/fragment/app/X;

    move-result-object v1

    .line 10
    iget-object v2, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v2}, Landroidx/fragment/app/f$g;->w()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/f$h;

    invoke-virtual {v2}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    move-result-object v2

    .line 11
    iget-object v3, p0, Landroidx/fragment/app/f$g$b$a;->b:Ljava/lang/Object;

    .line 12
    iget-object v4, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    new-instance v5, Landroidx/fragment/app/n;

    invoke-direct {v5, v4}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/f$g;)V

    invoke-virtual {v1, v2, v3, v0, v5}, Landroidx/fragment/app/X;->w(Landroidx/fragment/app/q;Ljava/lang/Object;LG1/d;Ljava/lang/Runnable;)V

    .line 13
    invoke-virtual {v0}, LG1/d;->a()V

    return-void

    .line 14
    :cond_3
    :goto_0
    invoke-static {v2}, Landroidx/fragment/app/K;->Q0(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 15
    const-string v0, "Animating to start"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v0}, Landroidx/fragment/app/f$g;->v()Landroidx/fragment/app/X;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iget-object v2, p0, Landroidx/fragment/app/f$g$b$a;->a:Landroidx/fragment/app/f$g;

    iget-object v3, p0, Landroidx/fragment/app/f$g$b$a;->c:Landroid/view/ViewGroup;

    new-instance v4, Landroidx/fragment/app/m;

    invoke-direct {v4, v2, v3}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v1, v4}, Landroidx/fragment/app/X;->d(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method
