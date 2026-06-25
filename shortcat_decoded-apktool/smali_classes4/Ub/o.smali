.class public final LUb/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LUb/u;


# instance fields
.field private final a:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    const-string v0, "bridgePromise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LUb/o;->a:Lcom/facebook/react/bridge/Promise;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->i(LUb/u;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-static {p0}, LUb/u$a;->b(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->e(LUb/u;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(D)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LUb/u$a;->c(LUb/u;D)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->d(LUb/u;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f(Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->h(LUb/u;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(Ljava/util/Collection;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->g(LUb/u;Ljava/util/Collection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public h(Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->a(LUb/u;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LUb/o;->a:Lcom/facebook/react/bridge/Promise;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public resolve(Ljava/lang/Object;)V
    .locals 7

    .line 2
    iget-object v0, p0, LUb/o;->a:Lcom/facebook/react/bridge/Promise;

    .line 3
    sget-object v1, Lpc/K;->a:Lpc/K;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lpc/K;->b(Lpc/K;Ljava/lang/Object;Lpc/K$a;ZILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public resolve(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->f(LUb/u;Ljava/lang/String;)V

    return-void
.end method
