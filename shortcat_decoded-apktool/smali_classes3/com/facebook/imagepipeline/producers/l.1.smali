.class public Lcom/facebook/imagepipeline/producers/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/l$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Lcom/facebook/imagepipeline/producers/d0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/l;->a:Lcom/facebook/imagepipeline/producers/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/l;->b:Lcom/facebook/imagepipeline/producers/d0;

    .line 7
    .line 8
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/l;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/l;->b:Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/facebook/imagepipeline/producers/l$a;-><init>(Lcom/facebook/imagepipeline/producers/l;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/m;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/l;->a:Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
