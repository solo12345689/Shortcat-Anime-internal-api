.class public final Lzd/h;
.super Lzd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/h$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Lpd/c;

.field private final d:Ljava/io/File;

.field private final e:Lwd/g;

.field private final f:LBd/h;

.field private final g:Lxd/g;

.field private final h:Lzd/h$a;

.field private final i:LGf/O;

.field private final j:Ljava/lang/String;

.field private k:Lzd/j$a;

.field private l:Lvd/b;

.field private m:Ljava/lang/Exception;

.field private final n:Ltd/c;

.field private o:Ltd/d$a;

.field private final p:Lwd/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;Lzd/h$a;LGf/O;)V
    .locals 10

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move-object/from16 v7, p7

    .line 4
    .line 5
    move-object/from16 v0, p8

    .line 6
    .line 7
    move-object/from16 v9, p9

    .line 8
    .line 9
    const-string v1, "context"

    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "updatesConfiguration"

    .line 15
    .line 16
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "databaseHolder"

    .line 20
    .line 21
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "updatesDirectory"

    .line 25
    .line 26
    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "fileDownloader"

    .line 30
    .line 31
    invoke-static {p5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "selectionPolicy"

    .line 35
    .line 36
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "logger"

    .line 40
    .line 41
    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "callback"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "procedureScope"

    .line 50
    .line 51
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lzd/j;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lzd/h;->a:Landroid/content/Context;

    .line 58
    .line 59
    iput-object p2, p0, Lzd/h;->b:Lexpo/modules/updates/d;

    .line 60
    .line 61
    iput-object p3, p0, Lzd/h;->c:Lpd/c;

    .line 62
    .line 63
    iput-object p4, p0, Lzd/h;->d:Ljava/io/File;

    .line 64
    .line 65
    iput-object p5, p0, Lzd/h;->e:Lwd/g;

    .line 66
    .line 67
    iput-object v6, p0, Lzd/h;->f:LBd/h;

    .line 68
    .line 69
    iput-object v7, p0, Lzd/h;->g:Lxd/g;

    .line 70
    .line 71
    iput-object v0, p0, Lzd/h;->h:Lzd/h$a;

    .line 72
    .line 73
    iput-object v9, p0, Lzd/h;->i:LGf/O;

    .line 74
    .line 75
    const-string v0, "timer-startup"

    .line 76
    .line 77
    iput-object v0, p0, Lzd/h;->j:Ljava/lang/String;

    .line 78
    .line 79
    new-instance v0, Ltd/c;

    .line 80
    .line 81
    invoke-direct {v0, v7}, Ltd/c;-><init>(Lxd/g;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lzd/h;->n:Ltd/c;

    .line 85
    .line 86
    sget-object v0, Ltd/d$a;->a:Ltd/d$a;

    .line 87
    .line 88
    iput-object v0, p0, Lzd/h;->o:Ltd/d$a;

    .line 89
    .line 90
    new-instance v0, Lwd/o;

    .line 91
    .line 92
    new-instance v8, Lzd/h$c;

    .line 93
    .line 94
    invoke-direct {v8, p0}, Lzd/h$c;-><init>(Lzd/h;)V

    .line 95
    .line 96
    .line 97
    move-object v1, p1

    .line 98
    move-object v2, p2

    .line 99
    move-object v3, p3

    .line 100
    move-object v4, p4

    .line 101
    move-object v5, p5

    .line 102
    invoke-direct/range {v0 .. v9}, Lwd/o;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;Lwd/o$b;LGf/O;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lzd/h;->p:Lwd/o;

    .line 106
    .line 107
    return-void
.end method

.method private final A()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzd/h;->n:Ltd/c;

    .line 2
    .line 3
    new-instance v1, Lzd/h$b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lzd/h$b;-><init>(Lzd/h;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ltd/c;->h(Ltd/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final declared-synchronized C()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lzd/h;->h:Lzd/h$a;

    .line 7
    .line 8
    invoke-interface {v0}, Lzd/h$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 16
    .line 17
    const-string v1, "UpdatesController.notifyController was called with a null launcher, which is an error. This method should only be called when an update is ready to launch."

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method private final G(Ltd/d$a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lzd/h;->o:Ltd/d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/h;->n:Ltd/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ltd/c;->i(Ltd/d$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic c(Lzd/h;)Lzd/h$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->h:Lzd/h$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lzd/h;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lzd/h;)Lpd/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->c:Lpd/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lzd/h;)Ltd/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->n:Ltd/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lzd/h;)Lwd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->e:Lwd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lzd/h;)Lwd/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->p:Lwd/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lzd/h;)Lxd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->g:Lxd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lzd/h;)Lzd/j$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->k:Lzd/j$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lzd/h;)LGf/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->i:LGf/O;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lzd/h;)Ltd/d$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->o:Ltd/d$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lzd/h;)LBd/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->f:LBd/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lzd/h;)Lexpo/modules/updates/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->b:Lexpo/modules/updates/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lzd/h;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/h;->d:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lzd/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzd/h;->C()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q(Lzd/h;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h;->m:Ljava/lang/Exception;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic r(Lzd/h;Lvd/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic s(Lzd/h;Ltd/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lzd/h;->G(Ltd/d$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic t(Lzd/h;Ltd/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h;->o:Ltd/d$a;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lvd/b;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final D(Lc7/f;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzd/h;->m:Ljava/lang/Exception;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lzd/h;->n:Ltd/c;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ltd/c;->n(Lc7/f;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final E(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzd/h;->n:Ltd/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ltd/c;->j(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final F(Lvd/b;)V
    .locals 1

    .line 1
    const-string v0, "launcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lzd/h;->l:Lvd/b;

    .line 7
    .line 8
    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lzd/h;->k:Lzd/j$a;

    .line 2
    .line 3
    new-instance v0, LCd/e$n;

    .line 4
    .line 5
    invoke-direct {v0}, LCd/e$n;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Lzd/j$b;->a(LCd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lzd/h;->A()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lzd/h;->p:Lwd/o;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lwd/o;->s(LZd/e;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 28
    .line 29
    return-object p1
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

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

.method public final v()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->m:Ljava/lang/Exception;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lvd/b;->b()Ljava/lang/String;

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

.method public final x()Lrd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lvd/b;->d()Lrd/d;

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

.method public final y()Lvd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h;->l:Lvd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lvd/b;->a()Ljava/util/Map;

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
