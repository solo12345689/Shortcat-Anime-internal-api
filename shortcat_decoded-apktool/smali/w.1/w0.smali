.class public abstract Lw/w0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lw/q;FF)Lw/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw/w0;->c(Lw/q;FF)Lw/s;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(Lw/y0;J)J
    .locals 8

    .line 1
    invoke-interface {p0}, Lw/y0;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    sub-long v2, p1, v0

    .line 7
    .line 8
    invoke-interface {p0}, Lw/y0;->c()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-long v6, p0

    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    invoke-static/range {v2 .. v7}, Loe/j;->o(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0
.end method

.method private static final c(Lw/q;FF)Lw/s;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lw/w0$a;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lw/w0$a;-><init>(Lw/q;FF)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance p0, Lw/w0$b;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lw/w0$b;-><init>(FF)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public static final d(Lw/v0;JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    mul-long/2addr p1, v0

    .line 5
    invoke-interface/range {p0 .. p5}, Lw/v0;->d(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
