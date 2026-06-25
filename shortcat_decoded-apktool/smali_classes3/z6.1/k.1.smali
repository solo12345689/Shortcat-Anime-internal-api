.class public final Lz6/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly5/n;


# instance fields
.field private final a:Lz6/q;

.field private final b:LH6/D;

.field private final c:Lz6/p;

.field private final d:Lx6/t;

.field private final e:I

.field private final f:Lt5/d;

.field private final g:Lt5/d;

.field private final h:Ljava/util/Map;

.field private final i:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lz6/q;LH6/D;Lz6/p;Lx6/t;ILt5/d;Lt5/d;Ljava/util/Map;)V
    .locals 1

    const-string v0, "fileCacheFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poolFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executorSupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCacheStatsTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDiskCacheConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smallImageDiskCacheConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz6/k;->a:Lz6/q;

    .line 3
    iput-object p2, p0, Lz6/k;->b:LH6/D;

    .line 4
    iput-object p3, p0, Lz6/k;->c:Lz6/p;

    .line 5
    iput-object p4, p0, Lz6/k;->d:Lx6/t;

    .line 6
    iput p5, p0, Lz6/k;->e:I

    .line 7
    iput-object p6, p0, Lz6/k;->f:Lt5/d;

    .line 8
    iput-object p7, p0, Lz6/k;->g:Lt5/d;

    .line 9
    iput-object p8, p0, Lz6/k;->h:Ljava/util/Map;

    .line 10
    sget-object p1, LTd/q;->a:LTd/q;

    new-instance p2, Lz6/d;

    invoke-direct {p2, p0}, Lz6/d;-><init>(Lz6/k;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lz6/k;->i:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Lz6/q;Lz6/v;)V
    .locals 10

    const-string v0, "fileCacheFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p2}, Lz6/v;->t()LH6/D;

    move-result-object v3

    .line 12
    invoke-interface {p2}, Lz6/v;->H()Lz6/p;

    move-result-object v4

    .line 13
    invoke-interface {p2}, Lz6/v;->B()Lx6/t;

    move-result-object v5

    .line 14
    invoke-interface {p2}, Lz6/v;->u()I

    move-result v6

    .line 15
    invoke-interface {p2}, Lz6/v;->d()Lt5/d;

    move-result-object v7

    .line 16
    invoke-interface {p2}, Lz6/v;->j()Lt5/d;

    move-result-object v8

    .line 17
    invoke-interface {p2}, Lz6/v;->i()Ljava/util/Map;

    move-result-object v9

    move-object v1, p0

    move-object v2, p1

    .line 18
    invoke-direct/range {v1 .. v9}, Lz6/k;-><init>(Lz6/q;LH6/D;Lz6/p;Lx6/t;ILt5/d;Lt5/d;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic a(Lz6/k;)Lz6/k$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/k;->j(Lz6/k;)Lz6/k$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lz6/k;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->h:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lz6/k;)Lz6/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->c:Lz6/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lz6/k;)Lz6/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->a:Lz6/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lz6/k;)Lx6/t;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->d:Lx6/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lz6/k;)Lt5/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->f:Lt5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lz6/k;)I
    .locals 0

    .line 1
    iget p0, p0, Lz6/k;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic h(Lz6/k;)LH6/D;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->b:LH6/D;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lz6/k;)Lt5/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lz6/k;->g:Lt5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final j(Lz6/k;)Lz6/k$a;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz6/k$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lz6/k$a;-><init>(Lz6/k;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private final l()Lz6/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/k;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz6/c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz6/k;->k()Lz6/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Lz6/c;
    .locals 1

    .line 1
    invoke-direct {p0}, Lz6/k;->l()Lz6/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
