.class final Lcom/google/common/util/concurrent/c$a;
.super Lcom/google/common/util/concurrent/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/common/util/concurrent/c;-><init>(Lcom/google/common/util/concurrent/p;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/common/util/concurrent/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/google/common/util/concurrent/c$a;->M(Lcom/google/common/util/concurrent/d;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method bridge synthetic L(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/c$a;->N(Lcom/google/common/util/concurrent/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method M(Lcom/google/common/util/concurrent/d;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Lcom/google/common/util/concurrent/d;->apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    .line 6
    .line 7
    invoke-static {p2, v0, p1}, LO9/n;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method N(Lcom/google/common/util/concurrent/p;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/a;->H(Lcom/google/common/util/concurrent/p;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method
