.class public interface abstract Lr3/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr3/r$b;,
        Lr3/r$a;
    }
.end annotation


# virtual methods
.method public abstract a([BIILr3/r$b;Lt2/n;)V
.end method

.method public b([BII)Lr3/j;
    .locals 7

    .line 1
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lr3/r$b;->a()Lr3/r$b;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v6, Lr3/q;

    .line 13
    .line 14
    invoke-direct {v6, v0}, Lr3/q;-><init>(LP9/u$a;)V

    .line 15
    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move v3, p2

    .line 20
    move v4, p3

    .line 21
    invoke-interface/range {v1 .. v6}, Lr3/r;->a([BIILr3/r$b;Lt2/n;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lr3/f;

    .line 25
    .line 26
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p1, p2}, Lr3/f;-><init>(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public abstract c()I
.end method

.method public reset()V
    .locals 0

    .line 1
    return-void
.end method
