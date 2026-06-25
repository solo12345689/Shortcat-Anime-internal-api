.class public final Lcom/facebook/imagepipeline/producers/o0$c;
.super Lcom/facebook/imagepipeline/producers/m0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/o0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic f:Lcom/facebook/imagepipeline/producers/n;

.field final synthetic g:Lcom/facebook/imagepipeline/producers/g0;

.field final synthetic h:Lcom/facebook/imagepipeline/producers/e0;

.field final synthetic i:Lcom/facebook/imagepipeline/producers/o0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->f:Lcom/facebook/imagepipeline/producers/n;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/o0$c;->g:Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/o0$c;->h:Lcom/facebook/imagepipeline/producers/e0;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/o0$c;->i:Lcom/facebook/imagepipeline/producers/o0;

    .line 8
    .line 9
    const-string p4, "BackgroundThreadHandoffProducer"

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/m0;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected c()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected f(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->g:Lcom/facebook/imagepipeline/producers/g0;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$c;->h:Lcom/facebook/imagepipeline/producers/e0;

    .line 4
    .line 5
    const-string v1, "BackgroundThreadHandoffProducer"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->i:Lcom/facebook/imagepipeline/producers/o0;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/o0;->c()Lcom/facebook/imagepipeline/producers/d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$c;->f:Lcom/facebook/imagepipeline/producers/n;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->h:Lcom/facebook/imagepipeline/producers/e0;

    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
