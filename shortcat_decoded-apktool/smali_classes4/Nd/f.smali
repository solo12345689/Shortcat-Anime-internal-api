.class public final LNd/f;
.super Landroidx/browser/customtabs/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private final d:LNd/g;

.field private final e:LNd/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/browser/customtabs/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LNd/f;->b:Landroid/content/Context;

    .line 10
    .line 11
    new-instance p1, LNd/g;

    .line 12
    .line 13
    invoke-direct {p1}, LNd/g;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LNd/f;->d:LNd/g;

    .line 17
    .line 18
    new-instance p1, LNd/g;

    .line 19
    .line 20
    invoke-direct {p1}, LNd/g;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LNd/f;->e:LNd/g;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic c(LNd/f;Landroidx/browser/customtabs/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LNd/f;->k(LNd/f;Landroidx/browser/customtabs/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroidx/browser/customtabs/c;)V
    .locals 0

    .line 1
    invoke-static {p0}, LNd/f;->p(Landroidx/browser/customtabs/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/net/Uri;Landroidx/browser/customtabs/f;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LNd/f;->n(Landroid/net/Uri;Landroidx/browser/customtabs/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LNd/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LNd/f;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, LNd/f;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, LNd/f;->d:LNd/g;

    .line 14
    .line 15
    invoke-virtual {v0}, LNd/g;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LNd/f;->e:LNd/g;

    .line 19
    .line 20
    invoke-virtual {v0}, LNd/g;->b()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final i(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LNd/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LNd/f;->f()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0, p1}, LNd/f;->l(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LNd/f;->b:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0, p1, p0}, Landroidx/browser/customtabs/c;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/browser/customtabs/e;)Z

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LNd/f;->c:Ljava/lang/String;

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LNd/f;->e:LNd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LNd/g;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LNd/f;->d:LNd/g;

    .line 11
    .line 12
    new-instance v1, LNd/e;

    .line 13
    .line 14
    invoke-direct {v1, p0}, LNd/e;-><init>(LNd/f;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LNd/g;->c(Lsb/c;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final k(LNd/f;Landroidx/browser/customtabs/c;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LNd/f;->e:LNd/g;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/browser/customtabs/c;->e(Landroidx/browser/customtabs/b;)Landroidx/browser/customtabs/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, LNd/g;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final l(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LNd/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method private static final n(Landroid/net/Uri;Landroidx/browser/customtabs/f;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0, v0}, Landroidx/browser/customtabs/f;->c(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    .line 5
    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method private static final p(Landroidx/browser/customtabs/c;)V
    .locals 2

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Landroidx/browser/customtabs/c;->g(J)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "client"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "getPackageName(...)"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, LNd/f;->l(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, LNd/f;->d:LNd/g;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, LNd/g;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LNd/f;->l(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, LNd/f;->f()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final h()V
    .locals 0

    .line 1
    invoke-direct {p0}, LNd/f;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 2

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LNd/f;->e:LNd/g;

    .line 12
    .line 13
    new-instance v1, LNd/d;

    .line 14
    .line 15
    invoke-direct {v1, p2}, LNd/d;-><init>(Landroid/net/Uri;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, LNd/g;->c(Lsb/c;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, LNd/f;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, LNd/f;->j()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LNd/f;->d:LNd/g;

    .line 7
    .line 8
    new-instance v1, LNd/c;

    .line 9
    .line 10
    invoke-direct {v1}, LNd/c;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, LNd/g;->c(Lsb/c;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LNd/f;->i(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onBindingDied(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "getPackageName(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, LNd/f;->l(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, LNd/f;->f()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "getPackageName(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, LNd/f;->l(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, LNd/f;->f()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
