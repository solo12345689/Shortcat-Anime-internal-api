.class public final LFd/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Lv2/b;

.field private final c:Landroid/content/SharedPreferences;

.field private d:Lx2/p;

.field private e:Lx2/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

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
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LFd/E;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance v0, Lv2/c;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lv2/c;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LFd/E;->b:Lv2/b;

    .line 22
    .line 23
    const-string v1, "ExpoVideoCache"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    new-instance p1, Lx2/p;

    .line 33
    .line 34
    invoke-direct {p0}, LFd/E;->m()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    invoke-direct {p1, v1, v2}, Lx2/p;-><init>(J)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LFd/E;->d:Lx2/p;

    .line 42
    .line 43
    new-instance p1, Lx2/r;

    .line 44
    .line 45
    invoke-direct {p0}, LFd/E;->f()Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, p0, LFd/E;->d:Lx2/p;

    .line 50
    .line 51
    invoke-direct {p1, v1, v2, v0}, Lx2/r;-><init>(Ljava/io/File;Lx2/d;Lv2/b;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LFd/E;->e:Lx2/r;

    .line 55
    .line 56
    return-void
.end method

.method public static synthetic a(Ljava/io/File;)J
    .locals 2

    .line 1
    invoke-static {p0}, LFd/E;->k(Ljava/io/File;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic b(Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LFd/E;->j(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c()V
    .locals 4

    .line 1
    sget-object v0, LId/m;->a:LId/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LId/m;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string v0, "ExpoVideo"

    .line 24
    .line 25
    const-string v1, "Clearing cache on the main thread, this might cause performance issues"

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    new-instance v0, LFd/F;

    .line 32
    .line 33
    const-string v1, "Cannot clear cache while there are active players"

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v0, v1, v3, v2, v3}, LFd/F;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method private final e()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "toString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private final f()Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "cacheDir"

    .line 5
    .line 6
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, LFd/E;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 30
    .line 31
    invoke-direct {p0}, LFd/E;->g()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "ExpoVideoCache"

    .line 40
    .line 41
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-object v2
.end method

.method private final g()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/E;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final i(Ljava/io/File;)J
    .locals 2

    .line 1
    invoke-static {p1}, Lfe/k;->s(Ljava/io/File;)Lfe/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LFd/C;

    .line 6
    .line 7
    invoke-direct {v0}, LFd/C;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, LCf/l;->z(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, LFd/D;

    .line 15
    .line 16
    invoke-direct {v0}, LFd/D;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, LCf/l;->K(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, LCf/l;->P(LCf/i;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
.end method

.method private static final j(Ljava/io/File;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final k(Ljava/io/File;)J
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method private final m()J
    .locals 4

    .line 1
    iget-object v0, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "cacheSize"

    .line 4
    .line 5
    const-wide/32 v2, 0x40000000

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method


# virtual methods
.method public final d()V
    .locals 6

    .line 1
    invoke-direct {p0}, LFd/E;->c()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LFd/E;->f()Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, LFd/E;->e:Lx2/r;

    .line 9
    .line 10
    invoke-direct {p0}, LFd/E;->e()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "cacheDir"

    .line 21
    .line 22
    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lx2/r;

    .line 30
    .line 31
    invoke-direct {p0}, LFd/E;->f()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, p0, LFd/E;->d:Lx2/p;

    .line 36
    .line 37
    iget-object v5, p0, LFd/E;->b:Lv2/b;

    .line 38
    .line 39
    invoke-direct {v2, v3, v4, v5}, Lx2/r;-><init>(Ljava/io/File;Lx2/d;Lv2/b;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, LFd/E;->e:Lx2/r;

    .line 43
    .line 44
    invoke-virtual {v1}, Lx2/r;->x()V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lfe/k;->z(Ljava/io/File;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final h()J
    .locals 2

    .line 1
    invoke-direct {p0}, LFd/E;->f()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, LFd/E;->i(Ljava/io/File;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final l()Lx2/r;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/E;->e:Lx2/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, LFd/E;->e:Lx2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx2/r;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, LFd/E;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LFd/E;->e:Lx2/r;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx2/r;->x()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LFd/E;->c:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "cacheSize"

    .line 16
    .line 17
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lx2/p;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, Lx2/p;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LFd/E;->d:Lx2/p;

    .line 30
    .line 31
    new-instance p1, Lx2/r;

    .line 32
    .line 33
    invoke-direct {p0}, LFd/E;->f()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object v0, p0, LFd/E;->d:Lx2/p;

    .line 38
    .line 39
    iget-object v1, p0, LFd/E;->b:Lv2/b;

    .line 40
    .line 41
    invoke-direct {p1, p2, v0, v1}, Lx2/r;-><init>(Ljava/io/File;Lx2/d;Lv2/b;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LFd/E;->e:Lx2/r;

    .line 45
    .line 46
    return-void
.end method
