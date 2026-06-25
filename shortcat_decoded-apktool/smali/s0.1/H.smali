.class public abstract Ls0/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ls0/r0$a;J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x10

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-gez p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-wide/16 v2, -0x40

    .line 12
    .line 13
    and-long p0, p1, v2

    .line 14
    .line 15
    const-wide/16 v2, 0x1

    .line 16
    .line 17
    add-long/2addr v0, v2

    .line 18
    or-long p1, p0, v0

    .line 19
    .line 20
    :goto_0
    invoke-static {p1, p2}, LTd/F;->b(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-static {p0, p1}, Ls0/r0;->n(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public static final b(J)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    invoke-static {v0, v1}, LTd/F;->b(J)J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    const-wide/16 v4, 0x10

    .line 9
    .line 10
    invoke-static {v2, v3, v4, v5}, Lt/C;->a(JJ)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    return-wide p0

    .line 17
    :cond_0
    const-wide/16 v2, -0x40

    .line 18
    .line 19
    invoke-static {v2, v3}, LTd/F;->b(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    and-long/2addr p0, v2

    .line 24
    invoke-static {p0, p1}, LTd/F;->b(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    invoke-static {v0, v1}, LTd/F;->b(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    sub-long/2addr v0, v2

    .line 35
    invoke-static {v0, v1}, LTd/F;->b(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    or-long/2addr p0, v0

    .line 40
    invoke-static {p0, p1}, LTd/F;->b(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    return-wide p0
.end method
