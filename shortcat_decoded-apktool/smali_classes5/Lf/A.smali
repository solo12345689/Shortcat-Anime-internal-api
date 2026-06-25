.class public LLf/A;
.super LGf/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final d:LZd/e;


# direct methods
.method public constructor <init>(LZd/i;LZd/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, LGf/a;-><init>(LZd/i;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, LLf/A;->d:LZd/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected Q0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LLf/A;->d:LZd/e;

    .line 2
    .line 3
    invoke-static {p1, v0}, LGf/E;->a(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public U0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    .line 1
    iget-object v0, p0, LLf/A;->d:LZd/e;

    .line 2
    .line 3
    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method protected final n0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected t(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LLf/A;->d:LZd/e;

    .line 2
    .line 3
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LLf/A;->d:LZd/e;

    .line 8
    .line 9
    invoke-static {p1, v1}, LGf/E;->a(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0, p1}, LLf/j;->b(LZd/e;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
