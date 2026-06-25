.class public Lcom/facebook/imagepipeline/memory/BufferMemoryChunkPool;
.super Lcom/facebook/imagepipeline/memory/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(LB5/d;LH6/E;LH6/F;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/f;-><init>(LB5/d;LH6/E;LH6/F;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected F(I)LH6/m;
    .locals 1

    .line 1
    new-instance v0, LH6/m;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LH6/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected bridge synthetic h(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/BufferMemoryChunkPool;->F(I)LH6/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
