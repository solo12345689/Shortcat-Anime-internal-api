.class public interface abstract Lt2/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public a(Lq2/I;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    iget-object v0, p1, Lq2/I;->k:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, v0}, Lt2/h;->c([B)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object p1, p1, Lq2/I;->m:Landroid/net/Uri;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, p1}, Lt2/h;->b(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public abstract b(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;
.end method

.method public abstract c([B)Lcom/google/common/util/concurrent/p;
.end method
