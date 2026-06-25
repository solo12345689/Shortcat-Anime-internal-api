.class public Landroidx/work/impl/K$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Landroidx/work/c;

.field c:Landroidx/work/impl/foreground/a;

.field d:Lp4/b;

.field e:Landroidx/work/a;

.field f:Landroidx/work/impl/WorkDatabase;

.field g:Ln4/u;

.field h:Ljava/util/List;

.field private final i:Ljava/util/List;

.field j:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lp4/b;Landroidx/work/impl/foreground/a;Landroidx/work/impl/WorkDatabase;Ln4/u;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/work/WorkerParameters$a;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/work/impl/K$c;->j:Landroidx/work/WorkerParameters$a;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/work/impl/K$c;->a:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p3, p0, Landroidx/work/impl/K$c;->d:Lp4/b;

    .line 18
    .line 19
    iput-object p4, p0, Landroidx/work/impl/K$c;->c:Landroidx/work/impl/foreground/a;

    .line 20
    .line 21
    iput-object p2, p0, Landroidx/work/impl/K$c;->e:Landroidx/work/a;

    .line 22
    .line 23
    iput-object p5, p0, Landroidx/work/impl/K$c;->f:Landroidx/work/impl/WorkDatabase;

    .line 24
    .line 25
    iput-object p6, p0, Landroidx/work/impl/K$c;->g:Ln4/u;

    .line 26
    .line 27
    iput-object p7, p0, Landroidx/work/impl/K$c;->i:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method static synthetic a(Landroidx/work/impl/K$c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/work/impl/K$c;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Landroidx/work/impl/K;
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/impl/K;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/work/impl/K;-><init>(Landroidx/work/impl/K$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public c(Landroidx/work/WorkerParameters$a;)Landroidx/work/impl/K$c;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/work/impl/K$c;->j:Landroidx/work/WorkerParameters$a;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method public d(Ljava/util/List;)Landroidx/work/impl/K$c;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/K$c;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
