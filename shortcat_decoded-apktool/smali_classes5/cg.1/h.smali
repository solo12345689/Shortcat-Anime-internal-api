.class public Lcg/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/p;


# instance fields
.field public final a:Lcom/google/common/util/concurrent/p;


# direct methods
.method public constructor <init>(Lcom/google/common/util/concurrent/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcg/b;Ljava/util/concurrent/Executor;)Lcg/h;
    .locals 1

    .line 1
    new-instance v0, Lcg/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcg/h$a;-><init>(Lcg/h;Lcg/b;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public b(Lcom/google/common/util/concurrent/d;Ljava/util/concurrent/Executor;)Lcg/h;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/common/util/concurrent/j;->f(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/d;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lcg/h;

    .line 6
    .line 7
    invoke-direct {p2, p1}, Lcg/h;-><init>(Lcom/google/common/util/concurrent/p;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public cancel(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isDone()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/h;->a:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
