.class public Lh8/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/github/penfeizhou/animation/io/e;


# instance fields
.field protected a:Ljava/nio/IntBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2800

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lh8/a;->c(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a()Ljava/nio/IntBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/IntBuffer;->array()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-le p1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-static {p1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/nio/IntBuffer;->limit(I)Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lh8/a;->a:Ljava/nio/IntBuffer;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method
