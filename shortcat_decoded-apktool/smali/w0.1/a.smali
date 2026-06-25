.class public abstract Lw0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ls0/b1;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;
    .locals 7

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move-wide v4, p3

    .line 7
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Ls0/b1;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p5}, Landroidx/compose/ui/graphics/painter/BitmapPainter;->n(I)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static synthetic b(Ls0/b1;JJIILjava/lang/Object;)Landroidx/compose/ui/graphics/painter/BitmapPainter;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Li1/n$a;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    :cond_0
    move-wide v1, p1

    .line 12
    and-int/lit8 p1, p6, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ls0/b1;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-interface {p0}, Ls0/b1;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    int-to-long p3, p1

    .line 25
    const/16 p1, 0x20

    .line 26
    .line 27
    shl-long/2addr p3, p1

    .line 28
    int-to-long p1, p2

    .line 29
    const-wide v3, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr p1, v3

    .line 35
    or-long/2addr p1, p3

    .line 36
    invoke-static {p1, p2}, Li1/r;->c(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p3

    .line 40
    :cond_1
    move-wide v3, p3

    .line 41
    and-int/lit8 p1, p6, 0x8

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    sget-object p1, Ls0/X0;->a:Ls0/X0$a;

    .line 46
    .line 47
    invoke-virtual {p1}, Ls0/X0$a;->a()I

    .line 48
    .line 49
    .line 50
    move-result p5

    .line 51
    :cond_2
    move-object v0, p0

    .line 52
    move v5, p5

    .line 53
    invoke-static/range {v0 .. v5}, Lw0/a;->a(Ls0/b1;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
