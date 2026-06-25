.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final _context:LZd/i;

.field private transient intercepted:LZd/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZd/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZd/e;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, LZd/e;->getContext()LZd/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;LZd/i;)V

    return-void
.end method

.method public constructor <init>(LZd/e;LZd/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(LZd/e;)V

    .line 2
    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:LZd/i;

    return-void
.end method


# virtual methods
.method public getContext()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:LZd/i;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final intercepted()LZd/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd/e;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:LZd/e;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()LZd/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, LZd/f;->S:LZd/f$b;

    .line 10
    .line 11
    invoke-interface {v0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LZd/f;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p0}, LZd/f;->u1(LZd/e;)LZd/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    move-object v0, p0

    .line 26
    :cond_1
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:LZd/e;

    .line 27
    .line 28
    :cond_2
    return-object v0
.end method

.method protected releaseIntercepted()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:LZd/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()LZd/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LZd/f;->S:LZd/f$b;

    .line 12
    .line 13
    invoke-interface {v1, v2}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, LZd/f;

    .line 21
    .line 22
    invoke-interface {v1, v0}, LZd/f;->k0(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->a:Lkotlin/coroutines/jvm/internal/c;

    .line 26
    .line 27
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:LZd/e;

    .line 28
    .line 29
    return-void
.end method
