.class Lci/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lci/l;


# instance fields
.field private final a:Lci/k;

.field private final b:Lci/c;


# direct methods
.method constructor <init>(Lci/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci/a;->b:Lci/c;

    .line 5
    .line 6
    new-instance p1, Lci/k;

    .line 7
    .line 8
    invoke-direct {p1}, Lci/k;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lci/a;->a:Lci/k;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(Lci/q;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lci/j;->a(Lci/q;Ljava/lang/Object;)Lci/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lci/a;->a:Lci/k;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lci/k;->a(Lci/j;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lci/a;->b:Lci/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lci/c;->d()Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lci/a;->a:Lci/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lci/k;->b()Lci/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lci/a;->b:Lci/c;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lci/c;->g(Lci/j;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "No pending post available"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
