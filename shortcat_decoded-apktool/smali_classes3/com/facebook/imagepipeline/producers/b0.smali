.class public Lcom/facebook/imagepipeline/producers/b0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/b0$b;,
        Lcom/facebook/imagepipeline/producers/b0$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Lw6/d;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lw6/d;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b0;->a:Lcom/facebook/imagepipeline/producers/d0;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/b0;->b:Lw6/d;

    .line 13
    .line 14
    invoke-static {p3}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b0;->c:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/b0;)Lw6/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/b0;->b:Lw6/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/b0;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/b0;->c:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LK6/b;->l()LK6/d;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v4}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/facebook/imagepipeline/producers/b0$a;

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move-object v2, p1

    .line 20
    move-object v5, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/b0$a;-><init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;LK6/d;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lcom/facebook/imagepipeline/producers/b0$b;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2}, Lcom/facebook/imagepipeline/producers/b0$b;-><init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/b0$a;Lcom/facebook/imagepipeline/producers/c0;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, v1, Lcom/facebook/imagepipeline/producers/b0;->a:Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    invoke-interface {p2, p1, v5}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
