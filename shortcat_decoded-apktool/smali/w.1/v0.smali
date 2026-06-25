.class public interface abstract Lw/v0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lw/q;Lw/q;Lw/q;)J
.end method

.method public abstract d(JLw/q;Lw/q;Lw/q;)Lw/q;
.end method

.method public abstract e(JLw/q;Lw/q;Lw/q;)Lw/q;
.end method

.method public g(Lw/q;Lw/q;Lw/q;)Lw/q;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Lw/v0;->b(Lw/q;Lw/q;Lw/q;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Lw/v0;->e(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
