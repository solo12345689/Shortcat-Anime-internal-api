.class public Lci/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final m:Ljava/util/concurrent/ExecutorService;


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Ljava/util/concurrent/ExecutorService;

.field j:Ljava/util/List;

.field k:Lci/g;

.field l:Lci/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lci/d;->m:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lci/d;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lci/d;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lci/d;->c:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lci/d;->d:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lci/d;->f:Z

    .line 14
    .line 15
    sget-object v0, Lci/d;->m:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    iput-object v0, p0, Lci/d;->i:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a()Lci/c;
    .locals 1

    .line 1
    new-instance v0, Lci/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lci/c;-><init>(Lci/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method b()Lci/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lci/d;->k:Lci/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Lci/g$a;->a()Lci/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method c()Lci/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lci/d;->l:Lci/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Ldi/a;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {}, Ldi/a;->b()Ldi/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, Ldi/a;->b:Lci/h;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method
