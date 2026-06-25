.class public LZh/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZh/e$c;,
        LZh/e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:LZh/d;

.field private final d:Ljava/util/List;

.field private final e:LZh/a;


# direct methods
.method private constructor <init>(LZh/e$b;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LZh/e$b;->a(LZh/e$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, LZh/e$b;->b(LZh/e$b;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, LVh/h;->l(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LZh/e;->a:Ljava/util/List;

    .line 4
    invoke-static {p1}, LZh/e$b;->c(LZh/e$b;)LZh/d;

    move-result-object v0

    iput-object v0, p0, LZh/e;->c:LZh/d;

    .line 5
    invoke-static {p1}, LZh/e$b;->d(LZh/e$b;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LZh/e;->d:Ljava/util/List;

    .line 6
    invoke-static {p1}, LZh/e$b;->e(LZh/e$b;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LZh/e;->b:Ljava/util/List;

    .line 7
    invoke-static {p1}, LZh/e$b;->f(LZh/e$b;)LZh/a;

    move-result-object p1

    iput-object p1, p0, LZh/e;->e:LZh/a;

    .line 8
    new-instance p1, LVh/m;

    new-instance v2, LVh/p;

    invoke-direct {v2}, LVh/p;-><init>()V

    invoke-direct {p1, v1, v2}, LVh/m;-><init>(Ljava/util/List;LVh/p;)V

    invoke-interface {v0, p1}, LZh/d;->a(LZh/c;)LZh/b;

    return-void
.end method

.method synthetic constructor <init>(LZh/e$b;LZh/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZh/e;-><init>(LZh/e$b;)V

    return-void
.end method

.method public static a()LZh/e$b;
    .locals 1

    .line 1
    new-instance v0, LZh/e$b;

    .line 2
    .line 3
    invoke-direct {v0}, LZh/e$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private b()LVh/h;
    .locals 5

    .line 1
    new-instance v0, LVh/h;

    .line 2
    .line 3
    iget-object v1, p0, LZh/e;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LZh/e;->c:LZh/d;

    .line 6
    .line 7
    iget-object v3, p0, LZh/e;->b:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, LZh/e;->e:LZh/a;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, LVh/h;-><init>(Ljava/util/List;LZh/d;Ljava/util/List;LZh/a;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private d(LYh/s;)LYh/s;
    .locals 2

    .line 1
    iget-object v0, p0, LZh/e;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    throw p1
.end method


# virtual methods
.method public c(Ljava/lang/String;)LYh/s;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, LZh/e;->b()LVh/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LVh/h;->t(Ljava/lang/String;)LYh/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, LZh/e;->d(LYh/s;)LYh/s;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string v0, "input must not be null"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method
