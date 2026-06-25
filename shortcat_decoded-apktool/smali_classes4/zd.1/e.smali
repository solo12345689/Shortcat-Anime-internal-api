.class public final Lzd/e;
.super Lzd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/ref/WeakReference;

.field private final c:Lvd/b$a;

.field private final d:LGf/O;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lvd/b$a;LGf/O;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "procedureScope"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lzd/j;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lzd/e;->a:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p2, p0, Lzd/e;->b:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    iput-object p3, p0, Lzd/e;->c:Lvd/b$a;

    .line 24
    .line 25
    iput-object p4, p0, Lzd/e;->d:LGf/O;

    .line 26
    .line 27
    const-string p1, "timer-recreate-react-context"

    .line 28
    .line 29
    iput-object p1, p0, Lzd/e;->e:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic c(Lzd/e;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/e;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p2, p0, Lzd/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p2}, Lzd/g;->a(Landroid/content/Context;)Lcom/facebook/react/ReactHost;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lzd/e;->c:Lvd/b$a;

    .line 10
    .line 11
    new-instance p2, Ljava/lang/Exception;

    .line 12
    .line 13
    const-string v0, "Could not reload application. Ensure you have passed the correct instance of ReactApplication into UpdatesController.initialize()."

    .line 14
    .line 15
    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2}, Lvd/b$a;->onFailure(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, LTd/L;->a:LTd/L;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v0, LCd/e$m;

    .line 25
    .line 26
    invoke-direct {v0}, LCd/e$m;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Lzd/j$b;->a(LCd/e;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lzd/e;->c:Lvd/b$a;

    .line 33
    .line 34
    invoke-interface {v0}, Lvd/b$a;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lzd/e;->d:LGf/O;

    .line 38
    .line 39
    new-instance v4, Lzd/e$a;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v4, p2, p0, v0}, Lzd/e$a;-><init>(Lcom/facebook/react/ReactHost;Lzd/e;LZd/e;)V

    .line 43
    .line 44
    .line 45
    const/4 v5, 0x3

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Lzd/j$b;->b()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Lzd/j$a;->c()V

    .line 56
    .line 57
    .line 58
    sget-object p1, LTd/L;->a:LTd/L;

    .line 59
    .line 60
    return-object p1
.end method
