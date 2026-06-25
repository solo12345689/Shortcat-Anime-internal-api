.class final Ln9/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln9/f;
.implements Ln9/e;
.implements Ln9/c;
.implements Ln9/C;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ln9/a;

.field private final c:Ln9/G;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ln9/a;Ln9/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln9/r;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Ln9/r;->b:Ln9/a;

    .line 7
    .line 8
    iput-object p3, p0, Ln9/r;->c:Ln9/G;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/r;->c:Ln9/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/G;->v()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ln9/i;)V
    .locals 1

    .line 1
    new-instance v0, Ln9/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln9/q;-><init>(Ln9/r;Ln9/i;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ln9/r;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method final synthetic c()Ln9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/r;->b:Ln9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method final synthetic d()Ln9/G;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/r;->c:Ln9/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/r;->c:Ln9/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln9/G;->t(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/r;->c:Ln9/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln9/G;->r(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
