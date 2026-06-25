.class public Ly8/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lz8/d;

.field private final c:Ly8/x;

.field private final d:LA8/b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lz8/d;Ly8/x;LA8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/v;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/v;->b:Lz8/d;

    .line 7
    .line 8
    iput-object p3, p0, Ly8/v;->c:Ly8/x;

    .line 9
    .line 10
    iput-object p4, p0, Ly8/v;->d:LA8/b;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Ly8/v;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ly8/v;->b:Lz8/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lz8/d;->d0()Ljava/lang/Iterable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lr8/o;

    .line 22
    .line 23
    iget-object v2, p0, Ly8/v;->c:Ly8/x;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-interface {v2, v1, v3}, Ly8/x;->a(Lr8/o;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static synthetic b(Ly8/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/v;->d:LA8/b;

    .line 2
    .line 3
    new-instance v1, Ly8/u;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ly8/u;-><init>(Ly8/v;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LA8/b;->g(LA8/b$a;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/v;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Ly8/t;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ly8/t;-><init>(Ly8/v;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
