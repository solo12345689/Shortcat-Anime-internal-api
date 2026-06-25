.class public final LKd/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lle/d;


# instance fields
.field private final a:LUb/d;

.field private final b:Ljava/lang/ref/WeakReference;

.field private c:Z

.field private d:Lq2/P$d;


# direct methods
.method public constructor <init>(Lexpo/modules/video/player/VideoPlayer;LUb/d;Z)V
    .locals 1

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LKd/m;->a:LUb/d;

    .line 2
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LKd/m;->b:Ljava/lang/ref/WeakReference;

    .line 3
    iput-boolean p3, p0, LKd/m;->c:Z

    if-eqz p3, :cond_0

    .line 4
    invoke-direct {p0}, LKd/m;->i()V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/video/player/VideoPlayer;LUb/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LKd/m;-><init>(Lexpo/modules/video/player/VideoPlayer;LUb/d;Z)V

    return-void
.end method

.method public static final synthetic c(LKd/m;)Lq2/P$d;
    .locals 0

    .line 1
    invoke-direct {p0}, LKd/m;->g()Lq2/P$d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(LKd/m;)Lq2/P$d;
    .locals 0

    .line 1
    iget-object p0, p0, LKd/m;->d:Lq2/P$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LKd/m;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, LKd/m;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LKd/m;Lq2/P$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LKd/m;->d:Lq2/P$d;

    .line 2
    .line 3
    return-void
.end method

.method private final g()Lq2/P$d;
    .locals 1

    .line 1
    new-instance v0, LKd/m$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LKd/m$a;-><init>(LKd/m;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final h()V
    .locals 7

    .line 1
    iget-object v0, p0, LKd/m;->a:LUb/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v4, LKd/m$b;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, v0}, LKd/m$b;-><init>(LKd/m;LZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final i()V
    .locals 7

    .line 1
    iget-object v0, p0, LKd/m;->a:LUb/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v4, LKd/m$c;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, v0}, LKd/m$c;-><init>(LKd/m;LZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LKd/m;->j(Ljava/lang/Object;Lpe/m;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-virtual {p0, p1, p2, p3}, LKd/m;->l(Ljava/lang/Object;Lpe/m;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public j(Ljava/lang/Object;Lpe/m;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-string p1, "property"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LKd/m;->c:Z

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final k(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, LKd/m;->i()V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0}, LKd/m;->h()V

    .line 8
    .line 9
    .line 10
    :goto_0
    iput-boolean p1, p0, LKd/m;->c:Z

    .line 11
    .line 12
    return-void
.end method

.method public l(Ljava/lang/Object;Lpe/m;Z)V
    .locals 0

    .line 1
    const-string p1, "property"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, LKd/m;->k(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
