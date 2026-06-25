.class public abstract Lcom/facebook/imagepipeline/producers/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/n;

.field private final b:Lcom/facebook/imagepipeline/producers/e0;

.field private c:J

.field private d:I

.field private e:Ly6/b;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/C;->a:Lcom/facebook/imagepipeline/producers/n;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/imagepipeline/producers/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->a:Lcom/facebook/imagepipeline/producers/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lcom/facebook/imagepipeline/producers/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()Lcom/facebook/imagepipeline/producers/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/producers/C;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public f()Ly6/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->e:Ly6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LK6/b;->v()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/imagepipeline/producers/C;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public j(Ly6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/C;->e:Ly6/b;

    .line 2
    .line 3
    return-void
.end method
