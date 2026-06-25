.class public LZh/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private d:Ljava/util/Set;

.field private e:LZh/d;

.field private f:LZh/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZh/e$b;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LZh/e$b;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LZh/e$b;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {}, LVh/h;->s()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, LZh/e$b;->d:Ljava/util/Set;

    .line 30
    .line 31
    sget-object v0, LZh/a;->a:LZh/a;

    .line 32
    .line 33
    iput-object v0, p0, LZh/e$b;->f:LZh/a;

    .line 34
    .line 35
    return-void
.end method

.method static synthetic a(LZh/e$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LZh/e$b;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LZh/e$b;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, LZh/e$b;->d:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LZh/e$b;)LZh/d;
    .locals 0

    .line 1
    invoke-direct {p0}, LZh/e$b;->j()LZh/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(LZh/e$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LZh/e$b;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LZh/e$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LZh/e$b;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(LZh/e$b;)LZh/a;
    .locals 0

    .line 1
    iget-object p0, p0, LZh/e$b;->f:LZh/a;

    .line 2
    .line 3
    return-object p0
.end method

.method private j()LZh/d;
    .locals 1

    .line 1
    iget-object v0, p0, LZh/e$b;->e:LZh/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, LZh/e$b$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LZh/e$b$a;-><init>(LZh/e$b;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public g()LZh/e;
    .locals 2

    .line 1
    new-instance v0, LZh/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LZh/e;-><init>(LZh/e$b;LZh/e$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public h(Lbi/a;)LZh/e$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LZh/e$b;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string v0, "delimiterProcessor must not be null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public i(Ljava/lang/Iterable;)LZh/e$b;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LSh/a;

    .line 18
    .line 19
    instance-of v1, v0, LZh/e$c;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, LZh/e$c;

    .line 24
    .line 25
    invoke-interface {v0, p0}, LZh/e$c;->a(LZh/e$b;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-object p0

    .line 30
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 31
    .line 32
    const-string v0, "extensions must not be null"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
