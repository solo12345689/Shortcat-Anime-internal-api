.class final LPf/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LGf/n;
.implements LGf/h1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPf/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final a:LGf/p;

.field public final b:Ljava/lang/Object;

.field final synthetic c:LPf/f;


# direct methods
.method public constructor <init>(LPf/f;LGf/p;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPf/f$a;->c:LPf/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LPf/f$a;->a:LGf/p;

    .line 7
    .line 8
    iput-object p3, p0, LPf/f$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(LPf/f;LPf/f$a;Ljava/lang/Throwable;LTd/L;LZd/i;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LPf/f$a;->i(LPf/f;LPf/f$a;Ljava/lang/Throwable;LTd/L;LZd/i;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LPf/f;LPf/f$a;Ljava/lang/Throwable;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LPf/f$a;->f(LPf/f;LPf/f$a;Ljava/lang/Throwable;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(LPf/f;LPf/f$a;Ljava/lang/Throwable;)LTd/L;
    .locals 0

    .line 1
    iget-object p1, p1, LPf/f$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LPf/f;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final i(LPf/f;LPf/f$a;Ljava/lang/Throwable;LTd/L;LZd/i;)LTd/L;
    .locals 0

    .line 1
    invoke-static {}, LPf/f;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p3, p1, LPf/f$a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, LPf/f$a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LPf/f;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, LTd/L;->a:LTd/L;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public B(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/p;->B(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic I(Ljava/lang/Object;Lie/o;)V
    .locals 0

    .line 1
    check-cast p1, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LPf/f$a;->e(LTd/L;Lie/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public L(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/p;->L(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic N(LGf/K;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LPf/f$a;->g(LGf/K;LTd/L;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public U(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/p;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic V(Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LPf/f$a;->h(LTd/L;Ljava/lang/Object;Lie/o;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LGf/p;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c(LLf/B;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LGf/p;->c(LLf/B;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LTd/L;Lie/o;)V
    .locals 2

    .line 1
    invoke-static {}, LPf/f;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, LPf/f$a;->c:LPf/f;

    .line 6
    .line 7
    iget-object v1, p0, LPf/f$a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, LPf/f$a;->a:LGf/p;

    .line 13
    .line 14
    iget-object v0, p0, LPf/f$a;->c:LPf/f;

    .line 15
    .line 16
    new-instance v1, LPf/e;

    .line 17
    .line 18
    invoke-direct {v1, v0, p0}, LPf/e;-><init>(LPf/f;LPf/f$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v1}, LGf/p;->P(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public g(LGf/K;LTd/L;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LGf/p;->N(LGf/K;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getContext()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LGf/p;->getContext()LZd/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h(LTd/L;Ljava/lang/Object;Lie/o;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, LPf/f$a;->c:LPf/f;

    .line 2
    .line 3
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 4
    .line 5
    new-instance v1, LPf/d;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, LPf/d;-><init>(LPf/f;LPf/f$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, LGf/p;->V(Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, LPf/f;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, LPf/f$a;->c:LPf/f;

    .line 21
    .line 22
    iget-object v0, p0, LPf/f$a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LGf/p;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LGf/p;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/p;->p(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/f$a;->a:LGf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/p;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
