.class public final Lexpo/modules/updates/db/UpdatesDatabase$j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/db/UpdatesDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/db/UpdatesDatabase$j;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lexpo/modules/updates/db/UpdatesDatabase$j;LS3/g;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->m(LS3/g;Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lexpo/modules/updates/db/UpdatesDatabase$j;LS3/g;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->n(LS3/g;Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final m(LS3/g;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-interface {p1}, LS3/g;->M()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, LS3/g;->l0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, LS3/g;->v0()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    invoke-interface {p1}, LS3/g;->v0()V

    .line 16
    .line 17
    .line 18
    throw p2
.end method

.method private final n(LS3/g;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "PRAGMA foreign_keys=ON"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "PRAGMA foreign_keys=OFF"

    .line 4
    .line 5
    invoke-interface {p1, v1}, LS3/g;->T(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->m(LS3/g;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p2

    .line 16
    invoke-interface {p1, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p2
.end method


# virtual methods
.method public final c(Landroid/content/Context;LGf/K;)Lexpo/modules/updates/db/UpdatesDatabase;
    .locals 9

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->D()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "getApplicationContext(...)"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-class v0, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 23
    .line 24
    const-string v1, "updates.db"

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, LM3/p;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LM3/q$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-static {p2}, LGf/u0;->a(LGf/K;)Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, LM3/q$a;->g(Ljava/util/concurrent/Executor;)LM3/q$a;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    sget-object p2, Lexpo/modules/updates/db/UpdatesDatabase;->p:Lexpo/modules/updates/db/UpdatesDatabase$j;

    .line 44
    .line 45
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->g()LN3/b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->h()LN3/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->i()LN3/b;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->j()LN3/b;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->k()LN3/b;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->l()LN3/b;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->d()LN3/b;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->e()LN3/b;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase$j;->f()LN3/b;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    filled-new-array/range {v0 .. v8}, [LN3/b;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p1, p2}, LM3/q$a;->b([LN3/b;)LM3/q$a;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, LM3/q$a;->c()LM3/q$a;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, LM3/q$a;->e()LM3/q$a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, LM3/q$a;->d()LM3/q;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 102
    .line 103
    invoke-static {p1}, Lexpo/modules/updates/db/UpdatesDatabase;->N(Lexpo/modules/updates/db/UpdatesDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return-object p1

    .line 108
    :goto_1
    monitor-exit p0

    .line 109
    throw p1

    .line 110
    :cond_1
    return-object v0
.end method

.method public final d()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->E()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->F()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final f()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->G()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->H()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->I()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final i()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->J()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->K()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final k()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->L()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final l()LN3/b;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/updates/db/UpdatesDatabase;->M()LN3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
