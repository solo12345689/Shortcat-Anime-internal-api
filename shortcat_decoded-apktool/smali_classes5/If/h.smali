.class public abstract LIf/h;
.super LGf/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LIf/g;


# instance fields
.field private final d:LIf/g;


# direct methods
.method public constructor <init>(LZd/i;LIf/g;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, LGf/a;-><init>(LZd/i;ZZ)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LIf/h;->d:LIf/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, LGf/I0;->I0(LGf/I0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LIf/v;->k(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, LGf/I0;->x(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected final U0()LIf/g;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LIf/v;->a(LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LIf/w;->c(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LIf/w;->e(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0}, LIf/v;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LIf/w;->i(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public iterator()LIf/i;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0}, LIf/v;->iterator()LIf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LGf/I0;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, LGf/D0;

    .line 11
    .line 12
    invoke-static {p0}, LGf/I0;->n(LGf/I0;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, LGf/D0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LGf/C0;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, LIf/h;->A(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, LIf/h;->d:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0}, LIf/w;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
