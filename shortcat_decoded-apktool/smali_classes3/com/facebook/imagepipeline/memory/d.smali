.class public Lcom/facebook/imagepipeline/memory/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/memory/d$b;
    }
.end annotation


# instance fields
.field private final a:LC5/h;

.field final b:Lcom/facebook/imagepipeline/memory/d$b;


# direct methods
.method public constructor <init>(LB5/d;LH6/E;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p2, LH6/E;->g:I

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ly5/k;->b(Ljava/lang/Boolean;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/facebook/imagepipeline/memory/d$b;

    .line 19
    .line 20
    invoke-static {}, LH6/z;->h()LH6/z;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p1, p2, v1}, Lcom/facebook/imagepipeline/memory/d$b;-><init>(LB5/d;LH6/E;LH6/F;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/facebook/imagepipeline/memory/d;->b:Lcom/facebook/imagepipeline/memory/d$b;

    .line 28
    .line 29
    new-instance p1, Lcom/facebook/imagepipeline/memory/d$a;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/memory/d$a;-><init>(Lcom/facebook/imagepipeline/memory/d;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/d;->a:LC5/h;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public a(I)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/d;->b:Lcom/facebook/imagepipeline/memory/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/a;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/d;->a:LC5/h;

    .line 10
    .line 11
    invoke-static {p1, v0}, LC5/a;->S(Ljava/lang/Object;LC5/h;)LC5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public b([B)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/d;->b:Lcom/facebook/imagepipeline/memory/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/a;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
