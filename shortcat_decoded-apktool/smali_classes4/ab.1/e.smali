.class public abstract Lab/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lab/e;->d(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lab/e;->e(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Landroid/content/Context;Ljava/lang/String;Lcom/swmansion/rnscreens/gamma/tabs/a;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "view"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lab/a;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lab/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lab/a;->c(Landroid/content/Context;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v0, Lab/c;

    .line 29
    .line 30
    invoke-direct {v0, p2}, Lab/c;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1, v0}, Lab/e;->f(Landroid/content/Context;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private static final d(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)LTd/L;
    .locals 2

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lab/d;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lab/d;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    sget-object p0, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final e(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(Landroid/content/Context;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-static {p1}, LK6/c;->x(Landroid/net/Uri;)LK6/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK6/c;->a()LK6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, LO5/d;->a()Lz6/t;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0, p0}, Lz6/t;->k(LK6/b;Ljava/lang/Object;)LI5/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lab/e$a;

    .line 18
    .line 19
    invoke-direct {v1, p0, p2, p1}, Lab/e$a;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lw5/a;->b()Lw5/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {v0, v1, p0}, LI5/c;->f(LI5/e;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
