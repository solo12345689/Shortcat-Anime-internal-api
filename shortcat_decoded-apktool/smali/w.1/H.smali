.class public interface abstract Lw/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/i;


# virtual methods
.method public a(Lw/s0;)Lw/A0;
    .locals 0

    .line 2
    new-instance p1, Lw/A0;

    invoke-direct {p1, p0}, Lw/A0;-><init>(Lw/H;)V

    return-object p1
.end method

.method public bridge synthetic a(Lw/s0;)Lw/v0;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lw/H;->a(Lw/s0;)Lw/A0;

    move-result-object p1

    return-object p1
.end method

.method public b(FFF)F
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Lw/H;->e(FFF)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move v3, p1

    .line 7
    move v4, p2

    .line 8
    move v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Lw/H;->d(JFFF)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public abstract c(JFFF)F
.end method

.method public abstract d(JFFF)F
.end method

.method public abstract e(FFF)J
.end method
