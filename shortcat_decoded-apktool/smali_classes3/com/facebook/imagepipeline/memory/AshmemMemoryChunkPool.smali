.class public Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;
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
.method public F(I)LH6/f;
    .locals 1

    .line 1
    new-instance v0, LH6/f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LH6/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic h(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;->F(I)LH6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
