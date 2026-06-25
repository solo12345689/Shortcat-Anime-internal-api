.class Lcom/facebook/imagepipeline/producers/D$b;
.super Lcom/facebook/imagepipeline/producers/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/D;->i(Lcom/facebook/imagepipeline/producers/D$c;Lcom/facebook/imagepipeline/producers/X$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Future;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/X$a;

.field final synthetic c:Lcom/facebook/imagepipeline/producers/D;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/D;Ljava/util/concurrent/Future;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/D$b;->c:Lcom/facebook/imagepipeline/producers/D;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/D$b;->a:Ljava/util/concurrent/Future;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/D$b;->b:Lcom/facebook/imagepipeline/producers/X$a;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/D$b;->a:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/D$b;->b:Lcom/facebook/imagepipeline/producers/X$a;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/X$a;->b()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
