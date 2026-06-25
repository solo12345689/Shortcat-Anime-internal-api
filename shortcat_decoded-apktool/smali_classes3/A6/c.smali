.class public LA6/c;
.super LA6/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LA6/a;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static G(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)LI5/c;
    .locals 1

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "CloseableProducerToDataSourceAdapter#create"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, LA6/c;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, LA6/c;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, LL6/b;->d()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-static {}, LL6/b;->b()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0
.end method


# virtual methods
.method protected bridge synthetic E(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LA6/c;->I(LC5/a;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected F(LC5/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public H()LC5/a;
    .locals 1

    .line 1
    invoke-super {p0}, LI5/a;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LC5/a;

    .line 6
    .line 7
    invoke-static {v0}, LC5/a;->j(LC5/a;)LC5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method protected I(LC5/a;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->j(LC5/a;)LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1, p2, p3}, LA6/a;->E(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA6/c;->H()LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA6/c;->F(LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
