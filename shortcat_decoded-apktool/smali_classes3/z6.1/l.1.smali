.class public Lz6/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz6/q;


# instance fields
.field private a:Lz6/m;


# direct methods
.method public constructor <init>(Lz6/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz6/l;->a:Lz6/m;

    .line 5
    .line 6
    return-void
.end method

.method private static b(Lt5/d;Lt5/f;)Lt5/g;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, Lz6/l;->c(Lt5/d;Lt5/f;Ljava/util/concurrent/Executor;)Lt5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static c(Lt5/d;Lt5/f;Ljava/util/concurrent/Executor;)Lt5/g;
    .locals 9

    .line 1
    new-instance v0, Lt5/g$c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lt5/d;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p0}, Lt5/d;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-virtual {p0}, Lt5/d;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    invoke-direct/range {v0 .. v6}, Lt5/g$c;-><init>(JJJ)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lt5/g;

    .line 19
    .line 20
    invoke-virtual {p0}, Lt5/d;->h()Lt5/j;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Lt5/d;->e()Ls5/c;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p0}, Lt5/d;->d()Ls5/a;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p0}, Lt5/d;->g()Lv5/b;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {p0}, Lt5/d;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    move-object v7, p2

    .line 41
    move-object v3, v0

    .line 42
    move-object v0, v1

    .line 43
    move-object v1, p1

    .line 44
    invoke-direct/range {v0 .. v8}, Lt5/g;-><init>(Lt5/f;Lt5/j;Lt5/g$c;Ls5/c;Ls5/a;Lv5/b;Ljava/util/concurrent/Executor;Z)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method


# virtual methods
.method public a(Lt5/d;)Lt5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/l;->a:Lz6/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz6/m;->a(Lt5/d;)Lt5/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lz6/l;->b(Lt5/d;Lt5/f;)Lt5/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
