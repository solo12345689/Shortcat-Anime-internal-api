.class public final Ly7/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Le7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/n$a;
    }
.end annotation


# static fields
.field public static final g:Ly7/n$a;

.field public static final h:Ljava/util/concurrent/Executor;

.field public static final i:Ljava/util/concurrent/Executor;

.field private static final j:Ly7/n;

.field private static final k:Ly7/n;

.field private static final l:Ly7/n;

.field private static final m:Ly7/n;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Ljava/lang/Exception;

.field private final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly7/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly7/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly7/n;->g:Ly7/n$a;

    .line 8
    .line 9
    sget-object v0, Ly7/c;->c:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    sput-object v0, Ly7/n;->h:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    sget-object v0, Ly7/c;->b:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    sput-object v0, Ly7/n;->i:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    new-instance v0, Ly7/n;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ly7/n;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ly7/n;->j:Ly7/n;

    .line 23
    .line 24
    new-instance v0, Ly7/n;

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ly7/n;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ly7/n;->k:Ly7/n;

    .line 32
    .line 33
    new-instance v0, Ly7/n;

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ly7/n;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Ly7/n;->l:Ly7/n;

    .line 41
    .line 42
    new-instance v0, Ly7/n;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-direct {v0, v1}, Ly7/n;-><init>(Z)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Ly7/n;->m:Ly7/n;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly7/n;->f:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly7/n;->f:Ljava/util/List;

    .line 7
    invoke-virtual {p0, p1}, Ly7/n;->G(Ljava/lang/Object;)Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly7/n;->f:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p0}, Ly7/n;->E()Z

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Ly7/n;->G(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final A(Ly7/a;Ly7/n;)Ly7/n;
    .locals 2

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ly7/n;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Ly7/n;->g:Ly7/n$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Ly7/n$a;->k()Ly7/n;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Ly7/n;->v()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p0, Ly7/n;->g:Ly7/n$a;

    .line 26
    .line 27
    invoke-virtual {p1}, Ly7/n;->r()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    const/4 v0, 0x2

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {p1, p0, v1, v0, v1}, Ly7/n;->m(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private static final C(Ly7/a;Ly7/n;)Ly7/n;
    .locals 2

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ly7/n;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Ly7/n;->g:Ly7/n$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Ly7/n$a;->k()Ly7/n;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Ly7/n;->v()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p0, Ly7/n;->g:Ly7/n$a;

    .line 26
    .line 27
    invoke-virtual {p1}, Ly7/n;->r()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    const/4 v0, 0x2

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {p1, p0, v1, v0, v1}, Ly7/n;->p(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private final D()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly7/n;->f:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ly7/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    :try_start_1
    invoke-interface {v2, p0}, Ly7/a;->a(Ly7/n;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LTd/L;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_3

    .line 31
    :catch_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :catch_1
    move-exception v1

    .line 34
    goto :goto_2

    .line 35
    :goto_1
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v2

    .line 41
    :goto_2
    throw v1

    .line 42
    :cond_0
    iget-object v1, p0, Ly7/n;->f:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 45
    .line 46
    .line 47
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_3
    monitor-exit v0

    .line 52
    throw v1
.end method

.method public static synthetic a(Ly7/a;Ly7/n;)Ly7/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly7/n;->C(Ly7/a;Ly7/n;)Ly7/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ly7/n;)Ly7/n;
    .locals 0

    .line 1
    invoke-static {p0}, Ly7/n;->x(Ly7/n;)Ly7/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ly7/n;->n(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ly7/n;->q(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ly7/a;Ly7/n;)Ly7/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly7/n;->A(Ly7/a;Ly7/n;)Ly7/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Ly7/n;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ly7/n;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Ly7/n;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h()Ly7/n;
    .locals 1

    .line 1
    sget-object v0, Ly7/n;->m:Ly7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()Ly7/n;
    .locals 1

    .line 1
    sget-object v0, Ly7/n;->l:Ly7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()Ly7/n;
    .locals 1

    .line 1
    sget-object v0, Ly7/n;->j:Ly7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic k()Ly7/n;
    .locals 1

    .line 1
    sget-object v0, Ly7/n;->k:Ly7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic m(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Ly7/n;->h:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Ly7/n;->l(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final n(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 7
    .line 8
    invoke-static {v0, p0, p1, p3, p2}, Ly7/n$a;->g(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic p(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Ly7/n;->h:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Ly7/n;->o(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final q(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 7
    .line 8
    invoke-static {v0, p0, p1, p3, p2}, Ly7/n$a;->f(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final x(Ly7/n;)Ly7/n;
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ly7/n;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Ly7/n;->g:Ly7/n$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Ly7/n$a;->k()Ly7/n;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ly7/n;->v()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Ly7/n;->g:Ly7/n$a;

    .line 26
    .line 27
    invoke-virtual {p0}, Ly7/n;->r()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ly7/n$a;->q(Ljava/lang/Exception;)Ly7/n;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object p0, Ly7/n;->j:Ly7/n;

    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic z(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Ly7/n;->h:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Ly7/n;->y(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final B(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;
    .locals 1

    .line 1
    const-string v0, "continuation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ly7/h;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ly7/h;-><init>(Ly7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p2}, Ly7/n;->o(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final E()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly7/n;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :try_start_1
    iput-boolean v1, p0, Ly7/n;->b:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Ly7/n;->c:Z

    .line 15
    .line 16
    iget-object v2, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ly7/n;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return v1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0

    .line 28
    throw v1
.end method

.method public final F(Ljava/lang/Exception;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly7/n;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :try_start_1
    iput-boolean v1, p0, Ly7/n;->b:Z

    .line 13
    .line 14
    iput-object p1, p0, Ly7/n;->e:Ljava/lang/Exception;

    .line 15
    .line 16
    iget-object p1, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ly7/n;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return v1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0

    .line 28
    throw p1
.end method

.method public final G(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly7/n;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :try_start_1
    iput-boolean v1, p0, Ly7/n;->b:Z

    .line 13
    .line 14
    iput-object p1, p0, Ly7/n;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p1, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ly7/n;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return v1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0

    .line 28
    throw p1
.end method

.method public final l(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;
    .locals 5

    .line 1
    const-string v0, "continuation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ly7/o;

    .line 12
    .line 13
    invoke-direct {v0}, Ly7/o;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    invoke-virtual {p0}, Ly7/n;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v3, p0, Ly7/n;->f:Ljava/util/List;

    .line 26
    .line 27
    new-instance v4, Ly7/g;

    .line 28
    .line 29
    invoke-direct {v4, v0, p1, p2}, Ly7/g;-><init>(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit v1

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    sget-object v1, Ly7/n;->g:Ly7/n$a;

    .line 44
    .line 45
    invoke-static {v1, v0, p1, p0, p2}, Ly7/n$a;->g(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Ly7/o;->a()Ly7/n;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :goto_1
    monitor-exit v1

    .line 54
    throw p1
.end method

.method public final o(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;
    .locals 5

    .line 1
    const-string v0, "continuation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ly7/o;

    .line 12
    .line 13
    invoke-direct {v0}, Ly7/o;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    invoke-virtual {p0}, Ly7/n;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v3, p0, Ly7/n;->f:Ljava/util/List;

    .line 26
    .line 27
    new-instance v4, Ly7/e;

    .line 28
    .line 29
    invoke-direct {v4, v0, p1, p2}, Ly7/e;-><init>(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit v1

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    sget-object v1, Ly7/n;->g:Ly7/n$a;

    .line 44
    .line 45
    invoke-static {v1, v0, p1, p0, p2}, Ly7/n$a;->f(Ly7/n$a;Ly7/o;Ly7/a;Ly7/n;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Ly7/o;->a()Ly7/n;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :goto_1
    monitor-exit v1

    .line 54
    throw p1
.end method

.method public r()Ljava/lang/Exception;
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly7/n;->e:Ljava/lang/Exception;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public s()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly7/n;->d:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public t()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly7/n;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public u()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly7/n;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public v()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/n;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ly7/n;->r()Ljava/lang/Exception;

    .line 5
    .line 6
    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    monitor-exit v0

    .line 14
    return v1

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0

    .line 17
    throw v1
.end method

.method public final w()Ly7/n;
    .locals 3

    .line 1
    new-instance v0, Ly7/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ly7/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-static {p0, v0, v1, v2, v1}, Ly7/n;->p(Ly7/n;Ly7/a;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Ly7/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final y(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;
    .locals 1

    .line 1
    const-string v0, "continuation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ly7/f;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ly7/f;-><init>(Ly7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p2}, Ly7/n;->o(Ly7/a;Ljava/util/concurrent/Executor;)Ly7/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
