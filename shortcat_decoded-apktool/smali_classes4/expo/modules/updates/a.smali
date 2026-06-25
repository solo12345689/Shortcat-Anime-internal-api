.class public final Lexpo/modules/updates/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/updates/c;
.implements LEd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/a$a;,
        Lexpo/modules/updates/a$b;
    }
.end annotation


# static fields
.field public static final p:Lexpo/modules/updates/a$a;

.field private static final q:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/Exception;

.field private c:Ljava/lang/ref/WeakReference;

.field private final d:LGf/O;

.field private final e:Lxd/g;

.field private final f:Lud/a;

.field private final g:LCd/g;

.field private h:Z

.field private i:Ljava/lang/Long;

.field private j:Ljava/lang/Long;

.field private k:Lvd/b;

.field private final l:LGf/x;

.field private final m:LPf/a;

.field private n:Ljava/lang/ref/WeakReference;

.field private final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/updates/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/updates/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/updates/a;->p:Lexpo/modules/updates/a$a;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/updates/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/updates/a;->q:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Exception;)V
    .locals 6

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
    iput-object p1, p0, Lexpo/modules/updates/a;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/updates/a;->b:Ljava/lang/Exception;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {p2, v0, p2}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1, v2}, LZd/i;->w(LZd/i;)LZd/i;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, LGf/P;->a(LZd/i;)LGf/O;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lexpo/modules/updates/a;->d:LGf/O;

    .line 32
    .line 33
    new-instance v2, Lxd/g;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v3, "getFilesDir(...)"

    .line 40
    .line 41
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, p1}, Lxd/g;-><init>(Ljava/io/File;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lexpo/modules/updates/a;->e:Lxd/g;

    .line 48
    .line 49
    new-instance p1, Lud/c;

    .line 50
    .line 51
    invoke-direct {p1, v2}, Lud/c;-><init>(Lxd/g;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lexpo/modules/updates/a;->f:Lud/a;

    .line 55
    .line 56
    new-instance p1, LCd/g;

    .line 57
    .line 58
    invoke-virtual {p0}, Lexpo/modules/updates/a;->d()Lud/a;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sget-object v4, LCd/h;->b:LCd/h;

    .line 63
    .line 64
    sget-object v5, LCd/h;->e:LCd/h;

    .line 65
    .line 66
    filled-new-array {v4, v5}, [LCd/h;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-direct {p1, v2, v3, v4, v1}, LCd/g;-><init>(Lxd/g;Lud/a;Ljava/util/Set;LGf/O;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lexpo/modules/updates/a;->g:LCd/g;

    .line 78
    .line 79
    invoke-static {p2, v0, p2}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lexpo/modules/updates/a;->l:LGf/x;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-static {p1, v0, p2}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lexpo/modules/updates/a;->m:LPf/a;

    .line 91
    .line 92
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lexpo/modules/updates/a;->n:Ljava/lang/ref/WeakReference;

    .line 98
    .line 99
    return-void
.end method

.method private final declared-synchronized A()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lexpo/modules/updates/a;->d:LGf/O;

    .line 3
    .line 4
    new-instance v3, Lexpo/modules/updates/a$d;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v3, p0, v1}, Lexpo/modules/updates/a$d;-><init>(Lexpo/modules/updates/a;LZd/e;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public static final synthetic s(Lexpo/modules/updates/a;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lexpo/modules/updates/a;)LGf/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->d:LGf/O;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lexpo/modules/updates/a;)Lvd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lexpo/modules/updates/a;)LGf/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->l:LGf/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lexpo/modules/updates/a;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->m:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lexpo/modules/updates/a;)LCd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->g:LCd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lexpo/modules/updates/a;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/a;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method private final z()LEf/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/a;->i:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    iget-object v0, p0, Lexpo/modules/updates/a;->j:Ljava/lang/Long;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sub-long/2addr v0, v2

    .line 19
    sget-object v2, LEf/d;->d:LEf/d;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, LEf/c;->t(JLEf/d;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, LEf/a;->k(J)LEf/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Lc7/f;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/updates/a$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lexpo/modules/updates/a$c;-><init>(Lexpo/modules/updates/a;LZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v0, v2, v1}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lvd/b;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    return-object v1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lvd/b;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public d()Lud/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/a;->f:Lud/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lzd/e;

    .line 15
    .line 16
    invoke-static {p0}, Lexpo/modules/updates/a;->s(Lexpo/modules/updates/a;)Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p0}, Lexpo/modules/updates/a;->y(Lexpo/modules/updates/a;)Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Lexpo/modules/updates/a$e;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Lexpo/modules/updates/a$e;-><init>(LGf/n;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lexpo/modules/updates/a;->t(Lexpo/modules/updates/a;)LGf/O;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-direct {v1, v2, v3, v4, v5}, Lzd/e;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lvd/b$a;LGf/O;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lexpo/modules/updates/a;->x(Lexpo/modules/updates/a;)LCd/g;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, v1}, LCd/g;->f(Lzd/j;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-ne v0, v1, :cond_0

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne v0, p1, :cond_1

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 64
    .line 65
    return-object p1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/a;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(Ljava/util/Map;)V
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string v0, "Updates.setUpdateRequestHeadersOverride() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public getReactHost()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/a;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string p2, "Updates.setExtraParamAsync() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, p2}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public i(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string v0, "Updates.checkForUpdateAsync() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public j()Lexpo/modules/updates/c$c;
    .locals 14

    .line 1
    new-instance v0, Lexpo/modules/updates/c$c;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Lvd/b;->d()Lrd/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v2

    .line 15
    move-object v3, v1

    .line 16
    :goto_0
    invoke-direct {p0}, Lexpo/modules/updates/a;->z()LEf/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v4, p0, Lexpo/modules/updates/a;->b:Ljava/lang/Exception;

    .line 21
    .line 22
    iget-object v5, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    invoke-interface {v5}, Lvd/b;->e()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    :goto_1
    move v6, v5

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    const/4 v5, 0x0

    .line 33
    goto :goto_1

    .line 34
    :goto_2
    sget-object v8, Lexpo/modules/updates/d$a;->a:Lexpo/modules/updates/d$a;

    .line 35
    .line 36
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    iget-object v5, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 41
    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    invoke-interface {v5}, Lvd/b;->a()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_2
    move-object v10, v3

    .line 49
    iget-object v3, p0, Lexpo/modules/updates/a;->g:LCd/g;

    .line 50
    .line 51
    invoke-virtual {v3}, LCd/g;->d()LCd/b;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const/4 v13, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-direct/range {v0 .. v13}, Lexpo/modules/updates/c$c;-><init>(Lrd/d;LEf/a;Lrd/d;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/d$a;Ljava/util/Map;Ljava/util/Map;ZLCd/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

.method public k()LAd/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public l(Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/updates/a;->n:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public m(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/updates/a;->c:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/a;->g:LCd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LCd/g;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string v0, "Updates.getExtraParamsAsync() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public q(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string v0, "Updates.fetchUpdateAsync() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public r(Lexpo/modules/updates/e;)V
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/updates/a$b;

    .line 2
    .line 3
    const-string v0, "Updates.setUpdateURLAndRequestHeadersOverride() is not supported when expo-updates is not enabled."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lexpo/modules/updates/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public declared-synchronized start()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lexpo/modules/updates/a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lexpo/modules/updates/a;->h:Z

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lexpo/modules/updates/a;->i:Ljava/lang/Long;

    .line 20
    .line 21
    new-instance v0, Lvd/c;

    .line 22
    .line 23
    iget-object v1, p0, Lexpo/modules/updates/a;->a:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v2, p0, Lexpo/modules/updates/a;->e:Lxd/g;

    .line 26
    .line 27
    iget-object v3, p0, Lexpo/modules/updates/a;->b:Ljava/lang/Exception;

    .line 28
    .line 29
    iget-object v4, p0, Lexpo/modules/updates/a;->d:LGf/O;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2, v3, v4}, Lvd/c;-><init>(Landroid/content/Context;Lxd/g;Ljava/lang/Exception;LGf/O;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lexpo/modules/updates/a;->k:Lvd/b;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lexpo/modules/updates/a;->j:Ljava/lang/Long;

    .line 45
    .line 46
    invoke-direct {p0}, Lexpo/modules/updates/a;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    throw v0
.end method
