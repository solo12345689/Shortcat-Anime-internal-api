.class Lcom/facebook/imagepipeline/producers/b0$b;
.super Lcom/facebook/imagepipeline/producers/t;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/imagepipeline/producers/b0;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/b0$a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b0$b;->c:Lcom/facebook/imagepipeline/producers/b0;

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/b0$a;Lcom/facebook/imagepipeline/producers/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/b0$b;-><init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/b0$a;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/b0$b;->q(LC5/a;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected q(LC5/a;I)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->c(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
