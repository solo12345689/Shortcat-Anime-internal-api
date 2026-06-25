.class public interface abstract Lw/y0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/z0;


# virtual methods
.method public b(Lw/q;Lw/q;Lw/q;)J
    .locals 2

    .line 1
    invoke-interface {p0}, Lw/y0;->f()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-interface {p0}, Lw/y0;->c()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    add-int/2addr p1, p2

    .line 10
    int-to-long p1, p1

    .line 11
    const-wide/32 v0, 0xf4240

    .line 12
    .line 13
    .line 14
    mul-long/2addr p1, v0

    .line 15
    return-wide p1
.end method

.method public abstract c()I
.end method

.method public abstract f()I
.end method
